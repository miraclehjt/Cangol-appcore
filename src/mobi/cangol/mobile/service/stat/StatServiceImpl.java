package mobi.cangol.mobile.service.stat;

import java.util.concurrent.ThreadPoolExecutor;

import mobi.cangol.mobile.CoreApplication;
import mobi.cangol.mobile.http.AsyncHttpClient;
import mobi.cangol.mobile.http.AsyncHttpResponseHandler;
import mobi.cangol.mobile.http.RequestParams;
import mobi.cangol.mobile.service.PoolManager;
import mobi.cangol.mobile.service.Service;
import mobi.cangol.mobile.service.conf.Config;
import mobi.cangol.mobile.service.conf.Config;
import mobi.cangol.mobile.service.conf.ServiceConfig;
import android.content.Context;
import android.util.Log;
@Service("stat")
public class StatServiceImpl implements StatService {
	private final static String TAG="StatService";
	private Context mContext = null;
	private AsyncHttpClient asyncHttpClient;
	private Config mConfigService;
	private ServiceConfig mServiceConfig=null;
	@Override
	public void init() {
		CoreApplication app=(CoreApplication) mContext.getApplicationContext();
		mConfigService=(Config) app.getAppService("config");
		mServiceConfig=mConfigService.getServiceConfig("stat");
		asyncHttpClient=new AsyncHttpClient();
		asyncHttpClient.setThreadool((ThreadPoolExecutor)PoolManager
				.buildPool(mServiceConfig.getString(Config.STATSERVICE_THREADPOOL_NAME),
						mServiceConfig.getInt(Config.STATSERVICE_THREAD_MAX))
				.getExecutorService());
	}

	@Override
	public void setContext(Context context) {
		mContext=context;
	}

	@Override
	public String getName() {
		return "stat";
	}

	@Override
	public void destory() {
		asyncHttpClient.cancelRequests(mContext, true);
	}

	@Override
	public void sendStat(StatModel statModel) {
		RequestParams params=new RequestParams(statModel.getParams());
		asyncHttpClient.get(mContext,statModel.getUrl(), params,  new AsyncHttpResponseHandler(){

			@Override
			public void onStart() {
				super.onStart();
				Log.d(TAG, "Start");
			}
			
			@Override
			public void onSuccess(String content) {
				super.onSuccess(content);
				Log.d(TAG, "Success :"+content);
			}

			@Override
			public void onFailure(Throwable error, String content) {
				super.onFailure(error, content);
				Log.d(TAG, "Failure :"+content);
			}
			
		});
	}

}
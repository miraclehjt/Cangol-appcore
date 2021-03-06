/**
 * Copyright (c) 2013 Cangol
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License")
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mobi.cangol.mobile.service.upgrade;

/**
 * 更新监听接口
 *
 * @author cangol
 */
public interface OnUpgradeListener {
    /**
     * 更新
     *
     * @param force 是否强制更新
     */
    void upgrade(boolean force);

    /**
     * @param speed    更新速度
     * @param progress 更新进度
     */
    void progress(int speed, int progress);

    /**
     * @param filePath 更新文件地址
     */
    void onFinish(String filePath);

    /**
     * @param error 更新失败原因
     */
    void onFailure(String error);
}

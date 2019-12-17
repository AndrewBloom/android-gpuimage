/*
 * Copyright (C) 2018 CyberAgent, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package jp.co.cyberagent.android.gpuimage.util;

public class TextureRotationUtil {

    public static final float TEXTURE_NO_ROTATION[][] = {
            {0.0f, 0.0f},
            {1.0f, 0.0f},
            {1.0f, 1.0f},
            {0.0f, 1.0f},
    };

    private TextureRotationUtil() {
    }

    public static float[] getRotation(final Rotation rotation, final boolean flipHorizontal,
                                      final boolean flipVertical) {
        float[] rotatedTex = new float[8];

        for (int i=0; i<4; i++) {
            int idx = (i+rotation.getValue())&0x3;
            rotatedTex[i*2] = TEXTURE_NO_ROTATION[idx][0];
            rotatedTex[i*2+1] = TEXTURE_NO_ROTATION[idx][1];
        }

        if (flipHorizontal) {
            for (int i=0; i<8; i+=2) {
                rotatedTex[i] = flip(rotatedTex[i]);
            }
        }
        if (flipVertical) {
            for (int i=1; i<8; i+=2) {
                rotatedTex[i] = flip(rotatedTex[i]);
            }
        }
        return rotatedTex;
    }


    private static float flip(final float i) {
        if (i == 0.0f) {
            return 1.0f;
        }
        return 0.0f;
    }
}

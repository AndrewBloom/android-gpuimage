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

public enum Rotation {
    ZERO(0),
    CCW_90(1),
    CCW_180(2),
    CCW_270(3),
    CW_90(-1),
    CW_180(-2),
    CW_270(-3);

    private final int value;

    Rotation(final int newValue) {
        value = newValue;
    }

    public int getValue() { return value; }
}

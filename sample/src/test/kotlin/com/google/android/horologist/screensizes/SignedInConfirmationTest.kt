/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("INVISIBLE_MEMBER", "INVISIBLE_REFERENCE")

package com.google.android.horologist.screensizes

import android.R
import com.google.android.horologist.auth.composables.dialogs.SignedInConfirmationDialogContent
import com.google.android.horologist.images.base.paintable.DrawableResPaintable
import com.google.android.horologist.screenshots.rng.WearDevice
import com.google.android.horologist.screenshots.rng.WearDeviceScreenshotTest
import org.junit.Test

class SignedInConfirmationTest(device: WearDevice) : WearDeviceScreenshotTest(device = device) {
    @Test
    fun initial() = runTest {
        SignedInConfirmationDialogContent(
            name = "Maggie",
            email = "maggie@example.com",
            avatar = DrawableResPaintable(R.mipmap.sym_def_app_icon),
        )
    }
}
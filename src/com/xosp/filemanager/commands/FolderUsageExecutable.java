/*
 * Copyright (C) 2012 The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xosp.filemanager.commands;

import com.xosp.filemanager.model.FolderUsage;

/**
 * An interface that represents an executable for retrieve a folder usage
 */
public interface FolderUsageExecutable extends AsyncResultExecutable {

    /**
     * Method that returns the folder usage.
     *
     * @return FolderUsage The folder usage
     */
    FolderUsage getFolderUsage();
}

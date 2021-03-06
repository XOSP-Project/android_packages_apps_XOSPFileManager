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

import java.util.List;


/**
 * An interface that represents an executable for quickly get the name
 * of directories that matches a string.
 */
public interface QuickFolderSearchExecutable extends SyncResultExecutable {

    /**
     * {@inheritDoc}
     */
    @Override
    List<String> getResult();
}

/*
 * dev.kobalt.waybackmachineproxy
 * Copyright (C) 2022 Tom.K
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package dev.kobalt.waybackmachineproxy.web.resource

import java.io.InputStream

object ResourceRepository {

    private const val defaultResourcePath = "dev/kobalt/waybackmachineproxy/web/"

    fun getInputStream(path: String): InputStream? =
        this::class.java.classLoader.getResourceAsStream(defaultResourcePath + path)

    fun getBytes(path: String): ByteArray? =
        getInputStream(path)?.use { it.readBytes() }

    fun getText(path: String): String? =
        getBytes(path)?.decodeToString()

}
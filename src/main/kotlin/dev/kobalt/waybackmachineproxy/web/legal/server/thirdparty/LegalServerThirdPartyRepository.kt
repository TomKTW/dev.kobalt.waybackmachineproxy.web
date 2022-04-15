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

package dev.kobalt.waybackmachineproxy.web.legal.server.thirdparty

import dev.kobalt.waybackmachineproxy.web.resource.ResourceRepository

object LegalServerThirdPartyRepository {

    val pageTitle = "Third-party components"
    val pageSubtitle = "This server uses components from third party."
    val pageRoute = "thirdparty/"
    val pageContent get() = ResourceRepository.getText("serverThirdParty.md").orEmpty()

}
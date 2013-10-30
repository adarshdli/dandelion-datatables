/*
 * [The "BSD licence"]
 * Copyright (c) 2013 Dandelion
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * 3. Neither the name of Dandelion nor the names of its contributors
 * may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 * IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 * NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 * THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package com.github.dandelion.datatables.integration.theme;

import static org.fest.assertions.Assertions.assertThat;

import java.io.IOException;

import org.fluentlenium.core.domain.FluentWebElement;
import org.junit.Ignore;
import org.junit.runner.RunWith;

import com.github.dandelion.core.utils.StringUtils;
import com.github.dandelion.datatables.integration.ThymeleafContextRunner;
import com.github.dandelion.datatables.testing.theme.Bootstrap2BaseIT;
import com.github.dandelion.datatables.testing.utils.Constants;
import com.github.dandelion.datatables.testing.utils.ThymeleafTest;

/**
 * Test the Bootstrap2 theme feature.
 *
 * @author Thibault Duchateau
 */
@RunWith(ThymeleafContextRunner.class)
@ThymeleafTest
@Ignore
public class Bootstrap2IT extends Bootstrap2BaseIT {

	@Ignore
	public void should_generate_bottom_right_link() throws IOException, Exception {
		goToPage("themes/bootstrap2_bottom_right_link");
		assertThat(find("#" + Constants.TABLE_ID + "_wrapper").find("div", 3).getAttribute("class")).isEqualTo("dandelion_dataTables_export");
		assertThat(StringUtils.trimAllWhitespace(find("#" + Constants.TABLE_ID + "_wrapper").find("div", 3).getAttribute("style"))).isEqualTo("float:right;");
	}
	
	@Ignore
	public void should_generate_bottom_middle_link() throws IOException, Exception {
		goToPage("themes/bootstrap2_bottom_middle_link");
		
		assertThat(find("#" + Constants.TABLE_ID + "_wrapper").find("div", 3).getAttribute("class")).isEqualTo("dandelion_dataTables_export");
		assertThat(StringUtils.trimAllWhitespace(find("#" + Constants.TABLE_ID + "_wrapper").find("div", 3).getAttribute("style"))).isEqualTo("float:left;margin-left:10px;");
	}
	
	@Ignore
	public void should_generate_bottom_left_link() throws IOException, Exception {
		goToPage("themes/bootstrap2_bottom_left_link");
		
		FluentWebElement divExport = find("#" + Constants.TABLE_ID + "_wrapper").findFirst("div.span6").findFirst("div");
		
		
		assertThat(divExport.getAttribute("class")).isEqualTo("dandelion_dataTables_export");
		assertThat(StringUtils.trimAllWhitespace(divExport.getAttribute("style"))).isEqualTo("float:left;margin-right:10px;");
	}
	
	@Ignore
	public void should_generate_top_right_link() throws IOException, Exception {
		goToPage("themes/bootstrap2_top_right_link");
		
		FluentWebElement divExport = find("#" + Constants.TABLE_ID + "_wrapper").find("div.span6", 1).findFirst("div");
		
		assertThat(divExport.getAttribute("class")).isEqualTo("dandelion_dataTables_export");
		assertThat(StringUtils.trimAllWhitespace(divExport.getAttribute("style"))).isEqualTo("float:right;");
	}
	
	@Ignore
	public void should_generate_top_middle_link() throws IOException, Exception {
		goToPage("themes/bootstrap2_top_middle_link");
		
		FluentWebElement divExport = find("#" + Constants.TABLE_ID + "_wrapper").find("div.span6", 1).findFirst("div");
		
		assertThat(divExport.getAttribute("class")).isEqualTo("dandelion_dataTables_export");
		assertThat(StringUtils.trimAllWhitespace(divExport.getAttribute("style"))).isEqualTo("float:left;margin-left:10px;");
	}
	
	@Ignore
	public void should_generate_top_left_link() throws IOException, Exception {
		goToPage("themes/bootstrap2_top_left_link");
		
		FluentWebElement divExport = find("#" + Constants.TABLE_ID + "_wrapper").findFirst("div.span6").findFirst("div");
		
		assertThat(divExport.getAttribute("class")).isEqualTo("dandelion_dataTables_export");
		assertThat(StringUtils.trimAllWhitespace(divExport.getAttribute("style"))).isEqualTo("float:left;margin-right:10px;");
	}
}
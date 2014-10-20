package com.github.dandelion.datatables.core.extension.feature;

import java.util.Arrays;
import java.util.HashSet;

import org.junit.Ignore;
import org.junit.Test;

import com.github.dandelion.core.asset.generator.js.JsSnippet;
import com.github.dandelion.core.web.AssetRequestContext;
import com.github.dandelion.datatables.core.extension.AbstractExtensionTest;
import com.github.dandelion.datatables.core.extension.Extension;
import com.github.dandelion.datatables.core.generator.DTConstants;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.entry;

@Ignore
public class PipeliningFeatureTest extends AbstractExtensionTest {

	@Test
	public void shoud_load_the_extension_with_the_given_ajax_source() {
		
		extensionProcessor.process(new HashSet<Extension>(Arrays.asList(new PipeliningFeature())));

		assertThat(AssetRequestContext.get(table.getTableConfiguration().getRequest()).getBundles(true)).hasSize(1);
		assertThat(mainConfig).contains(entry(DTConstants.DT_FN_SERVERDATA, new JsSnippet("fnDataTablesPipeline")));
		// TODO test the pipe size
	}
	
	@Test
	public void shoud_load_the_extension_with_a_custom_pipesize() {
		
		// TODO test a custom pipe size
	}
}

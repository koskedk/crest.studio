package org.livedev.crest.domain

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class OrganisationTest{
    @Test
    fun should_Init(){
       val org=Organisation("Ke.Wfp","World Food Program","WFP Kenya")
       Assertions.assertEquals(org.code,"ke.wfp")
    }
}
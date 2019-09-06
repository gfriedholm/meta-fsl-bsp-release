# Copyright 2019 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

SUMMARY = "i.MX M7 core Demo images"
SECTION = "app"
LICENSE = "Proprietary"

inherit deploy fsl-eula2-unpack2

SOC        ?= "INVALID"
SOC_mx8mn   = "imx8mn"

IMX_PACKAGE_NAME = "${SOC}-m7-demo-${PV}"
SRC_URI_append = ";name=${SOC}"

SCR = "SCR-${SOC}-m7-demo.txt"

do_deploy () {
    cp ${D}/* ${DEPLOYDIR}/
    for i in hello_world rpmsg_lite_pingpong_rtos_linux_remote rpmsg_lite_str_echo_rtos sai_low_power_audio; do
        ln -s imx8mn_m7_TC_$i.bin ${DEPLOYDIR}/imx8mn_m7_TCM_$i.bin
    done
}
addtask deploy after do_install

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

LIC_FILES_CHKSUM = "file://COPYING;md5=6c12031a11b81db21cdfe0be88cac4b3"

SRC_URI[imx8mn.md5sum] = "c2566a6f1a9dd58c76ea3c699fa64618"
SRC_URI[imx8mn.sha256sum] = "be68a551b1ea985e817037176231f2096b203d71e75d0a1ce244afadf6ac9433"

COMPATIBLE_MACHINE = "(mx8mn)"
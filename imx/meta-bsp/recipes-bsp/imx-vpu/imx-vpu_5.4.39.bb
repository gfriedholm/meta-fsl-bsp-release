# Copyright (C) 2013-2018 O.S. Systems Software LTDA.
# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2017-2018 NXP

DESCRIPTION = "Freescale VPU library"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44"

PROVIDES = "virtual/imxvpu"
RPROVIDES_${PN} = "virtual/imxvpu"

PE = "1"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.bin;fsl-eula=true"
SRC_URI[md5sum] = "f6dc640f89f1cb0d48fd10a7088ea583"
SRC_URI[sha256sum] = "0126b7531289e2ae806d7878f727a6c923e8cbdeac763e9ca9cac3b984a7ccbf"

inherit fsl-eula-unpack use-imx-headers

PLATFORM = "IMX6Q"

do_compile() {
    INCLUDE_DIR="-I${STAGING_INCDIR_IMX}"
    oe_runmake CROSS_COMPILE="${HOST_PREFIX}" PLATFORM="${PLATFORM}" INCLUDE="${INCLUDE_DIR}" all
}

do_install() {
    oe_runmake PLATFORM="${PLATFORM}" DEST_DIR="${D}" install
}

# Compatible only for i.MX with Chips&Media VPU
COMPATIBLE_MACHINE = "(^$)"
COMPATIBLE_MACHINE_imxvpucnm = "${MACHINE}"
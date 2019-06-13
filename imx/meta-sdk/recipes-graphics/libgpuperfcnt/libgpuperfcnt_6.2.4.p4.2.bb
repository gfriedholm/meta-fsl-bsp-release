DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=fb0303e4ee8b0e71c094171e2272bd44" 

SRC_URI[arm-fb.md5sum] = "51cdd4a01f645cc4305e99661f8f6e7d"
SRC_URI[arm-fb.sha256sum] = "ff89161ac45228d32ba6b987052c7713cade7610b443958e4d2bd163af774755"

SRC_URI[arm-wayland.md5sum] = "fc47abd0fb33a8107c7feadd91ebcbed"
SRC_URI[arm-wayland.sha256sum] = "f8727240b2f4a8ad056902048b0a8b17e607dbd4818990bb0e0ca26aeb6c258a"

SRC_URI[arm-x11.md5sum] = "649f7289c1ba7b486970e6b3738fbd35"
SRC_URI[arm-x11.sha256sum] = "fd939611d4eb93ddbdf280f3190428015a2121e256464c5b693e53b91ef9d117"

SRC_URI[aarch64-fb.md5sum] = "32f944235afcdc505c811aee40439d16"
SRC_URI[aarch64-fb.sha256sum] = "9b87407feced07a8edc616c98adc2fc1aa9e6cc731743b23f88b50ce6e2fe56f"

SRC_URI[aarch64-wayland.md5sum] = "f392f5182bd646eae786ec17d92ee60d"
SRC_URI[aarch64-wayland.sha256sum] = "7cf9f0ed18d17c651e435dc0a7e8613a5eaf376ad743c63a2dda8c1f75729ff3"

SRC_URI[aarch64-x11.md5sum] = "e2492161fba54a66cef45eb716755874"
SRC_URI[aarch64-x11.sha256sum] = "f9a6836afd8111f6ecbdcd05af43d2dca8e6ab005aca98b22fa48fc860134def"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
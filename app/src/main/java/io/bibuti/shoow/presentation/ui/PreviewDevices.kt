package io.bibuti.shoow.presentation.ui

import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_4, name = Devices.PIXEL_4)
@Preview(showBackground = true, showSystemUi = true, device = Devices.TABLET, name = Devices.TABLET)
annotation class PreviewDevices

@Preview(showBackground = true, showSystemUi = true, device = Devices.PIXEL_4, name = Devices.PIXEL_4)
annotation class PreviewInPhone

@Preview(showBackground = true, showSystemUi = true, device = Devices.TABLET, name = Devices.TABLET)
annotation class PreviewInTablet
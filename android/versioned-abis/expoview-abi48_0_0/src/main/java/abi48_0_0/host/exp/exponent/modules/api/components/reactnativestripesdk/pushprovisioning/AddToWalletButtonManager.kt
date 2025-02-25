package abi48_0_0.host.exp.exponent.modules.api.components.reactnativestripesdk.pushprovisioning

import com.bumptech.glide.Glide
import abi48_0_0.com.facebook.react.bridge.ReadableMap
import abi48_0_0.com.facebook.react.common.MapBuilder
import abi48_0_0.com.facebook.react.uimanager.SimpleViewManager
import abi48_0_0.com.facebook.react.uimanager.ThemedReactContext
import abi48_0_0.com.facebook.react.uimanager.annotations.ReactProp
import abi48_0_0.com.facebook.react.bridge.ReactApplicationContext

class AddToWalletButtonManager(applicationContext: ReactApplicationContext) : SimpleViewManager<AddToWalletButtonView?>() {
  private val requestManager = Glide.with(applicationContext)
  override fun getName() = "AddToWalletButton"

  override fun onDropViewInstance(view: AddToWalletButtonView) {
    view.onDropViewInstance()
    super.onDropViewInstance(view)
  }

  override fun onAfterUpdateTransaction(view: AddToWalletButtonView) {
    super.onAfterUpdateTransaction(view)
    view.onAfterUpdateTransaction()
  }

  override fun createViewInstance(reactContext: ThemedReactContext): AddToWalletButtonView {
    return AddToWalletButtonView(reactContext, requestManager)
  }

  override fun getExportedCustomDirectEventTypeConstants(): MutableMap<String, Any> {
    return MapBuilder.of(
      AddToWalletCompleteEvent.EVENT_NAME, MapBuilder.of("registrationName", "onCompleteAction")
    )
  }

  @ReactProp(name = "androidAssetSource")
  fun source(view: AddToWalletButtonView, source: ReadableMap) {
    view.setSourceMap(source)
  }

  @ReactProp(name = "cardDetails")
  fun cardDetails(view: AddToWalletButtonView, cardDetails: ReadableMap) {
    view.setCardDetails(cardDetails)
  }

  @ReactProp(name = "ephemeralKey")
  fun ephemeralKey(view: AddToWalletButtonView, ephemeralKey: ReadableMap) {
    view.setEphemeralKey(ephemeralKey)
  }

  @ReactProp(name = "token")
  fun token(view: AddToWalletButtonView, token: ReadableMap?) {
    view.setToken(token)
  }
}

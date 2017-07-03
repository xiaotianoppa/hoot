package love.ahoo.android.hoot;

import love.ahoo.android.hoot.callbacks.XC_InitPackageResources;
import love.ahoo.android.hoot.callbacks.XC_InitPackageResources.InitPackageResourcesParam;



/**
 * Use the module class as a handler for {@link XC_InitPackageResources#handleInitPackageResources}
 */
public interface IXposedHookInitPackageResources extends IXposedMod {
	/** @see XC_InitPackageResources#handleInitPackageResources */
	public abstract void handleInitPackageResources(InitPackageResourcesParam resparam) throws Throwable;

	public static class Wrapper extends XC_InitPackageResources {
		private final IXposedHookInitPackageResources instance;
		public Wrapper(IXposedHookInitPackageResources instance) {
			this.instance = instance;
		}
		@Override
		public void handleInitPackageResources(InitPackageResourcesParam resparam) throws Throwable {
			instance.handleInitPackageResources(resparam);
		}
	}
}

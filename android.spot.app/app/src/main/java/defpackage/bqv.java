package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.Log;
import android.view.Display;
import android.view.inputmethod.EditorInfo;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bqv {
    static Context a(Context context, String str) {
        Context createAttributionContext;
        createAttributionContext = context.createAttributionContext(str);
        return createAttributionContext;
    }

    static Display b(Context context) {
        Object systemService;
        Display display;
        try {
            display = context.getDisplay();
            return display;
        } catch (UnsupportedOperationException unused) {
            Log.w("ContextCompat", a.af(context, "The context:", " is not associated with any display. Return a fallback display instead."));
            systemService = context.getSystemService((Class<Object>) DisplayManager.class);
            return ((DisplayManager) systemService).getDisplay(0);
        }
    }

    public static String c(Context context) {
        String attributionTag;
        attributionTag = context.getAttributionTag();
        return attributionTag;
    }

    public static void d(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}

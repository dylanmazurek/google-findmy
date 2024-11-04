package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class de {
    public static OnBackInvokedCallback a(Object obj, dn dnVar) {
        dnVar.getClass();
        nc ncVar = new nc(dnVar, 1);
        ce$$ExternalSyntheticApiModelOutline0.m20m(obj).registerOnBackInvokedCallback(1000000, ncVar);
        return ncVar;
    }

    public static OnBackInvokedDispatcher b(Activity activity) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        onBackInvokedDispatcher = activity.getOnBackInvokedDispatcher();
        return onBackInvokedDispatcher;
    }

    public static void c(Object obj, Object obj2) {
        ce$$ExternalSyntheticApiModelOutline0.m20m(obj).unregisterOnBackInvokedCallback(ce$$ExternalSyntheticApiModelOutline0.m19m(obj2));
    }

    public static void d(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof ns) {
                    editorInfo.hintText = ((ns) parent).a();
                    return;
                }
            }
        }
    }

    public static final aox e(abi abiVar, aox aoxVar) {
        if (aoxVar.c(wo.m)) {
            return aoxVar;
        }
        abiVar.H();
        aox aoxVar2 = (aox) aoxVar.b(aox.d, new tu(3));
        abiVar.p();
        return aoxVar2;
    }

    public static final boolean f(Object obj, Object obj2) {
        if (obj.getClass() == obj2.getClass()) {
            return true;
        }
        return false;
    }
}

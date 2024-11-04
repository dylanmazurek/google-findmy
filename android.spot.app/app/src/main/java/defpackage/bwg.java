package defpackage;

import android.view.KeyEvent;
import android.view.View;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static CharSequence a(View view) {
        CharSequence accessibilityPaneTitle;
        accessibilityPaneTitle = view.getAccessibilityPaneTitle();
        return accessibilityPaneTitle;
    }

    public static Object b(View view, int i) {
        View requireViewById;
        requireViewById = view.requireViewById(i);
        return requireViewById;
    }

    static void c(View view, final bwl bwlVar) {
        ta taVar = (ta) view.getTag(R.id.tag_unhandled_key_listeners);
        if (taVar == null) {
            taVar = new ta();
            view.setTag(R.id.tag_unhandled_key_listeners, taVar);
        }
        bwlVar.getClass();
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: bwf
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                return bwl.this.a();
            }
        };
        taVar.put(bwlVar, onUnhandledKeyEventListener);
        view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    static void d(View view, bwl bwlVar) {
        View.OnUnhandledKeyEventListener m130m;
        ta taVar = (ta) view.getTag(R.id.tag_unhandled_key_listeners);
        if (taVar != null && (m130m = he$$ExternalSyntheticApiModelOutline0.m130m(taVar.get(bwlVar))) != null) {
            view.removeOnUnhandledKeyEventListener(m130m);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void e(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void g(View view, bzb bzbVar) {
        if (bzbVar != null) {
            throw null;
        }
        view.setAutofillId(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void h(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean i(View view) {
        boolean isAccessibilityHeading;
        isAccessibilityHeading = view.isAccessibilityHeading();
        return isAccessibilityHeading;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean j(View view) {
        boolean isScreenReaderFocusable;
        isScreenReaderFocusable = view.isScreenReaderFocusable();
        return isScreenReaderFocusable;
    }

    public static final String k(String str) {
        return a.ag(str, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '", "')");
    }
}

package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kv {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }

    public static KeyguardManager c(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return rh.a(context);
        }
        Object systemService = context.getSystemService("keyguard");
        if (systemService instanceof KeyguardManager) {
            return (KeyguardManager) systemService;
        }
        return null;
    }

    public static boolean d(Context context) {
        KeyguardManager c = c(context);
        if (c == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return rh.b(c);
        }
        return c.isKeyguardSecure();
    }

    public static long e(asn asnVar) {
        return ((asl) asnVar).b.a();
    }

    public static /* synthetic */ void f(asn asnVar, long j, float f, ji jiVar, int i) {
        float f2;
        asp aspVar;
        ji jiVar2;
        long j2 = 0;
        if ((i & 4) != 0) {
            long l = asnVar.l();
            j2 = a.k(aqn.b(l) - aqk.b(0L), aqn.a(l) - aqk.c(0L));
        }
        long j3 = j2;
        if ((i & 8) != 0) {
            f2 = 1.0f;
        } else {
            f2 = f;
        }
        if ((i & 16) != 0) {
            aspVar = asp.a;
        } else {
            aspVar = null;
        }
        if ((i & 32) != 0) {
            jiVar2 = null;
        } else {
            jiVar2 = jiVar;
        }
        asnVar.p(j, j3, f2, aspVar, jiVar2);
    }
}

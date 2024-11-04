package defpackage;

import android.view.ViewConfiguration;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bwq {
    public static int a(ViewConfiguration viewConfiguration) {
        int scaledHoverSlop;
        scaledHoverSlop = viewConfiguration.getScaledHoverSlop();
        return scaledHoverSlop;
    }

    public static boolean b(ViewConfiguration viewConfiguration) {
        boolean shouldShowMenuShortcutsWhenKeyboardPresent;
        shouldShowMenuShortcutsWhenKeyboardPresent = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        return shouldShowMenuShortcutsWhenKeyboardPresent;
    }

    public static final void c(ddh ddhVar) {
        mmg mmgVar = new mmg();
        cji l = ddhVar.l("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (l.k()) {
            try {
                mmgVar.add(l.d(0));
            } catch (Throwable th) {
                l.h();
                throw th;
            }
        }
        l.h();
        for (String str : mkm.M(mmgVar)) {
            if (moz.I(str, "room_fts_content_sync_")) {
                bzb.b(ddhVar, "DROP TRIGGER IF EXISTS ".concat(String.valueOf(str)));
            }
        }
    }
}

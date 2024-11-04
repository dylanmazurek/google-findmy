package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
public class oj extends oi {
    @Override // defpackage.oh, defpackage.iv
    public void c(oz ozVar, oz ozVar2, Window window, View view, boolean z, boolean z2) {
        bqs bybVar;
        ozVar.getClass();
        ozVar2.getClass();
        window.getClass();
        view.getClass();
        bqq.d(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        if (Build.VERSION.SDK_INT >= 35) {
            bybVar = new byf(window);
        } else if (Build.VERSION.SDK_INT >= 30) {
            bybVar = new bye(window);
        } else if (Build.VERSION.SDK_INT >= 26) {
            bybVar = new byd(window);
        } else if (Build.VERSION.SDK_INT >= 23) {
            bybVar = new byc(window);
        } else {
            bybVar = new byb(window);
        }
        bqt.d(!z, bybVar);
        bqt.c(true ^ z2, bybVar);
    }
}

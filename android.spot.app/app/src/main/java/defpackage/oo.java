package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oo implements cfa {
    public static final mkt a = new mla(ph.b);
    private final Activity b;

    public oo(Activity activity) {
        this.b = activity;
    }

    @Override // defpackage.cfa
    public final void a(cfc cfcVar, cev cevVar) {
        if (cevVar == cev.ON_DESTROY) {
            Object systemService = this.b.getSystemService("input_method");
            systemService.getClass();
            InputMethodManager inputMethodManager = (InputMethodManager) systemService;
            ol olVar = (ol) a.a();
            Object b = olVar.b(inputMethodManager);
            if (b != null) {
                synchronized (b) {
                    View a2 = olVar.a(inputMethodManager);
                    if (a2 == null) {
                        return;
                    }
                    if (a2.isAttachedToWindow()) {
                        return;
                    }
                    boolean c = olVar.c(inputMethodManager);
                    if (c) {
                        inputMethodManager.isActive();
                    }
                }
            }
        }
    }
}

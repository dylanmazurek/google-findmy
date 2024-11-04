package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.adm.activities.MainActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dve implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ MainActivity b;

    public dve(MainActivity mainActivity, View view) {
        this.a = view;
        this.b = mainActivity;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        if (this.b.q) {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
            return true;
        }
        return false;
    }
}

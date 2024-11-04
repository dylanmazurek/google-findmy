package defpackage;

import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bww extends mpc implements moh {
    public static final bww a = new bww();

    public bww() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // defpackage.moh
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return ((ViewParent) obj).getParent();
    }
}

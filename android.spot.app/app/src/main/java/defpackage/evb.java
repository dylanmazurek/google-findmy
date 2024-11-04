package defpackage;

import android.content.Context;
import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class evb implements euv {
    private static final String a = "evb";
    private final Context b;

    public evb(Context context) {
        this.b = context;
    }

    @Override // defpackage.euv
    public final int a() {
        return iqg.e(this.b, R.attr.colorPrimary, a);
    }

    @Override // defpackage.euv
    public final int b() {
        return iqg.e(this.b, R.attr.colorSurface, a);
    }

    @Override // defpackage.euv
    public final int c() {
        return iqg.e(this.b, R.attr.colorOnSurface, a);
    }

    @Override // defpackage.euv
    public final int d() {
        return iqg.e(this.b, R.attr.colorOnPrimary, a);
    }

    @Override // defpackage.euv
    public final int e() {
        return iqg.e(this.b, R.attr.colorOutline, a);
    }
}

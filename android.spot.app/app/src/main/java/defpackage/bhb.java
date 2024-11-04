package defpackage;

import android.os.Build;
import android.text.StaticLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bhb implements bhh {
    @Override // defpackage.bhh
    public StaticLayout a(bhi bhiVar) {
        StaticLayout.Builder obtain;
        StaticLayout build;
        obtain = StaticLayout.Builder.obtain(bhiVar.a, 0, bhiVar.b, bhiVar.c, bhiVar.d);
        obtain.setTextDirection(bhiVar.e);
        obtain.setAlignment(bhiVar.f);
        obtain.setMaxLines(bhiVar.g);
        obtain.setEllipsize(bhiVar.h);
        obtain.setEllipsizedWidth(bhiVar.i);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(false);
        obtain.setBreakStrategy(bhiVar.k);
        obtain.setHyphenationFrequency(bhiVar.n);
        obtain.setIndents(null, null);
        if (Build.VERSION.SDK_INT >= 26) {
            bhc.a(obtain, bhiVar.j);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            bhd.a(obtain, true);
        }
        if (Build.VERSION.SDK_INT >= 33) {
            bhe.a(obtain, bhiVar.l, bhiVar.m);
        }
        build = obtain.build();
        return build;
    }

    @Override // defpackage.bhh
    public final boolean b(StaticLayout staticLayout) {
        if (Build.VERSION.SDK_INT >= 33) {
            return bhe.b(staticLayout);
        }
        if (Build.VERSION.SDK_INT < 28) {
            return false;
        }
        return true;
    }
}

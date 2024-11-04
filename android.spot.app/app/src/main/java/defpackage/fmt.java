package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fmt implements fmy {
    private final /* synthetic */ int a;

    public fmt(int i) {
        this.a = i;
    }

    @Override // defpackage.fmy
    public final fmx a(Context context, String str, fmw fmwVar) {
        int b;
        int i = -1;
        if (this.a != 0) {
            fmx fmxVar = new fmx();
            int b2 = fmwVar.b(context, str, true);
            fmxVar.b = b2;
            if (b2 != 0) {
                fmxVar.c = 1;
            } else {
                int a = fmwVar.a(context, str);
                fmxVar.a = a;
                if (a != 0) {
                    fmxVar.c = -1;
                }
            }
            return fmxVar;
        }
        fmx fmxVar2 = new fmx();
        int a2 = fmwVar.a(context, str);
        fmxVar2.a = a2;
        int i2 = 0;
        if (a2 != 0) {
            b = fmwVar.b(context, str, false);
            fmxVar2.b = b;
        } else {
            b = fmwVar.b(context, str, true);
            fmxVar2.b = b;
        }
        int i3 = fmxVar2.a;
        if (i3 == 0) {
            if (b == 0) {
                i = 0;
                fmxVar2.c = i;
                return fmxVar2;
            }
        } else {
            i2 = i3;
        }
        if (i2 < b) {
            i = 1;
        }
        fmxVar2.c = i;
        return fmxVar2;
    }
}

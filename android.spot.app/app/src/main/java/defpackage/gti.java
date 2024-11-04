package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gti implements gst {
    final /* synthetic */ Set a;
    private final /* synthetic */ int b;

    public gti(Set set, int i) {
        this.b = i;
        this.a = set;
    }

    @Override // defpackage.gst
    public final int a(goa goaVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                goaVar.getClass();
                if (this.a.contains(goaVar.b())) {
                    return 3;
                }
                int i2 = goaVar.f;
                if (i2 == 5) {
                    return 6;
                }
                return i2;
            }
            goaVar.getClass();
            if (this.a.contains(goaVar.b())) {
                return 3;
            }
            int i3 = goaVar.f;
            if (i3 == 5) {
                return 6;
            }
            return i3;
        }
        goaVar.getClass();
        if (this.a.contains(goaVar.b())) {
            return 2;
        }
        if (goaVar.f != 4) {
            return 5;
        }
        return 4;
    }
}

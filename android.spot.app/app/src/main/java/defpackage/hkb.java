package defpackage;

import com.google.android.apps.adm.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hkb implements jei {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ hkb(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }

    @Override // defpackage.jei
    public final Object a(Object obj) {
        int i;
        int i2 = this.c;
        if (i2 != 0) {
            if (i2 != 1) {
                return ((hjy) obj).d((String) this.b, this.a);
            }
            dhx dhxVar = ((eqo) this.b).e;
            if (this.a == 3) {
                i = R.string.snackbar_mark_as_lost_failed;
            } else {
                i = R.string.snackbar_mark_as_found_failed;
            }
            dhxVar.m(i);
            return null;
        }
        return ((hjy) obj).c((String) this.b, this.a);
    }
}

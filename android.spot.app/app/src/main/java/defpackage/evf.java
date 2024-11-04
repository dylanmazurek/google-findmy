package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class evf extends evi {
    @Override // defpackage.evi
    public String b() {
        String str;
        int a = a();
        if (a != 1) {
            if (a != 2) {
                if (a != 3) {
                    str = "CUSTOM";
                } else {
                    str = "LEARN_MORE";
                }
            } else {
                str = "SETTING";
            }
        } else {
            str = "NONE";
        }
        throw new UnsupportedOperationException(str);
    }
}

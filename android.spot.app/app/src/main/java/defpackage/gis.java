package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
abstract class gis extends giu {
    @Override // defpackage.giu
    public goa a() {
        String str;
        if (b() != 1) {
            str = "DEVICE";
        } else {
            str = "ACCOUNT";
        }
        throw new UnsupportedOperationException(str);
    }
}

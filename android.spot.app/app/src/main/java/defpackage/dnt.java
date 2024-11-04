package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnt implements dnp {
    public static final dnt a = new dnt(2, null);
    private final /* synthetic */ int b;

    public dnt(int i) {
        this.b = i;
    }

    @Override // defpackage.dnp
    public final boolean a(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return true;
            }
            return obj.toString().startsWith("data:image");
        }
        return false;
    }

    @Override // defpackage.dnp
    public final bso b(Object obj, int i, int i2, div divVar) {
        int i3 = this.b;
        if (i3 != 0) {
            if (i3 != 1) {
                return new bso(new dtb(obj), new dnx(obj, 0));
            }
            return new bso(new dtb(obj), new dmv(obj.toString()));
        }
        return null;
    }

    @Deprecated
    public dnt(int i, char[] cArr) {
        this.b = i;
    }
}

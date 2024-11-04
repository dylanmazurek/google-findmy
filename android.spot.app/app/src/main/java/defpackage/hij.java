package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hij {
    public jer a;
    public jer b;
    public jer c;
    public boolean d;
    public byte e;
    public hog f;
    public hog g;
    private jer h;
    private jer i;
    private jer j;

    public hij() {
        throw null;
    }

    public final hik a() {
        hog hogVar;
        hog hogVar2;
        Boolean bool = false;
        bool.getClass();
        if (this.e == 1 && (hogVar = this.f) != null && (hogVar2 = this.g) != null) {
            return new hik(this.a, this.h, this.i, this.b, this.j, this.c, hogVar, this.d, hogVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" secondaryButtonStyleFeature");
        }
        if (this.e == 0) {
            sb.append(" supportAccountSwitching");
        }
        if (this.g == null) {
            sb.append(" customContinueButtonTextsFactory");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public hij(byte[] bArr) {
        jdl jdlVar = jdl.a;
        this.a = jdlVar;
        this.h = jdlVar;
        this.i = jdlVar;
        this.b = jdlVar;
        this.j = jdlVar;
        this.c = jdlVar;
    }
}

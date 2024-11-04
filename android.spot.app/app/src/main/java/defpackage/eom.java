package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eom {
    public String a;
    public kye b;
    public boolean c;
    public jin d;
    public jis e;
    public jin f;
    public jis g;
    public byte h;
    private boolean i;
    private boolean j;

    public eom() {
    }

    public final eoo a() {
        String str;
        kye kyeVar;
        jin jinVar = this.d;
        if (jinVar != null) {
            this.e = jinVar.g();
        } else if (this.e == null) {
            int i = jis.d;
            this.e = jmi.a;
        }
        jin jinVar2 = this.f;
        if (jinVar2 != null) {
            this.g = jinVar2.g();
        } else if (this.g == null) {
            int i2 = jis.d;
            this.g = jmi.a;
        }
        if (this.h == 7 && (str = this.a) != null && (kyeVar = this.b) != null) {
            return new eoo(str, kyeVar, this.c, this.e, this.g, this.i, this.j);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" deviceName");
        }
        if (this.b == null) {
            sb.append(" sharingState");
        }
        if ((this.h & 1) == 0) {
            sb.append(" canInviteMoreOwners");
        }
        if ((this.h & 2) == 0) {
            sb.append(" refreshingSharedOwners");
        }
        if ((this.h & 4) == 0) {
            sb.append(" isRelinquishing");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(boolean z) {
        this.j = z;
        this.h = (byte) (this.h | 4);
    }

    public final void c(boolean z) {
        this.i = z;
        this.h = (byte) (this.h | 2);
    }

    public eom(eoo eooVar) {
        this.a = eooVar.a;
        this.b = eooVar.b;
        this.c = eooVar.c;
        this.e = eooVar.d;
        this.g = eooVar.e;
        this.i = eooVar.f;
        this.j = eooVar.g;
        this.h = (byte) 7;
    }
}

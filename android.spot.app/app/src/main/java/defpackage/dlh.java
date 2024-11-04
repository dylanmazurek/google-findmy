package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlh implements dir {
    private static final dtm b = new dtm(50);
    private final dir c;
    private final dir d;
    private final int e;
    private final int f;
    private final Class g;
    private final div h;
    private final diz i;
    private final dlu j;

    public dlh(dlu dluVar, dir dirVar, dir dirVar2, int i, int i2, diz dizVar, Class cls, div divVar) {
        this.j = dluVar;
        this.c = dirVar;
        this.d = dirVar2;
        this.e = i;
        this.f = i2;
        this.i = dizVar;
        this.g = cls;
        this.h = divVar;
    }

    @Override // defpackage.dir
    public final void a(MessageDigest messageDigest) {
        byte[] bArr = (byte[]) this.j.e(byte[].class);
        ByteBuffer.wrap(bArr).putInt(this.e).putInt(this.f).array();
        this.d.a(messageDigest);
        this.c.a(messageDigest);
        messageDigest.update(bArr);
        diz dizVar = this.i;
        if (dizVar != null) {
            dizVar.a(messageDigest);
        }
        this.h.a(messageDigest);
        Class cls = this.g;
        dtm dtmVar = b;
        byte[] bArr2 = (byte[]) dtmVar.f(cls);
        if (bArr2 == null) {
            bArr2 = this.g.getName().getBytes(a);
            dtmVar.g(this.g, bArr2);
        }
        messageDigest.update(bArr2);
        this.j.c(bArr);
    }

    @Override // defpackage.dir
    public final boolean equals(Object obj) {
        if (obj instanceof dlh) {
            dlh dlhVar = (dlh) obj;
            if (this.f == dlhVar.f && this.e == dlhVar.e && amr.i(this.i, dlhVar.i) && this.g.equals(dlhVar.g) && this.c.equals(dlhVar.c) && this.d.equals(dlhVar.d) && this.h.equals(dlhVar.h)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dir
    public final int hashCode() {
        int hashCode = (this.c.hashCode() * 31) + this.d.hashCode();
        diz dizVar = this.i;
        int i = (((hashCode * 31) + this.e) * 31) + this.f;
        if (dizVar != null) {
            i = (i * 31) + dizVar.hashCode();
        }
        return (((i * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        div divVar = this.h;
        diz dizVar = this.i;
        Class cls = this.g;
        dir dirVar = this.d;
        return "ResourceCacheKey{sourceKey=" + String.valueOf(this.c) + ", signature=" + String.valueOf(dirVar) + ", width=" + this.e + ", height=" + this.f + ", decodedResourceClass=" + String.valueOf(cls) + ", transformation='" + String.valueOf(dizVar) + "', options=" + String.valueOf(divVar) + "}";
    }
}

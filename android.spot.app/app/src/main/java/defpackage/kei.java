package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kei implements kaa {
    final ktn a;

    public kei(ktn ktnVar) {
        this.a = ktnVar;
        if (ktnVar.d()) {
            kfx.a.a();
            iuu.x(ktnVar);
        }
    }

    @Override // defpackage.kaa
    public final byte[] a(byte[] bArr) {
        Object obj = this.a.b;
        if (obj != null) {
            byte[] a = ((kaa) ((kgi) obj).a).a(bArr);
            int i = ((kgi) this.a.b).d;
            int length = bArr.length;
            return a;
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}

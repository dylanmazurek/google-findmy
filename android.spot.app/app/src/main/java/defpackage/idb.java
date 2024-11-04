package defpackage;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class idb implements ifr {
    public static final jnk a = jnk.l("com/google/android/libraries/spot/ble/FastPairEddystoneRingingClient");
    private static final int i;
    public final jzd b;
    public final jer c;
    public final icv d;
    public final Object e = new Object();
    public jer f;
    public boolean g;
    public volatile jer h;
    private final idt j;

    static {
        int millis = (int) TimeUnit.MINUTES.toMillis(10L);
        i = millis;
        ifp ifpVar = new ifp((byte[]) null);
        ifpVar.b(true);
        ifpVar.c(millis);
        ifpVar.a();
    }

    public idb(jzd jzdVar, hot hotVar, hot hotVar2, idt idtVar, ibl iblVar) {
        boolean z;
        jdl jdlVar = jdl.a;
        this.f = jdlVar;
        this.h = jdlVar;
        if (((lim) ((jeu) iblVar.a).a).d() == 8) {
            z = true;
        } else {
            z = false;
        }
        hwx.J(z);
        hwx.J(d(idtVar));
        this.b = jzdVar;
        this.j = idtVar;
        this.c = iblVar.a;
        ict a2 = icu.a();
        a2.a = jer.i(new njz(this, null));
        a2.b(hotVar2.k());
        this.d = hotVar.m(idtVar, a2.a());
    }

    public static boolean d(idt idtVar) {
        return hqk.i(idtVar.a(UUID.fromString("0000fe2c-0000-1000-8000-00805f9b34fb")), "fe2c1238-8366-4814-8eb0-01de32100bea");
    }

    private final jyz h() {
        hwx.U(!this.f.g());
        return bei.d(new icy(this, 0));
    }

    private final jyz j(icq icqVar, jyz jyzVar) {
        return jbx.d(this.d.a()).f(new ibz(this, icqVar, 2, null), this.b).f(new ibz(this, jyzVar, 3), this.b);
    }

    @Override // defpackage.ifr
    public final jyz a(int i2, final kzl kzlVar, final kyh kyhVar, boolean z) {
        boolean z2;
        jyz h;
        int i3 = i;
        if (i2 <= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        hwx.J(z2);
        if (i2 == 0) {
            i2 = i3;
        }
        if (!z) {
            synchronized (this.e) {
                h = h();
                this.g = true;
            }
            final int i4 = i2 / 100;
            return jbx.d(j(new icq() { // from class: ida
                @Override // defpackage.icq
                public final lim a(lim limVar) {
                    byte b;
                    int ordinal = kyh.this.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        throw new AssertionError("Unreachable code after exhaustive switch");
                                    }
                                } else {
                                    b = 4;
                                }
                            } else {
                                b = 2;
                            }
                        } else {
                            b = 1;
                        }
                        kzl kzlVar2 = kzlVar;
                        int i5 = i4;
                        byte[] bArr = {b, (byte) (i5 >> 8), (byte) (i5 & 255), (byte) kzlVar2.a()};
                        int i6 = iji.a;
                        return lim.t(bArr);
                    }
                    b = -1;
                    kzl kzlVar22 = kzlVar;
                    int i52 = i4;
                    byte[] bArr2 = {b, (byte) (i52 >> 8), (byte) (i52 & 255), (byte) kzlVar22.a()};
                    int i62 = iji.a;
                    return lim.t(bArr2);
                }
            }, h)).e(new iaf(6), this.b);
        }
        throw new UnsupportedOperationException("Atomic timeout extension not supported.");
    }

    public final void b() {
        synchronized (this.e) {
            this.f = jdl.a;
        }
    }

    @Override // defpackage.ifr
    public final jyz c() {
        jyz h;
        synchronized (this.e) {
            h = h();
            this.g = false;
        }
        return jwu.g(jys.q(j(new icz(0), h)), new iaf(5), jxv.a);
    }

    @Override // defpackage.ifr
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ifr
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ifr
    public final idt g() {
        return this.j;
    }

    @Override // defpackage.ifr
    public final jyz i(njz njzVar) {
        this.h = jer.i(njzVar);
        return this.d.a();
    }
}

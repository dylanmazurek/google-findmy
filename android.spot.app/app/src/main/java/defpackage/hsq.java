package defpackage;

import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.system.Os;
import android.system.OsConstants;
import com.google.ar.core.ImageMetadata;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsq extends hqt implements hpg, hnl {
    private final hnq b;
    private final mko c;
    private final mko d;
    private final mko e;
    private final AtomicBoolean f;
    private final mko g;
    private final jfe h;

    public hsq(hnq hnqVar, mko mkoVar, mko mkoVar2, mko mkoVar3, mko mkoVar4, lqz lqzVar) {
        super(null);
        this.f = new AtomicBoolean();
        this.h = hwx.H(new hnn(mkoVar4, 7));
        this.b = hnqVar;
        this.c = mkoVar;
        this.d = mkoVar2;
        this.e = mkoVar3;
        this.g = new hsp(lqzVar, 0);
    }

    private static long m(Long l, long j) {
        if (l == null) {
            return j;
        }
        return Math.min(l.longValue(), j);
    }

    private static nef n(hsj hsjVar) {
        ljh k = nef.f.k();
        if (hsjVar.a != null) {
            String str = hsjVar.a;
            if (!k.b.y()) {
                k.t();
            }
            nef nefVar = (nef) k.b;
            str.getClass();
            nefVar.a |= 1;
            nefVar.b = str;
        }
        if (hsjVar.b != null) {
            long j = hsjVar.b.a;
            if (!k.b.y()) {
                k.t();
            }
            nef nefVar2 = (nef) k.b;
            nefVar2.a |= 2;
            nefVar2.c = j;
        }
        if (hsjVar.c != null) {
            long j2 = hsjVar.c.a;
            if (!k.b.y()) {
                k.t();
            }
            nef nefVar3 = (nef) k.b;
            nefVar3.a |= 4;
            nefVar3.d = j2;
        }
        if (hsjVar.d != null) {
            long j3 = hsjVar.d.a;
            if (!k.b.y()) {
                k.t();
            }
            nef nefVar4 = (nef) k.b;
            nefVar4.a |= 8;
            nefVar4.e = j3;
        }
        return (nef) k.q();
    }

    @Override // defpackage.hpg
    public final void Y() {
        this.b.a(this);
    }

    @Override // defpackage.hnl
    public final void i(hmq hmqVar) {
        hpj hpjVar;
        Long l;
        hpj hpjVar2;
        long startElapsedRealtime;
        jer jerVar;
        jer jerVar2;
        jer jerVar3;
        FileInputStream fileInputStream;
        this.b.b(this);
        hsn hsnVar = hsn.a;
        hpj hpjVar3 = hsnVar.n;
        hpj hpjVar4 = hsnVar.o;
        ((Boolean) this.g.a()).booleanValue();
        if ((hpjVar3 != null && hpjVar3.a > 0) || (hpjVar4 != null && hpjVar4.a > 0)) {
            if (hsnVar.a((hss) this.h.a())) {
                hpjVar = hsnVar.g;
            } else {
                hpj hpjVar5 = hsnVar.l;
                hpjVar = null;
            }
            if (hpjVar != null) {
                long j = hpjVar.a;
                if (j > 0) {
                    if ((hpjVar3 != null && hpjVar3.a >= j) || (hpjVar4 != null && hpjVar4.a >= j)) {
                        ((Boolean) this.g.a()).booleanValue();
                        ljh k = neh.w.k();
                        boolean a = hsnVar.a((hss) this.h.a());
                        if (!k.b.y()) {
                            k.t();
                        }
                        neh nehVar = (neh) k.b;
                        nehVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                        nehVar.q = a;
                        if (hsnVar.a((hss) this.h.a())) {
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar2 = (neh) k.b;
                            nehVar2.r = 1;
                            nehVar2.a = 131072 | nehVar2.a;
                        } else {
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar3 = (neh) k.b;
                            nehVar3.r = 2;
                            nehVar3.a = 131072 | nehVar3.a;
                        }
                        hpj hpjVar6 = hsnVar.g;
                        if (hpjVar6 != null) {
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar4 = (neh) k.b;
                            nehVar4.a |= 16;
                            long j2 = hpjVar6.a;
                            nehVar4.e = j2;
                            l = Long.valueOf(j2);
                        } else {
                            l = null;
                        }
                        hpj hpjVar7 = hsnVar.h;
                        if (hpjVar7 != null) {
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar5 = (neh) k.b;
                            nehVar5.a |= 128;
                            long j3 = hpjVar7.a;
                            nehVar5.h = j3;
                            l = Long.valueOf(m(l, j3));
                        }
                        hpj hpjVar8 = hsnVar.i;
                        hpj hpjVar9 = hsnVar.j;
                        hpj hpjVar10 = hsnVar.k;
                        hpj hpjVar11 = hsnVar.l;
                        hpj hpjVar12 = hsnVar.o;
                        hpj hpjVar13 = hsnVar.p;
                        hpj hpjVar14 = hsnVar.n;
                        hpj hpjVar15 = hsnVar.m;
                        int intValue = ((Long) this.e.a()).intValue();
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue != 4) {
                                        hpjVar2 = null;
                                    } else {
                                        hpjVar2 = hpjVar15;
                                    }
                                } else {
                                    hpjVar2 = hpjVar14;
                                }
                            } else {
                                hpjVar2 = hpjVar13;
                            }
                        } else {
                            hpjVar2 = hpjVar12;
                        }
                        if (hpjVar2 != null) {
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar6 = (neh) k.b;
                            nehVar6.a |= 1024;
                            long j4 = hpjVar2.a;
                            nehVar6.k = j4;
                            l = Long.valueOf(m(l, j4));
                        }
                        if (hpjVar14 != null) {
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar7 = (neh) k.b;
                            nehVar7.a |= 8192;
                            long j5 = hpjVar14.a;
                            nehVar7.n = j5;
                            l = Long.valueOf(m(l, j5));
                        }
                        if (hpjVar15 != null) {
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar8 = (neh) k.b;
                            nehVar8.a |= 16384;
                            long j6 = hpjVar15.a;
                            nehVar8.o = j6;
                            l = Long.valueOf(m(l, j6));
                        }
                        if (hpjVar12 != null) {
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar9 = (neh) k.b;
                            nehVar9.a |= 2048;
                            long j7 = hpjVar12.a;
                            nehVar9.l = j7;
                            l = Long.valueOf(m(l, j7));
                        }
                        if (hpjVar13 != null) {
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar10 = (neh) k.b;
                            nehVar10.a |= 4096;
                            long j8 = hpjVar13.a;
                            nehVar10.m = j8;
                            l = Long.valueOf(m(l, j8));
                        }
                        hpj hpjVar16 = hsnVar.q;
                        if (hsnVar.s.b != null) {
                            nef n = n(hsnVar.s);
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar11 = (neh) k.b;
                            n.getClass();
                            nehVar11.t = n;
                            nehVar11.a |= ImageMetadata.LENS_APERTURE;
                            if ((n.a & 2) != 0) {
                                l = Long.valueOf(m(l, n.c));
                            }
                            if ((n.a & 4) != 0) {
                                l = Long.valueOf(m(l, n.d));
                            }
                            if ((n.a & 8) != 0) {
                                l = Long.valueOf(m(l, n.e));
                            }
                        }
                        if (hsnVar.t.b != null) {
                            nef n2 = n(hsnVar.t);
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar12 = (neh) k.b;
                            n2.getClass();
                            nehVar12.u = n2;
                            nehVar12.a |= ImageMetadata.SHADING_MODE;
                            if ((n2.a & 2) != 0) {
                                l = Long.valueOf(m(l, n2.c));
                            }
                            if ((n2.a & 4) != 0) {
                                l = Long.valueOf(m(l, n2.d));
                            }
                            if ((n2.a & 8) != 0) {
                                l = Long.valueOf(m(l, n2.e));
                            }
                        }
                        Long l2 = l;
                        jer jerVar4 = hsr.a;
                        if (jerVar4 == null) {
                            long sysconf = Os.sysconf(OsConstants._SC_CLK_TCK);
                            if (sysconf > 0) {
                                jerVar = jer.i(Long.valueOf(sysconf));
                            } else {
                                jerVar = jdl.a;
                            }
                            jer jerVar5 = jerVar;
                            if (!jerVar5.g()) {
                                jerVar4 = jdl.a;
                            } else {
                                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                byte[] bArr = new byte[440];
                                boolean z = false;
                                try {
                                    try {
                                        fileInputStream = new FileInputStream(new File("/proc/self/stat"));
                                    } catch (IOException unused) {
                                        jerVar2 = jdl.a;
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    }
                                    try {
                                        int read = fileInputStream.read(bArr);
                                        fileInputStream.close();
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        jerVar2 = jer.i(ByteBuffer.wrap(bArr, 0, read));
                                        if (!jerVar2.g()) {
                                            jerVar4 = jdl.a;
                                        } else {
                                            Object c = jerVar2.c();
                                            long longValue = ((Long) jerVar5.c()).longValue();
                                            while (true) {
                                                ByteBuffer byteBuffer = (ByteBuffer) c;
                                                if (byteBuffer.remaining() <= 17) {
                                                    break;
                                                }
                                                if (byteBuffer.get() == 40) {
                                                    int i = 16;
                                                    while (true) {
                                                        if (i < 0) {
                                                            break;
                                                        }
                                                        if (byteBuffer.get(byteBuffer.position() + i) == 41) {
                                                            byteBuffer.position(byteBuffer.position() + i + 1);
                                                            if (byteBuffer.get() == 32 && hsr.a(byteBuffer, 1) && hsr.a(byteBuffer, 18)) {
                                                                long j9 = 0;
                                                                while (true) {
                                                                    if (!byteBuffer.hasRemaining()) {
                                                                        break;
                                                                    }
                                                                    byte b = byteBuffer.get();
                                                                    if (b == 32) {
                                                                        if (z) {
                                                                            jerVar3 = jer.i(Long.valueOf(j9));
                                                                        }
                                                                    } else {
                                                                        if (b < 48 || b > 57 || j9 > 922337203685477580L) {
                                                                            break;
                                                                        }
                                                                        j9 = (j9 * 10) + (b - 48);
                                                                        byteBuffer = byteBuffer;
                                                                        z = true;
                                                                    }
                                                                }
                                                                jerVar3 = jdl.a;
                                                            }
                                                        } else {
                                                            i--;
                                                        }
                                                    }
                                                }
                                            }
                                            jerVar3 = jdl.a;
                                            if (!jerVar3.g()) {
                                                jerVar4 = jdl.a;
                                            } else {
                                                jerVar4 = jer.i(Long.valueOf(TimeUnit.SECONDS.toMillis(((Long) jerVar3.c()).longValue()) / longValue));
                                            }
                                        }
                                    } finally {
                                    }
                                } catch (Throwable th) {
                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    throw th;
                                }
                            }
                            hsr.a = jerVar4;
                        }
                        if (jerVar4.g()) {
                            Long l3 = (Long) jerVar4.c();
                            long longValue2 = l3.longValue();
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar13 = (neh) k.b;
                            nehVar13.a |= 2;
                            nehVar13.c = longValue2;
                            l2 = Long.valueOf(m(l2, l3.longValue()));
                        }
                        if (Build.VERSION.SDK_INT >= 24) {
                            startElapsedRealtime = Process.getStartElapsedRealtime();
                            if (!k.b.y()) {
                                k.t();
                            }
                            neh nehVar14 = (neh) k.b;
                            nehVar14.a |= 4;
                            nehVar14.d = startElapsedRealtime;
                            l2 = Long.valueOf(m(l2, startElapsedRealtime));
                        }
                        if (!k.b.y()) {
                            k.t();
                        }
                        neh nehVar15 = (neh) k.b;
                        nehVar15.a |= 262144;
                        nehVar15.s = true;
                        if (l2 != null) {
                            mko mkoVar = this.d;
                            long longValue3 = l2.longValue();
                            boolean booleanValue = ((Boolean) mkoVar.a()).booleanValue();
                            if (longValue3 != 0) {
                                if (!booleanValue) {
                                    if (!k.b.y()) {
                                        k.t();
                                    }
                                    neh nehVar16 = (neh) k.b;
                                    nehVar16.a |= 1;
                                    nehVar16.b = longValue3;
                                }
                                ljn ljnVar = k.b;
                                neh nehVar17 = (neh) ljnVar;
                                if ((nehVar17.a & 16) != 0) {
                                    long j10 = nehVar17.e - longValue3;
                                    if (!ljnVar.y()) {
                                        k.t();
                                    }
                                    neh nehVar18 = (neh) k.b;
                                    nehVar18.a |= 16;
                                    nehVar18.e = j10;
                                }
                                ljn ljnVar2 = k.b;
                                neh nehVar19 = (neh) ljnVar2;
                                if ((nehVar19.a & 128) != 0) {
                                    long j11 = nehVar19.h - longValue3;
                                    if (!ljnVar2.y()) {
                                        k.t();
                                    }
                                    neh nehVar20 = (neh) k.b;
                                    nehVar20.a |= 128;
                                    nehVar20.h = j11;
                                }
                                ljn ljnVar3 = k.b;
                                neh nehVar21 = (neh) ljnVar3;
                                if ((nehVar21.a & 256) != 0) {
                                    long j12 = nehVar21.i - longValue3;
                                    if (!ljnVar3.y()) {
                                        k.t();
                                    }
                                    neh nehVar22 = (neh) k.b;
                                    nehVar22.a |= 256;
                                    nehVar22.i = j12;
                                }
                                ljn ljnVar4 = k.b;
                                neh nehVar23 = (neh) ljnVar4;
                                if ((nehVar23.a & 32) != 0) {
                                    long j13 = nehVar23.f - longValue3;
                                    if (!ljnVar4.y()) {
                                        k.t();
                                    }
                                    neh nehVar24 = (neh) k.b;
                                    nehVar24.a |= 32;
                                    nehVar24.f = j13;
                                }
                                ljn ljnVar5 = k.b;
                                neh nehVar25 = (neh) ljnVar5;
                                if ((nehVar25.a & 64) != 0) {
                                    long j14 = nehVar25.g - longValue3;
                                    if (!ljnVar5.y()) {
                                        k.t();
                                    }
                                    neh nehVar26 = (neh) k.b;
                                    nehVar26.a |= 64;
                                    nehVar26.g = j14;
                                }
                                ljn ljnVar6 = k.b;
                                neh nehVar27 = (neh) ljnVar6;
                                if ((nehVar27.a & 512) != 0) {
                                    long j15 = nehVar27.j - longValue3;
                                    if (!ljnVar6.y()) {
                                        k.t();
                                    }
                                    neh nehVar28 = (neh) k.b;
                                    nehVar28.a |= 512;
                                    nehVar28.j = j15;
                                }
                                ljn ljnVar7 = k.b;
                                neh nehVar29 = (neh) ljnVar7;
                                if ((nehVar29.a & 1024) != 0) {
                                    long j16 = nehVar29.k - longValue3;
                                    if (!ljnVar7.y()) {
                                        k.t();
                                    }
                                    neh nehVar30 = (neh) k.b;
                                    nehVar30.a |= 1024;
                                    nehVar30.k = j16;
                                }
                                ljn ljnVar8 = k.b;
                                neh nehVar31 = (neh) ljnVar8;
                                if ((nehVar31.a & 2048) != 0) {
                                    long j17 = nehVar31.l - longValue3;
                                    if (!ljnVar8.y()) {
                                        k.t();
                                    }
                                    neh nehVar32 = (neh) k.b;
                                    nehVar32.a |= 2048;
                                    nehVar32.l = j17;
                                }
                                ljn ljnVar9 = k.b;
                                neh nehVar33 = (neh) ljnVar9;
                                if ((nehVar33.a & 4096) != 0) {
                                    long j18 = nehVar33.m - longValue3;
                                    if (!ljnVar9.y()) {
                                        k.t();
                                    }
                                    neh nehVar34 = (neh) k.b;
                                    nehVar34.a |= 4096;
                                    nehVar34.m = j18;
                                }
                                ljn ljnVar10 = k.b;
                                neh nehVar35 = (neh) ljnVar10;
                                if ((nehVar35.a & 8192) != 0) {
                                    long j19 = nehVar35.n - longValue3;
                                    if (!ljnVar10.y()) {
                                        k.t();
                                    }
                                    neh nehVar36 = (neh) k.b;
                                    nehVar36.a |= 8192;
                                    nehVar36.n = j19;
                                }
                                ljn ljnVar11 = k.b;
                                neh nehVar37 = (neh) ljnVar11;
                                if ((nehVar37.a & 16384) != 0) {
                                    long j20 = nehVar37.o - longValue3;
                                    if (!ljnVar11.y()) {
                                        k.t();
                                    }
                                    neh nehVar38 = (neh) k.b;
                                    nehVar38.a |= 16384;
                                    nehVar38.o = j20;
                                }
                                ljn ljnVar12 = k.b;
                                neh nehVar39 = (neh) ljnVar12;
                                if ((nehVar39.a & 32768) != 0) {
                                    long j21 = nehVar39.p - longValue3;
                                    if (!ljnVar12.y()) {
                                        k.t();
                                    }
                                    neh nehVar40 = (neh) k.b;
                                    nehVar40.a = 32768 | nehVar40.a;
                                    nehVar40.p = j21;
                                }
                                neh nehVar41 = (neh) k.b;
                                if ((nehVar41.a & ImageMetadata.LENS_APERTURE) != 0) {
                                    nef nefVar = nehVar41.t;
                                    if (nefVar == null) {
                                        nefVar = nef.f;
                                    }
                                    nef d = hrb.d(nefVar, longValue3);
                                    if (!k.b.y()) {
                                        k.t();
                                    }
                                    neh nehVar42 = (neh) k.b;
                                    d.getClass();
                                    nehVar42.t = d;
                                    nehVar42.a |= ImageMetadata.LENS_APERTURE;
                                }
                                neh nehVar43 = (neh) k.b;
                                if ((nehVar43.a & ImageMetadata.SHADING_MODE) != 0) {
                                    nef nefVar2 = nehVar43.u;
                                    if (nefVar2 == null) {
                                        nefVar2 = nef.f;
                                    }
                                    nef d2 = hrb.d(nefVar2, longValue3);
                                    if (!k.b.y()) {
                                        k.t();
                                    }
                                    neh nehVar44 = (neh) k.b;
                                    d2.getClass();
                                    nehVar44.u = d2;
                                    nehVar44.a |= ImageMetadata.SHADING_MODE;
                                }
                                ljn ljnVar13 = k.b;
                                neh nehVar45 = (neh) ljnVar13;
                                if ((nehVar45.a & 4) != 0) {
                                    long j22 = nehVar45.d - longValue3;
                                    if (!ljnVar13.y()) {
                                        k.t();
                                    }
                                    neh nehVar46 = (neh) k.b;
                                    nehVar46.a |= 4;
                                    nehVar46.d = j22;
                                }
                                ljn ljnVar14 = k.b;
                                neh nehVar47 = (neh) ljnVar14;
                                if ((nehVar47.a & 2) != 0) {
                                    long j23 = nehVar47.c - longValue3;
                                    if (!ljnVar14.y()) {
                                        k.t();
                                    }
                                    neh nehVar48 = (neh) k.b;
                                    nehVar48.a |= 2;
                                    nehVar48.c = j23;
                                }
                            }
                        }
                        hmq hmqVar2 = hsnVar.r;
                        if (!this.f.getAndSet(true)) {
                            hso hsoVar = (hso) this.c.a();
                            ivc.J(new etm(hsoVar, k, 7, null), hsoVar.c);
                            return;
                        } else {
                            jyz jyzVar = jyv.a;
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        ((jni) ((jni) hmz.a.e()).j("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl", "onAppToBackground", 303, "StartupMetricServiceImpl.java")).r("missing firstDraw timestamp");
    }

    @Override // defpackage.hnl
    public final /* synthetic */ void j(hmq hmqVar) {
    }
}

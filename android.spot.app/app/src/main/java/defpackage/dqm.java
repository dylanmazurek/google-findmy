package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dqm implements dix {
    private static final ddh c = new ddh((byte[]) null, (byte[]) null, (byte[]) null);
    private final Context a;
    private final List b;
    private final ddh d;
    private final elo e;

    public dqm(Context context, List list, dln dlnVar, dlu dluVar) {
        ddh ddhVar = c;
        this.a = context.getApplicationContext();
        this.b = list;
        this.e = new elo(dlnVar, dluVar, (byte[]) null);
        this.d = ddhVar;
    }

    @Override // defpackage.dix
    public final /* bridge */ /* synthetic */ dlf a(Object obj, int i, int i2, div divVar) {
        boolean z;
        dho dhoVar;
        boolean z2;
        boolean z3;
        Bitmap.Config config;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        dhp i3 = this.d.i(byteBuffer);
        try {
            SystemClock.elapsedRealtimeNanos();
            if (i3.b != null) {
                dqq dqqVar = null;
                int i4 = 0;
                if (i3.e()) {
                    dhoVar = i3.c;
                } else {
                    StringBuilder sb = new StringBuilder();
                    for (int i5 = 0; i5 < 6; i5++) {
                        sb.append((char) i3.a());
                    }
                    if (!sb.toString().startsWith("GIF")) {
                        i3.c.b = 1;
                    } else {
                        i3.c.f = i3.b();
                        i3.c.g = i3.b();
                        int a = i3.a();
                        dho dhoVar2 = i3.c;
                        if ((a & 128) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        dhoVar2.h = z;
                        dhoVar2.i = (int) Math.pow(2.0d, (a & 7) + 1);
                        i3.c.j = i3.a();
                        i3.c.k = i3.a();
                        if (i3.c.h && !i3.e()) {
                            dho dhoVar3 = i3.c;
                            dhoVar3.a = i3.f(dhoVar3.i);
                            dho dhoVar4 = i3.c;
                            dhoVar4.l = dhoVar4.a[dhoVar4.j];
                        }
                    }
                    if (!i3.e()) {
                        while (!i3.e()) {
                            int i6 = i3.c.c;
                            int a2 = i3.a();
                            if (a2 != 33) {
                                if (a2 != 44) {
                                    if (a2 == 59) {
                                        break;
                                    }
                                    i3.c.b = 1;
                                } else {
                                    dho dhoVar5 = i3.c;
                                    if (dhoVar5.d == null) {
                                        dhoVar5.d = new dhn();
                                    }
                                    dhoVar5.d.a = i3.b();
                                    i3.c.d.b = i3.b();
                                    i3.c.d.c = i3.b();
                                    i3.c.d.d = i3.b();
                                    int a3 = i3.a();
                                    int i7 = a3 & 128;
                                    int pow = (int) Math.pow(2.0d, (a3 & 7) + 1);
                                    dhn dhnVar = i3.c.d;
                                    if ((a3 & 64) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    dhnVar.e = z2;
                                    if (i7 != 0) {
                                        dhnVar.k = i3.f(pow);
                                    } else {
                                        dhnVar.k = null;
                                    }
                                    i3.c.d.j = i3.b.position();
                                    i3.a();
                                    i3.d();
                                    if (!i3.e()) {
                                        dho dhoVar6 = i3.c;
                                        dhoVar6.c++;
                                        dhoVar6.e.add(dhoVar6.d);
                                    }
                                }
                            } else {
                                int a4 = i3.a();
                                if (a4 != 1) {
                                    if (a4 != 249) {
                                        if (a4 != 254) {
                                            if (a4 != 255) {
                                                i3.d();
                                            } else {
                                                i3.c();
                                                StringBuilder sb2 = new StringBuilder();
                                                for (int i8 = 0; i8 < 11; i8++) {
                                                    sb2.append((char) i3.a[i8]);
                                                }
                                                if (sb2.toString().equals("NETSCAPE2.0")) {
                                                    do {
                                                        i3.c();
                                                        byte[] bArr = i3.a;
                                                        if (bArr[0] == 1) {
                                                            i3.c.m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                                        }
                                                        if (i3.d > 0) {
                                                        }
                                                    } while (!i3.e());
                                                } else {
                                                    i3.d();
                                                }
                                            }
                                        } else {
                                            i3.d();
                                        }
                                    } else {
                                        i3.c.d = new dhn();
                                        i3.a();
                                        int a5 = i3.a();
                                        dhn dhnVar2 = i3.c.d;
                                        int i9 = (a5 & 28) >> 2;
                                        dhnVar2.g = i9;
                                        if (i9 == 0) {
                                            dhnVar2.g = 1;
                                        }
                                        if (1 != (a5 & 1)) {
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        dhnVar2.f = z3;
                                        int b = i3.b();
                                        if (b < 2) {
                                            b = 10;
                                        }
                                        dhn dhnVar3 = i3.c.d;
                                        dhnVar3.i = b * 10;
                                        dhnVar3.h = i3.a();
                                        i3.a();
                                    }
                                } else {
                                    i3.d();
                                }
                            }
                        }
                        dho dhoVar7 = i3.c;
                        if (dhoVar7.c < 0) {
                            dhoVar7.b = 1;
                        }
                    }
                    dhoVar = i3.c;
                }
                if (dhoVar.c > 0 && dhoVar.b == 0) {
                    if (divVar.b(dqv.a) == dii.PREFER_RGB_565) {
                        config = Bitmap.Config.RGB_565;
                    } else {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    int min = Math.min(dhoVar.g / i2, dhoVar.f / i);
                    if (min != 0) {
                        i4 = Integer.highestOneBit(min);
                    }
                    dhq dhqVar = new dhq(this.e, dhoVar, byteBuffer, Math.max(1, i4));
                    if (config != Bitmap.Config.ARGB_8888 && config != Bitmap.Config.RGB_565) {
                        throw new IllegalArgumentException("Unsupported format: " + String.valueOf(config) + ", must be one of " + String.valueOf(Bitmap.Config.ARGB_8888) + " or " + String.valueOf(Bitmap.Config.RGB_565));
                    }
                    dhqVar.i = config;
                    dhqVar.b();
                    Bitmap a6 = dhqVar.a();
                    if (a6 != null) {
                        dqqVar = new dqq(new dqo(new dqn(new dqu(dgo.b(this.a), dhqVar, i, i2, dok.b, a6))));
                    }
                }
                return dqqVar;
            }
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } finally {
            this.d.j(i3);
        }
    }

    @Override // defpackage.dix
    public final /* bridge */ /* synthetic */ boolean b(Object obj, div divVar) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) divVar.b(dqv.b)).booleanValue() && bpx.j(this.b, byteBuffer) == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }
}

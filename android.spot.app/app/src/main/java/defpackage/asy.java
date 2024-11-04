package defpackage;

import android.graphics.Canvas;
import android.media.Image;
import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class asy {
    public static final boolean a;
    private ImageReader e;
    private boolean f;
    private st g;
    private final bet h;
    public final sy d = new sy((byte[]) null);
    public final atk b = new atk();
    public final Handler c = bpw.g(Looper.getMainLooper(), new dqt(this, 1, null));

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        a = amr.i(lowerCase, "robolectric");
    }

    public asy(bet betVar) {
        this.h = betVar;
    }

    public final void a() {
        ImageReader imageReader = this.e;
        if (imageReader != null) {
            imageReader.close();
        }
        this.e = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [aqv, java.lang.Object] */
    public final void b(sy syVar) {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT >= 23 && syVar.c() && !a) {
            ImageReader imageReader = this.e;
            if (imageReader == null) {
                imageReader = ImageReader.newInstance(1, 1, 1, 1);
                imageReader.setOnImageAvailableListener(new ImageReader.OnImageAvailableListener() { // from class: asx
                    @Override // android.media.ImageReader.OnImageAvailableListener
                    public final void onImageAvailable(ImageReader imageReader2) {
                        Image acquireLatestImage;
                        boolean z = asy.a;
                        if (imageReader2 != null && (acquireLatestImage = imageReader2.acquireLatestImage()) != null) {
                            acquireLatestImage.close();
                        }
                    }
                }, this.c);
                this.e = imageReader;
            }
            Surface surface = imageReader.getSurface();
            Canvas a2 = asz.a.a(surface);
            this.f = true;
            bet betVar = this.h;
            ?? r6 = betVar.a;
            aqo aqoVar = (aqo) r6;
            Canvas canvas = aqoVar.a;
            aqoVar.a = a2;
            a2.save();
            a2.clipRect(0, 0, 1, 1);
            Object[] objArr = syVar.b;
            long[] jArr = syVar.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = i3 - length;
                        int i5 = 0;
                        while (true) {
                            i2 = 8 - ((~i4) >>> 31);
                            if (i5 >= i2) {
                                break;
                            }
                            if ((j & 255) < 128) {
                                asq asqVar = (asq) objArr[(i3 << 3) + i5];
                                if (aqp.a(r6).isHardwareAccelerated()) {
                                    asqVar.g();
                                    asqVar.a.n(r6);
                                }
                            }
                            j >>= 8;
                            i5++;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i3 == length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            a2.restore();
            ((aqo) betVar.a).a = canvas;
            this.f = false;
            st stVar = this.g;
            if (stVar != null && (i = stVar.b) != 0) {
                Object[] objArr2 = stVar.a;
                for (int i6 = 0; i6 < i; i6++) {
                    c((asq) objArr2[i6]);
                }
                mkm.e(stVar.a, null, 0, stVar.b);
                stVar.b = 0;
            }
            surface.unlockCanvasAndPost(a2);
        }
    }

    public final void c(asq asqVar) {
        int i;
        byte[] bArr = null;
        if (!this.f) {
            if (this.d.k(asqVar)) {
                mbd mbdVar = asqVar.n;
                Object obj = mbdVar.d;
                if (obj != null) {
                    ((asq) obj).e();
                    mbdVar.d = null;
                }
                Object obj2 = mbdVar.b;
                if (obj2 != null) {
                    sy syVar = (sy) obj2;
                    Object[] objArr = syVar.b;
                    long[] jArr = syVar.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = i2 - length;
                                int i4 = 0;
                                while (true) {
                                    i = 8 - ((~i3) >>> 31);
                                    if (i4 >= i) {
                                        break;
                                    }
                                    if ((255 & j) < 128) {
                                        ((asq) objArr[(i2 << 3) + i4]).e();
                                    }
                                    j >>= 8;
                                    i4++;
                                }
                                if (i != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                    syVar.d();
                }
                asqVar.a.m();
                if (Build.VERSION.SDK_INT >= 23) {
                    atk atkVar = this.b;
                    atkVar.a();
                    ((aiu) atkVar.a).o(new WeakReference(asqVar, (ReferenceQueue) atkVar.b));
                    return;
                }
                return;
            }
            return;
        }
        st stVar = this.g;
        if (stVar == null) {
            stVar = new st(bArr);
            this.g = stVar;
        }
        stVar.a(asqVar);
    }
}

package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dpp implements dpq {
    private final List a;
    private final /* synthetic */ int b;
    private final Object c;
    private final Object d;

    public dpp(ByteBuffer byteBuffer, List list, dlu dluVar, int i) {
        this.b = i;
        this.d = byteBuffer;
        this.a = list;
        this.c = dluVar;
    }

    @Override // defpackage.dpq
    public final int a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return bpx.i(this.a, new dio((djs) this.c, (dlu) this.d, 2));
            }
            ByteBuffer b = dtd.b((ByteBuffer) this.d);
            if (b == null) {
                return -1;
            }
            return bpx.i(this.a, new dio(b, (dlu) this.c, 1));
        }
        return bpx.l(this.a, ((djp) this.c).a(), (dlu) this.d);
    }

    @Override // defpackage.dpq
    public final Bitmap b(BitmapFactory.Options options) {
        Bitmap.Config config;
        Bitmap.Config config2;
        Bitmap.Config config3;
        int i = this.b;
        if (i != 0) {
            boolean z = true;
            if (i != 1) {
                FileDescriptor fileDescriptor = ((djs) this.c).a().getFileDescriptor();
                Bitmap bitmap = null;
                if (Build.VERSION.SDK_INT == 34 && dpn.a(options)) {
                    Bitmap.Config config4 = options.inPreferredConfig;
                    config = Bitmap.Config.HARDWARE;
                    if (config4 != config) {
                        z = false;
                    }
                    bsc.m(z);
                    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                    try {
                        Bitmap decodeFileDescriptor = BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                        if (decodeFileDescriptor == null) {
                            config3 = Bitmap.Config.HARDWARE;
                        } else {
                            try {
                                bitmap = bqa.e(decodeFileDescriptor);
                                decodeFileDescriptor.recycle();
                                config3 = Bitmap.Config.HARDWARE;
                            } catch (Throwable th) {
                                th = th;
                                bitmap = decodeFileDescriptor;
                                if (bitmap != null) {
                                    bitmap.recycle();
                                }
                                config2 = Bitmap.Config.HARDWARE;
                                options.inPreferredConfig = config2;
                                throw th;
                            }
                        }
                        options.inPreferredConfig = config3;
                        return bitmap;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
                }
            } else {
                return bqa.d(new dtc(dtd.b((ByteBuffer) this.d)), options);
            }
        } else {
            return bqa.d(((djp) this.c).a(), options);
        }
    }

    @Override // defpackage.dpq
    public final ImageHeaderParser$ImageType c() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return bpx.k(this.a, new din((djs) this.c, (dlu) this.d));
            }
            return bpx.j(this.a, dtd.b((ByteBuffer) this.d));
        }
        return bpx.m(this.a, ((djp) this.c).a(), (dlu) this.d);
    }

    @Override // defpackage.dpq
    public final void d() {
        if (this.b != 0) {
            return;
        }
        ((djp) this.c).a.a();
    }

    public dpp(InputStream inputStream, List list, dlu dluVar, int i) {
        this.b = i;
        bsc.q(dluVar);
        this.d = dluVar;
        bsc.q(list);
        this.a = list;
        this.c = new djp(inputStream, dluVar);
    }

    public dpp(ParcelFileDescriptor parcelFileDescriptor, List list, dlu dluVar, int i) {
        this.b = i;
        bsc.q(dluVar);
        this.d = dluVar;
        bsc.q(list);
        this.a = list;
        this.c = new djs(parcelFileDescriptor);
    }
}

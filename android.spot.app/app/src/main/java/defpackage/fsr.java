package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mobstore.OpenFileDescriptorRequest;
import com.google.android.gms.mobstore.OpenFileDescriptorResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fsr implements ikz {
    public final jfe a;
    private final ikg b;

    public fsr(Context context) {
        ikg ikgVar = new ikg();
        this.a = new jfh(new fhq(context.getApplicationContext(), fsv.a, fhl.a, fhp.a));
        this.b = ikgVar;
    }

    private final ParcelFileDescriptor i(final Uri uri, final int i) {
        return (ParcelFileDescriptor) j("open file", new Callable() { // from class: fso
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Feature[] featureArr;
                fhq fhqVar = (fhq) ((jfh) fsr.this.a).a;
                Uri uri2 = uri;
                int i2 = i;
                OpenFileDescriptorRequest openFileDescriptorRequest = new OpenFileDescriptorRequest(uri2, i2);
                fjy fjyVar = new fjy();
                fjyVar.a = new fsw(openFileDescriptorRequest, 2);
                if (i2 == 1) {
                    featureArr = new Feature[]{fpj.f};
                } else {
                    featureArr = null;
                }
                fjyVar.b = featureArr;
                fjyVar.c = 7801;
                return ((OpenFileDescriptorResponse) fma.p(fhqVar.f(fjyVar.a()))).a;
            }
        });
    }

    private static final Object j(String str, Callable callable) {
        try {
            return callable.call();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new IOException("Unable to ".concat(str), e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof fhn) {
                fhn fhnVar = (fhn) cause;
                String str2 = fhnVar.a.h;
                if (fhnVar.a() != 33500) {
                    if (fhnVar.a() == 10 && !TextUtils.isEmpty(str2) && str2.startsWith("File not found:")) {
                        throw new FileNotFoundException("Unable to " + str + " because " + str2);
                    }
                } else {
                    throw new FileNotFoundException("Unable to " + str + " because " + str2);
                }
            }
            throw new IOException("Unable to ".concat(str), e2);
        } catch (Exception e3) {
            throw new IOException("Unable to ".concat(str), e3);
        }
    }

    @Override // defpackage.ikz
    public final ikg a() {
        return this.b;
    }

    @Override // defpackage.ikz
    public final /* synthetic */ File b(Uri uri) {
        throw new ikk("Cannot convert uri to file android ".concat(String.valueOf(String.valueOf(uri))));
    }

    @Override // defpackage.ikz
    public final InputStream c(Uri uri) {
        return new fsp(i(uri, 0));
    }

    @Override // defpackage.ikz
    public final OutputStream d(Uri uri) {
        return new fsq(i(uri, 1));
    }

    @Override // defpackage.ikz
    public final String e() {
        return "android";
    }

    @Override // defpackage.ikz
    public final void f(Uri uri) {
        j("delete file", new eyh(this, uri, 2, null));
    }

    @Override // defpackage.ikz
    public final void g(Uri uri, Uri uri2) {
        j("rename file", new cye(this, uri, uri2, 2));
    }

    @Override // defpackage.ikz
    public final boolean h(Uri uri) {
        try {
            ParcelFileDescriptor i = i(uri, 0);
            if (i != null) {
                i.close();
                return true;
            }
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }
}

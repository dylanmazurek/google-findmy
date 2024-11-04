package defpackage;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fvy implements fuy {
    private final Status a;
    private final ParcelFileDescriptor b;

    public fvy(Status status, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = status;
        this.b = parcelFileDescriptor;
    }

    @Override // defpackage.fhx
    public final void a() {
        ParcelFileDescriptor parcelFileDescriptor = this.b;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.fhz
    public final Status b() {
        return this.a;
    }

    @Override // defpackage.fuy
    public final ParcelFileDescriptor c() {
        return this.b;
    }
}

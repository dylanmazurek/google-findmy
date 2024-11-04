package defpackage;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dnd implements dnc {
    private final /* synthetic */ int a;

    public dnd(int i) {
        this.a = i;
    }

    @Override // defpackage.dnc
    public final Class a() {
        if (this.a != 0) {
            return ParcelFileDescriptor.class;
        }
        return InputStream.class;
    }

    @Override // defpackage.dnc
    public final /* synthetic */ Object b(File file) {
        if (this.a != 0) {
            return ParcelFileDescriptor.open(file, 268435456);
        }
        return new FileInputStream(file);
    }

    @Override // defpackage.dnc
    public final /* synthetic */ void c(Object obj) {
        if (this.a != 0) {
            ((ParcelFileDescriptor) obj).close();
        } else {
            ((InputStream) obj).close();
        }
    }
}

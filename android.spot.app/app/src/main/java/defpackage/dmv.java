package defpackage;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dmv implements dje {
    private final String a;
    private Object b;

    public dmv(String str) {
        this.a = str;
    }

    @Override // defpackage.dje
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.dje
    public final void d() {
        try {
            ((InputStream) this.b).close();
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.dje
    public final void f(dgs dgsVar, djd djdVar) {
        try {
            String str = this.a;
            if (str.startsWith("data:image")) {
                int indexOf = str.indexOf(44);
                if (indexOf != -1) {
                    if (str.substring(0, indexOf).endsWith(";base64")) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        this.b = byteArrayInputStream;
                        djdVar.b(byteArrayInputStream);
                        return;
                    }
                    throw new IllegalArgumentException("Not a base64 image data URL.");
                }
                throw new IllegalArgumentException("Missing comma in data URL.");
            }
            throw new IllegalArgumentException("Not a valid image data URL.");
        } catch (IllegalArgumentException e) {
            djdVar.e(e);
        }
    }

    @Override // defpackage.dje
    public final int g() {
        return 1;
    }

    @Override // defpackage.dje
    public final void cr() {
    }
}

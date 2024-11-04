package defpackage;

import com.google.android.libraries.glide.fife.module.FifeGlideModule;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dgp {
    dgp() {
    }

    public static void a(dgy dgyVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FifeGlideModule fifeGlideModule = (FifeGlideModule) it.next();
            try {
                dgyVar.i(String.class, InputStream.class, new dob(6));
                dgyVar.i(String.class, ByteBuffer.class, new dob(5));
                dgyVar.g(gaf.class, ByteBuffer.class, new dob(3));
                dgyVar.g(gaf.class, InputStream.class, new dob(4));
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(fifeGlideModule.getClass().getName())), e);
            }
        }
    }
}

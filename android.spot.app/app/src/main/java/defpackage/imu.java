package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class imu implements mko {
    private static final Charset d;
    private static final List e;
    public volatile imt c;
    private final String f;
    public final Object b = new Object();
    public final Map a = new HashMap(10);

    static {
        new imu("");
        d = Charset.forName("UTF-8");
        e = new ArrayList();
    }

    private imu(String str) {
        this.f = str;
    }

    public static long b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes(d));
            return ByteBuffer.wrap(messageDigest.digest()).getLong();
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static synchronized imu d(String str) {
        synchronized (imu.class) {
            for (imu imuVar : e) {
                if (imuVar.f.equals(str)) {
                    return imuVar;
                }
            }
            imu imuVar2 = new imu(str);
            e.add(imuVar2);
            return imuVar2;
        }
    }

    @Override // defpackage.mko, defpackage.mkn
    public final /* synthetic */ Object a() {
        return this.c;
    }

    public final imn c(String str, imp... impVarArr) {
        synchronized (this.b) {
            imn imnVar = (imn) this.a.get(str);
            if (imnVar != null) {
                imnVar.g(impVarArr);
                return imnVar;
            }
            imn imnVar2 = new imn(str, this, impVarArr);
            this.a.put(imnVar2.b, imnVar2);
            return imnVar2;
        }
    }

    public final imq e(String str, imp... impVarArr) {
        synchronized (this.b) {
            imq imqVar = (imq) this.a.get(str);
            if (imqVar != null) {
                imqVar.g(impVarArr);
                return imqVar;
            }
            imq imqVar2 = new imq(str, this, impVarArr);
            this.a.put(imqVar2.b, imqVar2);
            return imqVar2;
        }
    }
}

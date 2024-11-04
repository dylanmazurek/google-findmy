package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmh implements dtt {
    private final /* synthetic */ int a;

    public dmh(int i) {
        this.a = i;
    }

    public static final dmi b() {
        try {
            return new dmi(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.dtt
    public final /* synthetic */ Object a() {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                return new ArrayList();
            }
            return new dle();
        }
        return b();
    }
}

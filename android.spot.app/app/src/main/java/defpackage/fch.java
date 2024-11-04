package defpackage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fch extends fcl {
    public static boolean a;
    private fav b;
    private final fdv d;
    private String e;
    private boolean f;
    private final Object g;

    public fch(fcn fcnVar) {
        super(fcnVar);
        this.f = false;
        this.g = new Object();
        this.d = new fdv();
    }

    private static String c(String str) {
        MessageDigest bn = fma.bn();
        if (bn == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, bn.digest(str.getBytes())));
    }

    private final boolean d(String str) {
        try {
            String c = c(str);
            y("Storing hashed adid.");
            FileOutputStream openFileOutput = f().openFileOutput("gaClientIdData", 0);
            openFileOutput.write(c.getBytes());
            openFileOutput.close();
            this.e = c;
            return true;
        } catch (IOException e) {
            v("Error creating hash file", e);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0202, code lost:            if (r0 == false) goto L137;     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00ed A[Catch: all -> 0x021d, TryCatch #16 {, blocks: (B:3:0x0001, B:5:0x000b, B:8:0x0014, B:10:0x001c, B:11:0x001e, B:21:0x002f, B:68:0x00e7, B:71:0x00ef, B:74:0x0204, B:75:0x00f7, B:76:0x0101, B:89:0x0207, B:134:0x0218, B:135:0x00ed, B:151:0x00d0, B:152:0x00d3, B:156:0x00d5, B:158:0x00d9, B:153:0x00e1, B:159:0x0219, B:78:0x0102, B:115:0x0106, B:117:0x011e, B:121:0x0132, B:122:0x013b, B:124:0x0140, B:128:0x0148, B:119:0x0158, B:92:0x0198, B:94:0x01b1, B:96:0x01b3, B:98:0x01bb, B:100:0x01bd, B:102:0x01c5, B:103:0x01ce, B:107:0x01e1, B:111:0x01ed, B:112:0x01ee, B:113:0x0201, B:80:0x015d, B:85:0x016d, B:86:0x0180, B:90:0x0183, B:91:0x0169, B:105:0x01cf, B:106:0x01e0), top: B:2:0x0001, inners: #12, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00f7 A[Catch: all -> 0x021d, TryCatch #16 {, blocks: (B:3:0x0001, B:5:0x000b, B:8:0x0014, B:10:0x001c, B:11:0x001e, B:21:0x002f, B:68:0x00e7, B:71:0x00ef, B:74:0x0204, B:75:0x00f7, B:76:0x0101, B:89:0x0207, B:134:0x0218, B:135:0x00ed, B:151:0x00d0, B:152:0x00d3, B:156:0x00d5, B:158:0x00d9, B:153:0x00e1, B:159:0x0219, B:78:0x0102, B:115:0x0106, B:117:0x011e, B:121:0x0132, B:122:0x013b, B:124:0x0140, B:128:0x0148, B:119:0x0158, B:92:0x0198, B:94:0x01b1, B:96:0x01b3, B:98:0x01bb, B:100:0x01bd, B:102:0x01c5, B:103:0x01ce, B:107:0x01e1, B:111:0x01ed, B:112:0x01ee, B:113:0x0201, B:80:0x015d, B:85:0x016d, B:86:0x0180, B:90:0x0183, B:91:0x0169, B:105:0x01cf, B:106:0x01e0), top: B:2:0x0001, inners: #12, #15 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized defpackage.fav b() {
        /*
            Method dump skipped, instructions count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fch.b():fav");
    }

    @Override // defpackage.fcl
    protected final void a() {
    }
}

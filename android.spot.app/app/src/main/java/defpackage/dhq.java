package defpackage;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dhq implements dhm {
    public ByteBuffer a;
    public byte[] b;
    public byte[] c;
    public int[] d;
    public int e;
    public Bitmap g;
    public Boolean h;
    public final elo j;
    private int[] k;
    private short[] m;
    private byte[] n;
    private byte[] o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private final int[] l = new int[256];
    public Bitmap.Config i = Bitmap.Config.ARGB_8888;
    public dho f = new dho();

    public dhq(elo eloVar, dho dhoVar, ByteBuffer byteBuffer, int i) {
        this.j = eloVar;
        c(dhoVar, byteBuffer, i);
    }

    private final int d() {
        return this.a.get() & 255;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dln, java.lang.Object] */
    private final Bitmap e() {
        Bitmap.Config config;
        Boolean bool = this.h;
        if (bool != null && !bool.booleanValue()) {
            config = this.i;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        elo eloVar = this.j;
        Bitmap b = eloVar.b.b(this.t, this.s, config);
        b.setHasAlpha(true);
        return b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:            if (r10.j == r5.h) goto L59;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x047e A[Catch: all -> 0x04bc, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0010, B:13:0x001a, B:15:0x0023, B:16:0x002b, B:18:0x003d, B:19:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0055, B:28:0x0059, B:30:0x005d, B:32:0x0070, B:34:0x0074, B:35:0x007a, B:37:0x007e, B:39:0x0082, B:40:0x0087, B:43:0x008f, B:45:0x0093, B:47:0x0097, B:49:0x009c, B:52:0x00a2, B:54:0x00a6, B:56:0x00ae, B:58:0x00b5, B:59:0x00cb, B:61:0x00cf, B:63:0x00d4, B:65:0x00d9, B:69:0x00df, B:71:0x00e3, B:73:0x00f8, B:75:0x0101, B:76:0x0110, B:78:0x0114, B:80:0x011f, B:82:0x0127, B:83:0x012b, B:85:0x0131, B:86:0x0135, B:88:0x013b, B:89:0x0141, B:91:0x0155, B:93:0x015e, B:97:0x017c, B:143:0x01a1, B:102:0x01ad, B:104:0x01cf, B:108:0x01f5, B:110:0x01fe, B:115:0x020d, B:118:0x0217, B:120:0x0220, B:122:0x022c, B:126:0x023d, B:129:0x024a, B:296:0x0189, B:144:0x0266, B:146:0x0272, B:149:0x0279, B:151:0x028f, B:155:0x02a8, B:157:0x02b0, B:159:0x02b4, B:161:0x02b8, B:166:0x02c1, B:169:0x02c9, B:171:0x02cd, B:175:0x02e1, B:176:0x047a, B:178:0x047e, B:182:0x0485, B:184:0x0489, B:185:0x048f, B:186:0x04a2, B:189:0x02d6, B:196:0x02e9, B:198:0x030e, B:201:0x0316, B:208:0x033a, B:209:0x0341, B:211:0x0344, B:217:0x035d, B:219:0x0366, B:221:0x0374, B:224:0x036d, B:231:0x0456, B:232:0x0385, B:234:0x038d, B:235:0x039f, B:237:0x03a5, B:240:0x03ae, B:242:0x03b9, B:244:0x03d5, B:248:0x03de, B:249:0x03e3, B:251:0x03e8, B:254:0x03ef, B:256:0x03fa, B:258:0x040f, B:265:0x042c, B:267:0x043a, B:270:0x0433, B:274:0x0418, B:290:0x0466, B:294:0x0474, B:295:0x0470, B:299:0x0117, B:300:0x010a, B:304:0x000e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0489 A[Catch: all -> 0x04bc, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0010, B:13:0x001a, B:15:0x0023, B:16:0x002b, B:18:0x003d, B:19:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0055, B:28:0x0059, B:30:0x005d, B:32:0x0070, B:34:0x0074, B:35:0x007a, B:37:0x007e, B:39:0x0082, B:40:0x0087, B:43:0x008f, B:45:0x0093, B:47:0x0097, B:49:0x009c, B:52:0x00a2, B:54:0x00a6, B:56:0x00ae, B:58:0x00b5, B:59:0x00cb, B:61:0x00cf, B:63:0x00d4, B:65:0x00d9, B:69:0x00df, B:71:0x00e3, B:73:0x00f8, B:75:0x0101, B:76:0x0110, B:78:0x0114, B:80:0x011f, B:82:0x0127, B:83:0x012b, B:85:0x0131, B:86:0x0135, B:88:0x013b, B:89:0x0141, B:91:0x0155, B:93:0x015e, B:97:0x017c, B:143:0x01a1, B:102:0x01ad, B:104:0x01cf, B:108:0x01f5, B:110:0x01fe, B:115:0x020d, B:118:0x0217, B:120:0x0220, B:122:0x022c, B:126:0x023d, B:129:0x024a, B:296:0x0189, B:144:0x0266, B:146:0x0272, B:149:0x0279, B:151:0x028f, B:155:0x02a8, B:157:0x02b0, B:159:0x02b4, B:161:0x02b8, B:166:0x02c1, B:169:0x02c9, B:171:0x02cd, B:175:0x02e1, B:176:0x047a, B:178:0x047e, B:182:0x0485, B:184:0x0489, B:185:0x048f, B:186:0x04a2, B:189:0x02d6, B:196:0x02e9, B:198:0x030e, B:201:0x0316, B:208:0x033a, B:209:0x0341, B:211:0x0344, B:217:0x035d, B:219:0x0366, B:221:0x0374, B:224:0x036d, B:231:0x0456, B:232:0x0385, B:234:0x038d, B:235:0x039f, B:237:0x03a5, B:240:0x03ae, B:242:0x03b9, B:244:0x03d5, B:248:0x03de, B:249:0x03e3, B:251:0x03e8, B:254:0x03ef, B:256:0x03fa, B:258:0x040f, B:265:0x042c, B:267:0x043a, B:270:0x0433, B:274:0x0418, B:290:0x0466, B:294:0x0474, B:295:0x0470, B:299:0x0117, B:300:0x010a, B:304:0x000e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00cf A[Catch: all -> 0x04bc, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:8:0x0010, B:13:0x001a, B:15:0x0023, B:16:0x002b, B:18:0x003d, B:19:0x0049, B:21:0x004d, B:22:0x0051, B:24:0x0055, B:28:0x0059, B:30:0x005d, B:32:0x0070, B:34:0x0074, B:35:0x007a, B:37:0x007e, B:39:0x0082, B:40:0x0087, B:43:0x008f, B:45:0x0093, B:47:0x0097, B:49:0x009c, B:52:0x00a2, B:54:0x00a6, B:56:0x00ae, B:58:0x00b5, B:59:0x00cb, B:61:0x00cf, B:63:0x00d4, B:65:0x00d9, B:69:0x00df, B:71:0x00e3, B:73:0x00f8, B:75:0x0101, B:76:0x0110, B:78:0x0114, B:80:0x011f, B:82:0x0127, B:83:0x012b, B:85:0x0131, B:86:0x0135, B:88:0x013b, B:89:0x0141, B:91:0x0155, B:93:0x015e, B:97:0x017c, B:143:0x01a1, B:102:0x01ad, B:104:0x01cf, B:108:0x01f5, B:110:0x01fe, B:115:0x020d, B:118:0x0217, B:120:0x0220, B:122:0x022c, B:126:0x023d, B:129:0x024a, B:296:0x0189, B:144:0x0266, B:146:0x0272, B:149:0x0279, B:151:0x028f, B:155:0x02a8, B:157:0x02b0, B:159:0x02b4, B:161:0x02b8, B:166:0x02c1, B:169:0x02c9, B:171:0x02cd, B:175:0x02e1, B:176:0x047a, B:178:0x047e, B:182:0x0485, B:184:0x0489, B:185:0x048f, B:186:0x04a2, B:189:0x02d6, B:196:0x02e9, B:198:0x030e, B:201:0x0316, B:208:0x033a, B:209:0x0341, B:211:0x0344, B:217:0x035d, B:219:0x0366, B:221:0x0374, B:224:0x036d, B:231:0x0456, B:232:0x0385, B:234:0x038d, B:235:0x039f, B:237:0x03a5, B:240:0x03ae, B:242:0x03b9, B:244:0x03d5, B:248:0x03de, B:249:0x03e3, B:251:0x03e8, B:254:0x03ef, B:256:0x03fa, B:258:0x040f, B:265:0x042c, B:267:0x043a, B:270:0x0433, B:274:0x0418, B:290:0x0466, B:294:0x0474, B:295:0x0470, B:299:0x0117, B:300:0x010a, B:304:0x000e), top: B:3:0x0003 }] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v46, types: [short] */
    /* JADX WARN: Type inference failed for: r0v48 */
    @Override // defpackage.dhm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.graphics.Bitmap a() {
        /*
            Method dump skipped, instructions count: 1215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhq.a():android.graphics.Bitmap");
    }

    @Override // defpackage.dhm
    public final void b() {
        this.e = (this.e + 1) % this.f.c;
    }

    public final synchronized void c(dho dhoVar, ByteBuffer byteBuffer, int i) {
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            this.q = 0;
            this.f = dhoVar;
            this.e = -1;
            ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
            this.a = asReadOnlyBuffer;
            asReadOnlyBuffer.position(0);
            this.a.order(ByteOrder.LITTLE_ENDIAN);
            this.p = false;
            Iterator it = dhoVar.e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((dhn) it.next()).g == 3) {
                    this.p = true;
                    break;
                }
            }
            this.r = highestOneBit;
            int i2 = dhoVar.f;
            this.t = i2 / highestOneBit;
            int i3 = dhoVar.g;
            this.s = i3 / highestOneBit;
            this.c = this.j.p(i2 * i3);
            elo eloVar = this.j;
            this.d = (int[]) ((dlu) eloVar.a).a(this.t * this.s, int[].class);
        } else {
            throw new IllegalArgumentException(a.ae(i, "Sample size must be >=0, not: "));
        }
    }
}

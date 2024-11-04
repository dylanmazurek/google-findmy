package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import java.text.BreakIterator;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bkd implements bga {
    public final bgm a;
    public final bke b;
    public final CharSequence c;
    public final bgz d;
    public final int e;
    public bso f;
    public final dkr g;
    private final String h;
    private final List i;
    private final List j;
    private final ble k;
    private final boolean l;

    /* JADX WARN: Code restructure failed: missing block: B:332:0x0090, code lost:            if (r6 == 1) goto L10;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0675  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0250 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a0  */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16, types: [android.text.Spannable] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bkd(java.lang.String r36, defpackage.bgm r37, java.util.List r38, java.util.List r39, defpackage.dkr r40, defpackage.ble r41) {
        /*
            Method dump skipped, instructions count: 1825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkd.<init>(java.lang.String, bgm, java.util.List, java.util.List, dkr, ble):void");
    }

    @Override // defpackage.bga
    public final float a() {
        return this.d.a();
    }

    @Override // defpackage.bga
    public final float b() {
        bgz bgzVar = this.d;
        if (!Float.isNaN(bgzVar.c)) {
            return bgzVar.c;
        }
        CharSequence charSequence = bgzVar.a;
        TextPaint textPaint = bgzVar.b;
        BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
        lineInstance.setText(new bgw(charSequence, charSequence.length()));
        PriorityQueue<mkw> priorityQueue = new PriorityQueue(10, new bfr(2));
        int i = 0;
        for (int next = lineInstance.next(); next != -1; next = lineInstance.next()) {
            if (priorityQueue.size() < 10) {
                priorityQueue.add(new mkw(Integer.valueOf(i), Integer.valueOf(next)));
            } else {
                mkw mkwVar = (mkw) priorityQueue.peek();
                if (mkwVar != null && ((Number) mkwVar.b).intValue() - ((Number) mkwVar.a).intValue() < next - i) {
                    priorityQueue.poll();
                    priorityQueue.add(new mkw(Integer.valueOf(i), Integer.valueOf(next)));
                }
            }
            i = next;
        }
        float f = 0.0f;
        for (mkw mkwVar2 : priorityQueue) {
            f = Math.max(f, Layout.getDesiredWidth(charSequence, ((Number) mkwVar2.a).intValue(), ((Number) mkwVar2.b).intValue(), textPaint));
        }
        bgzVar.c = f;
        return f;
    }

    @Override // defpackage.bga
    public final boolean c() {
        bso bsoVar = this.f;
        if (bsoVar != null && bsoVar.d()) {
            return true;
        }
        if (!rl.c(this.a)) {
            return false;
        }
        int i = bkh.a;
        ((Boolean) bkh.a().a()).booleanValue();
        return false;
    }
}

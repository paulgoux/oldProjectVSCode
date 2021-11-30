import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import com.sun.activation.registries.*; 
import com.sun.activation.viewers.*; 
import javax.activation.*; 
import org.apache.commons.codec.binary.*; 
import org.apache.commons.codec.*; 
import org.apache.commons.codec.digest.*; 
import org.apache.commons.codec.language.bm.*; 
import org.apache.commons.codec.language.*; 
import org.apache.commons.codec.net.*; 
import org.apache.commons.codec.cli.*; 
import org.apache.commons.collections4.bag.*; 
import org.apache.commons.collections4.bidimap.*; 
import org.apache.commons.collections4.collection.*; 
import org.apache.commons.collections4.*; 
import org.apache.commons.collections4.functors.*; 
import org.apache.commons.collections4.iterators.*; 
import org.apache.commons.collections4.list.*; 
import org.apache.commons.collections4.map.*; 
import org.apache.commons.collections4.multimap.*; 
import org.apache.commons.collections4.multiset.*; 
import org.apache.commons.collections4.queue.*; 
import org.apache.commons.collections4.sequence.*; 
import org.apache.commons.collections4.set.*; 
import org.apache.commons.collections4.trie.*; 
import org.apache.commons.collections4.comparators.*; 
import org.apache.commons.collections4.keyvalue.*; 
import org.apache.commons.collections4.properties.*; 
import org.apache.commons.collections4.splitmap.*; 
import org.apache.commons.collections4.trie.analyzer.*; 
import org.apache.commons.compress.parallel.*; 
import org.apache.commons.compress.utils.*; 
import org.apache.commons.compress.changes.*; 
import org.apache.commons.compress.archivers.dump.*; 
import org.apache.commons.compress.archivers.examples.*; 
import org.apache.commons.compress.archivers.zip.*; 
import org.apache.commons.compress.archivers.sevenz.*; 
import org.apache.commons.compress.archivers.cpio.*; 
import org.apache.commons.compress.archivers.*; 
import org.apache.commons.compress.archivers.tar.*; 
import org.apache.commons.compress.archivers.ar.*; 
import org.apache.commons.compress.compressors.*; 
import org.apache.commons.compress.compressors.lz4.*; 
import org.apache.commons.compress.compressors.xz.*; 
import org.apache.commons.compress.compressors.gzip.*; 
import org.apache.commons.compress.compressors.brotli.*; 
import org.apache.commons.compress.compressors.bzip2.*; 
import org.apache.commons.compress.compressors.lzma.*; 
import org.apache.commons.compress.compressors.lz77support.*; 
import org.apache.commons.compress.compressors.pack200.*; 
import org.apache.commons.compress.compressors.deflate64.*; 
import org.apache.commons.compress.compressors.snappy.*; 
import org.apache.commons.compress.compressors.deflate.*; 
import org.apache.commons.compress.compressors.zstandard.*; 
import org.apache.commons.compress.*; 
import org.apache.commons.compress.archivers.jar.*; 
import org.apache.commons.compress.compressors.lzw.*; 
import org.apache.commons.compress.archivers.arj.*; 
import org.apache.commons.compress.compressors.z.*; 
import org.apache.commons.logging.impl.*; 
import org.apache.commons.logging.*; 
import org.apache.commons.math3.ml.neuralnet.*; 
import org.apache.commons.math3.ml.neuralnet.twod.*; 
import org.apache.commons.math3.ml.neuralnet.twod.util.*; 
import org.apache.commons.math3.ml.neuralnet.oned.*; 
import org.apache.commons.math3.ml.neuralnet.sofm.*; 
import org.apache.commons.math3.ml.neuralnet.sofm.util.*; 
import org.apache.commons.math3.ml.clustering.*; 
import org.apache.commons.math3.ml.clustering.evaluation.*; 
import org.apache.commons.math3.ml.distance.*; 
import org.apache.commons.math3.analysis.*; 
import org.apache.commons.math3.analysis.differentiation.*; 
import org.apache.commons.math3.analysis.integration.*; 
import org.apache.commons.math3.analysis.integration.gauss.*; 
import org.apache.commons.math3.analysis.function.*; 
import org.apache.commons.math3.analysis.polynomials.*; 
import org.apache.commons.math3.analysis.solvers.*; 
import org.apache.commons.math3.analysis.interpolation.*; 
import org.apache.commons.math3.stat.interval.*; 
import org.apache.commons.math3.stat.ranking.*; 
import org.apache.commons.math3.stat.clustering.*; 
import org.apache.commons.math3.stat.*; 
import org.apache.commons.math3.stat.inference.*; 
import org.apache.commons.math3.stat.correlation.*; 
import org.apache.commons.math3.stat.descriptive.*; 
import org.apache.commons.math3.stat.descriptive.rank.*; 
import org.apache.commons.math3.stat.descriptive.summary.*; 
import org.apache.commons.math3.stat.descriptive.moment.*; 
import org.apache.commons.math3.stat.regression.*; 
import org.apache.commons.math3.linear.*; 
import org.apache.commons.math3.*; 
import org.apache.commons.math3.distribution.*; 
import org.apache.commons.math3.distribution.fitting.*; 
import org.apache.commons.math3.complex.*; 
import org.apache.commons.math3.ode.*; 
import org.apache.commons.math3.ode.nonstiff.*; 
import org.apache.commons.math3.ode.events.*; 
import org.apache.commons.math3.ode.sampling.*; 
import org.apache.commons.math3.random.*; 
import org.apache.commons.math3.primes.*; 
import org.apache.commons.math3.optim.*; 
import org.apache.commons.math3.optim.linear.*; 
import org.apache.commons.math3.optim.nonlinear.vector.*; 
import org.apache.commons.math3.optim.nonlinear.vector.jacobian.*; 
import org.apache.commons.math3.optim.nonlinear.scalar.*; 
import org.apache.commons.math3.optim.nonlinear.scalar.gradient.*; 
import org.apache.commons.math3.optim.nonlinear.scalar.noderiv.*; 
import org.apache.commons.math3.optim.univariate.*; 
import org.apache.commons.math3.exception.*; 
import org.apache.commons.math3.exception.util.*; 
import org.apache.commons.math3.fitting.leastsquares.*; 
import org.apache.commons.math3.fitting.*; 
import org.apache.commons.math3.dfp.*; 
import org.apache.commons.math3.fraction.*; 
import org.apache.commons.math3.special.*; 
import org.apache.commons.math3.geometry.*; 
import org.apache.commons.math3.geometry.hull.*; 
import org.apache.commons.math3.geometry.enclosing.*; 
import org.apache.commons.math3.geometry.spherical.twod.*; 
import org.apache.commons.math3.geometry.spherical.oned.*; 
import org.apache.commons.math3.geometry.euclidean.threed.*; 
import org.apache.commons.math3.geometry.euclidean.twod.*; 
import org.apache.commons.math3.geometry.euclidean.twod.hull.*; 
import org.apache.commons.math3.geometry.euclidean.oned.*; 
import org.apache.commons.math3.geometry.partitioning.*; 
import org.apache.commons.math3.geometry.partitioning.utilities.*; 
import org.apache.commons.math3.optimization.*; 
import org.apache.commons.math3.optimization.linear.*; 
import org.apache.commons.math3.optimization.direct.*; 
import org.apache.commons.math3.optimization.fitting.*; 
import org.apache.commons.math3.optimization.univariate.*; 
import org.apache.commons.math3.optimization.general.*; 
import org.apache.commons.math3.util.*; 
import org.apache.commons.math3.genetics.*; 
import org.apache.commons.math3.transform.*; 
import org.apache.commons.math3.filter.*; 
import javax.xml.bind.*; 
import javax.xml.bind.util.*; 
import javax.xml.bind.annotation.*; 
import javax.xml.bind.attachment.*; 
import javax.xml.bind.annotation.adapters.*; 
import javax.xml.bind.helpers.*; 
import com.sun.xml.txw2.*; 
import com.sun.xml.txw2.output.*; 
import com.sun.xml.txw2.annotation.*; 
import com.sun.xml.bind.*; 
import com.sun.xml.bind.unmarshaller.*; 
import com.sun.xml.bind.api.impl.*; 
import com.sun.xml.bind.api.*; 
import com.sun.xml.bind.marshaller.*; 
import com.sun.xml.bind.v2.runtime.unmarshaller.*; 
import com.sun.xml.bind.v2.runtime.*; 
import com.sun.xml.bind.v2.*; 
import com.sun.xml.bind.v2.model.core.*; 
import com.sun.xml.bind.v2.model.nav.*; 
import com.sun.xml.bind.v2.model.impl.*; 
import com.sun.xml.bind.v2.model.annotation.*; 
import com.sun.xml.bind.v2.schemagen.episode.*; 
import com.sun.xml.bind.v2.util.*; 
import com.sun.xml.bind.util.*; 
import com.sun.xml.bind.annotation.*; 
import com.sun.istack.*; 
import com.sun.istack.localization.*; 
import com.sun.istack.logging.*; 
import com.sun.xml.bind.v2.model.util.*; 
import com.sun.xml.bind.v2.model.runtime.*; 
import com.sun.xml.bind.v2.runtime.property.*; 
import com.sun.xml.bind.v2.runtime.reflect.opt.*; 
import com.sun.xml.bind.v2.runtime.reflect.*; 
import com.sun.xml.bind.v2.runtime.output.*; 
import com.sun.xml.bind.v2.schemagen.xmlschema.*; 
import com.sun.xml.bind.v2.schemagen.*; 
import com.sun.xml.bind.v2.bytecode.*; 
import org.junit.*; 
import org.junit.rules.*; 
import org.junit.runners.*; 
import org.junit.runners.parameterized.*; 
import org.junit.runners.model.*; 
import org.junit.matchers.*; 
import org.junit.runner.*; 
import org.junit.runner.manipulation.*; 
import org.junit.runner.notification.*; 
import org.junit.validator.*; 
import org.junit.internal.*; 
import org.junit.internal.matchers.*; 
import org.junit.internal.runners.*; 
import org.junit.internal.runners.rules.*; 
import org.junit.internal.runners.statements.*; 
import org.junit.internal.runners.model.*; 
import org.junit.internal.requests.*; 
import org.junit.internal.builders.*; 
import org.junit.experimental.results.*; 
import org.junit.experimental.*; 
import org.junit.experimental.max.*; 
import org.junit.experimental.theories.*; 
import org.junit.experimental.theories.suppliers.*; 
import org.junit.experimental.theories.internal.*; 
import org.junit.experimental.categories.*; 
import org.junit.experimental.runners.*; 
import junit.framework.*; 
import junit.runner.*; 
import junit.extensions.*; 
import junit.textui.*; 
import ketai.camera.*; 
import ketai.cv.facedetector.*; 
import ketai.data.*; 
import ketai.net.*; 
import ketai.net.bluetooth.*; 
import ketai.net.nfc.*; 
import ketai.net.nfc.record.*; 
import ketai.net.wifidirect.*; 
import ketai.sensors.*; 
import ketai.ui.*; 
import org.apache.log4j.*; 
import org.apache.log4j.chainsaw.*; 
import org.apache.log4j.config.*; 
import org.apache.log4j.helpers.*; 
import org.apache.log4j.jdbc.*; 
import org.apache.log4j.jmx.*; 
import org.apache.log4j.lf5.*; 
import org.apache.log4j.lf5.util.*; 
import org.apache.log4j.lf5.viewer.*; 
import org.apache.log4j.lf5.viewer.categoryexplorer.*; 
import org.apache.log4j.lf5.viewer.configure.*; 
import org.apache.log4j.net.*; 
import org.apache.log4j.nt.*; 
import org.apache.log4j.or.*; 
import org.apache.log4j.or.jms.*; 
import org.apache.log4j.or.sax.*; 
import org.apache.log4j.pattern.*; 
import org.apache.log4j.rewrite.*; 
import org.apache.log4j.spi.*; 
import org.apache.log4j.varia.*; 
import org.apache.log4j.xml.*; 
import org.apache.poi.*; 
import org.apache.poi.common.*; 
import org.apache.poi.common.usermodel.*; 
import org.apache.poi.common.usermodel.fonts.*; 
import org.apache.poi.ddf.*; 
import org.apache.poi.extractor.*; 
import org.apache.poi.hpsf.*; 
import org.apache.poi.hpsf.extractor.*; 
import org.apache.poi.hpsf.wellknown.*; 
import org.apache.poi.hssf.*; 
import org.apache.poi.hssf.dev.*; 
import org.apache.poi.hssf.eventmodel.*; 
import org.apache.poi.hssf.eventusermodel.*; 
import org.apache.poi.hssf.eventusermodel.dummyrecord.*; 
import org.apache.poi.hssf.extractor.*; 
import org.apache.poi.hssf.model.*; 
import org.apache.poi.hssf.record.*; 
import org.apache.poi.hssf.record.aggregates.*; 
import org.apache.poi.hssf.record.cf.*; 
import org.apache.poi.hssf.record.chart.*; 
import org.apache.poi.hssf.record.common.*; 
import org.apache.poi.hssf.record.cont.*; 
import org.apache.poi.hssf.record.crypto.*; 
import org.apache.poi.hssf.record.pivottable.*; 
import org.apache.poi.hssf.usermodel.*; 
import org.apache.poi.hssf.usermodel.helpers.*; 
import org.apache.poi.hssf.util.*; 
import org.apache.poi.poifs.common.*; 
import org.apache.poi.poifs.crypt.*; 
import org.apache.poi.poifs.crypt.binaryrc4.*; 
import org.apache.poi.poifs.crypt.cryptoapi.*; 
import org.apache.poi.poifs.crypt.standard.*; 
import org.apache.poi.poifs.crypt.xor.*; 
import org.apache.poi.poifs.dev.*; 
import org.apache.poi.poifs.eventfilesystem.*; 
import org.apache.poi.poifs.filesystem.*; 
import org.apache.poi.poifs.macros.*; 
import org.apache.poi.poifs.nio.*; 
import org.apache.poi.poifs.*; 
import org.apache.poi.poifs.property.*; 
import org.apache.poi.poifs.storage.*; 
import org.apache.poi.sl.draw.*; 
import org.apache.poi.sl.draw.binding.*; 
import org.apache.poi.sl.draw.geom.*; 
import org.apache.poi.sl.extractor.*; 
import org.apache.poi.sl.image.*; 
import org.apache.poi.sl.usermodel.*; 
import org.apache.poi.ss.*; 
import org.apache.poi.ss.extractor.*; 
import org.apache.poi.ss.format.*; 
import org.apache.poi.ss.formula.*; 
import org.apache.poi.ss.formula.atp.*; 
import org.apache.poi.ss.formula.constant.*; 
import org.apache.poi.ss.formula.eval.*; 
import org.apache.poi.ss.formula.eval.forked.*; 
import org.apache.poi.ss.formula.function.*; 
import org.apache.poi.ss.formula.functions.*; 
import org.apache.poi.ss.formula.ptg.*; 
import org.apache.poi.ss.formula.udf.*; 
import org.apache.poi.ss.usermodel.*; 
import org.apache.poi.ss.usermodel.charts.*; 
import org.apache.poi.ss.usermodel.helpers.*; 
import org.apache.poi.ss.util.*; 
import org.apache.poi.ss.util.cellwalk.*; 
import org.apache.poi.util.*; 
import org.apache.poi.wp.usermodel.*; 
import org.apache.poi.crypt.examples.*; 
import org.apache.poi.examples.util.*; 
import org.apache.poi.hpsf.examples.*; 
import org.apache.poi.hslf.examples.*; 
import org.apache.poi.hsmf.examples.*; 
import org.apache.poi.hssf.eventusermodel.examples.*; 
import org.apache.poi.hssf.usermodel.examples.*; 
import org.apache.poi.hwpf.*; 
import org.apache.poi.ss.examples.*; 
import org.apache.poi.ss.examples.formula.*; 
import org.apache.poi.ss.examples.html.*; 
import org.apache.poi.xslf.usermodel.*; 
import org.apache.poi.xslf.usermodel.tutorial.*; 
import org.apache.poi.xssf.eventusermodel.*; 
import org.apache.poi.xssf.eventusermodel.examples.*; 
import org.apache.poi.xssf.streaming.examples.*; 
import org.apache.poi.xssf.usermodel.examples.*; 
import org.apache.poi.xwpf.usermodel.examples.*; 
import org.apache.poi.ss.excelant.*; 
import org.apache.poi.ss.excelant.util.*; 
import org.apache.poi.ooxml.*; 
import org.apache.poi.ooxml.dev.*; 
import org.apache.poi.ooxml.extractor.*; 
import org.apache.poi.ooxml.util.*; 
import org.apache.poi.openxml4j.exceptions.*; 
import org.apache.poi.openxml4j.opc.*; 
import org.apache.poi.openxml4j.opc.internal.*; 
import org.apache.poi.openxml4j.opc.internal.marshallers.*; 
import org.apache.poi.openxml4j.opc.internal.unmarshallers.*; 
import org.apache.poi.openxml4j.util.*; 
import org.apache.poi.poifs.crypt.agile.*; 
import org.apache.poi.poifs.crypt.dsig.*; 
import org.apache.poi.poifs.crypt.dsig.facets.*; 
import org.apache.poi.poifs.crypt.dsig.services.*; 
import org.apache.poi.poifs.crypt.temp.*; 
import org.apache.poi.xddf.usermodel.*; 
import org.apache.poi.xddf.usermodel.chart.*; 
import org.apache.poi.xddf.usermodel.text.*; 
import org.apache.poi.xdgf.exceptions.*; 
import org.apache.poi.xdgf.extractor.*; 
import org.apache.poi.xdgf.geom.*; 
import org.apache.poi.xdgf.usermodel.*; 
import org.apache.poi.xdgf.usermodel.section.*; 
import org.apache.poi.xdgf.usermodel.section.geometry.*; 
import org.apache.poi.xdgf.usermodel.shape.*; 
import org.apache.poi.xdgf.usermodel.shape.exceptions.*; 
import org.apache.poi.xdgf.util.*; 
import org.apache.poi.xdgf.xml.*; 
import org.apache.poi.xslf.draw.*; 
import org.apache.poi.xslf.extractor.*; 
import org.apache.poi.xslf.model.*; 
import org.apache.poi.xslf.util.*; 
import org.apache.poi.xssf.*; 
import org.apache.poi.xssf.binary.*; 
import org.apache.poi.xssf.extractor.*; 
import org.apache.poi.xssf.model.*; 
import org.apache.poi.xssf.streaming.*; 
import org.apache.poi.xssf.usermodel.*; 
import org.apache.poi.xssf.usermodel.charts.*; 
import org.apache.poi.xssf.usermodel.extensions.*; 
import org.apache.poi.xssf.usermodel.helpers.*; 
import org.apache.poi.xssf.util.*; 
import org.apache.poi.xwpf.extractor.*; 
import org.apache.poi.xwpf.model.*; 
import org.apache.poi.xwpf.*; 
import org.apache.poi.xwpf.usermodel.*; 
import com.microsoft.schemas.compatibility.*; 
import com.microsoft.schemas.compatibility.impl.*; 
import com.microsoft.schemas.office.excel.*; 
import com.microsoft.schemas.office.excel.impl.*; 
import com.microsoft.schemas.office.office.*; 
import com.microsoft.schemas.office.office.impl.*; 
import com.microsoft.schemas.office.visio.x2012.main.*; 
import com.microsoft.schemas.office.visio.x2012.main.impl.*; 
import com.microsoft.schemas.office.x2006.digsig.*; 
import com.microsoft.schemas.office.x2006.digsig.impl.*; 
import com.microsoft.schemas.office.x2006.encryption.*; 
import com.microsoft.schemas.office.x2006.encryption.impl.*; 
import com.microsoft.schemas.office.x2006.keyEncryptor.certificate.*; 
import com.microsoft.schemas.office.x2006.keyEncryptor.certificate.impl.*; 
import com.microsoft.schemas.office.x2006.keyEncryptor.password.*; 
import com.microsoft.schemas.office.x2006.keyEncryptor.password.impl.*; 
import com.microsoft.schemas.vml.*; 
import com.microsoft.schemas.vml.impl.*; 
import org.etsi.uri.x01903.v13.*; 
import org.etsi.uri.x01903.v13.impl.*; 
import org.openxmlformats.schemas.drawingml.x2006.chart.*; 
import org.openxmlformats.schemas.drawingml.x2006.chart.impl.*; 
import org.openxmlformats.schemas.drawingml.x2006.main.*; 
import org.openxmlformats.schemas.drawingml.x2006.main.impl.*; 
import org.openxmlformats.schemas.drawingml.x2006.picture.*; 
import org.openxmlformats.schemas.drawingml.x2006.picture.impl.*; 
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.*; 
import org.openxmlformats.schemas.drawingml.x2006.spreadsheetDrawing.impl.*; 
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.*; 
import org.openxmlformats.schemas.drawingml.x2006.wordprocessingDrawing.impl.*; 
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.*; 
import org.openxmlformats.schemas.officeDocument.x2006.customProperties.impl.*; 
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.*; 
import org.openxmlformats.schemas.officeDocument.x2006.docPropsVTypes.impl.*; 
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.*; 
import org.openxmlformats.schemas.officeDocument.x2006.extendedProperties.impl.*; 
import org.openxmlformats.schemas.officeDocument.x2006.relationships.*; 
import org.openxmlformats.schemas.officeDocument.x2006.relationships.impl.*; 
import org.openxmlformats.schemas.presentationml.x2006.main.*; 
import org.openxmlformats.schemas.presentationml.x2006.main.impl.*; 
import org.openxmlformats.schemas.spreadsheetml.x2006.main.*; 
import org.openxmlformats.schemas.spreadsheetml.x2006.main.impl.*; 
import org.openxmlformats.schemas.wordprocessingml.x2006.main.*; 
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.*; 
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.*; 
import org.openxmlformats.schemas.xpackage.x2006.digitalSignature.impl.*; 
import org.w3.x2000.x09.xmldsig.*; 
import org.w3.x2000.x09.xmldsig.impl.*; 
import schemaorg_apache_xmlbeans.system.s8C3F193EE11A2F798ACF65489B9E6078.*; 
import schemaorg_apache_xmlbeans.system.sD023D6490046BA0250A839A9AD24C443.*; 
import org.apache.poi.extractor.ole2.*; 
import org.apache.poi.hdgf.*; 
import org.apache.poi.hdgf.chunks.*; 
import org.apache.poi.hdgf.dev.*; 
import org.apache.poi.hdgf.exceptions.*; 
import org.apache.poi.hdgf.extractor.*; 
import org.apache.poi.hdgf.pointers.*; 
import org.apache.poi.hdgf.streams.*; 
import org.apache.poi.hemf.draw.*; 
import org.apache.poi.hemf.record.emf.*; 
import org.apache.poi.hemf.record.emfplus.*; 
import org.apache.poi.hemf.usermodel.*; 
import org.apache.poi.hmef.*; 
import org.apache.poi.hmef.attribute.*; 
import org.apache.poi.hmef.dev.*; 
import org.apache.poi.hmef.extractor.*; 
import org.apache.poi.hpbf.*; 
import org.apache.poi.hpbf.dev.*; 
import org.apache.poi.hpbf.extractor.*; 
import org.apache.poi.hpbf.model.*; 
import org.apache.poi.hpbf.model.qcbits.*; 
import org.apache.poi.hslf.blip.*; 
import org.apache.poi.hslf.dev.*; 
import org.apache.poi.hslf.exceptions.*; 
import org.apache.poi.hslf.extractor.*; 
import org.apache.poi.hslf.model.*; 
import org.apache.poi.hslf.model.textproperties.*; 
import org.apache.poi.hslf.record.*; 
import org.apache.poi.hslf.usermodel.*; 
import org.apache.poi.hslf.util.*; 
import org.apache.poi.hsmf.*; 
import org.apache.poi.hsmf.datatypes.*; 
import org.apache.poi.hsmf.dev.*; 
import org.apache.poi.hsmf.exceptions.*; 
import org.apache.poi.hsmf.extractor.*; 
import org.apache.poi.hsmf.parsers.*; 
import org.apache.poi.hssf.converter.*; 
import org.apache.poi.hwmf.draw.*; 
import org.apache.poi.hwmf.record.*; 
import org.apache.poi.hwmf.usermodel.*; 
import org.apache.poi.hwpf.converter.*; 
import org.apache.poi.hwpf.dev.*; 
import org.apache.poi.hwpf.extractor.*; 
import org.apache.poi.hwpf.model.*; 
import org.apache.poi.hwpf.model.io.*; 
import org.apache.poi.hwpf.model.types.*; 
import org.apache.poi.hwpf.sprm.*; 
import org.apache.poi.hwpf.usermodel.*; 
import com.zaxxer.sparsebits.*; 
import twitter4j.*; 
import twitter4j.auth.*; 
import twitter4j.api.*; 
import twitter4j.util.*; 
import twitter4j.util.function.*; 
import twitter4j.management.*; 
import twitter4j.json.*; 
import twitter4j.conf.*; 
import twitter4j.examples.directmessage.*; 
import twitter4j.examples.*; 
import twitter4j.examples.oauth.*; 
import twitter4j.examples.mute.*; 
import twitter4j.examples.stream.*; 
import twitter4j.examples.async.*; 
import twitter4j.examples.suggestedusers.*; 
import twitter4j.examples.geo.*; 
import twitter4j.examples.favorite.*; 
import twitter4j.examples.user.*; 
import twitter4j.examples.search.*; 
import twitter4j.examples.tweets.*; 
import twitter4j.examples.friendsandfollowers.*; 
import twitter4j.examples.savedsearches.*; 
import twitter4j.examples.json.*; 
import twitter4j.examples.trends.*; 
import twitter4j.examples.list.*; 
import twitter4j.examples.lambda.*; 
import twitter4j.examples.account.*; 
import twitter4j.examples.timeline.*; 
import twitter4j.examples.friendship.*; 
import twitter4j.examples.help.*; 
import twitter4j.examples.block.*; 
import twitter4j.examples.spamreporting.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class sketch_191112a extends PApplet {

public void setup(){

}

public void draw(){
  
}
class Attractor{
  
  int id,type;
  float x,y,w,h,intensity,mass = 200;
  String label;
  boolean drag,resize;
  public boolean toggle,show,move = true,mdown,mup;
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  ArrayList<Attractor> attractors = new ArrayList<Attractor>();
  
  Attractor(float xx, float yy, float Intensity){
    
    x = xx;
    y = yy;
    intensity = Intensity;
  };
  
  Attractor(){
    
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void draw(){
    if(show){
    stroke(0);
    //text(attractors.size(),100,100);
    for(int i=0;i<attractors.size();i++){
      Attractor a = attractors.get(i);
      fill(0);
      strokeWeight(1);
      if(a.intensity>0)fill(255);
      if(move)mouse_move(a);
      int size = 10;  
      if(a.mdown){size = 16;}
      ellipse(a.x,a.y,size,size);
    }}
  };
  
  public void functions(){
    add();
    draw();
  };
  
  public void animate(){
    
  };
  
  public void mouseReleased(){
    //mdown = false;
  };
  
  public void mouse_move(Attractor a){
      if(mousePressed&&!a.pos()){a.mup = true;}
      if(mousePressed&&a.pos()&&!a.mup){a.mdown = true;}
      if(a.mdown){a.x = mouseX;a.y = mouseY;}
      if(a.mdown&&!mousePressed){a.mdown = false;a.mup = false;}
      if(!mousePressed){a.mup = false;}
  };
  
  public void add(){    
    if(toggle&&!open_menus){
    if(mousePressed&& mouseButton == LEFT && !mdown){
      attractors.add(new Attractor(mouseX,mouseY,1));
      mdown = true;
    }
    if(mousePressed&& mouseButton == RIGHT && !mdown){
      attractors.add(new Attractor(mouseX,mouseY,-1));
      mdown = true;
    }
    if(!mousePressed){ mdown = false;}
    }
  };
  
  public boolean pos(){
    float X = mouseX;
    float Y = mouseY;
    return X > x && X < x + 10 && Y > y && Y < y + 10; 
  }
  
};
class BMScontrols{
  
  int Mcount;
  HashMap<Object,String> booleans = new HashMap<Object,String>();
  PApplet applet = null;
  public boolean gridOpen,gridSeeded,autoSave,autoControl,camOpen,textOpen,videoOpen,audioOpen,voronoiOpen,terrain3d,openSimpleNN,gridCleared = true,mdown;
  boolean updated;
  String currentMouseObject;
  Object currentObject;
  Dropdown dropDownObject;
  String[] Lines;
  float seed;
  Button checkbox;
  Dock dock;
  public float autoSaveTimeout = 30;
  ArrayList<Slider> Sliders = new ArrayList<Slider>();
  ArrayList<sliderBox> sliderBoxes = new ArrayList<sliderBox>();
  ArrayList<TextBox> textBoxes = new ArrayList<TextBox>();
  ArrayList<TextArea> textAreas = new ArrayList<TextArea>();
  ArrayList<Button> buttons = new ArrayList<Button>();
  ArrayList<Menu> menus = new ArrayList<Menu>();
  ArrayList<Grid> grids = new ArrayList<Grid>();
  ArrayList<webcam> cams = new ArrayList<webcam>();
  ArrayList<GridImg> gridOfImages = new ArrayList<GridImg>();
  ArrayList<ImgGrid> imagesToGrid = new ArrayList<ImgGrid>();
  ArrayList<tab> tabs = new ArrayList<tab>();
  Boundary bb;
  fileInput File,Folder;
  Img imageProcessing,cam;
  Menu menu;
  
  String[] cameras = Capture.list();
  String[] files;
  
  Capture Cam;
  Dropdown dd;
  
  BMScontrols(PApplet Applet){
    applet = Applet;
    //startCam();
    
  };
  
  public void add(Object o,String globalVar,boolean localVar){
    Field field = null;
    
    booleans.put(o,globalVar);
  
};

public void draw(){
  // fill(255);
  
  // text("hello",100,100);
};

public void begin(){
  File = new fileInput();
  Folder = new fileInput(true);
  setupTwitter();
  setupWindows();
  setupMenus();
  setupRGB();
  setupPlots();
  setupReset();
  setupOthers();
  attractors = new Attractor();
  setupTabs();
  setupDock();
  //setupButtons();
  openTwitter();
  checkbox = new Button(25,25,20,20,"checkbox");
  checkbox.radio = true;
  tabsetup();
  spawnRaces("human",5,40);
  String [] ddLabels = {"hello"};
  //dd = new Dropdown(100,200,90,"Select",ddLabels,0);
  //bb = new Boundary(0,0,W,H);
  setupSigmoid();
  slider_functions();
  imageProcessing = new Img(0);
  cam = new Img(6);
  //audio = new Img(2);
  //Text = new
  //neuralnet = new Network(28,10,10,1);
};

public void setupButtons(){
  //Button b = new Button(100,200,50,20,"terrain");
  //b.togglebox = true;
  //buttons.add(b);
};

public void setupDock(){
  dock = new Dock(0,height -22,width,24);
  //dock = b;
};

public void setupTwitter(){
  
  String [] keywords = { "corona virus","uk" ,"United Kingdom", "China"};
  twitterKeywords = new TwitterKeyword(keywords);
};

public void setupWindows(){
  main = new Window(23,20,W-46,H-90-20);
  main.fill = false;
  main.border = false;
  Boundary b = new Boundary(main.x+1,main.y+1,main.w-2,main.h-2,4);
  //b.cohesionBoundary = true;
  //b.avoidBoundary = true;
  b.state = 1;
  b.visible = false;
  main.Boundaries.add(b);
  
  header = new Window(0,0,W,20);
  windows.add(header);
  
  footer = new Window(0,H-90,W,90);
  windows.add(footer);
  
  header.border = false;
  footer.border = true;
  footer.col = 0;
  
  fmenu = new Window(200,200,200,200,"C:\\Users\\paul goux\\");
};

public void setupMenus(){
  // file----------------------------------------------
  
  
  String [] flabels = {"Open","Save","Grid","Plot 2D","Plot 3D","Attractor","Reset"};
  file = new Menu(0,0,30,20,"File",flabels,0);
  
  menus.add(file);
  

  //----------------------file -----------------------------------
  if(file!=null){
  String []glabels = {"Terrain","Img","Cam","Video","Audio","Text"};
  file.items.get(2).submenu  = new Menu(file.items.get(2).x+file.items.get(2).w,file.items.get(2).y,70,glabels,0);
  file.set_link(2);
  String [] attractor_labels = {"Show/Hide","On/Off"};
  file.items.get(5).submenu = new Menu(file.items.get(5).x+file.items.get(5).w,file.items.get(5).y,100,attractor_labels,0);
  file.set_link(5);
  }
  //-------------------------------------------------------------------
  String [] shapesLabels = {"Line drawing","Connected Lines","Ellipse","Rectangle","Tri","Poligon","C Poligon","Bezier","Spline","none","Arc","Path Straight","Path Corner"};
  shapes = new Menu(file.x + file.w,0,50,20,"Shapes",shapesLabels,0);
  menus.add(shapes);

  //-------------------------------------------------------------------------------------------
  //physics------------------------------------------------------------------------
  String [] physicsLabels = {"Physics","Gravity","Electromagnetism","Strong","Weak"};
  physics = new Menu(shapes.x + shapes.w,0,50,20,"Physics",physicsLabels,0);
  menus.add(physics);
  //Map--------------------------------------------------------------------
  
  String []mapLabels = {"Humans","Plants","Animals","Minerals","Metals"};
  
  mapMenu = new Menu(physics.x+physics.w,0,40,20,"Maps",mapLabels,0);
  menus.add(mapMenu);

  //---------------------------------------------------------------------------
  
  String [] neuralNetworkMenuLabels = {"Open","Close","Simple"};
  //file.horizontal = false;
  neuralNetworkMenu = new Menu(mapMenu.x+mapMenu.w,mapMenu.y,90,20,"Neural Network",neuralNetworkMenuLabels,0);
  menus.add(neuralNetworkMenu);
  String [] twitterMenuLabels = {"Stream","Show Keywords","Add Keyword","Stream To File","Open Saved Stream"};
  //file.horizontal = false;
  twitter = new Menu(neuralNetworkMenu.x+neuralNetworkMenu.w,neuralNetworkMenu.y,60,20,"Twitter",twitterMenuLabels,0);
  menus.add(twitter);
  
  
  // grids---------------------------------------------------------------------------------------------
  
  //images.add(loadImage("leaves.jpg"));
  images.add(loadImage("C:\\Users\\paul goux\\Desktop\\b.jpeg"));
  images.add(loadImage("btfly.jpeg"));
  //gimg = new GridImg(W/2-600,H/2-300,1000,660,images);
  gplain = new Grid(W/2-600,H/2-300,1000,780,70,50,6);
  gplain.visible = true;
  //if(BMS.camOpen)gcam = new Cam(W/2-600,H/2-300,1000,660);
  // if(BMS.gridOpen){
  //   g = new Grid(23,H/2-310,1000,500,50);
    
  //   g.visible = true;
  //   g.entities = true;
  //   g.terrain2d = true;
  //   g.perlheight = true;
  //   g.trackmouse = true;
  //   g.border = false;
  //   g.lim = 4;
  //   g.forward = true;
  //   g.trackmouse = true;
  //   g.elasticity = 0.7;
  //   g.fill = true;
  //   g.hover = true;
  //   g.circle = false;
  //   g.bounce = true;
  //   g.attractor = true;
  // }
  file.set(6,0);

  
  //---------------------Entities-----------------------------------
  
  String[] Entities_sub_Labels = {"Show","Add Human","Add Race","Follow Bound","Pause",
                                  "Debug","Adjust","Separation","Cohesion","Alignment","Sliders",
                                  "Births","Deaths","Load","Save","Reset"};
  
  Entities_sublist = new Menu(W-90,H/2-70,90,Entities_sub_Labels,0);
  Entities_sublist.draggable = true;
  
  Button debug = Entities_sublist.items.get(5);
  
  String [] debuglist = {"Family Ties", "CZone","Target A", "Target B","Heading","Eyes","info","Hide Sliders","QuadP","Field","Limit",};
  
  Entities_sublist.items.get(5).submenu = new Menu(debug.x-80,debug.y,90,debuglist,0);
  Entities_sublist.items.get(5).submenu.parentRight = true;
  Entities_sublist.items.get(5).submenu.draggable = true;
  //Entities_debug.parentRight = true;
  String[] Labelsf = {"Total","FrameRate","B room","Cohesion","Separation","Alignment","Max Force","Max Speed","Wanderm","SceneW", "SceneH","B Cohesion","B Separ.","B room B","Tscale","C Cohesion","C Separ.","C Align","Friction","Min","D Sep"};
  fRate = new sliderBox(90,350,90,5,Labelsf);
  fRate.menu.visible = false;
  fRate.menu.draggable = true;
  /*----------------------------------------------------------------------
  ---img sliders------------------------------------------------------------*/
  
  String [] imgsliderMenu_Labels = {"Conv up","Conv right","Conv  down","Conv left",
                                    "Threshold","conv","mdist","convvp","convvn",
                                    "convhp","convhn"};
                                    
  imgsliderMenu = new Menu(70,400,170,0);
  imgsliderList = new sliderBox(imgsliderMenu.x,imgsliderMenu.y,90,10,imgsliderMenu,imgsliderMenu_Labels);
  
};

public void setupRGB(){
  //rgb_slider = new rgb_Slider(500,200,90,40,15);
  //rgb_slider.display("vertical");
  //rgb_slider.set("color");
  //rgb_slider.set("radio");
};

public void setupPlots(){
  plot = new Plot_2D(main.x,main.y,main.w,main.h,29,30);
  plot.col = color(0,255,0);
  plot.line = true;
};

public void setupReset(){
  reset_dialogue = new Menu(W/2 - 136,H/2 - 22,275,45,"Are you sure you want to exit?");
  reset_dialogue.visible = true;
  reset_dialogue.highlightable = false;
  reset_dialogue.free = true;
  yes = new Button(W/2 - 136 ,H/2 +2,reset_dialogue.w/2,20,"Yes");
  yes.border = false;
  yes.togglebox = true;
  
  no = new Button(yes.x + yes.w,H/2 +2,reset_dialogue.w/2,20,"No");
  no.border = false;
  no.togglebox = true;
  
  reset_dialogue.items.add(yes);
  reset_dialogue.items.add(no);
  yes.parent = reset_dialogue;
  no.parent = reset_dialogue;
};

public void setupOthers(){
   textb1 = new TextArea(200,300,200,40,20,4,Lines);
   //textb1.border = true;
   textboxes.add(textb1);
   //textb1.parent = mapMenu;
   txtb1 = new TextBox(200+200,300,200,40,20,"Type text here!");
   txtb1.border = true;
   textb.add(txtb1);
};

public void setupTabs(){
  String [] tabnames = {"Project","Data :","Processing :","Weights :","Bias :","Activation :","Outputs :"};
  tab = new horizontaltabs(100,100,135,200,tabnames);
  
  String [] options = {"Video","Images","Audio","Text","Humans","Plants","Animals","Mazecrawler","Energy","Celluloid"};
  String [] images = {"Feature Extraction","Facial Recognition","Text analysis","Handwriting Detection","Facial Recognition","Facial Mimicry"};
  String [] audio = {"Speech Synthesis","Language Translator","Voice Detection"};
  String [] text = {"Text Analysis","sentiment Analysis","Text writer"};
  String [] livingCreatures = {"Lifespan","Velocity","Connections","Activities","Skill"};
  
  Dropdown dmenu = new Dropdown(5,tab.h - 150,tab.w - 55,"Start",options,0);
  tab tab0 = tab.tabs.get(0);
  
  String []s3 = {"Train", "Test"};
  Dropdown d2 = new Dropdown(5,tab0.h - 70,tab0.w - 55,"Train/Test",s3,0);
  
  tab0.add(0,d2);
  tab0.add(0,dmenu);
  
  tab tab1 = tab.tabs.get(1);
      
  tab1.addState(10);
  String []submenuLabels = {"Open Window","From ClipBoard","Search Web","Record"};
  Dropdown dmenu1 = new Dropdown(5,tab1.h - 150,tab1.w - 55,"Locate",submenuLabels,0);
  Button b = new Button(5,tab1.h - 70,tab1.w - 55,20,"Next -->");
  //tab1.clear();
  tab1.setTitle(0,"Data : Video");
  tab1.add(0,dmenu1);
  tab1.add(0,b);
  
  String []s2 = {"From File","From ClipBoard","Search Web"};
  Dropdown d1 = new Dropdown(5,tab1.h - 150,tab1.w - 55,"Locate",s2,0);
  
  tab1.setTitle(1,"Data : Image");
  tab1.add(1,d1);
  tab1.add(1,b);
  
  String []s5 = {"From File","From ClipBoard","Search Web","Record"};
  dmenu1 = new Dropdown(5,tab1.h - 150,tab1.w - 55,"Locate",s5,0);
  b = new Button(5,tab1.h - 70,tab1.w - 55,20,"Next -->");
  
  tab1.setTitle(2,"Data : Audio");
  tab1.add(2,dmenu1);
  tab1.add(2,b);
  
  String []s6 = {"From File","From ClipBoard","Search Web","Record"};
  dmenu1 = new Dropdown(5,tab1.h - 150,tab1.w - 55,"Locate",s6,0);
  b = new Button(5,tab1.h - 70,tab1.w - 55,20,"Next -->");
  
  tab1.setTitle(3,"Data : Text");
  tab1.add(3,dmenu1);
  tab1.add(3,b);
  
  String []s4 = {"Position","Velocity","Lifespan","Offspring","Happiness","Carrying Capacity","Rest","Dexterity","Strength","Health"};
  Dropdown d3 = new Dropdown(5,tab1.h - 150,tab1.w - 55,"Locate",s4,0);
  
  tab1.setTitle(4,"Data : Entities");
  tab1.add(4,d3);
  tab1.add(4,b);
  
  tab tab2 = tab.tabs.get(2);
  
  String [] submenuLabels2 = {"Load From File","K-clustering","Blur","Line detect","Threshold","Pooling","Flatten","Max Pooling", "Ave Pooling","Dot Pooling","DropOut","FFT"};
  dmenu1 = new Dropdown(5,tab2.h - 150,tab2.w - 55,"Convolution",submenuLabels2,5);
  b = new Button(5,tab2.h - 70,tab2.w - 55,20,"Next -->");
  
  tab2.buttons.add(b);
  tab2.dmenus.add(dmenu1);
  
  tab tab3 = tab.tabs.get(3);
  
  String [] submenuLabels3 = {"From File :","Randomize","Manually"};
  b = new Button(5,tab3.h - 70,tab3.w - 55,20,"Next -->");
  d1 = new Dropdown(5,tab3.h - 150,tab3.w - 55,"Assign",submenuLabels3,5);
  
  tab3.dmenus.add(d1);
  tab3.buttons.add(b);
  
  tab tab4 = tab.tabs.get(4);
  
  d1 = new Dropdown(5,tab4.h - 150,tab4.w - 55,"Assign",submenuLabels3,0);
  b = new Button(5,tab4.h - 70,tab4.w - 55,20,"Next -->");
  
  tab4.dmenus.add(d1);
  tab4.buttons.add(b);
  
  tab tab5 = tab.tabs.get(5);
  
  String [] submenuLabels5 = {"Sigmoid","Tan-h","Relu","Threshold","Binary Step","Linear"};  
  d1 = new Dropdown(5,tab5.h - 150,tab5.w - 55,"Assign",submenuLabels5,5);
  b = new Button(5,tab5.h - 70,tab5.w - 55,20,"Next -->");
  
  tab5.dmenus.add(d1);
  tab5.buttons.add(b);
  
  tab tab6 = tab.tabs.get(6);
  String [] submenuLabels6 = {"Random","Manual"};
  
  d1 = new Dropdown(5,tab6.h - 150,tab6.w - 55,"Assign",submenuLabels6,5);
  b = new Button(5,tab6.h - 70,tab6.w - 55,20,"Finish:");
  
  tab6.dmenus.add(d1);
  tab6.buttons.add(b);
  
  tab.toggle = true;
  
  String [] a = {"hello","goodbye","hello1","goodbye1","hello2","goodbye2"};
  d1 = new Dropdown(200,200,200, a);
  d1.draggable = true;
};

public void loadImg(){
    
};

public void run(){
  globalLogic();
  manageNN();
  mainFunctions();
  manageGrid();
  displayButtons();
  menuFunctions();
  //neuralnet.run(100);
  //bb.draw3();
  //dd.displayDropdown();
  //checkbox.draw();
};

public void displayButtons(){
  for(int i=0;i<buttons.size();i++){
    Button b = buttons.get(i);
    
    b.draw();
    b.highlight();
  };
};



public void mainFunctions(){
  if(entities.get(0).toggle)frameRate(fRate.get(1));
  fill(255);
  plot.draw();
  //textbox(btn40,humans);
  manageClipBoard();
  attractors.functions();
  gplain.grid_functions();
  displayTextBoxes();
  main.render();
  displayEntities();
  //fmenu.display();
  fmenu.display_grid();
  //gimg.img_functions();
  imageProcessing.menus();
  cam.menus();
  //audio.drawMenus();
  tab.displayTabs();
  tabfunctions();
};

public void displayEntities(){
  for(int i=entities.size()-1;i>-1;i--){
    Entity e = entities.get(i);
    
    e.runh();
    e.life();
  }
};

public void displayTextBoxes(){
  for(TextArea textb : textboxes){
    //textb.draw();
  }
  
  for(TextBox textb : textb){
    //textb.draw();
  }
};

public void manageClipBoard(){
  if(getTextFromClipboard ()!=clipBoard)clipBoard = getTextFromClipboard ();
};

public void click(){
  //reload();
  grid();
  buttons();
};

public void reload(){
  if(buttons.get(0).toggle==1&&!updated){
    frameCount = -1;
    updated = true;
  }
};

public void buttons(){
  
  file.self_toggle(6);
  file.toggle(3,plot,"toggle");
  file.toggle(0,fmenu,"toggle");
  yes.self_Toggle();
  no.self_Toggle();
  String [] gridm = {"forward","backward","pause"};
  Menu grid = file.items.get(2).submenu;
  Menu attractor = file.items.get(5).submenu;
  if(file.index==2){
    grid.toggle(0,BMS,"gridOpen");
    grid.toggle(1,imageProcessing,"toggle");
    grid.toggle(2,BMS,"camOpen");
    grid.toggle(3,BMS,"videoOpen");
    grid.toggle(4,BMS,"audioOpen");
    grid.toggle(5,BMS,"textOpen");
    //{"Terrain","Img","Cam","Video","Audio","Text"};
  }
  
  attractor.toggle(0,attractors,"show");
  attractor.toggle(1,attractors,"toggle");
  
  String [] time_bool = {"forward","backward","pause"};
  //----------entities map menu------------------------
  for(int i=0;i<entities.size();i++){
    mapMenu.toggle(i,entities.get(i),"toggle");
    //mapmenu.toggle(1,entities.get(1),"toggle");
    //mapmenu.toggle(2,entities.get(2),"toggle");
    //mapmenu.toggle(3,entities.get(3),"toggle");
    //mapmenu.toggle(4,entities.get(4),"toggle");
    //mapmenu.toggle2(5,g,"toggle");
    //mapmenu.toggle(6,g,"toggle");
  }
  //----------Shapes------------------------
  String [] shapes_bool = {"toggle","connectedlines","circle","square","tri","bezier","none"};
  
  // for(int i=0;i<shapes_bool.length;i++){
  //   shapes.sptoggle(i,main,shapes_bool[i],shapes_bool);
  // }
  //shapes.sptoggle(main,shapes_bool);
  shapes.sptoggle(0,main,"toggle",shapes_bool);
  shapes.sptoggle(1,main,"connectedlines",shapes_bool);
  shapes.sptoggle(2,main,"circle",shapes_bool);
  shapes.sptoggle(3,main,"square",shapes_bool);
  shapes.sptoggle(4,main,"tri",shapes_bool);
  shapes.sptoggle(5,main,"poligon",shapes_bool);
  shapes.sptoggle(6,main,"complex",shapes_bool);
  shapes.sptoggle(7,main,"bezier",shapes_bool);
  shapes.sptoggle(8,main,"spline",shapes_bool);
  shapes.sptoggle(9,main,"none",shapes_bool);
  shapes.sptoggle(11,main,"path",shapes_bool);
  
  String [] ld = {"draw","edit"};
  
  main.pallete.toggle(0,main,"fill");
  main.pallete.toggle(1,main,"gravity");
  main.pallete.toggle(2,main,"friction");
  main.pallete.toggle(3,main,"velocity");
  main.pallete.toggle(4,main,"connect");
  main.pallete.toggle(5,main,"amendBoundary");
  main.pallete.toggle(6,main,"amendInnerBoundary");
  main.pallete.toggle(7,main,"amendAvoidance");
  main.pallete.toggle(8,main,"amendCohesion");
  main.pallete.toggle(9,main,"followBoundary");
  main.pallete.toggle(10,main,"follow");
  main.pallete.toggle(11,main,"dashed");
  main.pallete.toggle(12,main,"border");
  main.pallete.toggle(13,main,"amendAvoidance");
  main.pallete.toggle(14,main,"showgrid");
  main.pallete.toggle(15,main,"hidemenu");
  main.pallete.sptoggle(16,main,"edit",ld);
  main.pallete.toggle(17,main,"reset");
  //main.complexsub.toggle(0,main,"cfinish");
  
  //----------Entities-----------------
  
  Entities_sublist.toggle(0,entities.get(0),"visible");
  Entities_sublist.toggle(1,entities.get(0),"addh");
  Entities_sublist.toggle(2,entities.get(0),"boundary");
  Entities_sublist.toggle(3,entities.get(0),"followb");
  Entities_sublist.toggle(4,entities.get(0),"pause");
  Entities_sublist.toggle(6,entities.get(0),"dynamic");
  Entities_sublist.toggle(7,entities.get(0),"separationManager");
  Entities_sublist.toggle(8,entities.get(0),"cohesionManager");
  Entities_sublist.toggle(9,entities.get(0),"alignmentManager");
  Entities_sublist.toggle(10,entities.get(0),"showsliders");
  Entities_sublist.toggle(11,entities.get(0),"Birth");
  Entities_sublist.toggle(12,entities.get(0),"Death");
  Entities_sublist.click(13,entities.get(0),"reset");
  
  Menu debug = Entities_sublist.items.get(5).submenu;
  
  debug.toggle(0,entities.get(0),"familyties");
  debug.toggle(1,entities.get(0),"showbroom");
  debug.toggle(2,entities.get(0),"showta");
  debug.toggle(3,entities.get(0),"showtb");
  debug.toggle(4,entities.get(0),"showheading");
  debug.toggle(5,entities.get(0),"showview");
  debug.toggle(6,entities.get(0),"info");
  debug.toggle(7,entities.get(0),"hidesliders");
  debug.toggle(8,entities.get(0).scene,"showq");
  debug.toggle(9,entities.get(0).scene,"showf");
  
  neuralNetworkMenu.toggle(0,tab,"toggle");
  neuralNetworkMenu.toggle2(1,tab,"toggle");
  neuralNetworkMenu.toggle(2,this,"openSimpleNN");
  //if(neuralNetworkMenu.items.get(2).pos()&&mousePressed) openSimpleNN= true;
  
  twitter.toggle(0,twitterKeywords,"toggle");
  
  Menu options = plot.options;
  
  options.toggle(0,plot,"grid");
  options.toggle(1,plot,"axis");
  options.toggle(2,plot,"showMouse");
  options.toggle(3,plot,"labels");
  options.toggle(4,plot,"showTab");
  options.toggle(5,plot,"loadRdata1");
  options.toggle(6,plot,"loadRdata2");
  options.toggle(9,plot,"clear");
  options.toggle(10,plot,"toggle");
  
};

public void grid(){
  //-------------pallete-------------------------
  String [] timebool = {"forward","backward","pause"};
  if(g!=null){
  g.pallete.draggable = true;
  g.pallete.toggle(0,g,"circle");
  g.pallete.toggle(1,g,"visible");
  g.pallete.toggle(2,g,"graph");
  g.pallete.toggle(3,g,"attractor");
  g.pallete.sptoggle(4,g,"forward",timebool);
  g.pallete.sptoggle(5,g,"backward",timebool);
  g.pallete.sptoggle(6,g,"pause",timebool);
  g.pallete.toggle(7,g,"heading");
  //g.pallete.click(8,g,"save");
  g.pallete.toggle(9,g,"load");
  g.pallete.toggle(10,g,"contour");
  g.pallete.toggle(11,g,"mouse");
  g.pallete.toggle(12,g,"reset");
  g.pallete.toggle(13,g,"populateBoundaries");
  g.pallete.toggle(14,g,"PopulateSpecies");
  g.pallete.toggle(15,g,"debug");
  g.pallete.toggle(16,g,"saveImage");
  }
};

public void slider_functions(){
  
  //--------img-------------------------------
  
  imgsliderList.set(0,1,-1,gimg,"convup");
  imgsliderList.set(1,1,-1,gimg,"convright");
  imgsliderList.set(2,1,-1,gimg,"convdown");
  imgsliderList.set(3,1,-1,gimg,"convleft");
  imgsliderList.set(4,-100,300,gimg,"threshold");
  imgsliderList.set(5,1,-1,gimg,"conv");
  imgsliderList.set(6,20,300,gimg,"mdist");
  imgsliderList.set(7,1,-1,gimg,"convvp");
  imgsliderList.set(8,1,-1,gimg,"convvn");
  imgsliderList.set(9,1,-1,gimg,"convhp");
  imgsliderList.set(10,1,-1,gimg,"convhn");
  
  //----------Entities------------
  
  fRate.setint(0,1,4,entities.get(0).scene,"limit");
  fRate.set(1,0,60);
  fRate.set(2,0,200,entities.get(0),"breathingroom");
  fRate.set(3,-100,100,entities.get(0),"cohesion");
  fRate.set(4,-100,100,entities.get(0),"separation");
  fRate.set(5,-100,100,entities.get(0),"alignment");
  fRate.set(6,-50,50,entities.get(0),"alimit");
  fRate.set(7,-50,50,entities.get(0),"vlimit");
  fRate.set(8,0,5,entities.get(0),"wanderm");
  fRate.set(9,50,1200,entities.get(0),"w");
  fRate.set(10,50,600,entities.get(0),"h");
  fRate.set(11,-100,100,entities.get(0),"cohesionb");
  fRate.set(12,-100,100,entities.get(0),"separationb");
  fRate.set(13,0,200,entities.get(0),"breathingroomb");
  fRate.set(14,0,0.5f,entities.get(0),"tscale");
  fRate.set(16,-50,50,entities.get(0),"separationc");
  fRate.set(15,-50,50,entities.get(0),"cohesionc");
  fRate.set(17,-50,50,entities.get(0),"alignmentc");
  fRate.set(18,0,1,entities.get(0),"mu");
  fRate.set(19,0,200,entities.get(0),"min");
  fRate.set(20,-100,100,entities.get(0),"separationd");
  
  //---------grid-------------------
  
  if(g!=null){
    //sliderMenu.set(0,-1,1,g,"zoom","sdown");
    //sliderMenu.set(1,0,255,g,"sealevel","sdown");
    //sliderMenu.set(2,0,255,g,"groundlevel2","sdown");
    //sliderMenu.set(3,0,255,g,"grasslevel","sdown");
    //sliderMenu.set(4,0,255,g,"mountainlevel","sdown");
    //sliderMenu.set(5,-200,200,g,"distance","sdown");
    //sliderMenu.set(6,-200,200,g,"vdistance","sdown");
    //sliderMenu.set(7,-200,200,g,"hdistance","sdown");
    //sliderMenu.set(8,-360,360,g,"xrot","sdown");
    //sliderMenu.set(9,-360,360,g,"yrot","sdown");
    //sliderMenu.set(10,-360,360,g,"zrot","sdown");
    //sliderMenu.set(11,0,1,g,"xvar","sdown");
    //sliderMenu.set(12,0,2,g,"noise""sdown");
    
    g.sliderMenu.set(0,-1,1,g,"scale");
    g.sliderMenu.set(1,0,2*g.amp1,g,"sealevel");
    g.sliderMenu.set(2,0,2*g.amp1,g,"groundlevel");
    g.sliderMenu.set(3,0,2*g.amp1,g,"grasslevel");
    g.sliderMenu.set(4,0,2*g.amp1,g,"mountainlevel");
    g.sliderMenu.set(12,0,0.05f,g,"scale1");
    g.sliderMenu.set(13,0,10,g,"amp1");
    g.sliderMenu.set(14,1,4,g,"freq1");
    g.sliderMenu.setint(15,0,10,g,"octaves");
    g.sliderMenu.set(16,-1,1,g,"persistance");
    g.sliderMenu.set(17,1,10,g,"lacunarity");
    g.sliderMenu.set(18,-100000,100000,g,"seed");
  }
};

public void manageGrid(){
  if(gridOpen&&g==null){
    g = new Grid(23,H/2-310,1200-45,main.h,5);
    g.pallete.items.get(1).toggle = 1;
    g.toggle=true;
    gridSeeded = false;
    gridCleared = false;
    g.sliderMenu.set(0,-1,1,g,"scale");
    g.sliderMenu.set(1,0,2*g.amp1,g,"sealevel");
    g.sliderMenu.set(2,0,2*g.amp1,g,"groundlevel");
    g.sliderMenu.set(3,0,2*g.amp1,g,"grasslevel");
    g.sliderMenu.set(4,0,2*g.amp1,g,"mountainlevel");
    g.sliderMenu.set(12,0,0.05f,g,"scale1");
    g.sliderMenu.set(13,0,10,g,"amp1");
    g.sliderMenu.set(14,1,4,g,"freq1");
    g.sliderMenu.setint(15,0,10,g,"octaves");
    g.sliderMenu.set(16,0,1,g,"persistance");
    g.sliderMenu.set(17,1,10,g,"lacunarity");
    g.sliderMenu.set(18,-100000,100000,g,"seed");
    g.canvas = createGraphics(width,height);
    g.canvas2 = createGraphics(width,height);
    g.begin = true;
    g.sUpdate = true;
  }
  if(gridOpen&&g!=null){
    if(g!=null)g.grid_functions();
    }

  if(!gridOpen){
    g = null;
    if(!gridCleared){
      Runtime.getRuntime().gc();
      gridCleared = true;
    }
    if(!gridSeeded)gridSeeded = true;
    
  }
  
  if(BMS.camOpen){
    if(gcam==null){
      gcam = new webcam(applet);
      cam.toggle = true;
    }else gcam.display(cam.canvas);
    }else if(gcam != null){
      gcam.cam.stop();
      cam.toggle = false;

      gcam = null;
  }
  if(BMS.textOpen){
    if(words==null){
      words = new vectorText();
      words.toggle = true;
    }else words.display();
  }else if(words != null){
      words.toggle = false;
      words = null;
  }
  if(BMS.audioOpen){
    if(audio==null){
      audio = new audioData(applet);
      audio.toggle = true;
    }else audio.drawMenus();
  }else if(audio != null){
      audio.toggle = false;
      audio = null;
  }
};

public void manageNN(){
  if(openSimpleNN&&neuralnet==null){
    neuralnet = new Network(28,10,10,2);
  }
  if(!openSimpleNN)neuralnet = null;
  if(neuralnet!=null)neuralnet.run(100);
};

public void menuFunctions(){
  
  Mcount = 0;
  
  for(int i=0;i<BMS.menus.size();i++){
    
    Menu m = BMS.menus.get(i);
    m.draw();
    
  //   if(m.parent==null&&(m.pos()||m.toggle==1)){Mcount++;}
  //   else if(m.parent!=null&&m.items.size()>0&&m.parent.toggle==1){
  //     for(int j=0;j<m.items.size();j++){
  //       Button b = m.items.get(j);
  //       if(b.pos())Mcount++;
  //     }}
  //     else if(m.sliders.size()>0&&m.parent.toggle==1){
  //     for(int j=0;j<m.sliders.size();j++){
  //       Slider b = m.sliders.get(j);
  //       if(b.pos())Mcount++;
  //     }
  // }
  
  if(Mcount>0)open_menus = true;
  else open_menus = false;
  }
};

public void boundariesNscenes(){
  
  //------------------------------------------------------
  //Boundaries--------------------------------------------
};

public void startCam(){
  Cam.start();
};

public void autoSave(){
  
  if(autoSave){
    saveText();
  }
  
};

public void load(){
  
};

public void saveText(){
  
  for(int i=0;i<textBoxes.size();i++){
    TextBox t = textBoxes.get(i);
    
    t.save();
  }
  
  for(int i=0;i<textAreas.size();i++){
    TextArea t = textAreas.get(i);
    
    t.save();
  }
};

public void saveSliderBox(){
  
  for(int i=0;i<sliderBoxes.size();i++){
    sliderBox s = sliderBoxes.get(i);
    
    s.save();
  }
};

public void saveButtons(){
  
  for(int i=0;i<buttons.size();i++){
    Button b = buttons.get(i);
    
    b.save();
  }
};

public void saveMenu(){
  
  for(int i=0;i<menus.size();i++){
    Menu m = menus.get(i);
    
    m.save();
  }
  
  for(int i=0;i<textAreas.size();i++){
    TextArea t = textAreas.get(i);
    
    t.save();
  }
};

public void saveGrid(){
  
  for(int i=0;i<grids.size();i++){
    Grid g = grids.get(i);
    
    g.save();
  }
  
  for(int i=0;i<cams.size();i++){
    webcam c = cams.get(i);
    
    //c.save();
  }
};

public void saveTabs(){
  
  for(int i=0;i<tabs.size();i++){
    tab t = tabs.get(i);
    
    t.save();
  }
  
  for(int i=0;i<tabs.size();i++){
    tab t = tabs.get(i);
    
    t.save();
  }
};

public void saveImgp(){
  
  for(int i=0;i<textBoxes.size();i++){
    TextBox t = textBoxes.get(i);
    
    t.save();
  }
};

public void save(){
  
};

public void start(Object o,boolean localVar){
    Field field = null;
    
    String s = "hello";
    
    try{
      //field = o.getClass().getfield(s);
      field = applet.getClass().getField(s); 
      }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }}
    
    public void eventListener(){
  
};

public void toggle(Object o,String globalVar,boolean localVar){
    Field field = null;
    
    try{
      
      field = applet.getClass().getField(globalVar);
      
      
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }
  
};

public void globalLogic(){
  //if(dropDownObject!=null)println(dropDownObject.label);
  if(dropDownObject!=null&&!dropDownObject.dclick){
    dropDownObject = null;
  }
  if(mousePressed) globaldown = true;
  else {
    currentMouseObject = null;
    currentObject = null;
    globaldown = false;
  }

  // if(currentObject!=null){
  //   Field field = null;
  //   try {

  //     field = currentObject.getClass().getField("docked"); 
  //     boolean value = field.getBoolean(field);

  //     if(value){
  //       currentObject = null;
  //     }
  //   }catch (NullPointerException e) {
  //   }catch (NoSuchFieldException e) {
  //   }catch (IllegalAccessException e) {
  //   }
  //   currentObject = null;
  // }
};
  
};
 class Boundary{
  
  float x1,x2,y1,y2,w,h,x3,y3,size = 1,x4,y4,D1,D2,T1,T2,collision_index,menux,menuy,deltamx,deltamy,tacx,tacy,dir;
  float x,y,bx = x,by = y;
  public float mass,vx,vy,ax,ay,density,friction_u,momentum,bax ,bay,pathWidth=20,gconst = 0.1f,floor = 590,rtheta = 0,avoidance,cohesion,broom;
  PVector p1,midpoint1,midpoint2,midpoint3,m = new PVector(0,0);
  PVector p2,p3,p4,center = new PVector(-1,-1),vel,ac,rotatep;
  int key1,key2,type,t,t2,vert,vert1,vert3,trit,id,index,lindex,sindex,ccount,sid,vcount,hcount,uindex = -1,counter,tpoints,mcount,sides,shapeIndex,lineIndex,lcount,pcount,options = -1,numm,state,state1=1,gid;
  public int cols = 40,rows = 25;
  public boolean toggle = false,mdown,mup = true,circle,square,bezier,tri,c_poligon,poligon,drag,none,spline,hover,hover2,point1,point2,point3,point4,gravity,hidemenu,clear,edit,complex,cstart,showgrid,cfinish = false,border,fill,hidden,connectedlines,path,avoidBoundary,cohesionBoundary,amendBoundary,amendInnerBoundary, amendCohesion,amendAvoidance,dashed;
  boolean linedown = false,sdown,rtoggle,click,open,dynamic = true,falling = true,rotating,update,lock,pdown,updatep,updateg,tdown,trow,menudown,pointadded,converted,rdown,phover,lhover,contextClick,visible = true;
  float dx,dy,Theta,Norm;
  int col = color(255),bg = color(0,180);
  ArrayList<Integer> indices = new ArrayList<Integer>();
  ArrayList<Button> Buttons = new ArrayList<Button>();
  ArrayList<Boundary> Boundaries = new ArrayList<Boundary>();
  ArrayList<Boundary> innerBoundaries = new ArrayList<Boundary>();
  ArrayList<Boundary> outerBoundaries = new ArrayList<Boundary>();
  ArrayList<PVector> points = new ArrayList<PVector>();
  ArrayList<PVector> rotation_points = new ArrayList<PVector>();
  Scene scene;
  ArrayList<Scene> scenes = new ArrayList<Scene>();
  Boundary parent;
  Boundary child;
  PShape bpath;
  ArrayList<PShape> paths = new ArrayList<PShape>();
  ArrayList<Float[]> velocity = new ArrayList<Float[]>();
  ArrayList<PVector> velocitypv = new ArrayList<PVector>();
  ArrayList<Boundary> Quadrants = new ArrayList<Boundary>();
  ArrayList<PVector> Midpoints = new ArrayList<PVector>();
  ArrayList<PVector> collision_array = new ArrayList<PVector>();
  //ArrayList<PVector> Midpoints = new ArrayList<PVector>();
  
  String []contextlabels = {"Undo","Redo"};
  String []contextDellabels = {"Delete Point","Cancel","Shape"};
  String []palletelabels = {"Fill","Gravity","Friction","Velocity","Connect","Amend B","Amend iB","Avoid","Seek",
                            "Follow","Dashed","Border","Clear","Visible","Grid","Hide","Edit","Reset"};
  String []complexmenu = {"Finish"};
  String []convertmenu = {"Convert","Delete Shape","Shape"};
  String []connectedlMenul = {"Convert","Delete Line","Delete Shape","Shape"};
  
  Menu palletehide,context,contextDel,pallete,complexsub,convertToPath,connectedlMenu;
  String [] settingsLabel = {"Cohesion","Separation","B room"};
  sliderBox settings;
  
  TextBox Sides = new TextBox (W-200,H-200,20,20,5,"Sides");
  ArrayList<Float> norm = new ArrayList<Float>();
  ArrayList<Float[]> mdist = new ArrayList<Float[]>();
  ArrayList<Float[]> pdist = new ArrayList<Float[]>();
  ArrayList<Float> dist = new ArrayList<Float>();
  ArrayList<Integer> types = new ArrayList<Integer>();
  ArrayList<Float> theta = new ArrayList<Float>();
  ArrayList<Float> mtheta = new ArrayList<Float>();
  ArrayList<PVector> temp = new ArrayList<PVector>();
  ArrayList<ArrayList> polytemp = new ArrayList<ArrayList>();
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  
  PVector polymidpoint = new PVector(0,0);
  Grid gridlayout;
  ArrayList<Point> grid = new ArrayList<Point>();
  ArrayList<Point> ugrid = new ArrayList<Point>();
  ArrayList<Point> ogrid = new ArrayList<Point>();
  
  tab palleteTab;
  Boundary(){
    
    palletehide = new Menu(0,200+300/2 - 100,20,50);
    context = new Menu(mouseX,mouseY,90,contextlabels);
    contextDel = new Menu(mouseX,mouseY,90,contextDellabels);
    pallete = new Menu(0,200,90,palletelabels,0);
    complexsub = new Menu(W-200,H-200,90,complexmenu);
    convertToPath = new Menu(mouseX,mouseY,90,convertmenu);
    connectedlMenu = new Menu(mouseX,mouseY,90,connectedlMenul);
    settings = new sliderBox(mouseX,mouseY,90,5,settingsLabel);
    settings.menu.draggable = false;
    settings.tooltip.visible = false;
    type = -1;
    
    setupPallete();
    
  };
  
  Boundary(float X1, float Y1,float X2, float Y2){
    
    x1 = X1;
    y1 = Y1;
    x2 = X2;
    y2 = Y2;
    type = 2;
    p1 = new PVector(x1,y1);
    p2 = new PVector(x2,y2);
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    
  };
  
  Boundary(float X1, float Y1,float ww,float hh,int Type){
    
    float t1 = 0;
    x1 = X1;
    y1 = Y1;
    w = ww;
    h = hh;
    
    Float [] d1 = {0.0f,0.0f};
    Float [] vel = {0.0f,0.0f};
    
    if(Type==0){
    
    x1 = X1;
    y1 = Y1;
    w = ww;
    h = hh;
    x2 = x1 + ww;
    y2 = y1 + hh;
    
    type = 0;
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    d1[0] = center.x - x1;
    d1[1] = center.y - y1;
    pdist.add(d1);
    t1 = atan2(y1-center.y,x1-center.x);
    theta.add(t1);
    d1[0] = center.x - x2;
    d1[1] = center.y - y2;
    pdist.add(d1);
    t1 = atan2(y2-center.y,x2-center.x);
    theta.add(t1);
    
    }
    
    if(Type==2){
    x1 = X1;
    y1 = Y1;
    x2 = ww;
    y2 = hh;
    
    type = 2;
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    Boundaries.add(new Boundary(x1,y1,x2,y2));
    d1[0] = center.x - x1;
    d1[1] = center.y - y1;
    pdist.add(d1);
    t1 = atan2(y1-center.y,x1-center.x);
    theta.add(t1);
    d1[0] = center.x - x2;
    d1[1] = center.y - y2;
    pdist.add(d1);
    t1 = atan2(y2-center.y,x2-center.x);
    theta.add(t1);
    velocity.add(vel);
    create_rotation_points(Boundaries);
    create_points(Boundaries);
    
    }
    
    if(Type==0||Type==2){
      center = new PVector((x1+x2)/2,(y1+y2)/2);
    }
    
    if(Type==3){
    
    w = dist(x1,y1,ww,hh);
    h = dist(x1,y1,ww,hh);
    
    Norm = -atan2(x1 - ww,y1 - hh);
    
    x2 = ww + w/1.5f * cos(Norm);
    y2 = hh + h/1.5f * sin(Norm);
    x3 = ww - w/1.5f * cos(Norm);
    y3 = hh - h/1.5f * sin(Norm);
    
    center = new PVector((x1+x2+x3)/3,(y1+y2+y3)/3);
    Boundaries.add(new Boundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    midpoint1 = new PVector((x1 + x2)/2,(y1 + y2)/2);
    Boundaries.add(new Boundary(x2 , y2 ,x3 , y3));
     d1[0] = center.x - x2;
     d1[1] = center.y - y2;
     pdist.add(d1);
     t1 = atan2(y2-center.y,x2-center.x);
     theta.add(t1);
    midpoint2 = new PVector((x2 + x3)/2,(y2 + y3)/2);
    velocity.add(vel);
    Boundaries.add(new Boundary(x3, y3,x1,y1 ));
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    velocity.add(vel);
    midpoint3 = new PVector((x3 + x1)/2,(y3 + y1)/2);
    type = 3;
    create_rotation_points(Boundaries);
    create_points(Boundaries);
    
    }
    
    if(Type==4){
      
    x2 = x1 + ww;
    y2 = y1;
    x3 = x1 + ww;
    y3 = y1 + hh;
    x4 = x1;
    y4 = y1 + hh;
    
    center = new PVector((x1+x2+x3+x4)/4,(y1+y2+y3+y4)/4);
    Boundaries.add(new Boundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    Boundaries.add(new Boundary(x2,y2,x3,y3));
    velocity.add(vel);
      d1[0] = center.x - x2;
      d1[1] = center.y - y2;
      pdist.add(d1);
      t1 = atan2(y2-center.y,x2-center.x);
      theta.add(t1);
    Boundaries.add(new Boundary(x3,y3,x4,y4));
    velocity.add(vel);
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    Boundaries.add(new Boundary(x4,y4,x1,y1));
    velocity.add(vel);
      d1[0] = center.x - x4;
      d1[1] = center.y - y4;
      pdist.add(d1);
      t1 = atan2(y4-center.y,x4-center.x);
      theta.add(t1);

    center = new PVector((x1+x2+x3+x4)/4,(y1+y2+y3+y4)/4);
    type = 4;
    }
    
    if(Type==103){
      
    Norm = -atan2(x1 - ww,y1 - hh);
    
    x2 = x1 + w/2 ;
    y2 = y1 + h ;
    x3 = x1 - w/2 ;
    y3 = y1 + h ;
    center = new PVector((x1+x2+x3)/3,(y1+y2+y3)/3);
    Boundaries.add(new Boundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    midpoint1 = new PVector((x1 + x2)/2,(y1 + y2)/2);
    Boundaries.add(new Boundary(x2 , y2 ,x3 , y3));
     d1[0] = center.x - x2;
     d1[1] = center.y - y2;
     pdist.add(d1);
     t1 = atan2(y2-center.y,x2-center.x);
     theta.add(t1);
    midpoint2 = new PVector((x2 + x3)/2,(y2 + y3)/2);
    velocity.add(vel);
    Boundaries.add(new Boundary(x3, y3,x1,y1 ));
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    velocity.add(vel);
    midpoint3 = new PVector((x3 + x1)/2,(y3 + y1)/2);
    type = 3;
    create_points(Boundaries);
    
    }
    
    type = Type;
    create_points(Boundaries);
    create_dist();
    create_angles(Boundaries);
    create_rotation_points(Boundaries);
  };
  
  Boundary (float X1, float Y1,float X2,float Y2,float X3, float Y3){

    x1 = X1;
    y1 = Y1;
    x2 = X2;
    y2 = Y2;
    x3 = X3;
    y3 = Y3;
    type = 3;
  };
  
  Boundary(PVector A, PVector B,PVector C){

    p1 = A;
    p2 = B;
    p3 = C;
    x1 = p1.x;
    y1 = p1.y;
    x2 = p2.x;
    y2 = p2.y;
    type = 3;
  };
  
  Boundary(PVector A, PVector B){

    p1 = A;
    p2 = B;
    x1 = p1.x;
    y1 = p1.y;
    x2 = p2.x;
    y2 = p2.y;
  };
  
  Boundary(ArrayList<Point> A){
  
   center = new PVector (0,0);
    for(int i=0;i<A.size();i++){
      
      Point a = A.get(i);
      Point b = A.get(i);
      
      if(i<A.size()-1)b = A.get(i+1);
      else b = A.get(0);
      Boundary B = new Boundary(a.x,a.y,b.x,b.y,2);
      Boundaries.add(B);
      
    }
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 105;
  };
  
  Boundary(ArrayList<Point> A,int k){
  
   center = new PVector (0,0);
    for(int i=0;i<A.size();i++){
      
      Point a = A.get(i);
      Point b = null;
      Point c = null;
      
      if(i+2<A.size()){
       b = A.get(i+1);
       c = A.get(i+2);
      
      if(((b.x==a.x)&&(c.x==a.x)||b.y==a.y&&(c.y==a.y))){
        A.remove(i+1);
        i--;
        
      }else{
        Boundary B = new Boundary(a.x,a.y,b.x,b.y,2);
        Boundaries.add(B);
      }}else if(i+1<A.size()){
        b = A.get(i+1);
        Boundary B = new Boundary(a.x,a.y,b.x,b.y,2);
        Boundaries.add(B);
      }}
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 106;
  };
  
  Boundary(Boundary B){
   
   //Boundaries = B.Boundaries;
   
   if(B.type==106){
     
   float pw = pathWidth; 
   
   center = new PVector (0,0);
   
   Boundary b0 = B.Boundaries.get(0);
   
   PVector p0 = new PVector(b0.x1,b0.y1);
   PVector p1 = new PVector(b0.x2,b0.y2);
   
   float t = -atan2(p0.x-p1.x,p0.y-p1.y);
   
   PVector p2 =  new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
   PVector p3 =  new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
   
   Boundary b = new Boundary(p1,p2);
   
   Boundaries.add(b);
   
    for(int i=1;i<B.Boundaries.size()-1;i++){
      
      b = B.Boundaries.get(i);
      
      Boundary b1 = B.Boundaries.get(i-1);
      Boundary b2 = B.Boundaries.get(i+1);
      
      p0 = new PVector(b.x1,b.y1);
      p1 = new PVector(b1.x2,b1.y2);
      
      p2 = new PVector(b2.x2,b2.y2);
      p3 = new PVector();
      
      float t1 = atan2(p0.y-p1.y,p0.x-p1.x);
      float t2 = atan2(p0.y-p2.y,p0.x-p2.x);
      
      t = -1/((t1+t2)/2);
      
      PVector p4 = new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
      PVector p5 = new PVector(p1.x+pw*cos(t),p1.y+pw*sin(t));
      
      Boundaries.add(new Boundary(p4.x,p4.y,p5.x,p5.y));
      
      }
      
      b0 =  B.Boundaries.get(B.Boundaries.size()-1);
      p0 = new PVector(b0.x1,b0.y1);
     
      t = radians(90);
      p1 =  new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
      p2 =  new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
     
      b = new Boundary(p1,p2);
     
      Boundaries.add(b);
      
      for(int i=B.Boundaries.size()-1;i>-1;i--){
      
      b = B.Boundaries.get(i);
      Boundary b1 = B.Boundaries.get(i-1);
      Boundary b2 = B.Boundaries.get(i+1);
      
      p0 = new PVector(b.x1,b.y1);
      p1 = new PVector(b1.x2,b1.y2);
      
      p2 = new PVector(b2.x2,b2.y2);
      p3 = new PVector();
      
      float t1 = atan2(p0.y-p1.y,p0.x-p1.x);
      float t2 = atan2(p0.y-p2.y,p0.x-p2.x);
      
      t = -1/((t1+t2)/2);
      
      PVector p4 = new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
      PVector p5 = new PVector(p1.x-pw*cos(t),p1.y-pw*sin(t));
      
      Boundaries.add(new Boundary(p4.x,p4.y,p5.x,p5.y));
      
      }
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 107;
      
   }else if(B.type!=0){
     
     float pw = pathWidth; 
   
      center = B.center;
      calcInner(B);
      calcOuter(B);
    
      create_points(innerBoundaries);
      create_points(outerBoundaries);
      create_angles(innerBoundaries);
      create_angles(outerBoundaries);
      create_rotation_points(innerBoundaries);
      create_rotation_points(outerBoundaries);
      type = 107;
   }else {
     
   }
  };
  
  public Point getNextPoint(ArrayList<Point> a,Point b){
    Point c = null;
    for(int i=0;i<a.size();i++){
      Point d = a.get(i);
      if(d.x!=b.x&&d.y!=b.y)c = d; 
    }
    
    return c;
  };
  
  public void debug(){
    fill(255);
  };
  
  public void calcInner(Boundary a){
    if(a.type==0){
      
    }else if(a.type!=0&&a.type!=106){
      
      float pw = a.pathWidth;
      
    for(int i=0;i<a.Boundaries.size();i++){
      Boundary b = a.Boundaries.get(i);
      Boundary b1 = a.Boundaries.get(i);
      
      if(i<a.Boundaries.size()-1)b1 = a.Boundaries.get(i+1);
      else b1 = a.Boundaries.get(0);
      
      PVector p = new PVector(b.x1,b.y1);
      PVector p1 = new PVector(b.x2,b.y2);
      
      float t = atan2(a.center.y-p.y,a.center.x-p.x);
      float d = dist(p.x,p.y,a.center.x,a.center.y);
      
      float t1 = atan2(a.center.y-p1.y,a.center.x-p1.x);
      float d1 = dist(p1.x,p1.y,a.center.x,a.center.y);
      
      PVector p2 = new PVector(a.center.x+(d-pw)*cos(t),a.center.y+(d-pw)*sin(t));
      PVector p3 = new PVector(a.center.x+(d1-pw)*cos(t1),a.center.y+(d1-pw)*sin(t1));
      
      
      //a.innerBoundaries.add(new Boundary(p2.x,p2.y,p3.x,p3.y));
      //a.outerBoundaries.add(new Boundary(p2.x,p2.y,p3.x,p3.y));
    }a.type = 107;}else{
      
    }
    
  };
  
  public void calcOuter(Boundary a){
    if(a.type==0){
      
    }else if(a.type!=0&&a.type!=106){
      
      float pw = a.pathWidth;
      
    for(int i=0;i<a.Boundaries.size();i++){
      Boundary b = a.Boundaries.get(i);
      Boundary b1 = a.Boundaries.get(i);
      
      if(i<a.Boundaries.size()-1)b1 = a.Boundaries.get(i+1);
      else b1 = a.Boundaries.get(0);
      
      PVector p = new PVector(b.x1,b.y1);
      PVector p1 = new PVector(b1.x1,b1.y1);
      
      float t = atan2(a.center.y-p.y,a.center.x-p.x)-PI;
      float d = dist(p.x,p.y,a.center.x,a.center.y);
      
      float t1 = atan2(a.center.y-p1.y,a.center.x-p1.x)-PI;
      float d1 = dist(p1.x,p1.y,a.center.x,a.center.y) ;
      
      PVector p2 = new PVector(a.center.x+(d+pw)*cos(t),a.center.y+(d+pw)*sin(t));
      PVector p3 = new PVector(a.center.x+(d1+pw)*cos(t1),a.center.y+(d1+pw)*sin(t1));
      
      PVector p4 = new PVector(a.center.x+(d)*cos(t) - pw*cos(t),a.center.y+(d)*sin(t) - pw*sin(t));
      PVector p5 = new PVector(a.center.x+(d1)*cos(t1) - pw*cos(t),a.center.y+(d1)*sin(t1) - pw*sin(t));
      
      a.innerBoundaries.add(new Boundary(p4.x,p4.y,p5.x,p5.y));
      a.outerBoundaries.add(new Boundary(p2.x,p2.y,p3.x,p3.y));
    }a.type = 107;}else{
      
    }
  };
  
  public void setupPallete(){
    if(type==-1){
    palleteTab = new tab(25,H-70,W-50,70,this);
    palleteTab.scrollable = true;
    palleteTab.states.get(0).scrollable = true;
    palleteTab.toggle=true;
    palleteTab.visible = true;
    palleteTab.sliderh.visible = false;
    palleteTab.sliderv.valuex = 0;
    palleteTab.sliderv.h +=20;
    //palleteTab.states.remove(1);
    }
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void draw(){
      if((open||none))palleteTab.displayTab();
      
      
     hcount = 0;lcount = 0;pcount = 0;
     boolean lineHover = false;
     int k = -1;
     fill(255);
     
     if(mouseX>0)m.x = mouseX;
     if(mouseY>0)m.y = mouseY;
    if(!clear){
    //for(int i=Boundaries.size()-1;i>-1;i--){
      for(int i=1;i<Boundaries.size();i++){
      Boundary b = Boundaries.get(i);
      
      b.id = i;
      if(!b.visible&&pos(b,m)){
        if(visible&&mousePressed&&mouseButton==LEFT)b.visible = true;
      }
      if(b.visible){
      if((edit&&!settings.visible)||(settings.visible&&!settings.pos())){
      if(b.type!=2&&!point1&&!point2&&!linedown&&!rdown)mtranslate(b,m);
      if(!point1&&!point2&&!tdown&&!rdown)move(b,m);
      if((b.type!=0)&&!linedown&&!tdown&&!rdown)pospoint(b);
      if(!point1&&!point2&&!linedown&&!tdown)pos_rotationpoint(b);
      b.update(b);
      }
      
      if(!pospoint(b,0))pcount++;
      
      if(gravity)b.gravity = true;
      else b.gravity = false;
      
      strokeWeight(1);
      if(pos(b,m)){
        //if(
        if(!visible&&mousePressed)b.visible = false;
        if(mousePressed)lineIndex = -1;
        if(amendBoundary){
          fill(255);
          text(b.state,b.x1,b.y1);
                if(mousePressed){
                if(amendCohesion&&amendAvoidance)b.state = 1;
                else if(amendCohesion&&!amendAvoidance)b.state = 2;
                else if(!amendCohesion&&amendAvoidance)b.state = 3;
                else if(!amendCohesion&&!amendAvoidance)b.state = 4;
         }}
        indices.add(i);
        if(indices.size()>2)indices.remove(0);
      }
      if(!pos(b,m))hcount ++;
        
        if(b.type==0){
          stroke(0);
          fill(0,50);strokeWeight(1);
          if(pos(b,m)){
            shapeIndex=i;
            fill(255,50);
          }
          ellipseMode(CENTER);
          ellipse(b.center.x,b.center.y,b.w,b.h);
        }else if(b.type!=107){
          
          if(b.type!=106)fill(0,50);
          else noFill();
          if(pos(b,m)){
            shapeIndex=i; 
            fill(255,50);
            if(mousePressed)lineIndex = -1;
          }
          stroke(0);
          beginShape();
          
          for(int j=0;j<b.Boundaries.size();j++){
            Boundary c = b.Boundaries.get(j);
            
            vertex(c.x1,c.y1);
            vertex(c.x2,c.y2);
          }}}
          if(b.type==106)endShape();
          else if(b.type!=107)endShape(CLOSE);
          
          if(b.type==107){
            
            //if(!b.converted){
              
          b.bpath = createShape();
          //---------------begin shape------------------------------------
          beginShape();
          fill(0,150);
          stroke(0);
          strokeWeight(1);
          //-------------exterior------------------------------------
          
          for(int j=0;j<b.outerBoundaries.size()-1;j++){
            
            Boundary c = b.outerBoundaries.get(j);
            Boundary c1 = b.outerBoundaries.get(j+1);
            
            vertex(c.x1,c.y1);
            vertex(c1.x1,c1.y1);
            
            
            
            if(pos(c,m)){
              if(amendInnerBoundary){
                if(mousePressed){
                     lineIndex = -1;
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          //------------interior------------------------------------
          beginContour();
          
          for(int j=b.innerBoundaries.size()-1;j>0;j--){
            
            Boundary c = b.innerBoundaries.get(j);
            Boundary c1 = b.innerBoundaries.get(j-1);
            
            vertex(c.x1,c.y1);
            vertex(c1.x1,c1.y1);
            if(pos(c,m)){
              if(amendInnerBoundary){
                if(mousePressed){
                     lineIndex = -1;
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          //for(int j=0;j<b.innerBoundaries.size()-1;j++){
            
          //  Boundary c = b.innerBoundaries.get(j);
          //  Boundary c1 = b.innerBoundaries.get(j+1);
            
          //  vertex(c.x1,c.y1);
          //  vertex(c.x2,c.y2);
          //  //vertex(c1.x1,c.y1);
          //}
            endContour();
            //----------end shape------------------------------------
            endShape(CLOSE);
            //b.converted = true;
            //shape(b.bpath);
          //}
            //else shape(b.bpath);
          }
        if(!clear){
          
          for(int j=0;j<b.Boundaries.size();j++){
        
            Boundary c = b.Boundaries.get(j);
            lineHover = false;
            
            if(pos(c,m)){
              lineIndex = j;
              
              if(amendInnerBoundary){
                if(mousePressed){
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          lindex = k;
          
          if(lineHover&&shapeIndex==-1)shapeIndex = i;
          else lcount++;
        }}
          if(hcount>0) hover2 = true;
          else hover2  = false;
    }
    rmenu();
    int n = Boundaries.size();
    if(pcount==0)phover = false;
    if(lcount==0){lhover = false;lineIndex = -1;}
    if(hcount==n&&lcount==n&&pcount==n)shapeIndex=-1;
    if(clear)clear();
    
    
  };
  
  public void clear(){
    //Boundary a = Boundaries.get(0);
      //Boundaries = new ArrayList<Boundary>();
      //Boundaries.add(a);
      lineIndex = -1;
      shapeIndex = -1;
      palleteTab = null;
      setupPallete();
      for (int i=Boundaries.size()-1;i>0;i--)Boundaries.remove(i);
      clear = false;
  };
  
  public void draw2(){
    logic();
    debug();
    
    strokeWeight(1);
    for(int i=0;i<Boundaries.size();i++){
      Boundary b = Boundaries.get(i);
      b.id = i;
      move(b,m);
      beginShape();
      stroke(0);
      vertex(b.x1,b.y1);
      vertex(b.x2,b.y2);
      endShape(CLOSE);
    }
  };

  public void draw3(){
    strokeWeight(1);
    stroke(col);
    // for(int i=0;i<Boundaries.size();i++){
    //   Boundary b = Boundaries.get(i);
    //   b.id = i;
    //   line(b.x1,b.y1,b.x2,b.y2);
    // }
    // vertex(x1,y1);
    // vertex(x2,y2);
    line(x1,y1,x2,y2);
  };

  public void drawLine(){
    strokeWeight(1);
    stroke(0);
    line(x1,y1,x2,y2);
  };
  
  public void trace(){
    
    //scene.draw(9);
    
  };
  
  public void rmenu(){
    logic();
    
    if(clear){
       shapeIndex = -1;
       lineIndex = -1;
     }
      if((open||none)){
        
         settings.visible = false;
       
       if(showgrid){
         if(gridlayout==null){
           gridlayout = new Grid(x+1,y+1,w,h,15);
         }
         gridlayout.toggle=true;
         //gridlayout.gridFunctions();
         gridlayout.displayGridAsLines();
         //gridlayout.terrain2d = true;
         }

       else if(type==-2)gridlayout.toggle=false;
       pallete.draw();
       
       //if(mousePressed&&mouseButton == RIGHT&&!rtoggle){rtoggle = true;}
         //-----------------------------------------------------------------------------
         
         if(mousePressed&&mouseButton==RIGHT&&!rtoggle&&!contextClick)rtoggle=true;
         
         
         if(rtoggle&&edit){
           
         contextDel.visible = false;
         convertToPath.visible = false;
         context.visible = false;
         connectedlMenu.visible = false;
         
         if(shapeIndex==-1)options = 0;
         else {
           if(Boundaries.get(shapeIndex).type==106){
             numm = shapeIndex;
               if(pcount==1)options = 5;
               else if(lcount==pcount) options = 1;
              //else if((pcount<lcount))options = 1;
              //else options = 5;
         }else {
               if(pcount==lcount&&pcount>0)options = 3;
              else if(pcount>lcount)options = 2;
              else if((pcount<lcount))options = 1;
              else options = 4;
         }}
         if(!edit||Boundaries.size()==0)options=4;
         context.x = mouseX;
         context.y = mouseY;
         
         connectedlMenu.x = mouseX;
         connectedlMenu.y = mouseY;
         
         contextDel.x = mouseX;
         contextDel.y = mouseY;
         
         convertToPath.x = mouseX;
         convertToPath.y = mouseY;
         
         
         if(options==1)contextDel.items.get(0).label = "Delete Point";
         else if(options==2)contextDel.items.get(0).label = "Delete Line";
         
         contextDel.items.get(2).label = "Shape : " + shapeIndex + ", " + lineIndex;
         convertToPath.items.get(2).label = "Shape : " + shapeIndex + ", " + lineIndex;
         connectedlMenu.items.get(2).label = "Shape : " + shapeIndex + ", " + lineIndex;
         
         if(!mousePressed){
           contextClick = true;
           rtoggle=false;
         }}
         //------------------------------------------------------------------------------------
         //if(mousePressed&&mouseButton==LEFT)options = 4;
         if(options==0){
           contextDel.visible = false;
           convertToPath.visible = false;
           context.visible = true;
           connectedlMenu.visible = false;
           settings.x = context.x;
           settings.y = context.y+context.h;
           settings.visible = true;
         }
         else if(options==1||options==2){
             contextDel.visible = true;
             convertToPath.visible = false;
             context.visible = false;
             connectedlMenu.visible = false;
             settings.x = contextDel.x;
             settings.y = contextDel.y+contextDel.h;
             settings.visible = true;
           }else if(options==3){
             contextDel.visible = false;
             convertToPath.visible = true;
             context.visible = false;
             connectedlMenu.visible = false;
             settings.x = convertToPath.x;
             settings.y = convertToPath.y+convertToPath.h;
             settings.visible = true;
           }else if(options==4){
             contextDel.visible = false;
             convertToPath.visible = false;
             context.visible = false;
             connectedlMenu.visible = false;
             settings.x = mouseX;
             settings.y = mouseY;
             settings.visible = true;
           }else if(options==5){
             connectedlMenu.visible = true;
             contextDel.visible = false;
             convertToPath.visible = false;
             context.visible = false;
             settings.x = connectedlMenu.x;
             settings.y = connectedlMenu.y+connectedlMenu.h;
             settings.visible = true;
           }
           
         if(contextClick){
         if(contextDel.visible){
           contextDel.draw();
         if(mousePressed&&!contextDel.items.get(0).pos()&&!contextDel.items.get(1).pos()&&!settings.pos()){
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }}
         else if(context.visible){
           context.draw();
           if(mousePressed&&!context.items.get(0).pos()&&!context.items.get(1).pos()&&!settings.pos()){
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }}
         else if(convertToPath.visible){
            convertToPath.draw();
            //if(mousePressed&&mouseButton==LEFT){
              if(mousePressed&&convertToPath.items.get(1).pos()){
                if(shapeIndex>-1)Boundaries.remove(shapeIndex);
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }else if(mousePressed&&convertToPath.items.get(0).pos()){
                calcInner(Boundaries.get(shapeIndex));
                calcOuter(Boundaries.get(shapeIndex));
                
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }else if(mousePressed&&!convertToPath.items.get(0).pos()&&!convertToPath.items.get(1).pos()&&!settings.pos()){
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }}
           else if(connectedlMenu.visible){
             connectedlMenu.draw();
             
             if(mousePressed&&connectedlMenu.items.get(2).pos()){
                if(numm>-1)Boundaries.remove(numm);
                rtoggle=false;
                contextClick=false;
                settings.visible = false;
           }else if(mousePressed&&connectedlMenu.items.get(0).pos()){
                calcInner(Boundaries.get(numm));
                calcOuter(Boundaries.get(numm));
                
                rtoggle=false;
                contextClick=false;
           }}
         else if (mousePressed&&!settings.pos()){
           contextClick = false;
           rtoggle = false;
       }}}
         
         if(contextClick&&!contextDel.pos()&&context.pos()&&!settings.pos()&&!convertToPath.pos()&&mousePressed){
           contextClick=false;
           rtoggle = false;
         }
       
           
  };
  
  public void update(Boundary a){
    float midx = 0;
    float midy = 0;
    
    float aa = 0.05f;
    vcount = 0;
    
    //dir = atan2(a.Boundaries.get(0).y1 - center.y,a.Boundaries.get(0).x1 - center.x);
    //line(Boundaries.get(0).x1,Boundaries.get(0).y1,center.x,center.y);
    if(type!=0){
      
      if(!mousePressed){trow = true;}
      
      if(gravity){
        
        //updateg = true;
        if(falling){
          vy += gconst;
          if(vy>=4)vy = 4.0f;
          if(vy<=-4)vy = -4.0f;
          if(vy>=4)vy = 4.0f;
          if(vy<=-4)vy = -4.0f;
          center.y += vy;
        }
        if(type!=2){
          update_Boundaries();
          a.update_angles();
          create_rotation_points(Boundaries);
        }else{
          //center.x = (x1+x2)/2;
          //center.y = (y1+y2)/2;
          a.update_line();
        }
        
      }else updateg = false;
    
      for(int i=0;i<Boundaries.size();i++){
        
        Boundary b = Boundaries.get(i);
        
        if(b.y1>=floor)vcount++;rotatep = (new PVector(b.x1,b.y1));
        if(b.y2>=floor)vcount++;rotatep = (new PVector(b.x2,b.y2));
      }
      
      if(vcount>0) falling = false;
      if(vcount>0) rotating = true;
    
    }
    
    if(type==0){
      if(gravity){
        
        if(center.y<floor){
          vy += ay;
          center.y += vy;
       }}}
    
    strokeWeight(20);
    stroke(255);
    point(center.x,center.y);
    strokeWeight(1);
    
      if(!mousePressed)sdown = false;linedown = false;
      if(mousePressed&&!linedown)linedown = true;
      
      if(!mousePressed&&!a.point1&&!a.point2&&!a.point3&&a.updatep&&a.uindex==id&&a.type!=2){
        
        calc_center();
        update_dist(Boundaries);
        a.create_rotation_points(Boundaries);
        a.update_angles();
        a.updatep = false;
      }
  };
  
  public void create_points(ArrayList<Boundary> a){
    for(int i=0;i<a.size();i++){
      
      Boundary b = a.get(i);
      if(points.size()==i)points.add(new PVector(b.x1,b.y1));
      }
  };
  
  public void create_angles(ArrayList<Boundary> a){
    for(int i=0;i<a.size();i++){
      
      Boundary b = Boundaries.get(i);
      
      float t1 = atan2(b.y1 - center.y,b.x1 - center.x);
      
      if(theta.size()<a.size())theta.add(t1);
      else theta.set(i,t1);
    }
  };
  
  public void update_points(ArrayList<Boundary> a){
    
    
    for(int i=0;i<a.size();i++){
      
      PVector b = points.get(i);
      
      float d1 = dist(b.x,b.y,center.x,center.y);
      
      float t1 = theta.get(i);;
      
      float ax = center.x + (d1) * cos(t1);
      float ay = center.y + (d1) * sin(t1);
      
      if(points.size()<a.size())points.add(new PVector(ax,ay));
      else rotation_points.set(i,new PVector(ax,ay));
    }
  };
  
  public void create_dist(){
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      
      dist.add(dist(center.x,center.y,b.x1,b.y1));
    }
  };
  
  public void update_Boundaries(){
    
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      
      float t = theta.get(i);
      Float d = dist.get(i);
      
      float t1 = 0;
      Float d1 = dist.get(i);
      
      if(i<Boundaries.size()-1){
        t1 = theta.get(i+1);
        d1 = dist.get(i+1);
      }else if(type!=106){
        t1 = theta.get(0);
        d1 = dist.get(0);
      }
      strokeWeight(10);
      stroke(0);
      
      b.x1 = center.x + d * cos(t);
      b.y1 = center.y + d * sin(t);
      if(type!=106){
      b.x2 = center.x + d1 * cos(t1);
      b.y2 = center.y + d1 * sin(t1);
      }else {
        
      }
      strokeWeight(1);
    }
  };
  
  public void update_line(){
    
    Boundary a = Boundaries.get(0);
    
    float b = theta.get(0);
    Float d = dist.get(0);
    
    a.x1 = center.x - d * cos(b) ;
    a.y1 = center.y - d * sin(b) ;
    
    a.x2 = center.x + d * cos(b) ;
    a.y2 = center.y + d * sin(b) ;
  };
  
  public void update_Boundaries(Boundary a){
    
    for(int i=0;i<a.Boundaries.size();i++){
      
      Boundary b = a.Boundaries.get(i);
      
      float t = a.theta.get(i);
      Float d = a.dist.get(i);
      
      float t1 = 0;
      Float d1 = a.dist.get(i);
      
      if(i<Boundaries.size()-1){
        t1 = a.theta.get(i+1);
        d1 = a.dist.get(i+1);
      }else if(a.type!=106){
        t1 = a.theta.get(0);
        d1 = a.dist.get(0);
      }
      strokeWeight(10);
      stroke(0);
      
      b.x1 = center.x + d * cos(t);
      b.y1 = center.y + d * sin(t);
      if(a.type!=106){
      b.x2 = center.x + d1 * cos(t1);
      b.y2 = center.y + d1 * sin(t1);
      }
      strokeWeight(1);
    }
  };
  
  public void rotate(float t){
    
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      float t2 = theta.get(i);
      float d2 = dist.get(i);
      
      if(i<theta.size()-1){
        t2 = theta.get(i+1);
        d2 = dist.get(i+1);
      }else if(type!=106){
        t2 = theta.get(0);
        d2 = dist.get(0);
      }
      
      b.x1 = center.x + dist.get(i) * cos(theta.get(i)+radians(t));
      b.y1 = center.y + dist.get(i) * sin(theta.get(i)+radians(t));
      
      b.x2 = center.x + d2 * cos(t2+radians(t));
      b.y2 = center.y + d2 * sin(t2+radians(t));
    }
    
  };
  public void rotate2(float t){
    
    float t3 = radians(90);
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      float t2 = theta.get(i);
      float d2 = dist.get(i);
      
      if(i<theta.size()-1){
        t2 = theta.get(i+1);
        d2 = dist.get(i+1);
      }else if(type!=106){
        t2 = theta.get(0);
        d2 = dist.get(0);
      }
      
      b.x1 = center.x + dist.get(i) * cos(theta.get(i)+(t)+t3);
      b.y1 = center.y + dist.get(i) * sin(theta.get(i)+(t)+t3);
      
      b.x2 = center.x + d2 * cos(t2+(t)+t3);
      b.y2 = center.y + d2 * sin(t2+(t)+t3);
    }
    
  };
  
  public void update_angles(){
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      
      float t = atan2(b.y1 - center.y,b.x1 - center.x);
      if(i<theta.size())theta.set(i,t);
      else theta.add(t);
    }
  };
  
  public void angular_vel(float a, float u){
    
  };
  
  public void create_rotation_points(ArrayList<Boundary>a){
    
    float d = 10;
    
    for(int i=0;i<a.size();i++){
      
      Boundary b = a.get(i);
      
      float d1 = dist(b.x1,b.y1,center.x,center.y);
      
      float t1 = atan2(b.y1 - center.y,b.x1 - center.x);
      
      float ax = center.x + (d1+d) * cos(t1);
      float ay = center.y + (d1+d) * sin(t1);
      
      if(rotation_points.size()<a.size())rotation_points.add(new PVector(ax,ay));
      else rotation_points.set(i,new PVector(ax,ay));
    }
    
  };
  
  public void rotate_about(PVector a,Float v){
    
    for(int i=0;i<Boundaries.size();i++){
      
      Boundary b = Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,center.x,center.y);
      float d2 = dist(b.x2,b.y2,center.x,center.y);
      float t1 = atan2(b.y2 - b.y1,b.x2 - b.x1);
      float t2 = atan2(b.y1 - b.y2,b.x1 - b.x2);
      
      b.x1 = center.x + d1 * cos(t1+v);
      b.y1 = center.y + d1 * sin(t1+v);
      b.x2 = center.x + d2 * cos(t2+v);
      b.y2 = center.y + d2 * sin(t2+v);
    }
    
  };
  
  public void pos_rotationpoint(Boundary a){
    
    float X = mouseX;
    float Y = mouseY;
    
    t2 = 0;
    float t0 = 0;
    
    boolean k = false;
    
    for(int i=0;i<a.rotation_points.size();i++){
      PVector b = a.rotation_points.get(i);
      
      float d1 = dist(b.x,b.y,X,Y);
      
    if(d1<5){
      strokeWeight(5);
      stroke(255);
      point(b.x,b.y);
      if(mousePressed&&!point3){
        point3 = true;
        vert = i;
        index = a.id;
        rdown = true;
      }}}
      
      if(point3&&mousePressed&&index == a.id&&!point1&&!point2&&!linedown){
        rdown = true;
        float t2 = atan2(a.center.y -  mouseY,a.center.x - mouseX);
        
        for(int i=0;i<a.Boundaries.size();i++){
          
          Boundary b = a.Boundaries.get(i);
          
          PVector c = a.rotation_points.get(i);
          PVector d = null;
          
          float d1 = dist(c.x,c.y,a.center.x,a.center.y)-10;
          float t1 = atan2(a.center.y - c.y,a.center.x - c.x);
          
          float d2 = 0,t3 = 0;
          
          if(i<a.Boundaries.size()-1)d = a.rotation_points.get(i+1);
          else if(a.type!=106)d = a.rotation_points.get(0);
          
          if(d!=null){
          d2 = dist(d.x,d.y,a.center.x,a.center.y)-10;
          t3 = atan2(a.center.y - d.y,a.center.x - d.x);
          }
          b.x1 = a.center.x + d1 * cos(t1 + t2);
          b.y1 = a.center.y + d1 * sin(t1 + t2);
          
          b.x2 = a.center.x + d2 * cos(t3 + t2);
          b.y2 = a.center.y + d2 * sin(t3 + t2);
        }}
        
      if(!mousePressed&&point3){
        vert = -1;
        vert1 = -1;
        index = -1;
        rdown = false;
        point3 = false;
        a.update_dist(a.Boundaries);
        a.create_rotation_points(a.Boundaries);
        uindex = a.id;
        updatep = true;
      }
  };
  
  public void calc_center(){
    
    float midx = 0;
    float midy = 0;
    
    for(int i=0;i<Boundaries.size();i++){
      Boundary b = Boundaries.get(i);
      midx += (b.x1 + b.x2)/2;
      midy += (b.y1 + b.y2)/2;
    }
    
    midx /= Boundaries.size();
    midy /= Boundaries.size();
    
    center = new PVector(midx,midy);
  };
  
  public void logic(){
    if((tri||toggle||circle||bezier||square||spline||poligon||c_poligon||connectedlines||path)){ open = true;}
    if(mousePressed&&open_menus)menudown = true;
    else menudown = false;
    if(none)open = false;
    if(pallete!=null)pallete.click(12,main,"clear");
    if(hidemenu){
      
      if(pallete.x+pallete.w>=0){
      //if(type==0)palletelist.menu.x -= 2;
      pallete.x -= 6;
      for(int i=0;i<pallete.items.size();i++){
        Button a = pallete.items.get(i);
        a.x = pallete.x;
      }
      rect(pallete.x,pallete.y,pallete.w,pallete.h);
      }else if(pallete.x+pallete.w<0){
      palletehide.draw();
      
      if(palletehide.pos()&&mousePressed){
        hidemenu = false;
        pallete.items.get(10).toggle=0;
      }
    }}else if(pallete!=null&&pallete.x<0){
      main.pallete.items.get(15).toggle=0;
      pallete.x += 6;
      for(int i=0;i<pallete.items.size();i++){
        Button a = pallete.items.get(i);
        a.x = pallete.x;
      }
      rect(pallete.x,pallete.y,pallete.w,pallete.h);
    }
    
    
    if(type==-1&&clear){
      Boundaries = new ArrayList<Boundary>();
      ArrayList<Float[]> velocity = new ArrayList<Float[]>();
      ArrayList<PVector> velocitypv = new ArrayList<PVector>();
      ArrayList<Boundary> Quadrants = new ArrayList<Boundary>();
      ArrayList<PVector> Midpoints = new ArrayList<PVector>();
      clear = false;
    }
  };
  
  public void mtranslate(Boundary b ,PVector m){
    
    float mx = m.x;
    float my = m.y;
    
    if(!point1&&!point2&&!point3&&!linedown&&!rdown&&type!=2){
      if(pos(b,m)&&mousePressed&&!tdown){
         index = b.id;
         deltamx = (b.center.x - mx);
         deltamy = (b.center.y - my);
         
         b.tdown = true;
         tdown = true;
    }}
    
    
    if(b.tdown&&index == b.id&&type!=2){
      if(index>=0){
        
      Boundary c = Boundaries.get(index);
      b.center.x = mx + deltamx;
      b.center.y = my + deltamy;
      b.create_rotation_points(b.Boundaries);
      //b.update_angles();
      b.update_Boundaries();
      }}
    
    if(!mousePressed&&type!=2){
      if(index>=0){
        Boundary c = Boundaries.get(index);
        index = -1;
        deltamx = 0;deltamy = 0;
        uindex = c.id;
        updatep = true;
        b.tdown = false;
        tdown = false;
      
    }}
    
  };
  
  public void mtranslate(PVector m){
    
    float mx = m.x;
    float my = m.y;
    
   if(mousePressed&&!mdown){
    mdown = true; 
    dx = center.x - mx;
    dy = center.y - my;
   }
    
   if(mdown){
     center.x = mx + dx;
     center.y = my + dy;
   }
     update_Boundaries();
   if(!mousePressed){
     mdown = false;
     
   }
   
  };
  
  public void functions(){
      debug();
      if(!edit&&!open_menus&&!pallete.pos()&&open&&!palletehide.pos()){
    if (toggle)create();
    else if (square)create_rect();
    else if(circle)create_circle();
    else if(tri)create_tri();
    else if(bezier)create_bezier();
    else if(poligon)create_poligon();
    else if(complex)create_complex_poligon();
    else if(connectedlines)connectedLines();
    else if(path)drawPath();
    else if(spline){
      
    }}
  
  };
  
  public boolean pos(Boundary a,PVector p){
    float X = p.x;
    float Y = p.y;
    boolean k = false;
    trit = 0;
    if(a.type==0){
          
          float mx = abs((a.x2-a.x1))/2;
          float my = abs((a.y2-a.y1))/2;
          
          float A = sq(X - a.center.x);
          float B = sq(Y - a.center.y);
          
          float C = sq(mx);
          float D = sq(my);
          return A/C + B/D <1;
          
      } if(a.type==2){
      return check_lineP(new PVector(a.x1,a.y1),new PVector(a.x2,a.y2),new PVector(X,Y));
    }
      if(a.type==4||a.type==3||a.type==103||a.type==201){
      
      for(int i=0;i<a.Boundaries.size();i++){
        
        Boundary b = a.Boundaries.get(i);
        
        Boundary A = new Boundary((b.x1 + b.x2)/2,(b.y1 + b.y2)/2,X,Y);
        
        for(int j=0;j<a.Boundaries.size();j++){
          
          Boundary C = a.Boundaries.get(j);
          
          PVector i1 = check_intersect(A,C);
          
          if(i1!=null&&i!=j){
            trit++;
            
          }}}
          if(trit>0)k = false;
          else k = true;
      }
    return k;
    
  };
    
  public boolean check_lineP(PVector a, PVector b,PVector c){
    
    boolean k = false;
    float d1 = dist(a.x,a.y,b.x,b.y);
    float d2 = dist(a.x,a.y,c.x,c.y);
    float d3 = dist(b.x,b.y,c.x,c.y);
    float d4 = d2 + d3;
    
    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f){
      k = true;
    }
    return k;
  };
  
  public boolean check_lineP(float x1, float y1,float x2,float y2, PVector c){
    
    boolean k = false;
    float d1 = dist(x1,y1,x2,y2);
    float d2 = dist(x1,y1,c.x,c.y);
    float d3 = dist(x2,y2,c.x,c.y);
    float d4 = d2 + d3;
    
    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f){
      k = true;
    }
    return k;
  };
  
  public void drag(){
  };
  
  public boolean pospoint(Boundary a,int n){
    float X = mouseX;
    float Y = mouseY;
    
    boolean k = false;
    
    for(int i=0;i<a.Boundaries.size();i++){
      Boundary b = a.Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,X,Y);
      float d2 = dist(b.x2,b.y2,X,Y);
      
    if(d1<5){
      k = true;
    }
      
      if(d2<5){
        k = true;
    }}
    return k;
  };
  
  public void pospoint(Boundary a){
    float X = mouseX;
    float Y = mouseY;
    
    t = 0;
    
    boolean k = false;
    //if(!a.linedown){
    for(int i=0;i<a.Boundaries.size();i++){
      Boundary b = a.Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,X,Y);
      float d2 = dist(b.x2,b.y2,X,Y);
      
    if(d1<5){
      strokeWeight(5);
      stroke(255);
      point(b.x1,b.y1);
      if(mousePressed&&!point1&&!a.point1){
        
        t++;
        vert = i;
        index = a.id;
        point1 = true;
        a.point1 = true;
        a.pdown = true;
        pdown = true;
      }}
      
      if(d2<5){
      strokeWeight(5);
      stroke(255);
      point(b.x2,b.y2);
      if(mousePressed&&!point2&&!a.point2){
        
        t++;
        vert1 = i;
        index = a.id;
        point2 = true;
        a.point2 = true;
        a.pdown = true;
        pdown = true;
      }}
      if(point1&&vert>=0&&index==a.id){
        Boundary c = a.Boundaries.get(vert);
        c.x1 = X;
        c.y1 = Y;
      }
      if(point2&&vert1>=0&&index==a.id){
        Boundary c = a.Boundaries.get(vert1);
        c.x2 = X;
        c.y2 = Y;
      }
      if(a.type==2){
        a.x1 = b.x1;a.y1 = b.y1;
        a.x2 = b.x2;a.y2 = b.y2;
      }
      if(a.type==4){
        
          if(vert==0)a.x1 = b.x1;
          if(vert==1)a.x2 = b.x1;
          if(vert==2)a.x3 = b.x1;
          if(vert==3)a.x4 = b.x1;
          
          if(vert1==0)a.x2 = b.x2;
          if(vert1==1)a.x3 = b.x2;
          if(vert1==2)a.x4 = b.x2;
          if(vert1==3)a.x1 = b.x2;
        }
      if(a.type==3||a.type==103){
        if(vert==0)a.x1 = b.x1;a.y1 = b.y1;
        if(vert==1)a.x2 = b.x1;a.y2 = b.y1;
        if(vert==2)a.x3 = b.x1;a.y3 = b.y1;
        
        if(vert1==0)a.x2 = b.x2;a.y2 = b.y2;
        if(vert1==1)a.x3 = b.x2;a.y3 = b.y2;
        if(vert1==2)a.x1 = b.x2;a.y1 = b.y2;
     
    }}
      
    if(t>0){
      k = true;
      hover = true;
    }
    if(!mousePressed){
      a.update_dist(a.Boundaries);
      a.calc_center();
      a.create_rotation_points(a.Boundaries);
      a.update_angles();
    }
    if(!mousePressed){
      
      vert = -1;
      vert1 = -1;
      index = -1;
      point1 = false;
      point2 = false;
      a.point2 = false;
      a.point1 = false;
      uindex = a.id;
      updatep = true;
      a.pdown = false;
      pdown = false;
      
    }
  };
  
  public void update_dist(ArrayList<Boundary> a){
   
    
    for(int i=0;i<a.size();i++){
      
      Boundary b = a.get(i);
      int id = b.id;
      //float Dist = dist.get
      float dx = (b.x1 - center.x);
      float dy = (b.y1 - center.y);
      float d  = dist(b.x1,b.y1,center.x,center.y);
      Float [] d1 = {dx,dy};
      
      if(dist.size()==Boundaries.size()){dist.set(i,d);}
      else {dist.add(d);}
      if(pdist.size()==Boundaries.size()*2)pdist.set(i,d1);
      else pdist.add(d1);
    }
  };
  
  public void move(Boundary a,PVector p){
    float mx = p.x;
    float my = p.y;
    
    boolean down = false;
    
    for (int i=0;i<a.Boundaries.size();i++){
      
      Boundary b = a.Boundaries.get(i);
      
     float d1 = dist(b.x1,b.y1,mx,my);
     float d2 = dist(b.x2,b.y2,mx,my);
     
    boolean k = check_lineP(b.x1,b.y1,b.x2,b.y2,new PVector(mx,my));
    if(k&&!linedown&&d1>6&&d2>6&&!point1&&!point2&&mousePressed&&!a.linedown){
      vert3 = i;
      sid = a.id;
      D1 = d1;
      D2 = d2;
      T1 = atan2(b.y2 - b.y1,b.x2 - b.x1);
      T2 = atan2(b.y1 - b.y2,b.x1 - b.x2);
      
      linedown = true;
      a.linedown = true;
    }}
    
    if(linedown && sid==a.id && a.linedown&&a.Boundaries.size()>0){
      
      Boundary b   = a.Boundaries.get(vert3);
      Boundary b_1 = a.Boundaries.get(0);
      Boundary bp1 = a.Boundaries.get(0);
      
      if(vert3>0)b_1 = a.Boundaries.get(vert3-1);
      else if(a.type!=106)b_1 = a.Boundaries.get(a.Boundaries.size()-1);
      if(vert3<a.Boundaries.size()-1)bp1 = a.Boundaries.get(vert3+1);
      else if(a.type!=106)bp1 = a.Boundaries.get(0);
      
      stroke(255,0,0);
      PVector p1 = new PVector( mx + D2 * cos(T1),my + D2 * sin(T1));
      PVector p2 = new PVector( mx + D1 * cos(T2),my + D1 * sin(T2));
      //line(p1.x,p1.y,p2.x,p2.y);
      
      b.x2 = p1.x;
      b.y2 = p1.y;
      b.x1 = p2.x;
      b.y1 = p2.y; 
      
      b_1.x2 = p2.x;
      b_1.y2 = p2.y;
      bp1.x1 = p1.x;
      bp1.y1 = p1.y;
      
    }
    
    if(!mousePressed&&a.linedown){
      D1 = 0;D2 = 0;T1 = 0;T2 = 0;vert3 = -1;sid = -1;down = false;
      a.update_dist(a.Boundaries);
      uindex = a.id;
      updatep = true;
      linedown = false;
      a.linedown = false;
    }
  };
  
  public void create_circle(){
    float ax = mouseX;
    float ay = mouseY;
    
    Boundary n;
    if (circle&&!menudown&&mousePressed&&mouseButton == LEFT&&shapes.toggle==0&&mouseX>main.x&&mouseY>main.y){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(1);
      stroke(col);
      ellipseMode(CORNER);
      ellipse(temp.get(0).x,temp.get(0).y,dx,dy);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      Boundary a = new Boundary(temp.get(0).x,temp.get(0).y,dx,dy,0);
      a.id = Boundaries.size();
      Boundaries.add (a);
      //scene.Boundaries.add (a);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      mdown = false;
      
      updateSliderMenu(a);
      
      }}
  };
  
  public void updateSliderMenu(Boundary a){
    
      settings = new sliderBox(X, 10,90,5,settingsLabel,palleteTab);
      settings.visible = true;
      settings.parentCanvas = true;
      palleteTab.addState(1);
      palleteTab.states.get(palleteTab.states.size()-1).sliderBoxes.add(settings);
  }
  
  public void create(){
    
    float ax = mouseX;
    float ay = mouseY;
    
    Boundary n;
    //temp = new ArrayList<
    
      if (toggle&&!menudown&&mousePressed&&!open_menus&&mouseButton == LEFT&&mouseX>main.x&&mouseY>main.y&&shapes.toggle==0){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
      
      temp.add(new PVector(ax,ay));
      
      line(temp.get(0).x,temp.get(0).y,temp.get(temp.size()-1).x,temp.get(temp.size()-1).y);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      n = new Boundary(temp.get(0).x,temp.get(0).y,temp.get(temp.size()-1).x,temp.get(temp.size()-1).y,2);
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2(temp.get(temp.size()-1).y - temp.get(0).y,temp.get(temp.size()-1).x - temp.get(0).x));
      norm.add(atan2(temp.get(temp.size()-1).x - temp.get(0).x, temp.get(temp.size()-1).y - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      
      }mdown = false;
    }
  };
  
  public void create_tri(){
    
    float ax = mouseX;
    float ay = mouseY;
    
    Boundary n;
    float d;
    
    if (tri&&mousePressed&&!open_menus&&shapes.toggle==0&&mouseButton == LEFT&&mouseX>main.x&&mouseY>main.y){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
      
      temp.add(new PVector(ax,ay));
      d = dist(ax,ay,temp.get(0).x,temp.get(0).y);
      
      float Norm = -atan2(temp.get(0).x - ax,temp.get(0).y - ay);
      
      float X2 = ax + d/1.5f * cos(Norm);
      float Y2 = ay + d/1.5f * sin(Norm);
      float X3 = ax - d/1.5f * cos(Norm);
      float Y3 = ay - d/1.5f * sin(Norm);
      
      beginShape();
      stroke(255);
      fill(0);
      
      vertex(temp.get(0).x,temp.get(0).y);
      vertex(X2,Y2);
      vertex(X3,Y3);
      endShape(CLOSE);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      n = new Boundary(temp.get(0).x,temp.get(0).y,ax,ay,3);
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2(temp.get(temp.size()-1).y - temp.get(0).y,temp.get(temp.size()-1).x - temp.get(0).x));
      norm.add(atan2(temp.get(temp.size()-1).x - temp.get(0).x, temp.get(temp.size()-1).y - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      updateSliderMenu(n);
      }mdown = false;
    }
  };
  
  public void create_rect(){
    
    float ax = mouseX;
    float ay = mouseY;
    //if(mousePressed)println(shapes.toggle);
    if (square&&!menudown&&mousePressed&&!open_menus&&shapes.toggle==0&&mouseButton == LEFT&&mouseX>main.x&&mouseY>main.y){
      
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(20);
      stroke(0);
      point(ax,ay);
      strokeWeight(1);
      stroke(col);
      rect(temp.get(0).x,temp.get(0).y,dx,dy);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      Boundary a = new Boundary(temp.get(0).x,temp.get(0).y,dx,dy,4);
      a.id = Boundaries.size();
      Boundaries.add (a);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      updateSliderMenu(a);
      }
    }
  };
  
  public void create_poligon(){
    float ax = mouseX;
    float ay = mouseY;
    
    Boundary n;
    
    Sides.draw();
    sides = PApplet.parseInt(Sides.value);
    if(sides>0){
      
    if (mousePressed&&mcount==0&&!complexsub.pos()&&shapes.toggle==0&&mouseX>main.x&&mouseY>main.y){
      
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(20);
      stroke(0);
      point(ax,ay);
      strokeWeight(1);
      stroke(col);
      beginShape();
      
      float X = (temp.get(0).x + ax)/2;
      float Y = (temp.get(0).y + ay)/2;
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        
        float w = abs((temp.get(0).x - ax))/2;
        float h = abs((temp.get(0).y - ay))/2;
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        vertex(a.x,a.y);
        
        //vertex(X + w * cos(theta2),Y + h * sin(theta2));
        
      }
      endShape(CLOSE);
      }
      if(mdown&&!mousePressed){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
        n = new Boundary(temp.get(0).x,temp.get(0).y,ax,ay,201);
        float X = (temp.get(0).x + ax)/2;
        float Y = (temp.get(0).y + ay)/2;
        n.center = new PVector(X,Y);
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        float theta2 = radians(360/sides*(i+1));
        
        float w = abs((temp.get(0).x - ax))/2;
        float h = abs((temp.get(0).y - ay))/2;
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        PVector b = new PVector(X + w * cos(theta2),Y + h * sin(theta2));
        //vertex(a.x,a.y);
        n.Boundaries.add(new Boundary(a.x,a.y,b.x,b.y));
        
      }
      
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      updateSliderMenu(n);
      }}}else {
        fill(255);
        noStroke();
        rect(100,100,200,15);
        text("Please define number of sides",100,100);
        
      }
  };
  
  public void create_bezier(){
    
  };
  
  public void create_complex_poligon(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){mcount = 0;}
    //text(x + "         " + scene.x + "          " + scene.w,100,110);
    if(complex){
      
      complexsub.draw();
      
      for(int i=0;i<ogrid.size();i++){
          Point a = ogrid.get(i);
          
          a.draw();
        }
      
      if(mousePressed&&mcount==0&&!complexsub.pos()&&shapes.toggle==0&&mouseX>main.x&&mouseY>main.y)mdown = true;
      else mdown = false;
      if(mdown) mcount++;
      if(mousePressed&&complexsub.pos()){
        cfinish = true;
        temp = new ArrayList<PVector>();
      }
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        counter++;
        if(!complexsub.pos())grid.add(new Point(floor(mx/sw)*sw,floor(my/sh)*sh,counter));
        polymidpoint = new PVector(0,0);
        ogrid = new ArrayList<Point>();
        for(int i=0;i<grid.size();i++){
          Point a = grid.get(i);
          boolean b = ugrid.contains(a);
          
          if(!b){
            ugrid.add(a);
            polymidpoint.x += a.x;
            polymidpoint.y += a.y;
          }}polymidpoint.div(grid.size());}
          
            sortpoints(grid,ugrid,ogrid,polymidpoint);
  
        if(ogrid.size()>1&&!cfinish){
          for(int i=0;i<ogrid.size();i++){
          Point a = ogrid.get(i);
          int pos = 0;
            
          if(i<ogrid.size()-1){
            pos = i+1;
          }
          else{
            pos = 0;
          }
          
          Point b = ogrid.get(pos);
          stroke(0);
          strokeWeight(1);
          line(b.x,b.y,a.x,a.y);
          
        }}
        
        strokeWeight(20);
        stroke(0);
        point(polymidpoint.x,polymidpoint.y);
        strokeWeight(1);
        }
        
        if(cfinish){
          
          Boundaries.add(new Boundary(ogrid));
          
          ogrid = new ArrayList<Point>();
          grid = new ArrayList<Point>();
          ugrid = new ArrayList<Point>();
          
          cfinish = false;
        }
    
  };
  
  public void connectedLines(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){
      mcount = 0;
      pointadded = false;
    }
    if(connectedlines){
      complexsub.draw();
      
      if(mousePressed&&mcount==0&&!complexsub.pos()&&shapes.toggle==0)mdown = true;
      else mdown = false;
      if(mousePressed&&complexsub.pos())cfinish = true;
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        if(!complexsub.pos()){
          Point a = new Point(floor(mx/sw)*sw,floor(my/sh)*sh,grid.size());
          Point b;
          boolean k = grid.contains(a);
          if(grid.size()==0)grid.add(a);
          else{
            b = grid.get(grid.size()-1);
            if(b.x!=a.x||b.y!=a.y)grid.add(a);
          }}
        //pointadded = true;
      }
        for(int i=grid.size()-1;i>-1;i--){
          Point a = grid.get(i);
          
          a.draw();
          
        if(grid.size()>1&&!cfinish){
          int pos = 0;
            
          if(i<grid.size()-1)pos = i+1;
          
          Point b = grid.get(pos);
          stroke(0);
          strokeWeight(1);
          if(i<grid.size()-1)line(b.x,b.y,a.x,a.y);
          
        }}
        
        if(cfinish){
          
          Boundary a = new Boundary(grid,0);
          
          if(grid.size()>0)Boundaries.add(a);
          
          grid = new ArrayList<Point>();
          updateSliderMenu(a);
          cfinish = false;
          mdown = false;
        }}
        strokeWeight(1);
  };
  
  public void drawPath(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){
      mcount = 0;
      pointadded = false;
    }
    if(path){
      complexsub.draw();
      
      if(mousePressed&&mcount==0&&!complexsub.pos()&&shapes.toggle==0)mdown = true;
      else mdown = false;
      if(mousePressed&&complexsub.pos())cfinish = true;
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        if(!complexsub.pos()){
          Point a = new Point(floor(mx/sw)*sw,floor(my/sh)*sh,grid.size());
          Point b;
          boolean k = grid.contains(a);
          if(grid.size()==0)grid.add(a);
          else{
            b = grid.get(grid.size()-1);
            if(b.x!=a.x||b.y!=a.y)grid.add(a);
          }}
        //pointadded = true;
      }
        for(int i=grid.size()-1;i>-1;i--){
          Point a = grid.get(i);
          
          a.draw();
          
        if(grid.size()>1&&!cfinish){
          int pos = 0;
            
          if(i<grid.size()-1)pos = i+1;
          
          Point b = grid.get(pos);
          stroke(0);
          strokeWeight(1);
          if(i<grid.size()-1)line(b.x,b.y,a.x,a.y);
          
        }}
        
        if(cfinish){
          
          if(grid.size()>0)Boundaries.add(new Boundary(grid,0));
          
          grid = new ArrayList<Point>();
          
          cfinish = false;
          mdown = false;
        }}
        strokeWeight(1);
  };
  
  public void create_free(){
    
  };
  
  public Boolean posWindow(){
    
    float mx = mouseX;
    float my = mouseY;
    
    return(mx>x1&&mx<x2&&my>y1&&my<y2);
    
  };
  
  public void mass_Center(){
    
    ccount = 0;
    PVector Center = new PVector(0,0);
    if(center == null|| center !=Center){
      for(int i=0;i<Boundaries.size();i++){
        
        Boundary a = Boundaries.get(i);
        PVector midp = new PVector((a.x1+a.x2)/2,(a.y1+a.y2)/2);
        Center.add(midp);
        Midpoints.add(midp);
        ccount++;
      }
      if(ccount==Boundaries.size())center = Center;
    }
  };
    
};

public PVector check_intersect(Boundary a, Boundary b){

  float a1 = a.y2 - a.y1;
  float b1 = a.x1 - a.x2;
  float c1 = a1 * a.x1 + b1 * a.y1;
  float a2 = b.y2 - b.y1;
  float b2 = b.x1 - b.x2;
  float c2 = a2 * b.x1 + b2 * b.y1;
  float denom = a1 * b2 - a2 * b1;
  
  if((a.x1==b.x1||a.x2==b.x2)&&(a.y1==b.y1||a.y2==b.y2)){
    
    return null;
  }
    else{
      
  Float X = (b2 *c1 - b1 * c2) / denom;
  Float Y = (a1 *c2 - a2 * c1) / denom;
  
  PVector p = new PVector(X,Y);   
    boolean Linea = ((p.x<a.x1&&p.x>a.x2)||(p.x>a.x1&&p.x<a.x2))||((p.y<a.y1&&p.y>a.y2)||(p.y>a.y1&&p.y<a.y2));
    boolean Lineb = ((p.x<b.x1&&p.x>b.x2)||(p.x>b.x1&&p.x<b.x2))||((p.y<b.y1&&p.y>b.y2)||(p.y>b.y1&&p.y<b.y2));
    boolean Linec = (p.x!=a.x1&&p.x!=a.x2)&&(p.y!=a.y1&&p.y!=a.y2);
    
    Linec = (dist(p.x,p.y,a.x1,a.y1)>0.5f&&dist(p.x,p.y,a.x1,a.y1)>0.5f);
      if(Linec&&Linea&&Lineb){
          //strokeWeight(20);
          //  stroke(0);
          //  point(p.x,p.y);
          //  strokeWeight(1);
      return p;
    }
    else{
    return null;
    }}
};

public PVector check_intersect2(Boundary a, Boundary b){

  float a1 = a.y2 - a.y1;
  float b1 = a.x1 - a.x2;
  float c1 = a1 * a.x1 + b1 * a.y1;
  float a2 = b.y2 - b.y1;
  float b2 = b.x1 - b.x2;
  float c2 = a2 * b.x1 + b2 * b.y1;
  float denom = a1 * b2 - a2 * b1;
  
  Float X = (b2 *c1 - b1 * c2) / denom;
  Float Y = (a1 *c2 - a2 * c1) / denom;
  
  PVector p = new PVector(X,Y);   
    boolean Linea = ((p.x<=a.x1&&p.x>=a.x2)||(p.x>=a.x1&&p.x<=a.x2))||((p.y<=a.y1&&p.y>=a.y2)||(p.y>=a.y1&&p.y<=a.y2));
    boolean Lineb = ((p.x<=b.x1&&p.x>=b.x2)||(p.x>=b.x1&&p.x<=b.x2))||((p.y<=b.y1&&p.y>=b.y2)||(p.y>=b.y1&&p.y<=b.y2));
    boolean Linec = (p.x==a.x1||p.x==a.x2)||(p.y==a.y1||p.y==a.y2);
    boolean Lined = (p.x==b.x1||p.x==b.x2)&&(p.y==b.y1||p.y==b.y2);
      if(Linea&&Lineb||Linec){
      return p;
    }
    else{
    return null;
    }
};
  
class Connection{
  float d,e,x,y;
  //ArrayList<Integer[]> vertex = new ArrayList<Integer[]>();
  PVector c;
  
  Connection(PVector C){
    c = C;
    x = c.x;
    y = c.y;
    
  };
  
  
};

class _rect{
  
  float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
  boolean border, dashed,connected;
  PVector pos,vel,ac;
  int bg,str;
  Boundary rect;
  
  _rect(float xx,float yy,float ww,float hh){
    x = xx;
    y = yy;
    h = hh;
    w = ww;
    
    rect = new Boundary(xx,yy,ww,hh,4);
  };
  
  public void draw(){
    
  }
  
};
  
class _tri{
    
  float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
  boolean border, dashed,connected,fill = true;
  PVector pos,vel,ac;
  int bg = color(0,180),str = color(0);
  Boundary tri;
  Human parent;
  
  _tri(float xx,float yy,float ww,float hh){
    x = xx;
    y = yy;
    h = hh;
    w = ww;
    
    tri = new Boundary(x,y,10,20,103);
  };
  _tri(){
  };
  
  public void draw(){
    beginShape();
    stroke(str);
    if(!border)noStroke();
    fill(bg);
    if(parent!=null)fill(parent.col);
    if(!fill)noFill();
    
    for(int i=0;i<tri.Boundaries.size();i++){
      Boundary b = tri.Boundaries.get(i);
      vertex(b.x1,b.y1);
      //vertex(b.x1,b.y1);
    }
    endShape(CLOSE);
  }
  public void update(){
    for(int i=0;i<tri.Boundaries.size();i++){
      Boundary b = tri.Boundaries.get(i);
      
      b.create_rotation_points(tri.Boundaries);
      b.update_dist(tri.Boundaries);
      b.update_angles();
      b.create_angles(tri.Boundaries);
    }
  };

  public boolean pos(PVector a){
    boolean k = false;
    
    if(tri.pos(tri,a))k = true;
    return k;
  }
};
  
class _ellipse{
    
    float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
    boolean border, dashed,connected;
    PVector pos,vel,ac;
    int bg,str;
    Boundary ellipse;
    
    _ellipse(float xx,float yy,float ww,float hh){
      x = xx;
      y = yy;
      h = hh;
      w = ww;
      
      ellipse = new Boundary(xx,yy,ww,hh,2);
    };
    
    public void draw(){
      
    }
    
};
  
class Point{
  
  float x,y;
  int id;
  
  Point(float X, float Y,int Id){
    
    x = X;
    y = Y;
    id = Id;
  }
  
  public void draw(){
    
    strokeWeight(8);
    stroke(0);
    point(x,y);
    //float t1 = atan2(y-H/2,x-W/2);
    //float t1 = atan2(y-Boundary.midpoint.y,x-midpoint.x);
    
  }
};

public void sortpoints(ArrayList<Point> grid,ArrayList<Point> ugrid,ArrayList<Point> ogrid,PVector midpoint){
  
  if(ogrid.size()!=grid.size()){
    if(ugrid.size()>0){
    
    Point next = closest(ugrid,midpoint);
    
    if(next!=null){
      
      next.id = ogrid.size();
      
      boolean c = ogrid.contains(next);
      
      if(!c){
      int k = ugrid.indexOf(next);
      ogrid.add(next);
      ugrid.remove(k);
    
  }}}}
};
  
public Point closest(ArrayList<Point> a,PVector midpoint){
    
    Point k = a.get(0);
    int c = 1;
    for(int i=c;i<a.size();i++){
      
      Point b = a.get(i);
      
      float t1 = atan2(k.y-midpoint.y,k.x-midpoint.x);
      float t2 = atan2(b.y-midpoint.y,b.x-midpoint.x);
      t1 = map(t1,-PI,PI,PI,0);
      t2 = map(t2,-PI,PI,PI,0);
      
      if(t1<t2){
        k = b;
      }}
    
    return k;
};
  
 class Polygon extends Boundary{
    
    Polygon(float xx,float yy,float ww,float hh,int _sides){
      
    sides = _sides;
    x1 = xx;
    y1 = yy;
    w = ww;
    h = hh;
    ax = xx + ww;
    ay = yy + hh;
    
    Boundary n;
    
    Sides.draw();
    sides = PApplet.parseInt(Sides.value);
    
        n = new Boundary(xx,yy,ax,ay,201);
        
        float X = (xx + w)/2;
        float Y = (yy + h)/2;
        
        n.center = new PVector(X,Y);
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        float theta2 = radians(360/sides*(i+1));
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        PVector b = new PVector(X + w * cos(theta2),Y + h * sin(theta2));
        //vertex(a.x,a.y);
        n.Boundaries.add(new Boundary(a.x,a.y,b.x,b.y));
        
      }
      
      n.id = Boundaries.size();
      Boundaries.add (n);
      
      theta.add(atan2((y1 + hh) - y1,(x1 + ww) - x1));
      norm.add(atan2((x1 + ww) - x1, (y1 + hh) - y1));
      
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      
      }
      
};
class Button{
  
  public float x,y,bx = x,by = y,w,h,size,textsize = 12,xoff,yoff,bsize,tsize = 12,tyoff,txoff,tmax = 2;
  int id,toggle,toggle2,type;
  float scalew,scaleh;
  
  public String label,blabel;
  PImage img;
  boolean drag,resize, radio,update,border = true,vertical,horizontal,gif,Img,value,textright,textbtm,textleft,textup,texttoggle,animate = true,toggleb,mdown,sdown,visible = true
          ,up,right,down,togglebar,togglebox,mdown2,textcheck,parentCanvas,subLeft,click,mclick,m2down,toggle_;
  int fcol = color(255,80),bcol = color(0,100),hcol = color(255,50),col = fcol,tcol = color(255),col1 = fcol;
  Menu parent;
  Menu submenu;
  Window subwindow;
  listBox sublist;
  ArrayList<Button> buttons = new ArrayList<Button>();
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  String Text = "" ;
  TextBox textbox;
  PVector mouse;
  tab parentTab;
  Dropdown dMenu;
  tooltip info;
  
  Button(float xx, float yy, float ww, float hh, String Label){
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    label = Label;
    blabel = label;
    size = 1;
    textsize = 12;
    bsize = tsize;
    
  }
  
  Button(float xx, float yy, float ww, float hh){
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    size = 1;
    textsize = 12;
    bsize = tsize;
  }
  
  Button(float xx, float yy, float ww, float hh,int Cols){
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    size = 1;
    tsize = 12;
    bsize = tsize;
    value = true;
    textbox = new TextBox(x,y,ww+1,hh,Cols);
  }
  
  Button(float xx, float yy, float ww, float hh,int Cols, String Label){
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    size = 1;
    tsize = 12;
    bsize = tsize;
    label = Label;
    blabel = label;
    value = true;
    textbox = new TextBox(x,y,ww+1,hh,Cols,Label);
  }
  
  public Button(){
    
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void btn(){
    if(!radio&&!togglebar){
      stroke(255);
      strokeWeight(size);
      if(!border)noStroke();
      if(parent!=null&&type!=0){
        x = parent.x;
        //y = parent.y;
      }
      
      fill(50);
      rect(x,y,w,h);
      fill(col);
      rect(x ,y,w,h);
      
      textSize(textsize);
      
      if(label!=null){
        
      if(scaleh>0){
        pushMatrix();
        translate(0,y*scaleh+h/2);
        scale(1,scaleh);
      }
      if(scalew>0){
        pushMatrix();
        translate(x*scalew,0);
        scale(scalew,1);
      }
      
        fill(tcol);
        textSize(bsize);
        // if(!textbtm&&!textright&&!textup)text(label,x+5+txoff,y+13+tyoff+5);
        if(textbtm)text(label,x+xoff,y+h+yoff+tsize);
        textSize(12);
        if(scaleh>0){
          scale(1,1/scaleh);
          popMatrix();
        }
        if(scalew>0){
          scale(-scalew,1/scalew);
          popMatrix();
        }
        
      }
      if(value){
        
        if(textup)textbox.y     = y - h;
        if(textbtm)textbox.y    = y + h;
        if(textleft) textbox.x  = x - w;
        if(textright) textbox.x = x + w;
        Text = textbox.textBox;
        
        if(pos()||textbox.pos()||textbox.toggle==1)texttoggle=true;
        else texttoggle = false;
        if(texttoggle)textbox.draw();
        if(textbox.pos()&&mousePressed&&parent!=null){ parent.draw();}
        else parent.toggle=0;
      }
      if(img!=null){
        image(img,x,y+1,w,h);
      }}
  };
  
  public void toggleBar(){
    
  };
  
  //void radio(){
    
  //};
  
  public void draw(){
    logic();
    textSize(12);
    
    btn();
    if(radio){
      fill(0);
      stroke(col);
      if(!border)noStroke();
      
      if(w>h){
      fill(fcol);
      rect(x +textWidth(label)+20,y,w,h);
      if(label!=null){
        textSize(tsize);
        if(up)text(label,x,y-3);
        if(right)text(label,x+w+2,y);
        if(down)text(label,x,y+tsize*2+2);
        else text(label,x +5 + txoff,y + tsize + tyoff);
        textSize(12);
      }
      fill(bcol);if(toggle==1)fill(255);
      ellipse(x+w/2 +textWidth(label)+20,y+h/2,w-8,h-8);
    }
    else if(w==h){
      fill(fcol);
      rect(x + textWidth(label)+5,y,w,h);
      if(label!=null){
        textSize(tsize);
        if(up)text(label,x,y-3);
        if(right)text(label,x+w+2,y);
        if(down)text(label,x,y+tsize*2+2);
        else text(label,x + 5 +txoff,y+w/2+tsize/2+tyoff);
        textSize(12);
      }
      fill(bcol);if(toggle==1)fill(255);
      ellipse(x+w/2 + textWidth(label)+5,y+h/2,w-8,h-8);
    }}
    
    else if(togglebar){
      fill(0);
      stroke(col);
      if(!border)noStroke();
      
      if(w>h){
      fill(fcol);
      rect(x + textWidth(label)+5,y,w,h);
      if(label!=null){
        textSize(tsize);
        if(up)text(label,x,y-3);
        if(right)text(label,x+w+2,y);
        if(down)text(label,x,y+tsize*2+2);
        else text(label,x + 5 + txoff,y+tsize + tyoff + 4);
        textSize(12);
      }
      fill(bcol);
      if(toggle==0){rect(x +textWidth(label)+5+ w/2,y,w/2,h);text("OFF",x+textWidth(label)+w+10+txoff,y+tsize+tyoff+4);}
      else{ rect(x+textWidth(label)+5,y,w/2,h);text("ON",x+textWidth(label)+w+10+txoff,y+tsize+tyoff+4);}
    }
    else{
      fill(fcol);
      rect(x+textWidth(label),y,w,h);
      if(label!=null){
        textSize(tsize);
        if(up)text(label,x,y-3);
        if(right)text(label,x+w+2,y);
        if(down)text(label,x,y+tsize*2+2);
        else text(label,x + 5 +txoff,y+w/2+tsize/2+tyoff);
        textSize(12);
      }
      fill(fcol);
      if(toggle==0){rect(x+textWidth(label)+h/2,y,w,h/2);text("OFF",x+textWidth(label)+txoff,y+h+2+tyoff+4);}
      else{ rect(x + textWidth(label),y,w,h/2);text("ON",x+textWidth(label)+txoff,y+h+2+tyoff+4);}
    }}

    else if(togglebox){
      fill(0);
      stroke(col);
      if(!border)noStroke();
      
      if(w>h){
      fill(fcol,0);
      if(toggle==1)fill(bcol);
      rect(x,y,w,h);
      if(label!=null){
        fill(tcol);
        textSize(tsize);
        if(up)text(label,x,y-3);
        if(right)text(label,x+w+2,y+tyoff);
        if(down)text(label,x,y+tsize*2+2+tyoff);
        else text(label,x +5 + txoff,y+tsize + tyoff + 4);
        textSize(12);
      }}
      else{
        fill(fcol);
        if(toggle==1)fill(bcol);
        if(!border)noStroke();
        rect(x,y,w,h);
        if(label!=null){
          textSize(tsize);
          if(up)text(label,x,y-3);
          if(right)text(label,x+w+2,y);
          if(down)text(label,x,y+tsize*2+2);
          else text(label,x + 5 +txoff,y+w/2+tsize/2+tyoff);
          textSize(12);
      }}}
    
    if(subpos())toggle2 = 1;
    else toggle2 = 0;
    
    strokeWeight(1);
    if(info!=null)info.draw();
  };
  
  
  
  public void logic(){
    if(animate){
      if(pos()||toggle==1){
        if(bsize<tsize+tmax) bsize += 0.5f;
      }else if(bsize>tsize)bsize -= 0.5f;
      }
      
      if(radio||togglebar){
        if(pos2()||toggle==1)bcol = hcol;
        else bcol = color(0,100);
      }
      
  };
  
  public void logic(PVector m){
    if(animate){
      if(pos(m)){
        if(bsize<tsize+tmax) bsize += 0.5f;
        }else if(bsize>tsize)bsize -= 0.5f;
      
      }
      
      if(radio||togglebar){
        // if(pos2(m)||toggle==1)bcol = hcol;
        // else bcol = color(0,100);
      }
      
  };
  
  public void draw(PGraphics canvas){
    logic(mouse);
    canvas.textSize(12);
    if(subpos(mouse)){
      //toggle = 1;
    }
    float X = 0;
    float Y = 0;
    if(parent!=null){
      X = parent.x;
      Y = parent.y;
    }
    
    if(!radio&&!togglebar){
      canvas.stroke(255);
      canvas.strokeWeight(size);
      if(!border)canvas.noStroke();
      if(parent!=null&&type!=0){
        x = parent.x;
        //y = parent.y;
      }
      
      canvas.fill(50);
      canvas.rect(x,y,w,h);
      canvas.fill(col1);
      canvas.rect(x ,y,w,h);
      
      canvas.textSize(textsize);
      
      if(label!=null){
        
      if(scaleh>0){
        canvas.pushMatrix();
        canvas.translate(0,y*scaleh+h/2);
        canvas.scale(1,scaleh);
      }
      if(scalew>0){
        canvas.pushMatrix();
        canvas.translate(x*scalew,0);
        canvas.scale(scalew,1);
      }
      
        canvas.fill(tcol);
        canvas.textSize(bsize);
        if(!textbtm&&!textright&&!textup)canvas.text(label,x+5+txoff,y+13+tyoff+5);
        if(textbtm)text(label,x+xoff,y+h+yoff+tsize);
        canvas.textSize(12);
        if(scaleh>0){
          canvas.scale(1,1/scaleh);
          canvas.popMatrix();
        }
        if(scalew>0){
          canvas.scale(-scalew,1/scalew);
          canvas.popMatrix();
        }
        
      }
      if(value){
        
        if(textup)textbox.y     = y - h;
        if(textbtm)textbox.y    = y + h;
        if(textleft) textbox.x  = x - w;
        if(textright) textbox.x = x + w;
        Text = textbox.textBox;
        
        if(pos(mouse)||textbox.pos(mouse)||textbox.toggle==1)texttoggle=true;
        else texttoggle = false;
        if(texttoggle)textbox.draw();
        if(textbox.pos()&&mousePressed&&parent!=null){ parent.draw();}
        else parent.toggle=0;
      }
      if(img!=null)canvas.image(img,x,y+1,w,h);
      }
    
    if(radio){
      canvas.fill(0);
      canvas.stroke(col);
      if(!border)canvas.noStroke();
      
      if(w>h){
      canvas.fill(fcol);
      canvas.rect(x ,y,w,h);
      if(label!=null){
        canvas.textSize(tsize);
        if(up)canvas.text(label,x,y-3);
        if(right)canvas.text(label,x+w+2,y);
        if(down)canvas.text(label,x,y+tsize*2+2);
        else canvas.text(label,x - canvas.textWidth(label) - 4 + txoff,y+tsize + tyoff);
        canvas.textSize(12);
      }
      canvas.fill(bcol);if(toggle==1)canvas.fill(255);
      canvas.ellipse(x+w/2 ,y+w/2,w-8,h-8);
    }
    else{
      canvas.fill(fcol);
      canvas.rect(x,y,h,h);
      if(label!=null){
        canvas.textSize(tsize);
        if(up)canvas.text(label,x,y-3);
        if(right)canvas.text(label,x+w+2,y);
        if(down)canvas.text(label,x,y+tsize*2+2);
        else text(label,x - textWidth(label) - 4 +txoff,y+tsize+tyoff);
        canvas.textSize(12);
      }
      canvas.fill(fcol);if(toggle==1)canvas.fill(255);
      canvas.ellipse(x+h/2,y+h/2,w-8,h-8);
    }}
    
    if(togglebar){
      canvas.fill(0);
      canvas.stroke(col);
      if(!border)canvas.noStroke();
      
      if(w>h){
      canvas.fill(fcol);
      canvas.rect(x ,y,w,h);
      if(label!=null){
        canvas.textSize(tsize);
        // if(up)canvas.text(label,x,y-3);
        // if(right)canvas.text(label,x+w+2,y);
        // if(down)canvas.text(label,x,y+tsize*2+2);
        // else text(label,x - textWidth(label) - 4 + txoff,y+tsize + tyoff + 4);
        canvas.textSize(12);
      }
      canvas.fill(bcol);
      if(toggle==0){canvas.rect(x + w/2,y,w/2,h);canvas.text("OFF",x+w+2+txoff,y+tsize+tyoff+4);}
      else{ canvas.rect(x,y,w/2,h);canvas.text("ON",x+w+2+txoff,y+tsize+tyoff+4);}
    }
    else{
      canvas.fill(fcol);
      canvas.rect(x,y,w,h);
      if(label!=null){
        canvas.textSize(tsize);
        if(up)canvas.text(label,x,y-3);
        if(right)canvas.text(label,x+w+2,y);
        if(down)canvas.text(label,x,y+tsize*2+2);
        else text(label,x - textWidth(label) - 4 +txoff,y+w/2+tsize/2+tyoff);
        canvas.textSize(12);
      }
      canvas.fill(fcol);
      if(toggle==0){canvas.rect(x+h/2,y,w,h/2);canvas.text("OFF",x+txoff,y+h+2+tyoff+4);}
      else{ canvas.rect(x,y,w,h/2);canvas.text("ON",x+txoff,y+h+2+tyoff+4);}
    }}
    else if(togglebox){
      canvas.fill(0);
      canvas.stroke(col);
      if(!border)canvas.noStroke();
      
      if(w>h){
      canvas.fill(fcol,0);
      if(toggle==1)canvas.fill(bcol);
      canvas.rect(x ,y,w,h);
      if(label!=null){
        canvas.textSize(tsize);
        // if(up)canvas.text(label,x,y-3);
        // if(right)canvas.text(label,x+w+2,y+tyoff);
        // if(down)canvas.text(label,x,y+tsize*2+2+tyoff);
        // else text(label,x - textWidth(label) - 4 + txoff,y+tsize + tyoff + 4);
        canvas.textSize(12);
      }}
    else{
      canvas.fill(fcol);
      if(toggle==1)canvas.fill(bcol);
      if(!border)canvas.noStroke();
      canvas.rect(x,y,w,h);
      if(label!=null){
        canvas.textSize(tsize);
        // if(up)canvas.text(label,x,y-3);
        // if(right)canvas.text(label,x+w+2,y);
        // if(down)canvas.text(label,x,y+tsize*2+2);
        // else canvas.text(label,x + 4 +txoff,y+w/2+tsize/2+tyoff);
        canvas.textSize(12);
      }}}
    
    if(subpos(mouse))toggle2 = 1;
    else toggle2 = 0;
    canvas.strokeWeight(1);
    if(info!=null)info.draw();
  };
  
  public void radio(){
    
    radio = true;
  };
  
  public void func(Grid a){
    
      a.draw_2d();
    
  };
  public void func(Plot_2D a){
    
      a.draw();
    
  };
  
  public void labelcheck(float a){
    
    if(textWidth(label)>a){
    for(int i=10;i<label.length();i++){
      float lw = textWidth(label.substring(0,i)+ " ...");
      if(lw>a){
        label = label.substring(0,i-1) + "...";
        textcheck = true;
        break;
      }
    }}
    else textcheck = true;
    
  };
  
  public boolean pos(){
    
    return x  < mouseX && mouseX < x + w && y < mouseY && mouseY < y + h+2;
  };
  
  public boolean pos(PVector m){
    boolean k = false;
    if(m==null&&label!=null)println(label);
    else if(x  < m.x && m.x < x + w && y < m.y && m.y < y + h+2)k = true;
    return x  < m.x && m.x < x + w && y < m.y && m.y < y + h+2;
  };
  public boolean pos(PGraphics m){
    
    return x  < mouse.x && mouse.x < x + w && y < mouse.y && mouse.y < y + h+2;
  };
  
  public boolean pos2(){
    
    return x < mouseX && mouseX < x + w + textWidth(label)+5 && y < mouseY && mouseY < y + h+2;
  };
  
  public boolean pos2(PVector m){
    
    return x < m.x && m.x < x + w + textWidth(label)+5 && y < m.y && m.y < y + h+2;
  };
  
  public boolean pos3(){
    
    return x + textWidth(label)+5 < mouseX && mouseX < x + w + textWidth(label)+5 && y < mouseY && mouseY < y + h+2;
  };
  
  public boolean pos3(PVector m){
    
    return x + textWidth(label)+5 < m.x && m.x < x + w + textWidth(label)+5 && y < m.y && m.y < y + h+2;
  };
  
  public void getValue(){
    //if(key='ENTER')
  };
  
  public void setName(String a){
    label = a;
  };
  
  public String getName(){
    String a = "";
    if (label!=null) a = label;
    
    return a;
  };
  
  public void self_toggle(){
    if(parent==null){
      if(pos()){
      toggle++;
    }
    if(toggle==2){
     toggle=0; 
    }}else{
    if(pos()&&parent.toggle==1){
      toggle++;
    }
    if(toggle==2){
     toggle=0; 
    }}
  };

  public boolean hold(){
    if(mdown)return true;
    else return false;
  };
  
  public void self_click(){
    if(!pos()&&parent!=null&&parent.toggle==1&&mousePressed){mdown = true;}
    //else if(!pos()&&parent==null&&toggle==1&&mousePressed){mdown = false;}
    if(pos()&&parent!=null&&parent.toggle==1&&!mdown){
      mdown = true;
    }
    else if(pos()&&parent==null&&!mdown){
      mdown = true;
    }
    if(mdown)toggle = 1;
    else toggle = 0;
    if(mdown && !mousePressed){mdown = false;}
  };
  
  public void self_click2(){
     if(pos()&&parent==null&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      col = hcol;
      mdown = true;
    }
    
    if(pos()&&parent==null&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      col = fcol;
      mdown = true;
    }
    
    if(!mousePressed)mdown = false;
  };
  
  public void self_click2(PVector m){
     if(pos(m)&&parent==null&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      col = hcol;
      mdown = true;
    }
    
    if(pos(m)&&parent==null&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      col = fcol;
      mdown = true;
    }
    
    if(!mousePressed)mdown = false;
  };
  
  public void self_click3(){
     if(pos()&&parent==null&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      col = hcol;
      mdown = true;
    }
    
    if(!mdown){
      toggle=0;
      col = fcol;
      mdown = true;
    }
    
    if(!mousePressed)mdown = false;
  };
  
  public void self_click4(){
    boolean k = false;
     if(pos()&&parent==null&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      col = hcol;
      mdown = true;
    }
    
    if(mdown)k = true;
    
    if(k){
      toggle=0;
      col = fcol;
      mdown = false;
    }
    
    if(!mousePressed)mdown = false;
  };

  public boolean click(){
      boolean k = false;
      // if(pos())k = true;
      // else k = false;
      if (pos()&&mousePressed&&!click){
        click = true;
        k = false;
      }else if(click&&!mousePressed){
        k = true;
        click = false;
      }
      
      return k;
  };

  public boolean click(PVector m){
      boolean k = false;
      // if(pos())k = true;
      // else k = false;
      if (pos(m)&&mousePressed&&!click){
        click = true;
        k = false;
      }else if(click&&!mousePressed){
        k = true;
        click = false;
      }
      
      return k;
  };
  
  public boolean mouseDown(){
    boolean k = false;
    if(pos()&&mousePressed)k = true;
    if(!mousePressed)k = false;
    return k;
  };
  
  public void click(Object a,String b){
    
    if(parent!=null){
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(click()&&parent.toggle==1){
           field.set(a, true); 
           toggle = 1;
         }else {
           field.set(a, false);
           toggle = 0;
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}
    else{
    
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(click()){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }
    }
  };

  public void toggleField(){

  };
  
  public void latch(Object a,String b){
    PVector n = new PVector(mouseX,mouseY);
    if(mouse!=null)n = mouse;
    boolean mousedown = false;
    if(parent!=null){
    if(pos(n)&&parent.toggle==1&&mousePressed&&toggle==0)toggle++;
    if(!mousePressed&&toggle>0){mdown = true;toggle = 0;}
    
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(mdown)field.set(a, true); 
         //else field.set(a, false); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }if(!mousePressed)mdown = false;}
    else{
      if(pos(n)&&mousePressed&&toggle==0)toggle++;
      if(!mousePressed&&toggle>0){mdown = true;toggle = 0;}
      
    
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(mdown){
           field.set(a, true); 
         }
         //else field.set(a, false); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }
  if(!mousePressed)mdown = false;
}
  };
  
  public void reverseclick(Object a,String b){
    if(parent!=null){
    //if(!pos()&&parent.toggle==1&&mousePressed)mdown = true;
    if(pos()&&parent.toggle==1&&mousePressed&&!mdown)mdown = true;
    
    if(mdown)toggle = 1;
    else toggle = 0;
    if(mdown && !mousePressed){mdown = false;}
    
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(mdown)field.set(a, true); 
         else field.set(a, false);
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}
    else{
      if(pos()&&mousePressed&&!mdown)mdown = true;
    
    if(mdown)toggle = 1;
    else toggle = 0;
    if(mdown && !mousePressed){mdown = false;}
    
    Field field = null;
    
    try{
         field = a.getClass().getField(b); 
        
         if(!mdown)field.set(a, true); 
         else field.set(a, false);
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }
    }
  };
  
   public void self_Toggle(){
   if(parent!=null){
    if(pos() && parent.toggle==1){
      toggle ++;
    
    if(toggle==2){
      toggle = 0;
    }}}else {
      if(pos()){
      toggle ++;
    
    if(toggle==2){
      toggle = 0;
    }}
    }
    
  };

  public void toggle() {
    
    if (pos()&&mousePressed&&!mdown)mdown = true;
    if(mdown&&!toggle_&&!m2down){
      toggle_ = true;
      m2down = true;
    }
    if(mdown&&toggle_&&!m2down){
      toggle_ = false;
      m2down = true;
    }
    
    if(!mousePressed){
      mdown = false;
      m2down = false;
    }
    
  };
  
  public void toggle( String b){
    if(parent!=null){
    if(pos() && parent.toggle==1){
      toggle ++;
      
      if(toggle==2){
        toggle=0;
    }}
    if(pos() && parent.toggle==1){
        
    
         //if(toggle==1)field.set(a, true); 
         //else if(toggle==0)field.set(a, false);
        }}
    
    else{
      
    }
  };
  
  public void toggle(Object a, String b){
    if(parent!=null){
    if(pos() && parent.toggle==1){
      toggle ++;
      
      if(toggle==2)toggle=0;
    }
    if(pos() && parent.toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1)field.set(a, true); 
         else if(toggle==0)field.set(a, false);
         
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}}else{
      
      if(pos()){
      toggle ++;
      if(toggle==2)toggle=0;
    }
    if(pos()&&toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1)field.set(a, true); 
         else if(toggle==0)field.set(a, false);
         
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}}
  };

  public void toggle(Object a, String b,PGraphics c){
    
    if(mousePressed){
    if(parent!=null){
    if(pos(mouse) && parent.toggle==1){
      toggle ++;
      if(toggle==2)toggle=0;
    }
    if(pos(mouse) && parent.toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1)field.set(a, true); 
         else if(toggle==0)field.set(a, false);
         
    }catch (NullPointerException e) {
      println("np np");
    }catch (NoSuchFieldException e) {
      println("np nsf");
    }catch (IllegalAccessException e) {
      println("np ia");
    }}}else{
      
      if(pos(mouse)&&mousePressed&&!mdown){
      toggle ++;
      if(toggle==2)toggle=0;
      mdown = true;
    }
    if(pos(mouse)){
      
    Field field = null;
    
    try{
      
        field = a.getClass().getField(b); 
        
        if(toggle==1)field.set(a, true); 
        else if(toggle==0)field.set(a, false);
        if(field.getBoolean(a)==true)c.fill(255,0,0);
        // else c.fill(255,255,0);
        // c.ellipse(mouse.x,mouse.y,20,20);
        //  if(mousePressed)println(a,b,field.get(a));
    }catch (NullPointerException e) {
      println("p np");
    }catch (NoSuchFieldException e) {
      println("p nsf");
    }catch (IllegalAccessException e) {
      println("p ia");
    }}}}
    if(!mousePressed)mdown = false;
  };
  
  public void toggle(PApplet a, String b){
    if(parent!=null){
    if(pos() && parent.toggle==1){
      toggle ++;
      
      if(toggle==2){
        toggle=0;
    }}
    if(pos() && parent.toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1)field.set(a, true); 
         else if(toggle==0)field.set(a, false);
         
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}}
    
    else{
      
    }
  };
  
  
  public void toggle2(Object a, String b){
    
    
    if(parent!=null){
    if(pos()&&parent.toggle==1&&mousePressed&&toggle==0&&!mdown){
      toggle=1;
      mdown = true;
    }
    
    if(pos()&&parent.toggle==1&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    
    if(pos() && parent.toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1)field.set(a, true); 
         else field.set(a, false);
         
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}}
    else {
      
    if(pos()&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      mdown = true;
    }
    
    else if(pos()&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    
    if(mdown){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}if(!mousePressed)toggle = 0;}
  };
  
  public void toggle4(Object a, String b){
    
    
    if(parent!=null){
    if(pos()&&parent.toggle==1&&mousePressed&&toggle==0&&!mdown){
      toggle=1;
      mdown = true;
    }
    
    if(pos()&&parent.toggle==1&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    
    if(pos() && parent.toggle==1){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}}
    else {
      
    if(pos()&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      mdown = true;
    }
    
    else if(pos()&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    
    if(mdown){
        
    Field field = null;
    
    //try{
      
    //     field = a.getClass().getField(b); 
        
    //     if(toggle==1&&field){
    //     }else if(toggle==1&&!field){
    //       field.set(a, true);
    //     }else if(toggle==0&&!field){
    //     }else if(toggle==0&&field){
    //       field.set(a, false);
    //     }
    //}catch (NullPointerException e) {
    //}catch (NoSuchFieldException e) {
    //}catch (IllegalAccessException e) {
    //}
  }
  }
  };
  
  public void toggled(Object a,String b){
    //if(dclick)
    if(pos()&&mousePressed&&toggle==0&&!mdown){
      toggle++;
      mdown = true;
    }
    
    else if(pos()&&mousePressed&&toggle>0&&!mdown){
      toggle=0;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    
    if(mdown){
        
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}
  
  };
  
   public void sptoggle(Object a, String b,String [] c){
     
     
    if(pos() && parent.toggle==1){
      toggle ++;
      if(toggle==2){
        toggle=0;
    }}
    if(pos() && parent.toggle==1){
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
         
         if(toggle==1){
           
           field.set(a, true); 
         }else {
           field.set(a, false);
           //println("button ",next,a," ");
         }}catch (NoSuchFieldException e) {
           println("nsf");
          }catch (NullPointerException e) {
            println("npe");
          }catch (IllegalAccessException e) {
            println("iae");
          }
          
        for(int i=0;i<c.length;i++){
           String next = c[i];
           if(next!=b){
             //println("button ",next,b," ");
             try{
             field = a.getClass().getField(next); 
             field.set(a, false); 
             parent.items.get(i).toggle=0;
             //print(field.get(a)," ");
             }catch (NullPointerException e) {
               println("nsf");
             }catch (NoSuchFieldException e) {
               println("npe");
             }catch (IllegalAccessException e) {
               println("iae");
             }
           }}}
  };

  public void sptoggle2(Object a, String b,String [] c){
     
     
    if(pos() && parent.toggle==1){
      toggle ++;
      if(toggle==2){
        toggle=0;
    }}
    if(pos() && parent.toggle==1){
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
         
         if(toggle==1){
           
           field.set(a, true); 
         }else {
           field.set(a, false);
           //println("button ",next,a," ");
         }}catch (NoSuchFieldException e) {
           println("nsf");
          }catch (NullPointerException e) {
            println("npe");
          }catch (IllegalAccessException e) {
            println("iae");
          }
          
        for(int i=0;i<c.length;i++){
           String next = c[i];
           if(next!=b){
             println("button ",next,b," ");
             try{
             field = a.getClass().getField(next); 
             field.set(a, false); 
             print(field.get(a)," ");
             }catch (NullPointerException e) {
               println("nsf");
             }catch (NoSuchFieldException e) {
               println("npe");
             }catch (IllegalAccessException e) {
               println("iae");
             }
           }}}
  };
  
  public void toggle3(Object a, String b){
    
    if(mousePressed&&pos()){
      toggle++;
    }
    
    if(toggle>2)toggle=0;
    
    Field field = null;
    
    try{
      
         field = a.getClass().getField(b); 
        
         if(toggle==1){
           field.set(a, true); 
         }else {
           field.set(a, false);
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }
  };
  
  public void highlight2(){
    col = color(255,50);
  }
  
  public void highlight3(){
    // if(pos())col = color(255,255,255,80);
    // else col = color(255,255,255,50);
    
  };
  
  public void highlight(){
    if(toggle==1)col = hcol;
    else col = fcol;
    if(buttons.size()==0){
    if(pos())col = hcol;
    else col = fcol;
    }else{
      if(pos())col = hcol;
      else col = fcol;
    }
  };
  
  public void highlight(PVector m){
    if(toggle==1||pos(m))col1 = hcol;
    else if(!pos(m))col1 = fcol;
    
    // if(buttons.size()==0){
    // if(pos(m))col = hcol;
    // else col = fcol;
    // }else{
    //   if(pos(m))col = hcol;
    //   else col = fcol;
    // }
  };
  
  public boolean subpos(){
     float X = 0;
     float Y = 0;
      if(parent!=null){
        X = parent.x;
        Y = parent.y;
      }
    
      return mouseX> x + w-20+xoff&& mouseX < x + w&& mouseY > y&& mouseY < y + h;
    
  };
  
  public boolean subpos(PVector m){
     float X = 0;
     float Y = 0;
      if(parent!=null){
        X = parent.x;
        Y = parent.y;
      }
    
      return m.x> x + w-20+xoff&& m.x < x + w&& m.y > y&& m.y < y + h;
    
  };
  
  public boolean subposLeft(){
     float X = 0;
     float Y = 0;
      if(parent!=null){
        X = parent.x;
        Y = parent.y;
      }
    
      return mouseX> x&& mouseX < x + 20&& mouseY > y&& mouseY < y + h;
    
  };
  
  public boolean subposLeft(PVector m){
    
      return m.x> x&& m.x < x + 20&& m.y > y&& m.y < y + h;
    
  };
};

class ButtonGrid{
  
};

class listBox{
  
  float x,y,w,h,vspacing,hspacing;
  ArrayList<Button> buttons = new ArrayList<Button>();
  String type;
  boolean vertical, horizontal,Menu,toggle;
  Menu menu;
  Menu mlist;
  
  listBox(float xx, float yy,float ww,int num){
    
    x = xx;
    y = yy;
    w = ww;
    h = (20) * num;
    Menu = true;
    
    menu = new Menu(x,y,w,h,"none");
    
    for(int i=0;i<num;i++){
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
    menus.add(menu);
  };
  
  listBox(int xx, int yy,int ww,int hh,int num){
    
    x = xx;
    y = yy;
    w = ww;
    h = (20) * num;
    Menu = true;
    
    menu = new Menu(x,y,w,h,"none");
    
    for(int i=0;i<num;i++){
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
    menus.add(menu);
  };
  
  listBox(float xx, float yy,float ww,int num,Menu m){
    
    x = xx;
    y = yy;
    w = ww;
    h = (20) * num;
    
    menu = new Menu(x,y,w,h);
    menu.listbox = true;
    
    for(int i=0;i<num;i++){
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
    //menus.add(menu);
  };
  
  listBox(int xx, int yy,int ww,int num,Menu m){
    
    x = xx;
    y = yy;
    w = ww;
    h = (20) * num;
    
    menu = m;
    menu.listbox = true;
    
    for(int i=0;i<num;i++){
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
    //menus.add(menu);
  };
  
  listBox(float xx, float yy,float ww,int num,Menu m,String[] list){
    
    x = xx;
    y = yy;
    w = ww;
    h = (20) * num;
    
    menu = m;
    menu.h = m.h;
    
    for(int i=0;i<num;i++){
      
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      if(i<list.length){
        String label = list[i];
        a.label = label;
      }
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
      
      
  };
  
  listBox(float xx, float yy,float ww,Menu m,String[] list){
    
    x = xx;
    y = yy;
    w = ww;
    h = m.h;
    
    menu = m;
    //menu.listbox = true;
    menu.h = list.length*20;
    
    for(int i=0;i<list.length;i++){
      
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      if(i<list.length){
        String label = list[i];
        a.label = label;
      }
      a.border = false;
      a.parent = menu;
      buttons.add(a);
      menu.items.add(a);
    }
  };
  
  listBox(float xx, float yy,float ww,Menu m,String[] list,int k){
    
    x = xx;
    y = yy;
    w = ww;
    h = m.h;
    
    menu = m;
    menu.h = list.length*20;
    //menu.listbox = true;
    
    for(int i=0;i<list.length;i++){
      
      float ypos = y+(20) *i;
      Button a =  new Button(x ,ypos,w,20);
      //a.id = i;
      if(i<list.length){
        String label = list[i];
        a.label = label;
      }
      a.border = false;
      a.parent = menu;
      a.togglebox = true;
      buttons.add(a);
      //menu.w = textWidth(a.label);
      menu.items.add(a);
    }
  ////if(menu.label!=null)menus.add(menu);
  if(menu.label!=null)menus.add(this.menu);
    
  };
  
  public void draw(){
    if(Menu){
      if(toggle)menu.draw();
    }else{
    menu.draw();
    }
  }
  
  public void display(String a){
    
    if(a=="vertical"|| a== "Vertical"){
      float k = 0;
      menu.vertical = true;
      
      k = menu.h;
      menu.h = menu.w ;
      h = w;
      menu.w = k;
      w = k;
      
      for(int i=0;i<menu.items.size();i++){
        
        Button b = menu.items.get(i);
      b.horizontal = false;
      k = b.w;
      b.w = b.h;
      b.h = k;
      }
    }
    
  };
  
  public void set(int b, String a){
    
    menu.items.get(b).label = a;
  };
  
  public void set(int a, String b, String c){
    
  };
  
  public void toggle(int i,Object o,String b){
    Button a = new Button();
    menu.items.get(i).toggle(o,b);
  };
  
  public void click(int i,Object a,String b){
    Button k = menu.items.get(i);
    k.click(a,b);
    
      try{
      
         Field field = a.getClass().getField(b); 
         
         if(k.toggle==1){
           field.set(a, true); 
         }else {
           field.set(a, false);
           }
          }catch (NullPointerException e) {
          }catch (NoSuchFieldException e) {
          }catch (IllegalAccessException e) {
          }
  };
  
  
  public void set(int c, Grid_space a, String b,float d, float e){
    //sliders.get(c).slide(float d,float e, 
  };
  
  public void set(Entity a, String b){
    
  };
  
  public void set(Window a, String b){
    
  };
  
  public void set(Menu a, String b){
    
  };
  
  public void set(Boundary a, String b){
    
  };
  
  public void set(Plot_2D a, String b){
    
  };
  
  public void setbg(){
    
  };
  
  
};
  float minageh = 100;
  float maxageh = 200;

  class Entity{

  int id,xp,yp,txtb_value,vcount,polarity = floor(random(-2,2)),pos,race,ent,function = floor(random(0,6)),eIndex1 = -1,eIndex2 = -1,cIndex1,cIndex2,aIndex1,aIndex2,hRaces,acount,scount,alcount,mcount,gid,xpos,ypos,range;

  public float x,y,z,w,h,intensity,mass = random(1,2),radius = random(10,30), lifespan,intelligence,dexterity,endurance,piety,vision,health,speed,selfp,charisma,agility,reputation,sanity,humanity,faith,fresistance;

  public float homex,homey,homew,homeh,birthrate = 2000;
  public float memory,movement,respiration,sensitivity,growth,regulation,nutrition,synthesis,transportation,reparation,size,tscale = 0.3f,ssize = 1,hunger,h_cooldown,i_cooldown;

  public float age = 0,bscale = 0.2f,time,delay,r,skill,vlimit,vlimitb = vlimit,fov = 20,eating_time = random(10,20),breathingroom,breathingroomb,breathingroomb1 = breathingroom,breathingroomb2 = breathingroomb,alimit,mult1,mult2,mu,min,minb;

  float  bdir = 0,inc = 0,countdown = random(10),countdownb = countdown,offset = 100,valueOffset = random(-offset/2,offset/2),Friction,maxSeek,maxAvoid,maxAlign,minSeek,minAvoid,minAlign,maxRange,minRange;

  public float avoidance = random(0,5),cohesion = random(0,5),cohesionb,alignment,neg = 0,wandertheta = 0,wanderm = 0.2f,wandermb = wanderm,cohesionb1 = cohesion,cohesionb2 = cohesionb,separationc=1,cohesionc=1,separation = random(0,15),separationb = random(0,15),alimitb = alimit, alignmentb = alignment,avoidanceb = avoidance,alignmentc = 1,separationd = 20,separationdb,
  separationb1 = separation,separationb2 = separationb,seekN,avoidN,alignN,seekN2,avoidN2,Avoid,Cohesion,Align;

  public int carrying_capacity,boundaryspace = 30,drawtotalh;
  float vx,vy,vz,ax = 0.02f,ay = 0.02f,az = 0.1f,dir = random(-2*PI,2*PI),sumvx,sumvy,tgdist;
  public String label;
  String arrays,floats,bools;
  float a1,a2,a3,a4,a5;
  PVector p, vel = new PVector(0,0), ac,target,center = new PVector(x,y),centervel,fp = new PVector(0,0),tp = new PVector(0,0),targetb,fp2 = new PVector(0,0),centerf = new PVector(x,y),centervelf,fpf = new PVector(0,0),velf = new PVector(0,0),friction = new PVector(0,0);
  int col = color(random(255),random(255),random(255));
  int col2 = col,cols,colb = col,hcol = color(255),col3 = color(0);
  _tri tri_boundary = null;
  _tri tri_boundaryf = null;
  _tri tri_boundaryp = null;
  _rect squ_boundary;
  _ellipse ellipse_boundary;
  Boundary current_boundary;
  Boundary Boundary;
  Plant targetfruit;
  Human leader,parent,desired,owner,obstructionh;
  Species species;
  public Scene scene;
  
  String type,path;
  boolean seek,avoid,align,avoid2;
  public boolean drag,resize,seek_food,fight,mate,work,bond,hide,mazecrawler,human,plant,animal,element,real = true,dead,birth,move,toggle,idle,familyties,addh,Birth,Death;
  boolean locked,setvel,highlight,updategenes,e1down,e2down,mdown,paused;
  public boolean trackmouse,pause,dynamic,debug,boundary,reset,followb,showbroom,showta,showtb,showheading,showsliders,showview,info,merge,stop,turn,turnh,hidesliders,visible,separationManager,cohesionManager,alignmentManager,save;
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  HashMap<Integer,Float> neighbourVariables = new HashMap<Integer,Float>();
  ArrayList<Float> seekNeighbour = new ArrayList<Float>();
  ArrayList<Float> avoidNeighbour = new ArrayList<Float>();
  ArrayList<Float> alignNeighbour = new ArrayList<Float>();
  ArrayList<Float> seekNeighbour_ = new ArrayList<Float>();
  ArrayList<Float> avoidNeighbour_ = new ArrayList<Float>();
  ArrayList<Float> alignNeighbour_ = new ArrayList<Float>();
  ArrayList<Float> oscilators = new ArrayList<Float>();
  ArrayList<Float> oscilatorCounters = new ArrayList<Float>();

  //---------------Spatial partititoning variables----------------

  PVector a,v,part;
  boolean collide = false, update = false, ext = false;
  ArrayList<Integer> iid = new ArrayList<Integer>();
  ArrayList<Integer> iid2 = new ArrayList<Integer>();
  ArrayList<Quad> Neighbours = new ArrayList<Quad>();
  ArrayList<Quad> neighbourGrid = new ArrayList<Quad>();
  int t,c,t2 = 0;

  //---------------ArrayLists-------------------------

  ArrayList<ArrayList> Entities = new ArrayList<ArrayList>();
  ArrayList<Boundary> boundariesAvoid = new ArrayList<Boundary>();
  ArrayList<Boundary> boundariesFollow = new ArrayList<Boundary>();
  ArrayList<Boolean> walls = new ArrayList<Boolean>();
  ArrayList<ArrayList<Human>> Humans = new ArrayList<ArrayList<Human>>();
  public ArrayList<ArrayList<Plant>> Plants = new ArrayList<ArrayList<Plant>>();
  ArrayList<ArrayList<Animal>> Animals = new ArrayList<ArrayList<Animal>>();
  ArrayList<ArrayList<Mineral>> Minerals = new ArrayList<ArrayList<Mineral>>();
  ArrayList<ArrayList<Metal>> Metals = new ArrayList<ArrayList<Metal>>();
  ArrayList<ArrayList<Celluloid>> Celluloids = new ArrayList<ArrayList<Celluloid>>();
  ArrayList<ArrayList<Particle>> Particles = new ArrayList<ArrayList<Particle>>();
  ArrayList<Entity> neighbours = new ArrayList<Entity>();
  ArrayList<Human> neighboursH = new ArrayList<Human>();
  ArrayList<ArrayList<mazeCrawler>> Mazecrawlers = new ArrayList<ArrayList<mazeCrawler>>();

  //ArrayList<Integer> genes = new ArrayList<Integer>();
  boolean births,try_,conception;
  int child;
  float dice;
  fileOutput saveEntities = new fileOutput();
  String []saveLocations = {"entities\\humans.txt","entities\\animals.txt","entities\\particles.txt"};
  String saveLocation = "";
  String [] folder,humans,plants;

  ArrayList<Human> Children = new ArrayList<Human>();
  ArrayList<Human> family = new ArrayList<Human>();
  ArrayList<Human> avoidh = new ArrayList<Human>();
  ArrayList<Human> proximity = new ArrayList<Human>();
  ArrayList<Human> prox = new ArrayList<Human>();
  ArrayList<ArrayList<Human>> prox2 = new ArrayList<ArrayList<Human>>();
  ArrayList<ArrayList<Human>> proximity2 = new ArrayList<ArrayList<Human>>();
 
  HashMap<String,Float>genes = new HashMap<String,Float>();
  HashMap<String,Float>sgenes = new HashMap<String,Float>();
  ArrayList<String> Genes = new ArrayList<String>();
  ArrayList<String> desired_traits = new ArrayList<String>();
  ArrayList<String> desired_skill = new ArrayList<String>();

  Float [] avoid_angles = {radians(0),radians(45),radians(-45),radians(90),radians(-90),radians(135),radians(-135),radians(180)};
  Float [] avoid_angles2 = {radians(90),radians(-90),radians(135),radians(-135),radians(180)};

  String []oscilatorLabels = { "vlimit","alimit","cohesion","alignment","separation","breathingroom","separationc","cohesionc"};
  
  Entity(){
  };

  Entity(float xx, float yy,float ww,float hh){

    homex = xx;
    homey = yy;
    homew = xx + ww;
    homeh = yy + hh;
    w = ww;
    h = hh;
    //Boundary = new Boundary();
    scene = new Scene(xx,yy,w,h);
  };


  Entity(float xx, float yy,int Type){

    x = xx;
    y = yy;

  };

  public ArrayList<Human> getNeighbours2(){
    
    Entity e = entities.get(ent);

    float max = round(e.Humans.get(race).get(0).maxRange);
    float min = floor(e.Humans.get(race).get(0).minRange);
    //int clip = 0;
    //if(k1>0)clip = k1;
    ArrayList<Quad> n = new ArrayList<Quad>();
    Quad myTile = qgrid.get(pos);
    
      for(int i=floor(xpos+min);i<=xpos+max;i++){
        for(int j=floor(ypos+min);j<=ypos+max;j++){
          
          if(PApplet.parseInt(i+j*gw)<qgrid.size()&&PApplet.parseInt(i+j*gw)>0){
            
            Quad q = qgrid.get(PApplet.parseInt(i+j*gw));
            float d = dist(xpos,ypos,q.xpos,q.ypos);
            if(d<maxRange){
              if(!neighbourGrid.contains(q))neighbourGrid.add(q);
            }}
    }}
    
    //neighbourGrid = n;
    ArrayList<Human> n1 = new ArrayList<Human>();
    
    for(int i=0;i<neighbourGrid.size();i++){
      Quad a = neighbourGrid.get(i);
      for(int j=0;j<a.children.size();j++){
        Human c = a.children.get(j);
        if(c!=null&&c!=this&&!neighbours.contains(c))neighbours.add(c);
        //else break;
    }}
    
    neighboursH = n1;
    return neighboursH;
  };

  public void save(){
    //if(save){
      int n = 0;
      saveEntities.checkLocation(saveLocations[n]);
      saveEntities.open();
      for(int i=0;i<Humans.size();i++){

        ArrayList< Human> H = Humans.get(i);

        for(int j=0;j<H.size();j++){
          String s = "[";
          for (int k=0;k<H.get(j).Genes.size();k++) {
            s += H.get(j).genes.get(H.get(j).Genes.get(k)) + ",";
          }

      s = s.substring(0,s.length() - 1)+"]";
      saveEntities.write(s);
      
      }}

      for(int i=0;i<Humans.size();i++){
        //saveEntities.write("[");
        ArrayList< Human> H = Humans.get(i);
        String s = "[",s1 = "",s2 = "";

        for(int j=0;j<H.get(0).avoidNeighbour.size();j++){
          s += H.get(0).avoidNeighbour.get(j) + ",";
          //saveEntities.write(s);
        }
        for(int j=0;j<H.get(0).seekNeighbour.size();j++){
          s += H.get(0).seekNeighbour.get(j) + ",";
          //saveEntities.write(s1);
        }
        for(int j=0;j<H.get(0).alignNeighbour.size();j++){
          s += H.get(0).alignNeighbour.get(j) + ",";
          //saveEntities.write(s2);
        }
        s+= "]";
        saveEntities.write(s);
      }

      saveEntities.close();
      println(Humans.size());
      n ++;
      //saveEntities.checkLocation(saveLocations[n]);
      saveEntities.update("entities" ,"plants.txt",saveEntities.counter);
      
       saveEntities.open();
      for(int i=0;i<Plants.size();i++){
        ArrayList< Plant> H = Plants.get(i);
        for(int j=0;j<H.size();j++){
          String s = "[";
          for (int k=0;k<H.get(j).Genes.size();k++) {
            s += H.get(j).genes.get(H.get(j).Genes.get(k)) + ",";
          }
      s = s.substring(0,s.length() - 1)+"]";
      saveEntities.write(s);
      }}
      saveEntities.close();
      // n ++;

      //fRate.savePath = "entities" + "\\" + "sliders.txt";
      fRate.save.update("entities" ,"sliders.txt",saveEntities.counter);
      fRate.save();
    //}
  };

  public void load(){
    int n = 1000;
    String []s = listNames(dataPath("")+"//");
    if(s!=null&&path==null){
    for(int i=0;i<s.length;i++){
      String []s1 = match(s[i],"entities");
      if(s1!=null){
        for (int j=n; j>-1;j--){
          String []s2 = match(s[j],n + "entities");
          if(s2!=null){
            path = n + "entities";
            break;
      }}}}
      //folder = loadStrings(path);
    }

    if(folder!=null){
      s = listNames(path);

      for(int i=0;i<s.length;i++){
        String []s1 = match(s[i],"humans");
        if(s1!=null){

        }
      }
    }
    
  };

  public void Reset(){
    if(reset){
      Humans = new ArrayList<ArrayList<Human>>();
      entities.remove(ent);
      spawnRaces("human",1,200);
      btn35.toggle = 0;
      Entities_sublist.toggle = 0;
      reset = false;
    }
  };

  public void move(){

    x += random(-vx,vx);
    y += random(-vy,vy);

  };

  public void create_genes(){

  };

  public void update_Genes(){
    if(updategenes){

      for ( String key : genes.keySet() ) {

          try{
         Field field = key.getClass().getField(key);
         Float strValue = (Float) field.getFloat(key);
           genes.replace(key,strValue);

         }catch (NoSuchFieldException e) {
           }catch (IllegalAccessException e) {
         }}
      updategenes = false;
    }

    //for(int i=0;i<
  };

  public void info(){
    fill(255);
    textSize(20);
    //if(lines.scene.boundary!=null)text(lines.scene.boundary.type,100,80);
    text(Humans.size(),100,100);
    text(Plants.size(),100,120);
    text(Animals.size(),100,140);
    textSize(12);
  };
  
  public PVector futurep(){
    fp = PVector.add(p,vel.get().normalize().mult(vlimit));
    return fp;
  };

  public PVector futurep(float czone){

    return p.add(vel.normalize().mult(czone/2));
  };

  public PVector futurep(PVector a, PVector b, float c){

    return a.add(b.normalize().mult(c/2));
  };

  public PVector futurep(Human h,float czone){

    return h.p.add(h.vel.normalize().mult(czone/2));
  };

  public PVector futurep(Animal a,float czone){

    return a.p.add(vel.normalize().mult(czone/2));
  };

  public PVector futurep(Boundary b,float czone){

    return p.add(vel.normalize().mult(czone/2));
  };

  public PVector seek(PVector a){

    PVector d = PVector.sub(a,p);
    d.setMag(vlimit);

    PVector s = PVector.sub(d,vel);
    s.limit(alimit);
    return s;
  };

  public void quadPos(){

    float sw = scene.fields.get(0).w;
    float sh = scene.fields.get(0).h;

    float X = scene.x;
    float Y = scene.y;

    x = p.x;
    y = p.y;
    int xpos = floor((x-X)/sw);
    int ypos = floor((y-Y)/sh);
    if(PApplet.parseInt(xpos + ypos * (scene.cols))<scene.fields.size())pos = PApplet.parseInt(xpos + ypos * (scene.cols));
    // fill(255);
    // text(pos,p.x,p.y);

    if(iid.size()==2&&iid.get(0)!=pos)update = true;
    else update = false;
    if(iid.size()<2)update = true;

    if(iid.size()==0)iid.add(pos);
    else if(iid.get(iid.size()-1)!=pos)iid.add(pos);

    if(iid.size()>2)iid.remove(0);
  };

 

  public void separationLogic(){
    Entity e = entities.get(ent);

    int k = -1;
    int col = 255;
    float d1 = 0;
    for(int i=0;i< e.Humans.size();i++){

      float xx = W/2;
      float yy = H/2;
      float theta = radians(360/e.Humans.size());
      float r = 200;

      float x1 = xx + r * cos(theta*i);
      float y1 = yy + r * sin(theta*i);

      fill(e.Humans.get(i).get(0).col);
      float d = dist(mouseX,mouseY,x1,y1);
       d1 = dist(mouseX,mouseY,xx,yy);

      if(d<10){
        fill(255);
        k = i;
      }

      int count = 0;
      for(int j=0;j< e.Humans.size();j++){
        float cc = e.Humans.get(i).get(0).avoidNeighbour.get(j);
        if(cc>-1)count++;
      }

      text(i,x1,y1-20);
      text(eIndex1,x1+20,y1);
      text(eIndex2,x1+20,y1+10);
      text(count,x1-40,y1+10);
      ellipse(x1,y1,20,20);
      ellipse(xx,yy,30,30);
    }

      for(int i=0;i< e.Humans.size();i++){

      float xx = W/2;
      float yy = H/2;
      float theta = radians(360/e.Humans.size());
      float r = 200;

      float x1 = xx + r * cos(theta*i);
      float y1 = yy + r * sin(theta*i);


      for(int j=0;j<e.Humans.get(i).get(0).avoidNeighbour.size();j++){

        float p1 = e.Humans.get(i).get(0).avoidNeighbour.get(j);

        float x2 = xx + r * cos(theta*j);
        float y2 = yy + r * sin(theta*j);
        if(p1>0){
        stroke(0);
        ellipse(x2,y2,5,5);
        
        line(x1,y1,x2,y2);
      }}}

    if(k>-1){
      if(mousePressed&&mouseButton==RIGHT){
        for(int j=0;j< e.Humans.size();j++)e.Humans.get(k).get(0).avoidNeighbour.set(j,PApplet.parseFloat(-1));
        eIndex1 = -1;
        eIndex2 = -1;
      }
    else if(mousePressed&&!e1down&&!e2down&&!mdown){
          eIndex1 = k;
          e1down = true;
          mdown = true;
          
        }else if(mousePressed&&!e2down&&!mdown&&e1down){
          eIndex2 = k;
          e2down = true;
          mdown = true;
          e.Humans.get(eIndex1).get(0).avoidNeighbour.set(eIndex2,random(r*2,50));
          }}else {
            if(mousePressed&&mouseButton==LEFT&&!mdown&&d1<15){
              mdown = true;
              for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                if(j!=i)e.Humans.get(i).get(0).avoidNeighbour.set(j,random(r*2,50));

              }}}else if(mousePressed&&mouseButton==RIGHT&&!mdown&&d1<15){
                mdown = true;
                for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                e.Humans.get(i).get(0).avoidNeighbour.set(j,PApplet.parseFloat(-1));

              }}}}

        if(!mdown&&mousePressed){
            e1down = false;
            e2down = false;
            mdown = true;
          }
      if(!mousePressed)mdown = false;
      if(!mousePressed&&e2down&&e1down){
        e1down = false;
        e2down = false;
      }
  };

  public void cohesionLogic(){
    Entity e = entities.get(ent);

    int k = -1;
    int col = 255;
    float d1 = 0;
    

    for(int i=0;i< e.Humans.size();i++){

      float xx = W/2;
      float yy = H/2;
      
      float theta = radians(360/e.Humans.size());
      float r = 200;

      float x1 = xx + r * cos(theta*i);
      float y1 = yy + r * sin(theta*i);

      fill(e.Humans.get(i).get(0).col);
      float d = dist(mouseX,mouseY,x1,y1);
       d1 = dist(mouseX,mouseY,xx,yy);

      if(d<10){
        fill(255);
        k = i;
      }
      int count = 0;
      for(int j=0;j< e.Humans.size();j++){
        float cc = e.Humans.get(i).get(0).seekNeighbour.get(j);
        if(cc>-1)count++;
      }

      text(cIndex1,x1+20,y1);
      text(cIndex2,x1+20,y1+10);
      text(count,x1-40,y1+10);
      ellipse(x1,y1,20,20);
      ellipse(xx,yy,30,30);
    }

      for(int i=0;i< e.Humans.size();i++){

      float xx = W/2;
      float yy = H/2;
      float theta = radians(360/e.Humans.size());
      float r = 200;

      float x1 = xx + r * cos(theta*i);
      float y1 = yy + r * sin(theta*i);


      for(int j=0;j<e.Humans.get(i).get(0).seekNeighbour.size();j++){

        float p1 = e.Humans.get(i).get(0).seekNeighbour.get(j);

        float x2 = xx + r * cos(theta*j);
        float y2 = yy + r * sin(theta*j);


        if(p1>0){
        stroke(0);
        ellipse(x2,y2,5,5);
        line(x1,y1,x2,y2);
      }}}

    if(k>-1){
      if(mousePressed&&mouseButton==RIGHT){
        for(int j=0;j< e.Humans.size();j++)e.Humans.get(k).get(0).seekNeighbour.set(j,PApplet.parseFloat(-1));

        cIndex1 = -1;
        cIndex2 = -1;
      }
    else if(mousePressed&&!e1down&&!e2down&&!mdown){
          cIndex1 = k;
          e1down = true;
          mdown = true;
        }else if(mousePressed&&!e2down&&!mdown&&e1down){
          cIndex2 = k;
          e2down = true;
          mdown = true;
          e.Humans.get(cIndex1).get(0).seekNeighbour.set(cIndex2,random(5,40));
          if(cIndex1==cIndex2)e.Humans.get(cIndex1).get(0).seekNeighbour.set(cIndex2,random(r*2,50));
          }}else {
            if(mousePressed&&mouseButton==LEFT&&!mdown&&d1<15){
              mdown = true;
              for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                if(j!=i)e.Humans.get(i).get(0).seekNeighbour.set(j,random(r*2,50));

              }}}else if(mousePressed&&mouseButton==RIGHT&&!mdown&&d1<15){
                mdown = true;
               for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                e.Humans.get(i).get(0).seekNeighbour.set(j,PApplet.parseFloat(-1));

              }}}}

        if(!mdown&&mousePressed){
            e1down = false;
            e2down = false;
            mdown = true;
          }
      if(!mousePressed)mdown = false;
      if(!mousePressed&&e2down&&e1down){
        e1down = false;
        e2down = false;
      }
  };

  public void drawArrangement(ArrayList a){

  };

  public void alignmentLogic(){
    Entity e = entities.get(ent);

    int k = -1;
    int col = 255;
    float d1 = 0;
    for(int i=0;i< e.Humans.size();i++){

      float xx = W/2;
      float yy = H/2;
      float theta = radians(360/e.Humans.size());
      float r = 200;

      float x1 = xx + r * cos(theta*i);
      float y1 = yy + r * sin(theta*i);

      fill(e.Humans.get(i).get(0).col);
      float d = dist(mouseX,mouseY,x1,y1);
       d1 = dist(mouseX,mouseY,xx,yy);

      if(d<10){
        fill(255);
        k = i;
      }

      int count = 0;
      for(int j=0;j< e.Humans.size();j++){
        float cc = e.Humans.get(i).get(0).alignNeighbour.get(j);
        if(cc>-1)count++;
      }

      text(i,x1,y1-20);
      text(aIndex1,x1+20,y1);
      text(aIndex2,x1+20,y1+10);
      text(count,x1-40,y1+10);
      ellipse(x1,y1,20,20);
      ellipse(xx,yy,30,30);

      for(int j=0;j<e.Humans.get(i).get(0).alignNeighbour.size();j++){
        
        float p1 = e.Humans.get(i).get(0).alignNeighbour.get(j);

        float x2 = xx + r * cos(theta*j);
        float y2 = yy + r * sin(theta*j);

        if(p1>0){
        stroke(0);
        ellipse(x2,y2,5,5);
        line(x1,y1,x2,y2);
      }}}

    if(k>-1){
      if(mousePressed&&mouseButton==RIGHT){
        for(int j=0;j< e.Humans.size();j++)e.Humans.get(k).get(0).alignNeighbour.set(j,PApplet.parseFloat(-1));

        aIndex1 = -1;
        aIndex2 = -1;
      }
    else if(mousePressed&&!e1down&&!e2down&&!mdown){
          aIndex1 = k;
          e1down = true;
          mdown = true;
        }else if(mousePressed&&!e2down&&!mdown&&e1down){
          aIndex2 = k;
          e2down = true;
          mdown = true;
            e.Humans.get(aIndex1).get(0).alignNeighbour.set(aIndex2,random(r*2,50));
          }}else {
            if(mousePressed&&mouseButton==LEFT&&!mdown&&d1<15){
              mdown = true;
              for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                if(j!=i)e.Humans.get(i).get(0).alignNeighbour.set(j,random(r*2,50));

              }}}else if(mousePressed&&mouseButton==RIGHT&&!mdown&&d1<15){
                mdown = true;
                for(int i=0;i< e.Humans.size();i++){
                for(int j=0;j< e.Humans.size();j++){

                e.Humans.get(i).get(0).alignNeighbour.set(j,PApplet.parseFloat(-1));

              }}}}

        if(!mdown&&mousePressed){
            e1down = false;
            e2down = false;
            mdown = true;
          }
      if(!mousePressed)mdown = false;
      if(!mousePressed&&e2down&&e1down){
        e1down = false;
        e2down = false;
      }
  };

  public void manageBoundaries(){

    for(int i=0;i<main.Boundaries.size();i++){
      Boundary b = main.Boundaries.get(i);

      //if(b.mtranslate()&&mousePressed&&)
    }

  };

  public PVector seek2(PVector a){

    PVector desired = PVector.sub(a,p);  // A vector pointing from the position to the target

    // Normalize desired and scale to maximum speed
    desired.normalize();
    desired.mult(vlimit);
    // Steering = Desired minus Velocity
    PVector steer = PVector.sub(desired,vel);
    return steer.limit(alimit);  // Limit to maximum steering force

    //ac.add(steer);
  };

  public void applyFriction(){
    //Friction = mu*mass*-1;
    friction = vel.get();
    friction.mult(-1); 
    friction.normalize();
    friction.mult(mu*alimit*50);
    PVector n = PVector.div(friction,mass);
    //friction.setMag(mu*mass*-1);
    ac.add(n);
    //vel.limit(vlimit);
    // friction.setMag(mu*mass*-1);
    // vel.x *= friction.x;
    // vel.y *= friction.y;
  };

  public PVector separate(){

    float desiredseparation = breathingroom;
    PVector steer = new PVector(0,0);
    int count = 0;
    float t = 0;
    // For every Human in the system, check if it's too close
    Entity e = entities.get(ent);
    for (int j=0;j<proximity.size();j++) {

      Entity other = proximity.get(j);

      float d = PVector.dist(p,other.p);
      // If the distance is greater than 0 and less than an arbitrary amount (0 when you are yourself)

      if (d<(radius+other.radius)/2) {
        // Calculate vector pointing away from neighbor
        PVector diff = PVector.sub(p,other.p);
        diff.normalize();
        diff.div(radius);        // Weight by distance
        steer.add(diff);
        count++;            // Keep track of how many
        //t+= e.Humans.get(race).get(0).avoidNeighbour.get(other.race);
      }
      // if (race==other.race) {
      //   // Calculate vector pointing away from neighbor
      //   PVector diff = PVector.sub(p,other.p);
      //   diff.normalize();
      //   diff.div(radius);        // Weight by distance
      //   steer.add(diff);
      //   count++;            // Keep track of how many
      //   //t+= e.Humans.get(race).get(0).avoidNeighbour.get(other.race);
      // }
      
      }
    // Average -- divide by how many
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
  };

public PVector separate_(){

    PVector steer = new PVector(0,0);
    int count = 0;
    int count1 = 0;
    // For every Human in the system, check if it's too close
    for (int j=0;j<prox.size();j++) {

      Entity other = prox.get(j);

      float d = PVector.dist(p,other.p);
      // If the distance is greater than 0 and less than an arbitrary amount (0 when you are yourself)

      if (d<(radius+other.radius)/2) {
        // Calculate vector pointing away from neighbor
        PVector diff = PVector.sub(p,other.p);
        diff.normalize();
        diff.div((radius+other.radius)/2);        // Weight by distance
        steer.add(diff);
        count++;            // Keep track of how many
      }
    }
    // Average -- divide by how many//

     if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(100);
      steer.sub(vel);
      steer.limit(100);
      }
    return steer;
};

public PVector separate2_(){

    PVector steer = new PVector(0,0);
    int count = 0;
    int count1 = 0;
    Entity e = entities.get(ent);
    // For every Human in the system, check if it's too close
    for (int j=0;j<prox.size();j++) {

      Entity other = prox.get(j);

      float d = PVector.dist(p,other.p);
      // If the distance is greater than 0 and less than an arbitrary amount (0 when you are yourself)

      if (d<min&&e.Humans.get(race).get(0).avoidNeighbour.get(other.race)>0) {
        // Calculate vector pointing away from neighbor
        PVector diff = PVector.sub(p,other.p);
        diff.normalize();
        diff.div((radius+other.radius)/2);        // Weight by distance
        steer.add(diff);
        count++;            // Keep track of how many
      }}
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
};

  public PVector separate2(ArrayList<Human> a){

    PVector steer = new PVector(0,0);
    int count = 0;
    // For every Human in the system, check if it's too close
    for (int j=0;j<a.size();j++) {

      Entity other = a.get(j);

      float d = PVector.dist(p,other.p);
      // If the distance is greater than 0 and less than an arbitrary amount (0 when you are yourself)
      
     if (other.avoid2) {
        // Calculate vector pointing away from neighbor
        PVector diff = PVector.sub(p,other.p);
        diff.normalize();
        diff.div((radius+other.radius)/2);        // Weight by distance
        steer.add(diff);
        count++;            // Keep track of how many
      }}
    // Average -- divide by how many
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
    
  };

  public void repel(ArrayList<Human> a){

     separate2(a);
     cohesion2(a);

  };

  public PVector separateBoundary(Window s){

    float desiredseparation = breathingroomb;

    PVector steer = new PVector(0,0);
     mult1 = 1;
    int count = 0;
    // For every Human in the system, check if it's too close

    for ( int i=0;i<s.Boundaries.size();i++) {
      
      Boundary C = s.Boundaries.get(i);

      if(C.state==1||C.state==3){
        
    
      for(int j=0;j<C.Boundaries.size();j++){

          Boundary B = C.Boundaries.get(j);

          if(B.state1==1||B.state1==3){

          PVector a = new PVector(B.x1,B.y1);
          PVector b = new PVector(B.x2,B.y2);

          PVector c = find_normal(fp,a,b);
          float d = PVector.dist(fp,c);

        // If the distance is greater than 0 and less than an arbitrary amount (0 when you are yourself)
        if ((d > 10) && ((d < desiredseparation+B.broom))&&check_lineP(a,b,c)) {
          
          // Calculate vector pointing away from neighbor
           mult1 += B.avoidance;
          PVector diff = PVector.sub(p,c);
          diff.normalize();
          diff.div(d);        // Weight by distance
          steer.add(diff);
          count++;            // Keep track of how many
        }}}}}
    // Average -- divide by how many
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      mult1 /=count;
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
  };

  public PVector cohesionf() {

    float neighbordist = breathingroom;
    PVector sum = new PVector(0,0);   // Start with empty vector to accumulate all pitions
    int count = 0;

    Entity e = entities.get(ent);

    for (int j=0;j<proximity.size();j++) {

      Entity other = proximity.get(j);

      float d = PVector.dist(p,other.p);
      float d2 = radius + other.radius;

      if (d>breathingroom&&e.Humans.get(race).get(0).seekNeighbour.get(other.race)>0) {
        sum.add(other.p); // Add pition
        count++;
      }}
    if (count > 0) {
      sum.div((float)count);
      return seek(sum);  // Steer towards the pition
    }
    return sum;
  };

  public PVector cohesionf_() {

    PVector sum = new PVector(0,0);   // Start with empty vector to accumulate all pitions
    int count = 0;

    for (int j=0;j<prox.size();j++) {

      Entity other = prox.get(j);

      float d = PVector.dist(p,other.p);

      if (d>(radius+other.radius)/2&&other.race==race) {
        sum.add(other.p); // Add pition
        count++;
      }
    }
    if (count > 0) {
      sum.div((float)count);
      return seek(sum);  // Steer towards the pition
    }
    return sum;
  };

  public PVector cohesion2(ArrayList<Human> a) {

    PVector sum = new PVector(0,0);   // Start with empty vector to accumulate all pitions
    int count = 0;

    for (int j=0;j<a.size();j++) {

      Entity other = a.get(j);

      float d = PVector.dist(p,other.p);

      if (other.seek) {
        sum.add(other.p); // Add pition
        count++;
      }}
    if (count > 0) {
      sum.div((float)count);
      return seek(sum);  // Steer towards the pition
    }
    return sum;
  };

public PVector cohesionfBoundary(Window s) {

    float neighbordist = breathingroomb;
    PVector sum = new PVector(0,0);   // Start with empty vector to accumulate all pitions
     mult2 = 1;
    int count = 0;

    for ( int i=0;i<s.Boundaries.size();i++) {

      Boundary C = s.Boundaries.get(i);

      if(C.state==1||C.state==2){

      for(int j=0;j<C.Boundaries.size();j++){

          Boundary B = C.Boundaries.get(j);

          if(B.state1==1||B.state1==2){

          PVector a = new PVector(B.x1,B.y1);
          PVector b = new PVector(B.x2,B.y2);

          PVector c = find_normal(p,a,b);
          float d = PVector.dist(p,c);
      if ((d > radius) && (d < neighbordist+B.broom)&&check_lineP(a,b,c)){
              mult2 += B.cohesion;
              sum.add(c); // Add position
              count++;
      }}}}}
    if (count > 0) {
      mult2 /= count;
      sum.div((float)count);
      return seek(sum);  // Steer towards the position
    }
    return sum;

};

public PVector align() {
    float neighbordist = breathingroom;
    PVector steer = new PVector();
    int count = 0;
    Entity e = entities.get(ent);
    for (int j=0;j<proximity.size();j++) {

      Entity other = proximity.get(j);

      if (e.Humans.get(race).get(0).alignNeighbour.contains(other.race)) {
        steer.add(other.vel);
        count++;
      }}
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
  };

  public PVector align2(ArrayList<Human> h) {
    
    PVector steer = new PVector();
    int count = 0;

    for (int j=0;j<h.size();j++) {

      Entity other = h.get(j);

      if (other.align) {
        steer.add(other.vel);
        count++;
      }}
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(vlimit);
      steer.sub(vel);
      steer.limit(alimit);
    }
    return steer;
  };

  public PVector align_() {
    float neighbordist = breathingroom;
    PVector steer = new PVector();
    int count = 0;
    Entity e = entities.get(ent);
    for (int j=0;j<family.size();j++) {

      Entity other = family.get(j);
      float d = dist(x,y,other.x,other.y);

      if (other.race==race) {
        steer.add(other.vel);
        count++;
      }}
    if (count > 0) {
      steer.div((float)count);
      // Implement Reynolds: Steering = Desired - Velocity
      steer.normalize();
      steer.mult(50);
      steer.sub(vel);
      steer.limit(50);
    }
    return steer;
  };


  public void flockBoundary(){
    PVector sepB = separateBoundary(main);   // Separation
    PVector cohB = cohesionfBoundary(main);
    PVector wan = wander(); //wander

    cohB.mult(cohesionb*50);
    sepB.mult(separationb*50);
    wan.mult(wanderm);


    ac.add(sepB);
    ac.add(cohB);
    ac.add(wan);
    //update();
  };
  
  public void flockNeer(){

    PVector sep = new PVector();   // Separation
    //PVector sep2 = new PVector();
    PVector coh = new PVector();   // Cohesion
    //PVector ali = new PVector();   // Alignment

    if(prox.size()>0){
      sep = separate_();
      //sep2 = separate2_();
       coh = cohesionf_();
      // ali = align_();

      coh.mult(cohesionc);
      sep.mult(separationc*(vlimit/50)*50);
      //sep2.mult(separation);
      //ali.mult(alignmentc);
      coh.limit(vlimit);
      sep.limit(vlimit);
      //applyFriction();
      ac.add(sep);
       ac.add(coh);
      // //ac.add(sep2);
      // ac.add(ali);
    }
    //ac.add(ali);
  };

  public void flock(){

    Quad field = null;
    futurep();
    if(pos>0&&pos<scene.cols*scene.rows)field = scene.fields.get(pos);
    if(proximity.size()>0)flockSep();
    if(prox2.size()>0)flockSP();
    
    if(prox.size()>0)flockNeer();
    flockBoundary();
  };

  public void oscilator(){

    if(id==0){
      //noStroke();
      noFill();

      
    
    for(int i=0;i<oscilatorLabels.length;i++){

      String a = oscilatorLabels[i];
      
      float c = oscilatorCounters.get(i) + 0.01f;

      oscilatorCounters.set(i ,c);

      float b = oscilators.get(i) + 2*sin(c);
      oscilators.set(i,b);
      
      
      Field field = null;

      try{
         field = this.getClass().getField(a); 
           field.set(this, field.getFloat(this) + 5*sin(c)); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }}
      //ellipse(p.x,p.y,50,50);
      
    }
  };

  public void flockSep() {
    
    Quad field = null;

    PVector sep = new PVector();

    sep = separate();   // Separation
    sep.mult(separationd);
    //sep.limit(vlimit)
    sep.limit(vlimit);
    //  ali.mult(alignment*(field.dens+1));
    //  coh.mult(cohesion*(field.dens+1));
    applyFriction();
    ac.add(sep);
  };


  public void flockSP(){

    PVector sep = new PVector();
    PVector sep2 = new PVector();
    PVector coh = new PVector();
    PVector ali = new PVector();

    Entity e = entities.get(ent);
    
    if(prox2.size()>0){
    for(int i=0;i<prox2.size();i++){

      ArrayList< Human> h = prox2.get(i);
      ArrayList< Human> h1 = proximity2.get(i);
      

      if(h.size()>0){
        float avoid_ = e.Humans.get(race).get(0).avoidNeighbour.get(i);
        float seek_ = e.Humans.get(race).get(0).seekNeighbour.get(i);
        float align_ = e.Humans.get(race).get(0).alignNeighbour.get(i);

        // if(id==0)text(race + " Scount " + scount + " " + seek_,100,300+40*race+10*i);
        // if(id==0)text(race +" Acount " + acount + " " + avoid_,250,300+40*race+10*i);
        // if(id==0)text(race + " Alcount " + alcount + " " + align_,400,300+40*race+10*i);

        if(scount>0&&seek_>-1)
        coh.add(cohesion2(h).mult(seek_+cohesion));
        if(acount>0&&avoid_>-1)
        sep.add(separate2(h).mult(avoid_+separation));
        if(alcount>0&&align_>-1)
        ali.add(align2(h).mult(align_+alignment));
        if(mcount>0&&avoid_>-1)
        sep2.add(separate2(h).mult((avoid_+separationd)*50));
        //update2();
    }}}
    coh.limit(vlimit);
    sep.limit(vlimit);
    ali.limit(vlimit);
    sep2.limit(vlimit);
    applyFriction();
    ac.add(coh);
    ac.add(sep);
    ac.add(sep2);
    ac.add(ali);
    //update();

  };

  public void flockFamily(){

    if(family.size()>0){
    
      PVector sep2 = new PVector();   // Separation
      PVector coh2 = new PVector();      // Alignment
      
        sep2 = separate2(family);
        coh2 = cohesion2(family);
        //PVector ali = align_();

        coh2.mult(cohesionc);
        sep2.mult(separationc);
        //ali.mult(1);

        ac.add(sep2);
        ac.add(coh2);
    }
    //update2();
    
  };


  public PVector wander() {

    float wanderR = 25;         // Radius for our "wander circle"
    float wanderD = 80;         // Distance for our "wander circle"
    float change = 0.3f;
    wandertheta += random(-wanderm,wanderm);     // Randomly change wander theta

    // Now we have to calculate the new position to steer towards on the wander circle
    PVector circlepos = vel.get();    // Start with velocity
    circlepos.normalize();            // Normalize to get heading
    circlepos.mult(wanderD);          // Multiply by distance
    circlepos.add(p);               // Make it relative to boid's position

    float h = vel.heading2D();        // We need to know the heading to offset wandertheta

    PVector circleOffSet = new PVector(wanderR*cos(wandertheta+h),wanderR*sin(wandertheta+h));
    PVector t = PVector.add(circlepos,circleOffSet);
    //if(debug) drawWanderStuff(p,circlepos,t,wanderR);
    return seek2(t);

    // Render wandering circle, etc.

  };

  public void drawWanderStuff(PVector position, PVector circle, PVector target, float rad) {
  stroke(0);
  noFill();
  ellipseMode(CENTER);
  ellipse(circle.x,circle.y,rad*2,rad*2);
  ellipse(target.x,target.y,4,4);
  line(p.x,p.y,circle.x,circle.y);
  line(circle.x,circle.y,target.x,target.y);
};

public void collisions(ArrayList<Human> a){

  for(int i=0;i<a.size();i++){

    Entity h =  a.get(i);

    checkCollision(h);
  }

};

public void checkCollision(Entity other) {
    
    // Get distances between the balls components
    PVector distanceVect = PVector.sub(other.p, p);

    // Calculate magnitude of the vector separating the balls
    float distanceVectMag = distanceVect.mag();

    // Minimum distance before they are touching
    float minDistance = radius + other.radius;

    if (distanceVectMag < minDistance) {
      float distanceCorrection = (minDistance-distanceVectMag)/2.0f;
      PVector d = distanceVect.copy();
      PVector correctionVector = d.normalize().mult(distanceCorrection);
      PVector o = other.p.copy();
      o.add(correctionVector);
      o.sub(correctionVector);

      // get angle of distanceVect
      float theta  = distanceVect.heading();
      // precalculate trig values
      float sine = sin(theta);
      float cosine = cos(theta);

      /* bTemp will hold rotated ball positions. You 
       just need to worry about bTemp[1] position*/
      PVector[] bTemp = {
        new PVector(), new PVector()
      };

      /* this ball's position is relative to the other
       so you can use the vector between them (bVect) as the 
       reference point in the rotation expressions.
       bTemp[0].position.x and bTemp[0].position.y will initialize
       automatically to 0.0, which is what you want
       since b[1] will rotate around b[0] */
      bTemp[1].x  = cosine * distanceVect.x + sine * distanceVect.y;
      bTemp[1].y  = cosine * distanceVect.y - sine * distanceVect.x;

      // rotate Temporary velocities
      PVector[] vTemp = {
        new PVector(), new PVector()
      };

      vTemp[0].x  = cosine * vel.x + sine * vel.y;
      vTemp[0].y  = cosine * vel.y - sine * vel.x;
      vTemp[1].x  = cosine * other.vel.x + sine * other.vel.y;
      vTemp[1].y  = cosine * other.vel.y - sine * other.vel.x;

      /* Now that velocities are rotated, you can use 1D
       conservation of momentum equations to calculate 
       the final velocity along the x-axis. */
      PVector[] vFinal = {  
        new PVector(), new PVector()
      };

      // final rotated velocity for b[0]
      vFinal[0].x = ((mass - other.mass) * vTemp[0].x + 2 * other.mass * vTemp[1].x) / (mass + other.mass);
      vFinal[0].y = vTemp[0].y;

      // final rotated velocity for b[1]
      vFinal[1].x = ((other.mass - mass) * vTemp[1].x + 2 * mass * vTemp[0].x) / (mass + other.mass);
      vFinal[1].y = vTemp[1].y;

      // hack to avoid clumping
      bTemp[0].x += vFinal[0].x;
      bTemp[1].x += vFinal[1].x;

      /* Rotate ball positions and velocities back
       Reverse signs in trig expressions to rotate 
       in the opposite direction */
      // rotate balls
      PVector[] bFinal = { 
        new PVector(), new PVector()
      };

      bFinal[0].x = cosine * bTemp[0].x - sine * bTemp[0].y;
      bFinal[0].y = cosine * bTemp[0].y + sine * bTemp[0].x;
      bFinal[1].x = cosine * bTemp[1].x - sine * bTemp[1].y;
      bFinal[1].y = cosine * bTemp[1].y + sine * bTemp[1].x;

      // update balls to screen position
      other.p.x = p.x + bFinal[1].x;
      other.p.y = p.y + bFinal[1].y;

      p.add(bFinal[0]);

      // update velocities
      vel.x = cosine * vFinal[0].x - sine * vFinal[0].y;
      vel.y = cosine * vFinal[0].y + sine * vFinal[0].x;
      other.vel.x = cosine * vFinal[1].x - sine * vFinal[1].y;
      other.vel.y = cosine * vFinal[1].y + sine * vFinal[1].x;
    }
  };

  public void assignVectors(){

    futurep();
    p = new PVector(x,y);
    vel = new PVector(vx,vy);

  };

  public void steer_awayIntersection(ArrayList<Human> H,float czone){

    ArrayList<PVector> temp = new ArrayList<PVector>();

    for(int i=0;i<H.size();i++){

      Human h = H.get(i);

      Boundary b1 = new Boundary(x,y,fp.x,fp.y);
      Boundary b2 = new Boundary(h.x,h.y,h.fp.x,h.fp.y);

      PVector i1 = check_intersect(b1,b2);

      if(i1!=null){

        for(int j=0;j<avoid_angles.length;j++){

          float t1 = avoid_angles[j];
          float t2 = atan2(i1.y-y,i1.x-x);

          PVector next = new PVector(x + czone/2 * cos(t1+t2),y + czone/2 * sin(t1+t2));

          PVector ap = futurep(h,czone/2);

          Boundary b3 = new Boundary(x,y,next.x,next.y);
          Boundary b4 = new Boundary(h.x,h.y,ap.x,ap.y);

          PVector i2 = check_intersect(b3,b4);

          if(i2==null){
            temp.add(next);
          }
            if(temp.size()>0){
            //if (target ==null&&targetb==null&&!familyties)      seekddw(greatestTo(temp,center));
            //else if (target ==null&&targetb==null&&familyties)  seekddw(greatestTo(temp,center));
            //else if (target !=null&&targetb==null&&!familyties) seekddw(greatestTo(temp,target));
            //else if (target ==null&&targetb!=null&&!familyties) seekddw(greatestTo(temp,targetb));
        }}}}
  };

  public boolean check_lineP(PVector a, PVector b,PVector c){

    boolean k = false;
    float d1 = dist(a.x,a.y,b.x,b.y);
    float d2 = dist(a.x,a.y,c.x,c.y);
    float d3 = dist(b.x,b.y,c.x,c.y);
    float d4 = d2 + d3;

    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f)k = true;
    
    return k;
  };

  public void steer_awayIntersection(ArrayList<Boundary> H){

    ArrayList<PVector> temp = new ArrayList<PVector>();

    for(int i=0;i<H.size();i++){

      Boundary C = H.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

      Boundary h = C.Boundaries.get(j);

      Boundary b1 = new Boundary(x,y,fp.x,fp.y);
      Boundary b2 = new Boundary(h.x1,h.y1,h.x2,h.y2);

      PVector i1 = check_intersect2(b1,b2);


      if(i1!=null&&!stop&&dist(i1.x,i1.y,x,y)<breathingroom/2){

        fill(col);
        ellipse(i1.x,i1.y,10,10);
        stop = true;
        for(int k=0;k<avoid_angles2.length;k++){

          float t1 = avoid_angles[k];
          float t2 = atan2(i1.y-y,i1.x-x);

          PVector next = new PVector(x + breathingroom/2 * cos(t1+dir),y + breathingroom/2 * sin(t1+dir));

          Boundary b3 = new Boundary(x,y,next.x,next.y);

          PVector i2 = check_intersect2(b3,b2);

          if(i2==null){
            temp.add(next);
          }
            if(temp.size()>0){
            //if (target ==null&&targetb==null&&!familyties)      seekddw(shortestTo(temp,fp));
            //else if (target ==null&&targetb==null&&familyties)  seekddw(shortestTo(temp,center));
            //else if (target !=null&&targetb==null&&!familyties) seekddw(shortestTo(temp,target));
            //else if (target ==null&&targetb!=null&&!familyties) seekddw(shortestTo(temp,targetb));
        }}}}}
  };

  public void steer_awayZone(ArrayList<Human> H,float czone){

    ArrayList<PVector> temp = new ArrayList<PVector>();

    for(int i=0;i<H.size();i++){

      Human h = H.get(i);

      float d1 = dist(x,y,h.x,h.y);

      if(d1<czone/2+h.breathingroom/2){

        float t1 = atan2(h.y-y,h.x-x);

        for(int j=0;j<avoid_angles.length;j++){

          float t2 = avoid_angles[j];

          PVector next = new PVector(x + czone/2 * cos(t2+t1),y + czone/2 * sin(t2+t1));

          float d2 = dist(next.x,next.y,h.x,h.y);

          if(d2>czone/2+h.breathingroom/2){
            temp.add(next);
          }
          if(temp.size()>0){
            //if (target ==null&&targetb==null&&!familyties)      seekddw(greatestTo(temp,center));
            //else if (target ==null&&targetb==null&&familyties)  seekddw(greatestTo(temp,center));
            //else if (target !=null&&targetb==null&&!familyties) seekddw(greatestTo(temp,target));
            //else if (target ==null&&targetb!=null&&!familyties) seekddw(greatestTo(temp,targetb));
        }}}}
  };

  public PVector greatestTo(ArrayList<PVector> d,PVector h){

    PVector k = d.get(0);

    for(int i=0;i<d.size();i++){

      PVector a = d.get(i);

      float d1 = dist(a.x,a.y,h.x,h.y);
      float d2 = dist(k.x,k.y,h.x,h.y);

      if(d1>d2) k = a;
    }

    return k;
  };

  public PVector shortestTo(ArrayList<PVector> d,PVector h){

    PVector k = d.get(0);

    for(int i=0;i<d.size();i++){

      PVector a = d.get(i);

      float d1 = dist(a.x,a.y,h.x,h.y);
      float d2 = dist(k.x,k.y,h.x,h.y);

      if(d1<d2) k = a;
    }

    return k;
  };

  public void seek_boundary(Scene s){

    for(int i=0;i<s.Boundaries.size();i++){

      Boundary C = s.Boundaries.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

        Boundary B = C.Boundaries.get(j);

        PVector a = new PVector(B.x1,B.y1);
        PVector b = new PVector(B.x2,B.y2);

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        //line(x,y,v2.x,v2.y);
        //if(dist(x,y,v2.x,v2.y)>=breathingroom) seekddw(v2);
    }}
  };

  public void seek_boundary(ArrayList<Boundary> s){

    for(int i=0;i<s.size();i++){


      Boundary C = s.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

        Boundary B = C.Boundaries.get(j);

        PVector a = new PVector(B.x1,B.y1);
        PVector b = new PVector(B.x2,B.y2);

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        //line(x,y,v2.x,v2.y);
        //if(dist(x,y,v2.x,v2.y)>=breathingroom) seekddw(v2);
    }}
  };

  public void avoid_boundary(Scene s){

        Boundary A = shortestToCenter(s.Boundaries);
        Boundary B = shortestToCenter(A.Boundaries);

        PVector a = new PVector(B.x1,B.y1);
        PVector b = new PVector(B.x2,B.y2);

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        PVector v3 = PVector.sub(fp,a);
        PVector v4 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        v4.normalize();
        v4.mult(v3.dot(v4));
        v4 = v4.add(a);

        float d1 = dist(fp.x,fp.y,v4.x,v4.y);
        float d2 = dist(x,y,B.x1,B.y1);
        float d3 = dist(x,y,B.x2,B.y2);

        stroke(col);
        line(x,y,v2.x,v2.y);
        ellipse(v2.x,v2.y,10,10);

        //if(d1<=breathingroom)avoiddw(v4);
        //else if(d2<=breathingroom)avoiddw(new PVector(B.x1,B.y1));
        //else if(d3<=breathingroom)avoiddw(new PVector(B.x2,B.y2));


  };

  public void avoid_boundary2(Scene s){

    for(int i=0;i<s.Boundaries.size();i++){

      Boundary C = s.Boundaries.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

        Boundary B = C.Boundaries.get(j);

        PVector a = new PVector(B.x1,B.y1);
        PVector b = new PVector(B.x2,B.y2);

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        PVector v3 = PVector.sub(fp,a);
        PVector v4 = PVector.sub(b,a);

        v4.normalize();
        v4.mult(v3.dot(v4));
        v4 = v4.add(a);

        float d0 = dist(x,y,v2.x,v2.y);
        float d1 = dist(fp.x,fp.y,v4.x,v4.y);
        float d2 = dist(x,y,B.x1,B.y1);
        float d3 = dist(x,y,B.x2,B.y2);

        //stroke(col);
        //line(x,y,v2.x,v2.y);
        //ellipse(v2.x,v2.y,10,10);

        //if(d1<=breathingroom/2)avoiddw(v4);
        //else if(d0<=breathingroom/2)avoiddw(v2);
        //else if(d2<=breathingroom/2)avoiddw(new PVector(B.x1,B.y1));
        //else if(d3<=breathingroom/2)avoiddw(new PVector(B.x2,B.y2));
    }}

  };

  public void avoid_boundary(ArrayList<Boundary> s){

    for(int i=0;i<s.size();i++){

      Boundary C = s.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

        Boundary B = C.Boundaries.get(j);

        PVector a = new PVector(B.x1,B.y1);
        PVector b = new PVector(B.x2,B.y2);

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        //line(x,y,v2.x,v2.y);
        //if(dist(x,y,v2.x,v2.y)<=30) avoid(v2);
    }}
  };

  public void follow_boundary(ArrayList<Boundary> s, float radius){

    if(s.size()>0){

       Boundary B = shortestTo(s);

       Boundary b1 = shortestTo(B.Boundaries);

       PVector a = new PVector(b1.x1,b1.y1);
       PVector b = new PVector(b1.x2,b1.y2);

       PVector n = find_normal(p,a,b);

       float d1 = dist(x,y,n.x,n.y);
       float d2 = dist(x,y,a.x,a.y);
       //float d2 = dist(x,y,a.x,a.y);

       if(d1>radius){
         targetb = n;
       }else {
         targetb = b;
       }

       //seekddw(targetb);
     }
  };

  public void follow_boundary(Scene s,float radius){

     Boundary B = shortestTo(s.Boundaries.get(0).Boundaries);

     PVector a = new PVector(B.x1,B.y1);
     PVector b = new PVector(B.x2,B.y2);

     PVector n = find_normal(p,a,b);

     float d1 = dist(x,y,n.x,n.y);
     float d2 = dist(x,y,a.x,a.y);

     if(d1>radius){
       targetb = n;
     }else {
       targetb = b;
     }

     //seekddw(targetb);
  };

  public Boundary shortestTo(ArrayList<Boundary> B){

     Boundary k = null;

    if(B.size()>0){

      k = B.get(0);;

    for(int i=1;i<B.size();i++){

      Boundary A = B.get(i);
      PVector a = new PVector(A.x1,A.y1);

      float d1 = dist(a.x,a.y,x,y);
      float d2 = dist(k.x1,k.y1,x,y);

      if(d1<d2) k = A;
    }}

    return k;

  };

  public Boundary shortestToCenter(ArrayList<Boundary> B){

     Boundary k = null;

    if(B.size()>0){

      k = B.get(0);;

    for(int i=1;i<B.size();i++){

      Boundary A = B.get(i);
      PVector a = new PVector(A.center.x,A.center.y);

      float d1 = dist(a.x,a.y,x,y);
      float d2 = dist(k.center.x,k.center.y,x,y);

      if(d1<d2) k = A;
    }}

    return k;

  };

  public PVector  find_normal(PVector p, PVector a, PVector b){

        PVector v = PVector.sub(p,a);
        PVector v2 = PVector.sub(b,a);

        v2.normalize();
        v2.mult(v.dot(v2));
        v2 = v2.add(a);

        return v2;
  };

  public PVector[] sum(ArrayList<Human>a){

    PVector v = new PVector(0,0);
    PVector p = new PVector(0,0);

    for(int i=0;i<a.size();i++){

      Human e = a.get(i);

        p.add(e.p);
        v.add(e.vel);
    }
    p.div(family.size());
    v.div(family.size());

    PVector []sum = {p,v};

   return sum;

  };

  public void eyes(){

    fill(col3,20);
    noStroke();
    arc(p.x + 10 * cos(dir),p.y + 10 * sin(dir),200,200,dir - radians(fov),dir + radians(fov));
    //line(x + 10 * cos(dir),y + 10 * sin(dir),x + 110 * cos(dir-radians(fov)),y + 110 * sin(dir-radians(fov)));
    //line(x + 10 * cos(dir),y + 10 * sin(dir),x + 110 * cos(dir+radians(fov)),y + 110 * sin(dir+radians(fov)));

  };

  public void eye(ArrayList<Human> a){

     float d = 0;
     vcount = 0;

    for(int i=0;i<a.size();i++){

      Human e = a.get(i);
      float d1 = dist(p.x,p.y,e.x,e.y);
      if(e!=this&&d1<breathingroom){
        d = atan2(p.y - e.y,p.x - e.x) + PI;
        if(d>=abs(dir)-radians(fov)&&d<=abs(dir)+radians(fov))vcount++;

    }}
    if(vcount>0){
      highlight = true;
      col3 = hcol;
    }
    else {
      highlight = false;
      col3 = colb;
  }
  };

  public void eyes(PVector m){

    float d1 = dist(x,y,m.x,m.y);
    float t1 = atan2(p.y - m.y, p.x - m.x) + PI;
    //float t2 = atan2(m.y - p.y, m.x - p.x) + PI;

    if(d1<200&&t1>dir-radians(fov) && t1 < dir + radians(fov)){highlight = true;}
    else {highlight = false;}
  };

  public void highlight(){
    if(highlight) col3 = hcol;
    else col3 = colb;
  };

  public void rotate(){
    dir+=0.1f;
  };

  public void wander(float a){

    float t2 = 0;
    assignVectors();

    if(!turn&&!turnh){
      dir += radians(random(-10,10));
      fp = futurep();
      tri_boundaryf.tri.center = fp;
      tri_boundaryf.tri.rotate2(dir);
      PVector desired = new PVector(p.x + vel.x * cos(dir), p.y + vel.y * sin(dir));
      seek(desired);
      //fill(col);
      //ellipse(fp.x,fp.y,10,10);
    }
    if(!turn&&!turnh){
    if(!check_inter(lines.scene.Boundaries,fp)){
      if(proximity.size()==0||!check_interh(proximity,fp)){


    }else{ turnh = true;bdir = dir;}}else{ turn = true;bdir = dir;}}
    if(turn||turnh){
      inc ++;
      neg = pow(-1,inc);

      dir = bdir + (radians(10+inc)*neg)+ (radians((id+1)+inc)*neg);
      fp = futurep();
      tri_boundaryf.tri.center = fp;
      tri_boundaryf.tri.rotate2(dir);

      PVector desired = new PVector(p.x + vel.x * cos(dir), p.y + vel.y * sin(dir));

    if(!check_inter(lines.scene.Boundaries,fp2)){
      if(!check_interh(proximity,fp2)){

      seek(desired);
      turn = false;
      turnh = false;
    }}else{
    }}
  };

  public Boolean check_inter(ArrayList<Boundary> B,PVector a){

    boolean k = false;

    for(int i=0;i<B.size();i++){

      Boundary C = B.get(i);

      for(int j=0;j<C.Boundaries.size();j++){

      Boundary h = C.Boundaries.get(j);

      Boundary b1 = new Boundary(p.x,p.y,a.x,a.y);
      Boundary b2 = new Boundary(h.x1,h.y1,h.x2,h.y2);

      PVector i1 = check_intersect2(b1,b2);

      if(a.x==h.x1||a.x==h.x2){
        current_boundary = h;
        k = true;
        turn = true;
        return true;
        }

      else if(i1!=null&&dist(i1.x,i1.y,p.x,p.y)<dist(a.x,a.y,p.x,p.y)){
        current_boundary = h;
        k = true;
        turn = true;

        return true;
      }}}

      return k;

  };

  public Boolean check_inter(Boundary B,PVector a){

    boolean k = false;

      Boundary h = B;

      Boundary b1 = new Boundary(p.x,p.y,a.x,a.y);
      Boundary b2 = new Boundary(h.x1,h.y1,h.x2,h.y2);

      PVector i1 = check_intersect(b1,b2);

      if(a.x==h.x1||a.x==h.x2||a.y == h.y1||a.y == h.y2||i1!=null){

        k = true;
        return true;
      }
      return k;

  };

  public Boolean check_interh(ArrayList<Human> B,PVector a){

    boolean k = false;

    for(int i=0;i<B.size();i++){

      Human h = B.get(i);
      float d1 = dist(p.x,p.y,a.x,a.y);
      float d2 = dist(h.p.x,h.p.y,a.x,a.y);
      float d3 = dist(h.p.x,h.p.y,p.x,p.y);
      if(h!=this){
      //fp = new PVector(x+vlimit*cos(dir),x+vlimit*sin(dir));
      Boundary b1 = new Boundary(p.x,p.y,a.x,a.y);
      Boundary b2 = new Boundary(h.p.x,h.p.y,h.p.x + h.vlimit * cos(h.dir),h.p.y + h.vlimit*sin(h.dir));

      PVector i1 = check_intersect2(b1,b2);

       if(i1!=null&&dist(i1.x,i1.y,x,y)<20){
        stroke(col);
        fill(col);
        line(p.x,p.y,i1.x,i1.y);
        ellipse(i1.x,i1.y,10,10);
        k = true;
        turnh = true;
      }else
      if(tri_boundaryf.pos(new PVector(h.fp.x + 10 * cos(h.dir),h.fp.y + 10 * sin(h.dir)))||
          tri_boundaryf.pos(new PVector(h.fp.x + 10 * cos(dir+radians(120)),h.fp.y + 10 * sin(dir+radians(120))))||
          tri_boundaryf.pos(new PVector(h.fp.x + 10 * cos(dir-radians(120)),h.fp.y + 10 * sin(dir-radians(120))))||
          h.tri_boundaryf.pos(new PVector(fp.x + 10 * cos(dir),fp.y + 10 * sin(dir)))||
          h.tri_boundaryf.pos(new PVector(fp.x + 10 * cos(dir+radians(120)),fp.y + 10 * sin(dir+radians(120))))||
          h.tri_boundaryf.pos(new PVector(fp.x + 10 * cos(dir-radians(120)),fp.y + 10 * sin(dir-radians(120))))){
        stroke(col);
        noFill();
        line(p.x,y,p.x+vlimit*cos(dir),p.y+vlimit*sin(dir));
        ellipse(p.x+vlimit*cos(dir),p.y+vlimit*sin(dir),10,10);
        turnh = true;
        k = true;
        }}}

      return false;

  };

  public Boolean check_interh(Human B,PVector a){

    boolean k = false;
      Human h = B;

      Boundary b1 = new Boundary(p.x,p.y,a.x,a.y);
      Boundary b2 = new Boundary(h.p.x,h.p.y,h.fp.x,h.fp.y);

      PVector i1 = check_intersect2(b1,b2);
      if(a.x==h.x||a.x==h.x){
        //turn = true;
        //k = true;
        //return true;
        }

      else if(i1!=null&&dist(i1.x,i1.y,p.x,p.y)<dist(x,y,fp.x,fp.y)){
        fill(col);
        stroke(col);
        line(p.x,p.y,i1.x,i1.y);
        ellipse(i1.x,i1.y,10,10);
        k = true;
        turn = true;

      }else obstructionh = null;

      return k;

  };


  public void draw_future(){
    stroke(col);
    fill(col);

    if(fp.x!=0&&fp.y!=0)line(x,y,fp.x,fp.y);
    ellipse(fp.x,fp.y,10,10);

  };

  public void arrive(PVector a){

    x = lerp(p.x,a.x,0.5f);
    y = lerp(p.y,a.y,0.5f);
    dir = atan2(a.y-p.y,a.x-p.x);
  };

  public PVector [] sumf(ArrayList<Human> a){

    float sumx = 0;
    float sumy = 0;
    float sumd = 0;
    int total = 0;

    PVector c = new PVector(0,0);
    PVector c2 = new PVector(0,0);

    for(int i=0;i<a.size();i++){

      Human e = a.get(i);
        e.p.x = e.x;
        e.p.y = e.y;

        c.add(e.p);
        c2.add(e.vel);
    }

    c.div(a.size());
    c2.div(a.size());

    centerf = new PVector(c.x,c.y);
    centervelf = new PVector(c2.x,c2.y);

    velf = centervel;
    PVector c3 = new PVector(dir,dir);
    PVector [] temp = {c,c2,c3};

    return temp;

  };

  public PVector [] sumv(ArrayList<Human> a){

    PVector c = new PVector(0,0);
    PVector c2 = new PVector(0,0);

    for(int i=0;i<a.size();i++){

      Human e = a.get(i);

        e.p.x = e.x;
        e.p.y = e.y;
        c.add(e.p);
        c2.add(e.vel);
    }

    c.div((a.size()-1));
    c2.div((a.size()-1));

    center = c;
    centervel = c2;


      float dx = abs(x - center.x);
      float dy = abs(y - center.y);

      vel = new PVector(vx,vy);

    PVector c3 = new PVector(dir,dir);
    PVector [] temp = {c,c2,c3};

    return temp;

  };

  public void logic(){

    if(dir>=2*PI) dir = dir%(2*PI);
    if(dir<=-2*PI) dir = dir%(-2*PI);
  };

  public void draw_broom(){
    stroke(col);
    noFill();
    ellipse(p.x,p.y,breathingroom,breathingroom);
  };

  public void fties(){
    stroke(col);
    if(centerf.x!=0&&centerf.y!=0)line(p.x,p.y,centerf.x,centerf.y);
    fill(col);
    ellipse(centerf.x,centerf.y,20,20);

  };

  public float limit(float a, float l){
    if(a>=l) a = l;
    if(a<=-l)a = -l;

    return a;
  };

  public void update_boundary(){
    if(tri_boundary!=null){
      tri_boundary.tri.update_points(tri_boundary.tri.Boundaries);
    }
  };


  public void showtargeta(){
    if(target!=null){
      text("T",x+25,y);
      Plant P = targetfruit;
      stroke(col);
      line(P.x,P.y,p.x,p.y);
    }
  };
  public void showtargetb(){
    if(targetb!=null){
      PVector P = targetb;
      stroke(col);
      line(p.x,p.y,P.x,P.y);
    }
  };

  public void wrap2(){

    if(p.x>scene.x+scene.w) p.x=scene.x+1;
    if(p.x<scene.x) p.x = scene.x+scene.w-1;
    if(p.y>scene.y+scene.h) p.y = scene.y+1;
    if(p.y<+scene.y) p.y = scene.y+scene.h-1;
  };

  public void wrap(){
    if(p.x >= W) p.x = 1;
    if(p.x <= 0) p.x = W - 1;
    if(p.y >= H) p.y = 1;
    if(p.y <= 0) p.y = H - 1;
  };

  public void boundary_functions(){

      tri_boundary.draw();
      //tri_boundaryf.draw();

      tri_boundary.tri.center = p;

      tri_boundary.tri.rotate2(dir);

      tri_boundaryf.tri.center = fp;

      tri_boundaryf.tri.rotate2(dir);

      tri_boundary.bg = col;
      tri_boundaryf.bg = col;

  };

  public void fboundary_functions(){

      tri_boundaryf.tri.center.x = fp.x;
      tri_boundaryf.tri.center.y = fp.y;
      tri_boundaryf.tri.rotate2(dir);
      tri_boundaryf.bg = col;
  };


  public void p_update(){

  };

  public void update() {
    // Update velocity
    vel.add(ac);
    
    // Limit speed
    
    vel.limit(vlimit);
    dir = atan2(vel.y,vel.x) - PI;
    p.add(vel);
    // Reset accelertion to 0 each cycle

    ac.mult(0);
  }
  public void update2() {
    // Update velocity
    vel.add(ac);
    // Limit speed
    vel.limit(vlimit);
    dir = atan2(vel.y,vel.x) - PI;
    p.add(vel);
    // Reset accelertion to 0 each cycle

  }

  public void runh(){

    a1 += 0.2f;
    a2 += 0.5f;
    a3 += 0.9f;
    a4 += 1.2f;
    a5 += 1.5f;

    if(a1>=5)a1=0;
    if(a2>=10)a2=0;
    if(a3>=12)a3=0;
    if(a4>=14)a4=0;
    if(a5>=15)a5=0;

    PVector m = new PVector(mouseX,mouseY);
    
    if(toggle){
      Entity e = entities.get(ent);
      if(entities.size()>=ent&&e.Humans.size()>0)text(e.Humans.get(0).size(),100,100);
      e.scene.w = e.w;
      e.scene.h = e.h;
      if(!pause)e.scene.field();

      Entities_sublist.draw();
      //fRate.save.location =  saveEntities.folderPath + "/"  + saveEntities.counter +"sliders.txt";
      //folderPath + "/" + coun
      //fRate.savePath = "entities\\" + 

      if(cohesionManager)cohesionLogic();
      if(separationManager)separationLogic();
      if(alignmentManager)alignmentLogic();

      if(!dynamic)drawtotalh = entities.get(ent).Humans.size()-1;
      if(!Entities_sublist.pos())new_human(m);

      

    for ( int i=0;i<e.Humans.size();i++) {
      ArrayList<Human> H = e.Humans.get(i);

      for(int j=H.size()-1;j>-1;j--){

        
        Human h = H.get(j);
        
        h.proximity2 = new ArrayList<ArrayList<Human>>();
        h.family = new ArrayList<Human>();
        h.prox = new ArrayList<Human>();
        h.prox2 = new ArrayList<ArrayList<Human>>();

        for (int l=0;l<hRaces;l++){
          h.prox2.add(new ArrayList<Human>());
          h.proximity2.add(new ArrayList<Human>());
        }
        
        h.scene = e.scene;
        h.alcount = 0;h.acount = 0;h.scount = 0;h.mcount=0;
        
          
        for ( int k=0;k<e.Humans.size();k++) {

          ArrayList<Human> H1 = e.Humans.get(k);
          
          for(int l=H1.size()-1;l>-1;l--){

            Human h1 = H1.get(l);

            float d = dist(h.x,h.y,h1.x,h1.y);

            //if(d<h.breathingroom&&h1!=h)h.proximity.add(h1);
            h1.avoid = false;
            h1.seek = false;
            h1.align = false;
            h1.avoid2 = false;
              
            if(d<h.radius+h1.radius&&h1!=h&&h.race==h1.race)h.family.add(h1);

            if(h1!=h){
            if(
                e.Humans.get(h.race).get(0).alignNeighbour.get(h1.race)>-1
                //&&d>h.min
                &&d<e.Humans.get(h.race).get(0).alignNeighbour.get(h1.race)+h.breathingroom){
                if(!h.prox2.get(h1.race).contains(h1))h.prox2.get(h1.race).add(h1);
                h.alcount++;
                h1.align = true;
              }
              

            if( (e.Humans.get(h.race).get(0).seekNeighbour.get(h1.race)>-1
                //&&d>h.min
                &&d<e.Humans.get(h.race).get(0).seekNeighbour.get(h1.race)+h.breathingroom)){
                if(!h.prox2.get(h1.race).contains(h1))h.prox2.get(h1.race).add(h1);
                h.scount++;
                h1.seek = true;
              }

            if(
                e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)>-1
                //&&d>h.min
                &&d<e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)+h.breathingroom){
                if(!h.prox2.get(h1.race).contains(h1))h.prox2.get(h1.race).add(h1);
                h.acount++;
                h1.avoid = true;
            }
             if(e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)>-1&&d<h.min&&h.min>=0
                &&d<e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)+h.breathingroom
                //&&!h.prox2.get(h1.race).contains(h1)
                &&h.race!=h1.race
                ){
                if(!h.proximity2.get(h1.race).contains(h1))h.proximity2.get(h1.race).add(h1);
                h.mcount ++;
                h1.avoid2 = true;
            }}
            if(d<h.min&&h1!=h)h.prox.add(h1);

              }}
        //if(info){
          
        //h.life(h.proximity);
        assignVariable(h);

        if(!pause){
        //h.wander();
        h.quadPos();
        h.update();
        h.applyFriction();
        h.wrap2();
        if(h.update)h.update_qgrid();
        //h.collisions(h.proximity);
        h.flock();
        
        // if(h.id==0)text(h.friction.x,200,150+10*h.race);
        // if(h.id==0)text(h.scount,250,150+10*h.race);
        // h.oscilator();
        
        }
        h.dir = atan2(h.vel.y,h.vel.x);
        if(visible)h.boundary_functions();
        else {
          fill(h.col);
          noStroke();
          ellipse(h.p.x,h.p.y,h.radius,h.radius);
        }

    }
    if(info)
    for(int j=e.Humans.size()-1;j>-1;j--){

      Human h = e.Humans.get(i).get(0);

      float cc = e.Humans.get(i).get(0).seekNeighbour.get(j);
      int count = 0;

      for(int k=0;k<e.Humans.get(i).get(0).prox2.get(j).size();k++){
        Human h1 = e.Humans.get(i).get(0).prox2.get(j).get(k);
        count++;
        //if(j==0)line(h.p.x,h.p.y,h1.p.x,h1.p.y);
      }
      
      text(i,150+100*i,100);
      text(count,130+100*i,110+20*j);
      text("race: " + j + " " + cc,150+100*i,120+10*j);
      text("Vlimit: " + h.vlimit,150+100*i,160);
      text("Alimit: " + h.alimit,150+100*i,170);
      text("Coh: " + h.cohesion,150+100*i,180);
      text("Sep: " + h.separation,150+100*i,190);
    }
    }Reset();
      //if(!hidesliders)
      fRate.draw();
    }
    //else fRate.menu.toggle=0;
  };

 public void runh_(){

    a1 += 0.2f;
    a2 += 0.5f;
    a3 += 0.9f;
    a4 += 1.2f;
    a5 += 1.5f;

    if(a1>=5)a1=0;
    if(a2>=10)a2=0;
    if(a3>=12)a3=0;
    if(a4>=14)a4=0;
    if(a5>=15)a5=0;

    PVector m = new PVector(mouseX,mouseY);
    
    if(toggle){
      Entity e = entities.get(ent);
      if(entities.size()>=ent&&e.Humans.size()>0)text(e.Humans.get(0).size(),100,100);
      e.scene.w = e.w;
      e.scene.h = e.h;
      if(!pause)e.scene.field();

      Entities_sublist.draw();
      //fRate.save.location =  saveEntities.folderPath + "/"  + saveEntities.counter +"sliders.txt";
      //folderPath + "/" + coun
      //fRate.savePath = "entities\\" + 
      //proximity = getNeighbours2();

      if(cohesionManager)cohesionLogic();
      if(separationManager)separationLogic();
      if(alignmentManager)alignmentLogic();

      if(!dynamic)drawtotalh = entities.get(ent).Humans.size()-1;
      if(!Entities_sublist.pos())new_human(m);

      

    for ( int i=0;i<e.Humans.size();i++) {
      ArrayList<Human> H = e.Humans.get(i);

      for(int j=H.size()-1;j>-1;j--){

        
        Human h = H.get(j);
        
        h.proximity2 = new ArrayList<ArrayList<Human>>();
        h.family = new ArrayList<Human>();
        h.prox = new ArrayList<Human>();
        h.prox2 = new ArrayList<ArrayList<Human>>();

        for (int l=0;l<hRaces;l++){
          h.prox2.add(new ArrayList<Human>());
          h.proximity2.add(new ArrayList<Human>());
        }
        
        h.scene = e.scene;
        h.alcount = 0;h.acount = 0;h.scount = 0;h.mcount=0;
        
          
        for ( int k=0;k<h.proximity.size();k++) {

            Human h1 = h.proximity.get(k);

            float d = dist(h.x,h.y,h1.x,h1.y);

            //if(d<h.breathingroom&&h1!=h)h.proximity.add(h1);
            h1.avoid = false;
            h1.seek = false;
            h1.align = false;
            h1.avoid2 = false;
              
            if(d<h.radius+h1.radius&&h1!=h&&h.race==h1.race)h.family.add(h1);

            if(h1!=h){
            if(
                e.Humans.get(h.race).get(0).alignNeighbour.get(h1.race)>-1
                //&&d>h.min
                &&d<e.Humans.get(h.race).get(0).alignNeighbour.get(h1.race)+h.breathingroom){
                if(!h.prox2.get(h1.race).contains(h1))h.prox2.get(h1.race).add(h1);
                h.alcount++;
                h1.align = true;
              }
              

            if( (e.Humans.get(h.race).get(0).seekNeighbour.get(h1.race)>-1
                //&&d>h.min
                &&d<e.Humans.get(h.race).get(0).seekNeighbour.get(h1.race)+h.breathingroom)){
                if(!h.prox2.get(h1.race).contains(h1))h.prox2.get(h1.race).add(h1);
                h.scount++;
                h1.seek = true;
              }

            if(
                e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)>-1
                //&&d>h.min
                &&d<e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)+h.breathingroom){
                if(!h.prox2.get(h1.race).contains(h1))h.prox2.get(h1.race).add(h1);
                h.acount++;
                h1.avoid = true;
            }
             if(e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)>-1&&d<h.min&&h.min>=0
                &&d<e.Humans.get(h.race).get(0).avoidNeighbour.get(h1.race)+h.breathingroom
                //&&!h.prox2.get(h1.race).contains(h1)
                &&h.race!=h1.race
                ){
                if(!h.proximity2.get(h1.race).contains(h1))h.proximity2.get(h1.race).add(h1);
                h.mcount ++;
                h1.avoid2 = true;
            }}
            if(d<h.min&&h1!=h)h.prox.add(h1);

              }
        //if(info){
          
        //h.life(h.proximity);
        assignVariable(h);

        if(!pause){
        //h.wander();
        h.quadPos();
        h.update();
        h.applyFriction();
        h.wrap2();
        if(h.update)h.update_qgrid();
        h.getNeighbours2();
        //h.collisions(h.proximity);
        h.flock();
        
        // if(h.id==0)text(h.friction.x,200,150+10*h.race);
        // if(h.id==0)text(h.scount,250,150+10*h.race);
        // h.oscilator();
        
        }
        h.dir = atan2(h.vel.y,h.vel.x);
        if(visible)h.boundary_functions();
        else {
          fill(h.col);
          noStroke();
          ellipse(h.p.x,h.p.y,h.radius,h.radius);
        }

    }
    if(info)
    for(int j=e.Humans.size()-1;j>-1;j--){

      Human h = e.Humans.get(i).get(0);

      float cc = e.Humans.get(i).get(0).seekNeighbour.get(j);
      int count = 0;

      for(int k=0;k<e.Humans.get(i).get(0).prox2.get(j).size();k++){
        Human h1 = e.Humans.get(i).get(0).prox2.get(j).get(k);
        count++;
        //if(j==0)line(h.p.x,h.p.y,h1.p.x,h1.p.y);
      }
      
      text(i,150+100*i,100);
      text(count,130+100*i,110+20*j);
      text("race: " + j + " " + cc,150+100*i,120+10*j);
      text("Vlimit: " + h.vlimit,150+100*i,160);
      text("Alimit: " + h.alimit,150+100*i,170);
      text("Coh: " + h.cohesion,150+100*i,180);
      text("Sep: " + h.separation,150+100*i,190);
    }
    }Reset();
      //if(!hidesliders)
      fRate.draw();
    }
    //else fRate.menu.toggle=0;
  }; 

  public void assignVariable(Entity h){
    if(dynamic){
          h.vlimit = h.vlimitb+vlimit;
          h.alimit = h.alimitb+alimit;
          h.cohesion = h.cohesionb1+cohesion;
          h.cohesionb = h.cohesionb2+cohesion;
          h.alignment = h.alignmentb+alignment;
          h.separation = h.separationb1+separation;
          h.separationb = h.separationb2 + separationb;
          h.separationd = h.separationdb + separationd;
          h.wanderm = h.wandermb+wanderm;
          h.breathingroom = h.breathingroomb1+breathingroom;
          h.breathingroomb = h.breathingroomb2+breathingroomb;
		      h.tscale = tscale;
          
          
        }else {
          h.alimit = h.alimitb;
		      h.vlimit = h.vlimitb;
          h.cohesion = h.cohesionb1;
          h.cohesionb = h.cohesionb2;
          h.alignment = h.alignmentb;
		      h.separation = h.separationb1;
          h.separationb = h.separationb2;
          h.wanderm = h.wandermb;
          h.breathingroom = h.breathingroomb1;
          h.breathingroomb = h.breathingroomb2;
		      h.tscale = h.tscale;
          h.separationb = separationb;
          h.separationd = h.separationdb;
        }
          h.separationc = separationc;
          h.cohesionc = cohesionc;
          h.alignmentc = -alignmentc;
          h.mu = mu;
          h.min = h.minb +min;
          
          //h.prox = h.proximity;
  };

  public void runh(Scene s){

    a1 += 0.2f;
    a2 += 0.5f;
    a3 += 0.9f;
    a4 += 1.2f;
    a5 += 1.5f;

    if(a1>=5)a1=0;
    if(a2>=10)a2=0;
    if(a3>=12)a3=0;
    if(a4>=14)a4=0;
    if(a5>=15)a5=0;

    PVector m = new PVector(mouseX,mouseY);

    if(toggle){

      Entity e = entities.get(ent);
      if(entities.size()>=ent&&e.Humans.size()>0)text(e.Humans.get(0).size(),100,100);
      //e.scene.w = e.w;
      //e.scene.h = e.h;
      s.field();
      
      Entities_sublist.draw();
      //if(!hidesliders)
      fRate.draw();
      if(!dynamic)drawtotalh = entities.get(ent).Humans.size()-1;
      if(!Entities_sublist.pos())new_human(m);

    for ( int i=0;i<e.Humans.size();i++) {
      ArrayList<Human> H = e.Humans.get(i);

      for(int j=H.size()-1;j>-1;j--){

        Human h = H.get(j);
        h.proximity = new ArrayList<Human>();
        h.scene = s;


        for(int k=0;k<e.Humans.size();k++){
          ArrayList<Human> HH = e.Humans.get(k);
          for(int l=0;l<HH.size();l++){

            Human h2 = HH.get(l);
            float d = dist(h.x,h.y,h2.x,h2.y);

            if(d<h.breathingroom/2&&h2!=h)h.proximity.add(h2);

        }}
        h.dir = atan2(h.vel.y,h.vel.x);
        h.wander();
        h.quadPos();
        h.update();
        h.wrap2();
        h.update_qgrid();
        if(!pause)h.flock();
        if(!hidesliders&&dynamic){
          h.vlimit = vlimit;
          h.alimit = alimit;
          h.cohesion = cohesion;
          h.alignment = alignment;
          h.separation = separation;
          h.wanderm = wanderm;
          h.breathingroom = breathingroom;
        }
        //h.prox = h.proximity;
        
        
        if(visible)h.boundary_functions();

    }}Reset();}
  };

  public void runp(){

  };

  public void draw(){
    tri_boundary.draw();
  };

  public void draw2(){
    //flock();
  };

  public void desired_trait(){
    for(int i=0;i<3;i++){

    int r = floor(random(Genes.size()-1));
      desired_traits.add(Genes.get(r));
    }
  };

  public void mate(){

  };

  public void new_human(PVector m){

    if(toggle&&addh&&mousePressed){

      int Race = floor(random(Humans.size()));
      //int Ent = ent;
      int ID = Humans.get(Race).size()-1;

      Human entity = new Human(m.x,m.y,ID,Race,ent);

        entity.lifespan = random(minageh,maxageh);
        entity.carrying_capacity = floor(random(0,6));

      Humans.get(Race).add(entity);
    }

  };

  public void life(){
    //boolean retry = false;
    //boolean try_ = false

    Entity e = entities.get(ent);

    if((real&&!pause)&&(Death||Birth)){

    for ( int i=0;i<e.Humans.size();i++) {
      ArrayList<Human> H = e.Humans.get(i);

      for(int j=H.size()-1;j>-1;j--){

       Human h = H.get(j);

       h.col2 = PApplet.parseInt(map(h.age,0,h.lifespan,0.0f,255));

       if(Birth){
       Boolean k = h.births;

       h.age += h.tscale;
       h.w += h.tscale/2;
       h.h += h.tscale/2;
       h.dice = 0;

       if(h.age>=h.lifespan/4&&h.age<=h.lifespan-h.lifespan/4&&h.child<h.carrying_capacity)h.births = true;
       if(h.child > h.carrying_capacity) h.births = false;

       if(h.births) h.delay ++;
       else h.delay = 0;

       if(h.delay > h.lifespan*0.9f){h.try_ = true;}
       else h.try_ = false;h.conception = false;

       if(h.try_)h.dice = random(0.001f,10);
       fill(255);
       text(h.prox.size(),x+20,y);
       if(h.dice>0&&h.dice<h.carrying_capacity/(h.prox.size()+1) && h.delay >0&&(h.age > random(h.lifespan*1/4,h.lifespan*3/4)))
       {h.conception = true;h.delay = 0; h.dice = 0 ;}
       else h.conception = false;

       if(h.conception){

         Human entity = new Human(h.x + random(-20,20),h.y + random(-20,20),Humans.get(h.race).size(),h.race,h.ent);
         entity.parent = h;
         h.Children.add(entity);
         h.child ++;
         Humans.get(h.race).add(entity);
         h.conception = false;

       }}

       if((h.age>h.lifespan||h.health<=0)&&Death){


       Humans.get(h.race).remove(i);

     }}}}


  };



  public void fam(){

  };

  public void updateplants(){

  };

  public void seek_food(){
    if(hunger>90 && !idle){

    }
    if(hunger>50 && idle){

    }

  };

  public void seek(){

  };

  public void p_in_space(){

  };


  public void add(){

    if(mousePressed){

    }
  };

  public boolean p(){
    float X = mouseX;
    float Y = mouseY;
    return X > x -w/2 && X < x + w/2 && Y > y -h/2 && Y < y + h/2;
  };

  public void create(int n,int type){

    for(int i=0;i<n;i++){

      float x = random(0,W);
      float y = random(0,H);
      int k = entities.get(ent).Mazecrawlers.get(race).size()-1;
      if(type==0){
        entities.get(ent).Humans.get(race).add(new Human(x,y,k,species.id,ent));
      }else if(type==1){

        entities.get(ent).Animals.get(race).add(new Animal(x,y,k,species.id,ent));
      }else if(type==2){
        entities.get(ent).Plants.get(race).add(new Plant(x,y,k,species.id,ent));
      }else if(type==3){

        entities.get(ent).Mazecrawlers.get(race).add(new mazeCrawler(x,y,k,species.id,ent));
      }
    }

  };



};

class Species{
  float x,y,vx,vy;
  int id;
  public boolean toggle;
  public float intelligence;
  float skill;

  Species(float X, float Y){
    x = X;
    y = Y;
    vx = 2;
    vy = 2;
  };

  Species(){

  };

};

class rSpecies{
  float x,y,vx,vy;
  int type;
  public boolean toggle;
  public float intelligence;
  float skill;

  rSpecies(float X, float Y){
    x = X;
    y = Y;
    vx = 2;
    vy = 2;
  };

  rSpecies(){

  };

};

class Particle extends Entity{

  public boolean toggle;
  public float intelligence;
  float skill;

  Particle(float X, float Y){
    x = X;
    y = Y;
    vx = 2;
    vy = 2;
  };

};

class Human extends Entity{

  ArrayList<Integer> connections = new ArrayList<Integer>();

  Human(float X, float Y){

    x = X;
    y = Y;
    vx = 2;
    vy = 2;

    init();
  }

  Human(float X, float Y,int i,int j,int E){

    x = X;
    y = Y;
    vx = 2;
    vy = 2;
    id = i;
    race = j;
    ent = E;

    init();
  }

  Human(float X, float Y,int i,int j,int E,int c){

    x = X;
    y = Y;
    vx = 2;
    vy = 2;
    id = i;
    race = j;
    ent = E;

    col = c;

    init();
  }

  public void init(){
    p = new PVector(x,y);
    vel = new PVector(random(-1,1),random(-1,1));
    ac = new PVector(0.1f,0.1f);
    lifespan = random(200,250);
    movement = random(40,100);
    intelligence = random(40,100);
    dexterity = random(40,100);
    speed = random(40,100);
    charisma = random(40,100);
    vision = random(40,100);
    health = random(200,250);
    endurance = random(40,100);
    selfp = random(40,100);
    agility = random(40,100);
    reputation = random(40,100);
    sanity = random(40,100);
    humanity = random(40,100);
    size = random(10,20);
    skill = random(0,10);
    w = size;
    h = size;
    center = new PVector(0,0);
    centervel = new PVector(0,0);
    breathingroom = random(50,100);

    tri_boundary = new _tri(x,y,10,20);
    tri_boundary.parent = this;
    tri_boundary.tri.center.x = tri_boundary.tri.x1;
    tri_boundary.tri.center.y = tri_boundary.tri.y1;
    tri_boundary.bg = col;
    tri_boundary.tri.update_Boundaries(tri_boundary.tri);
    tri_boundary.tri.create_rotation_points(tri_boundary.tri.Boundaries);
    tri_boundary.tri.update_dist(tri_boundary.tri.Boundaries);
    // previous boundary
    tri_boundaryp = new _tri(x,y,10,20);
    tri_boundaryp.parent = this;
    tri_boundaryp.tri.center.x = tri_boundaryp.tri.x1;
    tri_boundaryp.tri.center.y = tri_boundaryp.tri.y1;
    tri_boundaryp.bg = col;
    tri_boundaryp.tri.update_Boundaries(tri_boundaryp.tri);
    tri_boundaryp.tri.create_rotation_points(tri_boundaryp.tri.Boundaries);
    tri_boundaryp.tri.update_dist(tri_boundaryp.tri.Boundaries);

    // future boundary

    tri_boundaryf = new _tri(x,y,10,20);
    tri_boundaryf.parent = this;
    tri_boundaryf.tri.center.x = tri_boundaryf.tri.x1;
    tri_boundaryf.tri.center.y = tri_boundaryf.tri.y1;
    tri_boundaryf.bg = col;
    tri_boundaryf.tri.update_Boundaries(tri_boundaryf.tri);
    tri_boundaryf.tri.create_rotation_points(tri_boundaryf.tri.Boundaries);
    tri_boundaryf.tri.update_dist(tri_boundaryf.tri.Boundaries);
    fov = random(30,40);
    //ac.x = map(speed,0,100,0,0.01);
    //ac.y = map(speed,0,100,0,0.01);

    //vlimit = random(4,100);
    lifespan = random(minageh,maxageh);
    carrying_capacity = floor(random(0,6));
    genes.put("carrying_capacity",PApplet.parseFloat(carrying_capacity));
    genes.put("vlimit",vlimit);
    genes.put("vlimit",vlimitb);
    genes.put("alimit",alimit);
    genes.put("alimit",alimitb);
    genes.put("radius",radius);
    genes.put("breathingroom",breathingroom);
    genes.put("min",min);
    genes.put("minb",minb);
    genes.put("col",PApplet.parseFloat(col));
    genes.put("mass", mass);
    genes.put("lifespan",lifespan);
    genes.put("intelligence",intelligence);
    genes.put("dexterity",dexterity);
    genes.put("endurance",endurance);
    genes.put("piety",piety);
    genes.put("vision,",vision);
    genes.put("health",health);
    genes.put("speed",speed);
    genes.put("selfp",selfp);
    genes.put("charisma",charisma);
    genes.put("agility",agility);
    genes.put("reputation",reputation);
    genes.put("sanity",sanity);
    genes.put("humanity",humanity);
    genes.put("faith",faith);
    genes.put("fresistance",fresistance);

    for (String key : genes.keySet()) {
        Genes.add(key);
    }
    desired_trait();

     
  };

  public void savegenes(){
    genes.put("carrying_capacity",PApplet.parseFloat(carrying_capacity));
    genes.put("vlimit",vlimit);
    genes.put("vlimit",vlimitb);
    genes.put("alimit",alimit);
    genes.put("alimit",alimitb);
    genes.put("radius",radius);
    genes.put("breathingroom",breathingroom);
    genes.put("min",min);
    genes.put("minb",minb);
    genes.put("col",PApplet.parseFloat(col));
    genes.put("mass", mass);
    genes.put("lifespan",lifespan);
    genes.put("intelligence",intelligence);
    genes.put("dexterity",dexterity);
    genes.put("endurance",endurance);
    genes.put("piety",piety);
    genes.put("vision,",vision);
    genes.put("health",health);
    genes.put("speed",speed);
    genes.put("selfp",selfp);
    genes.put("charisma",charisma);
    genes.put("agility",agility);
    genes.put("reputation",reputation);
    genes.put("sanity",sanity);
    genes.put("humanity",humanity);
    genes.put("faith",faith);
    genes.put("fresistance",fresistance);

    for (String key : genes.keySet()) {
      Genes.add(key);
    }
  };

  public void draw(){
    strokeWeight(ssize);
    stroke(cols);
    fill(col2);
    ellipse(x,y,w,h);
  };

   public void update_qgrid(){

    //updates the corresponding qgrid array's children with the last id in the iid arraylist

    // iid is either of length 1 at the start or of length 2 any time after. If iid is size 2 then you need to check if the perticle crosses a border at anytime by comparing iid(0)
    // and iid(1), if they are different then the particle has crossed a border. Therefore update the corresponding previous grid space by removing this id, and update the new grid
    // space by adding the id.

    ArrayList<Quad> qgrid = scene.fields;
    if(iid.size()==2){
      boolean a = true;
      if(iid.get(1)<qgrid.size()&&iid.get(1)>=0){
        a = qgrid.get(iid.get(1)).children.contains(this);
      }
      boolean b = false;
      if(iid.get(0)<qgrid.size()&&iid.get(0)>=0){
        b = qgrid.get(iid.get(0)).children.contains(this);
      }
    if(!a){
      qgrid.get(iid.get(1)).children.add(this);
      
      }
      //qgrid.get(iid.get(1)).fillc();
    if (b){
      int k = qgrid.get(iid.get(0)).children.indexOf(this);
      qgrid.get(iid.get(0)).children.remove(k);
    }}
    if(iid.size()==1){
      if(iid.get(0)<qgrid.size()&&iid.get(0)>=0){
    boolean a = qgrid.get(iid.get(0)).children.contains(this);
    if(!a){
      //qgrid.get(iid.get(0)).fillc();
      qgrid.get(iid.get(0)).children.add(this);
    }}}
  };

  public void interact(){

  };

  public void reproduce(){

  }

  public void collide(){

  }

  public void ears(){

  };

  public void gene(){

  };

};

class Plant extends Entity{

  int col = color(0,255,0);

  Plant(float X, float Y){
    x = X;
    y = Y;
    vx = 2;
    vy = 2;
    init();
  };

  Plant(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    vx = 2;
    vy = 2;
    id = i;
    ent = E;
    species = new Species(ent,i);
    init();

  };

  public void init(){
    p = new PVector(x,y);
    vel =new PVector(0,0);
    ac =new PVector(0,0);
    lifespan = random(40,100);
    movement = random(40,100);
    intelligence = random(40,100);
    dexterity = random(40,100);
    speed = random(40,100);
    charisma = random(40,100);
    vision = random(40,100);
    health = random(40,100);
    endurance = random(40,100);
    selfp = random(40,100);
    agility = random(40,100);
    reputation = random(40,100);
    sanity = random(40,100);
    humanity = random(40,100);
    size = random(5,10);
    skill = random(0,10);
    w = size;
    h = size;
    lifespan = random(500,1000);
    carrying_capacity = floor(random(0,6));
  }

  public void draw(){
    stroke(col);
    fill(col,100);
    ellipse(x,y,w/(frameCount/60)*2,h/(frameCount/60)*2);
  };

};

class Animal extends Entity{

  Animal(float X, float Y){
    x = X;
    y = Y;

  }

  Animal(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    id = i;
    species = new Species(ent,i);
    ent = E;

  }

  public void draw(){
    stroke(0);
    fill(0);
    ellipse(x,y,20,20);
  };

};

class Mineral extends Entity{

  Mineral(float X, float Y){
    x = X;
    y = Y;

  }

  Mineral(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    id = i;
    species = new Species(ent,i);
    ent = E;

  }

  public void draw(){
    stroke(0);
    ellipse(x,y,size,size);
  };

};

class Metal extends Entity{

  Metal(float X, float Y){
    x = X;
    y = Y;
  }

  Metal(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    id = i;
    species = new Species(ent,i);
    ent = E;
  }

  public void draw(){
    stroke(0);
    ellipse(x,y,size,size);
  };
};

class mazeCrawler extends Entity{
  float x,y;
  boolean toggle;
  Entity target;

  mazeCrawler(float X, float Y){
    x = X;
    y = Y;
  }

  mazeCrawler(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    id = i;
    species = new Species(ent,i);
    ent = E;

  }

  public void draw(){
    stroke(0);
    ellipse(x,y,size,size);
  };

  public void seek(){

  };
};

class Celluloid extends Entity{
  float x,y;
  boolean toggle;
  Entity target;
  Species species;

  Celluloid(float X, float Y){
    x = X;
    y = Y;

    //species
  }

  Celluloid(float X, float Y,int i,int j,int E){
    x = X;
    y = Y;
    id = i;
    species = new Species(ent,i);
    ent = E;

  }

  public void draw(){
    stroke(0);
    ellipse(x,y,size,size);
  };

  public void seek(){

  };
};

class Energy{

  Energy(){

  }

};

class Cycle{

  public float len = 120,start,inc;
  float current;
  Cycle(float Start,float Inc){
    start = Start;
    inc = Inc;
  }

  public void run(){

    start += inc;
    current = sin(inc);

  }

};
class Grid_space{
  
  int id,iid,pid,row,t,toggle,steps = 10000,psteps,counter = 0,index,t2,xpos,ypos,sides,currentId,totalChildren,popCount,
      popId=-1;
  float x,y,w,h,vx,vy,ax,ay,elasticity,lim,mass = 10,type,dx,dy;
  String label;
  boolean drag,resize,collide,forward = true,backward = false, pause = false,graph,visible,field,neighboured,convolved = false,image,webcam,attractor,findHeading;
  boolean popVisited,popVisited1,popVisited2,counted,grid,border,visited,visited1,visited3,visited4,updated,active = true,corrected,popVerified,histVerified,popClosed,wVisited,walled,popColChecked,compared,debug,node,pathConnected,noNewPopNeighbours;
  
  PVector heading ;
  float incidence;
  float reflection ;
  float norm;
  Grid parent;
  Grid_space leader = this,next = null,transfer;
  PImage img,shade;
  
  Shape shape;
  ArrayList<PVector> pos = new ArrayList<PVector>();
  ArrayList<PVector> vel = new ArrayList<PVector>();
  ArrayList<PVector> headings = new ArrayList<PVector>();
  
  ArrayList<Grid_space> Neighbours = new ArrayList<Grid_space>();
  ArrayList<Grid_space> visitedBy = new ArrayList<Grid_space>();
  ArrayList<Grid_space> modifiedAgents = new ArrayList<Grid_space>();
  ArrayList<Grid_space> Neighbours2 = new ArrayList<Grid_space>();
  ArrayList<Grid_space> Neighbours3 = new ArrayList<Grid_space>();
  ArrayList<Grid_space> Neighbours_8 = new ArrayList<Grid_space>();
  ArrayList<Grid_space> Neighbours_4 = new ArrayList<Grid_space>();
  ArrayList<Grid_space> NeighboursWalls = new ArrayList<Grid_space>();
  ArrayList<Grid_space> connections = new ArrayList<Grid_space>();
  ArrayList<Grid_space> parents = new ArrayList<Grid_space>();
  ArrayList<Boundary> Boundaries = new ArrayList<Boundary>();
  ArrayList<Boundary> Boundaries2 = new ArrayList<Boundary>();
  ArrayList<Grid_space> history = new ArrayList<Grid_space>();
  ArrayList<PVector> Vertices = new ArrayList<PVector>();
  
  Grid_space []Neighbours_a;
  Grid_space []Neighbours_b;
  
  ArrayList<Boolean> Walls_a = new ArrayList<Boolean>();
  ArrayList<Boolean> Walls_b = new ArrayList<Boolean>();
  
  ArrayList<PVector[][]> walls = new ArrayList<PVector[][]>();
  
  PVector temp = new PVector(0,0);
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  
  int col = color(255);
  int col2 = -10000,col3,col4,col5,col6,col7,popCol;
  
  Grid_space[][] kernel2d =   {{null , null, null }, 
                               {null , this, null }, 
                               {null , null, null }}; 
  Grid_space[] kernel1d =      {null,null,null,
                                null,this,null,
                                null,null,null};  
  
  //Grid_space(float xx,float yy, float ww, float hh, int Id,int I, int J){
  
  //  x = xx;
  //  y = yy;
  //  w = ww;
  //  h = hh;
  //  xpos = I;
  //  ypos = J;
  //  id = Id;
  //  iid = id;
  //  ax = 0.02;
  //  ay = 0.02;
    
  //  Neighbours_a = new Grid_space[8];
  //  Neighbours_b = new Grid_space[4];
  //  for(int i = 0; i<Neighbours_a.length;i++){
  //    Walls_a.add(true);
  //  }
  //  for(int i = 0; i<Neighbours_b.length;i++){
  //    Walls_b.add(true);
  //  }
    
  //  for(int i = 0; i<Neighbours_a.length;i++){
  //    Boundaries.add(new Boundary(0,0,0,0));
  //  }
  //  for(int i = 0; i<Neighbours_b.length;i++){
  //    Boundaries.add(new Boundary(0,0,0,0));
  //  }
  //  //shade = new PImage(w,h);
    
  //};
  
  Grid_space(float xx,float yy, float ww, float hh, int Id,int I, int J){
  
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    xpos = I;
    ypos = J;
    id = Id;
    iid = id;
    ax = 0.02f;
    ay = 0.02f;
    
    Neighbours_a = new Grid_space[8];
    Neighbours_b = new Grid_space[4];
    for(int i = 0; i<Neighbours_a.length;i++){
      Walls_a.add(true);
    }
    for(int i = 0; i<4;i++){
      Walls_b.add(true);
    }
    Boundary a1,a2,a3,a4;
    a1 = new Boundary(x,y,x+w,y);
    a2 = new Boundary(x+w, y, x+w, y+h);
    a3 = new Boundary(x+w, y+h, x, y+h);
    a4 = new Boundary(x, y+h, x, y);

    Boundaries.add(a1);
    Boundaries.add(a4);
    Boundaries.add(a2);
    Boundaries.add(a3);
   
    //shade = new PImage(w,h);
    
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void init(){
    
  };
  
  public void draw(){
    
  };

  public void drawBoundaries(){

   for(int i=0;i<Walls_b.size();i++){
     Boundary b = Boundaries.get(i);
     b.col = color(red(col)+30,green(col)+30,blue(col)+30);
     if(Walls_b.get(i)) b.draw3();
   }
  };

  public void drawBoundaries2(){

   for(int i=0;i<Boundaries.size();i++){
     Boundary b = Boundaries.get(i);
     b.col = color(red(col)+30,green(col)+30,blue(col)+30);
     stroke(b.col);
     if(Walls_b.get(i)){
       line(b.x1,b.y1,b.x2,b.y2);
     } 
     //b.draw3();
   }
  };
  
  public void move(){
    
    float a = 5;
    
    vx += random(-a,a);
    vy += random(-a,a);
    
  }
  
  public boolean pos(){
    
    return mouseX>=x&&mouseX<=x+w&&mouseY>=y&&mouseY<=y+h;
  };

  public void info(){
    float xx = mouseX;
    float yy = mouseY;
    float vspacing = 20;
    if(pos()&&debug){
      fill(240, 214, 50,100);
      rect(xx,yy,120,100);
      for(int i=0;i<Neighbours_4.size();i++){
        fill(0);
        // String s = "false";
        // if (Walls_a[i])s = "true";
        text(str(Walls_a.get(i)),xx + 40 * i,yy);
      }
      text("Direc Neighbours: " + Neighbours_4.size(),xx,yy + vspacing * 1);
      text("All Neighbours: " + Neighbours_8.size(),xx,yy + vspacing * 2);
      
      text("Node: " + str(node), xx,yy + vspacing * 3);
      text("Id: " + id, xx,yy + vspacing * 4);
      text("Conn. Neighbours: " + connections.size(),xx,yy + vspacing * 5);
      text(str(toggle),xx,yy + vspacing * 6);
      text("Pop Visited: " + str(popVisited),xx,yy + vspacing * 7);
      text("Visited: " + str(popVisited),xx,yy + vspacing * 8);
      text("Path Connected: " + str(pathConnected),xx,yy + vspacing * 9);
      text("Parents: " + str(popVisited),xx,yy + vspacing * 10);
      for(int i=0;i<parents.size();i++){
        fill(0);
        text(parents.get(i).id,xx + 60 + 40 * i,yy + vspacing * 11);
      }
      for(int i=0;i<connections.size();i++){
        fill(0);
        text(connections.get(i).id,xx + 80 * i,yy + vspacing * 12);
      }


    }
  };
  
  public void update(){
    steps = pos.size()-1;
    if(forward){
      
      if(index==0){
        if(pos.size()>0)counter = pos.size()-1;
        
    //if(lim>0){
    //  vx += Limit(vx,lim);
    //  vy += Limit(vy,lim);
    //}else{
    
    if(vx>4)vx = 4;
    if(vx<-4)vx = -4;
    if(vy>4)vx = 4;
    if(vy<-4)vx = -4;
    if(boundaries())reflect();
    
      x += vx;
      y += vy;
    
      if(attractors.attractors.size()>0){
        //if(findHeading)find_heading();
        pos.add(new PVector(x,y));
        vel.add(new PVector(vx,vy));
      }}
    else if(index ==1){
      vx = vel.get(counter).x;
      vy = vel.get(counter).y;
      x = pos.get(counter).x;
      y = pos.get(counter).y;
      counter++;
      if(counter == pos.size()){
        index = 0;
      }}}
    else if(backward){
      if(counter>0){
        index = 1;
        vx = vel.get(counter).x;
        vy = vel.get(counter).y;
        x = pos.get(counter).x;
        y = pos.get(counter).y;
        counter --;
      if(counter==0){
        pos = new ArrayList<PVector>();
        vel = new ArrayList<PVector>();
        //pos.remove(pos.size()-1);
      }
      if(counter == 0)index = 0;
      
      //steps = counter;
    }}
    else if(pause){
      
    }
    
    if(graph)graph();
    
  };
  
  public void mouse(){
    if(forward){
    float t1 = atan2(mouseY - y, mouseX - x);
    
    vx += ax * cos(t1);
    vy += ay * sin(t1);
    }
  };
  
  
  public Grid_space getNewBorder(){
    
    Grid_space g = null;
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours2.size();i++){
      
     Grid_space a = Neighbours2.get(i);
     
     if(a.col2!=col2)neighbours.add(a);
    }
    
    if(neighbours.size()>0)g = neighbours.get(floor(random(neighbours.size())));
    return g;
  };
  
  public Grid_space getNewNeighbour(){
    
    Grid_space g = null;
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();

    for(int i=0;i<Neighbours_4.size();i++){
      
     Grid_space a = Neighbours_4.get(i);
     
     if(a!=null&&!a.popVisited&&a.col2==col2)neighbours.add(a);
    }
    
    if(neighbours.size()>0)g = neighbours.get(floor(random(neighbours.size())));
    return g;
  };
  
  public Grid_space getNewNeighbour_(Grid g1,Grid_space k){
    
    Grid_space g = null;
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours_4.size();i++){
      
     Grid_space a = Neighbours_4.get(i);
     
     if(a!=null&&!a.popVisited&&a.col2==col2){
       a.pid = k.pid;
       a.popId = k.popId;
       a.popCol = k.popCol;
       g1.popHist.add(new ArrayList<Grid_space>());
       g1.popStack.add(new ArrayList<Grid_space>());
       g1.agents.add(a);
       g1.agentsBackup.add(a);
       
       neighbours.add(a);
    }}
    
    if(neighbours.size()>0)g = neighbours.get(floor(random(neighbours.size())));
    return g;
  };
  
public ArrayList getNewNeighbour1(Grid g){
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours_4.size();i++){
      
     Grid_space a = Neighbours_4.get(i);

     if(a!=null){
      if(a.popVisited
          &&a.popId!=popId
          &&a.pid!=pid
          &&a.col2==col2
          //&&a.popCol!=popCol
          //&&g.agentsConst.get(a.pid).popCol!=g.agentsConst.get(pid).popCol
          //&&g.agentsConst.get(a.pid)!=g.agentsConst.get(popId)
          //&&!Walls_b.get(i)
          &&g.agentsConst.get(a.popId).col2==g.agentsConst.get(popId).col2
          &&g.agentsBackup.get(popId).steps>g.agentsBackup.get(a.popId).steps
          &&!g.agentsConst.get(popId).modifiedAgents.contains(g.agentsConst.get(a.popId))
          &&!g.agentsConst.get(a.popId).visitedBy.contains(g.agentsConst.get(popId))
          )neighbours.add(a);
      
      if(a.popVisited&&a.popId!=popId&&a.col2==col2&&a.popCol!=popCol){
      
      if(!g.agentsConst.get(popId).modifiedAgents.contains(g.agentsConst.get(a.popId))){
        g.agentsConst.get(popId).modifiedAgents.add(g.agentsConst.get(a.popId));
        if(a.pid!=a.popId){
          g.agentsConst.get(popId).modifiedAgents.add(g.agentsConst.get(a.pid));
          if(pid!=popId)g.agentsConst.get(pid).modifiedAgents.add(g.agentsConst.get(a.pid));
        }
        if(pid!=popId){
          g.agentsConst.get(pid).modifiedAgents.add(g.agentsConst.get(a.popId));
          if(a.pid!=a.popId)g.agentsConst.get(pid).modifiedAgents.add(g.agentsConst.get(a.pid));
        }}
      if(!g.agentsConst.get(a.popId).visitedBy.contains(g.agentsConst.get(popId)))
          g.agentsConst.get(a.popId).visitedBy.add(g.agentsConst.get(popId));
     }}}
    if(neighbours.size()==0)neighbours=null;
    return neighbours;
  };
  
  public ArrayList getNewNeighbour4(Grid g){
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours_4.size();i++){
      
     Grid_space a = Neighbours_4.get(i);
     if(a!=null){
      if(a.popVisited
          &&a.popId!=popId
          &&a.col2==col2
          &&a.popCol!=popCol
          //&&!Walls_b.get(i)
          &&g.agentsConst.get(a.popId).col2==g.agentsConst.get(popId).col2
          &&g.agentsBackup.get(popId).steps>g.agentsBackup.get(a.popId).steps
          &&!g.agentsConst.get(popId).modifiedAgents.contains(g.agentsConst.get(a.pid))
          &&!g.agentsConst.get(a.popId).visitedBy.contains(g.agentsConst.get(popId))
          )neighbours.add(a);
     
     }}
    if(neighbours.size()==0)neighbours=null;
    return neighbours;
  };
  
  public ArrayList getNewNeighbour2(Grid g){
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours_4.size();i++){
      
     Grid_space a = Neighbours_4.get(i);
     
     if(a!=null){
      if(a.popVisited&&a.pid!=pid&&a.col2==col2&&a.leader.steps>leader.steps){
        neighbours.add(a);
        if(!a.visitedBy.contains(this.leader))a.visitedBy.add(this.leader);
      }
      
      if( a.popVisited&&a.col2==col2&&a.pid!=pid
          &&a.popId>-1&&popId>-1&&!g.agents.get(popId).modifiedAgents.contains(g.agents.get(a.popId))
          &&g.agentsConst.get(popId).steps<g.agentsConst.get(a.popId).steps)neighbours.add(a);
          
      if( a.popVisited&&a.col2!=col2
          &&!g.agents.get(pid).modifiedAgents.contains(g.agents.get(a.pid))
          &&g.agentsConst.get(popId).steps<g.agentsConst.get(a.popId).steps){
          a.popCol=popCol;
          neighbours.add(a);
      }}
     }
    if(neighbours.size()==0)neighbours=null;
    return neighbours;
  };
  
  public Grid_space getNewNeighbour3(Grid g){
    
    Grid_space k = null;
    
    ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
    
    for(int i=0;i<Neighbours_4.size();i++){
      
     Grid_space a = Neighbours_4.get(i);

     if(a!=null){
     if(a.popVisited&&a.col2==col2
         &&!g.agents.get(popId).modifiedAgents.contains(g.agents.get(a.popId))
         &&g.agentsConst.get(popId).steps<g.agentsConst.get(a.popId).steps)neighbours.add(a);
         
         if(a.popVisited&&a.col2!=col2
         &&!g.agents.get(pid).modifiedAgents.contains(g.agents.get(a.pid))
         &&g.agentsConst.get(popId).steps<g.agentsConst.get(a.popId).steps)neighbours.add(a);
    }}
    
    
    if(neighbours.size()>0)k = neighbours.get(floor(random(neighbours.size())));
    return k;
  };
  
public Grid_space getNewWallNeighbour(Grid k){
  
  Grid_space g = null;
  
  ArrayList<Grid_space> neighbours = new ArrayList<Grid_space>();
  
  for(int i=0;i<Neighbours.size();i++){
     
     Grid_space a = Neighbours.get(i);
     if(a!=null){
      if(k.wallSquares.contains(a)){
        for(int j=0;j<a.Walls_b.size();j++){
          
          if((a.Walls_b.get(j)&&a.col2==col2)&&!a.wVisited){
            if(!neighbours.contains(a))neighbours.add(a);
            else i++;
  }}}}}
   
    
    if(neighbours.size()>0)g = neighbours.get(floor(random(neighbours.size())));
    return g;
  
};

public Grid_space sort(ArrayList<Grid_space> a){
  
  Grid_space g = a.get(0);
  
  for(int i=1;i<a.size();i++){
    Grid_space g1 = a.get(i);
    
    if(g.steps<g1.steps)g = g1;
  }
  
  return g;
};
  
  public void find_heading(){
    
    heading = new PVector(x,y);
    
    if(pos.size()>0){
      
        PVector p = pos.get(pos.size()-1);
        PVector c = new PVector(x,y);
        
        //PVector p = new PVector(x + vx,y +vy);;
        //PVector c = new PVector(x,y);
        
        int mult = 10;
        float dx = c.x - p.x;
        float dy = c.y - p.y;
        
        float theta = atan2(dy,dx);
        incidence = theta;
        
        if(dx>0)heading.x = x + dx * mult * cos(theta);
        else heading.x = x - dx * mult * cos(theta);
        if(dy>0)heading.y = y + dy * mult * sin(theta);
        else heading.y = y - dy * mult * sin(theta);
        
        heading.x += vx;
        heading.y += vy;
      
    }
        
        
  };
  
  public void attractors(){
    if(forward&&attractor){
    if(attractors.attractors.size()>0){
    for(int i=0;i<attractors.attractors.size();i++){
      
      Attractor a = attractors.attractors.get(i);
      
      float t1 = atan2(a.y - y, a.x - x);
    
      float d = dist(x,y,a.x,a.y);
      if(a.type == 0){
      ax = (a.mass + mass)/(d*d)*9.81f*a.intensity;
      ay = (a.mass + mass)/(d*d)*9.81f*a.intensity;
      }
       else if( a.type == 1){
      ax = a.intensity;
      ay = a.intensity;
      vx -=  a.intensity * dx; ;
      vy -=  a.intensity * dy; ;
      }
      vx -= ax * cos(t1);
      vy -= ay * sin(t1);
      
    }}}
  };
  
  public void reflect(){
    if(collide){
      vx = -ax  * cos(reflection);
      vy = -ay  * sin(reflection);
    }
    
  };

  public void popBoundaries(){
    for(int i=0;i<walls.size();i++){

    }
  };
  
  public boolean boundaries(){
    t2 = 0;
    boolean k = false;
    //float incidence = 0;
    //PVector temp = new PVector(0,0);
    //if(forward){
    //if(lines.Boundaries.size()>0){
      
    //for(int i=0;i<lines.Boundaries.size();i++){
      
    //  Boundary a = lines.Boundaries.get(i);
    //  float n = lines.norm.get(i);
      
    //  PVector a1 = new PVector(a.x1,a.y1); 
    //  PVector a2 = new PVector(a.x2,a.y2); 
      
    //  boolean k2 = check_lineP(a1,a2,new PVector(x,y));
    //  //norm.set(0,a.norm);
    //  norm = n;
    //  if(k2){
    //    t2++;
    //  }}}}
    
    //if(t2>0){
    //  k = true;
    //  collide = true;
    //}
    //else{
    //  collide = false;
    //}
    
    //reflection = norm + (norm + incidence);
    return k;
  };
  
  
  public boolean check_lineP(PVector a, PVector b,PVector c){
    
    boolean k = false;
    float d1 = dist(a.x,a.y,b.x,b.y);
    float d2 = dist(a.x,a.y,c.x,c.y);
    float d3 = dist(b.x,b.y,c.x,c.y);
    float d4 = d2 + d3;
    
    
    //if(d5>=inc/2&&d6>=inc/2){
    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f)k = true;
    
    return k;
  };
  
  public float Limit(float a,float b){
    if(a>0)if(a > b) a = b;
    
    if(a<0)if(a < -b) a = b;
    
    return a;
  };
  
  public void wrap(){
    
      if(x>W)x=1;
      if(x<0)x=W;
      if(y>H)y=1;
      if(y>H)x=1;
      if(y<0)y=H;
  };
  
  public void graph(){
    stroke(col);
    int max = 10;
    if(forward){
      if(index==0){
        
    if(pos.size()>max&& pos.size()>2){
      for( int i=pos.size()-max;i<pos.size()-1;i++){
        
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
        
      }} else{
      for( int i=0;i<pos.size()-1;i++){
        
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
        
      }}}
    else if(index==1){
          if(counter>max&& pos.size()>2){
      for( int i=counter-max;i<counter;i++){
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
        
      }}else{
      for( int i=counter-max;i<counter;i++){
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
        
      }}}}
    else if(backward){
      if(counter>max&& pos.size()>2){
      for( int i=counter-max;i<counter;i++){
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
      }}else{
      for(int i=0;i<counter;i++){
        PVector a = pos.get(i);
        PVector b = pos.get(i+1);
        
        line(a.x,a.y,b.x,b.y);
      }}}
  };
  
  public void bounce(){
    if(forward){
    float e = elasticity;
    if(elasticity!=0){
    if(x >= W )vx = - vx;
    if(x <= 0)vx = - vx;
    if(y >= H )vy = - vy;
    if(y <= 0 )vy = - vy;
    }
    
    else{
      if(x >= W )vx = - vx * (1 - e);
      if(x <= 0)vx = - vx * (1 - e);
      if(y >= H )vy = - vy * (1 - e);
      if(y <= 0 )vy = - vy * (1 - e);
    }}
  };
  
  
  public void get_neighbours(GridImg img){
    if(!neighboured){
    
    
    ArrayList<Grid_space> n = new ArrayList<Grid_space>();
    ArrayList<Grid_space> n2 = new ArrayList<Grid_space>();
    int cell = id;
    
    Grid_space b = img.imsquares.get(cell);
  
    Grid_space topl,top,topr,right,btmr,btm,btml,left;
    
       topl = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) - 1,img);
       top = index2(PApplet.parseInt(xpos) , PApplet.parseInt(ypos) - 1,img);
       topr = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos) - 1,img);
       right = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos),img);
       btmr = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos) + 1,img);
       btm = index2(PApplet.parseInt(xpos) , PApplet.parseInt(ypos) + 1,img);
       btml = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) + 1,img);
       left = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) ,img);
    
    if(topl!=null){
      n.add(topl);
      Neighbours_a[0] = topl;
      kernel1d[0] = topl;
    }
    if(top!=null){
      n.add(top);
      n2.add(top);
      Neighbours_a[1] = top;
      Neighbours_b[0] = top;
      kernel1d[1] = top;
    }
    if(topr!=null){
      n.add(topr);
      Neighbours_a[2] = topr;
      kernel1d[2] = topr;
    }
    if(right!=null){
      n.add(right);
      n2.add(right);
      Neighbours_a[3] = right;
      Neighbours_b[1] = right;
      kernel1d[3] = right;
    }
    if(btmr!=null){
      n.add(btmr);
      Neighbours_a[4] = btmr;
      kernel1d[5] = btmr;
    }
    if(btm!=null){
      n.add(btm);
      n2.add(btm);
      Neighbours_a[5] = btm;
      Neighbours_b[2] = btm;
      kernel1d[6] = btm;
    }
    if(btml!=null){
      n.add(btml);
      Neighbours_a[6] = btml;
      kernel1d[7] = btml;
    }
    if(left!=null){
      n.add(left);
      n2.add(left);
      Neighbours_a[7] = left;
      Neighbours_b[3] = left;
      kernel1d[8] = left;
    }
    Neighbours = n;
    Neighbours2 = n2;
    neighboured = true;
    }
  };
  
  public void compareNeighbours(){

    if(!compared){
    for(int i=0;i<Neighbours_b.length;i++){
      Grid_space g = Neighbours_b[i];
      //Grid_space g = Neighbours_b.get(i);
      if(g!=null){
        if(g.col==col)Walls_b.set(i,false);
        else Walls_b.set(i,true);
      }
      else Walls_b.set(i,true);
      //fill(255);
      
      if(pos()&&debug){
            fill(0);
            stroke(0);
            ellipse(x+w/2,y+h/2,10,10);
            if(g!=null&&g.col!=col)line(x+w/2,y+h/2,g.x+w/2,g.y+h/2);
            if(g!=null)text(i,g.x+w/2+10,g.y+h/2);
          }
    }}
  };

  public void get_neighbours(Grid g){
    
    if(!neighboured){
      
    ArrayList<Grid_space> n = new ArrayList<Grid_space>();
    ArrayList<Grid_space> n2 = new ArrayList<Grid_space>();
    ArrayList<Grid_space> n3 = new ArrayList<Grid_space>();
    int cell = id; 
    
    Grid_space b = g.squares.get(cell);
    
    Grid_space topl,top,topr,right,btmr,btm,btml,left;
    
       topl = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) - 1,g);
       top = index2(PApplet.parseInt(xpos) , PApplet.parseInt(ypos) - 1,g);
       topr = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos) - 1,g);
       right = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos),g);
       btmr = index2(PApplet.parseInt(xpos) + 1, PApplet.parseInt(ypos) + 1,g);
       btm = index2(PApplet.parseInt(xpos) , PApplet.parseInt(ypos) + 1,g);
       btml = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) + 1,g);
       left = index2(PApplet.parseInt(xpos) - 1, PApplet.parseInt(ypos) ,g);
    
    if(topl!=null){
      n.add(topl);
      Neighbours_a[0] = topl;
      kernel1d[0] = topl;
      n3.add(topl);
    }else{
      n3.add(null);
    }
    if(top!=null){
      n.add(top);
      n2.add(top);
      Neighbours_a[1] = top;
      Neighbours_b[0] = top;
      kernel1d[1] = top;
      n3.add(top);
    }else{
      n3.add(null);
      //Walls_b.set(0,null);
    }
    if(topr!=null){
      n.add(topr);
      Neighbours_a[2] = topr;
      kernel1d[2] = topr;
      n3.add(topr);
    }else{
      n3.add(null);
    }
    if(right!=null){
      n.add(right);
      n2.add(right);
      Neighbours_a[3] = right;
      Neighbours_b[1] = right;
      kernel1d[3] = right;
      n3.add(right);
    }else{
      n3.add(null);
      //Walls_b.set(1,null);
    }
    if(btmr!=null){
      n.add(btmr);
      Neighbours_a[4] = btmr;
      kernel1d[5] = btmr;
      n3.add(btmr);
    }else{
      n3.add(null);
    }
    if(btm!=null){
      n.add(btm);
      n2.add(btm);
      Neighbours_a[5] = btm;
      Neighbours_b[2] = btm;
      kernel1d[6] = btm;
      n3.add(btm);
    }else{
      n3.add(null);
      //Walls_b.set(2,null);
    }
    if(btml!=null){
      n.add(btml);
      Neighbours_a[6] = btml;
      kernel1d[7] = btml;
      n3.add(btml);
    }else{
      n3.add(null);
    }
    if(left!=null){
      n.add(left);
      n2.add(left);
      Neighbours_a[7] = left;
      Neighbours_b[3] = left;
      kernel1d[8] = left;
      n3.add(left);
    }else{
      n3.add(null);
      //Walls_b.set(3,null);
    }
    
    
    Neighbours = n;
    Neighbours2 = n2;
    Neighbours3 = n3;
    
    neighboured = true;
    }
  };

  public void getNeighbours4(int n){

  for(int i=ypos -n;i<ypos +n;i++){
    for(int j=xpos -n;j<xpos +n;j++){

      Grid_space g = null;
      int p = j + i * (2 * n +1);

      if(j==xpos||j<parent.cols||j<parent.cols)j++;
      if(i==ypos||i<parent.cols||j>parent.cols)i++;
      if(j!=xpos&&i!=ypos){
        g = parent.squares.get(p);

        if(g.col==col);
      }
      
  }}
  neighboured = true;
};

public void getNeighbours4(Grid a){

  if(!neighboured){
    // fill(255);
    // text(Neighbours_b.length,x,y+h/2);
    for(int i= ypos-1;i<ypos+2;i++){
      
      for(int j= xpos-1;j<xpos+2;j++){

        Grid_space g = null;
        int p = (j) + (i) * a.cols;

        if( p>=0&&p<a.squares.size()
            &&j>=0&&j<a.cols
            &&i>=0&&i<a.rows){
            g = a.squares.get(p);
            Neighbours_8.add(g);
          }
          else Neighbours_8.add(null);
          //count ++;
        }}
      //println(Neighbours_8.size());

      for(int i=1;i<Neighbours_8.size();i+=2){

        Grid_space g = Neighbours_8.get(i);
        //Neighbours_a[i] = g;

        //if(Neighbours_4.size()<=4&&g==null)
        Neighbours_4.add(g);
        Neighbours_b[floor(i/2)] = g;
      }
      //println(Neighbours_4.size());
  neighboured = true;
}

};
  
};




public Grid_space index2(int xpos,int ypos,Grid a){
  
  Grid_space b = null;
  if(a.toggle){
    if(xpos<0||xpos>a.cols-1||ypos<0||ypos>a.rows-1) return null;
    else b = a.squares.get(xpos + (ypos * PApplet.parseInt(a.cols)));
      }else{
        if(xpos<0||xpos>a.cols-1||ypos<0||ypos>a.rows-1)return null;
        else b = a.squares.get(xpos + (ypos * PApplet.parseInt(a.cols)));
      }
  return b;
};

public Grid_space index2(int xpos,int ypos,GridImg a){
  Grid_space b = null;
  if(a.toggle){
    if(xpos<0||xpos>a.img.width-1||ypos<0||ypos>a.img.height-1)return null;
    else b = a.imsquares.get(xpos + (ypos * PApplet.parseInt(a.img.width)));
      }else{
      if(xpos<0||xpos>a.cols-1||ypos<0||ypos>a.rows-1)return null;
      else b = a.imsquares.get(xpos + (ypos * PApplet.parseInt(a.cols)));
    }
  return b;
};
class Html{
  
  String html = "",url;
  ArrayList<String> lines = new ArrayList<String>();
  ArrayList<String> links = new ArrayList<String>();
  boolean stop = false,textScanned;
  
  int counter;
  
  Html(String Url){
    url = Url;
    
    
    String line, result = "";
      if(!stop){
      try {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        setRequestHeaders(conn);
        BufferedReader rd = new BufferedReader
          (new InputStreamReader(conn.getInputStream()));
        while ( (line = rd.readLine ()) != null) {
          result += line;
          lines.add(line);
          html += line;
        }
        rd.close();stop = true;
      } 
      catch (Exception e) {
        e.printStackTrace();
      }}
  };
  
  public void getString(){
    
  String html = getHTML(url);
  //println(html);
  }

    public String getHTML(String url) {
      
      String line, result = "";
      if(!stop){
    
      try {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("GET");
        setRequestHeaders(conn);
        BufferedReader rd = new BufferedReader
          (new InputStreamReader(conn.getInputStream()));
        while ( (line = rd.readLine ()) != null) {
          result += line;
          lines.add(line);
          html += line;
        }
        rd.close();stop = true;
      } 
      catch (Exception e) {
        e.printStackTrace();
      }}
    
      return html;
    }

    public void setRequestHeaders(HttpURLConnection conn)
    {
      String ua = "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_6_8) AppleWebKit/536.5 (KHTML, like Gecko) Chrome/19.0.1084.56 Safari/536.5";
      conn.setRequestProperty("User-Agent", ua);
      conn.setRequestProperty("Accept-Language", "en-US,en;q=0.8");
      conn.setRequestProperty("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.3");
      conn.setRequestProperty("Connection", "keep-alive");
      conn.setRequestProperty("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
    }
    
    public void readString(){
      
      //for(int i=0;i<html
      
      fill(255);
      for(int i=0;i<lines.size();i++){
        String s = lines.get(i);
        
        text(s,40,40+10*i);
      }
      
    };
    
    public void getLinks(){
      counter = 0;
      if(!textScanned){
      for(int i=0;i<html.length() - 4;i++){
        char h = html.charAt(i);
        char t = html.charAt(i+1);
        char t_ = html.charAt(i+2);
        char p = html.charAt(i+3);
        
        if(h=='h'&&t=='t'&&t_=='t'&&p=='p'){
          counter = i;
          
          findEnd(i);
          }
          if(i==html.length() - 5) textScanned = true;
      }}
      
      if(textScanned)println(links.size());
      
      
      
    };
    
    public void findEnd(int i){
      
      for(int j=i+3;j<html.length();j++){
            char end = html.charAt(j);
            if(end=='>'){
              links.add(html.substring(counter,j));break;
            }}
    };
    
    public void displayLinks(){
      
      for(int i=0;i<links.size();i++){
        String s = links.get(i);
        fill(255);
        text(s,10,50 + 10 * i);
      }
      
    };
  
};



class Image extends Grid {

  ArrayList<PImage> images = new ArrayList<PImage>();
  ArrayList<ArrayList<PImage>> segmentations = new ArrayList<ArrayList<PImage>>();
  boolean dotp, maxp, minp, kmeans, colour, bw, rgb;
  HashMap<Integer, Integer> processCount = new HashMap<Integer, Integer>();
  PImage image;

  Image(ArrayList<PImage> image, float threshold) {

    for (int i=0; i<image.size(); i++) {
      images.add(image.get(i));
    }
  };

  Image(PImage image ) {
    images.add(image);
  };

  public void init() {
    if (!init) {
      for (int i=0; i<image.height; i++) {
        for (int j=0; j<image.width; j++) {
        }
      }
    }
  };

  public void rescale() {
  };

  public void process(Float[]Kernel) {

    int ky = Kernel.length;


    for (int i=0; i<images.size(); i++) {

      PImage p = images.get(i);
      p.loadPixels();

      for (int y=0; y<p.height; y++) {
        for (int x=0; x<p.width; x++) {
        }
      }
      p.updatePixels();
    }
  };

  public void process(float[][]Kernel) {

    for (int i=0; i<images.size(); i++) {

      PImage p = images.get(i);
      PImage p2 =  createImage(p.width, p.height, RGB);
      p2.loadPixels();
      for (int y=0; y<p.height; y++) {
        for (int x=0; x<p.width; x++) {

          if (bw)pixels[x+y*image.width] = convolveB(x, y, Kernel);
          else if (rgb)pixels[x+y*image.width] = convolveRGB(x, y, Kernel);
          else if (kmeans)pixels[x+y*image.width] = kmeans(x, y, Kernel);
          else if (maxp)pixels[x+y*image.width] = maxPooling(x, y, Kernel);
          else if (minp)pixels[x+y*image.width] = minPooling(x, y, Kernel);
          else if (dotp)pixels[x+y*image.width] = dotPooling(x, y, Kernel);
        }
      }

      p2.updatePixels();
      ArrayList<PImage> convolution = new ArrayList<PImage>();

      if (segmentations.size()<i) {
        convolution.add(p2);
        segmentations.add(convolution);
      } else segmentations.set(i, convolution);

      if (processCount.get(i)==null)processCount.put(i, segmentations.get(i).size());
      else processCount.replace(i, segmentations.get(i).size());
    }
  };

  public int kmeans(int x, int y, float[][] kernel) {
    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        //if(brightness(image.pixels[i+j*image.width])>c)c = brightness(image.pixels[i+j*image.width]);
      }
    }

    return c;
  };

  public int maxPooling(int x, int y, float[][] kernel) {
    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        if (brightness(image.pixels[i+j*image.width])>c)c = PApplet.parseInt(brightness(image.pixels[i+j*image.width]));
      }
    }

    return c;
  };

  public int minPooling(int x, int y, float[][] kernel) {

    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(255);
    int count = 0;

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        if (brightness(image.pixels[i+j*image.width])<c)c = PApplet.parseInt(brightness(image.pixels[i+j*image.width]));
      }
    }

    c /= count;

    return c;
  };

  public int avPooling(int x, int y, float[][] kernel) {
    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);
    int count = 0;

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        c+= brightness(image.pixels[i+j*image.width]);
      }
    }

    c /= count;

    return c;
  };

  public int dotPooling(int x, int y, float[][] kernel) {

    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        c+= brightness(image.pixels[i+j*image.width]);
      }
    }

    return c;
  };

  public int convolveB(int x, int y, float[][] kernel) {

    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        c+= brightness(image.pixels[i+j*image.width]);
      }
    }

    return c;
  };

  public int convolveRGB(int x, int y, float[][] kernel) {

    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        c+= image.pixels[i+j*image.width];
      }
    }

    return c;
  };

  public int hog(int x, int y, float[][] kernel) {

    int sy = y-floor(kernel.length/2);
    int sx = x-floor(kernel[0].length/2);

    int ey = y+floor(kernel.length/2); 
    int ex = x+floor(kernel[0].length/2);

    int c = color(0);

    for (int i=sy; i<ex; i++) {
      for (int j=sx; j<ey; j++) {

        c+= image.pixels[i+j*image.width];
      }
    }

    return c;
  };
};
class GridImg extends Grid {

  String []imgboxLabels = {"Normal", "Hide", "Graph", "Attractor", "Forward", "Backwards", 
    "Pause", "Heading", "Save", "Load", "Contour", "Mouse", "Reset", 
    "Populate Boundaries", "Spawn Entities", "Debug"};
  Menu imgbox;

  GridImg() {
  };

  GridImg(float xx, float yy, int ww, int hh, ArrayList<PImage> Images) {

    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    rows = ww;
    cols = hh;
    bordersize = 1;
    images = Images;
    Cols = cols;
    Rows = rows;
    img = images.get(0);
    squares2 = new Grid_space[rows][cols];

    imgbox = new Menu(W-90, H/2, 70, imgboxLabels);
    imgbox.draggable = true;

    Button btn73 = imgbox.items.get(9);

    imgbox.items.get(9).submenu = new Menu(btn73.x, btn73.y, btn73.w, btn73.h);

    for (int i=0; i<images.size(); i++) {

      Button a =  new Button(btn73.x-btn73.w, btn73.y - 20 * i, imgbox.w, 20, str(i));
      a.id = i;
      a.parent = imgbox.items.get(9).submenu;
      buttons.add(a);
      a.parent = imgbox.items.get(9).submenu;
      imgbox.items.get(9).submenu.items.add(a);
    }
    //search = new Window( 50,50,200,100,"C:\\Users\\paul goux\\");
    //search.launchable = false;
  };

  public void save() {
  };

  public void load() {
  };

  public void img_init() {

    if (img!=null&&!init) {
      imrows = img.height;
      rows = img.height;
      cols = img.width;
      imcols = img.width;
      imw = img.width;
      imh = img.height;
      totalpixels = imrows*imcols;
    }
    if (toggle&&img!=null) {

      if (imsquares.size()<rows*cols) {
        for (int yy = 0; yy < img.height; yy++) {
          for (int xx = 0; xx< img.width; xx++) {

            int num = xx + yy * img.width;

            Grid_space a = new Grid_space(x+xx, y+yy, 1, 1, num, xx, yy);
            a.col = img.pixels[xx + yy * img.width];
            a.col2 = a.col;
            a.col3 = a.col;
            a.col4 = a.col;
            a.col5 = a.col;
            a.parent = this;
            a.image = true;
            imsquares.add(a);
          }
        }
      } else init = true;
    }

    if (imreset) init = false;
  };

  public void img_functions() {

    fill(255);
    kernel_modifier();
    //imgopen();
    img_init();
    img_draw();
  };

  public void img_draw() {

    if (img!=null&&toggle) {
      imgbox.draw();
      imgsliderList.draw();
      imgreset = false;
      if (normal_img) draw_img();
      if (mouse_img) draw_imgmouse();
      imgreset = false;
      if (blur_img) draw_imgblur();
      imgreset = false;
      if (linedetect_img) draw_imglinedetect();
      imgreset = false;
      if (dot_img) draw_imgdot();
      imgreset = false;
      if (bright) draw_brightness();
      imgreset = false;
      if (sharp) draw_sharpness();
      imgreset = false;
      if (!normal_img&&!mouse_img&&!blur_img&&!linedetect_img&&!dot_img&&!bright&&!sharp||!imtoggle) convolved = false;
      if (imgsliderList.menu.sltoggle) convolved = false;
    }
  };

  public void draw_img() {

    float count = 0;
    if (!reset) {
      img.loadPixels();
      for (int i=1; i<imsquares.size(); i++) {
        Grid_space a = imsquares.get(i);
        img.pixels[a.id] = color(a.col);

        if (count == imsquares.size()-1) reset = true;
      }
      img.updatePixels();
    }

    image(img, 23, y, img.width, img.height);
  };

  public void move() {
  }

  public void draw_imgblur() {
  };

  public void set(PImage a) {

    img = a;
    img1 = a;
  };

  public void draw_imgmouse() {
    img.loadPixels();
    //img1.loadPixels();
    for (int i=1; i<imsquares.size(); i++) {
      Grid_space a = imsquares.get(i);

      float d = dist(a.x, a.y, mouseX, mouseY);
      float m = map(d, 0, mdist, 255, 0);

      float r = red(a.col2);
      float g = green(a.col2);
      float b = blue(a.col2);
      img.pixels[a.id] = color(r, g, b, m);
      //img1.pixels[a.id] = a.col2;
    }
    img.updatePixels();
    //img1.updatePixels();
    image(img, x, y, imw, imh);
  };

  public void draw_imglinedetect() {
    int count = 0;
    if (imgsliderList.menu.sltoggle) convolved = false;  
    if (!convolved) {
      img.loadPixels();
      //img1.loadPixels();
      fill(255);
      text(hkernel1d[0], 1000, 600);
      for (int i=0; i<imsquares.size(); i++) {

        Grid_space a = imsquares.get(i);

        float temp_color = 0;

        if (!a.neighboured)a.get_neighbours(this);

        for (int j=0; j<a.kernel1d.length; j++) {

          Grid_space a1 = a.kernel1d[j];
          float c = hkernel1d[j];
          float d = vkernel1d[j];
          float left = difflkernel1d[j];
          float right = diffrkernel1d[j];
          float up = diffukernel1d[j];
          float down = diffdkernel1d[j];

          if (a1!=null) {
            temp_color += c * color(a1.col3);
            temp_color += d * color(a1.col3);
            temp_color += left * color(a1.col3);
            temp_color += right * color(a1.col3);
            temp_color += down * color(a1.col3);
            temp_color += up * color(a1.col3);
          }
        }
        count ++;

        temp_color /=5;

        if (temp_color>threshold) {
          img.pixels[a.id] = color(255);
        } else {
          img.pixels[a.id] = color(0);
        }
        //img1.pixels[a.id] = a.col3;
        if (count==totalpixels)convolved = true;
      }
      img.updatePixels();
      //img1.updatePixels();
    }
    image(img, x, y, img.width, img.height);
  };

  public void img_workflow() {

    if(workflow!=null)workflow.displayList();
    if (workflow.done) {
      for (int i=0; i<workflow.tasks.size(); i++) {

        String task = workflow.tasks.get(i);

        Class  aClass = Grid.class;
        Method method = null;
        try {

          method = aClass.getMethod("task", null);
        }
        catch (NullPointerException e) {
        }
        catch (NoSuchMethodException e) {
        }
      }
    }
  };

  public void imgopen() {
    if (menu) {

      //search.toggle=true;
      //search.display_grid();
      if (mousePressed)link = search.currentf;
      if (link!=null) {

        if (link.endsWith("jpg")|| link.endsWith("jpeg") ||link.endsWith("png")||link.endsWith("bmp")||
          link.endsWith("gif")||link.endsWith("JPG")||link.endsWith("JPEG")||link.endsWith("PNG")||
          link.endsWith("BMP")||link.endsWith("GIF")) {

          //if (imgtemp==null||updateimage)
          img = loadImage(link);

          //image(img,100,200);
          imsquares = new ArrayList<Grid_space>();
          im_init = false;
          link = null;
        }
      }
    } 
    //else search.toggle=false;
  };

  public void draw_brightness() {
    int count = 0;
    if (!convolved) {
      img.loadPixels();
      for (int i=0; i<imsquares.size(); i++) {

        Grid_space a = imsquares.get(i);

        float temp_color = 0, bright = 255;

        float r = red(a.col4);
        float g = green(a.col4);
        float b = blue(a.col4);

        if (!a.neighboured)a.get_neighbours(this);
        if (count==0)a.convolved = false;
        //if(!a.convolved){

        for (int j=0; j<a.kernel1d.length; j++) {

          Grid_space a1 = a.kernel1d[j];
          float left = difflkernel1d[j];
          float right = diffrkernel1d[j];
          float up = diffukernel1d[j];
          float down = diffdkernel1d[j];

          if (a1!=null) {
            bright += brightness(a1.col4)*left;
            bright += brightness(a1.col4)*right;
            bright += brightness(a1.col4)*up;
            bright += brightness(a1.col4)*down;
          }
        }
        count ++;
        if (bright>threshold)img.pixels[a.id] = color(255);
        else img.pixels[a.id] = color(0);
        if (count==imsquares.size()-1)convolved = true;
      }

      img.updatePixels();
    }
    image(img, x, y, img.width, img.height);
  };

  public void draw_sharpness() {
    int count = 0, c2 = 0;
    if (!convolved) {
      img.loadPixels();

      for (int i=0; i<imsquares.size(); i++) {

        Grid_space a = imsquares.get(i);

        float r = 0, g =0, b = 0;

        //float r = red(a.col5),g = green(a.col5),b = blue(a.col5);

        if (!a.neighboured)a.get_neighbours(this);
        if (count==totalpixels)convolved = true;
        for (int j=0; j<a.kernel1d.length; j++) {

          Grid_space a1 = a.kernel1d[j];
          float c = hkernel1d[j];
          float d = vkernel1d[j];

          if (a1!=null) {
            r += c*red(a1.col5);
            r += d*red(a1.col5);
            g += c*green(a1.col5);
            g += d*green(a1.col5);
            b += c*blue(a1.col5);
            b += d*blue(a1.col5);
            c2 ++;
          }
          count ++;
        }
        img.pixels[a.id] = color(r, g, b);
        if (count==totalpixels)convolved = true;
      }

      img.updatePixels();
    }
    image(img, x, y, img.width, img.height); 
    if (imgsliderList.menu.sltoggle) convolved = false;
  };

  public void img_refresh() {
    if (!refreshed) {
      img.loadPixels();
      for (int i=1; i<imsquares.size(); i++) {
        Grid_space a = imsquares.get(i);
        //img.pixels[a.id] = a.col;
      }
      img.updatePixels();
      refreshed = true;
    }
  };

  public void draw_imgdot() {

    img.loadPixels();
    for (int i=0; i<imsquares.size(); i++) {
      Grid_space a = imsquares.get(i);
      img.pixels[a.id] = a.col;
      noStroke();
      fill(a.col);
      rect(a.x, a.y, 1, 1);
    }
    img.updatePixels();
  };
};
class Matrix{
  
  int i,j;
  //ArrayList<float> m1,m2;
  float [][] m1,m2,tpose;
  float [] m3,m4;
  
  ArrayList<Matrix> matrices = new ArrayList<Matrix>();
  //ArrayList<Float[]> matrices = new ArrayList<Matrix>();
  float [][]matrix;
  
  
  Matrix(float [][] a){
    m1 = a;
    
  };
  
  Matrix(int xx,int yy,boolean c){
    
    matrix = new float[yy][xx];
    
    if(c){
    for(int i=0;i<yy;i++){
      for(int j=0;j<xx;j++){
        
        matrix[xx][yy] = random(-1,1);
        
    }}}
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  //---------------------------dot product------------------
  public float[][] dot(float [][] a,float [][]  b){
    
      int x = a.length;
      int y = b.length;
      int z = b[0].length;
      float [][]temp = new float[x][z];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
               for (int k=0;k<z;k++){
                   
      temp[i][j] += a[i][k] * b[j][k];
               }}}
      m1 = temp;
      return m1;
  };
  
  public float[] dot(float [] a,float []  b){
    
      int x = a.length;
      int y = b.length;
      float []temp = new float[x];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
               }}
               
      m3 = temp;
      return m4;
  };
  
  public PVector dot(PVector t, PVector u){
      
      float [][]a = {{t.x,t.y,t.z}};
      float [][]b = {{u.x,u.y,u.z}};
    
      int x = a.length;
      int y = b.length;
      int z = b[0].length;
      float [][]temp = new float[x][z];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
               for (int k=0;k<z;k++){
                   
      temp[i][j] += a[i][k] * b[j][k];
               }}}
      m1 = temp;
      PVector result = new PVector(m1[0][0],m1[0][1],m1[0][2]);
      return result;
  };
  
  
  //--------------------cross product-----------------------
  public float[][] cross(float [][] a,float [][]  b){
    
    return a;
  };
  
  //-------------matrix multiplyer------------------
  public float[][] mult(float [][] a,float [][]  b){
      int x = a.length;
      int y = b[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] * b[i][j];
               }}
      m1 = temp;
      return m1;
  };
  
  public float mult(float a, float b){
    a = a * b;
    return a;
  };
  
  public float[][] mult(float[][] a, float b){
      int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] * b;
               }}
      m1 = temp;
      return m1;
  };
  
  public float[][] add(float [][] a,float [][]  b){
    int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] + b[i][j];
               }}
      m1 = temp;
      return m1;
  };
  
  //------------------------------------------
  public float[][] add(float [][] a,float  b){
    int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] + b;
               }}
      m1 = temp;
      return m1;
  };
  
  public float[][] translate(float [][] a,float b){
    
      int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] + b;
               }}
      m1 = temp;
      return m1;
  };
  
  public float[][] transpose(float[][] a){
      int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[y][x];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[j][i] ;
               }}
      tpose = temp;
      return tpose;
  };

  public void transposeFlat(){




  };
  
  public void determinant(){
    
    //return a;
  }
  
  public float[][] substract(float [][] a,float [][]  b){
    int x = a.length;
      int y = a[0].length;
      float [][]temp = new float[x][y];
      
      for (int i=0;i<x;i++){
          for (int j=0;j<y;j++){
                   
      temp[i][j] += a[i][j] - b[i][j];
               }}
      m1 = temp;
      return m1;
  };
  
  public float[][] randomize(float[][] a){
    
    return a;
  };
  
};
class Menu {

  int id, item, t, toggle, toggle2, type = 0, index =-1, subindex = -1, t2, sindex=-1, counter, slcount,nindex = -1;
  public float x, y, bx = x, by = y, w, h, xoff, yoff, window = 0, htotal, Yoff, xpos, ypos, tsize = 12, bsize, spacing, twidth;
  PVector mouse,mousePos =new PVector(0,0);
  public String label, blabel,itemLabel;
  float dx,dy;
  boolean drag = false, resize = false, slide = false, border = false, menu, menuhover = false, highlightable = true, animate, vertical, horizontal = false, dmenu;
  boolean mdown, mup, smdown, smup, listbox, open_menu, sltoggle, free,parentRight,draggable,parentCanvas,m2down;
  public boolean visible = true,show = true;
  ArrayList<Button> items = new ArrayList<Button>();
  ArrayList<Slider> sliders = new ArrayList<Slider>();
  ArrayList<Dropdown> dMenus = new ArrayList<Dropdown>();
  ArrayList<Boolean> child = new ArrayList<Boolean>();
  ArrayList<String> labels = new ArrayList<String>();
  HashMap<String, Boolean> values ;
  Window mWindow = null;
  Button parent;
  tab tab;
  PGraphics localCanvas;
  tab parentTab;
  //Menu dmenu;
  Dropdown dMenu;

  Menu link;
  int col = color(0,150), bcol, tcol = color(255), fcol = color(255, 80), hcol = color(255, 50);

  public Menu() {
  };

  Menu(float xx, float yy, float ww, float hh, String Label) {
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    label = Label;
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;
  }

  Menu(float xx, float yy, float ww, float hh) {
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;
  }

  

  Menu(float xx, float yy, float ww, float hh, String Label, String [] list) {

    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    xoff = 0;
    yoff = 0;
    label = Label;
    toggle =0;
    bcol = col;
    bsize = tsize;
    slide = true;
    float bwidth = 0;

    for (int i =0; i<list.length; i++) {
      String l = list[i];

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
      Button a = new Button( x, y + 20 *(i+1), bwidth, h, l);
      a.border = false;
      a.parent = this;
      items.add(a);
    }
    twidth = bwidth*items.size();
  };

  Menu(float xx, float yy, float ww, float hh, String Label, String [] list, int n) {
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = hh;
    xoff = 0;
    yoff = 0;
    label = Label;
    toggle =0;
    bcol = col;
    bsize = tsize;
    slide = true;
    float bwidth = 0;
    spacing = 0;
    for (int i =0; i<list.length; i++) {
      String l = list[i];

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
    }
    
    if(w>bwidth)bwidth = w;

    for (int i =0; i<list.length; i++) {
      String l = list[i];

      Button a = new Button( x, y + 20 *(i+1), bwidth, h, l);
      a.border = false;
      a.parent = this;
      a.togglebox = true;
      items.add(a);
    }

    twidth = bwidth*items.size();
  };

  Menu(float xx, float yy, float ww, String [] list) {
    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;

    h = list.length*20;
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;
    //slide = true;

    float bwidth = 0;

    for (int i =0; i<list.length; i++) {
      String l = list[i];

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
    }

    for (int i =0; i<list.length; i++) {
      String l = list[i];
      Button a = new Button( x, y + 20 *(i), bwidth, 20, l);
      a.border = false;
      a.parent = this;
      a.togglebox = true;
      items.add(a);
    }

    twidth = bwidth*items.size();
    w = bwidth;
  };



  Menu(float xx, float yy, float ww, ArrayList<String> list) {
    x = xx;
    y = yy;
    w = ww;

    h = list.size()*20;
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;
    //slide = true;

    float bwidth = 0;

    for (int i =0; i<list.size(); i++) {
      String l = list.get(i);

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
    }

    for (int i =0; i<list.size(); i++) {
      String l = list.get(i);

      Button a = new Button( x, y + 20 *(i), bwidth, 20, l);
      a.border = false;
      a.parent = this;
      a.togglebox = true;
      items.add(a);
    }

    twidth = bwidth*items.size();
    w = bwidth;
  };

  Menu(float xx, float yy, float ww, String [] list, float k) {

    x = xx;
    y = yy;
    bx = x;
    by = y;
    w = ww;
    h = list.length*(20+k) - k;
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;
    spacing = k;

    float bwidth = 0;

    for (int i =0; i<list.length; i++) {
      String l = list[i];

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
    }

    for (int i =0; i<list.length; i++) {
      String l = list[i];
      Button a = new Button( x, y + (20+k) *(i), bwidth, 20, l);
      a.border = false;
      a.parent = this;
      a.togglebox = true;
      items.add(a);
    }

    twidth = bwidth*items.size();
    w = bwidth;
  };

  Menu(float xx, float yy, String [] list) {
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    h = list.length*(20);
    xoff = 0;
    yoff = 0;
    toggle =0;
    bcol = col;
    bsize = tsize;

    float bwidth = 0;

    for (int i =0; i<list.length; i++) {
      String l = list[i];

      if (textWidth(l)+20>bwidth)bwidth = textWidth(l)+20;
    }

    for (int i =0; i<list.length; i++) {
      String l = list[i];
      Button a = new Button( x, y + (20) *(i), bwidth, 20, l);
      a.border = false;
      a.parent = this;
      a.togglebox = true;
      items.add(a);
    }

    twidth = bwidth*items.size();
    w = bwidth;
  };

  Menu(String k, float xx, float yy, float ww, String dir) {
    if (k=="dir"|| k=="DIR"||k=="Dir") {
      x = xx;
      y = yy;
      bx = x;
      by = y;
      w = ww;

      xoff = 0;
      yoff = 0;
      toggle =0;
      bcol = col;
      bsize = tsize;

      String []list = listFileNames(dir);

      for (int i =0; i<list.length; i++) {

        String l = list[i];
        for (int j=0; j<list[i].length(); j++) {
          Button a = new Button( x, y + 20 *(i), w, 20, l);
          a.border = false;
          a.togglebox = true;
          a.parent = this;
          items.add(a);
        }
      }
    }

    h = items.size()*20;
    Slider s = new Slider(x, y, 20, 20);
    s.vertical = true;
    sliders.add(s);
  };

  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void setParentCanvas(PGraphics canvas){
    parentCanvas = true;
    localCanvas = canvas;
    
  };

  public void draw() {
    logic();
    if(show)trace();
    if (draggable) {
      if(!parentCanvas){
        stroke(0);
        fill(0,266,0,150);
        rect(x,y-5, w, 5);
      }else{
        localCanvas.stroke(0);
        localCanvas.fill(0,150);
        localCanvas.rect(x,y-5, w, 5);
      }
    }
  };
  public void draw2() {
    if(mousePressed)click();
    logic();
    if(show)trace();
    if (draggable) {
      if(!parentCanvas){
        stroke(0);
        fill(0,266,0,150);
        rect(x,y-5, w, 5);
      }else{
        localCanvas.stroke(0);
        localCanvas.fill(0,150);
        localCanvas.rect(x,y-5, w, 5);
      }
    }
  };
  
  public void draw(PGraphics canvas) {
    logic(mouse);
    if(show)trace(canvas);
    
  };

  public void drawWindow() {
  }

  public void trace() {
    t2 = 0;
    slcount = 0;
    
    getState();
    drawButtons();
    //if(pos()&&toggle==1)println(label);
    drawDmenu();
    drawSliders();
  };

  public void trace(PGraphics canvas) {
    t2 = 0;
    slcount = 0;

    getState(canvas);
    drawButtons(canvas);
    //drawDmenu();
    drawSliders();
  };

  public void getState() {

    stroke(0);
    if (!border)noStroke();

    //if(toggle==1){
      fill(bgcol);
      if (visible)rect(x, y, w, h);
      fill(col);
      if (visible)rect(x, y, w, h);
      fill(0);
    //}

    if(label!=null) {
      fill(tcol);
      textSize(bsize);
      text(label, x+xoff, y+yoff + 18);
      textSize(12);
      //fill(col);
    } else {
      toggle = 1;
    }

    
  };
  
  public void getState(PGraphics canvas) {
    while (items.size()!=child.size()) {
      child.add(false);
    }
    canvas.stroke(0);
    if (!border)canvas.noStroke();

    canvas.fill(bgcol);
    if (visible)canvas.rect(x, y, w, h);
    canvas.fill(col);
    if (visible)canvas.rect(x, y, w, h);
    canvas.fill(0);

    if(label!=null) {
      canvas.fill(tcol);
      canvas.textSize(bsize);
      canvas.text(label, x+xoff, y+yoff + 18);
      canvas.textSize(12);
      //fill(col);
    } else {
      toggle = 1;
    }
  };

  public void drawButtons() {
    
    float speed = 2;
    if (items.size()>0) {
      // if(pos()&&mousePressed){
      //   println("hello");
      //   toggle = 1;
      // }
      for (int i=0; i<items.size(); i++) {

        Button a = items.get(i);
        a.id = i;

        
        if (a.parent!=null&&label==null&&!horizontal){
          a.y = a.parent.y + i * (a.h + spacing);
          a.x = a.parent.x;
        }
        
        if (a.parent!=null&&label!=null&&!horizontal&&!free){
          a.y = a.parent.y + 20 + i * (a.h + spacing);
          a.x = a.parent.x;
        }
        
        if (a.parent!=null&&label==null&&horizontal) {
          a.x = a.parent.x + (a.parent.w + spacing) + i * a.w;
          a.y = y;
        }
        if(a.submenu!=null){
          if(!a.submenu.parentRight){
            a.submenu.x = a.x + a.w;
            a.submenu.y = a.y;
          }else{
            a.submenu.x = a.x - a.submenu.w;
            a.submenu.y = a.y;
          }
        }

        if(a.dMenu!=null){
          a.dMenu.x = a.x + a.w;
          a.dMenu.y = a.y;
        }

        if (toggle==1) {
          if (a.pos(mousePos)&&i>=0) {
            t2 ++;
            index = i;
          }
          if (a.subpos(mousePos)&&i>=0) {
            t2 ++;
            subindex = a.id;
          }}

        if (!slide) {
          if (toggle==1)window = y+20*(items.size()+1);
          else window = 0;
        } else {
          if (toggle==1) {
            window += speed;

            if (!horizontal) {
              if (window>y + 20*items.size()) window = y+20*items.size();
            } else {
              if (window>x + a.w*items.size())window = x+a.w*items.size();
            }} else {
            window -= speed;
            if (window<0)window = 0;
          }}

        if (!horizontal) {
          if (y + window >= a.y) {
            if (a.visible){
            if(!parentCanvas)a.draw();
            else {
              a.mouse = mouse;
              a.draw(localCanvas);
            }}
            a.highlight();
            if (a.pos(mousePos)&&!parentCanvas)leftdown = true;
            if (parentCanvas&&a.pos(mousePos))leftdown = true;
            else leftdown = false;
          }
        } else {
          if (x + window >= a.x) {
            if (a.visible){
            if(!parentCanvas)a.draw();
            else {
              a.mouse = mouse;
              a.draw(localCanvas);
            }
            }
            a.highlight();
            if (a.pos(mousePos)&&!parentCanvas)leftdown = true;
            if (parentCanvas&&a.pos(mousePos))leftdown = true;
            else leftdown = false;
          }}}}
    
  };

  public void drawButtons(PGraphics canvas) {
    
    float speed = 2;
    if (items.size()>0) {
      for (int i=0; i<items.size(); i++) {

        Button a = items.get(i);
        a.id = i;

        a.mouse = mouse;
        
        if (a.parent!=null&&label==null&&!horizontal){
          a.y = a.parent.y + i * (a.h + spacing);
          a.x = a.parent.x;
        }
        
        if (a.parent!=null&&label!=null&&!horizontal&&!free){
          a.y = a.parent.y + 20 + i * (a.h + spacing);
          a.x = a.parent.x;
        }
        
        if (a.parent!=null&&label==null&&horizontal) {
          a.x = a.parent.x + (a.parent.w + spacing) + i * a.w;
          a.y = y;
        }
        if(a.submenu!=null){
          if(!a.submenu.parentRight){
            a.submenu.x = a.x + a.w;
            a.submenu.y = a.y;
          }else{
            a.submenu.x = a.x - a.submenu.w;
            a.submenu.y = a.y;
          }
        }

        if(a.dMenu!=null){
          a.dMenu.x = a.x + a.w;
          a.dMenu.y = a.y;
        }

        if (toggle==1) {
          if (a.pos(mouse)&&i>=0) {
            t2 ++;
            index = i;
          }
          if (a.subpos(mouse)&&i>=0) {
            t2 ++;
            subindex = a.id;
          }}

        if (!slide) {
          if (toggle==1)window = y+20*(items.size()+1);
          else window = 0;
        } else {
          if (toggle==1) {
            window += speed;

            if (!horizontal) {
              if (window>y + 20*items.size()) window = y+20*items.size();
            } else {
              if (window>x + a.w*items.size())window = x+a.w*items.size();
            }} else {
            window -= speed;
            if (window<0)window = 0;
          }}

        if (!horizontal) {
          if (y + window >= a.y) {
            if (a.visible)a.draw(canvas);
            a.highlight(mouse);
            if (a.pos(mouse))leftdown = true;
            else leftdown = false;
          }
        } else {
          if (x + window >= a.x) {
            if (a.visible)a.draw(canvas);
            a.highlight(mouse);
            if (a.pos(mouse))leftdown = true;
            else leftdown = false;
          }}}}
    
  };

  public void drawDmenu() {
    float speed = 2;
    if (dMenus.size()>0) {
      
      }
  };
  
  public void add(Slider s,float spacing){
    
    sliders.add(s);
    
    if(items.size()==0)h = (s.h+spacing)*sliders.size();
    else h = (items.get(0).h+spacing)*items.size()+(s.h+spacing)*sliders.size();
  };
  
  public void add(Slider s){
    
    sliders.add(s);
    
    if(items.size()==0)h = (s.h+spacing)*sliders.size();
    else h = (items.get(0).h+spacing)*items.size()+(s.h+spacing)*sliders.size();
  };
  
  public void add(Button b){
    
    items.add(b);
    
    if(sliders.size()==0)h = (b.h+spacing)*items.size();
    else h = (sliders.get(0).h+spacing)*sliders.size()+(b.h+spacing)*items.size();
  };

  public void drawSliders() {
    float speed = 2;
    
    if (sliders.size()>0&&show) {

      if (pos4()) {
        //toggle=1;
        //menuhover = true;
      } else menuhover = false;
      
      for (int i=0; i<sliders.size(); i++) {

        Slider a = sliders.get(i);
        if(parentCanvas)a.mouse = mouse;
        if(parentTab!=null)a.parentTab = parentTab;
        //else a.mouse = new PVector(mouseX,mouseY);
        if (a.toggle||a.mdown) slcount ++;
        a.parent = this;
        if (a.id==-1)a.id = i;
        if (horizontal) { 
          a.vertical = true; 
          a.y = y; 
          a.x = x + a.w + spacing * i;
        }else{
          a.y = y + (a.h + spacing) * i; 
          a.x = x;
        }
        if(!parentCanvas){
        if ((a.pos()||a.btnpos())&&!smdown) {
          smdown = true;
          sindex = i;
          a.mdown = true;
        }}else if ((a.pos(mouse)||a.btnpos(mouse))&&!smdown) {
          smdown = true;
          sindex = i;
          a.mdown = true;
        }
        if(sindex!=i)a.mdown = false;
        if (!mousePressed&&smdown) { 
          smdown = false;
          a.mdown = false;
        }
        if (!slide) {
          if (toggle==1) {
            if (vertical)window = y + spacing * (sliders.size());
            else window = x + spacing * (sliders.size());
          }} else {
          if (toggle==1) {
            window += speed;
            if (vertical) {
              if (window>y + 20 * sliders.size()) {
                window = y + 20 * sliders.size();
              }} else {
              if (window>x + 20 * sliders.size()) {
                window = x + 20 * sliders.size();
              }}} else {
            window -= speed;
            if (window<=0) window = 0;
            
          }}
        if (vertical) {
          
          if (y + window >= a.y){
            
            if (a.visible){
            if(!parentCanvas)a.draw();
            else a.draw(localCanvas);
            }}} else {
          if (x + window >= a.x){

            if (a.visible){
            if(!parentCanvas)a.draw();
            else a.draw(localCanvas);
            }}}}
    }
    if (slcount>0) sltoggle = true;
    else sltoggle = false;
    
  };

  public void borders(Boolean k) {
    for (int i=0; i<items.size(); i++) {
      Button b = items.get(i);

      b.border = k;
    }
  };

  public void update() {
    counter = 0;
    for (int i=0; i<items.size(); i++) {

      Button a = items.get(i);
      if (a.pos()) counter++;
    }
  };

  public void setBorders(Boolean a) {
    for (int i=0; i<items.size(); i++) {
      Button b = items.get(i);

      b.border = a;
    }
  };

  public void logic() {

    mousePos = new PVector(mouseX,mouseY);
    
    if(mouse!=null) mousePos = mouse;
    if(index>-1&&subindex==-1&&!pos()&&mousePressed)index = -1;
    if (mWindow!=null)y = sliders.get(0).valuey;
    if (highlightable) {
      if (pos(mousePos)) col = hcol;
      else col = fcol;
    }

    if (toggle==1)col = hcol;
    else col = fcol;

    if ((pos()||toggle==1)) open_menu = true;
    else open_menu = false;
    if (draggable&&dpos()&&mousePressed&&!drag&&!mdown) {
      mdown = true;
      drag = true;
      dx = mouseX - x;
      dy = mouseY - y;
    }
    
    if(drag){
      x = mouseX - dx;
      y = mouseY - dy;
      
      for (int i=0;i<items.size();i++){
        Button b = items.get(i);
        b.x = x;
      }}
    
    Float X = PApplet.parseFloat(mouseX - pmouseX);
    Float Y = PApplet.parseFloat(mouseY - pmouseY);

    if (!mousePressed) {
      mdown = false;
      mup = true;
      drag = false;
    }

    if (t2>0)menuhover = true;
    else menuhover = false;
    
    if (!pos()) {
      if (mousePressed&&!menu&&file.items.get(6).toggle!=1&&!menuhover&&sliders.size()==0) {
        toggle=0;
        subindex = -1;
        index = -1;
      }}

    if(index>-1&&subindex>-1&&items.get(subindex).submenu!=null&&items.get(subindex).submenu.parentRight){
          //if( index>-1&&subindex>-1&&items.get(subindex).pos()&&!items.get(subindex).subpos())subindex = -1;
        }else if(index>-1&&subindex>-1&&items.get(subindex).submenu!=null){
          if( index>-1&&subindex>-1&&items.get(subindex).pos()&&!items.get(subindex).subpos())subindex = -1;
        }
    if (subindex!=index&&subindex!=-1&&items.size()>0&&sliders.size()==0)index = -1;
    

    if (items.size()>0&&index>=0&&toggle==1) {
      Button a = items.get(index);
      a.highlight2();
    }

    if (type==2) {
      toggle=1;
      if (sliders.size()>0&&sindex>=0&&smdown) {

        Slider b = sliders.get(sindex);
        
          b.mouseFunctions();
          if (b.btnpos()||b.pos()||b.mdown)b.btnh = b.h+5;
          if (!b.mdown) b.btnh = b.h;
          if (b.btnpos()||b.pos()||b.mdown)b.mouseFunctions();
        }
        
      if (sliders.size()>0&&sindex>=0&&!smdown) {
        Slider b = sliders.get(sindex); 
        b.btnh = b.h+2;
      }}

    if (items.size()>0&&subindex>=0&&subindex==index&&toggle==1&&sliders.size()==0) {
      Button a = items.get(subindex);

      if (a.submenu!=null&&a.id==subindex) {

        if (a.submenu.pos2()||a.submenu.menu)menu = true;
        else menu = false; 

        a.submenu.draw();
      }
      if (a.dMenu!=null&&a.id==subindex) {

        if (a.dMenu.menu)menu = true;
        else menu = false; 

        
        if(a.pos()&&!a.subpos()){}
        else a.dMenu.displayDropdown();
        
      }
    }
    if (!animate) {
      if (pos()||toggle==1) {
        if (bsize<tsize+2) bsize += 0.5f;
      } else if (bsize>tsize&&bsize>2)bsize -= 0.5f;
      }
  };
  
  public void logic(PVector m) {

    mousePos = new PVector(mouseX,mouseY);
    if(mouse!=null) mousePos = mouse;

    if (mWindow!=null)y = sliders.get(0).valuey;
    if (highlightable) {
      if (pos(m))col = hcol;
       else col = fcol;
      }

    if (toggle==1)col = hcol;
    else col = fcol;

    if ((pos(m)||toggle==1)) open_menu = true;
    else open_menu = false;
    if (draggable&&dpos(m)&&mousePressed&&!drag&&!mdown) {
      open_menus = true;
      mdown = true;
      drag = true;
      dx = m.x - x;
      dy = m.y - y;
      //mup = false;
    }
    
    if(drag){
      x = m.x - dx;
      y = m.y - dy;
      
      for (int i=0;i<items.size();i++){
        Button b = items.get(i);
        b.x = x;
      }}
      
    if (!mousePressed) {
      mdown = false;
      mup = true;
      drag = false;
    }

    if (t2>0)menuhover = true;
    else menuhover = false;
    
    if (!pos(mouse)) {
      if (mousePressed&&!menu&&file.items.get(6).toggle!=1&&!menuhover&&sliders.size()==0) {
        toggle=0;
        subindex = -1;
        index = -1;
      }}
    if (subindex!=index&&subindex!=-1&&items.size()>0&&sliders.size()==0)index = -1;
    

    if (items.size()>0&&index>=0&&toggle==1) {
      Button a = items.get(index);
      a.highlight2();
    }

    if (type==2) {
      toggle=1;
      if (sliders.size()>0&&sindex>=0&&smdown) {

        Slider b = sliders.get(sindex);
        b.mouseFunctions(m);
        if (b.btnpos(m)||b.pos(m)||b.mdown)b.btnh = b.h+5;
        if (!b.mdown) b.btnh = b.h;
        if (b.btnpos(m)||b.pos(m)||b.mdown)b.mouseFunctions(m);
      }
      if (sliders.size()>0&&sindex>=0&&!smdown) {
        Slider b = sliders.get(sindex); 
        b.btnh = b.h+2;
      }
    }

    if (items.size()>0&&subindex>=0&&subindex==index&&toggle==1&&sliders.size()==0) {
      Button a = items.get(subindex);

      if (a.submenu!=null&&a.id==subindex) {

        if (a.submenu.pos2(m))menu = true;
        else menu = false; 

        a.submenu.draw();
      }
    }
    if (!animate) {
      if (pos(m)||toggle==1) {
        if (bsize<tsize+2)bsize += 0.5f;
      } else if (bsize>tsize&&bsize>0)bsize -= 0.5f;
    }
  };

  public void set_link(Menu a) {

    link = a;
  };

  public boolean pos() {

    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h+1;
  };
  
  public boolean pos(PVector m) {

    return m.x>x&&m.x<x+w&&m.y>y&&m.y<y+h+1;
  };
  
  public boolean pos2() {

    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+20*(items.size());
  };
  public boolean pos2(PVector m) {

    return m.x>x&&m.x<x+w&&m.y>y&&m.y<y+20*(items.size());
  };
  public boolean pos3() {

    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+20*(items.size());
  };
  public boolean pos4() {

    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+20*(sliders.size());
  };

  public void drag() {
  };

  public boolean dpos() {
    return mouseX>x&&mouseX<x+w&&mouseY>y-10&&mouseY<y;
  };
  
  public boolean dpos(PVector m) {
    return m.x>x&&m.x<x+w&&m.y>y-10&&m.y<y;
  };

  public boolean outpos() {
    float X = mouseX;
    float Y = mouseY;
    return (X < x || X > x + w+10) || (Y < y || Y > y + h * (items.size()+1));
  };

  public boolean click(int a){
    boolean k = false;
    if(items.size()>a&&items.get(a).click()) k = true;
    return k;
  };

  public void click(int i, Object a, String b) {
    Button k = items.get(i);
    //k.click(a, b);
    if(k.click()){
      if (link==null)k.toggle(a, b);
    else if (link.toggle==1)k.toggle(a, b);
    }

  };
  
  public void click(int i, PApplet a, String b) {
    Button k = items.get(i);
    k.click(a, b);
    k.toggle=0;
    if(!mousePressed)k.mdown=false;
  };

  public boolean pos(int i){
    return items.get(i).pos(mousePos);

  };

  // boolean click(int a, Object b, String c){
  //   boolean k = false;
  //   if(click(a)) k = true;

  //   Field field = null;
    
  //   try{
  //        field = b.getClass().getField(c); 
        
  //        if((click(a))){
  //          field.set(c, true); 
  //        }else {
  //          field.set(c, false);
  //        }
  //   }catch (NullPointerException e) {
  //   }catch (NoSuchFieldException e) {
  //   }catch (IllegalAccessException e) {
  //   }
    
  //   return k;
  // };

  public void click() {
    if (parent==null) {
      if (pos() && mousePressed) {
        toggle++;
      }
      if (toggle==2) {
        toggle = 0;
      }
    } else if (parent.toggle==1) {
      if (pos() && mousePressed) {
        toggle++;
      }
      if (toggle==2) {
        toggle = 0;
      }
    }
  };

  public void click(boolean m){
    
    if(pos()&&mousePressed&&!m2down){
      toggle ++;
      m2down = true;
    }
    
    if(toggle>1)toggle=0;
    if(!mousePressed)m2down = false;
  };
  
  // void selfClick(int i) {
  //   Button k = items.get(i);
    
  //   return k.click(mouse);
    
  // };

  public boolean selfClick(int i) {
    Button k = items.get(i);
    
    return k.click(mouse);
    
  };

  public void selfClick(int i, Object o, String b) {
    //Button k = items.get(i);
    //if (link==null)k.selfClick(o, b);
    //else if (link.toggle==1)k.toggle(o, b);
    
  };
  
  public void toggle(int i, String b) {
    Button k = items.get(i);
    //k.toggle(o, b);
    ;
  };

  public void toggle(int i, PApplet o, String b) {
    Button k = items.get(i);
    if (link==null)k.toggle(o, b);
    else if (link.toggle==1)k.toggle(o, b);
    ;
  };
  
  public void toggle(int i, Object o, String b) {
    Button k = items.get(i);
    if(show){
    if (link==null)k.toggle(o, b);
    else if (link.toggle==1)k.toggle(o, b);
    }
    //k.toggle(o, b);
    ;
  };

  public void toggle_(int i, Object o, String b) {
    Button k = items.get(i);
    if(show){
    if (link==null&&mousePressed&&!mdown)k.toggle(o, b);
    else if (link!=null&&link.toggle==1&&mousePressed&&!mdown)k.toggle(o, b);
    }
    //k.toggle(o, b);
    ;
  };
  
  
  public void toggle2(int i, Object o, String b) {
    Button k = items.get(i);
    if (link==null)k.toggle2(o, b);
    else if (link.toggle==1)k.toggle2(o, b);
    ;
  };

  public void toggle(Menu m, int i, Object o, String b) {
    Button k = items.get(i);
    //if(parent!=null&&parent.toggle==1)
    if (m.toggle==1)k.toggle(o, b);
  };
  
  

  public void self_toggle(int i) {
    Button k = items.get(i);
    if (k.parent.toggle==1)k.self_toggle();
  };

  public void sptoggle(int n, Object a, String b, String [] c) {

    Button k = items.get(n);

    k.sptoggle(a, b, c);

  };

  public void sptoggle(int n, Object a, String b, String [] c,Menu m) {

    Button k = items.get(n);

    k.sptoggle(a, b, c);
  };

  public void sptoggle( Object a, String [] c) {


    for(int i=0;i<c.length;i++){
      shapes.sptoggle(i,a,c[i],c);
      if(mousePressed)
      if(!items.get(i).pos()){
        items.get(i).toggle=0;
      }
      println("item toggle = ",items.get(i).toggle);
    }
  };

  public void sptoggle2( Object a, String [] c,Menu m) {


    for(int i=0;i<c.length;i++){
      shapes.sptoggle(i,a,c[i],c,m);
    }
  };

  public void slide(float start, float end) {
    sliders.get(0).set(start, end);
  }

  public void set(int a, int b) {
    items.get(a).toggle=b;
  };

  public void set_parent(Button b) {

    parent = b;

    //for(int i=0;i<m.items.size();i++){
    //  Button k = m.items.get(i);

    //}
  };

  public void set_link(int i) {
    Menu m = items.get(i).submenu;

    m.link = this;
  }

  public String[] getItems(){
    String[] s = new String[items.size()];
    for(int i=0;i<items.size();i++){
      s[i] = items.get(i).label;
    }
    return s;
  };
};


/*

 Charles Fried - 2017
 ANN Tutorial 
 Part #2
 
 NETWORK
 
 This class is for the neural network, which is hard coded with three layers: input, hidden and output
 
 */
int SOBEL = 0, MAX_POOLING = 1, AVE_POOLING = 2, MIN_POOLING = 3, CANNY, PREWITT = 4, GAUSSIAN_BLUR = 5;
class Network {

  int totalTrain, totalTest, totalRight, testCard, trainCard, matchingCC,maxPm;
  float sucess = 0,x,y,w = width,h = height;

  String type = "mnist";
  PImage tempImage;
  String link1 = "emnist-"+type+"-train-images-idx3-ubyte";
  String link2 = "emnist-"+type+"-test-images-idx3-ubyte";
  String link3 = "emnist-"+type+"-train-labels-idx1-ubyte";
  String link4 = "emnist-"+type+"-test-labels-idx1-ubyte";

  int [][]SobelV = {{1, 0, 1}, 
                    {1, 0, 1}, 
                    {1, 0, 1}};

  int [][]SobelH = {{1, 1, 1}, 
                    {0, 0, 0}, 
                    {1, 1, 1}};

  int [][]Sobel00 = {{0, 1, 0}, 
                     {1, 0, 1}, 
                     {0, 1, 0}};

  int [][]Sobel01 = {{1, 0, 1}, 
                     {0, 1, 0}, 
                     {1, 0, 1}};
                     
  int [][]maxPooling = {{1, 1}, 
                        {1, 1}};
                        
  int [][]gaussian = {{1, 0, 1}, 
                      {0, 1, 0}, 
                      {1, 0, 1}};

  ArrayList<int [][]>convolutions = new ArrayList<int [][]>();
  ArrayList<int [][]>countedConvolutions = new ArrayList<int [][]>();

  byte []trainingData, testingData, testingLabels, trainingLabels;

  Neuron [] input_layer, hidden_layer, output_layer, previous_layer, PVinputLayer, PVhiddenLayer, PVoutputLayer;
  ArrayList<Neuron []> hiddenLayers;
  int bestIndex = 0, N, N1, inputs_, hidden_, outputs_, stacks_ = 1;
  boolean deep, convolutionCC,convolutionWritten;
  fileOutput output,convolutionOutput;
  String loc = "nn\\positions.txt";
  String loc1 = "nn\\convolutions.txt";

  Button trainB, testB,reset, test, loadFile, saveFile, openFile,saveConvolutions,loadConvolutions,
          loadTrainingData,loadTestingData,loadTrainingLabels,loadTestingLabels;

  String menuLabels [] = {"Load File","Save to File","Open Folder","Save Convolutions","Open Convolutions","Load Training Data","Load Testing Data", "Load Training Labels","Load Testing Labels"};
  String drawMenuLabels [] = {"Reset","Test"};
  Menu menu,drawMenu;
  Input input;
  fileInput convolutionInput;
  Data data;

  Card [] testingSet, trainingSet;
  Card tempCard;

  Network() {
    init2();
  };

  Network(String location) {
    loc = location;

    init();
  };

  Network(int inputs, int hidden, int outputs) {

    init();
    inputs_ = inputs;
    hidden_ = hidden;
    outputs_ = outputs;

    input_layer = new Neuron [inputs*inputs];
    hidden_layer = new Neuron [hidden*hidden];
    output_layer = new Neuron [outputs];
    String text = inputs + "," + hidden + "," + outputs;

    for (int i = 0; i < input_layer.length; i++) {
      input_layer[i] = new Neuron();
    }

    for (int j = 0; j < hidden_layer.length; j++) {
      hidden_layer[j] = new Neuron(input_layer);
      for (int i = 0; i < hidden_layer[j].inputs.length; i++) {
        //output.write(hidden_layer[j].inputs[i] + " " + hidden_layer[j].weights[i] + " " + hidden_layer[j].biases[i]);
      }
    }

    for (int k = 0; k < output_layer.length; k++) {
      output_layer[k] = new Neuron(hidden_layer);
    }


    N = inputs;
    N1 = hidden;
  };


  Network(int inputs, int hidden, int outputs, String s) {
    loc = s;
    output = new fileOutput(loc);
    init();

    inputs_ = inputs;
    hidden_ = hidden;
    outputs_ = outputs;

    input_layer = new Neuron [inputs*inputs];
    hidden_layer = new Neuron [hidden*hidden];
    output_layer = new Neuron [outputs];

    for (int i = 0; i < input_layer.length; i++) {
      input_layer[i] = new Neuron();
    }

    for (int j = 0; j < hidden_layer.length; j++) {
      hidden_layer[j] = new Neuron(input_layer);
    }

    for (int k = 0; k < output_layer.length; k++) {
      output_layer[k] = new Neuron(hidden_layer);
    }

    N = inputs;
    N1 = hidden;
  };

  Network(int inputs, int hidden, int outputs, int n) {

    inputs_ = inputs;
    hidden_ = hidden;
    outputs_ = outputs;
    stacks_ = n;

    init();
    println(loc);

    input_layer  = new Neuron [inputs*inputs];
    hiddenLayers = new ArrayList<Neuron []>();
    hidden_layer = new Neuron [hidden*hidden];
    output_layer = new Neuron [outputs];

    for (int i = 0; i < input_layer.length; i++) {
      input_layer[i] = new Neuron();
    }

    previous_layer = input_layer;

    for (int i=0; i<n; i++) {

      hidden_layer = new Neuron [hidden*hidden];
      for (int j = 0; j < hidden_layer.length; j++) {
        hidden_layer[j] = new Neuron(previous_layer);
      }
      previous_layer = hidden_layer;
      hiddenLayers.add(hidden_layer);
    }

    for (int k = 0; k < output_layer.length; k++) {
      output_layer[k] = new Neuron(hiddenLayers.get(hiddenLayers.size()-1));
    }

    N = inputs;
    N1 = hidden;
  };

  Network(int inputs, int hidden, int outputs, int n,String loc) {

    this.loc = loc;
    output = new fileOutput(loc,true);

    inputs_ = inputs;
    hidden_ = hidden;
    outputs_ = outputs;
    stacks_ = n;

    init();

    input_layer  = new Neuron [inputs*inputs];
    hiddenLayers = new ArrayList<Neuron []>();
    hidden_layer = new Neuron [hidden*hidden];
    output_layer = new Neuron [outputs];

    for (int i = 0; i < input_layer.length; i++) {
      input_layer[i] = new Neuron();
    }

    previous_layer = input_layer;

    for (int i=0; i<n; i++) {

      hidden_layer = new Neuron [hidden*hidden];
      for (int j = 0; j < hidden_layer.length; j++) {
        hidden_layer[j] = new Neuron(previous_layer);
      }
      previous_layer = hidden_layer;
      hiddenLayers.add(hidden_layer);
    }

    for (int k = 0; k < output_layer.length; k++) {
      output_layer[k] = new Neuron(hiddenLayers.get(hiddenLayers.size()-1));
    }

    N = inputs;
    N1 = hidden;
  };

  Network(int inputs, int hidden, int outputs, int n, int [] operations) {


    int [] temp = new int [1+(hidden-2)*(hidden-2)];
    for (int i=0; i<operations.length; i++) {
      int k = operations[i];

      switch(k) {
        //temp = new int[(hidden-2)*(hidden-2)];
      }
    }

    inputs_ = inputs;
    hidden_ = hidden;
    outputs_ = outputs;
    stacks_ = n;

    init();
    int inputNodes = 0;
    input_layer  = new Neuron [inputNodes];
    hiddenLayers = new ArrayList<Neuron []>();
    hidden_layer = new Neuron [hidden*hidden];
    output_layer = new Neuron [outputs];

    for (int i = 0; i < input_layer.length; i++) {
      input_layer[i] = new Neuron();
      //input_layer[i].outputs = new float[inputNodes];
    }

    previous_layer = input_layer;

    for (int i=0; i<n; i++) {

      hidden_layer = new Neuron [hidden*hidden];
      for (int j = 0; j < hidden_layer.length; j++) {
        hidden_layer[j] = new Neuron(previous_layer);
      }
      previous_layer = hidden_layer;
      hiddenLayers.add(hidden_layer);
    }

    for (int k = 0; k < output_layer.length; k++) {
      output_layer[k] = new Neuron(hiddenLayers.get(hiddenLayers.size()-1));
    }

    N = inputs;
    N1 = hidden;
  };

  public void init() {
    menu = new Menu(width - 150,160,70,menuLabels);
    drawMenu = new Menu(width - 200,250,drawMenuLabels);

    output = new fileOutput(loc);
    convolutionOutput = new fileOutput(loc1,false);
    convolutionInput = new fileInput();
    data = new Data();

    trainingData = loadBytes(link1);
    testingData = loadBytes(link2);
    trainingLabels = loadBytes(link3);
    testingLabels = loadBytes(link4);

    data.loadTrainingData(trainingData, 60000, 28);
    trainingSet = new Card[60000];
    testingSet = new Card[10000];

    for (int i=0; i<data.trainingData.length; i++) {
      Card c = new Card(data.inputs.get(i), i, 0);
      trainingSet[i] = c;
    }

    data.loadTestingData(trainingData, 10000, 28);
    for (int i=0; i<data.testingData.length; i++) {
      Card c = new Card(data.inputs.get(i), i, 1);
      testingSet[i] = c;
    }
    
    data.loadTrainingLabels(trainingLabels);

    for (int i=0; i<trainingSet.length; i++) {
      Card c = trainingSet[i];

      for (int j = 0; j < 10; j++) {  // We then set the correct index in output[] to +1 if it corresponds to the ouput and -1 if not
        if (data.trainingLabels[i] == j)c.outputs[j] = 1.0f;
        else c.outputs[j] = -1.0f;
      }
    }

    data.loadTestingLabels(testingLabels);

    for (int i=0; i<testingSet.length; i++) {
      Card c = testingSet[i];
      c.output = data.trainingLabels[i];
      for (int j = 0; j < 10; j++) {  // We then set the correct index in output[] to +1 if it corresponds to the ouput and -1 if not
        if (data.trainingLabels[i] == j)c.outputs[j] = 1.0f;
        else c.outputs[j] = -1.0f;
      }
    }
    float xx = width - 150;
    float yy = 160;
    float spacing = 20;
    
    input = new Input(xx - 120, 200);
    reset = new Button(xx, yy, 40, 20, "Reset");
    test = new Button(xx, yy + spacing, 40, 20, "Test");
    // loadFile = new Button(xx, yy + spacing * 2, 60, 20, "Load File");
    // saveFile = new Button(xx, yy + spacing * 3, 60, 20, "Save to File");
    // openFile = new Button(xx, yy + spacing * 4, 90, 20, "Open File");
    // saveConvolutions = new Button(xx, yy + spacing * 4, 60, 20, "Save Convolutions");
    // loadConvolutions = new Button(xx, yy + spacing * 5, 90, 20, "Open Convolutions");
    // loadTrainingData = new Button(xx, yy + spacing * 6, 60, 20, "Load Training Data");
    // loadTestingData = new Button(xx, yy + spacing * 7, 60, 20, "Load Testing Data");
    // loadTrainingLabels = new Button(xx, yy + spacing * 8, 60, 20, "Load Training Labels");
    // loadTestingLabels = new Button(xx, yy + spacing * 9, 60, 20, "Load Testing Labels");
    // stroke(0);
    //loadData();
    trainB = new Button(width*0.06f, height*0.9f,50,20, "Train");
    testB = new Button(width*0.11f, height*0.9f,50,20, "Test");

    convolutions.add(SobelV);
    convolutions.add(SobelH);
    convolutions.add(Sobel00);
    convolutions.add(Sobel01);
    //permute();
    maxPm = 512;
  };
  
  public void init2() {
    output = new fileOutput(loc);
    convolutionOutput = new fileOutput(loc1,false);
    convolutionInput = new fileInput();

    data = new Data();
    
    float xx = width - 150;
    float yy = 160;
    float spacing = 20;
    
    input = new Input(xx - 120, 200);
    reset = new Button(xx, yy, 40, 20, "Reset");
    test = new Button(xx, yy + spacing, 40, 20, "Test");
    // loadFile = new Button(xx, yy + spacing * 2, 60, 20, "Load File");
    // saveFile = new Button(xx, yy + spacing * 3, 60, 20, "Save to File");
    // openFile = new Button(xx, yy + spacing * 4, 90, 20, "Open File");
    // saveConvolutions = new Button(xx, yy + spacing * 4, 60, 20, "Save Convolutions");
    // loadConvolutions = new Button(xx, yy + spacing * 5, 90, 20, "Open Convolutions");
    // loadTrainingData = new Button(xx, yy + spacing * 6, 60, 20, "Load Training Data");
    // loadTestingData = new Button(xx, yy + spacing * 7, 60, 20, "Load Testing Data");
    // loadTrainingLabels = new Button(xx, yy + spacing * 8, 60, 20, "Load Training Labels");
    // loadTestingLabels = new Button(xx, yy + spacing * 9, 60, 20, "Load Testing Labels");
    // stroke(0);
    // //loadData();
    trainB = new Button(width*0.06f, height*0.9f,40,20, "Train");
    testB = new Button(width*0.11f, height*0.9f,40,20, "Test");

    convolutions.add(SobelV);
    convolutions.add(SobelH);
    convolutions.add(Sobel00);
    convolutions.add(Sobel01);
    //permute();
    maxPm = 512;
  };

  public Card loadImage(PImage image) {

    tempCard = new Card();

    for (int i = 0; i < 784; i++) {
      if (red(image.pixels[i])<50)tempCard.inputs[i] = -10;
      if (red(image.pixels[i])>50)tempCard.inputs[i] = map(red(image.pixels[i])+20, 0, 255, -1, 1); 
      else tempCard.inputs[i] = -1;
      map(red(image.pixels[i]), 0, 255, -1, 1);
    }
    return tempCard;
  };

  public PImage loadImage(PImage image, boolean bool) {

    tempImage = createImage(inputs_, inputs_, RGB);

    for (int i = 0; i < inputs_*inputs_; i++) {
      tempImage.pixels[i] = image.pixels[i];
    }
    return tempImage;
  };


  public void load() {
  };

  public void load(String s) {
  };

  public void save() {
    println("Saving File..."+ loc);
    output.open();
    String text = "";
    if (stacks_ == 0)text = inputs_ + "," + hidden_ + "," + outputs_ + ",";
    else text = inputs_ + "," + hidden_ + "," + outputs_ + "," + stacks_;
    output.write(text);

    for (int i = 0; i < input_layer.length; i++) {
      if (input_layer[i].weights!=null)
        for (int j = 0; j < input_layer[i].weights.length; j++) {
          output.write(input_layer[i].inputs[j].output + " " + input_layer[i].weights[j] + " " + input_layer[i].biases[j]);
        } else 
      for (int j = 0; j < inputs_* inputs_; j++) {
        output.write(0 + " " + 0 + " " + 0);
      }
    }

    output.write("");

    for (int i=0; i<stacks_; i++) {

      for (int j = 0; j < hidden_layer.length; j++) {
        for (int k = 0; k < hidden_layer[j].inputs.length; k++) {
          output.write(hidden_layer[j].inputs[k].output + "," + hidden_layer[j].weights[k] + "," + hidden_layer[j].biases[k]);
        }
      }
    }

    output.write("");

    for (int k = 0; k < output_layer.length; k++) {
      for (int j = 0; j < output_layer[k].inputs.length; j++) {
        output.write(output_layer[k].inputs[j].output + "," + output_layer[k].weights[j] + "," + output_layer[k].biases[j]);
      }
    }
    output.close();
  };
  
  public void saveConvolutions(){
    println("Saving File...");
    convolutionOutput.open();
    for(int i=0;i<convolutions.size();i++){
      for(int j=0;j<convolutions.get(i).length;j++){
        
        convolutionOutput.write(str(convolutions.get(i)[j]));
        //convolutionOutput.write("hello");
    }
    convolutionOutput.write("");
    }
    convolutionOutput.close();
    println("Saved!");
  };

  public void listen() {
    if (menu.items.get(0).pos())BMS.File.listen();
    if (BMS.File.value!=null) {
      loc = BMS.File.value;
      println("User " + BMS.File.value);
      BMS.File.value = null;
      loadFile(BMS.File.value);
    }
    
    if (menu.items.get(4).pos())convolutionInput.listen();
    if (convolutionInput.value!=null) {
      loc1 = convolutionInput.value;
      println("User " + convolutionInput.value);
      convolutionInput.value = null;
      //loadConvolutions(file.value);
    }
    //if(file.listen()!=null)
    //println(file.listen());
  };

  public void loadFile(String s) {
  };

  public void respond(Card card) {

    if (!deep) {
      for (int i = 0; i < input_layer.length; i++) {
        input_layer[i].output = card.inputs[i];
      }
      // now feed forward through the hidden layer
      for (int j = 0; j < hidden_layer.length; j++) {
        hidden_layer[j].respond();
      }
      for (int k = 0; k < output_layer.length; k++) {
        output_layer[k].respond();
      }
    }
  };

  public void respond(PImage card) {

    card.loadPixels();

    for (int i = 0; i < input_layer.length; i++) {
      input_layer[i].output = card.pixels[i];
    }
    // now feed forward through the hidden layer
    for (int j = 0; j < hidden_layer.length; j++) {
      hidden_layer[j].respond();
    }
    for (int k = 0; k < output_layer.length; k++) {
      output_layer[k].respond();
    }
  };

  public void respondDeep(Card card) {

    for (int i = 0; i < input_layer.length; i++) {
      input_layer[i].output = card.inputs[i];
    }
    // now feed forward through the hidden layer
    for (int i = 0; i<hiddenLayers.size(); i++) {
      for (int j = 0; j < hiddenLayers.get(i).length; j++) {
        if (i<hiddenLayers.size()-1)hiddenLayers.get(i)[j].respondDeep();
        else hiddenLayers.get(i)[j].respond();
      }
    }

    for (int i = 0; i < output_layer.length; i++) {
      output_layer[i].respond();
    }
  };

  public void respondDeep(PImage card) {
    card.loadPixels();
    for (int i = 0; i < input_layer.length; i++) {
      input_layer[i].output = card.pixels[i];
    }
    // now feed forward through the hidden layers
    for (int i = 0; i<hiddenLayers.size(); i++) {
      for (int j = 0; j < hiddenLayers.get(i).length; j++) {
        if (i<hiddenLayers.size()-1)hiddenLayers.get(i)[j].respondDeep();
        else hiddenLayers.get(i)[j].respond();
      }
    }

    for (int i = 0; i < output_layer.length; i++) {
      output_layer[i].respond();
    }
  };

  public void displayOutput() {

    // Draw the output layer
    float [] resp = new float [output_layer.length];
    float respTotal = 0.0f;

    for (int k = 0; k < output_layer.length; k++) {
      resp[k] = output_layer[k].output;
      respTotal += resp[k]+1;
    }

    fill(0);

    for (int k = 0; k < output_layer.length; k++) {
      //text(k%10, 100, 10);
      text(k + "   " +nfc(((output_layer[k].output+1)/respTotal)*100, 2) + "%", 115, 10+10*k);
      strokeWeight(1);
    }
    float best = -1.0f;
    for (int i =0; i < resp.length; i++) {
      if (resp[i]>best) {
        best = resp[i];
        bestIndex = i;
      }
    }
  };

  public void getBest() {

    float [] resp = new float [output_layer.length];

    float respTotal = 0.0f;
    float best = -1.0f;

    for (int k = 0; k < output_layer.length; k++) {
      resp[k] = output_layer[k].output;

      respTotal += resp[k]+1;
      if (resp[k]>best) {
        best = resp[k];
        bestIndex = k;
      }
    }
  };

  public void displayGuess() {
    fill(9);
    textSize(30);
    text(bestIndex, 10, 40);
    textSize(12);
  };


  public void train(float [] outputs) {
    // adjust the output layer
    float best = -1.0f;
    for (int k = 0; k < output_layer.length; k++) {
      output_layer[k].setError(outputs[k]);
      output_layer[k].train();
      if (output_layer[k].output > best) bestIndex = k;
    }

    // propagate back to the hidden layer
    for (int j = 0; j < hidden_layer.length; j++) {
      hidden_layer[j].train();
    }

    // The input layer doesn't learn: it is the input and only that
  };

  public void trainDeep(float [] outputs) {
    // adjust the output layer
    float best = -1.0f;
    for (int k = 0; k < output_layer.length; k++) {
      output_layer[k].setError(outputs[k]);
      output_layer[k].train();
      if (output_layer[k].output > best) bestIndex = k;
    }

    // propagate back to the hidden layer


    for (int i=hiddenLayers.size()-1; i>-1; i--) {
      for (int j = 0; j < hiddenLayers.get(i).length; j++) {
        hiddenLayers.get(i)[j].train();
      }
    }

    // The input layer doesn't learn: it is the input and only that
  };

  public void convolve() {
  }

  public void permute() {
    int [][]permutation = new int[3][3];
    if (!convolutionCC) {
      for (int i=0; i<3; i++) {
        for (int j=0; j<3; j++) {
          int p = i + j * 3;

          permutation[i][j] = floor(random(0, 2));
        }
      }

      if (!convolutions.contains(permutation)) convolutions.add(permutation);
        
       if (!countedConvolutions.contains(permutation)){
        countedConvolutions.add(permutation);
        matchingCC ++;
      }

      if (matchingCC >= maxPm)convolutionCC = true;
    }
    
    if(convolutionCC&&convolutionWritten){};
  };

  public void displayCard(Card card, int x, int y) {
      int size = 28;
      int res = 7;
    for(int i=0;i<size;i++){
      for(int j=0;j<size;j++){
        int p = j+i*size;
        noStroke();
        //stroke(0);
        fill(128 * (1 - card.inputs[p]));
        rect(x+j*(res+2),y+i*(res+2),res,res);
    }}

    //if (card.type == 0) {
    //  data.trainingData[card.id].resize(150, 0);
    //  image(data.trainingData[card.id], x, y);
    //} else {
    //  data.testingData[card.id].resize(150, 0);
    //  image(data.testingData[card.id], x, y);
    //}
  };

  public void displayCard(PImage a, int x, int y) {

    a.resize(150, 0);
    image(a, x, y);
  };

  public void run(int n) {
    trainDisplay();
    testDisplay();
    if (menu.click(1))save();
    //if (menu.click(2))exit();
    listen();

    if (trainB.toggle_) {
      for (int i = 0; i < n; i++) {
        trainCard = (int) floor(random(0, trainingSet.length));
        //println(trainCard);
        respondDeep(trainingSet[trainCard]);
        trainDeep(trainingSet[trainCard].outputs);
        totalTrain++;
      }
    } else if (testB.hold()) {
      testCard = (int) floor(random(0, testingSet.length));
      respondDeep(testingSet[testCard]);

      getBest();
      if (bestIndex == testingSet[testCard].output) totalRight ++;
      totalTest ++;
    }
    displayOutput();

    if (trainingSet[trainCard]!=null)displayCard(trainingSet[trainCard], 210, 0);
    if (testingSet[testCard]!=null)displayCard(testingSet[testCard], 470, 0);

    trainB.draw();
    testB.draw();
    input.draw();
    //saveFile.draw();
    if (test.click()&&input.croppedImage!=null) {
      tempCard = loadImage(input.croppedImage);
      tempImage = loadImage(input.croppedImage, true);
      respondDeep(tempCard);
      getBest();
      totalTest ++;
    }
    if (tempImage!=null)displayCard(tempImage, 730, 0);
    fill(100);
    text("Test card: #" + testCard, width*0.18f, height*0.89f);
    text("Train card: " + trainCard, width*0.18f, height*0.93f);

    text("Total train: " + totalTrain, width*0.32f, height*0.89f);
    text("Total test: " + totalTest, width*0.32f, height*0.93f);

    if (totalTest>0) sucess = PApplet.parseFloat(totalRight)/PApplet.parseFloat(totalTest);
    text("Success rate: " + nfc(sucess, 2), width*0.44f, height*0.89f);
    text("Card label: " + testingSet[testCard].output, width*0.44f, height*0.93f);
    displayGuess();
    reset.draw();
    test.draw();
    // loadFile.draw();
    // saveFile.draw();
    drawMenu.draw();
    // saveConvolutions.draw();
    menu.draw();
    if(menu.click(3))saveConvolutions();
    // loadConvolutions.draw();
    // loadTrainingData.draw();
    // loadTestingData.draw();
    // loadTrainingLabels.draw();
    // loadTestingLabels.draw();
    permute();
    fill(0);
    text(frameRate, 10, 10);
    text(LEARNING_RATE, 10, 50);
    //if (frameCount%10==0&&matchingCC<512)println(countedConvolutions.size() + " " +  matchingCC);
  };

  public void trainDisplay() {
  };

  public void testDisplay() {
  };
};

class pNetwork extends Network {

  ArrayList<Neuron []> hiddenLayers_;
  ArrayList<Neuron []> inputLayers_;
  ArrayList<Neuron []> outputLayers_;

  Neuron [][] hiddenLayers;
  Neuron [][] inputLayers;
  Neuron [][] outputLayers;
};


class Card { // This class contains all the functions to format and save the data
  
  int id,type;
  float [] inputs,outputs;
  int output;
  Card tempCard;

  Card() {
    inputs = new float [784]; // the images are a grid of 14x14 pixels which makes for a total of 196
    outputs = new float[10]; // the number of possible outputs; from 0 to 9
  };
  
  Card(float []inputs_) {
    inputs = inputs_; // the images are a grid of 14x14 pixels which makes for a total of 196
    outputs = new float[10]; // the number of possible outputs; from 0 to 9
  };
  
  Card(float []inputs_, int id,int type) {
    this.id = id;
    this.type = type;
    inputs = inputs_; // the images are a grid of 14x14 pixels which makes for a total of 196
    outputs = new float[10]; // the number of possible outputs; from 0 to 9
  };

  public void imageLoad(byte [] images, int offset) { // Images is an array of 1,960,000 bytes, each one representing a pixel (0-255) of the 10,000 * 14x14 (196) images
                                               // We know one image consists of 196 bytes so the location is: offset*196
    for (int i = 0; i < 784; i++) {
      inputs[i] = PApplet.parseInt(images[i+offset]) / 128.0f - 1; // We then store each pixel in the array inputs[] after converting it from (0 - 255) to (+1 - -1) as they vary on the greyscale 
    }
  };

  public void labelLoad(byte [] labels, int offset) {  // Labels is an array of 10,000 bytes, each representing the answer of each image

    output = PApplet.parseInt(labels[offset]);
    
    for (int i = 0; i < 10; i++) {  // We then set the correct index in output[] to +1 if it corresponds to the ouput and -1 if not
      if (i == output) {
        outputs[i] = 1.0f;
      } else {
        outputs[i] = -1.0f;
      }
    }
  }
  
};
class Plot_2D{
  
  int id,cols,rows,totalWeights = 10,totalBiases = 5;
  public int tCol = 2;
  public float pSize = 10;
  boolean mdown,odown;
  public float x,y,w,h;
  public String label;
  public boolean drag,resize,line,dotted,dashed,mHide,toggle,axis = true,grid = true,showMouse,loadRdata1,loadRdata2,labels = true,
                 showTab,constructData,construct1,construct2,point = true,cross,clear;
  PVector origin,mouse;
  public int col,pCol = 0;
  String [] settingsLabel = {"Psize","No. of Cols"};
  String [] optionsLabel = {"Show Grid","Show Axis","Track Mouse","Labels","Show Tab","Load Random Data","Load Random Data 2","Load From File","Load From Class","Clear","Exit"};
  String [] assignDataLabels = {"Class","Variables"};
  String [] getDataLabels1 = {"Humans","Plants","Shapes"};
  String [] getDataLabels2 = {"Velocity","Accelerration","Shapes","Population","Size","Health","Age","Children","Family","Proximity"};
  String [] palleteLabel = {};
  String [] pSizesLabel;
  String [] palleteBiasLabel;
  String [] palleteWeightsLabel;
  sliderBox palleteBias,palleteWeights,settings,pSizes;
  Menu options,getData1,getData2;
  ArrayList<ArrayList<Variable>> data = new ArrayList<ArrayList<Variable>>();
  tab pallete;
  Dropdown assignData;
  Network neuralNet;
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  
  
  Plot_2D(PVector Origin,float ww, float hh, int Cols, int Rows){
    
    origin = Origin;
    w = ww;
    h = hh;
    cols = Cols;
    rows = Rows;
    
    setupPallete();
  }
  
  Plot_2D(Float xx,float yy,float ww, float hh, int Cols, int Rows){
    
    origin = new PVector((xx+ww)/2,(yy+hh)/2);
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    cols = Cols;
    rows = Rows;
    
    setupPallete();
  }
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void decisionBoundary(){
    
  };
  
  public void setupPallete(){
    palleteWeightsLabel = new String[totalWeights];
    palleteBiasLabel= new String[totalBiases];
    
    for(int i=0;i<totalBiases;i++){
      palleteBiasLabel[i] = "b"+i;;
    }
    for(int i=0;i<totalWeights;i++){
      palleteWeightsLabel[i] = "W"+i;;
    }
    pallete = new tab(main.x,H-90,main.w,70,"Weights");
    pallete.scrollable = true;
    pallete.states.get(0).scrollable = true;
    palleteBias = new sliderBox(30,30,70,5,palleteBiasLabel,pallete);
    palleteWeights = new sliderBox(160,30,90,5,palleteWeightsLabel,pallete);
    palleteBias.parentCanvas = true;
    palleteWeights.parentCanvas = true;
    pallete.add(palleteBias);
    pallete.add(palleteWeights);
    settings = new sliderBox(palleteWeights.x+palleteWeights.w + 120,30,90,5,settingsLabel,pallete);
    settings.parentCanvas = true;
    pallete.add(settings);
    pallete.toggle=true;
    pallete.visible = true;
    pallete.sliderh.visible = false;
    pallete.sliderv.valuex = 0;
    pallete.sliderv.h +=20;
    
    options = new Menu(0,0,70,optionsLabel);

    assignData = new Dropdown(0,0,90,"Select",assignDataLabels,0);
    Dropdown d = new Dropdown(0,0,90,"Select",assignDataLabels,0);

    Button loadClass = options.items.get(8);

    String [] k = {"X","Y","Z"};
    options.items.get(8).submenu = new Menu(loadClass.x+loadClass.w,loadClass.y,k);
    //options.items.get(8).submenu.w = 90;
    options.set_link(8);

    loadClass = options.items.get(8).submenu.items.get(0);
    loadClass.dMenu = assignData;

    loadClass = options.items.get(8).submenu.items.get(1);
    loadClass.dMenu = d;

    // String [] k1 = ;
    // loadClass.submenu = new Menu(loadClass.x+loadClass.w,loadClass.y,90,k1,0);
    // options.items.get(8).submenu.set_link(0);

    // loadClass = options.items.get(8).submenu.items.get(1);
    // String [] k2 = {"Velocity","Accelerration","Shapes","Population","Size","Health","Age","Children","Family","Proximity"};
    // loadClass.submenu = new Menu(loadClass.x+loadClass.w,loadClass.y,k2);
    // options.items.get(8).submenu.set_link(1);
    options.show = false;
    options.items.get(0).toggle = 1;
    options.items.get(1).toggle = 1;
    options.items.get(3).toggle = 1;
    BMS.menus.add(options);
    pSizes = new sliderBox(settings.x+settings.w+90,10,90,5,pallete);
    //pSizes.menu.spacing = 5;
    pallete.add(pSizes);
    getData1 = new Menu(0,0,70,getDataLabels1);
    getData2 = new Menu(0,0,70,getDataLabels2);
  };
  
  public void loadRandomData(){
    
    if(construct1){
    ArrayList<Variable> variables = new ArrayList<Variable>();
    int c = color(random(0,255),random(0,255),random(0,255));
    
    for(int i=0;i<200;i++){
        
        PVector p = new PVector(x+w/2+random(-w/2,w/2),y+h/2+random(-h/2,h/2));
        Variable v = new Variable(p,i,c);
        
        variables.add(v);
    }
    
    if(!data.contains(variables))data.add(variables);
    
    loadRdata1 = false;
    options.items.get(5).toggle = 0;
    construct1 = false;
    
    }
    if(pSizes.menu.sliders.size()<data.size())pSizes.add
    (new Slider(pSizes.x,pSizes.y-15+(data.size()*(10+pSizes.vspacing)),pSizes.w,10,str(pSizes.menu.sliders.size())));
  };
  
  public void loadRandomData(int k){
    
    if(construct2){
      
    for(int j=0;j<k;j++){
      
      ArrayList<Variable> variables = new ArrayList<Variable>();
      int c = color(random(0,255),random(0,255),random(0,255));
      
      for(int i=0;i<200;i++){
        
        PVector p = new PVector(x+w/2+random(-w/2,w/2),y+h/2+random(-h/2,h/2));
        
        Variable v = new Variable(p,i,c);
        variables.add(v);
      }
      if(!data.contains(variables))data.add(variables);
    }
      loadRdata2 = false;
      options.items.get(6).toggle = 0;
      construct2 = false;
      
    }
    if(pSizes.menu.sliders.size()<data.size()){
      for(int i=0;i<tCol;i++){
        
        float ypos = pSizes.y - 15 + pSizes.menu.sliders.size()* (10 + pSizes.vspacing) + (10 + pSizes.vspacing);
        
        Slider a =  new Slider(pSizes.x ,ypos,pSizes.w,10,str(pSizes.menu.sliders.size()));
        
        a.bar = true;
        a.classic = true;
        a.parent = pSizes.menu;
        a.valuex = pSizes.w/2;
        pSizes.add(a);
      }}
  };
  
  public void logic(){
    if(loadRdata1&&!mousePressed)construct1 = true;
    if(loadRdata2&&!mousePressed)construct2 = true;
    
  };
  
  public PVector sigmoid(PVector a){
    return new PVector(1/exp(a.x),1/exp(a.y));
  };
  
  public void draw(){
    displayTab();
    if(toggle){
      
      stroke(col);
      drawGrid();
      displayPointer();
      displayAxis();
      displayLabels();
      
      sliderControl();
      if(loadRdata1)println("lrd");
      logic();
      loadRandomData();
      loadRandomData(tCol);
      if(!clear)displayData();
      else {
        data = new ArrayList<ArrayList<Variable>>();
        clear = false;
        options.items.get(9).toggle = 0;
        pSizes.menu.sliders = new ArrayList<Slider>();
      }
      drawMenu();
      
    }
  };
  
  public void draw(PGraphics canvas){
    displayTab(canvas);
    if(toggle){
      stroke(col);
      //displayPointer();
      drawGrid(canvas);
      displayPointer(canvas);
      displayAxis(canvas);
      displayLabels(canvas);
      
      displayData(canvas);
      logic();
      loadRandomData();
      loadRandomData(2);
      //sliderControl();
      
    }
  };
  
  public void displayTab(){
    pallete.toggle = true;
    pallete.draggable = true;
    if(showTab){
      pallete.displayTab();
    }
    
  };
  
  public void displayTab(PGraphics canvas){
    pallete.toggle = true;
    if(showTab)pallete.displayTabs(canvas);
  };
  
  public void drawMenu(){
    //if(mousePressed&&options.show&&!mdown&&!options.menu)options.show = false;
    if(options.show&&!mdown&&!options.pos()&&mousePressed&&options.index==-1)options.show = false;
    if(mousePressed&&mouseButton == RIGHT&&!mdown){
      options.x = mouseX;
      options.y = mouseY;
      mdown = true;
      options.show=true;
    }
    
    Dropdown d = options.items.get(8).submenu.items.get(0).dMenu;
    Dropdown d1 = options.items.get(8).submenu.items.get(1).dMenu;

    int k = -1;

    if(options.show){
      if(d.index==0){
        d.subMenu = getData1;
        d1.index = 1;
        d1.subMenu = getData2;
        k = 0;
      }
      if(d.index==1){
        d.subMenu = getData2;
        d1.index = 0;
        d1.subMenu = getData1;
        k = 1;
      }

      if(d.subMenu!=null)
      for(int i=0;i<d.subMenu.items.size();i++){

        Button b = d.subMenu.items.get(i);

        if(b.pos()&&mousePressed&&!mdown){
          b.self_toggle();
          mdown = true;
        }
        if(!b.pos()&&mousePressed)b.toggle=0;
      }
      if(d1.subMenu!=null&&mousePressed&&!mdown)
      for(int i=0;i<d1.subMenu.items.size();i++){

        Button b = d1.subMenu.items.get(i);

        if(b.pos()&&mousePressed&&!mdown){
          b.self_toggle();
          mdown = true;
        }
        if(!b.pos()&&mousePressed)b.toggle=0;
      }

      if(k==0){
        if(d.subMenu.items.get(0).toggle==1){}
        if(d.subMenu.items.get(1).toggle==1){}
        if(d.subMenu.items.get(2).toggle==1){}

        if(d1.subMenu.items.get(0).toggle==1){}
        if(d1.subMenu.items.get(1).toggle==1){}
        if(d1.subMenu.items.get(2).toggle==1){}
        if(d1.subMenu.items.get(3).toggle==1){}
        if(d1.subMenu.items.get(4).toggle==1){}
        if(d1.subMenu.items.get(5).toggle==1){}
      }

      if(k==1){
        if(d.subMenu.items.get(0).toggle==1){}
        if(d.subMenu.items.get(1).toggle==1){}
        if(d.subMenu.items.get(2).toggle==1){}
        if(d.subMenu.items.get(3).toggle==1){}
        if(d.subMenu.items.get(4).toggle==1){}
        if(d.subMenu.items.get(5).toggle==1){}

        if(d1.subMenu.items.get(0).toggle==1){}
        if(d1.subMenu.items.get(1).toggle==1){}
        if(d1.subMenu.items.get(2).toggle==1){}
      }
    }
    if(!mousePressed)mdown = false;
    // if(odown)text("odown",100,120);
    // if(mdown)text("mdown",100,130);
  };
  
  public void displayData(){
    for(int i=0;i<data.size();i++){
      
      ArrayList<Variable> v = data.get(i);
      
       for(int j=0;j<v.size();j++){ 
         Variable v1 = v.get(j);
         
         fill(v1.col);
         noStroke();
         int k = PApplet.parseInt(pSizes.menu.sliders.get(i).value);
         if(point)ellipse(v1.pos.x,v1.pos.y,pSize+k,pSize+k);
         else if(cross){}
    }}
  };
  
  public void displayData(PGraphics canvas){
    for(int i=0;i<data.size();i++){
      
      ArrayList<Variable> v = data.get(i);
      
       for(int j=0;j<v.size();j++){ 
         Variable v1 = v.get(j);
         
         canvas.fill(pCol);
         if(point)canvas.ellipse(v1.pos.x,v1.pos.y,pSize,pSize);
         else if(cross){}
    }}
  };
  
  public void drawGrid(){
    if(grid){
      fill(0);
      strokeWeight(0.5f);
    for(int i=0;i<rows;i++){
      float x1 = x + w/rows * i;
      
      line(x1,y,x1,y+h);
    }
    for(int i=0;i<cols;i++){
      float y1 = y + h/cols * i;
      
      line(x,y1,x+w,y1);
    }}
  };
  
  public void drawGrid(PGraphics canvas){
    canvas.fill(0);
    for(int i=0;i<rows;i++){
      float x1 = (origin.x - w/2) + w/rows * i + w/rows/2;
      
      canvas.line(x1,y,x1,y+h);
    }
    
    for(int i=0;i<cols;i++){
      float y1 = (origin.y - h/2 )+ h/cols * i + h/cols/2;
      
      canvas.line(x,y1,x+w,y1);
    }
  };
  
  public void sliderControl(){
    
  pallete.sliderv.set(0,pallete.sliderBoxes.get(1).menu.sliders.size());
      
      if(pallete.sliderv.mdown&&mouseY>pallete.y){
        
      for(int i=0;i<pallete.sliderBoxes.size();i++){
        
          Menu m = pallete.sliderBoxes.get(i).menu;
          
          if(pallete.sliderv.valuex>0)m.y = m.by - pallete.sliderv.valuex;
        
        for(int j=0;j<m.sliders.size();j++){
            
            Slider s1 = m.sliders.get(j);
            
            s1.y = m.y + (s1.h+m.spacing) * j;
            
        }}}
    
      sliderBox s = pSizes;
      
      for(int i=0;i<s.menu.sliders.size();i++)s.setint(i,2,20);
      
        settings.setint(0,2,10,this,"pSize");
        settings.setint(1,2,10,this,"tCol");
};

public void displayPointer(){
  if(showMouse){
      float x1=0,y1=0,xa=0,ya=0;
      if(col==0)stroke(0);
      else if(x1-xa==0||y1-ya==0)col = color(255,255,0);
      else col = color(0,255,0);
  if(mousePressed){
        fill(255);
        ellipse(mouseX,mouseY,2,2);
        fill(0);
        
         x1 = map(mouseX,x+23,w+23,floor(-rows/2),floor(rows/2));
         xa = floor(x1);
         y1 = map(mouseY,y+20,h+20,floor((-rows)/4),floor((rows)/4));
         ya = floor(y1);
        if(abs(x1-xa)<0.1f)x1=xa;
        if(abs(y1-ya)<0.1f)y1=ya;
        text( x1 + ", " + y1 ,mouseX,mouseY); 
        
      }}
};

public void displayPointer(PGraphics canvas){
  
  if(showMouse){
      float x1=0,y1=0,xa=0,ya=0;
      if(col==0)canvas.stroke(0);
      else if(x1-xa==0||y1-ya==0)col = color(255,255,0);
      else col = color(0,255,0);
  if(mousePressed){
        canvas.fill(255);
        canvas.ellipse(mouse.x,mouse.y,2,2);
        canvas.fill(0);
        
         x1 = map(mouse.x,x+23,w+23,floor(-rows/2),floor(rows/2));
         xa = floor(x1);
         y1 = map(mouse.y,y+20,h+20,floor((-rows)/4),floor((rows)/4));
         ya = floor(y1);
        if(abs(x1-xa)<0.1f)x1=xa;
        if(abs(y1-ya)<0.1f)y1=ya;
        canvas.text( x1 + ", " + y1 ,mouse.x,mouse.y); 
        
      }}
};

public void displayLabels(){
  
  if(labels){
    for(int i=0;i<cols/2+1;i++){
      fill(255);
      text(i, (x + w)/2 + x + (w/cols-1) * i - 20, y+h/2 + 10);
    }
    for(int i=0;i<cols/2+1;i++){
      fill(255);
      text(- i, (x + w)/2 + x - (w/cols-1) * i - 20, y+h/2 + 10);
    }
    
    for(int i=1;i<rows/2+1;i++){
      fill(255);
      text( i, x+w/2 - textWidth(str(i))-2, (y + h)/2 + y - (h/rows) * i - 10);
    }
    for(int i=1;i<rows/2+1;i++){
      fill(255);
      text(-i, x+w/2 - textWidth(str(-i))-2, (y + h)/2 + y + (h/rows) * i - (h/rows)/2);
    }}
};

public void displayLabels(PGraphics canvas){
  
  if(labels){
    for(int i=0;i<cols/2+1;i++){
      canvas.fill(255);
      canvas.text(i, (x + w)/2 + x + (w/cols-1) * i - 20, y+h/2 + 10);
    }
    for(int i=0;i<cols/2+1;i++){
      canvas.fill(255);
      canvas.text(- i, (x + w)/2 + x - (w/cols-1) * i - 20, y+h/2 + 10);
    }
    
    for(int i=1;i<rows/2+1;i++){
      canvas.fill(255);
      canvas.text( i, x+w/2 - textWidth(str(i)), (y + h)/2 + y - (h/rows) * i - 10);
    }
    for(int i=1;i<rows/2+1;i++){
      canvas.fill(255);
      canvas.text(-i, x+w/2 - textWidth(str(-i)), (y + h)/2 + y + (h/rows) * i - (h/rows)/2);
    }}
};

public void displayAxis(){
  if(axis){
    PVector o = origin;
    fill(0);
    stroke(0);
    strokeWeight(1);
    line(x,y+h/2 - (h/rows)/2,x+w,y+h/2 - (h/rows)/2);
    line(x+w/2,y,x+w/2,y + h);
    }
   if(showMouse){
    if(mouseX>x+(w)/2){
     if(mouseY>y+(h)/2){
      line(mouseX,mouseY,x+(w)/2,mouseY);
      line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }else if(mouseY<y+(h)/2){
      line(mouseX,mouseY,x+(w)/2,mouseY);
      line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }}else {
    if(mouseX<x+(w)/2){
      line(mouseX,mouseY,x+(w)/2,mouseY);
      line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }else{
      line(mouseX,mouseY,x+(w)/2,mouseY);
      line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }}}
};

public void displayAxis(PGraphics canvas){
  if(axis){
    PVector o = origin;
    canvas.fill(0);
    canvas.stroke(0);
    canvas.strokeWeight(1);
    canvas.line(x,y+h/2 - (h/rows)/2,x+w,y+h/2 - (h/rows)/2);
    canvas.line(x+w/2,y - (h/rows)/2,x+w/2,y + h -(h/rows)/2);
  }
    
  if(showMouse){
    if(mouseX>x+(w)/2){
     if(mouseY>y+(h)/2){
      canvas.line(mouseX,mouseY,x+(w)/2,mouseY);
      canvas.line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }else if(mouseY<y+(h)/2){
      canvas.line(mouseX,mouseY,x+(w)/2,mouseY);
      canvas.line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }}else {
    if(mouseX<x+(w)/2){
      canvas.line(mouseX,mouseY,x+(w)/2,mouseY);
      canvas.line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }else{
      canvas.line(mouseX,mouseY,x+(w)/2,mouseY);
      canvas.line(mouseX,mouseY,mouseX,y+(h)/2 - h/cols/2);
    }}}
};
  
  public void regression(){
    //pos
  };
  
  public boolean pos(){
   return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY>y+h;
  };
  
  public boolean pos(PVector m){
   return m.x>x&&m.x<x+w&&m.y>y&&m.x>y+h;
  };
};



class Plot_3D{
  
  int id;
  float x,y,w,h;
  String label;
  boolean drag,resize;
  
  Plot_3D(){
    
  }
  
  public void draw(){
    
    
  };
  
  public void regression(){
    
  };
  
};

class Variable{
  
  PVector pos;
  float x,y;
  int col;
  int id,pSize;
  boolean static_,dynamic;
  
  Variable(float X,float Y,int Col){
    
    x = X;
    y = Y;
    col = Col;
    
  };
  
  Variable(PVector a,int Col){
    
    pos = a;
    x = a.x;
    y = a.y;
    col = Col;
  };
  
  //Variable(float X,float Y,int ID){
  //  x = X;
  //  y = Y;
  //  id = ID;
  //};
  
  Variable(float X,float Y,int Id,int Col){
    
    x = X;
    y = Y;
    id = Id;
    col = Col;
  };
  
  Variable(PVector a,int Id,int Col){
    
    pos = a;
    x = a.x;
    y = a.y;
    id = Id;
    col = Col;
  };
  
};
class Scene extends Boundary{
  
  int id;
  //public float x,y,w,h,
  public float bordersize = 1,limit;
  public int cols = 40, rows = 30;
  public String label;
  public boolean showq,showf;
  //public boolean drag,resize,border = true,fill = true ,toggle,visible,clear;
  //public color col = color(0);
  public int scol = color(0,150);
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  ArrayList<Menu> menus = new ArrayList<Menu>();
  ArrayList<Slider> sliders = new ArrayList<Slider>();
  ArrayList<Button> buttons = new ArrayList<Button>();
  ArrayList<Button> nav = new ArrayList<Button>();
  ArrayList<Plot_2D> plots_2d = new ArrayList<Plot_2D>();
  ArrayList<Plot_3D> plots_3d = new ArrayList<Plot_3D>();
  //Boundary boundary;
  
  
  PImage bgimage;
  ArrayList<Quad> fields = new ArrayList<Quad>();
  
  Scene(float xx,float yy, float ww, float hh){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    //main.Boundaries.add(new Boundary(x,y,w,h,4));
    float gW = (w)/cols, gH = h/rows;
    int k = gw;
    
    float sw = w /cols;
    float sh = h / rows;
    
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        
        float X = x + (gW * j);  
        float Y = y + (gH * i);
        int ID = PApplet.parseInt(j + i * cols);
        
        fields.add(new Quad(new PVector(X,Y),ID,gW,gH,this));
        
      }}
    scenes.add(this);
  };
  
  
  
  Scene(){
    float gW = (w)/cols, gH = h/rows;
    int k = gw;
    
    float sw = w /cols;
    float sh = h / rows;
    
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        
        float X = x + gW/2 + (gW * j);  
        float Y = y + gH/2 + (gH * i);
        int ID = PApplet.parseInt(j + i * cols);
        
        fields.add(new Quad(new PVector(X,Y),ID,gW,gH,this));
        
      }}
    scenes.add(this);
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void display(){
    
    noStroke();fill(255);rect(x,y,w,h);
    strokeWeight(bordersize);
    stroke(bg);if(!border){noStroke();}
    fill(bg);if(!fill)noFill();
    
    rect(x,y,w,h);
    
  };
  
  public void regression(){
    
  };
  
  public void field(){
    
    for(int i=0;i<fields.size();i++){
      
      Quad q = fields.get(i);
      
      q.draw();
      //q.setField();
      //q.field();
    }
    
  };
  
  public boolean pos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  }
  
};
class Slider{
  
  int id = -1,type,functionId;
  float x,y,w,h,valuex,valuey,btnw,btnh, value = 0,toffx,toffy,spacing = 20,tsize = 12,ssize,temp,startvalue,endvalue,start,end;
  String label,parentVar,parentBool,itemLabel;
  boolean drag,resize,border,fill = true ,toggle,visible = true,horizontal = true,vertical,matrix,classic,pie,radio,square,bar,mdown,mup,Label,right,up,down,left,tvisible = true,update = true,
          tdown,parentCanvas;
  int col = color(0);
  int col2 = color(255);
  int col3 = color(255,100);
  int barcol = color(0,100),col4 = color(0,50),tcol = color(255),slidercol = color(255),hovercol = color(0,50);
  String control = "";
  Object Link,parentObject;
  Menu parent;
  tab tooltip,parentTab;
  PVector mouse;
  TextBox Start = null,End = null,Current = null;
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  
  Slider(float xx,float yy, float ww, float hh){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    btnh = h+2;
    btnw = h;
    valuex = w/2;
    valuey = y;
    //value = 0;
    //valuex = 0;
    classic = true;
    bar = true;
    
    createOptionsMenu();
    
  };
  Slider(float xx,float yy, float ww, float hh,String Label){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    btnh = h+2;
    btnw = h;
    label = Label;
    valuex = w/2;
    valuey = y;
    value = 0;
    classic = true;
    bar = true;
    createOptionsMenu();
    
  };
  
  public void createOptionsMenu(){
    tooltip = new tab(x,w,50,120,this);
    String[] s1 = {"Reset"};
    float X = x+w+textWidth("0.000")+20;
    Menu options = new Menu(0,0,80,s1,0);
    tooltip.w = options.w;
    tooltip.add(options);
    TextBox t1 = new TextBox(0,0+30,68,20,20,"Start");
    tooltip.add(t1);
    t1.w = options.w;
    t1 = new TextBox(0,0+60,68,20,20,"End");
    t1.w = options.w;
    tooltip.add(t1);
    t1 = new TextBox(0,0+90,68,20,20,"Value");
    t1.w = options.w;
    tooltip.textboxes.add(t1);
    Start = tooltip.textboxes.get(0);
    End = tooltip.textboxes.get(1);
    tooltip.h = 90+20;
    
  };
  
  public void updateOptionsMenu(){
    //if(!tooltip.drag&&!dragged){
    tooltip.x = x+w+textWidth("0.000")+20;
    Menu options = tooltip.menus.get(0);
    
    
    options.x = 0;
    options.y = 0;
    for(int i=0;i<tooltip.menus.get(0).items.size();i++){
      Button b = tooltip.menus.get(0).items.get(i);
      b.x = 0;
      b.y = 0 + 20 * i;
    }
    TextBox t1 = tooltip.textboxes.get(0);
    t1.y = 0+30;
    t1.x = 0;
    t1 = tooltip.textboxes.get(1);
    t1.y = 0+60;
    t1.x = 0;
    t1 = tooltip.textboxes.get(2);
    t1.y = 0+90;
    t1.x = 0;
    Start = tooltip.textboxes.get(0);
    End = tooltip.textboxes.get(1);
    
    if(tooltip.y+tooltip.h>height)tooltip.draggable = true;
    else tooltip.draggable = false;
    
  };
  
  public void updateOptionsMenu(PGraphics canvas){
    //if(!tooltip.drag&&!dragged){
    tooltip.x = x+w+textWidth("0.000")+20;
    tooltip.y = y;
    Menu options = tooltip.menus.get(0);
    
    options.x = 0;
    options.y = 0;
    for(int i=0;i<tooltip.menus.get(0).items.size();i++){
      Button b = tooltip.menus.get(0).items.get(i);
      b.x = 0;
      b.y = 0 + 20 * i;
    }
    TextBox t1 = tooltip.textboxes.get(0);
    t1.y = 0+30;
    t1.x = 0;
    t1 = tooltip.textboxes.get(1);
    t1.y = 0+60;
    t1.x = 0;
    t1 = tooltip.textboxes.get(2);
    t1.y = 0+90;
    t1.x = 0;
    Start = tooltip.textboxes.get(0);
    End = tooltip.textboxes.get(1);
    
    if(tooltip.y+tooltip.h>height)tooltip.draggable = true;
    else tooltip.draggable = false;
    
  };
  
  
  
  public void draw(){
    functions();
    // fill(0);
    // text(valuex,x,y);
    if(tooltip!=null){
      if(tooltipPos()){
        noStroke();
        //if(stroke)stroke(0);
        fill(0,100);
        String k = "0.0000";
        rect(x+w+textWidth(k),y,20,h);
      }
      if(tooltipPos()&&!mdown&&mousePressed){
        
        tooltip.x = x+w+textWidth("0.000")+20;
        tooltip.y = y;
        //tooltip.track();
        tooltip.toggle = true;
        tooltip.visible = true;
        mdown = true;
        tdown = true;
      }
      // if(!tooltip.draggable){
      // if((!tooltip.posTab()&&!mdown&&tdown&&mousePressed)){
        
      //   // tooltip.toggle = false;
      //   // tooltip.visible = false;
      //   mdown = true;
      //   //tdown = false;
      //   //cursor(ARROW);
      // }}else 
      if((!tooltip.posTabd()&&!mdown&&tdown&&mousePressed)&&!tooltip.posTab()){
        
        // tooltip.toggle = false;
        // tooltip.visible = false;
        mdown = true;
        tdown = false;
        //cursor(ARROW);
      }
      if(!mousePressed)mdown = false;
      if(tdown){
        updateOptionsMenu();
        tooltip.displayTab(); 
        
        if(tooltip.menus.get(0).items.get(0).pos(new PVector(mouseX-tooltip.x,mouseY-tooltip.y))&&mousePressed){
          tooltip.menus.get(0).items.get(0).toggle=1;
          resetControl();
          valuex = w/2;
          value = 0;
          //cursor(ARROW);
          tdown = false;
      }
      //if(!tdown)cursor(ARROW);
      TextBox t = tooltip.textboxes.get(2);
      
      if(PApplet.parseFloat(t.textBox)>-99999999&&keyPressed&&key==ENTER){
        if(parent!=null){

            valuex = t.value;
            switch(functionId){
              
              case(0):set(startvalue,endvalue,parentObject, parentVar);
              break;
              case(1):set(startvalue,endvalue,parentObject, parentVar,parentBool);
              break;
              case(2):setint((int)startvalue,(int)endvalue,parentObject, parentVar);
              break;
              case(3):setint((int)startvalue,(int)endvalue);
              break;
            }
          }
        setControl(t.value);
      }}

    if(!mousePressed){
      //mdown = false;
      
      for(int i=0;i<tooltip.menus.get(0).items.size();i++){
        Button b = tooltip.menus.get(0).items.get(i);
        
        b.toggle=0;
      }}}
  };

  public void draw(PGraphics canvas){
    functions(canvas);
    //if(mouse==null)mouse = new PVector(mouseX,mouseY);
    //classic_Bar(canvas);
    //canvas.fill(0,255,0);
    //if (parentTab!=null)mouse = new PVector(mouseX-parentTab.x,mouseY-parentTab.y);
    //else println("no tab");
    //canvas.ellipse(m.x,m.y,20,20);
    if(tooltip!=null){
      if(tooltipPos(mouse)){
        canvas.noStroke();
        //if(stroke)stroke(0);
        
        canvas.fill(0,100);
        String k = "0.0000";
        PVector m = tooltip.getMouse(mouse);
        canvas.rect(x+w+textWidth(k),y,20,h);
      }
      if(tooltipPos(mouse)&&!mdown&&!tdown&&mousePressed){
        
        tooltip.x = x+w+textWidth("0.000")+20;
        tooltip.y = y;
        //tooltip.track();
        tooltip.toggle=true;
        tooltip.visible = true;
        mdown = true;
        tdown = true;
      }
      if(!tooltip.draggable){

      if((!tooltip.posTab(mouse)&&!mdown&&tdown&&mousePressed)||pos(mouse)&&mousePressed){
        
        tooltip.toggle=false;
        tooltip.visible = false;
        mdown = true;
        tdown = false;
        //cursor(ARROW);
      }}else if((!tooltip.posTabd(mouse)&&!mdown&&tdown&&mousePressed)||pos(mouse)&&mousePressed){
        
        tooltip.toggle=false;
        tooltip.visible = false;
        mdown = true;
        tdown = false;
        //cursor(ARROW);
      }
      
      if(tdown&&!mdown){
        updateOptionsMenu(canvas);
        tooltip.mouse2 = mouse;
        if(parentTab!=null)tooltip.parentTab = parentTab;
        tooltip.displayTab(canvas); 
        fill(255);
        
        if(tooltip.menus.get(0).items.get(0).pos(new PVector(mouse.x-tooltip.x,mouse.y-tooltip.y))&&mousePressed){
          tooltip.menus.get(0).items.get(0).toggle=1;
          resetControl();
          valuex = w/2;
          value = 0;
          
          
          //cursor(ARROW);
      }
      //else if(!tdown)cursor(ARROW);
      TextBox t = tooltip.textboxes.get(2);
      
      if(PApplet.parseFloat(t.textBox)>-99999999&&keyPressed&&key==ENTER){
        //update = true;
        if(parent!=null){

            // for(int i=0;i<5;i++;){
            //   if(functionId==i){
            //     set()
            //   }
            // }
            valuex = t.value;
            switch(functionId){
              case(0):set(startvalue,endvalue,parentObject, parentVar);
              //println(startvalue,endvalue,parentObject, parentVar);
              break;
              case(1):set(startvalue,endvalue,parentObject, parentVar,parentBool);
              break;
              case(2):setint((int)startvalue,(int)endvalue,parentObject, parentVar);
              break;
              case(3):setint((int)startvalue,(int)endvalue);
              break;
            }
          }
      }
      //println(valuex);
        setControl(t.value);
        //update = false;
      }
      if(!mousePressed){
        mdown = false;
        
        for(int i=0;i<tooltip.menus.get(0).items.size();i++){
          Button b = tooltip.menus.get(0).items.get(i);
          
          b.toggle=0;
    }}}
  };
  
  public void set(String a){
    if(a=="vertical"||a=="Vertical"||a=="VERTICAL"){}
  };
  
  
  public void resetControl(){
    Field field = null;

    try{
         field = Link.getClass().getField("sUpdate"); 
         //field.set(Link, "sUpdate");
         field.set(Link, true); 
         //println(field.get(Link),"update",control,Link);
    }catch (NullPointerException e) {
      println("null slider");
    }catch (NoSuchFieldException e) {
      println("no field: update");
    }catch (IllegalAccessException e) {
    } 
            
    try{
         field = Link.getClass().getField(control); 
         field.set(Link, 0); 
         //println(valuex);
    }catch (NullPointerException e) {
      println("null p slider");
    }catch (NoSuchFieldException e) {
      println("no field");
    }catch (IllegalAccessException e) {
    } 
  };
  
  public void setControl(float a){
    value = a;
    valuex = map( value,startvalue,endvalue, 0+1, w-1);
            Field field = null;
    try{
         field = Link.getClass().getField("sUpdate"); 
         //field.set(Link, "sUpdate");
         field.set(Link, true); 
         //println(field.get(Link),"update",control,Link);
    }catch (NullPointerException e) {
      println("null");
    }catch (NoSuchFieldException e) {
      println("no field: update");
    }catch (IllegalAccessException e) {
    } 
    try{
         field = Link.getClass().getField(control); 
         //field.set(Link, "update");
         field.set(Link, a); 
         //println(field.get(Link),valuex,control,Link);
    }catch (NullPointerException e) {
      println("null");
    }catch (NoSuchFieldException e) {
      println("no field");
    }catch (IllegalAccessException e) {
    } 
  };
  
  public void setStart(float a){
            Field field = null;
    try{
         field = Link.getClass().getField(control); 
         field.set(Link, a); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    } 
  };
  
  public void setEnd(float a){
            Field field = null;
    try{
         field = Link.getClass().getField(control); 
         field.set(Link, a); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    } 
  };
  
  public void functions(){
    stroke(col);
    if(!border){
     noStroke(); 
    }
    if(classic){
      if(square)classic_Square();
      else if(radio)classic_Radio();
      else if(bar)classic_Bar();
    }else if(matrix){
      if(square)Matrix();
      else if(radio){}
      else if(bar){}
    }else if(pie){
      if(square)pie_Square();
      else if(radio)pie_Radio();
      else if(bar)pie_Bar();
    }
  };
  
  public void functions(PGraphics canvas){
    if(visible){
    canvas.stroke(col);
    if(!border){
     canvas.noStroke(); 
    }
    if(classic){
      if(square)classic_Square();
      else if(radio)classic_Radio();
      else if(bar)classic_Bar(canvas);
    }else if(matrix){
      if(square)Matrix();
      else if(radio){}
      else if(bar){}
    }else if(pie){
      if(square)pie_Square();
      else if(radio)pie_Radio();
      else if(bar)pie_Bar();
    }}
  };
  
 public void classic_Square(){
    //----------slider bg-----------
    fill(slidercol);
    if(vertical)rect(x,y,w,h);
    else rect(x,y,w,h);
    
    if(pos())fill(hovercol);if(!fill)noFill();
    
    if(vertical)rect(x,y,w,h);
    else rect(x,y,w,h);
    
    textSize(tsize);
    strokeWeight(ssize);
    stroke(0);
    if(parent==null){
    if(btnpos()||pos()||mdown)fill(col4);btnh = h+10;
    }
    
      if(label!=null){
        fill(tcol);
        if(vertical)text(label,x,y-tsize);
        else text(label,x-textWidth(label),y+h);
      }
      if(!vertical)btnh = h;
      noStroke();
      fill(255);
      
      //slider value-------------------
      rectMode(CORNER);
      if(vertical)rect(x,y+valuex,btnw-2,btnw-2);
      else rect(x+valuex,y,btnw,btnh);
      
      fill(barcol);
      
      if(vertical)rect(x,y+valuex,btnw-2,btnw-2);
      else  rect(x + valuex,y,btnw,btnh);
      
      fill(tcol);
      if(vertical){
        pushMatrix();
        translate(x+w+toffx,y+h+toffy);
        rotate(PI/2);
        
        translate(-(x+w+toffx),-(y+h+toffy-w));
        text(value,x+w+toffx,y+h+toffy);
        popMatrix();
      }else text(value,x+w+toffx,y+h+toffy);
      
  };
  
  public void classic_Radio(){
    //----------slider bg-----------
    fill(slidercol);
    if(vertical)rect(x,y,w,h);
    else rect(x,y,w,h);
    
    if(pos())fill(hovercol);if(!fill)noFill();
    
    if(vertical)rect(x,y+valuex,w,h-valuex);
    else rect(x,y,w,h);
    
    textSize(tsize);
    strokeWeight(ssize);
    stroke(0);
    if(parent==null){
    if(btnpos()||pos()||mdown)fill(col4);btnh = h+10;
    }
    
      if(label!=null){
        fill(tcol);
        if(vertical)text(label,x,y-tsize);
        else text(label,x-textWidth(label),y+h);
      }
      if(!vertical)btnh = h;
      noStroke();
      fill(255);
      
      //slider value-------------------
      ellipseMode(CORNER);
      //text(valuex , 500,500 + 10*id);
      if(vertical)ellipse(x,y+valuex,btnw-2,btnw-2);
      else ellipse(x+valuex,y,btnw,btnh);
      
      fill(barcol);
      
      if(vertical)ellipse(x,y+valuex,btnw-2,btnw-2);
      else  ellipse(x + valuex,y,btnw,btnh);
      
      fill(tcol);
      if(vertical){
        pushMatrix();
        translate(x+w+toffx,y+h+toffy);
        rotate(PI/2);
        
        translate(-(x+w+toffx),-(y+h+toffy-w));
        text(value,x+w+toffx,y+h+toffy);
        popMatrix();
      }else text(value,x+w+toffx,y+h+toffy);
      
  };
  
  public void classic_Bar(){
    //----------slider bg-----------
    fill(slidercol);
    if(vertical)rect(x,y+valuex,w,h-valuex);
    else rect(x+valuex,y,w-valuex,h);
    
    if(pos())fill(hovercol);if(!fill)noFill();
    
    if(vertical)rect(x,y+valuex,w,h-valuex);
    else rect(x + valuex,y,w-valuex,h);
    
    textSize(tsize);
    strokeWeight(ssize);
    stroke(0);
    if(parent==null){
    if(btnpos()||pos()||mdown)fill(col4);btnh = h+10;
    }
    
      if(label!=null){
        fill(tcol);
        if(vertical)text(label,x,y-tsize);
        else text(label,x-textWidth(label),y+h);
      }
      if(!vertical)btnh = h;
      noStroke();
      fill(255);
      
      //slider value-------------------
      if(vertical)rect(x,y,w,valuex);
      else rect(x,y,valuex,btnh);
      fill(barcol);
      if(vertical)rect(x,y,w,valuex);
      else rect(x,y,valuex,btnh);
      fill(tcol);
      if(vertical){
        pushMatrix();
        translate(x+w+toffx,y+h+toffy);
        rotate(PI/2);
        
        translate(-(x+w+toffx),-(y+h+toffy-w));
        if(tvisible)text(value,x+w+toffx,y+h+toffy);
        popMatrix();
      }else if(tvisible)text(value,x+w+toffx,y+h+toffy);
      
   
  };
  
  public void classic_Bar(PGraphics canvas){
    canvas.fill(255);
    if(mouse==null){
      if(parentTab!=null)println("cb","parent tab");
      else println("cb","no parent tab");
      mouse = new PVector(mouseX,mouseY);
    }

    //----------slider bg-----------
    canvas.fill(slidercol);
    if(vertical)canvas.rect(x,y+valuex,w,h-valuex);
    else canvas.rect(x+valuex,y,w-valuex,h);
    
    if(pos(mouse))canvas.fill(hovercol);if(!fill)canvas.noFill();
    
    if(vertical)canvas.rect(x,y+valuex,w,h-valuex);
    else canvas.rect(x + valuex,y,w-valuex,h);
    
    canvas.textSize(tsize);
    canvas.strokeWeight(ssize);
    canvas.stroke(0);
    if(parent==null){
    if(btnpos(mouse)||pos(mouse)||mdown)canvas.fill(col4);btnh = h+10;
    }
    
      if(label!=null){
        canvas.fill(tcol);
        if(vertical)canvas.text(label,x,y-tsize);
        else canvas.text(label,x-canvas.textWidth(label),y+h);
      }
      if(!vertical)btnh = h;
      canvas.noStroke();
      canvas.fill(255);
      //slider value-------------------
      if(vertical)canvas.rect(x,y,w,valuex);
      else canvas.rect(x,y,valuex,btnh);
      canvas.fill(barcol);
      if(vertical)canvas.rect(x,y,w,valuex);
      else canvas.rect(x,y,valuex,btnh);
      canvas.fill(tcol);
      if(vertical){
        canvas.pushMatrix();
        canvas.translate(x+w+toffx,y+h+toffy);
        canvas.rotate(PI/2);
        
        canvas.translate(-(x+w+toffx),-(y+h+toffy-w));
        if(tvisible)canvas.text(value,x+w+toffx,y+h+toffy);
        canvas.popMatrix();
      }else if(tvisible)canvas.text(value,x+w+toffx,y+h+toffy);
      
   
  };
  
  public void Matrix(){
    if(!fill){
      noFill();
    }
    fill(col2);
    rect(x,y,w,h);
    
  };
  
  public void pie_Square(){
    if(!fill){
      noFill();
    }
    fill(slidercol);
    ellipseMode(CENTER);
    ellipse(x,y,w,h);
    arc(x,y,w,h,valuex,valuey);
    arc(x+10,y+10,w,h,valuex,valuey);
    fill(col3);
    //rect(
    
  };
  
  public void pie_Radio(){
    if(!fill){
      noFill();
    }
    fill(col2);
    ellipseMode(CENTER);
    ellipse(x,y,w,h);
    arc(x,y,w,h,valuex,valuey);
    arc(x+10,y+10,w,h,valuex,valuey);
    fill(col3);
    ellipseMode(CENTER);
    if(!horizontal){
      ellipse(x+valuex,y,btnw,btnh);
    }else{
      ellipse(x,y + valuey,10,btnh);
    }
  };
  public void pie_Bar(){
    if(!fill){
      noFill();
    }
    fill(col2);
    ellipseMode(CENTER);
    ellipse(x,y,w,h);
    arc(x,y,w,h,valuex,valuey);
    arc(x+10,y+10,w,h,valuex,valuey);
    //line();
  };
  
  public void mouseFunctions(){
    if(btnpos()&&mousePressed||pos()&&mousePressed){
      mup = false;
      mdown = true;
      toggle = true;
    }
    
    if(mdown&&!tdown&&!parentCanvas){
      if(bar){
        if(vertical){
        if(mouseY>y&&mouseY<y + h-1)valuex = mouseY-y;
        if(mouseY>y+h-1)valuex = h-1;
        }else{
          if(mouseX>x&&mouseX<x + w-1)valuex = mouseX-x;
          if(mouseX>x+w-1)valuex = w-1;
        }}
      else if(radio||square){
        if(vertical){
          if(mouseY>y-1&&mouseY<y + h-1&&mouseX>x && mouseX < x + w)valuex = mouseY-y-1;
          if(mouseY>y+h-btnw)valuex = h-btnw;
        }else{
          if(mouseX>x-1&&mouseX<x + w-btnw && mouseY>y && mouseY < y + h)valuex = mouseX-x;
          if(mouseX>x+w-btnw)valuex = w-btnw;
        }}}
    if(mdown&&!mousePressed&&!tdown){
      
      mdown = false;
      toggle = false;
    }
  };
  
  public void mouseFunctions(PVector m){
    // if(mouse==null){
      //  if(parentTab!=null)println("mf","parent tab");
      //  else println("mf","no parent tab");
    //   mouse = new PVector(mouseX,mouseY);
    // }
    // fill(255,0,0);
    // ellipse(m.x,m.y,20,20);
    if(pos(mouse)&&mousePressed){
      
      mdown = true;
      //println(parentTab.x,parentTab.y,mouseX,mouse.x,mouseY,mouse.y);
    }
    
    if(mdown){
      if(bar){
        if(vertical){
          if(m.y>y&&m.y<y + h-1)valuex = m.y-y;
          if(m.y>y+h-1)valuex = h-1;
        }else{
          if(m.x>x&&m.x<x + w-1)valuex = m.x-x;
          if(m.x>x+w-1)valuex = w-1;
        }}
      else if(radio||square){
        if(vertical){
          if(m.y>y-1&&m.y<y + h-1&&m.x>x && m.x < x + w)valuex = m.y-y-1;
          if(m.y>y+h-btnw)valuex = h-btnw;
          
        }else{
          if(m.x>x-1&&m.x<x + w-btnw && m.y>y && m.y < y + h)valuex = m.x-x;
          if(m.x>x+w-btnw)valuex = w-btnw;
        }}}
    if(!mousePressed)mdown = false;
  };
  
  public boolean pos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  }
  
  public boolean pos(PVector m){
    return m.x>x&&m.x<x+w&&m.y>y&&m.y<y+h;
    // else 
    //return mouseX-parentTab.x>x&&mouseX-parentTab.x<x+w&&mouseY-parentTab.y>y&&mouseY-parentTab.y<y+h;
    //return false;
  }
  
  public boolean btnpos(){
    
    if(!horizontal){
    return mouseX>x + valuex &&mouseX<x+valuex+btnw&&mouseY>y&&mouseY<y+h;
    
    }
    else{
      return mouseX>x&&mouseX<x+w&&mouseY>y+ valuey&&mouseY<y + valuey +btnh;
    }
  };
  
  public boolean btnpos(PVector m){
    
    if(!horizontal){
    return m.x>x + valuex &&m.x<x+valuex+btnw&&m.y>y&&m.y<y+h;
    
    }
    else{
      return m!=null&&m.x>x&&m.x<x+w&&m.y>y+ valuey&&m.y<y + valuey;
    }
  };
  
  public boolean tooltipPos(){
    return mouseX>x+w+textWidth("0.0000")&&mouseX<x+w+textWidth("0.0000")+20&&mouseY>y&&mouseY<y+h;
  };
  
  public boolean tooltipMenuPos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  };
  
  public boolean tooltipPos(PVector m){
    return m!=null&&m.x>x+w&&m.x<x+w+textWidth("0.0000")+20&&m.y>y&&m.y<y+h;
  };
  
  public boolean tooltipMenuPos(PVector m){
    return m.x>tooltip.x&&m.x<tooltip.x+tooltip.w&&m.y>tooltip.y&&m.y<tooltip.y+tooltip.h;
  };
  
  public void click(){
    
  };
  
  public void set(float start, float end,Object a,String b) {
    startvalue = start;
    endvalue = end;
    if(Link==null)Link = a;
    if(control=="")control = b;
    float v = 0;
    if(!tdown||update){
    if(mdown||update){
      v = map( valuex, 0+1, w-1,start,end);
      value = v;
    }
            Field field = null;
    try{
         field = a.getClass().getField(b); 
         if(mdown||update){
           field.set(a, v); 
           update = false;
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }} 
  };
  
  public void set(float start, float end,Object a,String b,String c) {
    startvalue = start;
    endvalue = end;
    if(Link==null)Link = a;
    if(control=="")control = b;
    float v = 0;
    if(!tdown||update){
    if(mdown||update){
      v = map( valuex, 0+1, w-1,start,end);
      value = v;
    }
            Field field1 = null;
    try{
         field1 = a.getClass().getField(c); 
         if(mdown||update)field1.set(a, true); 
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }
            Field field = null;
    try{
         field = a.getClass().getField(b); 
         if(mdown||update){
           field.set(a, v); 
           update = false;
         }
    }catch (NullPointerException e) {
    }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }} 
  };
  
  public void set(float start, float end) {
    
    float v = 0;
    if(!vertical){
    if(mdown||update){
      v = map( valuex, 1, w-1,start,end);
      value = v;
      update = false;
    }}else{
      if(mdown||update){
      v = map( valuex, 1, h-1,start,end);
      value = v;
      update = false;
    }}
  };
  
  public void setint(int start, int end,Object a,String b) {
    if(Link==null)Link = a;
    if(control=="")control = b;
    int v = 0;
    if(mdown||update){
      //valuex = 
      v = floor(map( valuex, 1, w-1,start,end));
      value = v;
    }
            Field field = null;
    try{
         field = a.getClass().getField(b); 
         if(mdown||update){
           field.set(a, PApplet.parseInt(v)); 
           update = false;
         }
         }catch (NoSuchFieldException e) {
    }catch (IllegalAccessException e) {
    }      //noLoop();
  };
  
  public void setint(int start, int end) {
    int v = 0;
    if(mdown||update){
      v = floor(map( valuex, 1, w-1,start,end));
      value = v;
      update = false;
    }
  };
  
  
};






class TextBox {

  int id, toggle, cols, rows, size, t, timer = 20, blkrate = 30, t1 = blkrate, t2 = blkrate, start, end, hcount, index, lindex, vindex = -1, hindex = -1, windex, vpos = 0, hpos, sltcounter, vcount = 0,delay=10,delay2 = 5,maxCount = 51;
  float x, y, w, h, textsize = 10, twidth = 0, posx, posy, tposx, tposy, strposx, strposy, tbwidth, strwidth, strwidth2, strheight, cursorx, cursory, crwidth, totalwidth,xoff,
        xOffset,yOffset;
  String label, text, label_backup, cboard = "";
  boolean drag, resize, hover, border, background, hidden, fill = true, init, ready, label_bool, clear, copied, tbox = false, full, tsize,dragtext,mdown,onfocus,showLabel,parentCanvas,firstPress,getChar;
  Menu toolBox;
  Button child;
  ArrayList<Letter> textbox = new ArrayList<Letter>();
  ArrayList<Letter> tm0 = new ArrayList<Letter>();
  ArrayList<Letter> tm1 = new ArrayList<Letter>();
  String textBox = "";
  String temp = "";
  public float value;
  ArrayList<Integer> counted = new ArrayList<Integer>();
  ArrayList<Integer> lines = new ArrayList<Integer>();
  ArrayList<Integer> dragh = new ArrayList<Integer>();
  ArrayList<String> saveValues = new ArrayList<String>();
  Letter b = null;
  PVector mouse;
  int col = color(255), col2 = color(0);

  Window parent;

  TextBox(float X, float Y, float WW, float HH, int Cols) {

    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;
    totalwidth = w;
    size = textbox.size();
    textsize = h;
    lines.add(0);
    tbox = false;
  };

  TextBox(float X, float Y, float WW, float HH, int Cols, String Label) {

    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;

    totalwidth = w;
    size = textbox.size();
    label = Label;
    label_backup = Label;
    lines.add(0);
    label_bool = true;
    //textBox = label;
    showLabel = true;
    textsize = h;
    toolBox = new Menu(x+1, y-20, 200-1, 20);
  };

  TextBox(float X, float Y, float WW, float HH, int Cols, Boolean N) {

    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;
    totalwidth = w;
    size = textbox.size();
    lines.add(0);
    label_bool = true;
    textsize = h;
    tbox = N;
  };


  public void init() {
    
  };

  public void draw() {

    twidth = 0;
    box();
    getCursor();
    mpos();
    nav();
    conditionals();
    highlight();
    selectall();
    error();
    getKey();

    if (key== ENTER)value = PApplet.parseFloat(textBox);
    //debug();
    if(showLabel){
      textSize(textsize);
      fill(0);
      text(label,x,y+textsize - 5);
      textSize(12);
      if(mouse!=null&&mousePressed&&pos(mouse)||toggle==1)showLabel = false;
      else if(mousePressed&&pos())showLabel = false;
      
    }
    //----------------------------------------------------- amend letters
    xOffset = 0;
    for (int i=0; i<textBox.length(); i++) {
      Letter a = null;
    if(a!=null&&a.x>x+w)xOffset += textWidth(a.l);
    }
    
    float c1 = 0;
    int cindex = -1;
    twidth = cursorx;
    
    for (int i=0; i<textBox.length(); i++) {

      Letter a = null;
      String b = str(textBox.charAt(i));

      if (textbox.size()==textBox.length()) {
        a = textbox.get(i);
      } else {
        a = new Letter(b, x, y);
        textbox.add(a);
      }

      float c2 = textWidth(textBox.substring (0, i));

      if (a!=null) {
        strwidth2 = (c2 + textWidth(a.l)<w)? c2 + textWidth(a.l): c2%w + textWidth(a.l);
        //if (c1 + a.w > w)c1=0;
        if (c1==0) {
          cindex++;
          a.id = i;
          a.vpos = cindex;
          boolean k = lines.contains(i);
          if (!k)lines.add(i);
        }
      }

      if (a==null&&b!=null) {
        a = new Letter(b, x, y);
        if (a.id!=i)a.id = i;
        a.y = y;
        a.x = x+c1;
        a.vpos = cindex;
        textbox.add(a);
      }

      if (a.l!=b) { 
        textbox.get(i).l = b;
        a.w = textWidth(b);
        if (a.id!=i)a.id = i;
        a.y = y;
        a.x = x+c1;
        a.vpos = cindex;
      }
      fill(a.col2);
      textSize(textsize);
      
      if(a.x + xOffset<x||a.x+xOffset>x+w)a.visible = false;
      if(a.visible)text(a.l, a.x, a.y+textsize-5);
      c1 += textWidth(a.l);
      textSize(12);
      if (selectAll&&toggle==1&&dragh.size()==textBox.length()) {

        if (dragh.get(i)!= i) dragh.set(i, i);
      }
    }

    //-------------------------------------------------
    if(dragh.size()>0){
    for (int j=0; j<dragh.size(); j++) {
      Letter b = textbox.get(dragh.get(j));
      fill(0, 0, 255, 125);
      noStroke();
      rect(b.x, b.y, b.w, b.h);
    }}
    if (!mousePressed)dragh = new ArrayList<Integer>();
    strokeWeight(1);
  };
  
  public void draw(PGraphics canvas) {

    twidth = 0;
    box(canvas);
    getCursor(canvas);
    mpos(mouse);
    nav();
    conditionals(canvas);
    highlight(canvas);
    selectall();
    error(canvas);
    getKey(canvas);

    if (key== ENTER)value = PApplet.parseFloat(textBox);
    //debug();
    if(showLabel){
      canvas.textSize(textsize);
      canvas.fill(0);
      canvas.text(label,x,y+textsize - 5);
      canvas.textSize(12);
      if(mousePressed&&pos(mouse))showLabel = false;
    }
    //----------------------------------------------------- amend letters
    xOffset = 0;
    for (int i=0; i<textBox.length(); i++) {
      Letter a = null;
    if(a!=null&&a.x>x+w)xOffset += textWidth(a.l)+3;
    }
    
    float c1 = 0;
    int cindex = -1;
    twidth = cursorx;
    
    for (int i=0; i<textBox.length(); i++) {

      Letter a = null;
      String b = str(textBox.charAt(i));

      if (textbox.size()==textBox.length())a = textbox.get(i);
      else {
        a = new Letter(b, x, y);
        textbox.add(a);
      }

      float c2 = textWidth(textBox.substring (0, i));

      if (a!=null) {
        strwidth2 = (c2 + textWidth(a.l)<w)? c2 + textWidth(a.l): c2%w + textWidth(a.l);
        if (c1==0) {
          cindex++;
          a.id = i;
          a.vpos = cindex;
          boolean k = lines.contains(i);
          if (!k)lines.add(i);
        }}

      if (a==null&&b!=null) {
        a = new Letter(b, x, y);
        if (a.id!=i)a.id = i;
        a.y = y;
        a.x = x+c1;
        a.vpos = cindex;
        textbox.add(a);
      }

      if (a.l!=b) { 
        textbox.get(i).l = b;
        a.w = textWidth(b);
        if (a.id!=i)a.id = i;
        a.y = y;
        a.x = x+c1;
        a.vpos = cindex;
      }
      canvas.fill(a.col2);
      canvas.textSize(textsize);
      
      if(a.x + xOffset<x||a.x+xOffset>x+w)a.visible = false;
      if(a.visible)canvas.text(a.l, a.x, a.y+textsize-5);
      c1 += textWidth(a.l)+5;
      canvas.textSize(12);
      if (selectAll&&toggle==1&&dragh.size()==textBox.length()) {

        if (dragh.get(i)!= i) dragh.set(i, i);
      }}

    //-------------------------------------------------
    if(dragh.size()>0){
    for (int j=0; j<dragh.size(); j++) {
      Letter b = textbox.get(dragh.get(j));
      canvas.fill(0, 0, 255, 125);
      canvas.noStroke();
      canvas.rect(b.x, b.y, b.w, b.h);
    }}
    if (!mousePressed)dragh = new ArrayList<Integer>();
    canvas.strokeWeight(1);
  };

  public void selectall() {
    fill(0);
    //if(selectAll){fill(0);text("Select all", 100,200);}
    if (toggle==1&&ctrl==1&&selectAll)text("Select all", 100, 200);
    
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };

  public String getValue() {
    return textBox;
  };

  public ArrayList getObject() {
    return textbox;
  };

  public void highlight() {
    float c = 0;
    int d = 0;

    if (textbox.size()>0) {

      for (int i=0; i<textbox.size(); i++) {
        Letter a = textbox.get(i);
        noStroke();
        if (a.pos()) {
          a.col = color(255, 255, 0);
          fill(a.col);
          rect(a.x, a.y, a.w, a.h);
        } else a.col  = color(0);
        if (mousePressed&&a.pos()) {
          vindex = a.vpos;
          hindex = a.id;
          cursorx = a.x-x+a.w;
          cursory = a.y;
          boolean n = dragh.contains(i);
          
          if (!n) dragh.add(i);
          //text(a.id, a.x + x, a.y);
        }}}
  };
  
  public void highlight(PGraphics canvas) {
    float c = 0;
    int d = 0;

    if (textbox.size()>0) {

      for (int i=0; i<textbox.size(); i++) {
        Letter a = textbox.get(i);
        canvas.noStroke();
        if (a.pos(mouse)) {
          a.col = color(255, 255, 0);
          canvas.fill(a.col);
          canvas.rect(a.x, a.y, a.w, a.h);
        } else a.col  = color(0);
        if (mousePressed&&a.pos(mouse)) {
          vindex = a.vpos;
          hindex = a.id;
          cursorx = a.x-x+a.w;
          cursory = a.y;
          boolean n = dragh.contains(i);
          
          if (!n) dragh.add(i);
          //text(a.id, a.x + x, a.y);
        }}}
  };
  

  public void error() {
    //boolean tsize = true;
    if (clipBoard.length()>0&&textWidth(clipBoard)+textWidth(textBox)*textsize/12>totalwidth&&copy_clipboard&&clipboard_toggle==1)tsize = true;

    if (toggle==1) {
      if (tsize) {
        String message = "ClipBoard too large";
        float l = textWidth(message);
        stroke(0);
        fill(255);
        rect(W/2-l/2+200, H/2-textsize, l*2, textsize*2);
        fill(0);
        text(message, W/2+200, H/2);
      }

      if (tsize&&mousePressed)tsize = false;
    }
  };
  
  public void error(PGraphics canvas) {
    //boolean tsize = true;
    if (clipBoard.length()>0&&textWidth(clipBoard)+textWidth(textBox)*textsize/12>totalwidth&&copy_clipboard&&clipboard_toggle==1)tsize = true;

    if (toggle==1) {
      if (tsize) {
        String message = "ClipBoard too large";
        float l = textWidth(message);
        canvas.stroke(0);
        canvas.fill(255);
        canvas.rect(W/2-l/2+200, H/2-textsize, l*2, textsize*2);
        canvas.fill(0);
        canvas.text(message, W/2+200, H/2);
      }

      if (tsize&&mousePressed)tsize = false;
    }
  };

  public void getKey(){
   
    if(toggle==1){
    String clipboard = null;
    Letter current = null;
    
    String a = getChar();
    String tm = "";
    String tm2 = "";
    tm0 = new ArrayList<Letter>();
    tm1 = new ArrayList<Letter>();
    float current_width = textWidth(textBox);
    
    if(textbox.size()>0&&hindex!=-1)current = textbox.get(hindex);
    if(textbox.size()>0&&hindex==-1)current = textbox.get(textbox.size()-1);
    
    if(clipboard_toggle==0)cboard = "";
    
    if(cboard != clipBoard&&copy_clipboard){ clipboard = clipBoard;cboard = clipBoard;}
    else{ clipboard = null;}
    float delay = delay2;
    if(!copy_clipboard&&clipboard_toggle==0){
      
        timer --;
        Letter l = null;
        if(a!=null) l = new Letter(a,x+strwidth,y + vcount * textsize);
        if(a!=null&&getChar&&key!=BACKSPACE&&(current_width+ l.w<totalwidth)){
          
          l.id = hindex +1;
          
          if(hindex==-1){
            if(textbox.size()==0){
              l.y = y;
              l.x = x;
              textbox.add(l);
              textBox += a;
            }
              else if(l.vpos < rows||l.x+l.w<x+w){
              l.y = y + vcount * textsize;
              cursory = l.y;
              textbox.add(l);
              textBox += a;
              
          }}else{
            
            Letter end = textbox.get(textbox.size()-1);
            Letter n = new Letter(a,cursorx,cursory);
            if((hindex!=textbox.size()-1||hindex!=-1)&&getChar){
              
            Letter b = textbox.get(hindex);
            l.id = b.id ;
            
            n.x = cursorx ;
            if(hindex-1> 0)l.y = y + textbox.get(hindex-1).vpos * textsize;
                else l.y = y; cursory = y;
                
            if(hindex<textBox.length())tm = textBox.substring ( 0, hindex + 1);
            tm += a;
            if(hindex<textBox.length())tm2  = textBox.substring ( hindex + 1, textBox.length()  );
            textBox = tm + tm2;
            hindex ++;
            if(hindex < textbox.size()-1)cursorx = textbox.get(hindex+1).x;
          }}
          
          if(timer<=0){
            timer = maxCount;
          }}
        else if(keyPressed && key==BACKSPACE&&getChar){delete();}
        //setDelay = true;
    }
    else if(copy_clipboard&&clipboard_toggle==1&&!tsize){
      
            if(hindex>-1){
            if(hindex<textBox.length())tm = textBox.substring ( 0, hindex + 1  );
            if(hindex<textBox.length())tm2  = textBox.substring ( hindex + 1, textBox.length()  );
            tm += cboard;
            tm += tm2;
            
            textBox = tm;
            
         }else{
             
              for (int i=0;i<cboard.length();i++){
                String b = str(cboard.charAt(i));
                textBox += b;
              }}
              clipboard_toggle = 0;
              copy_clipboard = false;
              }}
  };
  
  public void getKey(PGraphics canvas) {
    
    Boolean k = false;
    if (pos(mouse)||toggle>0) {
      String clipboard = null;
      Letter current = null;

      float current_width = textWidth(textBox)*textsize/12;

      if (textbox.size()>0&&hindex!=-1)current = textbox.get(hindex);
      if (textbox.size()>0&&hindex==-1)current = textbox.get(textbox.size()-1);

      if (clipboard_toggle==0)cboard = "";

      if (cboard != clipBoard&&copy_clipboard) { 
        clipboard = clipBoard;
        cboard = clipBoard;
      } else clipboard = null;
      
      String a = getChar();
      String tm = "";
      String tm2 = "";
      tm0 = new ArrayList<Letter>();
      tm1 = new ArrayList<Letter>();

      if (!copy_clipboard&&clipboard_toggle==0) {

        timer --;
        Letter l = null;

        if (a!=null) l = new Letter(a, x+strwidth, y + vcount * textsize);
        if (a!=null&&getChar&&!exclusion()&&key!=BACKSPACE&&key!=ENTER) {

          l.id = hindex +1;

          if (hindex==-1) {
            if (textBox.length()<cols) {
              l.y = y + vcount * textsize;
              cursory = l.y;
              textbox.add(l);
              textBox += a;
            }} else {

            Letter end = textbox.get(textbox.size()-1);
            Letter n = new Letter(a, cursorx, cursory);
            if ((hindex!=textbox.size()-1||hindex!=-1)&&getChar) {

              Letter b = textbox.get(hindex);
              l.id = b.id ;

              n.x = cursorx ;
              if (hindex-1> 0)l.y = y + textbox.get(hindex-1).vpos * textsize;
              else l.y = y; 
              cursory = y;

              tm = textBox.substring ( 0, hindex + 1);
              tm += a;
              tm2  = textBox.substring ( hindex + 1, textBox.length()  );
              textBox = tm + tm2;
              hindex ++;
              if (hindex < textbox.size()-1)cursorx = textbox.get(hindex+1).x;
            }
          }

          if (timer<=0)timer = 21;
          
        } else if (keyPressed && key==BACKSPACE&&getChar) {
          delete();
        } else if (keyPressed && keyCode==ENTER&&getChar) {
          value = PApplet.parseFloat(textBox);
        }
      } else if (copy_clipboard&&clipboard_toggle==1&&getChar) {
        if (!tsize) {
          if (timer<=0) {
            timer = 21;
          }
          if (hindex>-1) {
            tm = textBox.substring ( 0, hindex  );
            tm2  = textBox.substring ( hindex, textBox.length()  );

            if (hindex>-1) {
              if (hindex<textBox.length())tm = textBox.substring ( 0, hindex + 1  );
              if (hindex<textBox.length())tm2  = textBox.substring ( hindex + 1, textBox.length());
              tm += cboard;
              tm += tm2;

              textBox = tm;
            }
          } else {

            for (int i=0; i<cboard.length(); i++) {
              String b = str(cboard.charAt(i));
              textBox += b;
            }}}}}
  };
  
  public void dragText(){
    
  };

  public void getCursor() {

    getClick();
    //cursor(HAND);
    Boolean k = false;
    if(mouse!=null&&pos(m))k = true;
    if (vindex>-1) {
    }
    if (hindex==-1) {
      if (textbox.size()==0) {
        cursory = y;
        cursorx = 1;
        vindex = 0;
      } else {
        if (textbox.size()>0&&hindex<textbox.size()) {
          cursory = y + textbox.get(textbox.size()-1).vpos * textsize;
          cursorx = textbox.get(textbox.size()-1).x + textbox.get(textbox.size()-1).w*(textsize/12)-x;
        }
      }
    }
    if (hindex>-1) {
      if (textbox.size()>hindex+1) {
        cursorx = textbox.get(hindex).x + textbox.get(hindex).w*(textsize/12) - x;
        cursory = y + textbox.get(hindex).vpos * textsize;
      }
    }
    if ((pos()||toggle>0)||k) {
      cursor(POINT);
      if (t1>0) {
        t1 --;
        if (strheight<y+h) {
          stroke(0);
          strokeWeight(1);
          line(x+cursorx, cursory, x+cursorx, cursory+textsize);
        }
        if (t1<=0)t2 = blkrate;
      }
      if (t2>0&&t1<=0) {
        t2--;
        if (t2<=0)t1 = blkrate;
      }
    } else cursor(ARROW);
    
  };
  
  public void getCursor(PGraphics canvas) {

    getClick(mouse);
    //cursor(HAND);
    if (vindex>-1) {
    }
    if (hindex==-1) {
      if (textbox.size()==0) {
        cursory = y;
        cursorx = 1;
        vindex = 0;
      } else {
        if (textbox.size()>0&&hindex<textbox.size()) {
          cursory = y + textbox.get(textbox.size()-1).vpos * textsize;
          cursorx = textbox.get(textbox.size()-1).x + textbox.get(textbox.size()-1).w*(textsize/12)-x;
        }
      }
    }
    if (hindex>-1) {
      if (textbox.size()>hindex+1) {
        cursorx = textbox.get(hindex).x + textbox.get(hindex).w*(textsize/12) - x;
        cursory = y + textbox.get(hindex).vpos * textsize;
      }
    }
    if ((pos(mouse)||toggle>0)) {
      cursor(POINT);
      if (t1>0) {
        t1 --;
        if (strheight<y+h) {
          canvas.stroke(0);
          canvas.strokeWeight(1);
          canvas.line(x+cursorx, cursory, x+cursorx, cursory+textsize);
        }
        if (t1<=0)t2 = blkrate;
      }
      if (t2>0&&t1<=0) {
        t2--;
        if (t2<=0)t1 = blkrate;
      }
    } else cursor(ARROW);
    
  };

  public void delete() {
    Letter current = null;

    if (textbox.size()>0&&hindex!=-1)current = textbox.get(hindex);
    if (textbox.size()>0&&hindex==-1)current = textbox.get(textbox.size()-1);

    String tm1 = "", tm2 = "";

    String tma;
    if (keyPressed && key == BACKSPACE) {
      if (hindex==-1) {
        if (current!=null&&current.id>0) {
          if (lines.size()-1>0&&current.vpos<lines.size()-1) {
            vcount --;
            lines.remove(lines.size()-1);
          }
          hindex = current.id;
          textbox.remove(textbox.size()-1);
          textBox = textBox.substring ( 0, textBox.length()-1  );
        } else {
          textbox = new ArrayList<Letter>();
          textBox = "";
        }
      } else {
        if (current!=null&&current.id>-1) {
          //if(current!=null&&lines.get(lines.size()-1) > textbox.get(textbox.size()-1).id-1) lines.remove(lines.size()-1);
          if (lines.size()>0&&textbox.get(textbox.size()-1).vpos<lines.size()-1) {
            vcount --;
            lines.remove(lines.size()-1);
          }
          hindex = current.id-1;
          //hindex --;
          textbox.remove(textbox.size()-1);
          if (current.id >0) {
            tm1 = textBox.substring ( 0, hindex+1 );
            tm2 = textBox.substring ( hindex +2, textBox.length()  );
          } else if (current.id==0) {
            tm1 = "";
            tm2 = textBox.substring ( 0, textBox.length()  );
          }
          textBox = tm1 + tm2;
        }
      }
    }
  };

  public void paste() {

    for (int i=0; i<cboard.length(); i++) {
      String a = str(cboard.charAt(i));
      getKey();
    }
  };

  public void box() {
    if (!hidden) {
      //------------------------------- border
      if (border)stroke(col2);
      else noStroke();
      //-------------------------------label
      if (label!=null&&!clear) {
        fill(col2);
        text(label, x, y+textsize);
      }
      //---------------------------------fill
      if (fill)if (pos())fill(col);
      else fill(0);
      else noFill();
      fill(col);

      rect(x, y, w, h);
    }
  };
  
  public void box(PGraphics canvas) {
    if (!hidden) {
      //------------------------------- border
      if (border)canvas.stroke(col2);
      else canvas.noStroke();
      //-------------------------------label
      if (label!=null&&!clear) {
        canvas.fill(col2);
        canvas.text(label, x, y+textsize);
      }
      //---------------------------------fill
      if (fill)if (pos(mouse))canvas.fill(col);
      else canvas.fill(0);
      else canvas.noFill();
      canvas.fill(col);

      canvas.rect(x, y, w, h);
    }
  };

  public Letter sort(ArrayList<Letter>a) {
    Letter k = a.get(0);

    for (int i=0; i<a.size(); i++) {

      if (k.id>a.get(i).id) {
        k = a.get(i);
      }
    }
    return k;
  };

 public void conditionals(){
    
    if(vpos<=0) vpos = 0;
    
    if(selectAll&&toggle==1){
        if(dragh.size()!=textBox.length())dragh.add(0);
      }
     
    if(keyPressed&&keyCode!=SHIFT&&keyCode!=CONTROL){
      timer --;
    }else {
      timer = maxCount;
      firstPress = false;
    }
    if(lines.size()>rows)lines.remove(lines.size()-1);
    if(lines.size()<=1)vcount = 0;
    if(toggle==1)clear = true;
    if(mousePressed&&!pos()){
      //vindex = -1;
      hindex = -1;
    }
    if(mousePressed&&pos()){toggle=1;}
    
    if(toggle==1){
    if(keyPressed&&keyCode!=SHIFT&&keyCode!=CONTROL){
        if((timer==maxCount-2||(timer%delay==0&&!firstPress))||(firstPress&&timer%delay2==0)){
          getChar = true;
        }else getChar = false;
        if(timer<0)firstPress=true;
      }else getChar = false;
    }
  };
  
  public void conditionals(PGraphics canvas) {

    if (vpos<=0) vpos = 0;
    if (selectAll&&toggle==1)if (dragh.size()!=textBox.length())dragh.add(0);
    if(keyPressed&&keyCode!=SHIFT&&keyCode!=CONTROL){
      timer --;
    }else {
      timer = maxCount;
      firstPress = false;
    }
    if (lines.size()>rows)lines.remove(lines.size()-1);
    if (lines.size()<=1)vcount = 0;
    if (toggle==1)clear = true;
    if (mousePressed&&(!pos(m)))hindex = -1;
    if (mousePressed&&(pos(m)))toggle=1;mdown = true;
    if(!mousePressed)mdown = false;
    if(toggle==1){
    if(keyPressed&&keyCode!=SHIFT&&keyCode!=CONTROL){
        if((timer==maxCount-2||(getChar&&!firstPress))||(firstPress&&timer%delay2==0)){
          getChar = true;
        }else getChar = false;
        if(timer<0)firstPress=true;
      }else getChar = false;
    }
  };

  public void constants() {
    strheight = (floor(textWidth(textBox)/(w)));
    strwidth = ((textWidth(textBox))%(w));
  };

  public boolean exclusion() {
    boolean k = false;

    if (keyCode==37||keyCode==38||keyCode==39||keyCode==40||keyCode==33||keyCode==34||keyCode==17||keyCode==18||keyCode==9) {
      k = true;
    } else if (keyCode==20||keyCode==16||keyCode==255||keyCode==91||keyCode==36||keyCode==35||keyCode==45||keyCode==46||keyCode==8) {
      k = true;
    }
    return k;
  };



  public void select_All() {
    if (selectAll) {
    }
  };

  public void debug() {
    fill(255);
    text(vpos, 140, 110);

    text("lines " + lines.size(), 140, 140);
    text(totalwidth, 140, 160);
    if (hindex>-1) {
      text(hindex, 140, 120);
    } else {
      text(hindex, 140, 120);
    }
    if (vcount>-1)text(vcount, 140, 130);
    //if(clipBoard!=""){text(clipBoard,140,100);}
    for (int i=0; i<lines.size(); i++) {
      text(lines.get(i), x+x, y+40+10*i);
    }
  };



  public String getChar() {
    String a = null;

    if (keyPressed) {
      a  = str(key);
    }
    if (keyCode==9) a = null;

    return a;
  }
  public char getchar() {
    char a = '¬';

    if (keyPressed) {
      a  = PApplet.parseChar(key);
    }
    if (keyCode == 8) {
    }
    pos();
    return a;
  };

  public boolean pos() {

    float X = mouseX;
    float Y = mouseY;

    return X > x && X < x + w && Y > y && Y < y + h;
  };
  
  public boolean pos(PVector m) {

    float X = m.x;
    float Y = m.y;

    return X > x && X < x + w && Y > y && Y < y + h;
  };

  public void calc_lwidth() {
    for (int i=0; i<strheight+1; i++) {
      for (int j=0; j<w; j++) {
      }
    }
  };

  public void insert() {
    if (hindex>-1) {
    } else {
    }
  };

  public void mpos() {
    float X = mouseX;
    float Y = mouseY;
    float ww = w/cols;
    float hh = h/rows;

    if (pos())posx = floor(X/ww)*ww-10;
    posy = floor(Y/hh)*hh;
  };
  
  public void mpos(PVector m) {
    float X = m.x;
    float Y = m.y;
    float ww = w/cols;
    float hh = h/rows;

    if (pos(m))posx = floor(X/ww)*ww-10;
    posy = floor(Y/hh)*hh;
  };

  public void getClick() {
    if (pos() && mousePressed)toggle++;
    if (!pos()&& mousePressed)toggle=0;
    if(toggle==2)toggle=0;
  };
  
  public void getClick(PVector m) {
    
    if (pos(m) && mousePressed)toggle++;
    if (!pos(m)&& mousePressed)toggle=0;
    if(toggle==2)toggle=0;
  };

  public void nav() {
    if (hindex>=textbox.size()-1) {
      hindex  =-1;
    }
    if (textbox.size()>0) {
      if (hindex>=1) {
        boolean k = false;
        if (keyPressed && keyCode == 37) {
          k = true;
        }
        if(!keyPressed)k = false;
        if (k&&(getChar||timer==21)) {
          hindex --;
        }
      }
      if (hindex<=textbox.size()-1&&hindex>-1) {
        if (keyPressed && keyCode == 39 &&getChar) { 
          hindex ++;
        }
      }
      //if(keyPressed && key == UP && strheight >0) hindex += vpos *2;
      //if(keyPressed && key == DOWN && strheight )

      if (hindex==-1) {
        if (keyPressed && keyCode == 37 &&getChar) {
          hindex = textbox.size()-2;
        }
        //if(keyPressed && keyCode == 39 &&getChar){ hindex = 0;}
      }
    }
  };
};

class Text{
  
  float x,y,textsize;
  
  boolean visible;
  int col,col1,col2,col3,col4;
  String text = "";
  Text(float X,float y,String s){
    x = X;
    y = Y;
    
    text = s;
  };
  
  public void draw(){
      if(visible){
        fill(col);
        text(text,x,y);
    }
  };

};
public void camera (){
  String[] cameras = Capture.list();
  
  if (cameras.length == 0) {
    println("There are no cameras available for capture.");
    exit();
  } else {
    println("Available cameras:");
    for (int i = 0; i < cameras.length; i++) {
      println(cameras[i]);
    }
    
    // The camera can be initialized directly using an 
    // element from the array returned by list():
   
    //cam.start();     
  }
};
class cell {
  float x, y, h, res, w, ry, rows_, cols_,avmax,ahmax,cutoff,mean,variance,theta1,theta2,theta3,mag;
  int id, xpos, ypos, walls, counter, cols, rows,minr,maxr,pixelThresh = 20000,pixelThresh1,Mode,
      minwr,maxwr,ucount,dcount,lcount,rcount,myMax,vmax,hmax,edgeD = -1,counted,edgeId = -1;
  boolean visited, wall, link, edge, border, v1, v2, v3, v4,complete,update;
  ArrayList <cell> cells;
  ArrayList <cell> cellso;
  ArrayList< ArrayList<cell>> cells2D = new ArrayList<ArrayList<cell>>();
  ArrayList <cell> neighbours = new ArrayList<cell>();
  ArrayList <cell> neighbours2 = new ArrayList<cell>();
  ArrayList <cell> contours = new ArrayList<cell>();
  ArrayList <cell> contoursB = new ArrayList<cell>();
  
  ArrayList <ArrayList <cell>> edges = new ArrayList<ArrayList<cell>>();
  ArrayList <cell> unsortedEdges = new ArrayList<cell>();
  ArrayList <cell> sortedEdges = new ArrayList<cell>();
  ArrayList<ArrayList<cell>> superPixels = new ArrayList<ArrayList<cell>>();
  int col = color(random(255), random(255), random(255));
  cell parent;
  PImage img,backup,canny,cannyE;
  PImage pImage;
  
  cell(){
    
  };

  cell(int a, int b) {
    //this.img = img; 
    cols = a;
    rows = b;
    rows_ = PApplet.parseFloat(b);
    cells = new ArrayList<cell>();
    w = img.width;
    h = img.height;
    res = img.width/cols;
    ry = img.height/100.0f;
    counter = rows * cols -1;
    backup = new PImage(cols,rows,RGB);
    float n = map(cutoff, 0, 100, 0, 255);
    
    backup.loadPixels();
    for (int i=0; i<cols; i++) {
      for (int j=0; j<rows; j++) {
        int p = j + i * cols;
        float h = floor(random(100));
        cell c = new cell(p, res*i, ry*j, i, j, h, this);
        if (h<cutoff)c.wall = true;
        else c.wall = false;
        cells.add(c);
        //backup[p] = color(
      }
    }
    backup.updatePixels();
  };
  
  cell(PImage img) {
    this.img = img; 
    cols = img.width;
    rows = img.height;
    //cols = img.width;
    //rows = img.height;
    rows_ = PApplet.parseFloat(rows);
    cols_ = PApplet.parseFloat(cols);
    cells = new ArrayList<cell>();
    w = width;
    h = height;
    res = img.width/cols;
    //res = 1;
    ry = img.height/rows;
    //ry = 1;
    counter = rows * cols -1;
    backup = new PImage(cols,rows,RGB);
    float n = map(cutoff, 0, 100, 0, 255);
    
    backup.loadPixels();
    for (int j=0; j<rows; j++) {
      for (int i=0; i<cols; i++) {
        int p = PApplet.parseInt(i + j * img.width);
          if (p<img.pixels.length) {
            float r = red(img.pixels[p]);
            float g = green(img.pixels[p]);
            float bb = blue(img.pixels[p]);
            float br = brightness(img.pixels[p]);
            float h = (red(img.pixels[p]) + green(img.pixels[p]) + blue(img.pixels[p]) + brightness(img.pixels[p]))/4;
            //println(r);
            cell c = new cell(i+j*cols, img.width/cols*i, img.height/rows*j, i, j, h, this);
            if (g<cutoff){
              c.col = color(0);
              c.wall = true;
              contours.add(c);
            }
            else {
              c.col = color(255);
              c.wall = false;
              
            }
            cells.add(c);
            backup.pixels[p] = color(h);
        }
      }
    }
    
  };
  
  cell(String loc) {
    
    this.img = loadImage(loc);
    //this.backup = loadImage(loc);
    if(img!=null){
      canny = new PImage(img.width,img.height,ARGB);
      cols = img.width;
      rows = img.height;
      //cols = img.width;
      //rows = img.height;
      rows_ = PApplet.parseFloat(rows);
      cols_ = PApplet.parseFloat(cols);
      cells = new ArrayList<cell>();
      w = width;
      h = height;
      res = img.width/cols;
      //res = 1;
      ry = img.height/rows;
      //ry = 1;
      counter = rows * cols -1;
      backup = new PImage(cols,rows,RGB);
      float n = map(cutoff, 0, 100, 0, 255);
      
      backup.loadPixels();
      canny.loadPixels();
      for (int j=0; j<rows; j++) {
        for (int i=0; i<cols; i++) {
          int p = PApplet.parseInt(i + j * img.width);
            if (p<img.pixels.length) {
              float max = 0;
              float r = red(img.pixels[p]);
              float g = green(img.pixels[p]);
              float bb = blue(img.pixels[p]);
              float br = brightness(img.pixels[p]);
              float h = (red(img.pixels[p]) + green(img.pixels[p]) + blue(img.pixels[p]) + brightness(img.pixels[p]))/4;
              float h1 = (r+g+bb)/3;
              if(max<r)max = r;
              if(max<g)max = g;
              if(max<bb)max = bb;
              //println(r);
              cell c = new cell(i+j*cols, img.width/cols*i, img.height/rows*j, i, j, h, this);
              //if(g<cutoff||r<cutoff||bb<cutoff){
              //if(g>cutoff||r>cutoff||bb>cutoff||br>cutoff){
              //if((abs(r-g)<cutoff||abs(r-bb)<cutoff||abs(g-bb)<cutoff)){
              if((abs(r-g)>cutoff||abs(r-bb)>cutoff||abs(g-bb)>cutoff)){
              //if(br>cutoff){
              //if (r<cutoff){
              //if(h1<cutoff){
              //if (r<max&&r>min){
              //if (h1<max&&h1>min){
                c.col = color(0);
                c.wall = true;
                c.parent = this;
                contours.add(c);
                contoursB.add(c);
                //backup.pixels[p] = color(0);
              }
              else {
                c.col = color(255);
                c.wall = false;
                backup.pixels[p] = color(255);
              }
              //c.col = color(255);
              //println(c.wall);
              cells.add(c);
              //img.pixels[p] = color(0,1);
              //backup.pixels[p] = color(h);
              canny.pixels[p] = color(255);
          }
        }
      }
      backup.updatePixels();
      canny.updatePixels();
    }else{
      println("check location");
    }
    
    
  };


  cell(int id, float x, float y, int xpos, int ypos, float h, cell c) {
    this.id = id;
    this.x = x;
    this.y = y;
    this.h = h;
    this.xpos = xpos;
    this.ypos = ypos;
    res = c.res;
    ry = c.ry;
    cols = c.cols;
    rows = c.rows;
    //for(int i=0;i<4;i++){
    //  wallFlags.add(true);
    //}
    //vertices[0] = null;
    //vertices[1] = new PVector(x,y+ry/2,x+res/2,y+ry);
    //vertices[2] = new PVector(x+res/2,y,x+res/2,y);
    //vertices[3] = new PVector(x,y+ry/2,x+res,y+ry/2);
    //vertices[4] = new PVector(x+res/2,y,x+res/2,y+ry/2);
    //vertices[5] = new PVector(x,y+ry/2,x+res/2,y);
    //vertices[6] = new PVector(x+res/2,y,x+res/2,y+ry);
    //vertices[7] = new PVector(x,y+ry/2,x+res/2,y);
    //vertices[8] = new PVector(x,y+ry/2,x+res/2,y);
    //vertices[9] = new PVector(x+res/2,y,x+res/2,y+ry);
    //vertices[10] = new PVector(x+res/2,y+ry/2,x+res/2,y);
    //vertices[11] = new PVector(x+res/2,y,x+res,y+ry/2);
    //vertices[12] = new PVector(x,y+ry/2,x+res,y+ry/2);
    //vertices[13] = new PVector(x+res/2,y,x+res,y+ry/2);
    //vertices[14] = new PVector(x,y+ry/2,x+res/2,y+ry/2);
    //vertices[15] = null;
  };
  
  public void getContour4(){
    int kn = pixelThresh;
    boolean k1 = false;
    if(!update&&canny!=null){
      canny.loadPixels();
    for(int i=0;i<contours.size();i++){
      cell c1 = contours.get(i);
      
        for(int j=(int)c1.x+1;j<(int)c1.x+10000;j++){
          
          if(j+c1.y*img.width>0&&j+c1.y*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(j+c1.y*img.width));
            //println(abs(red(img.pixels[c2.id])-red(img.pixels[c1.id])),red(img.pixels[c1.id]),red(img.pixels[c2.id]));
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.rcount ++;
          }else break;
        }
        
        for(int j=(int)c1.x-1;j>(int)c1.x-10000;j--){
          if(j+c1.y*img.width>0&&j+c1.y*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(j+c1.y*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.lcount ++;
          }else break;
        }
        
        for(int j=(int)c1.y+1;j<(int)c1.y+10000;j++){
          if(c1.x+j*img.width>0&&c1.x+j*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(c1.x+j*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.ucount ++;
          }else break;
        }
        
        for(int j=(int)c1.y-1;j>(int)c1.y-10000;j--){
          if(c1.x+j*img.width>0&&c1.x+j*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(c1.x+j*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.dcount ++;
        }else break;
      }
      c1.myMax = (c1.ucount+c1.lcount+c1.dcount+c1.rcount);
      c1.vmax = abs(c1.ucount-c1.dcount);
      c1.hmax = abs(c1.lcount-c1.rcount);
      c1.avmax = abs(c1.ucount+c1.dcount)/2;
      c1.ahmax = abs(c1.lcount+c1.rcount)/2;
      //println("m",Mode);
      c1.Mode = Mode;
      c1.getNeighbours3(canny,cells);
    }
    
    int col = color(0);
    
    if(Mode!=4)
    for(int j=0;j<contours.size();j++){
        
        cell c1 = contours.get(j);
        int count = 0;
        
        for(int i=0;i<c1.neighbours2.size();i++){
          
          cell c = c1.neighbours2.get(i);
          
          if(c!=c1&&c!=null&&canny.pixels[c.id] == col)count++;
        }
        if(count==0){
          canny.pixels[c1.id] = color(255);
      }
    }
    canny.updatePixels();
    
      update = true;
    }
  };
  
  public void getContour3(){
    int kn = pixelThresh;
    boolean k1 = false;
    if(!update&&canny!=null){
      canny.loadPixels();
    for(int i=0;i<contours.size();i++){
      cell c1 = contours.get(i);
      
        for(int j=(int)c1.x+1;j<(int)c1.x+10000;j++){
          
          if(j+c1.y*img.width>0&&j+c1.y*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(j+c1.y*img.width));
            //println(abs(red(img.pixels[c2.id])-red(img.pixels[c1.id])),red(img.pixels[c1.id]),red(img.pixels[c2.id]));
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.rcount ++;
          }else break;
        }
        
        for(int j=(int)c1.x-1;j>(int)c1.x-10000;j--){
          if(j+c1.y*img.width>0&&j+c1.y*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(j+c1.y*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.lcount ++;
          }else break;
        }
        
        for(int j=(int)c1.y+1;j<(int)c1.y+10000;j++){
          if(c1.x+j*img.width>0&&c1.x+j*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(c1.x+j*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.ucount ++;
          }else break;
        }
        
        for(int j=(int)c1.y-1;j>(int)c1.y-10000;j--){
          if(c1.x+j*img.width>0&&c1.x+j*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(c1.x+j*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.dcount ++;
        }else break;
      }
      c1.myMax = (c1.ucount+c1.lcount+c1.dcount+c1.rcount);
      c1.vmax = abs(c1.ucount-c1.dcount);
      c1.hmax = abs(c1.lcount-c1.rcount);
      c1.avmax = abs(c1.ucount+c1.dcount)/2;
      c1.ahmax = abs(c1.lcount+c1.rcount)/2;
      //println("m",Mode);
      c1.Mode = Mode;
      c1.getNeighbours2(canny,cells);
    }
    
    int col = color(0);
    
    if(Mode!=4)
    for(int j=0;j<contours.size();j++){
        
        cell c1 = contours.get(j);
        int count = 0;
        
        for(int i=0;i<c1.neighbours2.size();i++){
          
          cell c = c1.neighbours2.get(i);
          
          if(c!=c1&&c!=null&&canny.pixels[c.id] == col)count++;
        }
        if(count==0){
          canny.pixels[c1.id] = color(255);
      }
    }
    //if(Mode==4)
    //for(int j=0;j<contours.size();j++){
        
    //    cell c1 = contours.get(j);
    //    int count = 0;
        
    //    if(red(canny.pixels[c1.id])==0){
    //      println("ccheck " +c1.id);
    //      c1.col = color(0);
    //        println(c1.id);
    //        canny.pixels[c1.id] = color(0);
    //        unsortedEdges.add(c1);
    //      for(int i=0;i<c1.neighbours2.size();i++){
            
    //        cell c = c1.neighbours2.get(i);
            
    //        if(c!=c1&&c!=null&&canny.pixels[c1.id] != canny.pixels[c.id])count++;
    //      }
    //    //  if(count==2){
    //    //    c1.col = color(0);
    //    //    println(c1.id);
    //    //    canny.pixels[c1.id] = color(0);
    //    //    unsortedEdges.add(c1);
    //    //}
    //  }
    //}
    println("gc3");
    canny.updatePixels();
    float d = sqrt(2);
      counter = unsortedEdges.size()-1;
      while(counter>0){
        cell c = unsortedEdges.get(counter);
        
        boolean k = false;
        if(sortedEdges.size()>0){
          for(int i=0;i<c.neighbours2.size();i++){
            cell c1 = c.neighbours2.get(i);
            
            if(c1!=null&&(c1.edgeId>-1&&sortedEdges.contains(c))){
              c.edgeId = c1.edgeId;
              sortedEdges.add(c);
              edges.get(c1.edgeId).add(c);
              k = true;
              
              break;
            }
            if(!k&&!sortedEdges.contains(c)){
              //println(c.id);
              sortedEdges.add(c);
              ArrayList<cell> newEdge = new ArrayList<cell>();
              c.edgeId = edges.size();
              newEdge.add(c);
              edges.add(newEdge);
              
              
            }
          }
          counter--;
        }else{
          sortedEdges.add(c);
          ArrayList<cell> newEdge = new ArrayList<cell>();
          c.edgeId = edges.size();
          newEdge.add(c);
          edges.add(newEdge);
          
        }
      }
      for(int i=edges.size()-1;i>-1;i--){
        if(edges.get(i).size()>2){
          
        }else{
           edges.remove(i); 
        }
      }
      println("Edges", edges.size());
      println("s Edges", sortedEdges.size());
      println("u Edges", unsortedEdges.size());
      
      
      update = true;
    }
  };
  
  public void getContour2(){
    int kn = pixelThresh;
    boolean k1 = false;
    if(!update&&canny!=null){
      canny.loadPixels();
    for(int i=0;i<contours.size();i++){
      cell c1 = contours.get(i);
      
        for(int j=(int)c1.x+1;j<(int)c1.x+10000;j++){
          
          if(j+c1.y*img.width>0&&j+c1.y*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(j+c1.y*img.width));
            //println(abs(red(img.pixels[c2.id])-red(img.pixels[c1.id])),red(img.pixels[c1.id]),red(img.pixels[c2.id]));
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.rcount ++;
          }else break;
        }
        
        for(int j=(int)c1.x-1;j>(int)c1.x-10000;j--){
          if(j+c1.y*img.width>0&&j+c1.y*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(j+c1.y*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.lcount ++;
          }else break;
        }
        
        for(int j=(int)c1.y+1;j<(int)c1.y+10000;j++){
          if(c1.x+j*img.width>0&&c1.x+j*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(c1.x+j*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.ucount ++;
          }else break;
        }
        
        for(int j=(int)c1.y-1;j>(int)c1.y-10000;j--){
          if(c1.x+j*img.width>0&&c1.x+j*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(c1.x+j*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.dcount ++;
        }else break;
      }
      c1.myMax = (c1.ucount+c1.lcount+c1.dcount+c1.rcount);
      c1.vmax = abs(c1.ucount-c1.dcount);
      c1.hmax = abs(c1.lcount-c1.rcount);
      c1.avmax = abs(c1.ucount+c1.dcount)/2;
      c1.ahmax = abs(c1.lcount+c1.rcount)/2;
      //println("m",Mode);
      c1.Mode = Mode;
      c1.getNeighbours2(canny,cells);
    }
    
    int col = color(0);
    println("gc2");
    if(Mode==4)
    for(int j=0;j<contours.size();j++){
        
        cell c1 = contours.get(j);
        int count = 0;
        //println(c1.id);
        if(red(canny.pixels[c1.id])==255){
          
          for(int i=0;i<c1.neighbours2.size();i++){
            
            cell c = c1.neighbours2.get(i);
            
            if(c!=c1&&c!=null&&c1.col != c.col)count++;
          }
          if(count==2){
            c1.col = color(0);
            
            canny.pixels[c1.id] = color(0);
            unsortedEdges.add(c1);
        }
      }
    }
    canny.updatePixels();
    float d = sqrt(2);
      for(int i=0;i<unsortedEdges.size();i++){
          
        cell c = unsortedEdges.get(i);
        boolean k = false;
          
          if(sortedEdges.size()>0){
            //for(int j=0;j<sortedEdges.size();j++){
            //  cell c1 = sortedEdges.get(j);
            //  float dx = abs(c.x-c1.x);
            //  float dy = abs(c.y-c1.y);
              
            //  //if(dx<5)println(dx,dy);
            //  if(dx<=d&&dy<=d){
            //    c.edgeId = c1.edgeId;
            //    sortedEdges.add(c);
            //    edges.get(c1.edgeId).add(c);
            //    k = true;
            //    break;
            //  }
            //}
            
            for(int j=0;j<c.neighbours2.size();j++){
              cell c1 = c.neighbours2.get(j);
              
              if(c1!=null&&(c1.edgeId>-1||sortedEdges.contains(c1))){
                c.edgeId = c1.edgeId;
                sortedEdges.add(c);
                edges.get(c1.edgeId).add(c);
                k = true;
                break;
              }
            }
            if(!k){
              sortedEdges.add(c);
              ArrayList<cell> newEdge = new ArrayList<cell>();
              c.edgeId = edges.size();
              newEdge.add(c);
              edges.add(newEdge);
            }
          }else{
            sortedEdges.add(c);
            ArrayList<cell> newEdge = new ArrayList<cell>();
            c.edgeId = edges.size();
            newEdge.add(c);
            edges.add(newEdge);
          }
      }
      println("Edges", edges.size());
      println("s Edges", sortedEdges.size());
      println("u Edges", unsortedEdges.size());
      
      
      update = true;
    }
  };
  
  public void getContour(){
    int kn = pixelThresh;
    boolean k1 = false;
    if(!update&&canny!=null){
      canny.loadPixels();
    for(int i=0;i<contours.size();i++){
      cell c1 = contours.get(i);
      
        for(int j=(int)c1.x+1;j<(int)c1.x+10000;j++){
          
          if(j+c1.y*img.width>0&&j+c1.y*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(j+c1.y*img.width));
            //println(abs(red(img.pixels[c2.id])-red(img.pixels[c1.id])),red(img.pixels[c1.id]),red(img.pixels[c2.id]));
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.rcount ++;
          }else break;
        }
        
        for(int j=(int)c1.x-1;j>(int)c1.x-10000;j--){
          if(j+c1.y*img.width>0&&j+c1.y*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(j+c1.y*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.lcount ++;
          }else break;
        }
        
        for(int j=(int)c1.y+1;j<(int)c1.y+10000;j++){
          if(c1.x+j*img.width>0&&c1.x+j*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(c1.x+j*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.ucount ++;
          }else break;
        }
        
        for(int j=(int)c1.y-1;j>(int)c1.y-10000;j--){
          if(c1.x+j*img.width>0&&c1.x+j*img.width<img.pixels.length){
            cell c2 = cells.get(PApplet.parseInt(c1.x+j*img.width));
            
            if(!c2.wall||abs(red(img.pixels[c2.id])-red(img.pixels[c1.id]))>kn
                ||abs(green(img.pixels[c2.id])-green(img.pixels[c1.id]))>kn
                ||abs(blue(img.pixels[c2.id])-blue(img.pixels[c1.id]))>kn)break;
            c1.dcount ++;
        }else break;
      }
      c1.myMax = (c1.ucount+c1.lcount+c1.dcount+c1.rcount);
      c1.vmax = abs(c1.ucount-c1.dcount);
      c1.hmax = abs(c1.lcount-c1.rcount);
      c1.avmax = abs(c1.ucount+c1.dcount)/2;
      c1.ahmax = abs(c1.lcount+c1.rcount)/2;
      //println("m",Mode);
      c1.Mode = Mode;
      c1.getNeighbours2(canny,cells);
    }
    
    int col = color(0);
    
    if(Mode!=4)
    for(int j=0;j<contours.size();j++){
        
        cell c1 = contours.get(j);
        int count = 0;
        
        for(int i=0;i<c1.neighbours2.size();i++){
          
          cell c = c1.neighbours2.get(i);
          
          if(c!=c1&&c!=null&&canny.pixels[c.id] == col)count++;
        }
        if(count==0){
          canny.pixels[c1.id] = color(255);
      }
    }
    canny.updatePixels();
    
      update = true;
    }
  };
  
  public void imgUpdate(PImage loc) {
    println("m",Mode);
    this.img = (loc);
    //this.backup = loadImage(loc);
    if(img!=null){
      canny = new PImage(img.width,img.height,ARGB);
      cols = img.width;
      rows = img.height;
      //cols = img.width;
      //rows = img.height;
      rows_ = PApplet.parseFloat(rows);
      cols_ = PApplet.parseFloat(cols);
      cells = new ArrayList<cell>();
      w = width;
      h = height;
      res = img.width/cols;
      //res = 1;
      ry = img.height/rows;
      //ry = 1;
      counter = rows * cols -1;
      backup = new PImage(cols,rows,RGB);
      float n = map(cutoff, 0, 100, 0, 255);
      
      backup.loadPixels();
      canny.loadPixels();
      for (int j=0; j<rows; j++) {
        for (int i=0; i<cols; i++) {
          int p = PApplet.parseInt(i + j * img.width);
            if (p<img.pixels.length) {
              float max = 0;
              float r = red(img.pixels[p]);
              float g = green(img.pixels[p]);
              float bb = blue(img.pixels[p]);
              float br = brightness(img.pixels[p]);
              float h = (red(img.pixels[p]) + green(img.pixels[p]) + blue(img.pixels[p]) + brightness(img.pixels[p]))/4;
              float h1 = (r+g+bb)/3;
              if(max<r)max = r;
              if(max<g)max = g;
              if(max<bb)max = bb;
              //println(r);
              cell c = new cell(i+j*cols, img.width/cols*i, img.height/rows*j, i, j, h, this);
              //if(g<cutoff||r<cutoff||bb<cutoff){
              //if(g>cutoff||r>cutoff||bb>cutoff||br>cutoff){
              //if((abs(r-g)>cutoff||abs(r-bb)>cutoff||abs(g-bb)>cutoff)){
              //if((abs(r-g)>cutoff||abs(r-bb)>cutoff||abs(g-bb)>cutoff)||h1<pixelThresh1||(r<pixelThresh1&&g<pixelThresh1&&bb<pixelThresh1)){
              //if((abs(r-g)<cutoff||abs(r-bb)<cutoff||abs(g-bb)<cutoff)){
              if(br<cutoff){
              //if(r<cutoff||g<cutoff||bb<cutoff){
              //if(br>cutoff){
              //if(r>cutoff||g>cutoff||bb>cutoff){
              //if(h1>30&&h1<150){
              //if(r<max&&r>min){
              //if(h1<max&&h1>min){
                c.col = color(0);
                c.wall = true;
                c.parent = this;
                contours.add(c);
                contoursB.add(c);
                //backup.pixels[p] = color(0);
              }
              else {
                c.col = color(255);
                c.wall = false;
                backup.pixels[p] = color(255);
              }
              //c.col = color(255);
              //println(c.wall);
              cells.add(c);
              //img.pixels[p] = color(0,1);
              //backup.pixels[p] = color(h);
              canny.pixels[p] = color(255);
          }
        }
      }
      backup.updatePixels();
      canny.updatePixels();
    }else{
      println("check location");
    }
    println("Contours",contours.size());
  };
  
  
  public void getNeighbours() {

    for (int k=0; k<cells.size(); k++) {
      cell c = cells.get(k);
      for (int i=c.xpos-1; i<=c.xpos+1; i++) {
        for (int j=c.ypos-1; j<=c.ypos+1; j++) {
          int p = i+j * cols;
          if (j>=0&&j<rows&&i>=0&&i<cols&&p<cells.size()) {
            cell c2 = cells.get(p);
            if (c2!=c) {

              if ((c.xpos==c2.xpos||c.ypos==c2.ypos)) {
                if (!c.neighbours.contains(c2))c.neighbours.add(c2);
              }
              if (!c.neighbours2.contains(c2))c.neighbours2.add(c2);
            }
          } else {
            c.neighbours2.add(null);
            if ((c.xpos==i||c.ypos==j))c.neighbours.add(null);
          }
        }
      }
    }
  };
  
  public void getNeighbours2(PImage canny,ArrayList<cell> cells) {
    boolean k = false;
    boolean k1 = false;
    boolean k2 = false;
    boolean k3 = false;
    boolean k4 = false;
    boolean k5 = false;
    //println(0);
    int n = 10;
    
      for (int i=xpos-1; i<=xpos+1; i++) {
        for (int j=ypos-1; j<=ypos+1; j++) {
          int p = i+j * cols;
          if (j>=0&&j<rows&&i>=0&&i<cols&&p<cells.size()) {
            cell c = cells.get(p);
            if (c!=this) {
              if(Mode ==0){
                if(ypos==j){
                  if(c.ahmax==ahmax)k = true;
                  }
                if(xpos==i){
                  if(c.avmax==avmax)k1 = true;
                }
              }
              if(Mode==1){
                if(ypos==j){
                   if(c.hmax==hmax)k1 = true;
                  }
                if(xpos==i){
                  if(c.vmax==vmax)k1 = true;
                }
                
              }
              
              if(Mode ==2){
                if(ypos==j){
                  if(c.lcount<lcount)k2 = true;
                  if(c.rcount>rcount)k3 = true;
                  }
                if(xpos==i){
                  if(c.ucount<ucount)k4 = true;
                  if(c.dcount<dcount)k5 = true;
                }
              }
              if(Mode ==3){
                if(ypos==j){
                  if(c.lcount<lcount)k2 = true;
                  if(c.rcount>rcount)k3 = true;
                  }
                if(xpos==i){
                  if(c.ucount>ucount)k4 = true;
                  if(c.dcount<dcount)k5 = true;
                }
              }
              if(Mode ==4){
                if(ypos==j){
                  if(c.lcount<lcount)k2 = true;
                  if(c.rcount<rcount)k3 = true;
                  }
                if(xpos==i){
                  if(c.ucount<ucount)k4 = true;
                  if(c.dcount<dcount)k5 = true;
                }
              }
              
              if(Mode==5){
                if(ypos==j){
                   if(c.lcount<rcount)k1 = true;
                   if(c.hmax!=hmax)k2 = true;
                  }
                if(xpos==i){
                  if(c.dcount<ucount)k3 = true;
                  if(c.vmax!=vmax)k4 = true;
                }
              }
              
              if(Mode==6){
                if(ypos==j){
                   if(c.lcount<rcount)k1 = true;
                   if(c.ahmax==ahmax)k2 = true;
                  }
                if(xpos==i){
                  if(c.dcount<ucount)k3 = true;
                  if(c.avmax==avmax)k4 = true;
                }
              }
              if ((xpos==c.xpos||ypos==c.ypos)) {
                if (!neighbours.contains(c)){
                  neighbours.add(c);
                }
              }
              if (!update&&!neighbours2.contains(c))neighbours2.add(c);
            }
          } else {
            neighbours2.add(null);
            if ((xpos==i||ypos==j))neighbours.add(null);
          }
        }
      }
      
      if(Mode==0&&(!k||!k1)){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==1&&((k1))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==2&&((!k2||!k3)||(!k4||!k5))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==3&&((!k2||!k3)||(!k4||!k5))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==4&&((!k2||!k3)||(!k4||!k5))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==5&&((!k1||!k2)||((!k3||!k4)))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==6&&((!k1&&k2)||(!k3&&k4))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
  };
  
  public void getNeighbours3(PImage canny,ArrayList<cell> cells) {
    boolean k = false;
    boolean k1 = false;
    boolean k2 = false;
    boolean k3 = false;
    boolean k4 = false;
    boolean k5 = false;
    //println(0);
    int n = 10;
    //if((avmax<ahmax/10||ahmax<avmax/10))Mode = 5;
      for (int i=xpos-1; i<=xpos+1; i++) {
        for (int j=ypos-1; j<=ypos+1; j++) {
          int p = i+j * cols;
          if (j>=0&&j<rows&&i>=0&&i<cols&&p<cells.size()) {
            cell c = cells.get(p);
            if (c!=this) {
              if(Mode ==0){
                if(ypos==j){
                  if(c.ahmax==ahmax)k = true;
                  }
                if(xpos==i){
                  if(c.avmax==avmax)k1 = true;
                }
              }
              if(Mode==1){
                if(ypos==j){
                   if(c.hmax==hmax)k1 = true;
                  }
                if(xpos==i){
                  if(c.vmax==vmax)k1 = true;
                }
                
              }
              
              if(Mode ==2){
                if(ypos==j){
                  if(c.lcount<lcount)k2 = true;
                  if(c.rcount>rcount)k3 = true;
                  }
                if(xpos==i){
                  if(c.ucount<ucount)k4 = true;
                  if(c.dcount<dcount)k5 = true;
                }
              }
              if(Mode ==3){
                if(ypos==j){
                  if(c.lcount<lcount)k2 = true;
                  if(c.rcount>rcount)k3 = true;
                  }
                if(xpos==i){
                  if(c.ucount>ucount)k4 = true;
                  if(c.dcount<dcount)k5 = true;
                }
              }
              if(Mode ==4){
                if(ypos==j){
                  if(c.lcount<lcount)k2 = true;
                  if(c.rcount<rcount)k3 = true;
                  }
                if(xpos==i){
                  if(c.ucount<ucount)k4 = true;
                  if(c.dcount<dcount)k5 = true;
                }
              }
              
              if(Mode==5){
                if(ypos==j){
                   if(c.lcount<rcount)k1 = true;
                   if(c.hmax!=hmax)k2 = true;
                  }
                if(xpos==i){
                  if(c.dcount<ucount)k3 = true;
                  if(c.vmax!=vmax)k4 = true;
                }
              }
              
              if(Mode==6){
                if(ypos==j){
                   if(c.lcount<rcount)k1 = true;
                   if(c.ahmax==ahmax)k2 = true;
                  }
                if(xpos==i){
                  if(c.dcount<ucount)k3 = true;
                  if(c.avmax==avmax)k4 = true;
                }
              }
              if ((xpos==c.xpos||ypos==c.ypos)) {
                if (!neighbours.contains(c)){
                  neighbours.add(c);
                }
              }
              if (!update&&!neighbours2.contains(c))neighbours2.add(c);
            }
          } else {
            neighbours2.add(null);
            if ((xpos==i||ypos==j))neighbours.add(null);
          }
        }
      }
      
      if(Mode==0&&(!k||!k1)){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==1&&((k1))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==2&&((!k2||!k3)||(!k4||!k5))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==3&&((!k2||!k3)||(!k4||!k5))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==4&&((!k2||!k3)||(!k4||!k5))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==5&&((!k1||!k2)||((!k3||!k4)))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
      if(Mode==6&&((!k1&&k2)||(!k3&&k4))){
        canny.pixels[id] = color(0);
        parent.unsortedEdges.add(this);
      }
  };

  public boolean pos(){
    return mouseX>x&&mouseX<x+res&&mouseY>y&&mouseY<y+ry;
  };

  public void debug() {
    noStroke();
    
    fill(0);
    //text(neighbours.size(),x,y+ry/2);
    
    if (mouseX>=x&&mouseX<x+2&&mouseY>=y&&mouseY<y+2) {
      fill(0,0,255);
      rect(x,y,res,ry);
      for (int i=0; i<neighbours2.size(); i++) {
        cell c = neighbours2.get(i);
        fill(255, 0, 0, 100);
        if (c!=null) {
          fill(255, 0, 0);
          rect(c.x, c.y, res, ry);
        }
      }
    }
  };
  
  public void set(PImage img){
    
  };
  
  public void reset(){
    
  };
  
  public void superPixel(float thresh){
    pImage.loadPixels();
    img = pImage;
    float n = 255/thresh;
    for(int j=0;j<img.height;j++){
      for(int i=0;i<img.width;i++){
      
      //if(red(img.pixels[j])<200)img.pixels[j] = color(255,0,0);
      //if(color(img.pixels[j])==color(0))img.pixels[j] = color(255,0,0);
      int p = i + j * img.width;
      float max = 0;
      
      float r = red(img.pixels[p]);
      float g = green(img.pixels[p]);
      float b = blue(img.pixels[p]);
      
      //r = floor(r/n)*n;
      //g = floor(g/n)*n;
      //b = floor(b/n)*n;
      
      float a = sqrt(r*r+g*g+b*b);
      //float b1 = sqrt(i*i+j*j);
      float t1 = 0;
      float t2 = 0;
      float t3 = 0;
      if(a>0){
        //t1 = degrees(atan(r/g));
        //t2 = degrees(atan(r/b));
        //t1 = (atan2(g,r));
        //t2 = (atan2(b,r));
        //t3 = (atan2(b,g));
        float k = 1;
        
        t1 = map((atan2(g,r)),0,PI,0,255);
        t2 = map((atan2(r,b)),0,PI,0,255);
        t3 = map((atan2(b,g)),0,PI,0,255);
        //t1 = map((atan2(g,r))*a,0,PI*(255*k),0,255);
        //t2 = map((atan2(r,b))*a,0,PI*(255*k),0,255);
        //t3 = map((atan2(b,g))*a,0,PI*(255*k),0,255);
        //t1 = map((atan2(g,r)),0,PI*(255*k),0,255);
        //t2 = map((atan2(b,r)),0,PI*(255*k),0,255);
        //t3 = map((atan2(g,b)),0,PI*(255*k),0,255);
        //t1 = map((atan2(g,r)),0,PI,0,a);
        //t2 = map((atan2(b,r)),0,PI,0,a);
        //t3 = map((atan2(g,b)),0,PI,0,a);
        //t1 = map((atan2(g,r)),0,PI,0,sqrt(g*g+r*r));
        //t2 = map((atan2(b,r)),0,PI,0,sqrt(b*b+r*r));
        //t3 = map((atan2(g,b)),0,PI,0,sqrt(g*g+b*b));
        //if(t1>255)t1 = 255;
        //if(t2>255)t2 = 255;
        //if(t3>255)t3 = 255;
        //if(t1<0)t1 = 0;
        //if(t2<0)t2 = 0;
        //if(t3<0)t3 = 0;
        
        
      }
      ////println(r,t1,g,t2,b,t3);
      //println(t1);
      img.pixels[p] = color(t1,t2,t3);
      //img.pixels[p] = color(a-t1,a-t2,a-t3);
      //img.pixels[p] = color(floor(color(img.pixels[p])/n)*n);
      float []col = {r,g,b};
      
      max = max(col);
      
      //cell c = new cell(p, res*i, ry*j, i, j, h, this);
      //c.theta1 = t1;
      //c.theta2 = t2;
      //c.theta3 = t3;
      //c.mag = a;
      //c.col = color(r,g,b,a);
      //if(superPixels.size()==0){
      //  ArrayList<cell> sPixel = new ArrayList<cell>();
      //  superPixels.add(sPixel);
      //}else{
        
      //}
    }}
    pImage.updatePixels();
  };
  
  public void segment(int n){
    img.loadPixels();
    for(int i=0;i<img.pixels.length;i++){
      
      //if(red(img.pixels[j])<200)img.pixels[j] = color(255,0,0);
      //if(color(img.pixels[j])==color(0))img.pixels[j] = color(255,0,0);
      
      float max = 0;
      
      float r = red(img.pixels[i]);
      float g = green(img.pixels[i]);
      float b = blue(img.pixels[i]);
      
      float []col = {r,g,b};
      
      max = max(col);
      if(superPixels.size()==0){
        
      }else{
        
      }
    }
    img.updatePixels();
  };
  
};
public Object getFromClipboard (DataFlavor flavor) {

  Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard(); 
  Transferable contents = null;
  try{
   contents = clipboard.getContents(null);
  }catch(IllegalStateException e){
    
  }
  
  Object object = null;

  if (contents != null && contents.isDataFlavorSupported(flavor))
  {
    try
    {
      object = contents.getTransferData(flavor);
      //println("Clipboard.getFromClipboard() >> Object transferred from clipboard.");
    }

    catch (UnsupportedFlavorException e1) // Unlikely but we must catch it
    {
      //println("Clipboard.getFromClipboard() >> Unsupported flavor: " + e1);
      //~  e1.printStackTrace();
    }

    catch (java.io.IOException e2)
    {
      //println("Clipboard.getFromClipboard() >> Unavailable data: " + e2);
      //~  e2.printStackTrace();
    }
  }

  return object;
}

public String getTextFromClipboard () {
  String text = (String) getFromClipboard(DataFlavor.stringFlavor);
 
  if (text==null) 
    return "";
 
  return text;
}
class Data{
  
  HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
  
  String[] labels = {"0","1","2","3","4","5","6","7","8","9",
                     "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",
                     "a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
  //String[] labels = {"0","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z",
  //                   "A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};       
  String []l;
  String location;
  byte[] imageB,trainingLabels,testingLabels;
  float[] imageB_,trainingLabels_,testingLabels_;
  byte[][] temp;
  float[] temp2;
  PImage image,input;
  PImage [] images,trainingData,testingData;
  boolean debug,counter,counted;
  fileOutput outPut;
  ArrayList<float []> inputs,outputs;
  int output;
  Card card;
  ArrayList<String> fileNames = new ArrayList<String>();
  ArrayList<vectorText> textFiles = new ArrayList<vectorText>();
  vectorText[] textFile;
  ArrayList<audioData> audioFiles = new ArrayList<audioData>();
  audioData[] audioFile;
  HashMap<String, ArrayList<Integer>> extensions = new HashMap<String, ArrayList<Integer>>();
  
  Data(){
  };
  
  Data(String location){
    this.location = location;
    //outPut = new fileOutput(location);
  };

  Data(audioData audio){
    //location
    //outPut = new fileOutput(location);
  };
  
  Data(byte[] image){
    
  };

  public void listExt() {

    String []names = listNames(location);

    if(names!=null&&!counted){
      for(int i=0;i<names.length;i++){

        File f = new File(names[i]);

        String type = getFileExtension(f);
        String[] m = match(names[i], "ubyte");

        if(m==null){
          if(!extensions.containsKey(type)){
            ArrayList<Integer> n = new ArrayList<Integer>();
            n.add(i);
            extensions.put(type,n);
            fileNames.add(names[i]);
          }else{
            extensions.get(type).add(i);
            fileNames.add(names[i]);
        }}
        else{
          if(!extensions.containsKey("ubyte")){
            ArrayList<Integer> n = new ArrayList<Integer>();
            n.add(i);
            extensions.put("ubyte",n);
            fileNames.add(names[i]);
          }else{
            extensions.get(type).add(i);
            fileNames.add(names[i]);
        }}}
    counted = true;
    }
  };

  public void sortData(){

      for(int i=0;i<fileNames.size();i++){
        String s = fileNames.get(i);

        switch(s){
          
          case "txt" :
          case "doc" :
          case "DOC" :
          case "jpg" :
          case "JPG" :
          case "jpeg":
          case "JPEG":
          case "bmp" :
          case "BMP" :
          case "png" :
          case "PNG" :
          case "gif" :
          case "GIF" :
          case "mp3" :
          case "MP3" :
          case "wav" :
          case "ubyte" :

        }
      }
  };

  public void loadAudioData(audioData data){


  };

  public void loadAudioData(audioData [] data){


  };

  public void loadAudioData(ArrayList<audioData> data){


  };

  public void loadTextData(vectorText text){


  };

  public void loadTextData(vectorText[] text){


  };

  public void loadTrainingData(byte[] Image,int size){
    int k = 28;
    
    int[][]temp = new int[k][k];
    
    
    trainingData = new PImage[size];
    inputs = new ArrayList<float[]>();
    
    for(int i=0;i<size;i++){
      
      image = createImage(k,k,RGB);
      image.loadPixels();
      inputs.add(new float[k*k]);
      float[]temp2 = new float[k*k];
      for(int j=0;j<k*k;j++){
        image.pixels[j] = Image[j+16+k*k*i];
      }
      for(int j=0;j<k;j++){
        for(int h=0;h<k;h++){
          
          int p = h + j * k;
          temp[h][j] = image.pixels[p];;
          
      }}
      
      for(int j=0;j<k;j++){
        for(int h=0;h<k;h++){
          
          int p = h + j * k;
          image.pixels[p] =  - (int)red(temp[j][h]);
           if(red(image.pixels[p])>50)image.pixels[p] = (int)map(red(image.pixels[p])+20,0,255,-1,1); 
           else image.pixels[p] = -1;
          temp2[p] = 128 * (1 - (red(image.pixels[p])));
          image.pixels[p] = (int)red(temp[j][h]);
          
      }}
      
      image.updatePixels();
      inputs.set(i,temp2);
      trainingData[i] = image;
    }
  };
  
  public void loadTrainingData(byte[] Image,int size,int res){
    int k = res;
    
    int[][]temp = new int[k][k];
    
    trainingData = new PImage[size];
    inputs = new ArrayList<float[]>();
    
    for(int i=0;i<size;i++){
      
      image = createImage(k,k,RGB);
      image.loadPixels();
      inputs.add(new float[k*k]);
      float[]temp2 = new float[k*k];
      for(int j=0;j<k*k;j++){
        image.pixels[j] = Image[j+16+k*k*i];
      }
      for(int j=0;j<k;j++){
        for(int h=0;h<k;h++){
          
          int p = h + j * k;
          temp[h][j] = image.pixels[p];;
          
      }}
      
      for(int j=0;j<k;j++){
        for(int h=0;h<k;h++){
          
          int p = h + j * k;
          image.pixels[p] =  - (int)red(temp[j][h]);
           if(red(image.pixels[p])>50)image.pixels[p] = (int)map(red(image.pixels[p])+20,0,255,-1,1); 
           else image.pixels[p] = -1;
          temp2[p] = 128 * (1 - (red(image.pixels[p])));
          image.pixels[p] = (temp[j][h]);
          
      }}
      
      image.updatePixels();
      inputs.set(i,temp2);
      trainingData[i] = image;
    }
  };
  
  
  public void loadTestingData(byte[] Image,int size){
    int k = 28;
    
    testingData = new PImage[size];
    inputs = new ArrayList<float[]>();
    
    int [][] temp = new int[k][k];
    
    for(int i=0;i<size;i++){
      image = createImage(k,k,RGB);
      image.loadPixels();
      inputs.add(new float[k*k]);
      float[]temp2 = new float[k*k];
      
      for(int j=0;j<k*k;j++){
        image.pixels[j] = Image[j+16+k*k*i];
      }
      for(int j=0;j<k;j++){
        for(int h=0;h<k;h++){
          
          int p = h + j * k;
          temp[h][j] = image.pixels[p];
          
      }}
      
      for(int j=0;j<k;j++){
        for(int h=0;h<k;h++){
          
          int p = h + j * k;
          image.pixels[p] =  - (int)red(temp[j][h]);
           if(red(image.pixels[p])>50)image.pixels[p] = (int)map(red(image.pixels[p])+20,0,255,-1,1); 
           else image.pixels[p] = -1;
          temp2[p] = 128 * (1 - (red(image.pixels[p])));
          
      }}
      image.updatePixels();
      inputs.set(i,temp2);
      testingData[i] = image;
    }
  };
  
  public void loadTestingData(byte[] Image,int size,int res){
    int k = res;
    
    testingData = new PImage[size];
    inputs = new ArrayList<float[]>();
    
    int [][] temp = new int[k][k];
    
    for(int i=0;i<size;i++){
      image = createImage(k,k,RGB);
      image.loadPixels();
      inputs.add(new float[k*k]);
      float[]temp2 = new float[k*k];
      
      for(int j=0;j<k*k;j++){
        image.pixels[j] = Image[j+16+k*k*i];
      }
      for(int j=0;j<k;j++){
        for(int h=0;h<k;h++){
          
          int p = h + j * k;
          temp[h][j] = image.pixels[p];
          
      }}
      
      for(int j=0;j<k;j++){
        for(int h=0;h<k;h++){
          
          int p = h + j * k;
          image.pixels[p] =  - (int)red(temp[j][h]);
           if(red(image.pixels[p])>50)image.pixels[p] = (int)map(red(image.pixels[p])+20,0,255,-1,1); 
           else image.pixels[p] = -1;
          temp2[p] = 128 * (1 - (red(image.pixels[p])));
          
      }}
      image.updatePixels();
      inputs.set(i,temp2);
      testingData[i] = image;
    }
  };
  
  public void loadTestingLabels(byte [] Image){
    
    testingLabels = new byte[Image.length - 8];
    testingLabels_ = new float[Image.length - 8];
      
      for(int j=8;j<Image.length;j++){
        testingLabels[j-8] = Image[j];
      }
  };
  
  public void loadTrainingLabels(byte [] Image){
    
    trainingLabels = new byte[Image.length - 8];
    trainingLabels_ = new float[Image.length - 8];
    
      for(int j=8;j<Image.length;j++){
        trainingLabels[j-8] = Image[j];
      }
  };
  
  public PImage threshold(PImage image){
  
    PImage tempCard = createImage(image.width,image.height,RGB);
    
    for (int i = 0; i < 784; i++) {
        if(red(image.pixels[i])<50)tempCard.pixels[i] = 10;
         if(red(image.pixels[i])>50)tempCard.pixels[i] = (int)map(red(image.pixels[i])+20,0,255,1,-1); 
         else tempCard.pixels[i] = 1;
         //map(red(image.pixels[i]),0,255,-1,1); 
      }
    return tempCard;
  };
  
};
class audioData{
  
  PApplet app;
  
  Amplitude amp;
  SoundFile audioFile = null;
  
  FFT fft;
  AudioIn in;
  processing.sound.Sound  s;
  fileInput inputFile,inputFolder;
  fileOutput output;
  String fileLocation,folderLocation;
  int slices = 1,bands,frame,frame2,frames=0,count,slice;
  String []menuLabels = {"Open File","Open Folder","Save","Restore tabs"};
  String []rLabels = {"Run","Run All"};
  Menu menu,run;
  tab sliders,workFlow,spectrumImg;

  float[] spectrum;
  ArrayList<PVector> audio = new ArrayList<PVector>();
  ArrayList<ArrayList<PVector>> audio2 = new ArrayList<ArrayList<PVector>>();
  ArrayList<ArrayList<PVector>> visualiser = new ArrayList<ArrayList<PVector>>();
  ArrayList<PImage> audioSlices = new ArrayList<PImage>();
  
  PImage specImg;
  boolean constructImage,Debug,analysed,sliced;
  public boolean update,toggle;

  audioData(PApplet app){
    this.app = app;
    initTabs();
  };

  audioData(PApplet app,int bands){
    this.app = app;
    this.bands = bands;
    initTabs();
  };

  audioData(PApplet app,int bands,String file){
    
    spectrum = new float[bands];
    this.bands = bands;
    this.app = app;
    s = new processing.sound.Sound (app);
    amp = new Amplitude(app);
    audioFile = new SoundFile(app,file);
    // Create an Input stream which is routed into the Amplitude analyzer
    fft = new FFT(app, bands);
    
    //amp.input(audioFile);
    fft.input(audioFile);
    audioFile.rate(1.5f);
    initTabs();
  };
  
  audioData(PApplet app,int bands,int Slices,String file){
    
    this.slices = Slices;
    spectrum = new float[bands];
    this.bands = bands;
    this.app = app;
    s = new processing.sound.Sound (app);
    amp = new Amplitude(app);
    audioFile = new SoundFile(app,file);
    // Create an Input stream which is routed into the Amplitude analyzer
    fft = new FFT(app, bands);
    
    //amp.input(audioFile);
    fft.input(audioFile);
    audioFile.rate(1.5f);
  };

  public void initTabs(){

  spectrumImg = new tab(0,height - 170,width,150,"Spectrum");
  sliders = new tab(width-100,68,100,height - 240,"Menu");
  menu = new Menu(0,0+20,100,menuLabels);
  menu.w = 100;
  sliders.add(menu);
  workFlow = new tab(0,68,100,height - 240,"Workflow");
  TextArea m1 = new TextArea(0,20,100,height - 280,10,100);
  run = new Menu(0,workFlow.h-20,100,rLabels);
  run.w = 100;
  workFlow.add(m1);
  workFlow.add(run);
  Button b = sliders.menus.get(0).items.get(0);
  Button b1 = sliders.menus.get(0).items.get(1);
  //b = menu.items.get(0);
  inputFile = new fileInput(b);
  inputFile.x = sliders.x;
  inputFile.y = sliders.y+20;
  inputFile.w = sliders.w;
  inputFile.h = 20;

  inputFolder = new fileInput(b1,true);
  inputFolder.x = sliders.x;
  inputFolder.y = sliders.y+40;
  inputFolder.w = sliders.w;
  inputFolder.h = 20;

  output = new fileOutput();
  spectrumImg.toggle = true;
  sliders.toggle = true;
  workFlow.toggle = true;
  spectrumImg.draggable = true;
  spectrumImg.scrollable = true;
  workFlow.draggable = true;
  sliders.draggable = true;
  sliders.scrollable = true;
  //workFlow.scrollable = true;
  //canvas = createGraphics(width-200,height - 190);

};
  
  public void load(){
    
    
    // Create an Input stream which is routed into the Amplitude analyzer
    
    
  };

  // void display(PGraphics canvas){
  //   drawMenus();
  // };

  public void drawMenus(){
    inputFile.listen();
    inputFolder.listen();
    sliders.displayTab();
    //menu.draw();
    spectrumImg.displayTab();
    workFlow.displayTab();
    //inputFile.listen();
  };

  public void set(int bands,int Slices,String file){

    this.slices = Slices;
    spectrum = new float[bands];
    this.bands = bands;
    this.app = app;
    s = new processing.sound.Sound (app);
    amp = new Amplitude(app);
    audioFile = new SoundFile(app,file);
    // Create an Input stream which is routed into the Amplitude analyzer
    fft = new FFT(app, bands);
    
    //amp.input(audioFile);
    fft.input(audioFile);
    audioFile.rate(1.5f);
  };

  public void set(int bands,String file){

    spectrum = new float[bands];
    this.bands = bands;
    this.app = app;
    s = new processing.sound.Sound (app);
    amp = new Amplitude(app);
    audioFile = new SoundFile(app,file);
    // Create an Input stream which is routed into the Amplitude analyzer
    fft = new FFT(app, bands);
    
    //amp.input(audioFile);
    fft.input(audioFile);
    audioFile.rate(1.5f);
  };
  
  public void init(){
    if(count==0)audioFile.play();
    
    if(audioFile.isPlaying())analyse();
     else  analysed = true;
    //---------------------------------------------------------------------------------------------------
    // Map vertical mouse position to volume.
    float amplitude = map(mouseY, 0, height, 0.4f, 0.0f);
    
    // Instead of setting the volume for every oscillator individually, we can just
    // control the overall output volume of the whole Sound library.
    s.volume(1);
    //------------------------------------------------------------------------------------------------------
   
        if(!constructImage&&analysed){
          construct();
          }else if(constructImage){
            display();
          }
  
    debug();
    if(audioFile.isPlaying())count++;
  };
  
  public void analyse(){
    if(audioFile.isPlaying()){
    fft.analyze(spectrum);
    audio2.add(new ArrayList<PVector>());
    visualiser.add(new ArrayList<PVector>());
    for(int i = 0; i < bands; i++){
    // The result of the FFT is normalized
    // draw the line for frequency band i scaling it up by 5 to get more amplitude.
    float x = map(i,0,bands,0,width);
    float y = map( (spectrum[i]),0,1,0,height);
    
    float x1 = i;
    float y1 = map( (spectrum[i]),0,0.001f,0,255);
    
    colorMode(HSB);
    stroke(i,random(255),random(255));
    fill(i,random(255),random(255));
    audio.add(new PVector(x,y));
    audio2.get(frame).add(new PVector(x,y));
    visualiser.get(frame).add(new PVector(x1,y1));
    //vertex(k,-y);
    stroke(x1,random(255),random(255));
    //vertex(bar.x,bar.y);
    line(x,height,x,height -y);
    frames ++;
    }
    //endShape(OPEN);
    fill(255);
    text("playing",100,100);
    frame ++;
    }
  };
  
  public void construct(){
    colorMode(RGB);
    fill(255);
    text("Constructing",100,110);
    if(!sliced){
    specImg = createImage(bands,frame,RGB);
    specImg.loadPixels();
    //loadPixels();
    
    for(int i = 0; i < visualiser.size(); i++){
      ArrayList<PVector> b = visualiser.get(i);
      for(int j = 0; j < b.size(); j++){
        
        int pos = j+i*b.size();
        PVector p = b.get(j);
        
        specImg.pixels[pos] = color(255-p.y,map(i,0,255,0,height),255-p.y);
        
        //if(pos<pixels.length)pixels[pos] = color(random(255),0,0);
      }}
      //updatePixels();
      specImg.updatePixels();
     sliced = true; 
    }
      
    constructImage = true;
};

public void display(){
  
        
        if(sliced){
          image(specImg,0,0);
          int n = (int)(specImg.width*specImg.height)/slices;
          
          if(audioSlices.size()<slices){
            for(int i=0;i<slices;i++)
            audioSlices.add(null);
          }
          for(int i=0;i<slices;i++){
            
            PImage img = createImage(specImg.width,specImg.height/slices,RGB);
            img.loadPixels();
            int k = i * img.pixels.length;
            int p1 = i * (512+1);
            for(int j=0;j<img.pixels.length;j++){
              int p = k + j;
              if(p<specImg.pixels.length)img.pixels[j] 
              = specImg.pixels[p];
            }
            img.updatePixels();
            audioSlices.set(i,img);
        }}
          
          for(int i = 0; i < slices; i++){
              //image(audioSlices.get(i),0,i*audioSlices.get(i).height);
              stroke(0);
              strokeWeight(1);
              noFill();
              rect(0,i*frame/slices,bands,frames/slices);
            }
            
            fill(255);
      
            
            text(audioSlices.size() + " slices",100,110);
            text("stopped",100,100);
      
};

public void debug(){
  if(Debug){
  fill(0);
  text(frameRate,200,200);
  text("frames " + frames,200,210);
  text("frame " + frame,200,220);
  text(audio2.size(),200,230);
  text("visualiser size " + visualiser.size(),200,240);
  if(visualiser.size()>0)text("visualiser[0] " + visualiser.get(0).size(),200,250);
  if(specImg!=null)text("img height " + specImg.height,200,260);
  
  }
};
  
};
class vectorText{
  
  String [] text = null;
  String Sentence = "",sentence = "",Text="";
  ArrayList<Word[]> ninputs = new ArrayList<Word[]>();
  ArrayList<String> Sentences = new ArrayList<String>();
  ArrayList<Word> newSentence = new ArrayList<Word>();
  ArrayList<Word> builtSentence = new ArrayList<Word>();
  //ArrayList<Integer> sentences = new ArrayList<Integer>();
  ArrayList<Word> frequency = new ArrayList<Word>();
  ArrayList<ArrayList<String>> words = new ArrayList<ArrayList<String>>();
  ArrayList<ArrayList<Word>> Words = new ArrayList<ArrayList<Word>>();
  ArrayList<Word> Words1d = new ArrayList<Word>();
  ArrayList<Word> Words1dsingle = new ArrayList<Word>();
  ArrayList<Word> wordPool = new ArrayList<Word>();
  ArrayList<String> words1d = new ArrayList<String>();
  ArrayList<String> words1dsingle = new ArrayList<String>();
  ArrayList<ArrayList<Integer>> sentences = new ArrayList<ArrayList<Integer>>();
  
  ArrayList<Word> unsortedSearch = new ArrayList<Word>();
  ArrayList<Word> sortedSearch = new ArrayList<Word>();
  float max_size = 0,maxVariance,minVariance=10,maxFrequency;
  fileInput inputFile,inputFolder;
  fileOutput output;
  String []menuLabels = {"Open File","Open Folder","Save","Analyze","Markov chain","Find Similar","Load Data","Restore tabs"};
  String []rLabels = {"Run","Run All","Clear"};
  String fileLocation,folderLocation, savedFileLocation;
  Menu menu,run;
  tab workFlow,readingPane,sliders;
  
  Word start;
  
  int sentence_counter = 0, word_counter = 0,word_total,char_counter,char_counter2,char_counter3,counter,counter2,counter3,mid,twords,
      nonRep_words,char_total,space_total,longest_sentence;
  boolean init = true,textcompleted,inputs_complete,separatewords,separatesentences,trimchars,createwordobj,textjoined,getvariance,foundS,mdown;
  public boolean toggle;
  float my;
  
  vectorText(String a){
    sentence = a;
    init();
  };
  
  vectorText(String [] a){
    text = a;
    init();
  };

  vectorText(){
    init();
  };
  
public void set(String a){
  sentence = a;
};

public void set(String [] a){
  text = a;
};

public void init(){

  readingPane = new tab(0,height - 170,width,150,"Reading Pane");
  sliders = new tab(width-100,68,100,height - 240,"Menu");
  menu = new Menu(0,0+20,100,menuLabels);
  menu.w = 100;
  sliders.add(menu);
  workFlow = new tab(0,68,100,height - 240-40,"Workflow");
  TextArea m1 = new TextArea(0,20,100,height - 280,10,100);
  run = new Menu(0,workFlow.h-20,100,rLabels);
  //run.w = 100;
  workFlow.add(m1);
  workFlow.add(run);
  Button b = sliders.menus.get(0).items.get(0);
  Button b1 = sliders.menus.get(0).items.get(0);

  inputFile = new fileInput(b);
  inputFile.x = sliders.x;
  inputFile.y = sliders.y+20;
  inputFile.w = sliders.w;
  inputFile.h = 20;

  inputFolder = new fileInput(b1,true);
  inputFolder.x = sliders.x;
  inputFolder.y = sliders.y+40;
  inputFolder.w = sliders.w;
  inputFolder.h = 20;
  output = new fileOutput();

  readingPane.toggle = true;
  sliders.toggle = true;
  workFlow.toggle = true;
  readingPane.draggable = true;
  readingPane.scrollable = true;
  workFlow.draggable = true;
  sliders.draggable = true;
  sliders.scrollable = true;
  //workFlow.scrollable = true;
  //canvas = createGraphics(width-200,height - 190);

};
  
public void classString(){
  
  words.add(new ArrayList<String>());
  if(sentence_counter<sentence.length()){
    
  for(int i=0;i<sentence.length();i++){
    
    char a = sentence.charAt(i);
    
    if(a==' '||i==sentence.length()-1){
      String b = "";
      if(a==' ')b += sentence.substring(word_counter,i);
      else b += sentence.substring(word_counter,i+1);
      words.get(0).add(b);
      //sentence = sentence.substring(i,sentence.length());
      word_counter=i;
      if(i==0);word_counter =0;
      //System.out.println(b);
    }
    sentence_counter ++;
  }}
  
  mid = floor(sentence.length()/2);
  float cursorx = 0;
  for(int i=0;i<words.size();i++){
    String a = words.get(0).get(i);
    
    int dy = mid - i;
    
    //text(dy,10,20+10*i);
    
    Word w = new Word(dy,0,i,cursorx,a.length(),a);
    
    if(!Words1dsingle.contains(w))Words1dsingle.add(w);
    cursorx+= textWidth(a);
  }
};

public void classString(String sentence){
  
  String temp = "";
  words.add(new ArrayList<String>());
  if(sentence_counter<sentence.length()){
    
  for(int i=0;i<sentence.length();i++){
    
    char a = sentence.charAt(i);
    
    if(a==' '||i==sentence.length()-1){
      String b = "";
      if(a==' ')b += sentence.substring(word_counter,i);
      else b += sentence.substring(word_counter,i+1);
      words.get(0).add(b);
      word_counter=i;
      if(i==0);word_counter =0;
      //System.out.println(b);
    }
    sentence_counter ++;
  }}
  
  mid = floor(sentence.length()/2);
  float cursorx = 0;
  for(int i=0;i<words.size();i++){
    String a = words.get(0).get(i);
    
    int dy = mid - i;
    
    text(dy,10,20+10*i);
    
    Word w = new Word(dy,0,i,cursorx,a.length(),a);
    
    if(!Words1dsingle.contains(w))Words1dsingle.add(w);
    cursorx += textWidth(a);
  }
};

public void separateSentences_(){
  
  //push all text into one array
  if(sentence_counter<text.length){
    
    for(int j=0;j<text.length;j++){
      Text+= text[j];
      sentence_counter++;
    }}
    // loop through array and find key characters
    if(counter<Text.length()){
      
    for(int i=0;i<Text.length();i++){
      
      counter ++;
      
    char a = Text.charAt(i);
    String b = "";
    
    if(a=='.'){
      
      if(a=='.'||a=='!'||a=='?')b = Text.substring(char_counter,i+1);
      char_counter=i+1;
      Sentences.add(b);
      words.add(new ArrayList<String>());
      
    }
    else if(i==Text.length()-1){
      b = Text.substring(char_counter,i);
      char_counter=i;
      Sentences.add(b);
      words.add(new ArrayList<String>());
    }
    //System.out.println(b);
    
  }}
};

public void trimChars_(){
  
};

public void separateWords_(){
  if(counter2<Sentences.size()){
    
  for(int i=0;i<Sentences.size();i++){
    
    String s = Sentences.get(i);
    s = s.replaceAll("\\s+","");
    char_counter2 = 0;
    
    for(int j=0;j<s.length();j++){
      
      char a = s.charAt(j);
      
      counter2++;
      String b = "";
      
    if(a==' '){
      b = s.substring(char_counter2,j);
      char_counter2 = j;
      words.get(i).add(b);
      words1d.add(b);
      word_total++;
      words.get(i).add(" ");
      words1d.add(" ");
      space_total++;
    }
     else if(a=='\''){
      b += "\' ";
      println(b);
      words.get(i).add(b);
      
      words1d.add(b);
      char_counter2=j+1;
    }
     else if(a==','){
      b = s.substring(char_counter2,j);
      println(b);
      words.get(i).add(b);
      
      words1d.add(b);
      char_counter2=j;
    }
    
    
    else if(a=='.'){
      b = s.substring(char_counter2,j-2);
      char_counter2 = j+1;
      words.get(i).add(b);
      words1d.add(b);
      words.get(i).add(".");
      words1d.add(".");
    }};counter2++;}}
};

public void createWordObject_(){
  if(Words1dsingle.size()<words1d.size()){
    
    for(int i=0;i<words.size();i++){
    
    ArrayList<String> s = words.get(i);
    char_counter2 = 0;
    
    mid = floor(s.size()/2);
    float cursorx = 0;
    for(int j=0;j<s.size();j++){
      
      String a = s.get(j);
      
      Word word = new Word(j - mid,j,i,cursorx,a.length(),a);
      cursorx += textWidth(a);
      Words1dsingle.add(word);
  }}}
};

public void classText(){
  
  separateSentences_();
  trimChars_();
  separateWords_();
  createWordObject_();
  
};

public void classTextsp(){
  while(!textcompleted){
    println("class text");
    separateSentences();
    trimChars();
    separateWords();
    createWordObject();
    getVariance();
  }
};

public void separateSentences(){
  if(sentence_counter<text.length){
    
    for(int j=0;j<text.length;j++){
      Text+= text[j] + " ";
      max_size += textWidth(text[j]);
      sentence_counter++;
    }
  max_size /= text.length;
}else if(counter<Text.length()){
      
    for(int i=0;i<Text.length();i++){
      
      counter ++;
      
    char a = Text.charAt(i);
    String b = "";
    
    if(a=='.'){
      
      b = Text.substring(char_counter,i+1);
      if(b.length()>1){
      char_counter=i+1;
      Sentences.add(b);
      words.add(new ArrayList<String>());
    }}}}else separatesentences = true;
};

public void trimChars(){
  
};

public void separateWords(){
  
  if(counter2<Sentences.size()&&separatesentences&&!separatewords){
    
  for(int i=0;i<Sentences.size();i++){
    
    String s = Sentences.get(i);
    char_counter2 = 0;
    s = s.replace("\r\n",". ");
    for(int j=0;j<s.length();j++){
      
      char a = s.charAt(j);
      
      String b = "";
      
     if(a==','){
      b = s.substring(char_counter2,j)+",";
      
      if(b.length()>0){
        words.get(i).add(b);
        words.get(i).add(b);
      }
      //words1d.add(b);
      char_counter2 = j+1;
      char_total ++;
      }
      else if(a=='\n'){
      b = s.substring(char_counter2,j);
      char_counter2 = j+1;
      //b += " ";
      if(b.length()>0){
        words.get(i).add(b);
        words1d.add(b);
      }
      word_total++;
      //words.get(i).add(" ");
      //words1d.add(" ");
      space_total++;
      }
      else if(a==' '){
      b = s.substring(char_counter2,j);
      char_counter2 = j+1;
      //b += " ";
      if(b.length()>0){
        words.get(i).add(b);
        words1d.add(b);
      }
      word_total++;
      //words.get(i).add(" ");
      //words1d.add(" ");
      space_total++;
      }
      //else if(a==';'){
      //b = s.substring(char_counter2,j);
      //char_counter2 = j+1;
      //words.get(i).add(b);
      //words1d.add(b);
      //word_total++;
      ////words.get(i).add(" ");
      ////words1d.add(" ");
      //space_total++;
      //}
      else if(a=='?'){
      b = s.substring(char_counter2,j)+"?";
      char_counter2 = j+1;
      if(b.length()>0){
        words.get(i).add(b);
        words1d.add(b);
      }
      word_total++;
      //words.get(i).add("?");
      //words1d.add("?");
      space_total++;
      }
      else if(a=='.'){
      b = s.substring(char_counter2,j)+".";
      char_counter2 = j+1;
      if(b.length()>0){
        words.get(i).add(b);
        words1d.add(b);
      }
      //words.get(i).add(".");
      //words1d.add(".");
      space_total++;
    }
    else if(a=='!'){
      b = s.substring(char_counter2,j)+"!";
      char_counter2 = j+1;
      if(b.length()>0){
        words.get(i).add(b);
        words1d.add(b);
      }
      //words.get(i).add("!");
      //words1d.add("!");
      char_total++;
    }
    else if(a=='-'){
      b = s.substring(char_counter2,j);
      char_counter2 = j+1;
      if(b.length()>0){
        words.get(i).add(b);
        words1d.add(b);
      }
      //words.get(i).add("-");
      //words1d.add("-");
      char_total++;
    }
    else if(a==':'){
      b = s.substring(char_counter2,j);
      char_counter2 = j+1;
      if(b.length()>0){
        words.get(i).add(b);
        words1d.add(b);
      }
      //words.get(i).add(":");
      //words1d.add(":");
      char_total++;
    }
    //else if(a=='/'){
    //  b = s.substring(char_counter2,j);
    //  char_counter2 = j+1;
    //  words.get(i).add(b);
    //  words1d.add(b);
    //  //words.get(i).add("/");
    //  //words1d.add("/");
    //  char_total++;
    //}
    //else if(a=='\''){
    //  b = s.substring(char_counter2,j);
    //  char_counter2 = j;
    //  words.get(i).add("'");
    //  words1d.add("'");
    //  words.get(i).add("'");
    //  words1d.add("'");
    //  char_total++;
    //}
  };counter2++;if(i==Sentences.size()-1)separatewords = true;}}
    
};

public void createWordObject(){
  //text(count,200,130);
    
  if(twords<words1d.size()&&words1d.size()>0){
    for(int i=0;i<words.size();i++){
        longest_sentence += words.get(i).size();
      }
      
      longest_sentence /= words.size();
    
    ArrayList<String> temp = new ArrayList<String>();
    ArrayList<Word> temp2 = new ArrayList<Word>();
    int count = 0;
    for(int i=0;i<words.size();i++){
    
    ArrayList<String> s = words.get(i);
    char_counter2 = 0;
    
    mid = floor(longest_sentence/2);
    float cursorx = 0;
    for(int j=0;j<s.size();j++){
      
      String a = s.get(j);
      int total = words.size() * s.size();
      float v =  mid - j;
      Word next = null;
      if(count<words1d.size()){ next = new Word(j - mid,j,i,cursorx,a.length(),a,count,words.size(),total);
      
      next.pos2.add(abs(v*v));
      next.frequency = 1;
      next.cYpos.add(0);
      next.cXpos.add(0);
      next.ypos.add(i);
      //next.xpos.add(new ArrayList<Integer>());
      //next.xpos.get(0).add(j);
      next.xpos.add(j);
      
      if(textWidth(Sentences.get(i))>1)
      next.sentenceSize.add(textWidth(Sentences.get(i)));
      else next.sentenceSize.add(1.0f);
      Words1d.add(next);
      cursorx += textWidth(a);
      
        if(!words1dsingle.contains(a)){
          Words1dsingle.add(next);
          words1dsingle.add(a);
          
        }else{
          int k = words1dsingle.indexOf(a);
        
          Word word =  Words1dsingle.get(k);
          //if(j<s.size()-1)word.nextWord.add(s.get(j+1));
          word.frequency ++;
          word.pos2.add(abs(v*v));
          //word.occurence.set(j,1);
          if(textWidth(Sentences.get(i))>1)
          word.sentenceSize.add(textWidth(Sentences.get(i)));
          else word.sentenceSize.add(1.0f);
          //word.sentence_occurence.set(j,1);
          if(i>0&&Sentences.get(i-1).contains(a)){
            word.cYpos.add(word.cYpos.get(word.cYpos.size()-1)+1);
          }
          if(j>0){
            word.cXpos.add(word.cXpos.get(word.cXpos.size()-1)+1);
          }
          word.xpos.add(j);
          word.ypos.add(i);
          word.pos.add(next.p);
        }
      count++;
      twords++;
      if(count == words1d.size()){
        
        textcompleted = true;
      }}}}}
};

public void markovChain(){
  
};

public void getVariance(){
  int countv = 0;
  if(textcompleted&&!getvariance){
  for(int i=0;i<Words1dsingle.size();i++){
          Word w = Words1dsingle.get(i);
          countv ++;
          w.calcVariance();
          if(maxVariance<w.variance)maxVariance=w.variance;
          if(maxFrequency<w.frequency)maxFrequency=w.frequency;
          if(minVariance<w.variance)minVariance=w.variance;
          //w.setVariance();
          //for(int j=0;j<w.sentenceSize.size();j++){
          //  float v = w.sentenceSize.get(j);
            
          //  if(v>w.maxWordVariance)w.maxWordVariance = v;
          //}
        
      }
        
        fill(255);
   for(int i=0;i<Words1dsingle.size();i++){
          Word w = Words1dsingle.get(i);
          w.setVariance();
       }
      
    if(countv>=Words1dsingle.size())getvariance = true;}
    else{
      //int count = 0;
      //for(int i=0;i<Words1dsingle.size();i++){
      //    Word w = Words1dsingle.get(i);
      //    //if(w.maxWordVariance==0){
      //      text(w.maxWordVariance,400,50+10*count);
      //      count++;
      //    //}
      // }
    }
};

public void getEncodings(){
  fill(255);
  if(getvariance){
  for(int i=0;i<Words1d.size();i++){
      
      Word w = Words1d.get(i);
      for(int j=0;j<w.sentence_occurence.size();j++){
        
        int k = w.occurence.get(j);
        text(k,40+j*10,70+10*i);
        
      }}}
};

public void readText(){
  
  float my = map(mouseY,0,text.length*12,0,height);
  for(int i=0;i<words.size();i++){
    
    ArrayList<String> s = words.get(i);
    
    float cursorx = 0;
  
    for(int j=0;j<s.size();j++){
      
      String s2 = s.get(j);
      
      text(s2 + " ", cursorx ,230+10*i-my);
      cursorx += textWidth(s2);
    }}
  
  //for(int i=0;i<Sentences.size();i++){
  //  String s = Sentences.get(i);
  //  fill(255);
  //  text(s,10,90+10*i);
  //}
  
  //for(int i=0;i<words1d.size();i++){
  //  String s = words1d.get(i);
    
  //  text(s,10,90+10*i);
  //}
};

public void display(){

  if(text!=null&&mouseY>0&&mouseY<height) my = map(mouseY,0,text.length*12,0,height);
  // for(int i=0;i<words.size();i++){
    
  //   ArrayList<String> s = words.get(i);
    
  //   float cursorx = 0;
  
  //   for(int j=0;j<s.size();j++){
      
  //     String s2 = s.get(j);
      
  //     text(s2 + " ", cursorx ,230+10*i-my);
  //     cursorx += textWidth(s2);
  //   }}
    //if(mousePressed)
    readingPane.displayTab();
    sliders.displayTab();
    workFlow.displayTab();
    inputFile.listen();
    inputFolder.listen();
    if(text!=null&&readingPane.textBlocks.size()>0)readingPane.sliderv.set(30,text.length,readingPane.textBlocks.get(0),"offsetY");
    if(text!=null&&readingPane.textBlocks.size()>0)readingPane.sliderh.set(10,width,readingPane.textBlocks.get(0),"offsetX");
    Button resetWindows = sliders.menus.get(0).items.get(4);
    Button analyze = sliders.menus.get(0).items.get(3);

    if(resetWindows.click(sliders.getMouse())){

    }
    if(analyze.click(sliders.getMouse())){
      classTextsp();
      println("analyze");
      println("words",words.size(),"text",text.length);
    }
    if(inputFile.value!=null){
      fileLocation = inputFile.value;
      inputFile.value = null;
      readingPane.sliderv.valuex = 0;
      readingPane.sliderh.valuex = 0;
    }

    if(inputFolder.values!=null){
      folderLocation = inputFolder.values[0];
      inputFolder.values = null;
    }

    if(fileLocation!=null){
      text = loadStrings(fileLocation);
      readingPane.add(0,new textBlock(10,30,readingPane.w,readingPane.h,text));
      savedFileLocation = fileLocation;
      fileLocation = null;
      //println("file ", savedFileLocation);
      
    }

    if(folderLocation!=null){
      text = loadStrings(folderLocation);
      readingPane.add(0,new textBlock(0,30,readingPane.w,readingPane.h,text));
      savedFileLocation = folderLocation;
      folderLocation = null;
      //println("first file ", folderLocation);
      
    }
    
};

public void display(PGraphics canvas){
  if(toggle&&textcompleted){
    canvas.beginDraw();
    canvas.fill(0);
    float my = map(mouseY,0,text.length*12,0,height);
    for(int i=0;i<words.size();i++){
      
      ArrayList<String> s = words.get(i);
      
      float cursorx = 0;
    
      for(int j=0;j<s.size();j++){
        
        String s2 = s.get(j);
        
        canvas.text(s2 + " ", cursorx ,230+10*i-my);
        cursorx += textWidth(s2);
      }}
      canvas.endDraw();
  }else if(toggle){
    readingPane.displayTab();
    sliders.displayTab();
    workFlow.displayTab();
    //menu.draw();
    inputFile.listen();
    inputFolder.listen();
  }

};

public void plotText(){
  
  for(int i=0;i<Words1dsingle.size();i++){
    
    Word w = Words1dsingle.get(i);
    
    fill(255);
    stroke(0);
    ellipse(w.x+w.variance + 400,w.y,5,5);
    //text(w.variance,10,40+10*i);
    
  }
  
};

public void findSimilar(String a){
  
  
      ArrayList<Word>temp = new ArrayList<Word>();
      
      if(Words1dsingle.size()==words1dsingle.size()){
        
  if(words1dsingle.contains(a)){
    
      int k = words1dsingle.indexOf(a);
      
      Word w1 = Words1dsingle.get(k);
      
  for(int i=0;i<Words1dsingle.size();i++){
    
    Word w2 = Words1dsingle.get(i);
    
   float deltav = abs(w1.p - w2.p);
   float deltaf = abs(w1.frequency - w2.frequency);
    
    fill(255);
    if(deltaf < 0.000001f&&w1.a!=w2.a)temp.add(w2);
    
  }}else{
    fill(255);
    text("Choose, new word",10,40);
  }}
  
  if(temp.size()>0){
    int y1 = 50;
    fill(255);
    text("|" + a + "|",10,y1);
    
    for(int i=0;i<temp.size();i++){
      
      Word w = temp.get(i);
      
      text("|" + w.a + "|",10,50+10*i);
      text(w.variance,100,50+10*i);
      text(w.frequency,200,50+10*i);
    }
  }else{
    fill(255);
      text("Temp is empty",10,50);
  }
};

public ArrayList<Word> findSimilar(String a,int b){
    fill(255);
      ArrayList<Word>temp = new ArrayList<Word>();
      
      if(textcompleted){
        
  if(words1dsingle.contains(a)){
    
    if(!foundS){
      int k = words1dsingle.indexOf(a);
      
      Word w1 = Words1dsingle.get(k);
      
        for(int i=0;i<w1.ypos.size();i++){
          
          ArrayList<String> s = words.get(w1.ypos.get(i));
          
          for(int j=w1.xpos.get(i);j<w1.xpos.get(i)+b+1;j++){
            
            if(j>0&&j<s.size()){
            int k2 = words1dsingle.indexOf(s.get(j));
            
            Word w2 = Words1dsingle.get(k2);
              //if(int(c)+1==j){
            
            
            if(w2.a!=" "&&w2.a!=":"&&w2.a!="  "){
            if(w1.a!=w2.a&&!unsortedSearch.contains(w2)){
              w2.p = j;
              w2.searchFrequency++;
              //if(w2.a[0]!=':'||w2.a[0]!=';')
              unsortedSearch.add(w2);
            }
            if(w1.a!=w2.a&&unsortedSearch.contains(w2)){
              int k1 = unsortedSearch.indexOf(w2);
              unsortedSearch.get(k1).searchFrequency++;
              unsortedSearch.add(w2);
              
            }}}
      //if(j>=s.size()&&w1.ypos.get(j)<words.size()){
      //  int n = abs(s.size()-j);
      //int k2 = words1dsingle.indexOf(words.get(w1.ypos.get(i)+1).get(n));
      
      //Word w2 = Words1dsingle.get(k2);
      //if(w2.a!=" "&&w1.a!=w2.a&&!unsortedSearch.contains(w2)){
      //  w2.p = 0;
      //  w2.searchFrequency++;
      //  unsortedSearch.add(w2);
      //}
      //if(w2.a!=" "&&w1.a!=w2.a&&unsortedSearch.contains(w2)){
      //  int k1 = unsortedSearch.indexOf(w2);
      //  unsortedSearch.get(k1).searchFrequency++;
      //  //unsortedSearch.add(w2);
        
      //}}
      //if(j<=0&&w1.ypos.get(j)>0){
      //  int n = words.get(w1.ypos.get(i)-1).size()+j;
      //int k2 = words1dsingle.indexOf(words.get(w1.ypos.get(i)-1).get(n));
      
      //Word w2 = Words1dsingle.get(k2);
      //if(w2.a!=" "&&w1.a!=w2.a&&!unsortedSearch.contains(w2)){
      //  w2.p = 0;
      //  w2.searchFrequency++;
      //  unsortedSearch.add(w2);
      //}
      //if(w2.a!=" "&&w1.a!=w2.a&&unsortedSearch.contains(w2)){
      //  int k1 = unsortedSearch.indexOf(w2);
      //  unsortedSearch.get(k1).searchFrequency++;
      //  //unsortedSearch.add(w2);
        
      //}}
    }}
    
      foundS = true;
      
      //for(int i=0;i<unsortedSearch.size();i++){
      //  Word w = unsortedSearch.get(i);
      //  w.searchFrequency /= unsortedSearch.size();
      //}

    }}else{
      
      text("Choose, new word",10,40);
    }}
  
  if(textcompleted){
  if(foundS)temp = unsortedSearch;
  
  }
  
  return temp;
};

public ArrayList<Word> findSimilar(String a,int b,float c){
    fill(255);
      ArrayList<Word>temp = new ArrayList<Word>();
      ArrayList<Word>unsortedSearch = new ArrayList<Word>();
      if(textcompleted){
        
  if(words1dsingle.contains(a)){
    
    if(!foundS){
      
      int k = words1dsingle.indexOf(a);
      int y = 0;
      
      Word w1 = Words1dsingle.get(k);
      
      for(int i=0;i<w1.ypos.size();i++){
        
        ArrayList<String> s = words.get(w1.ypos.get(i));
        
        for(int j=w1.xpos.get(i);j<w1.xpos.get(i)+b+1;j++){
          
          boolean check = false;
          //if(i>0&&w1.ypos.get(i)==w1.ypos.get(i-1))w1.t++;
          //else w1.t = 0;
          
          if(j>=0&&j<s.size()&&j==c+1){
          int k2 = words1dsingle.indexOf(s.get(j));
          
          Word w2 = Words1dsingle.get(k2);
          if(w1.a!=w2.a&&!unsortedSearch.contains(w2)){
            w2.p = w1.xpos.get(i)+j;
            w2.searchFrequency++;
            unsortedSearch.add(w2);
          }
          if(w1.a!=w2.a&&unsortedSearch.contains(w2)){
            int k1 = unsortedSearch.indexOf(w2);
            unsortedSearch.get(k1).searchFrequency++;
            unsortedSearch.add(w2);
            
       }}}}
    
      foundS = true;

    }}else{
      
      text("Choose, new word",10,40);
    }}
  
  if(textcompleted){
  if(foundS)temp = unsortedSearch;
  
  }
  return temp;
};

public void displaySimilar(String a,int b,int c){
    fill(255);
      ArrayList<Word>temp = new ArrayList<Word>();
      
      if(textcompleted){
        
  if(words1dsingle.contains(a)){
    
    if(!foundS){
      int k = words1dsingle.indexOf(a);
      
      Word w1 = Words1dsingle.get(k);
      
      for(int i=0;i<w1.ypos.size();i++){
        
        ArrayList<String> s = words.get(w1.ypos.get(i));
        
        //float deltaf = abs(w1.frequency - w2.frequency);
        int count = 0;
        for(int j=w1.xpos.get(i);j<w1.xpos.get(i)+b+1;j++){
          
          if(j>=0&&j<s.size()){
          int k2 = words1dsingle.indexOf(s.get(j));
          
          Word w2 = Words1dsingle.get(k2);
          if(w1.a!=w2.a&&w2.a != " "&&!unsortedSearch.contains(w2)){
            w2.p = w1.xpos.get(i)+j;
            w2.searchFrequency++;
            unsortedSearch.add(w2);
          }
          if(w1.a!=w2.a&&unsortedSearch.contains(w2)){
            int k1 = unsortedSearch.indexOf(w2);
            unsortedSearch.get(k1).searchFrequency++;
            //unsortedSearch.add(w2);
            
       }}}}
    
      foundS = true;
      
      //for(int i=0;i<unsortedSearch.size();i++){
      //  Word w = unsortedSearch.get(i);
      //  w.searchFrequency /= unsortedSearch.size();
      //}

    }}else{
      
      text("Choose, new word",10,40);
    }}
  
  if(textcompleted){
  if(foundS){
    
    if(unsortedSearch.size()>0)text(unsortedSearch.size(),10,40);
    
    Word w1 = null;
    
    if(unsortedSearch.size()>0){
      
      for(int j=unsortedSearch.size()-1;j>-1;j--){
        
        w1 = unsortedSearch.get(j);
        int n = -1;
        
        for(int i=unsortedSearch.size()-2;i>-1;i--){
          
           Word w2 = unsortedSearch.get(i);
          
          if(w1.searchFrequency<w2.searchFrequency){
            w1 = w2;
            n = i;
          }}
          
          if(n>-1&&unsortedSearch.get(n).a!=" "){
          if(n>-1)sortedSearch.add(unsortedSearch.remove(n));
          else if(unsortedSearch.size()>0)sortedSearch.add(unsortedSearch.remove(j));
    }else if(n>-1)unsortedSearch.remove(n);
   }}}
  
    if(sortedSearch.size()>0){
      int y1 = 70;
      fill(255);
      text("|" + a + "|" ,10,y1-20);
      text(sortedSearch.size(),10,y1-10);
    for(int i=0;i<sortedSearch.size();i++){
      Word w = sortedSearch.get(i);
      
      text("|" + w.a + "|",10,y1+10*i);
      text(w.searchFrequency,100,y1+10*i);
      text(w.frequency,200,y1+10*i);
    }}
     if(sortedSearch.size()==0&&unsortedSearch.size()==0) text("Temp is empty",10,50);
  }
  else text("Scanning not finnished", 10,50);
};

public ArrayList<Word> findSimilar(String a,int b,int c){
    fill(255);
      ArrayList<Word>temp = new ArrayList<Word>();
      
      if(textcompleted){
        
  if(words1dsingle.contains(a)){
    
    if(!foundS){
      int k = words1dsingle.indexOf(a);
      
      Word w1 = Words1dsingle.get(k);
      
  for(int i=0;i<w1.ypos.size();i++){
    
    ArrayList<String> s = words.get(w1.ypos.get(i));
    
    //float deltaf = abs(w1.frequency - w2.frequency);
    int count = 0;
    for(int j=w1.xpos.get(i)-c;j<w1.xpos.get(i)+b+1;j++){
      
      if(j>0&&j<s.size()){
      int k2 = words1dsingle.indexOf(s.get(j));
      
      Word w2 = Words1dsingle.get(k2);
      if(w1.a!=w2.a&&!unsortedSearch.contains(w2)){
        w2.p = j;
        w2.searchFrequency++;
        unsortedSearch.add(w2);
      }
      if(w1.a!=w2.a&&unsortedSearch.contains(w2)){
        int k1 = unsortedSearch.indexOf(w2);
        unsortedSearch.get(k1).searchFrequency++;
        //unsortedSearch.add(w2);
        
      }
      
      }}}
    
      foundS = true;
      
      //for(int i=0;i<unsortedSearch.size();i++){
      //  Word w = unsortedSearch.get(i);
      //  w.searchFrequency /= unsortedSearch.size();
      //}

    }}else{
      
      text("Choose, new word",10,40);
    }}
  
  if(textcompleted){
  if(foundS){
    
    if(unsortedSearch.size()>0)text(unsortedSearch.size(),10,40);
    else text(sortedSearch.size(),10,40);
    
    Word w1 = null;
    
    if(unsortedSearch.size()>0){
      
      for(int j=unsortedSearch.size()-1;j>-1;j--){
        
        w1 = unsortedSearch.get(j);
        int n = -1;
        
        for(int i=unsortedSearch.size()-2;i>-1;i--){
          
          Word w2 = unsortedSearch.get(i);
          
          if(w1.searchFrequency<w2.searchFrequency){
            w1 = w2;
            n = i;
          }}
          
          if(n>-1)sortedSearch.add(unsortedSearch.remove(n));
          else if(unsortedSearch.size()>0)sortedSearch.add(unsortedSearch.remove(j));
    }
    
  }}
  
    if(sortedSearch.size()>0){
      
      temp = sortedSearch;
      if(sortedSearch.size()==0&&unsortedSearch.size()==0)temp = null;
      
    }}else {
    text("Scanning not finnished", 10,50);
    temp = null;
  }
  
  return temp;
};

public void findSimilar(String a,int b,int c,int d){
    fill(255);
      ArrayList<Word>temp = new ArrayList<Word>();
      
      if(textcompleted){
        
  if(words1dsingle.contains(a)){
    
    if(!foundS){
      int k = words1dsingle.indexOf(a);
      
      Word w1 = Words1dsingle.get(k);
      
  for(int i=0;i<w1.ypos.size();i++){
    
    ArrayList<String> s = words.get(w1.ypos.get(i));
    
    //float deltaf = abs(w1.frequency - w2.frequency);
    int count = 0;
    for(int j=w1.xpos.get(i)-c;j<w1.xpos.get(i)+b+1;j++){
      
      if(j>=0&&j<s.size()){
      int k2 = words1dsingle.indexOf(s.get(j));
      
      Word w2 = Words1dsingle.get(k2);
      if(w1.a!=w2.a&&w2.a != " "&&!unsortedSearch.contains(w2)){
        w2.p = w1.xpos.get(i)+j;
        w2.searchFrequency++;
        unsortedSearch.add(w2);
      }
      if(w1.a!=w2.a&&unsortedSearch.contains(w2)){
        int k1 = unsortedSearch.indexOf(w2);
        unsortedSearch.get(k1).searchFrequency++;
        //unsortedSearch.add(w2);
        
      }}}}
    
      foundS = true;
      
      //for(int i=0;i<unsortedSearch.size();i++){
      //  Word w = unsortedSearch.get(i);
      //  w.searchFrequency /= unsortedSearch.size();
      //}

    }}else{
      
      text("Choose, new word",10,40);
    }}
  
  if(textcompleted){
  if(foundS){
    
    if(unsortedSearch.size()>0)text(unsortedSearch.size(),10,40);
    else text(sortedSearch.size(),10,40);
    
    Word w1 = null;
    
    if(unsortedSearch.size()>0){
      
      for(int j=unsortedSearch.size()-1;j>-1;j--){
        
        w1 = unsortedSearch.get(j);
        int n = -1;
        
        for(int i=unsortedSearch.size()-2;i>-1;i--){
          
          Word w2 = unsortedSearch.get(i);
          
          if(w1.searchFrequency<w2.searchFrequency){
            w1 = w2;
            n = i;
          }}
          
          if(n>-1)sortedSearch.add(unsortedSearch.remove(n));
          else if(unsortedSearch.size()>0)sortedSearch.add(unsortedSearch.remove(j));
    }
    
  }}
  
    if(sortedSearch.size()>0){
      int y1 = 70;
      fill(255);
      text("|" + a + "|" ,10,y1-10);
    for(int i=0;i<sortedSearch.size();i++){
      Word w = sortedSearch.get(i);
      
      text(w.a,10,y1+10*i);
      text(w.searchFrequency,100,y1+10*i);
      text(w.frequency,200,y1+10*i);
    }}
     if(sortedSearch.size()==0&&unsortedSearch.size()==0) text("Temp is empty",10,50);
  }
  else text("Scanning not finnished", 10,50);
};

public void findLeastSimilar(String a,float b){
    fill(255);
      ArrayList<Word>temp = new ArrayList<Word>();
      
      if(textcompleted){
        
  if(words1dsingle.contains(a)){
    
    if(!foundS){
      int k = words1dsingle.indexOf(a);
      
      Word w1 = Words1dsingle.get(k);
      
  for(int i=0;i<Words1dsingle.size();i++){
    
    Word w2 = Words1dsingle.get(i);
    
   float deltav = abs(w1.variance - w2.variance);
   float deltaf = abs(w1.frequency - w2.frequency);
    
    if(deltav > b)unsortedSearch.add(w2);
    
  }foundS = true;}}else{
    
    text("Choose, new word",10,40);
  }}
  
  if(textcompleted){
  if(foundS){
    if(unsortedSearch.size()>0)text(unsortedSearch.size(),10,40);
    else text(sortedSearch.size(),10,40);
    Word w1 = null;
    if(unsortedSearch.size()>0){
      
      
      for(int j=unsortedSearch.size()-1;j>-1;j--){
        w1 = unsortedSearch.get(j);
        int n = -1;
        for(int i=unsortedSearch.size()-2;i>-1;i--){
          Word w2 = unsortedSearch.get(i);
          
          if(w1.variance<w2.variance){
            w1 = w2;
            n = i;
          }}
          
          if(n>-1){
            
          sortedSearch.add(unsortedSearch.remove(n));
          
          }else if(unsortedSearch.size()>0)sortedSearch.add(unsortedSearch.remove(j));
    }
    
  }}
  
    if(sortedSearch.size()>0)
    for(int i=0;i<sortedSearch.size();i++){
      Word w = sortedSearch.get(i);
      
      text('"'+w.a+'"',10,50+10*i);
      text(w.variance,100,50+10*i);
      text(w.frequency,200,50+10*i);
    }
     if(sortedSearch.size()==0&&unsortedSearch.size()==0) text("Temp is empty",10,50);
  }
  else text("Scanning not finnished", 10,50);
};

public int getFrequency(String a){
  int i = -1;
  if(textcompleted){
  if(words1dsingle.contains(a)){
    int k = words1dsingle.indexOf(a);
    Word w = Words1dsingle.get(k);
    
    i = w.frequency;
    
  }else{
   fill(255);
   text("Choose another word!",300,70);
  }}
  else{
   fill(255);
   text("Scanning not finished",300,70);
  }
  
  fill(255);
  text(i,300,80);
  return i;
};

public void logic(){
  if(mousePressed)mdown = true;
  if(!mousePressed) mdown = false;
  
};

public void createSentence(String Start,int size){
  //fill(255);
  //  text("Building Sentence",100,80);
  if(mdown){
    newSentence = new ArrayList<Word>();
  }
  else if(textcompleted){
  //if(start == null && newSentence.size()==0){
    
   if(words1dsingle.contains(Start)){
     
     if(newSentence.size()==0){
       start = Words1dsingle.get(words1dsingle.indexOf(Start));
       newSentence.add(start);
     }else if(start!=null){
       fill(255);
       rect(0,0,width,height);
       fill(0);
       text("Loading",100,80);
       float cursorx = 0;
       
       for(int i=0;i<100;i++){
         foundS = false;
         
         wordPool = findSimilar(start.a,1,PApplet.parseFloat(newSentence.size()));
           
           if(wordPool.size()>0){
           Word nextWord = wordPool.get(floor(random(wordPool.size())));
           newSentence.add(nextWord);
           start = nextWord;
           
             if(nextWord.a.length()>1){
               char a = nextWord.a.charAt(nextWord.a.length()-1);
             if(a=='!'||a=='?'||a=='.'){
               start = null;
               break;
             }}else if(start.a=="!"||start.a=="?"||start.a=="."){
          start = null;
          break;
        }}else {
          start = null;
          break;
      }}
      //start = null;
    }}else{
    fill(255);
    text("Word Not Found",100,90);
   }
   
   if (newSentence.size()>0){
       fill(255);
       float cursorx = 0;
       int h = 0;
       if(start!=null)text(start.a,100 ,70);
       if(wordPool.size()==0)text("No words in pool !",160 ,70);
       for(int i=0;i<newSentence.size();i++){
         
         Word word = newSentence.get(i);
         if(cursorx + textWidth(word.a + " ")+100> width){
           h++;
           cursorx = 0;
         }
         text( word.a + " " ,100 +cursorx,90+(h*10));
         cursorx += textWidth(word.a + " ");
         }
       
       //for(int i=0;i<newSentence.size();i++){
       //  Word word = newSentence.get(i);
         
       //  for(int j=0;j<word.a.length();j++){
           
       //  char a = word.a.charAt(j);
       //  if(a == ' ') a= '!';
       //  text("," + a + ",",300 +10*j,90+10*i);
       //}}
     
   }}
  
};

public void neural_inputs(){
  
  int count = 0;
  
  if(!inputs_complete){
  for(int i=0;i<words.size();i++){
    
    ArrayList<String> s = words.get(i);
    
    for(int j=0;j<s.size();j++){
      
      Word w = Words1d.get(count);
      count ++;
      
      int count2 = 0;
      for(int k=0;k<words.size();k++){
    
        ArrayList<String> s2 = words.get(k);
        
        for(int l=0;l<s.size();l++){
          
          Word w2 = Words1d.get(count2);
          
          Word[] n = {w,w2};
          
          ninputs.add(n);
          
    }}}}}if(count==Words1d.size())inputs_complete = true;
};


public void mostFrequent(){
  
};

public float getVariance(String a){
  float i = -1;
  Word w1 = null;
  if(textcompleted){
  if(words1dsingle.contains(a)){
    int k = words1dsingle.indexOf(a);
    Word w = Words1dsingle.get(k);
    
    i = w.variance;
    w1 = w;
    
  }else{
   fill(255);
   text("Choose another word!",500,70);
  }}
  else{
   fill(255);
   text("Scanning not finished",500,70);
  }
  
  fill(255);
  text(i,500,80);
  if(w1!=null)text(w1.frequency,500,90);
  return i;
};

public void getTFIDF(){
  
};

//void normalize(Word w){
  
//  for(int i=0;i<w.pos2.size();i++){
    
    
//  }
  
//};



class Word{
  
  int x,y,p,t;
  float w,l,maxWordVariance,searchFrequency;
  String a;
  ArrayList<Integer> xpos = new ArrayList<Integer>();
  //ArrayList<ArrayList<Integer>> xpos = new ArrayList<ArrayList<Integer>>();
  ArrayList<Integer> ypos = new ArrayList<Integer>();
  ArrayList<Integer> cXpos = new ArrayList<Integer>();
  ArrayList<Integer> cYpos = new ArrayList<Integer>();
  ArrayList<Integer> flatRef = new ArrayList<Integer>();
  ArrayList<Integer> occurence = new ArrayList<Integer>();
  ArrayList<Integer> sentence_occurence = new ArrayList<Integer>();
  ArrayList<Float> sentenceSize = new ArrayList<Float>();
  float variance,sentenceSize_;
  int frequency;
  ArrayList<Integer> pos = new ArrayList<Integer>();
  ArrayList<Float> pos2 = new ArrayList<Float>();
  ArrayList<Word> previousWord = new ArrayList<Word>();
  ArrayList<Word> nextWord = new ArrayList<Word>();
  float textpos;
  boolean varianced,beginning,end;
  
  
  Word(int pp,int xx,int yy,float ww,int ll,String aa){
    x = xx;
    y = yy;
    a = aa;
    p = pp;
    pos.add(pp);
    textpos = pp;
    //pos2.add(w);
    xpos.add(xx);
    ypos.add(yy);
    w = ww;
    l = ll;
    
  };
  
  Word(int pp,int xx,int yy,float ww,int ll,String aa,int tpos,int sentences,int total){
    x = xx;
    y = yy;
    a = aa;
    p = pp;
    pos.add(pp);
    textpos = tpos;
    //for(int i=0;i<words1d.size();i++){
    //  occurence.add(0);
    //}
    //for(int i=0;i<longest_sentence;i++){
    //  sentence_occurence.add(0);
    //}
    
    //occurence.set(tpos,1);
    xpos.add(xx);
    ypos.add(yy);
    w = ww;
    l = ll;
    
  };
  
  Word(int pp,int xx,int yy,float v,float ww,int ll,String aa,int tpos,int sentences,int total){
    x = xx;
    y = yy;
    a = aa;
    p = pp;
    variance = v;
    pos.add(pp);
    textpos = tpos;
    for(int i=0;i<words1d.size();i++){
      occurence.add(0);
    }
    for(int i=0;i<longest_sentence;i++){
      sentence_occurence.add(0);
    }
    
    occurence.set(tpos,1);
    xpos.add(xx);
    ypos.add(yy);
    w = ww;
    l = ll;
    
  };
  
  public void calcVariance(){
    
    if(!varianced){
    //max_size * Sentences.size();
    for(int i=0;i<pos2.size();i++){
      float v = pos2.get(i);
      float u = sentenceSize.get(i)*sentenceSize.get(i);
      variance += v;
      sentenceSize_ += u;
    }
    
    variance /= frequency;
    sentenceSize_ /= frequency;
    //if(maxWordVariance>0)
    //variance = map(variance,0,maxWordVariance,0,1);
    //else println(a);
    //variance = variance/frequency;
    
    for(int i=0;i<pos.size();i++){
      int v = pos.get(i);
      
      p += v;
      //println(v);
      if(i==pos.size()-1){
        p/= pos.size();
        p = (int)map(p,0,longest_sentence,0,1);
        //variance = map(variance,0,max_size,0,1);
        varianced = true;
    }}}
    
  };
  
  public void setVariance(){
    //variance = map(variance,0,maxVariance,0,100000);
    //variance = map(variance,0,maxWordVariance*maxWordVariance,0,10);
  }
  
  
};

};
class Dock{

    float x,y,w,h,currentWidth,currentHeight;
    ArrayList<String> names = new ArrayList<String>();
    ArrayList<Button> buttons = new ArrayList<Button>();
    ArrayList<PGraphics> canvases = new ArrayList<PGraphics>();
    ArrayList<Object> objects = new ArrayList<Object>();
    boolean update,vertical,horizontal,mdown;
    String loc;
    Object currentObject;
    Object parent;

    Dock(float x,float y,float w,float h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    };

    Dock(float x,float y,float w,float h,Object parent){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        this.parent = parent; 
    };

    public void add(tab t){
      String loc = t.label;
      PGraphics canvas = createGraphics((int)textWidth(loc)+20,20);
      canvases.add(canvas);
      Button b = new Button(currentWidth,y,textWidth(loc)+20,20,loc);

      b.togglebox = true;
      buttons.add(b);
      objects.add(t);
      currentWidth += textWidth(loc)+20;
      names.add(loc);
    };

    public void logic(){
        
        if(mousePressed&&pos()&&!mdown){
            loc = BMS.currentMouseObject;
            currentObject = BMS.currentObject;
            update = false;
            mdown = true;
        }
        
        if(!update&&mdown&&!mousePressed&&pos()&&!names.contains(loc)){
            update = true;
            mdown = false;
        }
        if(pos()&&update&&loc!=null&&!names.contains(loc)){
            BMS.currentMouseObject = null;
            BMS.currentObject = null;
            PGraphics canvas = createGraphics((int)textWidth(loc)+20,20);
            canvases.add(canvas);
            
            Button b = new Button(currentWidth,y,textWidth(loc)+20,20,loc);

            b.togglebox = true;
            buttons.add(b);

            objects.add(currentObject);
            currentWidth += textWidth(loc)+20;

            names.add(loc);
            update = false;
            mdown = false;
            loc = null;
            currentObject = null;
        }
        if(!mousePressed){
            mdown = false;
        }
    };

    public void draw(){

        // canvas.beginDraw();

        // canvas.endDraw();
        // image(canvas,x,y);

    };

    public void draw(PGraphics canvas){

        canvas.beginDraw();

        canvas.endDraw();
        image(canvas,x,y);

    };

    public void drawItems(){
        
        for(int i=0;i<buttons.size();i++){
          Button b = buttons.get(i);
          canvases.get(i).beginDraw();
          
          b.x = 1;
          b.y = 1;
          b.mouse = getMouse(b);
          
          if(b.pos(b.mouse))b.highlight();
          
          //println(objects.get(i));
          b.draw(canvases.get(i));
          b.toggle(objects.get(i),"visible",canvases.get(i));
          canvases.get(i).endDraw();
          image(canvases.get(i),b.bx,b.by);
        }
        if(pos()&&mousePressed){
          noFill();
          stroke(0);
          strokeWeight(2);
          rect(x,y,w,h);
        }
    };

    public PVector getMouse(Button b){

        return new PVector(mouseX-x-b.bx,mouseY-y);
    };

    public PVector getMouse(){

        return new PVector(mouseX-x,mouseY-y);
    };

    public boolean pos(){
        return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
    };

    public boolean pos(PVector mouse){
        return mouse.x>x&&mouse.x<x+w&&mouse.y>y&&mouse.y<y+h;
    };

};
class Dropdown extends Menu {

  Slider slider;
  float windowx,bwindowx,hiddenw;
  int dcount,windowSize = 5;
  boolean dclick,visible = true,dclose,draggable,mcoord;
  Button title;
  Boundary boundary;
  PVector mouse;
  tab parentTab;
  Menu subMenu;
  Dropdown dMenu;

  Dropdown() {
    
  };

  Dropdown(float xx, float yy, float ww, float h, String[] Labels) {
    dmenu = true;
    
    x = xx;
    y = yy;
    bx = x;
    by = y;
    
    w = ww;
    
    setLabels(Labels);
    h = 20;
    
    windowx = windowSize * 20;
    bwindowx = windowx;
    boundary = new Boundary(x,y,w,h,4);
  };


  Dropdown(float xx, float yy, float ww, String[] Labels) {

    dmenu = true;
    x = xx;
    y = yy;
    bx = x;
    by = y;
    
    w = ww;

    setLabels(Labels);
    if(Labels.length>5)setSlider();
    h = 20;
    
    windowx = windowSize * 20;
    bwindowx = windowx;
    boundary = new Boundary(x,y,w,h,4);
  };
  
  Dropdown(float xx, float yy, float ww, String l, String[] Labels) {

    dmenu = true;
    x = xx;
    y = yy;
    bx = x;
    by = y;
    
    w = ww;
    
    label = l;
    blabel = l;
    
    setLabels(Labels);
    h = 20;
    windowx = windowSize * 20;
    if(Labels.length>5)setSlider();
    bwindowx = windowx;
    boundary = new Boundary(x,y,w,h,4);
  };
  


  Dropdown(float xx, float yy, float ww, String l, String[] Labels, int k) {

    dmenu = true;
    x = xx;
    y = yy;
    bx = x;
    by = y;
    
    w = ww;
    
    label = l;
    blabel = l;
    
    windowx = windowSize * 20;
    bwindowx = windowx;
    setLabels_(Labels);
    if(Labels.length>5)setSlider_();
    h = 20;
    boundary = new Boundary(x,y,w,h,4);
  };

  Dropdown(float xx, float yy, float ww, String[] Labels, int k) {

    dmenu = true;
    x = xx;
    y = yy;
    w = ww;
    h = 20 * (k + 1);
    bx = x;
    by = y;
    
    windowx = windowSize * 20;
    bwindowx = windowx;
    setLabels(Labels);
    if(Labels.length>5)setSlider();
    boundary = new Boundary(x,y,w,h,4);
  };
  
  public void labelsToArray(String []a){
    for (int i=0; i<a.length; i++) {
      String s = a[i];
      
      labels.add(s);
      
    }
  };

  public void setLabels(String[] a) {
    
    if (label==null) label = a[0];
    float mwidth = w;
    title = new Button(x,y,w,20,label);
    title.parent = this;
    
    for (int i=0; i<a.length; i++) {

      Button b =null;
      if(textWidth(a[i])>mwidth) mwidth = textWidth(a[i]+20);
    }
    for (int i=0; i<a.length; i++) {

      Button b =null;
      if(textWidth(a[i])>mwidth) mwidth = textWidth(a[i]);
      if(a.length<5) b = new Button(x, (y + 20) + 20 * i, mwidth, 20,a[i]);
      else b = new Button(x, (y + 20) + 20 * i, mwidth - 10, 20,a[i]);

      b.border = false;
      b.togglebox = true;
      //b.parent = this;
      b.visible = true;
      items.add(b);
    }
    
    w = mwidth;
    
  };
  
  public void setLabels_(String[] a) {
    
    if (label==null) label = a[0];
    float mwidth = w;
    title = new Button(x,y,w,20,label);
    title.parent = this;
    
    for (int i=0; i<a.length; i++) {

      Button b =null;
      if(textWidth(a[i])>mwidth) mwidth = textWidth(a[i]+20);
    }
    for (int i=0; i<a.length; i++) {

      Button b =null;
      if(textWidth(a[i])>mwidth) mwidth = textWidth(a[i]);
      if(a.length<5) b = new Button(x, (y + 20) + 20 * i, mwidth, 20,a[i]);
      else b = new Button(x, (y + 20) + 20 * i, mwidth - 10, 20,a[i]);

      b.border = false;
      b.togglebox = true;
      //b.parent = this;
      b.visible = true;
      items.add(b);
    }
    
    hiddenw = mwidth;
    
  };

  public void setSlider() {
    slider = new Slider(x + w - 10, y + 20, 10, 20*5);
    slider.vertical = true;
    slider.bar = true;
    slider.classic = true;
    slider.visible = true;
    slider.valuex = 0;
    slider.vertical = true;
    slider.tvisible = false;
  };
  
  public void setSlider_() {
    slider = new Slider(x + hiddenw - 10, y + 20, 10, 20*5);
    slider.vertical = true;
    slider.bar = true;
    slider.classic = true;
    slider.visible = true;
    slider.valuex = 0;
    slider.vertical = true;
    slider.tvisible = false;
  };
  
  public void displayDropdown(){
    fill(255);
    
    if(items.size()>0){
      drawLabel();
      selfClick();
      drawButtons();
      drawSlider();
      drawDragbox();
      drag();
      
      if (pos()||(dclick&&subPos()))menu = true;
      if(dMenu!=null){
        dMenu.x = x + w;
        dMenu.y = y;
      }
      if(subMenu!=null){
        subMenu.x = x + w;
        subMenu.y = y;
      }
      drawSubMenu();
    }
  };

  public void drawSubMenu(){
    if(subMenu!=null){
      if(subMenuPos())subMenu.show = true;
      if(pos()&&!subMenuPos())subMenu.show = false;
    }
    if(subMenu!=null&&subMenu.show)subMenu.trace();
    if(dMenu!=null&&subMenuPos())dMenu.displayDropdown();
  };

  public void drawSubMenu(PVector mouse){
    if(subMenu!=null&&subMenuPos(mouse))subMenu.show = true;
    //else if(subMenu!=null)subMenu.show = false;
    if(subMenu!=null)subMenu.trace();
    if(dMenu!=null&&subMenuPos(mouse))dMenu.displayDropdown();
  };
  
  public void displayDropdown(PGraphics canvas){
    fill(255);
    
    if(items.size()>0){
      drawLabel(canvas);
      selfClick(mouse);
      drawButtons(canvas);
      drawSlider(canvas);
      drawDragbox(canvas);
      drag(mouse);
      drawSubMenu(mouse);
      if (pos(mouse)||(dclick&&subPos(mouse))||(dMenu!=null&&dMenu.menu)||(subMenu!=null&&subMenu.menu))menu = true;
      else menu = false;
      if(dMenu!=null){
        dMenu.x = x + w;
        dMenu.y = y;
      }
      if(subMenu!=null){
        subMenu.x = x + w;
        subMenu.y = y;
      }
    }
  };
  
  public void drawButtons(){
    
    dcount = 0;

      if(dclick&&slider!=null){
        
        fill(255);
        rect(x,y+h,w,slider.h);
        fill(0,150);
        rect(x,y+h,w,slider.h);
      }



    for(int i=0;i<items.size();i++){
      Button b = items.get(i);
      
      if(drag){
        b.x = x;
        b.y = y + 20 + 20 * i;
        b.by= y + 20 + 20 * i; 
      }
      
      if(slider!=null&&slider.mdown)b.y = b.by - slider.value*20;
      
      if(slider!=null){
        
      if(!slider.mdown){
      if(!dclick)b.visible = false;
      else if(b.y + b.h < y + h + windowx+1) b.visible = true;
        
      }
      else {
        if(b.y + b.h > y + h + windowx+1||b.y<y+h-1)b.visible = false;
        else b.visible = true;
      }}
      else{
        if(!dclick)b.visible = false;
        else b.visible = true;
        
        b.x = x;
        b.y = y + 20 + 20 * i;
      }
      if(b.y<y+h-1)b.visible = false;
      if(b.visible){
        
        b.draw();
        b.highlight();
        if(b.pos(mousePos))dcount++;
      }

      if(slider!=null){
    
      if(mousePressed&&b.pos(mousePos)&&b.visible&&!slider.mdown){
          label = b.label;
          index = i;
          dclick = false;
      }
    }
      else{
        if(mousePressed&&b.pos(mousePos)&&b.visible){
          label = b.label;
          index = i;
          dclick = false;
      }}}
      if(slider!=null){if(dcount==0&&mousePressed&&!pos(mousePos)&&!slider.pos(mousePos)&&!slider.mdown)dclick = false;}
      else if(dcount==0&&mousePressed&&!pos(mousePos))dclick = false;
      //if(mdown2)dclick
  };
  
  public void drawButtons(PGraphics canvas){
    
    dcount = 0;
      if(dclick&&slider!=null){
        canvas.fill(255);
        canvas.rect(x,y+h,w,slider.h);
        canvas.fill(0,150);
        canvas.rect(x,y+h,w,slider.h);
      }

    for(int i=0;i<items.size();i++){
      
      Button b = items.get(i);
      
      if(drag){
        b.x = x;
        b.y = y + 20 + 20 * i;
        b.by= y + 20 + 20 * i; 
      }
      
      if(slider!=null&&slider.mdown)b.y = b.by - (slider.value);
      
      if(slider!=null){
      if(!slider.mdown){
        //println(items.size());
      if(!dclick)b.visible = false;
      else if(b.y + b.h < y + h + windowx+1) b.visible = true;
        
      }else {
        if(b.y + b.h > y + h + windowx+1||b.y<y+h-1)b.visible = false;
        else b.visible = true;
        
      }}else{
        if(!dclick)b.visible = false;
        else b.visible = true;
      }
      if(b.y<y+h-1)b.visible = false;
      if(b.visible){
        b.mouse = mouse;
        //b.parentCanvas = true;
        b.draw(canvas);
        
        b.highlight(mouse);
        if(b.pos(mouse))dcount++;
      }
      
      if(slider!=null){
    
      if(mousePressed&&b.pos(mouse)&&b.visible&&!slider.mdown){
          label = b.label;
          index = i;
          dclick = false;
      }} else{
        if(mousePressed&&b.pos(mouse)&&b.visible){
          label = b.label;
          index = i;
          dclick = false;
      }}}
      if(slider!=null){if(dcount==0&&mousePressed&&!pos(mouse)&&!slider.pos(mouse)&&!slider.mdown)dclick = false;}
      else if(dcount==0&&mousePressed&&!pos(mouse))dclick = false;
  };
  
  public void drawBoundary(){
    
    if(draggable){
      if(border)boundary.draw2();
      drag();
    }
    
  };
  
  public void drawDragbox(){
    
    if(draggable){
      fill(255);
      rect(x,y - 10,w,10);
      fill(0,50);
      rect(x,y - 10,w,10);
    }
    
  };
  
  public void drawDragbox(PGraphics canvas){
    
    if(draggable){
      canvas.fill(255);
      canvas.rect(x,y - 10,w,10);
      canvas.fill(0,50);
      canvas.rect(x,y - 10,w,10);
    }
    
  };
  
  
  public void drawSlider(){
    if(drag&&slider!=null){
      slider.x = x + w - 10;
      slider.y = y + 20;
    }
    if(slider!=null&&dclick){
    slider.draw();
    slider.mouseFunctions();
    slider.set(0,(items.size()-5)*20);
    }
  };
  
  public void drawSlider(PGraphics canvas){
    if(drag&&slider!=null){
      slider.x = x + w - 10;
      slider.y = y + 20;
    }
    if(slider!=null&&dclick){
        slider.mouse = mouse;
        slider.draw(canvas);
        slider.mouseFunctions(mouse);
        //slider.set(0,500);
        slider.set(0,(items.size()-5)*20);
    }
  };
  
  public void drawLabel(){
    
    fill(255);
    rect(x,y,w,h);
    if(pos())fill(0,100);
    fill(0,150);
    rect(x,y,w,h);
    fill(255);
    text(label,x+2,y+tsize+2);
    
  };
  
  public void drawLabel(PGraphics canvas){
    
    canvas.fill(255);
    canvas.rect(x,y,w,h);
    canvas.fill(0,150);
    if(pos())fill(0,100);
    canvas.rect(x,y,w,h);
    canvas.fill(255);
    canvas.text(label,x+2,y+tsize+2);
    
  };
  
  public void drag(){
    if(slider!=null){
    if(dpos()&&mousePressed&&!drag&&!slider.mdown){
      if(draggable){
        drag = true;
        dx = x - mouseX;
        dy = y - mouseY;
        mdown = true;
      }}}
      else{
        if(dpos()&&mousePressed&&!drag){
          if(draggable){
        drag = true;
        dx = x - mouseX;
        dy = y - mouseY;
        mdown = true;
      }}}
    
    if(drag){
      x = mouseX + dx;
      y = mouseY + dy;
    }
    
    if(!mousePressed){
      dx = 0;
      dy = 0;
      drag = false;
    }
  };
  
  public void drag(PVector m){
    if(slider!=null){
    if(dpos(mouse)&&mousePressed&&!drag&&!slider.mdown){
      if(draggable){
        drag = true;
        dx = x - m.x;
        dy = y - m.y;
        mdown = true;
      }}}else{
        if(dpos(mouse)&&mousePressed&&!drag){
          if(draggable){
        drag = true;
        dx = x - m.x;
        dy = y - m.y;
        mdown = true;
      }}}
    
    if(drag){
      x = m.x + dx;
      y = m.y + dy;
    }
    
    if(!mousePressed){
      dx = 0;
      dy = 0;
      drag = false;
    }
  };
  
  public void selfClick(){
    mousePos = new PVector(mouseX,mouseY);
    if(slider!=null){
    if(BMS.dropDownObject==null&&pos(mousePos)&&mousePressed&&!mdown&&!dclick&&!slider.mdown&&!drag){
      
        BMS.dropDownObject = this;
        println("Slider",BMS.dropDownObject);
        dclick = true;
        mdown = true;
    }
    if(pos(mousePos)&&mousePressed&&!mdown&&dclick&&!slider.mdown&&!drag){
        dclick = false;
        mdown = true;
    }}
    else{
      
      if(BMS.dropDownObject==null&&pos(mousePos)&&mousePressed&&!mdown&&!dclick&&!drag){
        
        println("null slider", BMS.dropDownObject);
        dclick = true;
        mdown = true;
    }
    if(pos(mousePos)&&mousePressed&&!mdown&&dclick&&!drag){
        dclick = false;
        mdown = true;
    }}
    if(!mousePressed)mdown = false;
  };
  
  public void selfClick(PVector mouse){
    if(slider!=null){
    if(BMS.dropDownObject==null&&pos(mouse)&&mousePressed&&!mdown&&!dclick&&!slider.mdown&&!drag){
        BMS.dropDownObject = this;
        println("c Slider",BMS.dropDownObject);
        dclick = true;
        mdown = true;
    }
    if(pos(mouse)&&mousePressed&&!mdown&&dclick&&!slider.mdown&&!drag){
        dclick = false;
        mdown = true;
    }}
    else{
      if(BMS.dropDownObject==null&&pos(mouse)&&mousePressed&&!mdown&&!dclick&&!drag){
        BMS.dropDownObject = this;
        println("c Slider null",BMS.dropDownObject);
        dclick = true;
        mdown = true;
    }
    if(pos(mouse)&&mousePressed&&!mdown&&dclick&&!drag){
        dclick = false;
        mdown = true;
    }}
    if(!mousePressed)mdown = false;
  };
  
  public void toggled(int i,Object o,String c){
    Button b = items.get(i);
    
    if(b.visible)b.toggle2(o,c);
    
  };
  
  public void sptoggled(Object o,String c){
    
    for(int i=0;i<items.size();i++){
      Button b = items.get(i);
      if(b.visible)b.toggle3(o,c);
      if(!b.pos()&&mousePressed)b.toggle=0;
    }
    
  };
  
  public boolean subPos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y+20&&mouseY<y+20+items.size()*20;
  };
  
  public boolean subPos(PVector m){
    return m.x>x&&m.x<x+w&&m.y>y+20&&m.y<y+20+items.size()*20;
  };
  
  public boolean dpos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y-10&&mouseY<y;
  };
  
  public boolean dpos(PVector m){
    return m.x>x&&m.x<x+w&&m.y>y+20&&m.y<y;
  };

  public boolean subMenuPos(){
    return mouseX>x+w-20&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  };

  public boolean subMenuPos(PVector m){
    return m.x>x+w-20&&m.x<x+w&&m.y>y&&m.y<y+h;
  };
};
public void spawnRaces(String a, int b,int num){
  entities = new ArrayList<Entity>();
  Entity e = new Entity(23,20,W-46,H-90);
  e.ent = entities.size();
  e.hRaces = b;
  int pos = entities.size();
  float a1 = 0;
  
  for(int i=0;i<8;i++){
    e.oscilators.add(a1);
    e.oscilatorCounters.add(a1);
  };
  //e.saveEntities.checkLocation(e.saveLocations[0]);
  
  // e.saveEntities.location = e.saveLocations[0];
  // e.saveEntities.folderPath = "entities"; 
  // e.saveLocation = e.saveLocations[0];
  if(a=="Human"||a=="human"||a=="humans"||a=="Humans"){
    
    for(int i=0;i<b;i++){
      
      ArrayList<Human> race = new ArrayList<Human>();
      int c = color(random(255),random(255),random(255));
      
      float r = random(10,20);
      //r = 10;
      float br = random(r*2,50);
      float vlimit = random(5,10);
      vlimit = 5;
      float alimit = random(0.1f,0.9f);
      alimit = 0.1f;
      float min = random(r*2,50);
      float m = 0;
      for(int j=0;j<num;j++){
        Human h = new Human(random(W),random(H),j,i,pos,c);

        h.scene = e.scene;

        h.radius = r + random(-m,m);

        h.oscilators = e.oscilators;

        h.oscilatorCounters = e.oscilatorCounters;

        h.breathingroom = br + random(-m,m);

        h.vlimit = vlimit + random(-m,m);

        h.vlimitb = h.vlimit;

        h.alimit = alimit+ random(-m,m);

        h.alimitb = alimit;

        h.mass = h.radius*0.4f+ random(-m,m);

        h.min = min+ random(-m,m);

        h.minb = h.min;
        race.add(h);
    }
    e.Humans.add(race);

    }
    //e.saveEntities.close();

      for(int k=0;k<b;k++){
        //e.saveEntities.write_("[");
        for(int l=0;l<b;l++){
          e.Humans.get(k).get(0).seekNeighbour.add(PApplet.parseFloat(-1));
          e.Humans.get(k).get(0).avoidNeighbour.add(PApplet.parseFloat(-1));
          e.Humans.get(k).get(0).alignNeighbour.add(PApplet.parseFloat(-1));
          e.Humans.get(k).get(0).prox2.add(new ArrayList<Human>());
        }
        float maxAvoid = 0;
        float minAvoid = 1000000;
        float maxSeek = 0;
        float minSeek = 1000000;
        float minAlign = 1000000;
        float maxAlign = 0;
        float maxRange = 0;
        float minRange = 100000;
        for(int l=0;l<b;l++){
          int p = floor(random(20));
          int p1 = floor(random(20));
          int p2 = floor(random(20));
          if(l!=k){
            
            if(p>=10){
              float m1 = random(0,50);
              e.Humans.get(k).get(0).seekNeighbour.set(l,m1);
              e.Humans.get(k).get(0).maxSeek = maxSeek;
              e.Humans.get(k).get(0).minSeek = minSeek;
              if(a1>maxSeek)maxSeek = m1;
              if(a1<minSeek)minSeek = m1;
            }
              else e.Humans.get(k).get(0).seekNeighbour.set(l,PApplet.parseFloat(-1));

            if(p1>=10){
              float m1 = random(0,50);
              e.Humans.get(k).get(0).avoidNeighbour.set(l,m1);
              if(a1>maxAvoid)maxAvoid = m1;
              if(a1<minAvoid)minAvoid = m1;
            }
              else e.Humans.get(k).get(0).avoidNeighbour.set(l,PApplet.parseFloat(-1));

            if(p2>=10){
              float m1 = random(0,50);
              e.Humans.get(k).get(0).alignNeighbour.set(l,m1);
              e.Humans.get(k).get(0).maxAlign = maxAlign;
              e.Humans.get(k).get(0).minAlign = minAlign;
              if(a1<minAlign)minAlign = m1;
              if(a1>maxAlign)maxAlign = m1;
            }
              else e.Humans.get(k).get(0).alignNeighbour.set(l,PApplet.parseFloat(-1));
            
            e.Humans.get(k).get(0).maxRange = maxRange;
            e.Humans.get(k).get(0).minRange = minRange;
            
      }
      if(l==k){
        e.Humans.get(k).get(0).seekNeighbour.set(k,PApplet.parseFloat(-1));
        
        e.Humans.get(k).get(0).avoidNeighbour.set(k,PApplet.parseFloat(-1));
        e.Humans.get(k).get(0).alignNeighbour.set(k,PApplet.parseFloat(-1));
        
      }}}
       e.save();
      }

  if(a=="Plant"||a=="plant"||a=="plants"||a=="Plants"){
    for(int i=0;i<b;i++){

      ArrayList<Plant> species = new ArrayList<Plant>();

      for(int j=0;j<num;j++){

        Plant p = new Plant(random(W),random(H),i,j,pos);

        p.scene = e.scene;

        species.add(p);

    }e.Plants.add(species); }}
  if(a=="Mineral"||a=="mineral"||a=="minerals"||a=="Minerals"){
    for(int i=0;i<b;i++){

      ArrayList<Mineral> species = new ArrayList<Mineral>();

      for(int j=0;j<b;j++){

        Mineral m = new Mineral(random(W),random(H),i,j,pos);

        m.scene = e.scene;

        species.add(m);

    }e.Minerals.add(species); }}

  if(a=="Animal"||a=="animal"||a=="Animals"||a=="animals"){
    for(int i=0;i<b;i++){

      ArrayList<Animal> species = new ArrayList<Animal>();

      for(int j=0;j<num;j++){

        Animal A = new Animal(random(W),random(H),i,j,pos);

        A.scene = e.scene;

        species.add(A);

    }e.Animals.add(species); }}

  if(a=="Metals"||a=="metal"||a=="metals"||a=="Metals"){
    for(int i=0;i<b;i++){

      ArrayList<Metal> type = new ArrayList<Metal>();

      for(int j=0;j<num;j++){

        Metal m = new Metal(random(W),random(H),i,j,pos);

        m.scene = e.scene;

        type.add(m);

    }e.Metals.add(type); }
  }

  entities.add(e);

  if(entities.size()==b){

    for(int i=0;i<entities.size();i++){

         //Entity e = entities.get(i).Humans.get(0);
         
         
    }}
};

public void textbox(Button a,Object b){

}

class fileInput{
  String value,location;
  boolean click = false,folder,counted,fileSelect,toggle,folderSelect;
  float x,y,w = width,h = height;
  Button parent;
  String [] values;
  File []files;
  ArrayList<String>fileNames = new ArrayList<String>();
  HashMap<String, ArrayList<Integer>> extensions = new HashMap<String, ArrayList<Integer>>();

  fileInput(){
  };

  fileInput(boolean b){
    folder = true;
  };

  fileInput(Button b){
    
    x = b.x;
    y = b.y;
    w = b.w;
    h = b.h;
    parent = b;
  };

  fileInput(Button b,boolean a){
    
    x = b.x;
    y = b.y;
    w = b.w;
    h = b.h;
    parent = b;
    folder = true;
  };

  fileInput(Button b,boolean a,Object o){
    
    x = b.x;
    y = b.y;
    w = b.w;
    h = b.h;
    parent = b;
    folder = true;

  };

  public String getFile(){
    
    String s = value;
    value = null;
    return s;
  };

  public void setLink(Button b){
    x = b.x;
    y = b.y;
    w = b.w;
    h = b.h;
  };
  

  public String []getFolder(){
    String []s = values;
    values = null;
    return s;
  };

  public void saveLocation(String location){
    this.location = location;
  };

  public void listen(){
    if(!folder){
      if(pos()&&click()){
        selectInput("Select a file to process:", "fileSelected");
        fileSelect = true;
      }}else {
        if(pos()&&click()){
          selectFolder("Select a file to process:", "folderSelected");
          folderSelect = true;
          
      }}

      if(BMS.File.value!=null){
        value = BMS.File.value;
        BMS.File.value = null;
        if(folder){
          values = listFileNames(value);
          files = listFiles(value);
        }

        //  println("Locationi: " + value);
      }

  };

  public void listen(PVector mouse){
    if(!folder){
      if(pos(mouse)&&click()){
        selectInput("Select a file to process:", "fileSelected");
        fileSelect = true;
      }}else {
        if(pos(mouse)&&click()){
          selectFolder("Select a file to process:", "folderSelected");
          folderSelect = true;
          
      }}

      if(BMS.File.value!=null){
        value = BMS.File.value;
        BMS.File.value = null;
        if(folder){
          values = listFileNames(value);
          files = listFiles(value);
        }

        //  println("Locationi: " + value);
      }

  };

  public void listen1(){
    click();
    if(!folder){
      if(click){
        selectInput("Select a file to process:", "fileSelected");
        value = BMS.File.value;
        BMS.File.value = null;
      }}else {
        if(click){
          selectFolder("Select a file to process:", "folderSelected");
          //value = BMS.File.value;
          BMS.File.value = null;
          //values = listNames(value);
      }}
  };
 
  public void listen_(){
    if(!folder)selectInput("Select a file to process:", "fileSelected");
    else selectInput("Select a file to process:", "folderSelected");
  };

  public void listExt() {

    if(values!=null&&!counted){
      for(int i=0;i<values.length;i++){

        File f = new File(values[i]);

        String type = getFileExtension(f);
        if(!extensions.containsKey(type)){
          ArrayList<Integer> n = new ArrayList<Integer>();
          n.add(i);
          extensions.put(type,n);
        }else extensions.get(type).add(i);
      }
    counted = true;
    }
  };

  public void getTextFiles(){


  };

  public void getImageFiles(){


  };

  public void getVideoFiles(){


  };

  public void getAudioFiles(){


  };

  public String []getFolder(String location) {

    String []names = listNames(location);

    if(names!=null&&!counted){
      for(int i=0;i<names.length;i++){

        File f = new File(names[i]);

        String type = getFileExtension(f);
        String[] m = match(names[i], "ubyte");

        if(m==null){
          if(!extensions.containsKey(type)){
            ArrayList<Integer> n = new ArrayList<Integer>();
            n.add(i);
            extensions.put(type,n);
            fileNames.add(names[i]);
          }else{
            extensions.get(type).add(i);
            fileNames.add(names[i]);
        }}
        else{
          if(!extensions.containsKey("ubyte")){
            ArrayList<Integer> n = new ArrayList<Integer>();
            n.add(i);
            extensions.put("ubyte",n);
            fileNames.add(names[i]);
          }else{
            extensions.get(type).add(i);
            fileNames.add(names[i]);
        }}}}

      String []s = new String[fileNames.size()];

      for(int i=0;i<fileNames.size();i++){
        s[i] = fileNames.get(i);
      }
      return s;
  };

  public boolean click(){
    boolean k = false;
    
        if (pos()&&mousePressed&&!click){
        click = true;
        k = false;
      }else if(click&&!mousePressed){
        k = true;
        click = false;
      }
    return k;
  };
    
  public boolean pos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  };

  public boolean pos(PVector mouse){
    return mouse.x>x&&mouse.x<x+w&&mouse.y>y&&mouse.y<y+h;
  };
  
};

public void fileSelected(File selection){
  if(selection != null)BMS.File.value = selection.getAbsolutePath();
  Location = selection.getAbsolutePath();
};

public void folderSelected(File selection) {
  if(selection != null){
    BMS.File.value = selection.getAbsolutePath();
    //println("Locationf: " + BMS.File.value);
    Location = selection.getAbsolutePath();
  }
};
class fileOutput {
  PrintWriter output;
  boolean save, onMouseUp, mdown, debug, append, appendFile, match,append2,overWrite;
  int counter, counter2;
  File file;
  String location, filePath,folderPath = "";

  fileOutput() {
    appendFile = true;
  };

  fileOutput(boolean a) {
    overWrite = true;
    appendFile = true;
  };

  fileOutput(String location) {
    appendFile = true;
    checkLocation(location);
    open();
  };
  
  fileOutput(String location, boolean m) {
    if(m)appendFile = true;
    checkLocation(location);
    open();
    file = dataFile(location);
    filePath = file.getPath();
  };

  public void checkLocation(String location){
    int count = 0;
    for(int i=location.length()-1;i>-1;i--){
      char c = location.charAt(i);

      if(c=='\\'){
        folderPath = location.substring(0,i);
        this.location = location.substring(i,location.length());
        count ++;
        break;
      }
    }
    if(count==0)this.location = location;

    String s1 = folderPath.replace("\\","");
    String s2 = this.location.replace("\\","");



    println("checkLocation: " + s1 + "\\" + counter + "\\" + s2);
  };

  public void update(String folder, String file,int counter ){
    //filePath = folder + "\\" + file;
    this.folderPath = folder +"\\";
    this.location = file;
    this.counter = counter;
    appendFile = false;
    overWrite = true;
  };

  public void saveData() {
    if (mdown()) {
      checkFile( location, append);
    }
    if (mdown)
      output.println(mouseX + ",+ " + mouseY);
    close();
  };

  public void open() {
    checkFile(location, append);
  };

  public void write(String s) {
    if(output!=null)output.println(s);
    else print("Create Save File");
  };

  public void write(float f) {
    output.println(str(f));
  };

  public void write_(String s) {
    output.print(s);
    if(output!=null){
      println("success",s);
      output.flush(); // Writes the remaining data to the file
      output.close(); // Finishes the file
    }else println("failed",location,folderPath);
  };

  public void write(String []s) {
    String s1 = "";
    for (int i=0; i<s.length; i++) {
      s1 += s[i];
    }
    if(s1!=null&&output!=null)output.println(s1);
  };

  public void close() {
    if(output!=null){
      output.flush(); // Writes the remaining data to the file
      output.close(); // Finishes the file
    }else println(location,folderPath);
  };

  public boolean onMouseUp() {
    boolean k = false;
    if (pos()&&!mousePressed&&onMouseUp) {
      onMouseUp = false;
    } else if (pos()&&mousePressed&&!onMouseUp) {
      output.println(counter);
      onMouseUp = true;
      k = false;
    } else if (onMouseUp&&!mousePressed) {
      k = true;
      onMouseUp = false;
      counter ++;
    }

    return k;
  };

  public boolean mdown() {
    boolean k= false;
    if (mdown)k = false;
    if (mousePressed&&!mdown) {
      mdown = true;
      k = true;
    }
    if (!mousePressed)mdown = false;    
    return k;
  };

  public boolean pos() {
    return mouseX>0&&mouseX<width&&mouseY>0&&mouseY<height;
  };

  public void checkFile(String location, boolean append) {
    if (appendFile) {

      file = dataFile(folderPath + "/" + location);
      filePath = file.getPath();
      filePath = filePath.replace(location, "");
      String[] list = null;
      if(debug)println("checkFile");
      if (listNames(filePath)!=null&&!match) {
        println(filePath);
        
        list = listNames(filePath);
        boolean b = false;
        for(int j=maxFolderSize;j>-1;j--){
          //println(j);
          if(b)break;
          counter = j;
          for (int i=list.length-1;i>-1; i--) {

            int n = PApplet.parseInt(list[i]);
            if (j == n){
              //println(j + ", " + list[i]);
              counter = j;
              b = true;
              break;
            }}}
          match = true;
          if(!b)counter = -1;
          if(counter>=0)counter = counter + 1;
          else counter = 0;
          
          //println(counter);
      }
      else{
       file = dataFile(folderPath + "/" + location);
       filePath = file.getPath();
       filePath = filePath.replace(location, ""); 
      }
      file = dataFile(folderPath + "/" + counter + location);
      filePath = file.getPath();
      appendFile = false;
      append = true;
    }
    if(file!=null&&(!file.exists()&&!append2)) {
      //output = createWriter("/data/" + folderPath + "/" + counter + location);
      //println("folderpath " + folderPath + "\\" + counter+"\\" + location);
    }

    if(overWrite||output == null){
      output = createWriter("/data/" + folderPath + "/" + counter + "/"+ location);
      //println("new folderpath " + folderPath + counter + "\\" + location);
      file = dataFile(folderPath + "/" + counter + "/" + location);
      filePath = file.getPath();
      filePath = filePath.replace(location, ""); 
    }
    if (debug) println(filePath);
    try {

      FileWriter fw = new FileWriter(file, append);///true = append
      BufferedWriter bw = new BufferedWriter(fw);
      output = new PrintWriter(bw);
    }
    catch(IOException ioe) {
      System.out.println("Exception ");
      ioe.printStackTrace();
      println(filePath);
    }
  };
};

public String[] listNames(String dir) {
  
  if(dir==null)return null;
  File file  = new File(dir);
  if (file.isDirectory()) {
    String names[] = file.list();
    return names;
  } else {
    // If it's not a directory
    return null;
  }
};

public int totalFiles(String dir) {
  File file  = new File(dir);
  if (file.isDirectory()) {
    String names[] = file.list();
    return names.length;
  } else {
    // If it's not a directory
    return -1;
  }
};

public String getFileExtension(File file) {
  String fileName = file.getName();
  if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
  return fileName.substring(fileName.lastIndexOf(".")+1);
  else return null;
};
class fileReader{

    String location;
    String []text;

    fileReader(){

    }

    fileReader(String location){
        this.location = location;
        text = loadStrings(location);
    }

    public void read(String location){
        this.location = location;
        text = loadStrings(location);
    }

};
class Tree{
  float x,y;
  
  
  Tree(){
    
  }
  
  
};

class SoundSpectrum{
  
  SoundFile Audio = null;
  Amplitude amp;
  
  FFT fft;
  AudioIn in;
  
  processing.sound.Sound s;
  public float volume = 0,offsetx,offsety;
  int bands,slices;
  PImage specImg;
  
  int frame,frame2,frames,count;
  boolean constructImage,debug;
  
  float[] spectrum = new float[bands];
  ArrayList<PVector> audio = new ArrayList<PVector>();
  ArrayList<ArrayList<PVector>> audio2 = new ArrayList<ArrayList<PVector>>();
  ArrayList<ArrayList<PVector>> visualiser = new ArrayList<ArrayList<PVector>>();
  ArrayList<PImage> audioSlices = new ArrayList<PImage>();
  ArrayList<GridImg> gridImages = new ArrayList<GridImg>();
  ArrayList<Image> imageProcesses = new ArrayList<Image>();
  GridImg imageGrid;
  
  PApplet sketchRef;
  tab parent;
  Window window;
  
  SoundSpectrum(processing.sound.Sound S, PApplet sketchRef_,int Bands,String loc){
    s = S;
    slices = 1;
    sketchRef = sketchRef_;
    s = new processing.sound.Sound(sketchRef);
    bands = Bands;
    // Create an Input stream which is routed into the Amplitude analyzer
    amp = new Amplitude(sketchRef_);
    Audio = new SoundFile(sketchRef_,loc);
    // Create an Input stream which is routed into the Amplitude analyzer
    fft = new FFT(sketchRef_, bands);
    
    //amp.input(audio);
    fft.input(Audio);
    Audio.play();
    //audio.amp(0.01);
    frames = Audio.frames();
    
  }
  
  SoundSpectrum(processing.sound.Sound S, PApplet sketchRef_,int Bands,int Slices,String loc){
    s = S;
    slices = Slices;
    sketchRef = sketchRef_;
    s = new processing.sound.Sound(sketchRef);
    bands = Bands;
    // Create an Input stream which is routed into the Amplitude analyzer
    amp = new Amplitude(sketchRef_);
    Audio = new SoundFile(sketchRef_,loc);
    // Create an Input stream which is routed into the Amplitude analyzer
    fft = new FFT(sketchRef_, bands);
    
    //amp.input(audio);
    fft.input(Audio);
    Audio.play();
    //audio.amp(0.01);
    frames = Audio.frames();
    
    load();
    int l = floor(sqrt(audioSlices.size()));
    GridImg imageGrid = new GridImg(parent.x + offsetx,parent.y + offsety,l,l,audioSlices);
    
    
  }
  
  SoundSpectrum(){
    
  }
  
  public void save(){
    
  };
  
  public void loadSave(){
    
  };
  
  public void load() { 
  
  //---------------------------------------------------------------------------------------------------
  // Map vertical mouse position to volume.
  float amplitude = map(mouseY, 0, height, 0.4f, 0.0f);

  // Instead of setting the volume for every oscillator individually, we can just
  // control the overall output volume of the whole Sound library.
  s.volume(0);
  //------------------------------------------------------------------------------------------------------
 
  if(Audio.isPlaying())analyse();
  else if(!constructImage)construct();
    
};

public void draw(){
  if(constructImage)display();
  debug();
}

public void play(){
  s.volume(1);
  Audio.play();
};

public void play(float a){
  Audio.play(a);
};

public void analyse(){
  fft.analyze(spectrum);
  audio2.add(new ArrayList<PVector>());
  visualiser.add(new ArrayList<PVector>());
  for(int i = 0; i < bands; i++){
  // The result of the FFT is normalized
  // draw the line for frequency band i scaling it up by 5 to get more amplitude.
  float k = map(i,0,bands,0,width);
  float y = map( (spectrum[i]),0,0.01f,0,height);
  
  float k1 = i;
  float y1 = map( (spectrum[i]),0,0.01f,0,255);
  
  colorMode(HSB);
  stroke(i,random(255),random(255));
  fill(i,random(255),random(255));
  audio.add(new PVector(k,y));
  audio2.get(frame).add(new PVector(k,height-y));
  visualiser.get(frame).add(new PVector(i,y1));
  //vertex(k,-y);
  stroke(i,random(255),random(255));
  //vertex(bar.x,bar.y);
  line(k,height,k,height -y);
  }
  //endShape(OPEN);
  fill(255);
  text("playing",100,100);
  frame ++;
};

public void construct(){
    colorMode(RGB);
    fill(255);
    text("Constructing",100,110);
    
    specImg = createImage(bands,frame,RGB);
    specImg.loadPixels();
    loadPixels();
    
    for(int i = 0; i < visualiser.size(); i++){
      ArrayList<PVector> b = visualiser.get(i);
      for(int j = 0; j < b.size(); j++){
        
        int pos = j+i*b.size();
        PVector p = b.get(j);
        
        specImg.pixels[pos] = color(255-p.y,map(i,0,255,0,height),255-p.y);
        
        pixels[pos] = color(random(255),0,0);
      }}
      updatePixels();
      specImg.updatePixels();
      
    if(slices>1&&audioSlices.size()<slices){
      PImage img = createImage(bands,frame/slices,RGB);
      
      count = 0;
      for(int i = 0; i < visualiser.size(); i++){
        
        ArrayList<PVector> b = visualiser.get(i);
        
          for(int j = 0; j < b.size(); j++){
            if(count==0)img.loadPixels();
            
            int pos = j+i*b.size();
            PVector p = b.get(j);
            
            img.pixels[count] = specImg.pixels[pos];
            count++;
            
            if(count>=(specImg.width*specImg.height)/2){
              img.updatePixels();
              if(audioSlices.size()<slices)audioSlices.add(img);
              img = createImage(bands,frame/slices,RGB);
              count = 0;
            }}}
      text(slices + " slices",100,110);
    }else{
      text("1 slice",100,110);
      audioSlices.add(specImg);
    }
    constructImage = true;
};

public void display(){
  fill(255);
  if(slices>1){
        for(int i = 0; i < audioSlices.size(); i++){
          image(audioSlices.get(i),0,0+i*audioSlices.get(i).height);
        }
        text(audioSlices.size() + " slices",100,110);
        text("stopped",100,100);
      
    }else{
      image(specImg,0,0); 
      
      text("1 slice",100,110);
      text("stopped",100,100);
      if(frame2<frame-1)frame2++;
      }
};

public void debug(){
  if(debug){
  fill(0);
  text(frameRate,200,200);
  text(frames,200,210);
  text(frame,200,220);
  text(audio2.size(),200,230);
  text(visualiser.size(),200,240);
  }
};
  
  
};

class TwitterKeyword{
  
  ArrayList<String> Keywords = new ArrayList<String>();
  public boolean toggle,addKeyword,showKeyword; 
  Menu keywords;
  String []keywordArray;
  int col = 255;;
  boolean arraySet;
  TwitterKeyword(String S){
    Keywords.add(S);
    keywords = new Menu(100,100,70,Keywords);
  };
  
  TwitterKeyword(String[] S){
    for(int i=0;i<S.length;i++){
      Keywords.add(S[i]);
    }
    
    keywords = new Menu(100,100,70,S,0);
  };
  
  TwitterKeyword(ArrayList<String> S){
    Keywords = S;
    keywords = new Menu(100,100,70,S);
  };
  
  public void showKeywords(){
    fill(col);
    for(int i=0;i<Keywords.size();i++){
      text(Keywords.get(i),100,100+10*i);
    }
  };
  
  public void addKeywords(String s){
    
    if(addKeyword&&arraySet){
      Keywords.add(s);
      arraySet = false;
    }
    
  };
  
  public void eventListener(){
    
  };
  
  public String [] getKeywords(){
    
    if(!arraySet){
      keywordArray = new String [Keywords.size()];
    for(int i=0;i<Keywords.size();i++){
      String s1 = Keywords.get(i);
      
      keywordArray[i] = s1;
      
    }arraySet = true;
    }
    return keywordArray;
  };
  
};

public class Grid {

  int id, rows, cols, imrows, imcols, camcols, camrows, tbcols, tbrows, ztoggle, ztoggle2, Rows, Cols, rowcount, colcount, totalAgents = 100, agentsCounted, squaresCounted,bcount,res,xRes,yRes,popCount;
  public int sides,octaves = 8;
  int totalpixels;
  public float x, y, z, xback, yback, zback, w, h, lim, acceleration, elasticity, depth, sealevel = 0, floorlevel = 0.2f,groundlevel = 0.4f,grasslevel = 0.6f, mountainlevel = 0.8f, flying, fx, fy, zoom, yrot, xrot, zrot, distance,perlx_xoff,perlx_yoff, perly_xoff,perly_yoff,noise1 = 0.05f,noise2,noise3, XX, YY, vdistance, hdistance, bordersize = 1, groundlevel2 = 100, posx, posy, dx, dy, imw, imh, camw, camh, mdist = 20, y_padding = -0.8f, x_padding= -1,pxfx, pxfy,pyfx, pyfy,map1 = 2,map2 = 4,seed,scale1 = 0.05f,freq = 1,freq1 = 1,freq2 = 1,freq3 = 3,amp = 1,amp1 = 1,amp2 = 1,amp3 = 1,scale2 = 0.05f,scale3 = 0.05f,scale,frequency,lacunarity,max,persistance,amplitude;
  float deltay, deltax;
  int C;
  public float convup = 0, convright = 0, convdown = 0, convleft = 0, threshold = 0, conv, convhp = 1, convvp = 1, convhn = -1, convvn = -1;
  float [][] perlx, perly, perlz, perlh, perlw, perld, perlr, perlg, perlb = new float[cols][rows], terrain;
  String label;
  public boolean trackmouse, drag, resize, init, border = true, fill = true, hover, count, wrap, move, collide, cloth, partition, bounce, mouse, forward = true, backward, pause, randcolor, graph, circular,load,sysUpdate, update,sUpdate, sdown,begin = true,contourUpdate,mdown,saveImage;
  public boolean visible = true, field = false, reset, heading, intersect, perlcolor, perlheight, isometric, topdown, particle, terrain2d, terrain3d, entity, floored = true, entities, circle,rect,save;
  public boolean colrepeat, rowrepeat, contour, brightness, camera, toggle, tbtoggle, dot, attractor, populateBoundaries, debug, popuateSpecies;
  ArrayList<PVector> octaveOffsets;
  //img bools
  public boolean im_init, imtoggle, normal_img, mouse_img, blur_img, linedetect_img, dot_img, imreset, refreshed, backup, bright, sharp, convolved, imgreset;
  //webcam bools
  public boolean cm_init, camtoggle, normal_cam, mouse_cam, blur_cam, linedetect_cam, dot_cam, camreset, webcam, menu, updateimage;
  // bools
  public boolean normal, mouse_interact, blur, linedetect, shape, imgworkflow;
  boolean array, agentsPopulated, mapScoped, neighboured,beginSquareSorting,sortBoundaries,terrainP= true,Boundaries,bbb,popPhase2;

  Window search;
  taskList workflow;
  String[] palleteLabels = {"Circle", "Hide", "Graph", "Attractor", "Forward", "Backwards", 
    "Pause", "Heading", "Save", "Load", "Contour", "Mouse", "Reset", 
    "Populate Boundaries", "Spawn Entities", "Debug","Save Image"};
  String []sliderLabels1 = {"Scale","Sea","Floor","Grass","Mountains","Distance","Height","hdistance","Xrot","Yrot","Zrot","xvar","Scale 1","Amp 1","Freq 1","Lacunarity","Persistance","Seed"};

  String []sliderLabels2 = {"Scale","Sea","Floor","Grass","Mountains","Distance","Height","hdistance","Xrot","Yrot","Zrot","xvar","Scale 1","Amp 1","Freq 1","Octaves","Lacunarity","Persistance","Seed"};

  Menu pallete;
  sliderBox sliderMenu;
  Img g1,g2;
  HashMap<String, String> workflow_link = new HashMap<String, String>();

  PImage current_image;
  PGraphics canvas,canvas2;
  PShape grid;
  
  int gridChildren;
  int [][] map;
  int [] map1d;
  float [][] mapNoise;
  float [] mapNoise1d;
  boolean [][] mapUpdate;
  boolean keyUpdate;

  //plain grid
  boolean plain;
  String test = "", link;
  PImage img, img1, cam, im, imgtemp;

  float [] b_kernel1d_ = {1/9, 1/9, 1/9, 1/9, 1/9, 1/9, 1/9, 1/9, 1/9};
  float[][] b_kernel2d_ = {{1/9, 1/9, 1/9}, 
    {1/9, 1/9, 1/9}, 
    {1/9, 1/9, 1/9}};

  float [] b_kernel1d = {1, 1, 1, 1, 1, 1, 1, 1, 1};
  float[][] b_kernel2d = {{1, 1, 1}, 
    {1, 1, 1}, 
    {1, 1, 1}};


  float [] sobelv1d = {convvn, 0, convvp, convvn, conv, convvp, convvn, 0, convvp};
  float [] sobelh1d = {convvn, 0, convvp, convvn, conv, convvp, convvn, 0, convvp};

  float[][] vkernel2d = {{convvn, 0, convvp }, 
    { convvn, 0, convvp }, 
    { convvn, 0, convvp }};

  float[][] hkernel2d = {{-1, -1, -1 }, 
    {0, 0, 0 }, 
    {1, 1, 1 }}; 

  float [] vkernel1d = {convvn, 0, convvp, convvn, conv, convvp, convvn, 0, convvp};

  float [] hkernel1d = {convhn, convhn, convhn, 0, conv, 0, convhp, convhp, convhp};

  float [] difflkernel1d = {0, 0, 0, -1, convleft, 0, 0, 0, 0}; 
  float [] diffrkernel1d = {0, 0, 0, 0, convright, -1, 0, 0, 0}; 
  float [] diffukernel1d = {0, -1, 0, 0, convup, 0, 0, 0, 0}; 
  float [] diffdkernel1d = {0, 0, 0, 0, convdown, 0, 0, -1, 0}; 

  HashMap<String, Boolean> values = new HashMap<String, Boolean>();
  HashMap<String, Float> floats = new HashMap<String, Float>();
  ArrayList<Grid_space> squares = new ArrayList<Grid_space>();
  ArrayList<Grid_space> unsortedSquares = new ArrayList<Grid_space>();
  ArrayList<ArrayList<Grid_space>> sortedSquares = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> wallSquares = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> unsortedWallSquares = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> sortedWallSquares = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<Grid_space> wallSquaresBackup = new ArrayList<Grid_space>();

  ArrayList<ArrayList<Grid_space>> boundaries = new ArrayList<ArrayList<Grid_space>>();

  ArrayList<Grid_space> agents = new ArrayList<Grid_space>();
  ArrayList<Grid_space> agentsBackup = new ArrayList<Grid_space>();
  ArrayList<Grid_space> agentsConst = new ArrayList<Grid_space>();
  ArrayList<Grid_space> sortedAgents = new ArrayList<Grid_space>();
  ArrayList<ArrayList<Grid_space>> popHist = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> sortedPopHist = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> popStack = new ArrayList<ArrayList<Grid_space>>();
  ArrayList<ArrayList<Grid_space>> connections = new ArrayList<ArrayList<Grid_space>>();

  ArrayList<Grid_space> table = new ArrayList<Grid_space>();
  ArrayList<Grid_space> imsquares = new ArrayList<Grid_space>();

  ArrayList<Boolean> walls = new ArrayList<Boolean>();
  ArrayList<PImage> images = new ArrayList<PImage>();
  ArrayList<Button> buttons = new ArrayList<Button>();

  ArrayList<Grid_space> camsquares = new ArrayList<Grid_space>();
  ArrayList<Grid_space> temp_rows = new ArrayList<Grid_space>();
  ArrayList<Grid_space> temp_cols = new ArrayList<Grid_space>();
  ArrayList<Grid_space> temp_rowe = new ArrayList<Grid_space>();
  ArrayList<Grid_space> temp_cole = new ArrayList<Grid_space>();

  Grid_space [][]squares2 = new Grid_space[rows][cols];

  ArrayList<Grid_space> temp = new ArrayList<Grid_space>();
  ArrayList<Grid_space> temp2 = new ArrayList<Grid_space>();
  ArrayList<Grid_space> tempSquares = new ArrayList<Grid_space>();

  ArrayList<Shape> shapes = new ArrayList<Shape>();
  String saveLocation = "terrain\\grids.txt";
  fileOutput output = new fileOutput(false);
  fileOutput outputImage = new fileOutput(false);
  fileInput input;
  String folder;

  //color col = color(255);
  Grid() {
  };

  Grid(float xx, float yy, float ww, float hh, int Row, int Col,boolean k) {
    
    sliderMenu = new sliderBox(40,360,90,5,sliderLabels2);
    
    x = xx;
    y = yy;
    xback = x;
    yback = y;

    w = ww;
    h = hh;

    rows = Row;
    cols = Col;

    bordersize = 1;

    perlx  = new float[cols][rows];
    perly = new float[cols][rows];
    perlz = new float[cols][rows];
    perlr  = new float[cols][rows];
    perlg = new float[cols][rows];
    perlb = new float[cols][rows];
    terrain = new float[cols][rows];

    perlheight = true;
    squares2 = new Grid_space[rows][cols];

    trackmouse = false;
    //totalAgents = rows/2;
    if (BMS.terrain3d) {
      terrain3d = true;
      terrain2d = false;
    }else{
      terrain3d = false;
      terrain2d = true;
    }

    pallete = new Menu(W-90, H/2, 70, palleteLabels);
    pallete.draggable = true;
    seed = random(1000000);
    //init();
  };

  Grid(float xx, float yy, float ww, float hh) {
    
    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    bordersize = 1;
    squares2 = new Grid_space[rows][cols];
    trackmouse = true;
  };

  Grid(float xx, float yy, float ww, float hh,int Res) {
    
    sliderMenu = new sliderBox(40,360,90,5,sliderLabels2);
    
    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    cols = PApplet.parseInt(ww/Res);
    rows = PApplet.parseInt(hh/Res);
    res = Res;
    map = new int[cols][rows];
    scale = 0.05f;
    seed = 10;
    seed = random(1000000);
    noiseSeed(PApplet.parseInt(seed));
    map = new int[cols][rows];
    map1d = new int[cols * rows];
    mapNoise = new float[cols][rows];
    mapNoise1d = new float[cols * rows];
    mapUpdate = new boolean[cols][rows];
    grid = createShape(GROUP);

    pallete = new Menu(W-90, H/2, 70, palleteLabels);
    pallete.draggable = true;
    input = new fileInput(pallete.items.get(9),true);
    
    visible = true;
    canvas = createGraphics(width,height);
    g1 = new Img((int)w - (int)x,(int)h-(int)y);
    g2 = new Img((int)w - (int)x,(int)h-(int)y);
    init2();
    
    rect = true;
    
    save();
  };

  
  Grid(float xx, float yy,float W,float H,int xRes,int yRes){
    
    cols = PApplet.parseInt(W/xRes);
    rows = PApplet.parseInt(H/yRes);
    scale = 0.05f;
    seed = 10;
    this.w = W;
    this.h = H;
    this.xRes = xRes;
    this.yRes = yRes;
    noiseSeed(PApplet.parseInt(seed));
    map = new int[cols][rows];
    map1d = new int[cols * rows];
    mapNoise = new float[cols][rows];
    mapNoise1d = new float[cols * rows];
    mapUpdate = new boolean[cols][rows];
    
    init3();
    canvas = createGraphics(width,height);
    g1 = new Img((int)w - (int)x,(int)h-(int)y);
  };
  
  //-3d-------------------
  Grid(float xx, float yy, float zz, float ww, float hh, float dd, int Col, int Row) {
    
    x = xx;
    y = yy;
    z = zz;
    xback = x;
    yback = y;
    zback = z;

    w = ww;
    h = hh;

    depth = dd;

    rows = Row;
    cols = Col;

    bordersize = 1;

    Cols = cols;
    Rows = rows;

    //totalAgents = rows;
    squares2 = new Grid_space[rows][cols];
    search = new Window( 50, 50, 200, 100, "C:\\Users\\paul goux\\");
  };
  //cam------------------------------------------------------
  Grid(float xx, float yy, int ww, int hh, String a) {

    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    rows = ww;
    cols = hh;
    if (a =="cam"||a == "Cam" || a == "CAM")camera = true;
    bordersize = 1;
    Cols = cols;
    Rows = rows;
    squares2 = new Grid_space[rows][cols];

    search = new Window( 50, 50, 200, 100, "C:\\Users\\paul goux\\");
  };
  //------------------------------------------------
  Grid(float xx, float yy, int ww, int hh, int Cols, int Rows, int Sides) {

    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    rows = Rows;
    cols = Cols;
    Cols = cols;
    Rows = rows;
    bordersize = 1;
    zrot = 0;
    shape = true;
    sides = Sides;
    perlx  = new float[cols][rows];
    perly = new float[cols][rows];
    perlz = new float[cols][rows];
    perlr  = new float[cols][rows];
    perlg = new float[cols][rows];
    perlb = new float[cols][rows];
    terrain = new float[cols][rows];
    randcolor = false;
    perlheight = true;
    squares2 = new Grid_space[rows][cols];
    fx = w/2;
    fy = h/2;
    pxfx = 0;
    pxfy = 0;
    pyfx = 0;
    pyfy = 0;
    trackmouse = true;
    zoom = 0;
    totalAgents = rows;
    terrain3d = false;
    terrain2d = false;
    search = new Window( 50, 50, 200, 100, "C:\\Users\\paul goux\\");
    pallete = new Menu(W-90, H/2, 70, palleteLabels);
    pallete.draggable = true;
  };
  //---------------image array-----------------------------------


  //-------------Table---------------------------------

  Grid(float xx, float yy, int ww, int hh) {

    x = xx;
    y = yy;
    xback = x;
    yback = y;
    w = ww;
    h = hh;
    rows = ww;
    cols = hh;

    bordersize = 1;
    Cols = cols;
    Rows = rows;
    squares2 = new Grid_space[rows][cols];
  };

  public void kernel_modifier() {
    //hkernel1d = {convhn, convhn, convhn, 0, conv, 0,convhp , convhp, convhp};

    hkernel1d[0] = convhn;
    hkernel1d[1] = convhn;
    hkernel1d[2] = convhn;
    hkernel1d[3] = 0;
    hkernel1d[4] = conv;
    hkernel1d[5] = 0;
    hkernel1d[6] = convhp;
    hkernel1d[7] = convhp;
    hkernel1d[8] = convhp;
    //vkernel1d = {convvn, 0, convvp, convvn, conv, convvp, convvn, 0, convvp};
    vkernel1d[0] = convvn;
    vkernel1d[1] = 0;
    vkernel1d[2] = convvp;
    vkernel1d[3] = convvn;
    vkernel1d[4] = conv;
    vkernel1d[5] = convvp;
    vkernel1d[6] = convvn;
    vkernel1d[8] = 0;
    vkernel1d[8] = convvp;
    difflkernel1d[4] = convleft;
    diffukernel1d[4] = convup;
    diffrkernel1d[4] = convright;
    diffdkernel1d[4] = convdown;
  };

  public void getFolder(){
    input.listen();
    if(Location!=null && input.fileSelect){
      println(Location);
      folder = Location;
      input.fileSelect = false;
      load = true;
      Location = null;
    }
  };

  public void grid_functions() {
    init();
    fill(255);
    if (init&&toggle) {
      load();
      display();
      getFolder();
      
      //draw_2d();
      if (populateBoundaries)popAgents();
      //if(populateBoundaries)seekBoundaries2();
      if (populateBoundaries)seekBoundaries();
      seekBoundaries3();
      //text(wallSquares.size(),W-50,100);
      //for(int i=wallSquares.size()-1;i>-1;i--){
      //  Grid_space g = wallSquares.get(i);
      //  fill(255,0,0,150);
      //  //noFill();
      //  if(contour)ellipse(g.x+g.w/2,g.y+g.h/2,g.w,g.h);
      //}
    }
  };

  public void gridFunctions() {
    init();
    fill(255);
    if (init&&toggle) {
      load();
      display();
      getFolder();
      
      //draw_2d();
      if (populateBoundaries)popAgents();
      //if(populateBoundaries)seekBoundaries2();
      if (populateBoundaries)seekBoundaries();
      seekBoundaries3();
      //text(wallSquares.size(),W-50,100);
      //for(int i=wallSquares.size()-1;i>-1;i--){
      //  Grid_space g = wallSquares.get(i);
      //  fill(255,0,0,150);
      //  //noFill();
      //  if(contour)ellipse(g.x+g.w/2,g.y+g.h/2,g.w,g.h);
      //}
    }
  };

  public void mouseLogic(){
    // if(!mousePressed){
    // amp = map(mouseY,0,height,1,2);
    // freq = map(mouseX,0,width,1,2);
    // }else{
      
    // }
    if(mouseX!=pmouseX||mouseY!=pmouseY) update = true;
    else update = false;
  };

  public void plainFunctions(){
    init();
    if(init&&toggle)drawPlain();

  };

  public void drawPlain(){

    for (int yy = 0; yy < rows-1; yy++) {

        if (terrain3d)beginShape(TRIANGLE_STRIP);
        float xoffr = fx;

        for (int xx = 0; xx< cols; xx++) {
          
          int pos = xx + yy * cols;
          Grid_space a = squares.get(pos);
          a.shape.draw();

        }}

  };

  public void shape_functions() {
  };

  public void waveform(PVector a) {
  };

  public void waveform(float a, float b) {
  };

  public void saveImage(){
    if(saveImage){
      g1.img.save("grid.jpg");
      saveImage = false;
    }
  };

  public void save() {
      output.checkLocation(saveLocation);
      output.open();
      String gridData = x + "," + y + "," + w + "," + h + "," + res + "," 
                        + seed + "," + fy + "," + pxfx + "," + pyfy;
      //String gridData = "";
      println(gridData);
      output.write(gridData);

      for(int i=0;i<squares.size();i++){
        Grid_space g = squares.get(i);
        String s = red(g.col) + "," + green(g.col) + "," + blue(g.col) + "," 
                   + red(g.col2) + "," + green(g.col2) + "," + blue(g.col2);
        output.write(s);
      }
      output.close();
      save = true;
      sliderMenu.save.update("terrain","sliders.txt",output.counter);
      sliderMenu.save();
  };

  public void load() {

    if(load &&folder!=null){
      println("load: " + folder);
      String [] temp = listNames(folder);

      String [] terrainValues = null;
      String [] sliderValues = null;
      
      if(temp!=null&&temp.length>=2){

        for(int i=0;i<temp.length;i++){

          String [] m = match(temp[i],"grids");
          String [] m1 = match(temp[i],"sliders");
          File f = null;
          if(m!=null){
            //f = new File(folder + temp[i]);
            terrainValues = loadStrings(folder + "\\" + temp[i]);
            println(temp[i]);
          }
          if(m1!=null){
            println(temp[i]);
            sliderValues = loadStrings(folder + "\\" + temp[i]);
          }
          if(sliderValues!=null&&terrainValues!=null)break;
          
        }
        if(terrainValues!=null&&sliderValues!=null){

          String []init_ = splitTokens(terrainValues[0], ",");

          x    = PApplet.parseFloat(init_[0]);
          y    = PApplet.parseFloat(init_[1]);
          w    = PApplet.parseFloat(init_[2]);
          h    = PApplet.parseFloat(init_[3]);
          res  = PApplet.parseInt(init_[4]);
          seed = PApplet.parseFloat(init_[5]);

          cols = PApplet.parseInt(w/res);
          rows = PApplet.parseInt(h/res);
          
          squares = new ArrayList<Grid_space>();
          Runtime.getRuntime().gc();
          canvas = createGraphics(width,height);
          g1 = new Img((int)w - (int)x,(int)h-(int)y);
          init2();

          for(int i=0;i<sliderValues.length;i++){
            sliderMenu.menu.sliders.get(i).value = PApplet.parseFloat(sliderValues[i]);
          }
          sealevel = sliderMenu.get(1);
          groundlevel = sliderMenu.get(2);
          grasslevel = sliderMenu.get(3);
          mountainlevel = sliderMenu.get(4);
          //input.values = null;
          sysUpdate = true;
          load = false;
        }else {
          println("No such file...");
          folder = null;
          load = false;
        }
      }
    }
  };
  
  public void init() {

    float WW = w/cols;
    float HH = h/rows;
    if (!init&&!array) {
      //squares = new ArrayList<Grid_space>();
      array = true;
    }

    if (toggle) {
      if (squares.size()<rows*cols) {
        if (circular) {

          for (int i=0; i<360; i+=WW) {
            for (int j=0; j<rows; j++) {

              float x1 = (x + WW * i);
              float y1 = (y + HH * j);
              float r = WW;

              x1 = x+w/2 + (r/2+1)*j * cos(i);
              y1 = y+h/2 + (r/2+1)*j * sin(i);
              int num = i + j * cols;
              Grid_space a = new Grid_space(x1, y1, WW, HH, num, i, j);
              a.lim = lim;
              randcolor = true;
              a.parent = this;
              if (randcolor) {
                a.col = color(random(255), random(255), random(255));
              }
              squares.add(a);
            }
          }
        } else {
          float theta=0, ratio=0, ratio2 = 0, wx=0, ww=0, ku=0, kuu=0, hh=0;
          if (shape) {
            theta = radians(360/sides);
            ratio = (HH)/2 * sin(theta);
            ratio2 = (HH)/2 * cos(theta);
            ww = ratio *2;
            hh = ratio2*2;
          }
          for (int yy = 0; yy < rows; yy++) {
            for (int xx = 0; xx< cols; xx++) {
              float x1 = (x + WW * xx);
              float y1 = (y + HH * yy);
              if (shape) {
                float k = pow(-1, yy);
                x1 = ww+x+(ww)*xx+ratio/2*k;
                y1 = hh+y+(hh*1.5f)*yy;
                WW=HH;
              }
              int num = xx + yy * cols;
              Grid_space a = new Grid_space(x1, y1, WW, HH, num, xx, yy);
              a.lim = lim;

              if (randcolor) a.col = color(random(255), random(255), random(255));
              
              a.parent = this;

              if (shape) {
                a.sides = sides;
                a.col = color(random(255), random(255), random(255));
                a.col2 = color(255);
                if (border)a.border = true;
                a.col2 = color(0);
                a.shape = new Shape(sides, a);
              }
              squares.add(a);
              //squares2[xx][yy] = a;
            }
          }
        }
      } else {
        //for(int xx=0;xx<rows;xx++){
        //  int pos = xx + 0 * rows;
        //  Grid_space a = squares.get(pos);
        //  //temp_cols.add(a);
        //}
        //for(int xx=0;xx<cols;xx++){
        //  int pos = 0 + xx * rows;
        //  Grid_space a = squares.get(pos);
        //}
        init = true;
        array = false;
      }

      if(reset){
        squares = new ArrayList<Grid_space>();
       init = false;
       zoom = 0;
       flying = 0;
       fx = 0;
       fy = 0;
       reset = false;

      }
    }
  };

  public void init2d() {

    float WW = w/res;
    float HH = h/res;

      if (squares.size()<rows*cols) {

          for (int yy = 0; yy < rows; yy++) {
            for (int xx = 0; xx< cols; xx++) {
              float x1 = x+xx * res;
              float y1 = y+yy * res;
              int num = xx + yy * cols;
              Grid_space a = new Grid_space(x1, y1, res, res, num, xx, yy);
              a.lim = lim;

              a.col = color(random(255), random(255), random(255));
              
              a.parent = this;

              squares.add(a);
              //squares2[xx][yy] = a;
            }
          }
        
      } 
    
  };

  public void init2(){
    octaveOffsets = new ArrayList< PVector>();
        for(int i=0;i<10;i++){
          float rx = random(-100000,100000);
          float ry = random(-100000,100000);
          octaveOffsets.add(new PVector(rx,ry));
        }
    grid = createShape(GROUP);
    canvas.beginDraw();
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          
          float yy = y + scale*i*freq;
          float xx = x + scale*j*freq;

          float x1 = x + j * res;
          float y1 = y + i * res;
          
          int p = j + i * cols;
          
          float n = noise(xx,yy);
          float height = map(n*amp,0,1,0,255);
          
          int col = 0;
          if(height>50)col = color(0, 0, 153);
          if(height>100)col = color(204, 204, 0);
          if(height>150)col = color(51, 153, 51);
          if(height>200)col = color(102, 102, 153);
          
          map[j][i] = col;
          mapNoise[j][i] = n;
          mapUpdate[j][i] = false;
          
          map1d[p] = col;
          mapNoise1d[p] = n;
          
          PShape rect = createShape(RECT,j*res,i*res,res,res);
          rect.setFill(col);
          grid.addChild(rect);
          gridChildren++;

          int num = j + i * cols;
          Grid_space a = new Grid_space(x1, y1, res, res, p, j, i);
          a.lim = lim;
          if(randcolor){
            a.col = color(random(255), random(255), random(255));
            a.col2 = a.col;
          }
          else {
            a.col = col;
            a.col2 = a.col;
          }
          a.parent = this;
          squares.add(a);
          canvas.fill(a.col);
          canvas.noStroke();
          canvas.rect(a.x,a.y,a.w,a.h);
        
      }}
      g1.img = canvas.get((int)x,(int)y,(int)w,(int)h);
      canvas.endDraw();
  };

  public void init3(){
    
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        
        float yy = scale*i*freq;
        float xx = scale*j*freq;
        int p = j + i * rows;
        noStroke();
        //float height = map(noise(xx,yy)*amp,0,1,0,255);
        float height = noise(xx,yy)*amp;
        int col = 0;
        
          if(height>0.2f)map[j][i] = color(0, 0, 153);
          if(height>0.4f)map[j][i] = color(204, 204, 0);
          if(height>0.6f)map[j][i] = color(51, 153, 51);
          if(height>0.8f)map[j][i] = color(102, 102, 153); 
        
        map[j][i] = col;
        mapNoise[j][i] = noise(xx,yy);
        mapUpdate[j][i] = false;
        if(p<map1d.length)map1d[p] = col;
    }}


  };

  public void timeControls(Grid_space a){

    if (forward||backward) {
            if (acceleration!=0)a.ax = acceleration;
            a.ay = acceleration;
            if (a.collide) fill(0);
            if (a.pos()&&hover) fill(0, 255, 0);

            stroke(a.col);
            strokeWeight(bordersize);
            if (!border) noStroke();

            // ------------------------------------------ time control---------------------------------------
            if (forward) {
              a.forward = true;
              a.pause = false;
              a.backward = false;
              a.update();
            } else if (backward) {
              a.forward = false;
              a.pause = false;
              a.backward = true;
              a.update();
            } else if (pause) {
              a.forward = false;
              a.pause = true;
              a.backward = false;
              a.update();
            } else {
              a.forward = false;
              a.pause = false;
              a.backward = false;
              a.update();
            }
            if (attractor)a.attractors();

            if (mouse&&forward)a.mouse();
          }
  };

  public void info(){


  };

  public void createVertices(Grid_space a){

    int count = 0;

    for (int i=0; i<a.Neighbours_b.length; i++) {

                  Grid_space neighbour = a.Neighbours_b[i];

                  if (neighbour!=null&&a.col2!=-10000&&neighbour.col2!=-10000&&neighbour.col2==a.col2)a.Walls_b.set(i, false);
                  else if (neighbour==null||neighbour!=null&&a.col2!=-10000&&neighbour.col2!=-10000&&a.col2!=neighbour.col2)a.Walls_b.set(i, true);

                  if (neighbour!=null&&(a.Walls_b.get(i)))if(contour)a.Boundaries.get(i).drawLine();
                  
                  if (neighbour!=null&&a.popVisited&&neighbour.popVisited) {
                    if (a.col2!=-10000
                      &&neighbour.col2!=-10000
                      
                      &&a.popCol!=neighbour.popCol
                      &&a.col2==neighbour.col2
                      &&agentsBackup.get(a.popId).psteps<=agentsBackup.get(neighbour.popId).psteps
                      ) {
                      agentsBackup.get(a.popId).psteps --;
                      agentsBackup.get(neighbour.popId).psteps ++;

                      a.popId = neighbour.popId;
                      a.popCol = neighbour.popCol;
                      count++;
    }}}

  };

  public void createVertices2(){


  };

  public void updateAgents(int n, Grid_space a){

    for (int k=0; k<a.Neighbours_b.length; k++) {

      Grid_space neighbour = a.Neighbours_b[k];

      if (neighbour!=null&&a.col2!=-10000&&neighbour.col2!=-10000&&neighbour.col2==a.col2)a.Walls_b.set(k, false);
      else if (neighbour==null||neighbour!=null&&a.col2!=-10000&&neighbour.col2!=-10000&&a.col2!=neighbour.col2)a.Walls_b.set(k, true);

      //if (neighbour!=null&&(a.Walls_b.get(k)))if(contour)a.Boundaries.get(k).drawLine();
      
      if (neighbour!=null&&a.popVisited&&neighbour.popVisited) {
        if (a.col2!=-10000
          &&neighbour.col2!=-10000
          &&a.popCol!=neighbour.popCol
          &&a.col2==neighbour.col2
          &&agentsBackup.get(a.popId).psteps<=agentsBackup.get(neighbour.popId).psteps
          ) {
          agentsBackup.get(a.popId).psteps --;
          agentsBackup.get(neighbour.popId).psteps ++;

          a.popId = neighbour.popId;
          a.popCol = neighbour.popCol;
          n++;
    }}}
  };

  public void display(){
    
    mouseLogic();
    //logic();
    saveImage();
      keys();
      output.append = true;
      
      //println("amp1 "+ amp1);
      noiseSeed(PApplet.parseInt(seed));
      if(pallete.click(8))save();
      agentsCounted = 0;
      if (border){
        stroke(0);
        fill(255);
        rect(x,y,w,h);
      }
      if(sliderMenu!=null&&sliderMenu.visible&&sliderMenu.menu.smdown||sUpdate){
        update = true;
        mdown = true;
        
        
      }
      else update = false;
      if(mdown&&!mousePressed&&contour)contourUpdate = true;
      if(!mousePressed)mdown = false;
      if(scale<=0)scale = 0.0001f;
      //if(contour)beginShape();
      
        
      if(canvas==null)canvas = createGraphics(width,height,JAVA2D);
      //if(update||keyUpdate||sysUpdate||begin)
      canvas.beginDraw();
      //canvas2.beginDraw();
      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          
          noStroke();
          int p = j + i * cols;
          Grid_space a = squares.get(p);

          if(update||keyUpdate||sysUpdate||begin){
            amplitude = amp1;
            frequency = freq1;
            float height = 0;
            mapNoise[j][i] = 0;
            
            for(int k=0;k<octaves;k++){
              
              float y1 = fy + scale1*i*frequency + octaveOffsets.get(k).x;
              float x1 = fx + scale1*j*frequency + octaveOffsets.get(k).y;
              float n1 = noise(x1,y1);

              height += (n1*amplitude);
              //float height = n1*amp1;
              amplitude *= persistance;
              frequency *= lacunarity;
            }
            mapNoise[j][i] = height;
              // if(height>sealevel)map[j][i] = color(0, 0, 153);
              // else if(height>groundlevel)map[j][i] = color(204, 204, 0);
              // else if(height>grasslevel)map[j][i] = color(51, 153, 51);
              // else if(height>mountainlevel)map[j][i] = color(102, 102, 153); 

              // with alpha
              // if (height>mountainlevel)map[j][i] = color(102, 102, 153,mountainlevel*255); 
              // else if (height>grasslevel)map[j][i] = color(51, 153, 51,grasslevel*255);
              // else if (height>groundlevel)map[j][i] = color(204, 204, 0,groundlevel*255);
              // else if (height<sealevel)map[j][i] = color(0, 0, 153,sealevel*255);
              if (height>mountainlevel)map[j][i] = color(102, 102, 153); 
              else if (height>grasslevel)map[j][i] = color(51, 153, 51);
              else if (height>groundlevel)map[j][i] = color(204, 204, 0);
              else if (height<sealevel)map[j][i] = color(0, 0, 153);

              a.col = color(map[j][i]);
              debug(a);
              
              //a.get_neighbours(this);
              //a.getNeighbours4(this);
              
            if(brightness(a.col) > max)max = brightness(a.col);
            canvas.fill(a.col);
            canvas.noStroke();
            canvas.rect(a.x,a.y,a.w,a.h);
            a.compared = false;
            begin = false;
          }
          
          if(a.popVisited)fill(a.popCol);
          int count_ = 0;
          if(agentsPopulated)updateAgents(count_,a);
          //if(contour)a.drawBoundaries();
          if (!mapScoped&&count_==0)agentsCounted ++;
      }}
  g1.img = canvas.get((int)x,(int)y,(int)w,(int)h);
  canvas.endDraw();
  image(g1.img,x,y);
  if(!contour){
    // remember to change sobel back;
    g1.sobel = null;
  }else {
    if(g1.sobel==null||contourUpdate){
      g1.sobel(9,4);
      //println(scale1,frequency,amplitude,octaves);

      contourUpdate = false;
    }
    image(g1.sobel,x,y);
  }
  sysUpdate = false;
  update = false;
  sUpdate = false;
  contourUpdate = false;
      //if (contour)endShape(OPEN);
  //if(frameCount%10==0)println(mountainlevel);
  //println(squaresCounted,squares.size());
  if (toggle&&pallete.visible)pallete.draw();
  if (toggle&&sliderMenu!=null&&sliderMenu.visible)sliderMenu.draw();
  if (squaresCounted==squares.size()) sdown = false;
  if (agentsCounted==squares.size()-rows&&agentsPopulated)mapScoped = true;
  if (bcount>=squares.size())Boundaries = true;

  fill(0);
  text(frameRate,100,100);
      
  };
  
  public void display2(){
    mouseLogic();
    if(scale<=0)scale = 0.0001f;
    
      for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          
          noStroke();
          
          if(update){
            float yy = scale*i*freq;
            float xx = scale*j*freq;
            float n = noise(xx,yy);
            float height = n*amp;
            //map[j][i] = n;
            mapNoise[j][i] = n;
            if(height>0.2f)map[j][i] = color(0, 0, 153);
            if(height>0.4f)map[j][i] = color(204, 204, 0);
            if(height>0.6f)map[j][i] = color(51, 153, 51);
            if(height>0.8f)map[j][i] = color(102, 102, 153); 
          }
          
          int col = map[j][i];
          
          fill(col);
          rect(j*xRes,i*yRes,xRes,yRes);
        
      }}
  };
  
  public void displayGrid(){
    mouseLogic();
    
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
          if(update){
                //float height = mapNoise1d[i]*amp*freq;
                
                int p = j + i * cols;
                float yy = scale*i*freq;
                float xx = scale*j*freq;
                float n = noise(xx,yy);
                float height = n*amp;
                mapNoise1d[i] = n;
                if(height>0.2f)map1d[p] = color(0, 0, 153);
                if(height>0.4f)map1d[p] = color(204, 204, 0);
                if(height>0.6f)map1d[p] = color(51, 153, 51);
                if(height>0.8f)map1d[p] = color(102, 102, 153); 
              
                int col = map1d[p];
                
                grid.getChild(p).setFill(col);
          }
    }}
    
    shape(grid);
    fill(255,0,0);
    text(gridChildren,100,210);
  };

  public void displayGridAsLines(){
    for(int i=0;i<rows;i++){
      stroke(0);
      line(x,y+res*i,x+w,y+res*i);
    }
    for(int j=0;j<cols;j++){
      stroke(0);
      line(x+res*j,y,x+res*j,y+h);
    }

  };

  public void displayMesh(){


  };

  public void draw2d(){
    
    if (toggle) {
      logic();
      keys();
      fill(255);
      text(squares.size(),100,200);
      noiseSeed(PApplet.parseInt(seed));
      if(pallete.click(8))exit();
      //if()
      agentsCounted = 0;
      if (border){
        stroke(0);
        fill(255);
        rect(x,y,w,h);
      }
      int count = 0;
      for (int i=0;i<rows;i++) {
        for (int j=0;j<cols;j++) {

          float x1 = (scale1*j*freq);
          float y1 = (scale1*i*freq);

          float x2 = (scale2*j*freq);
          float y2 = (scale2*i*freq);

          float x3 = (scale3*j*freq);
          float y3 = (scale3*i*freq);

          int pos = j + i * cols;
          
          float height1 = map(noise(x1, y1)*amp1, 1, 0, 0, 255);
          float height2 = map(noise(x2, y2)*amp2, 1, 0, 0, 255);
          float height3 = map(noise(x3, y3)*amp3, 1, 0, 0, 255);

          float height = (height1+height2+height3)/3;
          Grid_space a = squares.get(pos);

          float mapHeight = map(height,0,255,0,255);
          
          float sea = sealevel;
          float floor = groundlevel;
          float grass = grasslevel;
          float mountain = mountainlevel;
          fill(a.col);
          if (mapHeight>mountain) {
            a.col2 = color(255, 255, 255);
            a.col = color(255, 255, 255, 255-abs(mapHeight/2)*1.2f);
            C = color(255, 255, 255, 255-abs(mapHeight/2)*1.2f);
          } else if (mapHeight>grass) {
            a.col2 = color(0, 255, 0);
            a.col = color(0, 255, 0, 255-abs(mapHeight/2)*1.1f);
            C = color(0, 255, 0, 255-abs(mapHeight/2)*1.1f);
          } else if (mapHeight>floor) {
            a.col2 = color(255, 255, 0);
            a.col = color(255, 255, 0, 255-abs(mapHeight/2)*1.1f);
            C = color(255, 255, 0, 255-abs(mapHeight/2)*1.1f);
          } else if (mapHeight<sea) {
            a.col2 = color(0, 0, 255);
            a.col = color(0, 0, 255, 255-abs(mapHeight/2)*1.1f);
            C = color(0, 0, 255, 255-abs(mapHeight/2)*1.1f);
          } else {
            a.col2 = color(255, 255, 255);
            a.col = color(255, 255, 255, 255-abs(mapHeight/2)*1.2f);
            C = color(255, 255, 255, 255-abs(mapHeight/2)*1.2f);
          }

            if (visible) {
              debug(a);
              fill(a.col);
              if(circle) {
              ellipseMode(CORNER);
              ellipse(a.x, a.y, a.w, a.h);
              }
              if (dot) {
                strokeWeight(2);
                point(a.x, a.y);
                strokeWeight(1);
              }
              if(rect) {
                fill(a.col);
                noStroke();
                rect(a.x, a.y, a.w,a.h);

                // beginShape(QUAD);
                // noStroke();

                // vertex(a.x, a.y);
                // vertex(a.x + a.w, a.y);
                // vertex(a.x + a.w, a.y + a.h);
                // vertex(a.x, a.y + a.h);


                // endShape();
              }
              //a.drawBoundaries();
              compareNeighbours(a,count);
            }}}}

    text(frameRate, W-50, 90);
    if (toggle&&pallete.visible)pallete.draw();
    if (toggle&&sliderMenu!=null&&sliderMenu.visible)sliderMenu.draw();
    if (squaresCounted==squares.size()) sdown = false;
    if (agentsCounted==squares.size()-rows&&agentsPopulated)mapScoped = true;
    if (bcount>=squares.size())Boundaries = true;

  };

  public void compareNeighbours(Grid_space a,int count){

    if (!fill) noFill();
    if (a.popVisited&&populateBoundaries)fill(a.popCol);

    if (sdown)a.neighboured = false;

    if (!a.neighboured) {
      squaresCounted++;
      a.get_neighbours(this);
    }
    noStroke(); 
                  
    if (!mapScoped&&count==0)agentsCounted ++;
  };



  public void draw_2d() {
    if (terrain3d&&toggle) {
      pushMatrix();
      translate(W/2, H/2);

      if (mousePressed) {
        //XX += pmouseX - mouseX;
        //YY += pmouseY - mouseY;
      }
      rotateX(PI/3+radians(xrot+YY));
      translate(-W/2, -W/2);
      translate(w/2, h/2);
      rotateZ(radians(zrot+XX));
      translate(-w/2, -h/2);
      translate(w/2, 0);
      rotateY(radians(yrot));
      translate(-w/2, 0);
      translate(-hdistance-400, -distance-400, -vdistance);
      keys();
    }

    if (toggle) {
      logic();
      rowcount = 0;
      colcount = 0;
      noiseSeed(PApplet.parseInt(seed));
      fill(255);
      text(seed,100,200);

      float yoffr = fy;
      perlx_yoff = pxfy;
      perly_yoff = pyfy;

      agentsCounted = 0;

      for (int yy = 0; yy < rows-1; yy++) {

        if (terrain3d)beginShape(TRIANGLE_STRIP);
        
        float xoffr = fx;
        perlx_xoff = pxfy;
        perly_xoff = pyfy;

        for (int xx = 0; xx< cols; xx++) {

          int pos = xx + yy * cols;
          terrain[xx][yy] = map(noise(xoffr, yoffr), 1, 0, 0, 255);
          perlx[xx][yy] = map(noise(perlx_xoff, perlx_yoff)*map1, 1, 0, 0, 255);
          perly[xx][yy] = map(noise(perly_xoff, perly_yoff)*map2, 1, 0, 0, 255);

          xoffr += noise1 + zoom;
          // perlx_xoff += pow(noise1,map1) + zoom;
          // perly_xoff += pow(noise2,map2) + zoom;

          perlx_xoff += noise2 + zoom;
          perly_xoff += noise3 + zoom;

          strokeWeight(0);

          Grid_space a = squares.get(pos);

          float num = perlx[xx][yy];
          float num1 = perly[xx][yy];
          // float R = map((terrain[xx][yy]+num+num1),0,255/map1+255/map2+255,0,255);
          float R = map((terrain[xx][yy]+num+num1),0,765,0,255);
          
          float floor2 = groundlevel2;
          float mountain = mountainlevel;
          float sea = sealevel;
          float grass = grasslevel;

          if (a.shape!=null)a.shape.draw();
          
          if ((terrain2d||terrain3d)&&!plain) {
            fill(a.col);
            if (R>mountain) {
              a.col2 = color(255, 255, 255);
              a.col = color(255, 255, 255, 255-abs(R/2)*1.2f);
              C = color(255, 255, 255, 255-abs(R/2)*1.2f);
            } else if (R>grass) {
              a.col2 = color(0, 255, 0);
              a.col = color(0, 255, 0, 255-abs(R/2)*1.1f);
              C = color(0, 255, 0, 255-abs(R/2)*1.1f);
            } else if (R>floor2) {
              a.col2 = color(255, 255, 0);
              a.col = color(255, 255, 0, 255-abs(R/2)*1.1f);
              C = color(255, 255, 0, 255-abs(R/2)*1.1f);
            } else if (R<sea) {
              a.col2 = color(0, 0, 255);
              a.col = color(0, 0, 255, 255-abs(R/2)*1.1f);
              C = color(0, 0, 255, 255-abs(R/2)*1.1f);
            } else {
              a.col2 = color(255, 255, 255);
              a.col = color(255, 255, 255, 255-abs(R/2)*1.2f);
              C = color(255, 255, 255, 255-abs(R/2)*1.2f);
            }}

          if (forward||backward) {
            if (acceleration!=0)a.ax = acceleration;
            a.ay = acceleration;
            if (a.collide) fill(0);
            if (a.pos()&&hover) fill(0, 255, 0);

            stroke(a.col);
            strokeWeight(bordersize);
            if (!border) noStroke();

            // ------------------------------------------ time control---------------------------------------
            if (forward) {
              a.forward = true;
              a.pause = false;
              a.backward = false;
              a.update();
            } else if (backward) {
              a.forward = false;
              a.pause = false;
              a.backward = true;
              a.update();
            } else if (pause) {
              a.forward = false;
              a.pause = true;
              a.backward = false;
              a.update();
            } else {
              a.forward = false;
              a.pause = false;
              a.backward = false;
              a.update();
            }
            if (attractor)a.attractors();

            if (mouse&&forward)a.mouse();
          }
          if (terrain2d) {
            if (visible) {
              debug(a);
              if (!circle&&!dot&&!shape&&!plain) {
                fill(a.col);
                if (!fill) noFill();
                if(!terrainP)fill(255,40);
                if (a.popVisited&&populateBoundaries)fill(a.popCol);

                if (sdown)a.neighboured = false;

                if (!a.neighboured) {
                  squaresCounted++;
                  a.get_neighbours(this);
                }
                noStroke(); 
                if (plain)stroke(0);
                //if(!terrainP){stroke(0,150);strokeWeight(1);}
                rect(a.x, a.y, a.w, a.h);

                int count = 0;

                for (int k=0; k<a.Neighbours_b.length; k++) {

                  Grid_space neighbour = a.Neighbours_b[k];

                  if (neighbour!=null&&a.col2!=-10000&&neighbour.col2!=-10000&&neighbour.col2==a.col2)a.Walls_b.set(k, false);
                  else if (neighbour==null||neighbour!=null&&a.col2!=-10000&&neighbour.col2!=-10000&&a.col2!=neighbour.col2)a.Walls_b.set(k, true);

                  //if (neighbour!=null&&(a.Walls_b.get(k)))if(contour)a.Boundaries.get(k).drawLine();
                  

                  if (neighbour!=null&&a.popVisited&&neighbour.popVisited) {
                    if (a.col2!=-10000
                      &&neighbour.col2!=-10000
                      
                      &&a.popCol!=neighbour.popCol
                      &&a.col2==neighbour.col2
                      &&agentsBackup.get(a.popId).psteps<=agentsBackup.get(neighbour.popId).psteps
                      ) {
                      agentsBackup.get(a.popId).psteps --;
                      agentsBackup.get(neighbour.popId).psteps ++;

                      a.popId = neighbour.popId;
                      a.popCol = neighbour.popCol;
                      count++;
                    }}}

                if(contour)a.drawBoundaries();
                if (!mapScoped&&count==0)agentsCounted ++;
                //if (!populateBoundaries) {
                //  if (!wallSquares.contains(a)&&(wall>0))wallSquares.add(a);
                //  else if (wallSquares.contains(a)&&wall==0)wallSquares.remove(wallSquares.indexOf(a));
                //}
              } else {
                ellipseMode(CORNER);
                if (circle) ellipse(a.x, a.y, a.w, a.h);
                else if (dot) {
                  strokeWeight(2);
                  point(a.x, a.y);
                  strokeWeight(1);
                }
              }
            }
          } else if (terrain3d) {
            float mult = 1;
            fill(a.col);
            stroke(a.col);
            if (!border)noStroke();
            if (!fill)noFill();
            if (floored) {

              float a1 = terrain[xx][yy];
              float a2 = terrain[xx][yy];
              float a3 = terrain[xx][yy];
              float a4 = terrain[xx][yy];

              if (groundlevel<sealevel)groundlevel=sealevel;
              if (grasslevel<groundlevel)grasslevel=groundlevel;
              if (mountainlevel<grasslevel)mountainlevel=grasslevel;

              if (a1<sealevel)a1 = sealevel;
              else {
                if (a1<groundlevel2)a1 = groundlevel2;
                else {
                  if (a1<grasslevel)a1 = grasslevel;
                  else a1 = a3;
                }
              }
              if (a2<sealevel)a2 = sealevel;
              else {
                if (a2<groundlevel2)a2 = groundlevel2;
                else {
                  if (a2<grasslevel)a2 = grasslevel;
                  else a2 = a4;
                }
              }

              vertex(xx*a.w*mult, yy*a.h*mult, terrain[xx][yy]);
              vertex(xx*a.w*mult, (yy+1)*a.h*mult, terrain[xx][yy+1]);
            } else if (R<-100) {
              vertex(xx*a.w*mult, (yy)*a.h*mult, terrain[xx][yy]);
              vertex(xx*a.w*mult, (yy+1)*a.h*mult, terrain[xx][yy+1]);
            }
          }
        }
        if (terrain3d)endShape(CLOSE);
        yoffr += noise1 + zoom;
        // perlx_yoff += pow(noise1,map1) + zoom;
        // perly_yoff += pow(noise2,map2) + zoom;
        perlx_yoff += noise2 + zoom;
        perly_yoff += noise3 + zoom;
      }
    }
    if (terrain3d)popMatrix();
    //if (debug)
    text(frameRate, W-50, 90);
    if (toggle&&pallete.visible)pallete.draw();
    keys();
    if (toggle&&sliderMenu!=null&&sliderMenu.visible)sliderMenu.draw();
    if (squaresCounted==squares.size()) {
      //neighboured = true;
      sdown = false;
    }
    if (agentsCounted==squares.size()-rows&&agentsPopulated)mapScoped = true;
    if (bcount>=squares.size())Boundaries = true;
    //if(mapScoped)text("Scoped",W-50,120);
    if(frameRate%100==0)text(agentsCounted,W-50,120);
  };

  public void draw3d(){

  };

  public void debug(Grid_space a) {

    if (a.pos()&&debug) {
      float X = W-170;
      float Y = 23;
      float vspacing = 12;
      fill(255,100);
      rect(X, Y, 170, 200);

      fill(0);
      text("ID : " + a.id, X, Y + vspacing);
      text("Pid : " + a.pid, X + 55, Y + vspacing*1);
      text("Pop ID : " + a.popId, X + 105, Y + vspacing*1);
      text("Pop Color : " + a.popCol, X, Y + vspacing*2);
      text("Col 2 : " + a.col2, X, Y + vspacing*3);
      text("Walls : ", X, Y + vspacing*4);

      for (int i=0; i<a.Walls_b.size(); i++) {
         text(str(a.Walls_b.get(i)) + ", ", X+40+30*i, Y+ vspacing*4);
      }
      text("Direc Neighbours: " + a.Neighbours_4.size(),X,Y + vspacing * 5);
      text("All Neighbours: " + a.Neighbours_8.size(),X,Y + vspacing * 6);
      text("Node: " + str(a.node), X,Y + vspacing * 7);
      text("Conn. Neighbours: " + a.connections.size(),X,Y + vspacing * 8);
      text("Toggle: " + str(a.toggle),X,Y + vspacing * 9);
      text("Pop Visited: " + str(a.popVisited),X,Y + vspacing * 10);
      text("Visited: " + str(a.visited),X,Y + vspacing * 11);
      text("Path Connected: " + str(a.pathConnected),X,Y + vspacing * 12);

      text("Parents: " ,X,Y + vspacing * 13);
      for(int i=0;i<a.parents.size();i++){
        text(a.parents.get(i).id,X + 60 + 40 * i,Y + vspacing * 13);
      }

      text("Connections: ",X,Y + vspacing * 14);
      for(int i=0;i<a.connections.size();i++){
        text(a.connections.get(i).id,X + 80 * i,Y + vspacing * 14);
      }
    }
  };

  public void popAgents() {
    if (populateBoundaries&&!agentsPopulated) {
      for (int i=0; i<totalAgents; i++) {

        Grid_space g = squares.get(floor(random(squares.size())));
        g.popId = i;
        g.pid = i;
        g.popCol = color(random(255), random(255), random(255));

        if (!agents.contains(g)) {
          g.popVisited = true;
          agents.add(g);
          agentsBackup.add(g);
          agentsConst.add(g);
          popHist.add(new ArrayList<Grid_space>());
          popStack.add(new ArrayList<Grid_space>());
          connections.add(new ArrayList<Grid_space>());
        } else i--;
      } 
      agentsPopulated = true;
      println(agents.size());
    }
  };

  public void seekBoundaries() {

    //if(agentsCounted<totalAgents){
    text(agentsCounted, W-50, 100);
    text(squares.size(), W-50, 110);


    if (agentsPopulated) {
      for (int i=0; i<agents.size(); i++) {

        Grid_space c = agents.get(i);

        Grid_space next = c.getNewNeighbour();

        Grid_space home = agentsBackup.get(i);

        ArrayList<Grid_space> neighbours = c.getNewNeighbour1(this);

        Grid_space t = agentsBackup.get(i);
        
        fill(255, 0, 0, 150);
        noStroke();

        if (populateBoundaries&&!contour){
          // rect(t.x, t.y, c.w, c.h);
          // rect(t.x, t.y, c.w, c.h);
        }
        stroke(0);
        if (contour)line(c.x, c.y, home.x, home.y);
        
        //println("agents size " + agents.size());
        if (next!=null) {
          //println("next :  " + next.id);
          next.psteps = agentsBackup.get(c.popId).psteps;
          agentsBackup.get(c.popId).psteps ++;

          next.popVisited = true;
          next.popId = c.popId;
          next.pid = c.pid;
          next.next = c;
          next.popCol = c.popCol;

          popHist.get(c.pid).add(c);
          popStack.get(c.pid).add(c);

          if (popStack.get(c.pid).size()>1)trimPopStack2(c);
          agents.set(i, next);
        } else if (!pause&&popStack.get(i).size()>0)agents.set(i, popStack.get(i).remove(popStack.get(i).size()-1));
        else if (agents.get(i)!=agentsBackup.get(i)){
          agents.set(i, agentsBackup.get(i));
          agents.get(i).noNewPopNeighbours = true;
          popCount ++;
        }
      }
      if(popCount==agents.size()&&popCount<squares.size())popPhase2 = true;
    }
  };

  public void completeBoundaries() {

    if (populateBoundaries&&unsortedWallSquares.size()>0&&!pause) {
      ArrayList<Grid_space> biome = new ArrayList<Grid_space>();
      
        biome = unsortedWallSquares.remove(0);
      if (unsortedWallSquares.size()>0) {
        
        Grid_space current = biome.get(biome.size()-1);
        Grid_space next = current.getNewWallNeighbour(this);

        if (next!=null) {
          rect(next.x+next.w/2, next.y+next.h/2, next.w, next.h);
          next.wVisited = true;
          if (!biome.contains(next))biome.add(next);
          int k = wallSquares.indexOf(next);
          if (k>-1)wallSquares.remove(k);
        } else {
          if (!boundaries.contains(biome))boundaries.add(biome);
          biome = new ArrayList<Grid_space>();
        }
      } else if (!boundaries.contains(biome))boundaries.add(biome);
    }
    fill(255);
    text(boundaries.size(), W-50, 110);
    
    for (int i=boundaries.size()-1; i>0; i--) {

      ArrayList<Grid_space> g = boundaries.get(i);

      text(g.size(), 100, 100+10*i);

      for (int k=0; k<g.size(); k++) {
        Grid_space a = g.get(k);

        rect(a.x, a.y, a.w, a.h);
      }
    }
  };

  public void seekBoundaries3() {

    if(mapScoped){
      fill(255);
      println("scoped");
      text(unsortedSquares.size(),W-50,140);
      text(squares.size(),W-50,150);

    if (squares.size()>=unsortedSquares.size()&&!beginSquareSorting) {
      
      for (int i=1; i<squares.size(); i++) {
        Grid_space b = squares.get(i);

        unsortedSquares.add(b);
      }}
    else beginSquareSorting = true;
    int count = 0;
    if(beginSquareSorting){
      if(unsortedSquares.size()>0){
      
      tempSquares = new ArrayList<Grid_space>();
      temp = new ArrayList<Grid_space>();
      
      Grid_space a = unsortedSquares.remove(0);

      if(!tempSquares.contains(a))tempSquares.add(a);
      
      for (int i=unsortedSquares.size()-1;i>-1;i--) {

        Grid_space b = unsortedSquares.get(i);
        
        fill(255,100);
        noStroke();
        rect(b.x, b.y, b.w, b.h);
        
        int walls = 0;
        
        if (a.popCol==b.popCol) {
          
            tempSquares.add(b);
            count++;
            unsortedSquares.remove(i);
            
            for(int j=0;j<b.Walls_b.size();j++)if(b.Walls_b.get(j))walls++;
            
            if(walls>0)temp.add(b);
        }}
        sortedSquares.add(tempSquares);
        wallSquares.add(temp);
        unsortedWallSquares.add(temp);
    }else sortBoundaries = true;}}
        
      fill(255,0,0);
      text("Sorted : " + sortedSquares.size(),W-100,170);
      text("Unsorted : " + unsortedSquares.size(),W-100,180);
      
      for(int i=0;i<sortedSquares.size();i++){
        text(sortedSquares.get(i).size(),W-50,190+10*i);
        if(sortedSquares.get(i).size()>0){
          
          Grid_space b = sortedSquares.get(i).get(0);
          fill(0);
          noStroke();
          rect(b.x, b.y, b.w, b.h);
          
      }}
    
    for(int i=0;i<wallSquares.size();i++){
      
      for(int j=0;j<wallSquares.get(i).size();j++){
        
        Grid_space b = wallSquares.get(i).get(j);
        fill(0,100);
        noStroke();
        rect(b.x, b.y, b.w, b.h);
    }}
  };
  
  public void completeBoundary(){
    
    for(int i=0;i<wallSquares.size();i++){
      
      for(int j=0;j<wallSquares.get(i).size();j++){
        
        Grid_space b = wallSquares.get(i).get(j);
        fill(0,100);
        noStroke();
        rect(b.x, b.y, b.w, b.h);
    }}
    
  };

  public void updateHist(int a, int b) {

    for (int j=popHist.get(a).size()-1; j>-1; j--) {

      Grid_space c = popHist.get(a).get(j);

      ArrayList<Grid_space> neighbours = c.getNewNeighbour2(this);

      if (neighbours!=null) {

        for (int i=0; i<neighbours.size(); i++) {

          Grid_space next = neighbours.get(i);

          next.popId = a;
          next.popCol = agentsBackup.get(b).popCol;
        }
      }
    }
  };

  public int getSteps(int i) {
    int k = popHist.get(i).size();
    //for(int j=0;j<agentsBackup.get(i).modifiedAgents.size();j++){

    //  Grid_space g1 = agentsBackup.get(i).modifiedAgents.get(j);

    //  k += popHist.get(g1.pid).size();
    //}
    //for(int j=0;j<agentsBackup.get(i).visitedBy.size();j++){

    //  Grid_space g1 = agentsBackup.get(i).visitedBy.get(j);

    //  k += popHist.get(g1.pid).size();
    //}
    return k;
  };


  public void sortHist() {
    if (sortedAgents.size()<totalAgents) {

      if (agents.size()>0) {

        Grid_space c = mostTravelledAgent();

        sortedAgents.add(c);
        agents.remove(c.popId);
      } else sortedAgents.add(agents.get(0));
    }
  };

  public Grid_space mostTravelledAgent() {

    Grid_space c = agents.get(0);

    for (int i=1; i<agents.size(); i++) {

      Grid_space n = agents.get(i);

      if (n.steps>c.steps)c = n;
    }
    return c;
  };

  public void connectMap() {
    if (mapScoped) {
      agentsCounted = 0;
      for (int i=0; i<agents.size(); i++) {
        Grid_space c = agents.get(i);
        //Grid_space next = c.getNewNeighbour2(this);
      }
    }
  };

  public void trimPopStack(int i) {

    if (popStack.get(i).size()>1) {

      for (int j=popStack.get(i).size()-1; j>-1; j--) {

        Grid_space next = popStack.get(i).get(j).getNewNeighbour();
        ArrayList<Grid_space> next1 = popStack.get(i).get(j).getNewNeighbour4(this);

        if (next!=null||next1!=null)break;
        else popStack.get(i).remove(j);
      }
    }
  };

  public void trimPopStack2(Grid_space a) {

    if (popStack.get(a.pid).size()>0) {

      for (int j=popStack.get(a.pid).size()-1; j>-1; j--) {

        Grid_space next = popStack.get(a.pid).get(j).getNewNeighbour();
        //ArrayList<Grid_space> next1 = popStack.get(a.pid).get(j).getNewNeighbour4(this);
        ArrayList<Grid_space> next1 = null;
        

        if (next!=null) {
          //next.getNewNeighbour4(this);
          Grid_space b = popStack.get(a.pid).get(j);

          //b.pid    = a.pid;
          //b.popId  = a.pid;
          //b.psteps = agentsBackup.get(a.pid).psteps;

          b.pid    = agents.size()-1;
          b.popId  = agents.size()-1;
          b.leader = a.leader;
          b.popCol = a.popCol;
          b.psteps = agentsBackup.get(a.popId).steps;

          //agentsBackup.add(agentsBackup.get(a.pid));
          //agentsConst.add(agentsConst.get(a.pid));

          agentsBackup.add(b);
          agentsConst.add(b);

          popHist.add(new ArrayList<Grid_space>());
          popStack.add(new ArrayList<Grid_space>());

          agents.add(b);
          totalAgents++;

          break;
        }
        if (next1!=null)break;
        if (next==null&&next1==null&&popStack.get(a.pid).size()>0) popStack.get(a.pid).remove(j);
      }
    }
  };

  public void addToArray(ArrayList<Grid_space> a, ArrayList<Grid_space> b) {

    for (int i=0; i<b.size(); i++) {
      Grid_space g = b.get(i);
      a.add(g);
    }
  }



  public void gshape(int sides, Grid_space a, int col) {

    beginShape();
    noFill();
    float theta = 360 / sides;
    for (int i=0; i<sides; i++) {
      if (a.Walls_a.get(i)==true) {
        float thetab =  theta * i;
        float thetac =  theta * i+theta;
        stroke(col);
        if (!a.parent.border) noStroke();
        strokeWeight(1);
        line(a.x+a.w/2*sin(thetab), a.y+a.w/2*cos(thetab), a.x+a.w/2*sin(thetac), a.y+a.w/2*cos(thetac));
      } else noStroke();
    }
    endShape();
  };

  public void keys() {
    if (ztoggle2==1)zoom -= noise1;
    if (ztoggle==1)zoom += noise1;
    
    // left
    int n = 0;
    float k = 0.05f;

    if (keyPressed && keyCode ==37) {
      n++;
      if (!terrain3d){
        fx += k;
        pxfx += k;
        pyfy += k;
      }else {
        fy += k;
        pxfx += k;
        pyfy += k;
      }}

    // right

    if (keyPressed && keyCode ==39) {
      n++;
      if (!terrain3d){
          fx -= k;
          pxfx -= k;
          pyfy -= k;
      } else {
          fy -= k;
          pxfx -= k;
          pyfy -= k;
      }}
    // up
    if (keyPressed && keyCode ==38) {
      n++;
      if (!terrain3d) {
          fy += k;
          pxfx += k;
          pyfy += k;
      }else {
          fx -= k;
          pxfx -= k;
          pyfy -= k;
      }}
    // down
    if (keyPressed && keyCode ==40) {
      n++;
      if (!terrain3d) {
        fy -= k;
        pxfx -= k;
        pyfy -= noise3;
      }else {
        fx += k;
        pxfx += k;
        pyfy += k;
      }}

    if (keyCode == 87) {
      
      ztoggle ++;
      ztoggle2 = 0;
      if (ztoggle==2)ztoggle = 0; 
      //zoom += 0.02;
    }
    if (keyCode == 83) {
      ztoggle2 ++;
      ztoggle = 0;
      if (ztoggle2==2)ztoggle2 = 0;
    }
    if (keyCode == 68) {
      ztoggle = 0;
      ztoggle2 = 0;
    }
    if(n>0||sysUpdate)keyUpdate = true;
    else keyUpdate = false;
  };

  public void keys_() {
    if (ztoggle2==1)zoom -= noise1;
    if (ztoggle==1)zoom += noise1;
    
    // left

    if (keyPressed && keyCode ==37) {
      if (!terrain3d){
        fx += noise1;
        pxfx += pow(noise1,map1);
        pyfy += pow(noise2,map2);
      }else {
        fy += noise1;
        pxfx += pow(noise1,map1);
        pyfy += pow(noise2,map2);
      }}

    // right

    if (keyPressed && keyCode ==39) {
      if (!terrain3d){
          fx -= noise1;
          pxfx -= pow(noise1,map1);
          pyfy -= pow(noise2,map2);
      } else {
          fy -= noise1;
          pxfx -= pow(noise1,map1);
          pyfy -= pow(noise2,map2);
      }}
    // up
    if (keyPressed && keyCode ==38) {
      if (!terrain3d) {
          fy += noise1;
          pxfx += pow(noise1,map1);
          pyfy += pow(noise2,map2);
      }else {
          fx -= noise1;
          pxfx -= pow(noise1,map1);
          pyfy -= pow(noise2,map2);
      }}
    // down
    if (keyPressed && keyCode ==40) {
      if (!terrain3d) {
        fy -= noise1;
        pxfx -= pow(noise1,map1);
        pyfy -= pow(noise2,map2);
      }else {
        fx += noise1;
        pxfx += pow(noise1,map1);
        pyfy += pow(noise2,map2);
      }}

    if (keyCode == 87) {
      ztoggle ++;
      ztoggle2 = 0;
      if (ztoggle==2)ztoggle = 0; 
      //zoom += 0.02;
    }
    if (keyCode == 83) {
      ztoggle2 ++;
      ztoggle = 0;
      if (ztoggle2==2)ztoggle2 = 0;
    }
    if (keyCode == 68) {
      ztoggle = 0;
      ztoggle2 = 0;
    }
  };

  public void set(String a, boolean b) {
    values.put(a, b);
    //hover = true;
  };

  public boolean pos() {
    float X = mouseX;
    float Y = mouseY;

    return X > x && X < x + w && Y > y && Y < y + h;
  };

  public void logic() {
    if (pos() && !mousePressed) {
      dx = mouseX - x;
      dy = mouseY - y;
    }

    if ( pos() && mousePressed) {
      posx = dx;
      posy = dy;
      x = mouseX - dx;
      y = mouseY - dy;
      deltax =  dx;
      deltay =  dy;
    }
    if (BMS.terrain3d&&!terrain3d)terrain3d = true;
    else if (!BMS.terrain3d&&terrain3d)terrain3d = false;
  };

  

  public void update() {
  };
};

class Shape {

  int sides;
  float x, y, w, theta;
  PVector p;
  Grid_space parent;

  ArrayList<PVector> p1 = new ArrayList<PVector>();
  ArrayList<PVector> p2 = new ArrayList<PVector>();
  ArrayList<PVector[]> lines = new ArrayList<PVector[]>();

  Shape(int Sides, Grid_space Parent) {
    sides = Sides;
    parent = Parent;
    x = parent.x;
    y = parent.y;
    w = parent.w;
    p = new PVector(x, y);
    theta = radians(360 / sides);
    for (int i=0; i<sides; i++) {
      float thetab =  theta * i;
      float thetac =  theta * i+theta;
      PVector a = new PVector (x+w/2*sin(thetab), y+w/2*cos(thetab));
      PVector b = new PVector (x+w/2*sin(thetac), y+w/2*cos(thetac));
      parent.Walls_a.set(i, true);
      p1.add(a);
      p2.add(b);
      PVector []c = {a, b};
      lines.add(c);
    }
  };

  public void draw() {
    beginShape();
    fill(parent.col);

    for (int i=0; i<sides; i++) {
      if (parent.Walls_a.get(i)==true) {
        stroke(parent.col2);
        if (!parent.border) noStroke();
        strokeWeight(1);
        vertex(p1.get(i).x, p1.get(i).y);
        vertex(p2.get(i).x, p2.get(i).y);
      } else noStroke();
    }
    endShape();
  }
};



class Grid3D extends Grid {

  Grid3D() {
  };

  public void save() {
  };

  public void load() {
  };
};

class kernel {

  kernel() {
  };

  public void init() {
  };
};

class ImgGrid extends Grid {

  ImgGrid() {
  };

  public void save() {
  };

  public void load() {
  };
};

class plainGrid extends Grid {

  plainGrid() {
  };

  public void save() {
  };

  public void load() {
  };
};
public void pop(int x,int y,float w,float h){
  float gW = (1000)/PApplet.parseFloat(gw), gH = 580/PApplet.parseFloat(gh);
  int total = x*y;
  
  for (int i=0;i<total;i++){
    PVector a = new PVector(random(W),random(H));
    
    qgrid.add(new Quad(a,i,w,h));
  }
 
 //float gw = w/x;
 //float gh = h/y;
 
 for (int j=0;j<gh;j++){
    for (int i=0;i<gw;i++){
      int id = i+j*x;
      PVector p = new PVector(i*gW,j*gH);
      qgrid.add(new Quad(p,id,gw,gh));
    }}
};

public Quad index2(int xpos,int ypos){
  
  if(wrap){
    
  if(xpos<=0)xpos = gw -1;
  if(xpos>= gw -1)xpos = 0;
  if(ypos <= 0)ypos = gh - 1;
  if(ypos >= gh - 1)ypos = 0;
  
    return qgrid.get(ypos + (xpos * PApplet.parseInt(gw)));
  }
  else{
    if(xpos<0||xpos>gw-1||ypos<0||ypos>gh-1){
     
    return null;
  }
    return qgrid.get(xpos + (ypos * PApplet.parseInt(gw)));
  }
  
};

class Quad{
  int id,iid,counter,xpos,ypos;
  float x,y,w,h,dens,dens2,dens3,dens4,v,v2,v3,v4,kv,kv2,kv3,kv4;
  float dir,dir2,dir3,dir4;
  PVector p, kp = new PVector(0,0),kp2 = new PVector(0,0),kp3 = new PVector(0,0);
  int col = 0,col2 = 0,col3 = 0,col4 = 0;
  //ArrayList<Entity> children  = new ArrayList<Entity>();
  ArrayList<Quad> affectees  = new ArrayList<Quad>();
  ArrayList<Quad> affectors  = new ArrayList<Quad>();
  ArrayList<Human> children  = new ArrayList<Human>();
  //HashMap<Quad,ArrayList
  Scene scene;
  
  Quad(PVector P,int ID,float W,float H){
    p = P;
    id = ID;
    x = p.x;
    y = p.y;
    w = W;
    h = H;
  };
  
  Quad(PVector P,int ID,float W,float H,Scene s){
    p = P;
    id = ID;
    x = p.x;
    y = p.y;
    w = W;
    h = H;
    scene = s;
  };

  public void draw(){
    
    if(x+w<scene.x+scene.w +w&&y+h<scene.y+scene.h+w){
    float kv = 0;
    float kd = 0;
    kp = new PVector(0,0);
    PVector tkp = new PVector(0,0);
    PVector tkp2 = new PVector(0,0);
    int a = 0;
    affectors = new ArrayList<Quad>();
    
    if(children.size()>0){
      dens = children.size();
    for(int i=0;i<children.size();i++){
      Entity e = children.get(i);
      
      kv += sqrt(abs(e.vel.x*e.vel.x+ e.vel.y*e.vel.y));
      kd += e.dir;
      tkp.add(e.p); 
      
      a += e.col;
    }}
    kv2 = 0;
    col2 = 0;
    dens2 = 0;
    dir2 = 0;
    
    for(int i=0;i<scene.fields.size();i++){
      Quad q = scene.fields.get(i);
      
      float d = dist(x,y,q.x,q.y);
      if(q.dens*4>d&&q!=this){
        if(!affectors.contains(q))affectors.add(q);
      }}
      
      dens2 = affectors.size();
      for(int i=0;i<affectors.size();i++){
        
        Quad q = affectors.get(i);
        
        if(dens2>0){
        kv2 += q.kv/dens2;
        col2 += q.col/dens2;
        dir2 = q.dir/dens2;
        tkp2.add(q.kp);
      }}
      
      dir3 = kd + dir2;
      dir = kd;
      tkp.div(dens);
      tkp2.div(dens2);
      if(kv>0)kv = map(kv,0-200,200,0,125);
      if(kv2>0)kv2 = map(kv2,0-200,200,0,125);
      v = kv + kv2;
      dens3 = dens + dens2;
      PVector k = PVector.add(tkp,tkp2);
      kp = tkp;
      kp = k.div(2);
      kp2 = tkp2;
      a /=dens;col2/=dens2;
      col = a + col2;
      
      
      //if(dens2>0){
      //  dir = dir2;
      //  dens3 = dens2;
      //  v = kv2;
      //  col = col2;
      //}
      
      // if(children.size()>0){
      //  dir = kd/dens;
      //  v = map(kv,0-200,200,0,255)/dens;
      //  //kp = kp.div(dens);
      //  a /=dens; col = a;
      // }
    
    if(scene.showf)line(x,y,x + h/2 * cos(dir3),y + h/2 * sin(dir3));
    if(scene.showf)line(x,y,x - h/2 * cos(dir3),y - h/2 * sin(dir3));
    noFill();
    //fill(255,d);
    noStroke();
    
    if(dir>0){
    fill(col,v);
    //fill(255,kv2/4);
    if(scene.showq)ellipse(kp.x,kp.y,dens3*4,dens3*4);
    //if(scene.showq)ellipse(kp2.x,kp2.y,dens2*10,dens2*10);
    }
    
    //fill(255);
    //text(int(dens3),x,y);
    if(dir<0){
    fill(col,v);
    //fill(0,kv2/4);
    if(scene.showq)ellipse(kp.x,kp.y,dens3*4,dens3*4);
    //if(scene.showq)ellipse(kp2.x,kp2.y,dens2*10,dens2*10);
    }}
  };
  
  public void fillc(){
    fill(255);
    //rect(p.x,p.y,w,h);
    
  }; 

  public void drawSpace(){
    noFill();
    stroke(0);
    strokeWeight(1);
    rect(p.x,p.y,w,h);

  };
  
  public void field(){
    dens2 = 0;
    kv2 = 0;
    col2 = 0;
    dir2 = 0;
    if(x+w<scene.x+scene.w + w&&y+h<scene.y+scene.h+w){
    for(int i=0;i<scene.fields.size();i++){
      Quad q = scene.fields.get(i);
      
      float d = dist(x,y,q.x,q.y);
      if(dens*4>d&&q!=this){
        q.dens2 = dens/4;
        q.kv2 = kv/4;
        q.col2 = col/4;
        q.kp = kp;
        q.dir2 = atan2(y-q.y,x-q.x);
        
      }}}
  };
  
  public void humans(){
    
  }
  
};

  



//void setup(){
//  image = loadImage("1_UsARa4r6x_ZuZATcxFqJ6A.jpeg");
//  size(1000,600);
//  dataset = new immageDataset(image,400);
//  //imageLoad(image);
  
//};

//void draw(){
  
//  background(50);
  
//  dataset.draw_test();
  
//  //dataset.cards.get(200).draw();
  
  
//};

class immageDataset{
  
  PImage image ;
  immageDataset dataset;
  
  ArrayList<Card> cards = new ArrayList<Card>();
  ArrayList<Card> train = new ArrayList<Card>();
  ArrayList<Card> test = new ArrayList<Card>();
  
  
  immageDataset(PImage image, int n){
    if(cards.size()<n){
    for (int i = 0; i < image.height-25; i+=25) {
      for (int j = 0; j < image.width; j+=25) {
        
              Card c = new Card(image,j,i);
              int pos = cards.size() + 1;
              cards.add(c);
              if(pos%5==0) test.add(c);
              else train.add(c);
    }}}
  };
  
  immageDataset(PImage image, int n,int offset){
    if(cards.size()<n){
    for (int i = 0; i < image.height-offset; i+=offset) {
      for (int j = 0; j < image.width; j+=offset) {
        
              Card c = new Card(image,j,i);
              int pos = cards.size() + 1;
              cards.add(c);
              if(pos%5==0) test.add(c);
              else train.add(c);
    }}}
  };
  
  immageDataset(PImage image, int n,int xoffset,int yoffset){
    if(cards.size()<n){
    for (int i = 0; i < image.height-yoffset; i+=yoffset) {
      for (int j = 0; j < image.width; j+=xoffset) {
        
              Card c = new Card(image,j,i);
              int wnum = image.width/xoffset;
              int pos = cards.size() + 1;
              cards.add(c);
              if(pos%5==0) test.add(c);
              else train.add(c);
    }}}
  };
  
  immageDataset(ArrayList<PImage> images){
    if(cards.size()<images.size()){
    for (int i = 0; i < images.size(); i++) {
              
              Card c = new Card(image,0,i);
              int pos = cards.size() +1;
              cards.add(c);
              if(pos%5==0) test.add(c);
              else train.add(c);
    }}
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void draw(){
    for(Card c: cards){
      c.draw();
    }
  };
  
  public void draw_train(){
    for(Card c: train){
      c.draw();
    }
  };
  
  public void draw_test(){
    for(Card c: test){
      c.draw();
    }
  };
  
  
  
  class Card{
  
  float x,y;
  int id;
  PImage image;
  
  Card(PImage Image, float xx,float yy){
    
    x = xx;
    y = yy; 
    id = cards.size();
    image = new PImage(25,25);
    image.loadPixels();
    for(int i=0;i<25;i++){
      for(int j=0;j<25;j++){
        
        int pos = j + i * 25;
        int pos2 = PApplet.parseInt(x+j) + PApplet.parseInt(y+i) * Image.width; 
      image.pixels[pos] = Image.pixels[pos2];
    }}
    image.updatePixels();
    
  }
  
  public void draw(){
    fill(0);
    //text(test.size(),x, y+10);
    image(image,x,y);
  }
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
};
  
};
class Img {
  float Mean = 0,Variance,VarianceR,VarianceG,VarianceB,VarianceBR,s_mult,currentSliderPos = 30,ix,iy;
  public PImage img,img2, mean,mean_,meanGx,meanGy,blurX,blurY, threshold, variance,varianceR,varianceG,varianceB,varianceBR,Gaussian,
         kMeans, kNearest,sobel, sobelx, sobely,sobel2, sobel2x, sobel2y, sobelMax,sobelMin,sobelG,gradientB, blur,combined,current,canny,cannyT,temp;
  int cutoff = 250,gridRes = 1,Type = 3,pointMax = 30,min = 40,max = 10,
    contourType = 1,linesCompleted,Mode = 4,thresh = 10,pixelThresh = 40,pixelThresh1 = 20;
  public String currentParameter,currentS;
  public boolean state;
  public int processes;
  ArrayList<String>workFlowLabels=new ArrayList<String>();
  String []ddLabels = {"Blur","BlurS","Canny","Canny2","Canny3","Canny4","CannyTrim","CannyTrim1",
                       "GaussianS","Gaussian 3","Gaussian 5","Mean","Variance","Sobel","Sobel2a",
                       "Sobel2b","Sobel Max","Sobel Max2", "Sobel Max3","Sobel Max4","SobelG","SobelG1",};
  
  String []menuLabels = {"Load","Save Workflow","Save Image","Restore Menus","State"};
  String []sobelSliderLabels = {"Mult","Range"};
  String []sobel2aliderLabels = {"Mult","Range"};
  String []sobel2bliderLabels = {"Mult","Range","Type"};
  String []sobelSliderLabels1 = {"Mult","Range","Threshold"};
  String []sobelGSSliderLabels = {"Mult","Range"};
  String []sobelSSliderLabels = {"Mult","Range"};
  String []sobelASliderLabels = {"Mult","Range"};
  String []sobel2SliderLabels = {"Mult","Range"};
  String []sobelMaxSliderLabels = {"Mult","Range"};
  String []sobelMax2SliderLabels = {"Mult","Range"};
  String []sobelMax3SliderLabels = {"Mult","Range"};
  String []sobelMax4SliderLabels = {"Mult","Range"};
  String []meanSliderLabels = {"Range"};
  String []meanASliderLabels = {"Mult","Range"};
  String []meanSSliderLabels = {"Mult","Range"};
  String []varianceSliderLabels = {"Mult","Range"};
  String []blurSliderLabels = {"Mult","Range"};
  String []blurSSliderLabels ;
  String []sharpenSliderLabels = {"Mult","Range"};
  String []substractSliderLabels ;
  String []gaussian3SliderLabels ;
  String []gaussian5SliderLabels ;
  String []gaussianSSliderLabels = {"Mult","Range"};
  String []combineSliderLabels ;
  String []cannySliderLabels = {"Mode","Thresh"};
  String []canny2SliderLabels = {"Mode","Thresh","Thresh1"};
  String []canny3SliderLabels = {"Mode","Thresh"};
  String []cannyTSliderLabels = {"Type","Thresh"};
  String []cannyT1SliderLabels = {"Type","Thresh"};
  String []cannyT2SliderLabels = {"Type","Thresh","Thresh2"};
  String []blendSliderLabels ;
  String []variance2SliderLabels  = {"Range"};
  String []variance3SliderLabels  = {"Range"};
  String []menuLabels1 = {"Load","Save","Pick Camera","Load workflow","Save workflow","Restore Menus"};
  String []menuLabels2 = {"Run"};
  String []menuLabels3 = {"Clear"};
  String []menuLabels4 = {"Run All"};
  String [][]kernelLabels = {{"Range"},
                             {"Mult","Output"},
                             {"Mult","Range"},
                             {"Mult","Range","Output"},
                             {"Mult","Thresh1","Thresh2"},
                             {"Mult","Range"},
                             
                             };
  String [] functions = {"Blur","BlurS","Gaussian 3","Gaussian 5","GausianS","Mean","MeanS",
                         "Variance", "VarianceS","Sobel", "SobelS","Sobel 2","Sobel Max","Canny","CannyS"};
  HashMap<String,String[]> workFlowSliders = new HashMap<String,String[]>();
  String []sliderLabels ,currentFolder,currentWorkFlow;
  String file,folder,location;
  PImage currentImage;
  PGraphics canvas2;
  Menu menu,run,runAll,clear;
  Dropdown workFlowDD;
  sliderBox sobelSlider, meanSlider, varianceSlider, blurSlider, sobelMaxSlider, sharpenSlider, gaussianSlider ;
  public float currentF;
  int currentImageIndex,counter;
  public int firstImageIndex;
  boolean update = true,imageF = true,videoF,audioF,camF,mdown,m2down,updateSliders,sDown,docked;
  public final int IMAGES = 0,VIDEOS = 1,AUDIO = 2,MOVIE = 3,SOUND = 4;
  public boolean load = true,toggle,iUpdate,iUpdate2,iUpdate3,iUpdate4,wUpdate;
  ArrayList<PImage> images = new ArrayList<PImage>();
  ArrayList<PImage> imagesWF = new ArrayList<PImage>();
  ArrayList<ArrayList<PImage>> imagesWF2 = new ArrayList<ArrayList<PImage>>();
  ArrayList<ArrayList<PImage>> processedImages = new ArrayList<ArrayList<PImage>>();
  ArrayList<PImage> thumbnails = new ArrayList<PImage>();
  ArrayList<PImage> currentThumbnails = new ArrayList<PImage>();
  ArrayList<PImage> nextThumbnails = new ArrayList<PImage>();
  ArrayList<PImage> previousThumbnails = new ArrayList<PImage>();
  ArrayList<sliderBox> sliderBoxes = new ArrayList<sliderBox>();
  ArrayList<String> names = new ArrayList<String>();
  fileInput input;
  fileOutput output,outputWF;
  tab info,sliders,workFlow,workFlow1,workFlow3;
  PGraphics canvas,camera,c1,c2,pass1,pass2,pass3,pass4;
  PShader Sobel,Blur,GaussianS,Sobel1,Sobel2,SobelG,SobelG1,SobelMax,SobelMax2,Canny,CannyTrim,CannyTrim1;
  String []shaders = {"sobel.glsl","blur.glsl","gBlur.glsl"};
  String imPath = dataPath("images");
  String shaderPath = dataPath("shaders");
  //currentField;
  String [] instructions;
  cell cell;
  Dock myDock;
  
  int [][]SobelH = {{-1, -2, -1}, 
                    {0, 0, 0}, 
                    {1, 2, 1}};

  int [][]SobelV = {{-1, 0, 1}, 
                    {-2, 0, 2}, 
                    {-1, 0, 1}};
                    
  int [][]SobelH_ = {{-2, -1, 0}, 
                    {-1, 0, 1}, 
                    {0, 1, 2}};

  int [][]SobelV_ = {{0, 1, 2}, 
                    {-1, 0, 1}, 
                    {-2, -1, 0}};
                    
  int [][]edgev = {{-1, -2, -1}, 
                   {0, 0, 0}, 
                   {1, 2, 1}};

  int [][]edgeh = {{-1, 0, 1}, 
                   {-2, 0, 2}, 
                   {-1, 0, 1}};

  int [][]LapLacian = {{0, 1, 0}, 
                      {-1, 4, -1}, 
                      {0, 1, 0}};

  int [][]LapLacianD = {{-1, -1, -1}, 
                        {-1, 8, -1}, 
                        {-1, -1, -1}};
                        
  int [][]edge = {{-1, 1, -1}, 
                  {-1, 0, -1}, 
                  {-1, -1, -1}};
                  
  int [][]meanX = {{1,1,1}, 
                   {0,0,0}, 
                   {1,1,1}};

  int [][]meanY = {{1,1,1}, 
                   {2,0,2}, 
                   {1,0,1}};
                   
  float [][]gaussian3 = {{1,2,1}, 
                         {2,4,2}, 
                         {1,2,1}};
                     
  float [][]gaussian5 = {{1,4,7,4,1}, 
                         {4,16,126,16,4}, 
                         {7,26,41,26,7},
                         {4,16,26,16,4},
                         {1,4,7,4,1}};
                   
  int [][]neighbours;
  float [][]gradient;
  
  Img(String s) {
    img = loadImage(s);
    img2 = loadImage(s);
    neighbours = new int[img.width][img.height];
    gradient = new float[img.width][img.height];
    c1 = createGraphics(img.width,img.height,P2D);
    c2 = createGraphics(img.width,img.height,P2D);
    pass1 = createGraphics(img.width,img.height,P2D);
    pass2 = createGraphics(img.width,img.height,P2D);
    pass3 = createGraphics(img.width,img.height,P2D);
    pass4 = createGraphics(img.width,img.height,P2D);
    Sobel = loadShader(shaderPath+"sobel.glsl");
    Sobel1 = loadShader(shaderPath+"sobel1.glsl");
    Sobel2 = loadShader(shaderPath+"sobel2.glsl");
    SobelG = loadShader(shaderPath+"sobelG.glsl");
    SobelG1 = loadShader(shaderPath+"sobelG1.glsl");
    SobelMax = loadShader(shaderPath+"sobelMax.glsl");
    Canny = loadShader(shaderPath+"canny.glsl");
    CannyTrim = loadShader(shaderPath+"cannyTrim.glsl");
    CannyTrim1 = loadShader(shaderPath+"cannyTrim1.glsl");
    GaussianS = loadShader(shaderPath+"gaussian.glsl");
    c1.beginDraw();
    c1.image(img, 0, 0);
    c1.endDraw();
    pass1.beginDraw();
    pass1.image(img, 0, 0);
    pass1.endDraw();
    pass2.beginDraw();
    pass2.image(img, 0, 0);
    pass2.endDraw();
    pass3.beginDraw();
    pass3.image(img, 0, 0);
    pass3.endDraw();
    pass4.beginDraw();
    pass4.image(img, 0, 0);
    pass4.endDraw();
    cell = new cell();
    cell.pImage = this.img;
    initHashMap();
  };

  Img(PImage p) {
    img = new PImage(p.width,p.height,ARGB);
    img.pixels = p.pixels;
    cell = new cell();
    initHashMap();
  };

  Img(int w,int h){
      img = new PImage(w, h, ARGB);
      cell = new cell();
      initHashMap();
  };
  
  Img(int a){
    float mx = width-200;
    if(a==0){
      imageF=true;
      menu = new Menu(twitter.x+twitter.w,0,50,20,"IMG",menuLabels,0);
      //menu.toggle=1;
      //menus.add(menu);
      //menu = new Menu(0,0,30,20,"File",flabels,0);
    }
    if(a==1||a==3)videoF=true;
    if(a==2||a==4){
      audioF=true;
      menu = new Menu(mx,23,100,menuLabels1);
    }
    if(a==6){
      imageF = false;
      camF = true;
      menu = new Menu(mx,23,100,menuLabels1);
    }

    myDock = new Dock(0,height - 22,width,24,this);
    info = new tab(0,height - 170,width,150,"Images");
    sliders = new tab(width-100,68,100,height - 240,"Sliders");
    sliders.parentDock = myDock;
    sliders.title.w -=20;
    Button b = new Button(80,0,20,20,"<");
    sliders.add(b);
    workFlow = new tab(0,68,100,height - 240,"Workflow");
    workFlow.parentDock = myDock;
    //workFlow.addState(1);
    workFlow1 = new tab(0,68,100,height - 240,"Workflow");
    workFlow1.parentDock = myDock;
    workFlowDD = new Dropdown(0,20,100,"Function",ddLabels,0);
    //workFlow.add(1,workFlowDD);
    workFlow1.add(workFlowDD);
    workFlow1.toggle = true;
    b = new Button(workFlow1.w-20,40,20,20);
    workFlow1.add(b);
    b = new Button(workFlow1.w-40,40,20,20);
    workFlow1.add(b);
    TextArea m1 = new TextArea(0,20,100,workFlow.h - 60,10,100);
    run = new Menu(0,workFlow.h-40,100,menuLabels2);
    clear = new Menu(50,workFlow.h-40,workFlow.w-run.w,menuLabels3);
    runAll = new Menu(0,workFlow.h-20,workFlow.w,menuLabels4);
    run.w = 50;
    run.items.get(0).w = 50;
    clear.w = 50;
    clear.items.get(0).w = 50;
    runAll.w = 100;
    runAll.items.get(0).w = 100;
    workFlow.add(m1);
    workFlow.add(run);
    workFlow.add(clear);
    workFlow.add(runAll);
    workFlow1.add(run);
    workFlow1.add(clear);
    workFlow1.add(runAll);
    
    input = new fileInput(menu.items.get(0),true);
    output = new fileOutput();
    info.toggle = true;
    sliders.toggle = true;
    workFlow.toggle = true;
    info.draggable = true;
    info.scrollable = true;
    workFlow.draggable = true;
    sliders.draggable = true;
    sliders.scrollable = true;
    //workFlow.scrollable = true;
    canvas = createGraphics(width-200,height - 190);
    //menu.toggle=1;
    cell = new cell();
    initHashMap();
    initDock1();
  };

  Img(){
    menu = new Menu(width-100,23,100,menuLabels);
    
    info = new tab(0,height - 170,width,150,"Images");
    sliders = new tab(width-100,68,100,height - 240,"Sliders");
    sliders.title.w -=20;
    Button b = new Button(80,0,20,20,"<");
    sliders.add(b);
    workFlow = new tab(0,68,100,height - 240,"Workflow");
    TextArea m1 = new TextArea(0,20,100,height - 240,10,100);
    workFlow.add(m1);
    
    input = new fileInput(menu.items.get(0),true);
    output = new fileOutput();
    info.toggle = true;
    sliders.toggle = true;
    workFlow.toggle = true;
    info.draggable = true;
    info.scrollable = true;
    workFlow.draggable = true;
    sliders.draggable = true;
    sliders.scrollable = true;
    canvas = createGraphics(width-200,height - 190);
    menu.toggle=1;
    cell = new cell();
    initHashMap();
    initDock1();
    
  };

  public void initDock1(){
    myDock.add(info);
    myDock.add(sliders);
    myDock.add(workFlow);
    myDock.add(workFlow1);
  };

  public void initDock(){
    // float currentWidth = 0;
    // // -------------------workflow 0----------------
    
    // String loc = "Workflow";
    // PGraphics canvas = createGraphics((int)textWidth(loc)+20,20);
    // myDock.canvases.add(canvas);
    // Button b = new Button(currentWidth,y,textWidth(loc)+20,20,loc);

    // b.togglebox = true;
    // myDock.buttons.add(b);
    // myDock.objects.add(workflow);
    // myDock.currentWidth += textWidth(loc)+20;
    // myDock.names.add(loc);

    // // -------------------workflow 1----------------
    // String loc = "Workflow1";
    // PGraphics canvas = createGraphics((int)textWidth(loc)+20,20);
    // myDock.canvases.add(canvas);
    // b = new Button(currentWidth,y,textWidth(loc)+20,20,loc);

    // b.togglebox = true;
    // myDock.buttons.add(b);
    // myDock.objects.add(workflow1);
    // myDock.currentWidth += textWidth(loc)+20;
    // myDock.names.add(loc);

    // // -------------------sliders----------------
    // String loc = "Sliders";
    // PGraphics canvas = createGraphics((int)textWidth(loc)+20,20);
    // myDock.canvases.add(canvas);
    // b = new Button(currentWidth,y,textWidth(loc)+20,20,loc);

    // b.togglebox = true;
    // myDock.buttons.add(b);
    // myDock.objects.add(sliders);
    // myDock.currentWidth += textWidth(loc)+20;
    // myDock.names.add(loc);

    // // -------------------info----------------
    // String loc = "Info";
    // PGraphics canvas = createGraphics((int)textWidth(loc)+20,20);
    // myDock.canvases.add(canvas);
    // b = new Button(currentWidth,y,textWidth(loc)+20,20,loc);

    // b.togglebox = true;
    // myDock.buttons.add(b);
    // myDock.objects.add(info);
    // myDock.currentWidth += textWidth(loc)+20;
    // myDock.names.add(loc);
  };

  public void initHashMap(){
    workFlowSliders.put("Blur",blurSliderLabels);
    workFlowSliders.put("BlurS",blurSSliderLabels);
    workFlowSliders.put("Gaussian 3",gaussian3SliderLabels);
    workFlowSliders.put("Gaussian 5",gaussian5SliderLabels);
    workFlowSliders.put("GaussianS",gaussianSSliderLabels);
    workFlowSliders.put("Mean",meanSliderLabels);
    workFlowSliders.put("MeanS",meanSSliderLabels);
    workFlowSliders.put("Sobel",sobelSliderLabels);
    workFlowSliders.put("SobelGS",sobelGSSliderLabels);
    workFlowSliders.put("SobelS",sobelSSliderLabels);
    workFlowSliders.put("SobelS2",sobelSSliderLabels);
    workFlowSliders.put("SobelS3",sobelSSliderLabels);
    workFlowSliders.put("Sobel 2",sobel2SliderLabels);
    workFlowSliders.put("Sobel Max",sobelMaxSliderLabels);
    workFlowSliders.put("Sobel Max2",sobelMaxSliderLabels);
    workFlowSliders.put("Sobel Max3",sobelMaxSliderLabels);
    workFlowSliders.put("Sobel Max4",sobelMaxSliderLabels);
    workFlowSliders.put("Canny",cannySliderLabels);
    workFlowSliders.put("CannyTrim",cannyTSliderLabels);
    workFlowSliders.put("CannyTrim1",cannyT1SliderLabels);
    workFlowSliders.put("Combine",combineSliderLabels);
    workFlowSliders.put("Substract",substractSliderLabels);
    workFlowSliders.put("Blend",blendSliderLabels);
    workFlowSliders.put("Variance",varianceSliderLabels);
    workFlowSliders.put("Variance2",variance2SliderLabels);
    workFlowSliders.put("Variance3",variance3SliderLabels);
  };

  public Object parseParameter(String parameter) {
    try {
        return Integer.parseInt(parameter);
      } catch(NumberFormatException e) {
          try {
              return Float.parseFloat(parameter);
          } catch(NumberFormatException e1) {
              try {
                  Field field = this.getClass().getField(parameter);
                  return field.get(this);
              } catch (NoSuchFieldException e2){return null;}
                catch(IllegalAccessException e2) {
                  throw new RuntimeException(e2);
              }
          }
      }
  };

  public Class<?> getParameterClass(String parameter) {
      try {
          Integer.parseInt(parameter);
          return int.class;
      } catch(NumberFormatException e) {
          try {
              Float.parseFloat(parameter);
              return float.class;
          } catch(NumberFormatException e1) {
              
              if(parameter!=null)return PImage.class;
              else return null;
          }
      }
  };

  public void loadInput(){
    if(location!=null){
      String loc = "";
      if(file!=null||folder!=null){
        if(file!=null)loc = file;
        else loc = folder;

      }
      load = false;
      location = null;
    }
  };

  public void display(){

  };

  public void menus(){
    
    if(toggle){
      if(sliders.buttons.size()>0&&sliders.buttons.get(0).pos(sliders.getMouse())&&mousePressed&&!mdown){
        updateSliders = true;
      }
      if(!docked){
        // sliders
        // BMS.dock
        docked = true;
      }
      if(!info.sliderh.mdown)myDock.logic();
      myDock.drawItems();
      if(imageF)loadImages();
      if(videoF)loadVideo();
      if(audioF)loadSound();

      save();
      workFlowLogic();
      infoTabLogic();
      
      info.displayTab();
      info.drawDynamicImages(info.images,currentImageIndex);
      
      slidersTabLogic();
      if(!state)workFlow.displayTab();
      else workFlow1.displayTab();

      displayCam();
      
      menu.click(true);

      if(menu.click(4))menu.toggle(4,BMS.imageProcessing,"state");

      if(!state)runWorkFlow();
      else runWorkFlow1();

      displayCanvas();
      menu.draw();
      sliders.displayTab();
    }
  };

  public void displayCanvas(){
    if(!mousePressed)mdown = false;

    if(currentImage!=null&&canvas!=null){
        if(iUpdate){
          canvas.beginDraw();
          canvas.background(50);
          canvas.image(currentImage,0,0);
          canvas.endDraw();

          iUpdate = false;
        }
        if(iUpdate2&&names.size()>0){
          if((firstImageIndex + currentImageIndex-3)<names.size()&&(firstImageIndex + currentImageIndex-3)>0)
          currentImage = loadImage(names.get(firstImageIndex + currentImageIndex-3));
          canvas.beginDraw();
          canvas.background(50);
          canvas.image(currentImage,0,0);
          canvas.endDraw();
          iUpdate2 = false;
        }
        
      }

      if(iUpdate4&&imagesWF.size()>0){
          currentImage = imagesWF.get(imagesWF.size()-1);
          canvas.beginDraw();
          canvas.background(50);
          canvas.image(currentImage,0,0);
          canvas.endDraw();
          iUpdate4 = false;
        }else if(iUpdate4&&imagesWF.size()==0){
          println("Workflow error...");
          iUpdate4 = false;
        }
      image(canvas,workFlow.w,21);
  };

  public void slidersTabLogic(){
    int a = 200;
    int b = 100;
    int c = 40;
    
    if(sliders.buttons.size()>0&&sliders.buttons.get(0).toggle==1&&updateSliders){
      sliders.canvas = createGraphics(a,(int)sliders.h);
      sliders.buttons.get(0).x = a-20;
      sliders.title.w = a-20;
      sliders.x = width -a;
      sliders.w = a;
      sliders.sliderh.w = a;
      sliders.sliderv.x = sliders.w-10;
      updateSliders = false;
      for(int i=0;i<sliders.sliderBoxes.size();i++){
        sliderBox s = sliders.sliderBoxes.get(i);
        if(s!=null)s.menu.x = c;
      }

      for(int i=1;i<sliders.buttons.size();i++){
        if(sliders.buttons.size()>1){
        Button b1 = sliders.buttons.get(i);
        b1.x = c;
      }}
    }
    if(sliders.buttons.size()>0&&sliders.buttons.get(0).toggle==0&&updateSliders){
      sliders.canvas = createGraphics(b,(int)sliders.h);
      sliders.x = width -b;
      sliders.buttons.get(0).x = b-20;
      sliders.title.w = b-20;
      sliders.w = b;
      sliders.sliderh.w = b;
      sliders.sliderv.x = sliders.w-10;
      updateSliders = false;

      for(int i=0;i<sliders.sliderBoxes.size();i++){
        sliderBox s = sliders.sliderBoxes.get(i);
        if(s!=null){
          s.menu.x = 0;
          
        }
      }
      for(int i=1;i<sliders.buttons.size();i++){
        Button b1 = sliders.buttons.get(i);
        b1.x = 0;
      }
    }

    for(int i=0;i<sliders.sliderBoxes.size();i++){
        sliderBox s = sliders.sliderBoxes.get(i);
        if(s!=null){
          for(int j=0;j<s.menu.sliders.size();j++){
            Slider s1 = s.menu.sliders.get(j);
            if(s1.label=="Mult")s1.set(1,50);
            if(s1.label=="Range")s1.setint(1,10);
            if(s1.label=="Thresh")s1.set(1,255);
            if(s1.label=="Type")s1.setint(1,10);
          }
        }
      }
  };

  public void infoTabLogic(){
    if(thumbnails.size()>0)info.sliderh.setint(0,thumbnails.size(),this,"firstImageIndex");
      if(!mousePressed&&info.posTab()){
        currentImageIndex = floor(map(mouseX,0,info.w,0,7));
      }else if(info.posTab()&&!info.sliderh.mdown)iUpdate2 = true;

      if(info.sliderh.mdown&&mousePressed&&info.posTab()&&!iUpdate&&mouseX!=pmouseX){
        iUpdate = true;
        mdown = true;
      }

    if(names!=null&&names.size()>0&&iUpdate){
      
      for(int i=firstImageIndex-4;i<firstImageIndex+5;i++){
          if(i>0&&i<thumbnails.size()){
            PImage p1 = thumbnails.get(i);
            
            if(!info.images.contains(p1)){
              info.images.add(p1);
            }
            if(info.images.size()>9)info.images.remove(0);
        }}
    }

  };

  public void workFlowLogic(){
    Dropdown d1 = null;
    if(state)d1 = workFlow1.dmenus.get(workFlow1.dmenus.size()-1);

    if(d1!=null&&d1.toggle!=1){
      
      if(state&&workFlow1.buttons.get(0).click(workFlow1.getMouse())&&d1.index>-1){
        
        img = currentImage;

        workFlow1.add(new Dropdown(0,workFlow1.dmenus.size()*20+20,100,"Function " + workFlow1.dmenus.size(),ddLabels,0));
        workFlow1.buttons.get(0).y+=20;
        workFlow1.buttons.get(1).y+=20;
        //println(workFlow1.Dropdowns.get(0).)
        if(workFlowSliders.get(d1.label)!=null){
          sliderBox s = null;
          Button b1 = null; 
          if(sliders.buttons.size()>0&&sliders.buttons.get(0).toggle==0){
            s = new sliderBox(0,30+ currentSliderPos,90,5,workFlowSliders.get(d1.label),sliders);
            b1 = new Button(0,30+ currentSliderPos-20,90,20,d1.label);
          }else{
            s = new sliderBox(30,30+ currentSliderPos,90,5,workFlowSliders.get(d1.label),sliders);
            b1 = new Button(30,30+ currentSliderPos-20,90,20,d1.label);
          } 
          
          s.visible = true;
          s.tooltip = null;
          sliders.add(s);
          b1.border = false;
          sliders.add(b1);
          
        }else{
          Button b1;
          if(sliders.buttons.size()>0&&sliders.buttons.get(0).toggle==0){
            
            b1 = new Button(0,30+ currentSliderPos-20,90,20,d1.label);
          }else{
            b1 = new Button(30,30+ currentSliderPos-20,90,20,d1.label);
          } 
          sliders.buttons.add(b1);
          sliders.sliderBoxes.add(null);
        }

        sliderBox s1 = null;
        if(sliders.sliderBoxes.get(sliders.sliderBoxes.size()-1)!=null){
        s1 = sliders.sliderBoxes.get(sliders.sliderBoxes.size()-1);

        currentSliderPos = s1.y+s1.h ;
        }else{
          currentSliderPos += 40;
        }
      }

      if(workFlow1.buttons.get(1).click(workFlow1.getMouse())&&workFlow1.dmenus.size()>1){
        if(workFlow1.dmenus.size()>=1)workFlow1.dmenus.remove(workFlow1.dmenus.size()-1);
        if(sliders.sliderBoxes.size()>=1){
          sliderBox s1 ;
          if(sliders.sliderBoxes.get(sliders.sliderBoxes.size()-1)!=null){
            s1 = sliders.sliderBoxes.get(sliders.sliderBoxes.size()-1);
            currentSliderPos = s1.y-s1.h-20;
            if(currentSliderPos<sliders.y+20)currentSliderPos = currentSliderPos+20;
            sliders.sliderBoxes.remove(sliders.sliderBoxes.size()-1);
            sliders.buttons.remove(sliders.buttons.size()-1);
          }
          else {
            sliders.sliderBoxes.remove(sliders.sliderBoxes.size()-1);
            sliders.buttons.remove(sliders.buttons.size()-1);
            currentSliderPos -= 20;
          }

          workFlow1.buttons.get(0).y-=20;
          workFlow1.buttons.get(1).y-=20;
        }
      }
    }
      if(info.sliderh.mdown)iUpdate2 = true;

    // if(workFlow1.menus.items.get(0).click(workflow.getMouse())){

    // }
  };

  public void workFlowLogic1(){
    //if()
  };

  public void displayCam(){

    if(BMS.Cam!=null){
        set(BMS.Cam);
        canvas.beginDraw();
        //if(img!=null)
        canvas.image(BMS.Cam,0,0);
        if(mousePressed)println("cam connected");
        
        canvas.background(50);
        if(firstImageIndex<images.size()&&firstImageIndex>0)canvas.image(images.get(firstImageIndex),0,0);
        canvas.endDraw();
      }

  };

  public void runWorkFlow(){
    if(run.selfClick(0)&&!state){
      println("workflow 0");
        imagesWF = new ArrayList<PImage>();
        img = currentImage;
        
        if(workFlow.textareas.get(0).getValue()!=null){

          println("Run",workFlow.textareas.get(0).getValue());
          String[] s = splitTokens(workFlow.textareas.get(0).getValue(),",");
          String[] s1 = new String[1];
          currentWorkFlow = s1;
          s1[0] = workFlow.textareas.get(0).getValue();
          iUpdate3 = true;
          workflow(s1);
          //println(s1);
          
        }else println(false);
      }

      if(clear.selfClick(0)){
        currentWorkFlow = null;
        workFlow.textareas.get(0).textBox ="";
        workFlow.textareas.get(0).textbox = new ArrayList<Letter>();
      }
      // if(runAll.selfClick(0)){

      //   for(int i=0;i<names.size();i++){

      //   }
      // }
  };

  public void runWorkFlow1(){
    if(run.selfClick(0)&&state){
        imagesWF = new ArrayList<PImage>();
        img = currentImage;
        
        if(sliders.sliderBoxes.size()>0){
          String log = "Run state1";

          String []wf = new String[sliders.sliderBoxes.size()] ;
          println("Run state1",workFlow.textareas.get(0).getValue());
          for(int i=0;i<sliders.sliderBoxes.size();i++){
            String s = workFlow1.dmenus.get(i).label + "(";
            sliderBox sl = null;
            if(sliders.sliderBoxes.get(i)!=null)
              sl = sliders.sliderBoxes.get(i);
              for(int j=0;j<sl.menu.sliders.size();j++){
                Slider slider = sl.menu.sliders.get(j);

                float v1 = -1;
                int v2 = -1;

                if(slider.label=="Mult"||slider.label=="Thresh"){
                  if(j<sl.menu.sliders.size()-1)s += slider.value + ",";
                  else s += slider.value ;
                }else{
                  if(j<sl.menu.sliders.size()-1)s += (int)slider.value + ",";
                  else s += (int)slider.value ;
                }
              }
            s += ")";
            if(s!=null)wf[i] = s;
          }
          println(wf);
          // String[] s1 = splitTokens(workFlow.textareas.get(0).getValue(),",");
          // String[] s2 = new String[1];
          // currentWorkFlow = s2;
          // s2[0] = workFlow.textareas.get(0).getValue();
          // iUpdate3 = true;
          // workflow(s2);
          // println(s2);
          
        }else println("No workflow available");
      }

      if(clear.selfClick(0)&&state){
        currentWorkFlow = null;

        while(sliders.buttons.size()>1)sliders.buttons.remove(sliders.buttons.size()-1);
        while(sliders.sliderBoxes.size()>0)sliders.buttons.remove(sliders.sliderBoxes.size()-1);

      }
      // if(runAll.selfClick(0)){

      //   for(int i=0;i<names.size();i++){

      //   }
      // }
  };

  public void loadImages(){
    input.listen();
    if(input.values!=null){
      println("input",input.values.length);
      currentFolder = input.values;
          //names = new String[input.values.length];
          if(images.size()<input.values.length)
          for(int i=0;i<input.values.length;i++){
            String s1 = input.files[i].getAbsolutePath();
            String[] m1 = match(s1, ".jpg");
            String[] m2 = match(s1, ".jpeg");
            String[] m3 = match(s1, ".gif");
            String[] m4 = match(s1, ".png");
            String[] m5 = match(s1, ".bmp");
            String[] m6 = match(s1, ".JPG");
            String[] m7 = match(s1, ".JPEG");
            String[] m8 = match(s1, ".GIF");
            String[] m9 = match(s1, ".PNG");
            String[] m10 = match(s1, ".BMP");

            if (m1 != null||m2 != null||m3 != null||m4 != null||m5 != null||
                m6 != null||m7 != null||m8 != null||m9 != null||m10 != null) { 
              
                PImage thumbnail = loadImage(s1);
                
                thumbnail.resize(150,90);
                thumbnails.add(thumbnail);
                names.add(s1);
            }
          }
          if(names.size()>0){
            println("step 1","first index:",firstImageIndex);
            info.sliderh.valuex = 0;
            info.sliderh.value = 0;
            if(firstImageIndex<0)firstImageIndex=0;
            currentImage = loadImage(names.get(firstImageIndex));
            iUpdate = true;
          }else{
            println("No images found...");
            names = new ArrayList<String>();
          }
          input.values = null;
    } 
    
  };

  public void loadVideo(){


  };

  public void loadSound(){


  };

  public void save(){

  };
  
  public void workflow(String a){
    String[] s = splitTokens(a, "-");
    println("workflow 0");
    for(int i=0;i<s.length;i++){
      String s1 = s[i];
      
      //ArrayList<Integer> [] pIndex = strIndex(s1,"(",")");
      int [] pIndex = strIndex1(s1,"(",")");
      String function = s1.substring(0,pIndex[0]);
      
      //String[]parameters = new String [pIndex[0].size()];
      String[]parameters = splitTokens(s[i].substring(pIndex[0]+1,pIndex[1]),",");
      parameters[parameters.length-1] =  parameters[parameters.length-1].substring(0,parameters.length-1);
      
      boolean image = false;
      Method method = null;
      try {
        method = this.getClass().getMethod(function,float.class,float.class);
        //Img instance = new Img();
        float result = (float) method.invoke(this, 1, 3);
        println("result",result);
      } catch (SecurityException e) {
        println(function , "se");
      }catch (NoSuchMethodException e) {  
        println(function , "nsm");
      }
      catch (IllegalAccessException e) {  
        println(function , "nsm");
      }
      catch (InvocationTargetException e) {  
        println(function , "nsm");
      }
      for(int j=0;j<parameters.length;j++){
        
        float currentF = PApplet.parseFloat(parameters[j]);
        
        if(currentF>-10000000&&currentF<10000000){
          println(function,"f " + currentF);
        }else println(function,"s " + parameters[j]);
        
      }
    }
  };
  
  public void workflow(String[] a){
    if(!iUpdate3){
      println("something wrong..");

    }
    if(iUpdate3&&a!=null){
      println("workflow 0");
      String[] s = a;
      
      for(int i=0;i<s.length;i++){
        String s1 = s[i];
        if(s[i].length()>0){
        int [] pIndex = strIndex1(s1,"(",")");
        String function = s1.substring(0,pIndex[0]);
        
        String[]parameters = splitTokens(s[i].substring(pIndex[0]+1,pIndex[1]),",");
        print("Parameters",function +"(");
        String s2 = "";
        Class<?>[] parameterClasses = new Class<?>[parameters.length];
        Object[] parsedParameters = new Object[parameters.length];
        for(int j=0;j<parameters.length;j++){
          //print(parameters[j]);
          
          parameterClasses[j] = getParameterClass(parameters[j]);
          parsedParameters[j] = parseParameter(parameters[j]);
          // s2+=parameterClasses[j]+" "+parameters[j];
          s2 += parameters[j];
          if(j<parameters.length-1)s2+=",";
        }
        println(s2+")");
        
        update = true;
        try {
            Method method = this.getClass().getMethod(function, parameterClasses);
            method.invoke(this, parsedParameters);
            img = imagesWF.get(imagesWF.size()-1);
            workFlowLabels.add(function);
          } catch (NoSuchMethodException e){println("nsm",function,parameterClasses[0]);e.printStackTrace();}
            catch(IllegalAccessException e){println("ia");e.printStackTrace();}
            catch( InvocationTargetException e){println("it...Check images");e.printStackTrace();}
    }}
    update = false;
  }else if(a==null){
    iUpdate3 = false;
    println("Please correct function...");
  }

};
  
public void workflow2(String[] a){
    if(update&&a!=null){
      String[] s = a;
      
      for(int i=0;i<s.length;i++){
        String s1 = s[i];
        if(s[i].length()>0){
        int [] pIndex = strIndex1(s1,"(",")");
        String function = s1.substring(0,pIndex[0]);
        
        String[]parameters = splitTokens(s[i].substring(pIndex[0]+1,pIndex[1]),",");
        print("p",function +"(");
        String s2 = "";
        Class<?>[] parameterClasses = new Class<?>[parameters.length];
        Object[] parsedParameters = new Object[parameters.length];
        for(int j=0;j<parameters.length;j++){
          //print(parameters[j]);
          
          parameterClasses[j] = getParameterClass(parameters[j]);
          parsedParameters[j] = parseParameter(parameters[j]);
          // s2+=parameterClasses[j]+" "+parameters[j];
          s2 += parameters[j];
          if(j<parameters.length-1)s2+=",";
        }
        println(s2+")");
        
        update = true;
        try {
            Method method = this.getClass().getMethod(function, parameterClasses);
            method.invoke(this, parsedParameters);
          } catch (NoSuchMethodException e){println("nsm",function,"...Check Params?");}
            catch(IllegalAccessException e){println("ia") ;}
            catch( InvocationTargetException e){println("it","This function is missing an image...");e.printStackTrace();}
    }}
    update = false;
  }else if(a==null)update = false;
  
  if(keyPressed&&key =='r')update = true;
      
  };
  
  
public void catch1(){
    
  };
  
  public void reflection(){
    
  };
  
  public float mult(float a,float b){
    return a * b;
  };
  
  //String[] split(String s,String s1){
  //  String[]S = splitTokens(s.substring(pIndex[0]+1,pIndex[1]),",");
  //  parameters[parameters.length-1] =  parameters[parameters.length-1].replaceAll(")s+","");
  //  return 
  //};
  
  public int [] strIndex1(String s,String a,String b){
    int[]index = new int [2];
    for(int i=0;i<s.length();i++){
      char c = s.charAt(i);
      if(c=='(')index[0] = i;
      if(c==')')index[1] = i;
    }
    return index;
  };
  
  public ArrayList [] strIndex(String s,String a,String b){
    ArrayList[]index = new ArrayList [2];
    index[0] = new ArrayList<Integer>();
    index[1] = new ArrayList<Integer>();
    for(int i=0;i<s.length();i++){
      char c = s.charAt(i);
      if(c=='(')index[0].add(i);
      if(c==')')index[1].add(i);
    }
    return index;
  };
  
  public int findNext(String s){
    int a = -1;
    
    return a;
  };
  
  public void set(PImage p){
    img = p;
    c1 = createGraphics(img.width,img.height,P2D);
  };

  public void threshold(float a) {
    threshold = new PImage(img.width, img.height, RGB);
    img.loadPixels();
    threshold.loadPixels();
    if (mean==null) {
      for (int i=0; i<img.width; i++) {
        for (int j=0; j<img.height; j++) {
          int p = i + j * img.width;
          float b = brightness(img.pixels[p]);
          if (b>a)b = 0;
          threshold.pixels[p] = color(255-b);
        }
      }
    } else {
      //for (int i=0; i<mean.width; i++) {
      //  for (int j=0; j<mean.height; j++) {
      //    int p = i + j * mean.width;
      //    float b = brightness(mean.pixels[p]);
      //    //if (b>a)b = 0;
      //    threshold.pixels[p] = color(b);
      //  }
      //}
    }

    threshold.updatePixels();

    threshold.loadPixels();
    for (int i=0; i<img.pixels.length; i++) {
      float b = brightness(mean.pixels[i]);
      //println(b);
      //if (b<a)b=0;
      b = 255;

      threshold.pixels[i] = color(random(b));
      //threshold.pixels[i] = color(b);
    }
    threshold.updatePixels();
    imagesWF.add(threshold);
  };

  public void threshold(PImage im,float a) {
    threshold = new PImage(im.width, im.height, RGB);
    threshold.loadPixels();
    im.loadPixels();

    for (int i=0; i<im.width; i++) {
      for (int j=0; j<im.height; j++) {
        
        int p = i + j * im.width;
        float b = brightness(im.pixels[p]);
        boolean k = getTMin(i,j,im,a);
        //b = 255;
        if (k)b = 0;
        else b = 255;
  
        threshold.pixels[p] = color((b));
    }}
    threshold.updatePixels();
    imagesWF.add(threshold);
  };
  
  public boolean getTMin(int x, int y,PImage im,float t) {
    
    float []min = new float[2];
    min[0] = 255;
    
    boolean k = false;
    int p = x + y * im.width;
    
    for (int i=x-1; i<=x+1; i++) {
      for (int j=y-1; j<=y+1; j++) {
        
        int p1 = i+j*im.width;
        
        if(p1>0&&p1<im.pixels.length&&p1!=p){
          
          float c = brightness(im.pixels[p1]);
          
          if(min[0]>c){
            min[0] = c;
            min[1] = p1;
          }}}
    }
    
    int p1 = (int)min[1];
    
    float c = brightness(im.pixels[p]);
    float c2 = brightness(im.pixels[p1]);
    float t2 = 30;
    //println(min[0]);
    float d = abs((c)-c2);
    
    //if(c<=c2&&c<t||c2<t&&d<t2)k = true;
    //if(c<t&&(c<=c2)||c2<t&&(d<t2)||c2<t&&d<t2)k = true;
    //if(c<t&&(c>=c2)^c>t&&(d>t2)||c2<t&&d<t2)k = true;
    if(c2<c){
      if(c2<t+t2)k = true;
    }
    else{
      //if(c<t)k = true;
    }
    //println(c,k,t,t+t2);
    //println(c,c2,c<t,d<t2,t,k,d);
    //println(d<t2&&c2>c,c2<c,c,c2,k);
    return k;
    
  };

  public void mean() {

    mean = new PImage(img.width, img.height, RGB);
    float mean_ = 0;
    img.loadPixels();
    for (int i=0; i<img.pixels.length; i++) {
      float b = brightness(img.pixels[i]);
      mean_ += b;
    }

    mean_ /= img.pixels.length;

    mean.loadPixels();
    for (int i=0; i<img.pixels.length; i++) {
      float b = brightness(img.pixels[i]);
      float a = mean_ - b;
      mean.pixels[i] = color(255-a);
    }

    mean.updatePixels();
    imagesWF.add(mean);
    c1.beginDraw();
    c1.image(mean, 0, 0);
    c1.endDraw();
  };

  public void mean(float k) {

    mean = new PImage(img.width, img.height, RGB);
    Mean = 0;
    img.loadPixels();
    for (int i=0; i<img.pixels.length; i++) {
      float b = brightness(img.pixels[i]);
      Mean += b;
    }

    Mean /= img.pixels.length;
    //Mean = k + Mean;

    mean.loadPixels();
    for (int i=0; i<img.pixels.length; i++) {
      float b = brightness(img.pixels[i]);
      float a = Mean - b;
      mean.pixels[i] = color(255-a);
    }

    mean.updatePixels();
    imagesWF.add(mean);
    c1.beginDraw();
    c1.image(mean, 0, 0);
    c1.endDraw();
  };

  public void mean(int a) {
    mean = new PImage(img.width, img.height, RGB);
    mean.loadPixels();
    mean_ = new PImage(img.width, img.height, RGB);
    mean_.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        //float b = brightness(img.pixels[p]);

        float []mn = getNeighboursMean(i, j, a);
        float m = mn[0];
        //println(mean_);
        float a1 = (red(img.pixels[p]) + green(img.pixels[p]) + blue(img.pixels[p]) + brightness(img.pixels[p]))/4;
        float a2 = red(img.pixels[p]);
        float a3 = green(img.pixels[p]);
        float a4 = blue(img.pixels[p]);

        float a5 = brightness(img.pixels[p]);
        //println(mean_ - b);

        //img.pixels[p] = color(b);
        //float k = mean_*mean_*mean_*mean_*mean_ -(-mean_ -a1)*(-mean_ +a1)*(-mean_ -a2)*(-mean_ +a2)*(-mean_ -a3)*(-mean_ +a3)*(-mean_ -a4)*(-mean_ +a4)*(-mean_ -a5)*(-mean_ +a5);
        //mean.pixels[p] = color((255)-k);
        //if ((mean_ -b)<20)
        //mean.pixels[p] = color(255-(mean_ -(-mean_ -a1)));
        //mean.pixels[p] = color(255-(mean_*mean_ -(-mean_ -a1)));
        mean_.pixels[p] = color(255-(m - a5));
        mean.pixels[p] = color(255-(m - a5));
        //mean.pixels[p] = color(0);
        //mean.pixels[p] = color(random(255));
        //else mean.pixels[p] = color(255);
      }
    }
    mean.updatePixels();
    imagesWF.add(mean);
    c1.beginDraw();
    c1.image(mean, 0, 0);
    c1.endDraw();
  };
  
  public void mean(PImage img,int a) {
    mean = new PImage(img.width, img.height, RGB);
    mean.loadPixels();
    mean_ = new PImage(img.width, img.height, RGB);
    mean_.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        //float b = brightness(img.pixels[p]);

        float []mn = getNeighboursMean(i, j, a,img);
        float m = mn[0];
        //println(mean_);
        float a1 = (red(img.pixels[p]) + green(img.pixels[p]) + blue(img.pixels[p]) + brightness(img.pixels[p]))/4;
        float a2 = red(img.pixels[p]);
        float a3 = green(img.pixels[p]);
        float a4 = blue(img.pixels[p]);

        float a5 = brightness(img.pixels[p]);
        //println(mean_ - b);

        //img.pixels[p] = color(b);
        //float k = mean_*mean_*mean_*mean_*mean_ -(-mean_ -a1)*(-mean_ +a1)*(-mean_ -a2)*(-mean_ +a2)*(-mean_ -a3)*(-mean_ +a3)*(-mean_ -a4)*(-mean_ +a4)*(-mean_ -a5)*(-mean_ +a5);
        //mean.pixels[p] = color((255)-k);
        //if ((mean_ -b)<20)
        //mean.pixels[p] = color(255-(mean_ -(-mean_ -a1)));
        //mean.pixels[p] = color(255-(mean_*mean_ -(-mean_ -a1)));
        mean_.pixels[p] = color(255-(m - a5));
        mean.pixels[p] = color(255-(m - a5)*25);
        //mean.pixels[p] = color(0);
        //mean.pixels[p] = color(random(255));
        //else mean.pixels[p] = color(255);
      }
    }
    mean.updatePixels();
    imagesWF.add(mean);
    c1.beginDraw();
    c1.image(mean, 0, 0);
    c1.endDraw();
  };
  
  public void mean(float mult,int a) {
    mean = new PImage(img.width, img.height, RGB);
    mean.loadPixels();
    mean_ = new PImage(img.width, img.height, RGB);
    mean_.loadPixels();
    meanGx = new PImage(img.width, img.height, RGB);
    meanGx.loadPixels();
    meanGy = new PImage(img.width, img.height, RGB);
    meanGy.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        //float b = brightness(img.pixels[p]);

        float []mn = getNeighboursMean(i, j, a);
        float m = mn[0];
        float mx = mn[1];
        float my = mn[2];
        //println(mean_);
        float a1 = (red(img.pixels[p]) + green(img.pixels[p]) + blue(img.pixels[p]) + brightness(img.pixels[p]))/4;
        float a2 = red(img.pixels[p]);
        float a3 = green(img.pixels[p]);
        float a4 = blue(img.pixels[p]);

        float a5 = brightness(img.pixels[p]);
        //println(mean_ - b);

        //img.pixels[p] = color(b);
        //float k = m*m*m*m*m*m -(-m -a1)*(-m +a1)*(-m -a2)*(-m +a2)*(-m -a3)*(-m +a3)*(-m -a4)*(-m +a4)*(-m -a5)*(-m +a5);
        //float k = m*m*m*m*m -(-m -a2)*(-m +a2)*(-m -a3)*(-m +a3)*(-m -a4)*(-m +a4)*(-m -a5)*(-m +a5);
        //float k = m*m*m*m -(-m -a2)*(-m +a2)*(-m -a3)*(-m +a3)*(-m -a4)*(-m +a4);
        //float k = m*m*m -(-m -a2)*(-m +a2)*(-m -a3)*(-m +a3);
        //float k = m*m -(-m -a2)*(-m +a2);
        //float k = m*m -(-m -a1)*(-m +a1);
        //float k = m*m -(-m -a5)*(-m +a5);
        
        //mean.pixels[p] = color((255)-k);
        //if ((m -b)<20)
        //mean.pixels[p] = color(255-(m -(-m -a1)));
        //mean.pixels[p] = color(255-(m*m -(-m -a1)));
        //mean.pixels[p] = color(255-(m*mult - a5));
        mean.pixels[p] = color(255-(m - a5)*mult);
        //mean.pixels[p] = color(255-(k));
      }
    }
    mean.updatePixels();
    imagesWF.add(mean);
    c1.beginDraw();
    c1.image(mean, 0, 0);
    c1.endDraw();
  };
  
  public void mean(PImage img,float mult,int a) {
    mean = new PImage(img.width, img.height, RGB);
    mean.loadPixels();
    mean_ = new PImage(img.width, img.height, RGB);
    mean_.loadPixels();
    meanGx = new PImage(img.width, img.height, RGB);
    meanGx.loadPixels();
    meanGy = new PImage(img.width, img.height, RGB);
    meanGy.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        //float b = brightness(img.pixels[p]);

        float []mn = getNeighboursMean(i, j, a,img);
        float m = mn[0];
        float mx = mn[1];
        float my = mn[2];
        //println(mean_);
        float a1 = (red(img.pixels[p]) + green(img.pixels[p]) + blue(img.pixels[p]) + brightness(img.pixels[p]))/4;
        float a2 = red(img.pixels[p]);
        float a3 = green(img.pixels[p]);
        float a4 = blue(img.pixels[p]);

        float a5 = brightness(img.pixels[p]);
        //println(mean_ - b);

        //img.pixels[p] = color(b);
        //float k = mean_*mean_*mean_*mean_*mean_ -(-mean_ -a1)*(-mean_ +a1)*(-mean_ -a2)*(-mean_ +a2)*(-mean_ -a3)*(-mean_ +a3)*(-mean_ -a4)*(-mean_ +a4)*(-mean_ -a5)*(-mean_ +a5);
        //mean.pixels[p] = color((255)-k);
        //if ((mean_ -b)<20)
        //mean.pixels[p] = color(255-(mean_ -(-mean_ -a1)));
        //mean.pixels[p] = color(255-(mean_*mean_ -(-mean_ -a1)));
        mean_.pixels[p] = color(255-(m - a5));
        mean.pixels[p] = color(255-(m - a5)*mult);
        meanGx.pixels[p] = color(mx);
        meanGy.pixels[p] = color(my);
        //mean.pixels[p] = color(0);
        //mean.pixels[p] = color(random(255));
        //else mean.pixels[p] = color(255);
      }
    }
    meanGx.updatePixels();
    meanGy.updatePixels();
    imagesWF.add(mean);
    c1.beginDraw();
    c1.image(mean, 0, 0);
    c1.endDraw();
  };

  public void mean_(int a) {
    mean = new PImage(img.width, img.height, RGB);

    mean.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;

        float []mean_ = getNeighboursMean(i, j, a);
        float m = mean_[0];
        //println(mean_);
        //float b = brightness(img.pixels[p]);
        //println(mean_ - b);

        //img.pixels[p] = color(b);
        //if ((mean_ -b)<20)
        float k = m-((m)/(b)*(m)/(b)) *((m)*(b)/(m));
        //k = m*m - (m-b)*(m-b);
        //println(k);
        //k = m - b;
        float t1 = (k);
        //k = (m*m -t1*t1);
        float t = 2.0f;
        //k = 2.0 / (1.0 + exp(-2.0 * k)) - 1.0;
        k = t/ (1.0f + exp(-t * (k))) - 1.0f;

        mean.pixels[p] = color(k*255);
        //mean

        //mean.pixels[p] = color(b);
        //else mean.pixels[p] = color(255);
      }
    }
    mean.updatePixels();
    c1.beginDraw();
    c1.image(mean, 0, 0);
    c1.endDraw();
  };


  public void meanR(int a) {
    mean = new PImage(img.width, img.height, RGB);
    img.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);
        img.pixels[p] = color(b);
      }
    }
  };

  public void meanG(int a) {
    mean = new PImage(img.width, img.height, RGB);
    img.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);
        img.pixels[p] = color(b);
      }
    }
  };

  public void meanB(int a) {
    mean = new PImage(img.width, img.height, RGB);
    img.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);
        img.pixels[p] = color(b);
      }
    }
  };

  public void meanRGB() {
    mean = new PImage(img.width, img.height, RGB);
    float mean_ = 0;
    img.loadPixels();
    for (int i=0; i<img.pixels.length; i++) {
      float b = brightness(img.pixels[i]);
      mean_ += b;
    }

    mean_ /= img.pixels.length;
    mean_ = 150 +mean_;

    mean.loadPixels();
    for (int i=0; i<img.pixels.length; i++) {
      float r = red(img.pixels[i]);
      float g = green(img.pixels[i]);
      float b = blue(img.pixels[i]);
      float br = brightness(img.pixels[i]);
      float a = mean_ - (r+g+b+br)/4;
      mean.pixels[i] = color(255-a);
    }

    mean.updatePixels();
    imagesWF.add(mean);
  };

  public void localMean() {
    mean = new PImage(img.width, img.height, RGB);
    img.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);
      }
    }
  };

  public void kMeans() {
    kMeans = new PImage(img.width, img.height, RGB);
    img.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        //float b = map(brightness(img.pixels[p]),0,255,0,100);
        float b = brightness(img.pixels[p]);
        img.pixels[p] = color(b);
      }
    }
  };

  public void kNearest(float a) {
    variance = new PImage(img.width, img.height, RGB);
    img.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);

        img.pixels[p] = color(b);
      }
    }
  };

  public void variance() {
    variance = new PImage(img.width, img.height, RGB);
    img.loadPixels();
    variance.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float var = getNeighboursVar(i,j,1);
        float a1 = red(img.pixels[p]);
        float a2 = green(img.pixels[p]);
        float a3 = blue(img.pixels[p]);
        float a4 = brightness(img.pixels[p]);
        //println(var);
        variance.pixels[p] = color(255-var);
      }
    }
    variance.updatePixels();
    imagesWF.add(variance);
    c1.beginDraw();
    c1.image(variance, 0, 0);
    c1.endDraw();
  };

  public void variance(int a) {
    variance = new PImage(img.width, img.height, RGB);
    img.loadPixels();
    variance.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float var = getNeighboursVar(i, j, a);
        //float a1 = (red(img.pixels[p]) + green(img.pixels[p]) + blue(img.pixels[p]) + brightness(img.pixels[p]))/4;
        float a1 = (red(mean.pixels[p]) + green(mean.pixels[p]) + blue(mean.pixels[p]) + brightness(mean.pixels[p]))/4;
        float a2 = red(mean.pixels[p]);
        float a3 = green(mean.pixels[p]);
        float a4 = blue(mean.pixels[p]);
        float a5 = brightness(mean.pixels[p]);


        float k = var*4;
        //float r = sqrt((var + ( var - a1)) * a1 + (var + ( var - a2)) * a2 + (var + ( var - a3)) * a3 + (var + ( var - a4)) * a4);
        //float r = var*var*var - (var + a1)*(var - a1)*(var + a2)*(var - a2)*(var + a3)*(var - a3)*(var + a4)*(var - a4)*(var + a5)*(var - a5);
        float r = var*var*var*var*var*var*var*var*var - (var + a1)*(var - a1)*(var + a2)*(var - a2)*(var + a3)*(var - a3)*(var + a4)*(var - a4)*(var + a5)*(var - a5);
        //float r = var*var*var*var*var*var*var*var*var - (-var + a1)*(-var - a1)*(-var + a2)*(-var - a2)*(-var + a3)*(-var - a3)*(-var + a4)*(-var - a4)*(-var + a5)*(-var - a5);
        //println(k);
        //float r = ((var-brightness(mean.pixels[p]))*20);
        //float r = var;
        //r = (var*var-(var - a5)*(var + a5));
        //r = var+a1;
        //println(r);
        //println(var,r);
        variance.pixels[p] = color(var);
      }
    }
    variance.updatePixels();
    imagesWF.add(variance);
    c1.beginDraw();
    c1.image(variance, 0, 0);
    c1.endDraw();
  };
  
  public void variance3(int a) {
    variance = new PImage(img.width, img.height, RGB);
    img.loadPixels();
    variance.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float var = getNeighboursVar3(i, j, a);
        //float a1 = (red(img.pixels[p]) + green(img.pixels[p]) + blue(img.pixels[p]) + brightness(img.pixels[p]))/4;
        float a1 = (red(mean.pixels[p]) + green(mean.pixels[p]) + blue(mean.pixels[p]) + brightness(mean.pixels[p]))/4;
        float a2 = red(mean.pixels[p]);
        float a3 = green(mean.pixels[p]);
        float a4 = blue(mean.pixels[p]);
        float a5 = brightness(mean.pixels[p]);
        
        float r = var;
        //println(var);
        //r = (var*var-(var - a5)*(var + a5));
        variance.pixels[p] = color(r);
      }
    }
    variance.updatePixels();
    imagesWF.add(variance);
    c1.beginDraw();
    c1.image(variance, 0, 0);
    c1.endDraw();
  };
  
  public void variance(PImage imgg,int a) {
    variance = new PImage(img.width, img.height, RGB);
    img.loadPixels();
    variance.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float var = getNeighboursVar(i, j, a,imgg);
        float a7 = (red(imgg.pixels[p]) + green(imgg.pixels[p]) + blue(imgg.pixels[p]) + brightness(imgg.pixels[p]))/4;
        float r = sqrt(var + (a7));
        variance.pixels[p] = color((r));
      }
    }
    variance.updatePixels();
    imagesWF.add(variance);
    c1.beginDraw();
    c1.image(variance, 0, 0);
    c1.endDraw();
  };

  public void variance(int a, int n) {
    variance = new PImage(img.width, img.height, RGB);
    img.loadPixels();
    //variance.loadPixels();
    Variance = 0;
    for (int i=0; i<img.pixels.length; i++) {
      float a1 = (red(img2.pixels[i]) + green(img2.pixels[i]) + blue(img2.pixels[i]) + brightness(img2.pixels[i]))/4;
      float a2 = (red(mean.pixels[i]) + green(mean.pixels[i]) + blue(mean.pixels[i]) + brightness(mean.pixels[i]))/4;
      //float a2 = (red(threshold.pixels[i]) + green(threshold.pixels[i]) + blue(threshold.pixels[i]) + brightness(threshold.pixels[i]))/4;
      //a2 = brightness(mean.pixels[i]);
      //println("mean " + i + " " + a2);
      Variance += (a2 - a1)*(a2 - a1);
      //float a1 = red(img.pixels[p]);
      //float a2 = green(img.pixels[p]);
      //float a3 = blue(img.pixels[p]);
      //float a4 = brightness(img.pixels[p]);

      //float k = var*4;
      //float r = (var + ( var - a1)) * a1 + (var + ( var - a2)) * a2 + (var + ( var - a3)) * a3 + (var + ( var - a4)) * a4;
      ////println(k);
      ////println(var,r);
      //variance.pixels[p] = color(255-(k-r));
    }
    //variance.updatePixels();
    Variance /= img.pixels.length;
    Variance = sqrt(Variance);
    //var = abs(var);
    println("Variance " + Variance);
    variance.loadPixels();
    img.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float m = brightness(mean.pixels[p]);
        //float a1 = red(img.pixels[p]);
        float a1 = (red(img.pixels[p]) + green(img.pixels[p]) + blue(img.pixels[p]) + brightness(img.pixels[p]))/4;
        //float a1 = (red(mean.pixels[p]) + green(mean.pixels[p]) + blue(mean.pixels[p]) + brightness(mean.pixels[p]))/4;
        float a2 = red(img.pixels[p]);
        float a3 = green(img.pixels[p]);
        float a4 = blue(img.pixels[p]);
        float a5 = brightness(img.pixels[p]);

        float k = Variance*4;
        float r = Variance;
        //float r = Variance*Variance - (Variance - a1)*(Variance + a2);
        //float b = Variance*Variance*Variance*Variance -((((Variance+a1)) + (Variance - a2))*(((Variance)) + (Variance + a3))*(((Variance)) + (Variance + a4))*((Variance) + (Variance + a1)))-255;
        //println(r);
        ////println(Variance,r);
        variance.pixels[p] = color(r);
      }
    }
    variance.updatePixels();
    imagesWF.add(variance);
    c1.beginDraw();
    c1.image(variance, 0, 0);
    c1.endDraw();
  };

  public void variance2(int a) {
    variance = new PImage(img.width, img.height, RGB);
    variance.loadPixels();
    varianceR = new PImage(img.width, img.height, RGB);
    varianceR.loadPixels();
    varianceG = new PImage(img.width, img.height, RGB);
    varianceG.loadPixels();
    varianceB = new PImage(img.width, img.height, RGB);
    varianceB.loadPixels();
    img.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float []v = getNeighboursVar2(i, j, a);
        float a1 = (red(img2.pixels[p]) + green(img2.pixels[p]) + blue(img2.pixels[p]) + brightness(img2.pixels[p]))/4;
        //float a1 = (red(mean.pixels[p]) + green(mean.pixels[p]) + blue(mean.pixels[p]) + brightness(mean.pixels[p]))/4;
        float a2 = red(img2.pixels[p]);
        float a3 = green(img2.pixels[p]);
        float a4 = blue(img2.pixels[p]);
        float a5 = brightness(img2.pixels[p]);
        
        float var = v[0];

        float k = var*4;
        float r = (var + ( var - a1)) * a1 + (var + ( var - a2)) * a2 + (var + ( var - a3)) * a3 + (var + ( var - a4)) * a4;
        //float r = var*var*var*var*var*var*var*var - (var + a2)*(var - a2)*(var + a3)*(var - a3)*(var + a4)*(var - a4)*(var + a5)*(var - a5);
        //float r = var*var*var*var*var*var*var*var*var - (var + a1)*(var - a1)*(var + a2)*(var - a2)*(var + a3)*(var - a3)*(var + a4)*(var - a4)*(var + a5)*(var - a5);
        //float r = var*var*var*var*var*var*var*var*var - (-var + a1)*(-var - a1)*(-var + a2)*(-var - a2)*(-var + a3)*(-var - a3)*(-var + a4)*(-var - a4)*(-var + a5)*(-var - a5);
        //println(k);
        //println(var,r);
        variance.pixels[p] = color((r));
      }
    }
    variance.updatePixels();
    imagesWF.add(variance);
    c1.beginDraw();
    c1.image(variance, 0, 0);
    c1.endDraw();
  };

  public void kNearest() {
    variance = new PImage(img.width, img.height, RGB);
    img.loadPixels();

    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);

        img.pixels[p] = color(b);
      }
    }
  };
  
  public void combine(PImage a,PImage b){
    combined = new PImage(img.width, img.height, RGB);
    combined.loadPixels();
    for (int i=0; i<img.pixels.length; i++) {
      
      float b1 = brightness(a.pixels[i]);
      float b2 = brightness(b.pixels[i]);
      
      if(b1<b2)combined.pixels[i] = color(b1);
      else combined.pixels[i] = color(b2);
      
    }
    combined.updatePixels();
    imagesWF.add(combined);
  };

  public void blur(int a) {
    blur = new PImage(img.width, img.height, RGB);
    //sobelG = new PImage(img.width, img.height, RGB);
    blur.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float mean = getNeighboursBlur(i, j, a);
        float b = brightness(img.pixels[p]);
        blur.pixels[p] = color(mean);
        
      }
    }
    blur.updatePixels();
    imagesWF.add(blur);
    c1.beginDraw();
    c1.image(blur, 0, 0);
    c1.endDraw();
  };
  
  public void blur(PImage img,int a) {
    blur = new PImage(img.width, img.height, RGB);
    //sobelG = new PImage(img.width, img.height, RGB);
    blur.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float mean = getNeighboursBlur(i, j, a,img);
        float b = brightness(img.pixels[p]);
        //blur.pixels[p] = color(255-(mean*(mult2)-b)+offset);
        blur.pixels[p] = color(mean);
        //sobelG.pixels[p] = color((gradient[i][j]*100));
        //println(gradient[i][j],green(sobelG.pixels[p]));
      }
    }
    blur.updatePixels();
    imagesWF.add(blur);
    c1.beginDraw();
    c1.image(blur, 0, 0);
    c1.endDraw();
  };
  
  public void blurS(int a) {
    blur = new PImage(img.width, img.height, RGB);
    blurX = new PImage(img.width, img.height, RGB);
    blurY = new PImage(img.width, img.height, RGB);
    blur.loadPixels();
    blurX.loadPixels();
    blurY.loadPixels();
    //gradientB = new PImage(img.width, img.height, RGB);
    //gradientB.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);
        float bx = getNeighboursBlurX(i, j, a);
        float by = getNeighboursBlurY(i, j, a);
        blur.pixels[p] = color(((bx+by)/2));
      }
    }
    blur.updatePixels();
    blurX.updatePixels();
    blurY.updatePixels();
    imagesWF.add(blur);
    c1.beginDraw();
    c1.image(blur, 0, 0);
    c1.endDraw();
  };
  
  public void blurS(PImage img,int a) {
    blur = new PImage(img.width, img.height, RGB);
    blurX = new PImage(img.width, img.height, RGB);
    blurY = new PImage(img.width, img.height, RGB);
    blur.loadPixels();
    blurX.loadPixels();
    blurY.loadPixels();
    //gradientB = new PImage(img.width, img.height, RGB);
    //gradientB.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);
        float bx = getNeighboursBlurX(i, j, a,img);
        float by = getNeighboursBlurY(i, j, a,img);
        blur.pixels[p] = color(((bx+by)/2));
      }
    }
    blur.updatePixels();
    blurX.updatePixels();
    blurY.updatePixels();
    imagesWF.add(blur);
    c1.beginDraw();
    c1.image(blur, 0, 0);
    c1.endDraw();
  };
  
  public void gaussianS(){
    Gaussian = new PImage(img.width,img.height,ARGB);
    //Gaussian.loadPixels();
    GaussianS.set("blurSize", 9);
    GaussianS.set("sigma", 5.0f); 
    
    GaussianS.set("horizontalPass", 0);
    pass1.beginDraw();            
    pass1.shader(GaussianS);  
    pass1.image(img, 0, 0);
    pass1.endDraw();
    
    //// Applying the blur shader along the horizontal direction      
    GaussianS.set("horizontalPass", 1);
    pass2.beginDraw();            
    pass2.shader(GaussianS);  
    pass2.image(pass1, 0, 0);
    pass2.endDraw(); 
    c1.beginDraw();
    c1.image(pass2, 0, 0);
    c1.endDraw();
    //c1.updatePixels();
    Gaussian = c1.get();
    //Gaussian.updatePixels();
    imagesWF.add(Gaussian);
  };
  
  public void gaussianS2(float a,int b){
    Gaussian = new PImage(img.width,img.height,ARGB);
    //Gaussian.loadPixels();
    println("gaussian 2");
    GaussianS.set("blurSize", 9);
    GaussianS.set("sigma", 5.0f); 
    
    GaussianS.set("horizontalPass", 0);
    pass1.beginDraw();            
    pass1.shader(GaussianS);  
    pass1.image(img, 0, 0);
    pass1.endDraw();
    
    //// Applying the blur shader along the horizontal direction      
    GaussianS.set("horizontalPass", 1);
    pass2.beginDraw();            
    pass2.shader(GaussianS);  
    pass2.image(pass1, 0, 0);
    pass2.endDraw(); 
    c1.beginDraw();
    c1.image(pass2, 0, 0);
    c1.endDraw();
    Gaussian = c1.get();
    
    imagesWF.add(Gaussian);
  };
  
  public void gaussianS(float a,int b){
    println("gaussian");
    Gaussian = new PImage(img.width,img.height,ARGB);
    Gaussian.loadPixels();
    GaussianS.set("blurSize", b);
    GaussianS.set("sigma", a); 
    
    GaussianS.set("horizontalPass", 0);
    pass1.beginDraw();            
    pass1.shader(GaussianS);  
    pass1.image(img, 0, 0);
    pass1.endDraw();
    
    //// Applying the blur shader along the horizontal direction      
    GaussianS.set("horizontalPass", 1);
    pass2.beginDraw();            
    pass2.shader(GaussianS);  
    pass2.image(pass1, 0, 0);
    pass2.endDraw(); 
    c1.beginDraw();
    c1.image(pass2, 0, 0);
    c1.endDraw();
    Gaussian = c1.get();
    Gaussian.updatePixels();
    imagesWF.add(Gaussian);
  };
  
  public void gaussian3(){
    Gaussian = new PImage(img.width,img.height,ARGB);
    Gaussian.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);
        float v = getGaussian3(i, j);
        //println(v);
        Gaussian.pixels[p] = color(v);
      }
    }
    Gaussian.updatePixels();
    imagesWF.add(Gaussian);
    c1.beginDraw();
    c1.image(Gaussian, 0, 0);
    c1.endDraw();
  };
  
  public float getGaussian3(int x,int y){
    float val = 0;
    float v = 0;
    int z = 1;
    img.loadPixels();
    
    int count = 0;
    
    int p1 = x + y * img.width;
    float b1 = (red(img.pixels[p1])+green(img.pixels[p1])+blue(img.pixels[p1])+brightness(img.pixels[p1]))/4;
    
    for (int i=x-z; i<=x+z; i++) {
      for (int j=y-z; j<=y+z; j++) {

        int p = i + j * img.width;
        if (p>0&&p<img.pixels.length) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
          
          int x1 = 0 + i - x + 1;
          int y1 = 0 + j - y + 1;
          
          float col = brightness(img.pixels[p]);
          col = b;
          
          v += gaussian3[x1][y1] * col;
          //println(gaussian3[x1][y1]);
          }
          count ++;
        }
      }
    
    v/= 2;
    v/= count;
    
    return v;
  };
  
  public void gaussian3(PImage img){
    Gaussian = new PImage(img.width,img.height,ARGB);
    Gaussian.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);
        float v = getGaussian3(i, j,img);
        Gaussian.pixels[p] = color(v);
      }
    }
    Gaussian.updatePixels();
    imagesWF.add(Gaussian);
    c1.beginDraw();
    c1.image(Gaussian, 0, 0);
    c1.endDraw();
  };
  
  public float getGaussian3(int x,int y, PImage img){
    float val = 0;
    float v = 0;
    int z = 1;
    img.loadPixels();
    
    int count = 0;
    
    int p1 = x + y * img.width;
    float b1 = (red(img.pixels[p1])+green(img.pixels[p1])+blue(img.pixels[p1])+brightness(img.pixels[p1]))/4;
    
    for (int i=x-z; i<=x+z; i++) {
      for (int j=y-z; j<=y+z; j++) {

        int p = i + j * img.width;
        if (p>0&&p<img.pixels.length) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
          
          int x1 = 0 + i - x + 1;
          int y1 = 0 + j - y + 1;
          
          float col = brightness(img.pixels[p]);
          col = b;
          
          v += gaussian3[x1][y1] * col;
          }
          count ++;
        }
      }
    v/= 16;
    v/= count;
    return v;
  };
  
  public void gaussian5(){
    Gaussian = new PImage(img.width,img.height,ARGB);
    Gaussian.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);
        float v = getGaussian5(i, j);
        Gaussian.pixels[p] = color(v);
      }
    }
    Gaussian.updatePixels();
    imagesWF.add(Gaussian);
    c1.beginDraw();
    c1.image(Gaussian, 0, 0);
    c1.endDraw();
  };
  
  public float getGaussian5(int x,int y){
    float val = 0;
    float v = 0;
    int z = 2;
    img.loadPixels();
    
    int count = 0;
    
    int p1 = x + y * img.width;
    float b1 = (red(img.pixels[p1])+green(img.pixels[p1])+blue(img.pixels[p1])+brightness(img.pixels[p1]))/4;
    
    for (int i=x-z; i<=x+z; i++) {
      for (int j=y-z; j<=y+z; j++) {

        int p = i + j * img.width;
        if (p>0&&p<img.pixels.length) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
          
          int x1 = 0 + (i - x) + z;
          int y1 = 0 + j - y + z;
          //println(x1);
          //if(x1 == -1)x1 = 4;
          //if(y1 == -1)y1 = 4;
          float col = brightness(img.pixels[p]);
          col = b;
          
          v += gaussian5[x1][y1] * col;
          }
          count ++;
        }
      }
    v/= 273;
    v/= count;
    return v;
  };
  
  public void gaussian5(PImage img){
    Gaussian = new PImage(img.width,img.height,ARGB);
    Gaussian.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float b = brightness(img.pixels[p]);
        float v = getGaussian5(i, j,img);
        Gaussian.pixels[p] = color(v);
      }
    }
    Gaussian.updatePixels();
    imagesWF.add(Gaussian);
    c1.beginDraw();
    c1.image(Gaussian, 0, 0);
    c1.endDraw();
  };
  
  public float getGaussian5(int x,int y, PImage img){
    float val = 0;
    float v = 0;
    int z = 2;
    img.loadPixels();
    
    int count = 0;
    
    int p1 = x + y * img.width;
    float b1 = (red(img.pixels[p1])+green(img.pixels[p1])+blue(img.pixels[p1])+brightness(img.pixels[p1]))/4;
    
    for (int i=x-z; i<=x+z; i++) {
      for (int j=y-z; j<=y+z; j++) {

        int p = i + j * img.width;
        if (p>0&&p<img.pixels.length) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
          
          int x1 = 0 + i - x + z;
          int y1 = 0 + j - y + z;
          
          float col = brightness(img.pixels[p]);
          col = b;
          
          v += gaussian5[x1][y1] * col;
          }
          count ++;
        }
      }
    v/= 273;
    v/= count;
    return v;
  };
  
  public float getNeighboursBlur(int x, int y,int a){
    float mean = 0;
    int count = 0;
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
        int p = i + j * img.width;
        if (p<img.pixels.length&&p>0) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
          mean += brightness(img.pixels[p]);
          count++;
      }}
    }
    mean /= count;
    return mean;
  };
  
  public float getNeighboursBlur(int x, int y,int a,PImage img){
    float mean = 0;
    int count = 0;
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
        int p = i + j * img.width;
        if (p<img.pixels.length&&p>0) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
          mean += brightness(img.pixels[p]);
          count++;
      }}
    }
    mean /= count;
    return mean;
  };

  public float getNeighboursBlurX(int x, int y,int a){
    float mean = 0;
    int count = 0;
    int count2 = 0;
    for (int i=x-a; i<=x+a; i++) {
        int p = (i) + y * img.width;
        count2++;
        int n = (y-a+count);
        float k = (a-abs(n-y));
        k = 2.0f / (1.0f + exp(-2.0f * k)) - 1.0f;
        //println(k);
        //k = 1;
        int p1 = (i) + (n) * img.width;
        if (p<img.pixels.length&&p>0&&p1>0&&p1<img.pixels.length) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
           mean += (brightness(img.pixels[p])+brightness(img.pixels[p1])*k)/2;
           count++;
      }
    }
    int p = x + y * img.width;
    blurX.pixels[p] = color(mean);
    return mean/count;
  };
  
  public float getNeighboursBlurX(int x, int y,int a,PImage img){
    float mean = 0;
    int count = 0;
    int count2 = 0;
    for (int i=x-a; i<=x+a; i++) {
        int p = (i) + y * img.width;
        count2++;
        int n = (y-a+count);
        float k = (a-abs(n-y));
        k = 2.0f / (1.0f + exp(-2.0f * k)) - 1.0f;
        //println(k);
        //k = 1;
        int p1 = (i) + (n) * img.width;
        if (p<img.pixels.length&&p>0&&p1>0&&p1<img.pixels.length) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
           mean += (brightness(img.pixels[p])+brightness(img.pixels[p1])*k)/(2);
           count++;
      }
    }
    int p = x + y * img.width;
    blurX.pixels[p] = color(mean);
    return mean/count;
  };
  
  public float getNeighboursBlurY(int x, int y,int a){
    float mean = 0;
    int count = 0;
    int count2 = 0;
    //print("h");
      for (int j=y-a; j<=y+a; j++) {
        int p = x + (j) * img.width;
        int n = (x-a+count);
        float k = (a-abs(n-x));
        k = 2.0f / (1.0f + exp(-2.0f * k)) - 1.0f;
        //k = 1;
        int p1 = (n) + (j) * img.width;
        
        if (p<img.pixels.length&&p>0&&p1>0&&p1<img.pixels.length) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
           mean += (brightness(img.pixels[p])+ brightness(img.pixels[p1])*k)/2;
           count++;
      }
    }
    int p = x + y * img.width;
    blurX.pixels[p] = color(mean);
    return mean/count;
    //return sqrt(mean*mean);
  };
  
  public float getNeighboursBlurY(int x, int y,int a,PImage img){
    float mean = 0;
    int count = 0;
    int count2 = 0;
    //print("h");
      for (int j=y-a; j<=y+a; j++) {
        int p = x + (j) * img.width;
        int n = (x-a+count);
        float k = (a-abs(n-x));
        k = 2.0f / (1.0f + exp(-2.0f * k)) - 1.0f;
        //k = 1;
        int p1 = (n) + (j) * img.width;
        
        if (p<img.pixels.length&&p>0&&p1>0&&p1<img.pixels.length) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
           mean += (brightness(img.pixels[p])+brightness(img.pixels[p1])*k)/2;
           count++;
      }
    }
    int p = x + y * img.width;
    blurX.pixels[p] = color(mean);
    return mean/count;
    //return sqrt(mean*mean);
  };

  public void getNeighboursAv(int x, int y) {
    for (int i=x-1; i<=x+1; i++) {
      for (int j=y-1; j<=y+1; j++) {
      }
    }
  };

  public float[] getNeighboursMean(int x, int y, int a) {
    float mean = 0;
    int count = 0;
    int count2 = 0;
    float mx = 0;
    float my = 0;
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
        int p = i + j * img.width;
        if (p<img.pixels.length&&p>0) {
          mean += brightness(img.pixels[p]);
          count++;
          if (brightness(img.pixels[p])>10)count2++;
          
          int x1 = 0 + i - x + 1;
          int y1 = 0 + j - y + 1;
          if(x1>=0&&x1<3&&y1>=0&&y1<3){
            mx += meanX[x1][y1];
            my += meanY[x1][y1];
          }
        }
      }
    }
    mean /= count;
    mx /= count;
    my /= count;
    float []val = {mean,mx,my};
    return val;
  };
  
  public float []getNeighboursMean(int x, int y, int a,PImage img) {
    float mean = 0;
    int count = 0;
    int count2 = 0;
    float mx = 0;
    float my = 0;
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
        int p = i + j * img.width;
        if (p<img.pixels.length&&p>0) {
          mean += brightness(img.pixels[p]);
          count++;
          int x1 = 0 + i - x + 1;
          int y1 = 0 + j - y + 1;
          //println(x1);
          
          if(x1>=0&&x1<3&&y1>=0&&y1<3){
            mx += meanX[x1][y1] * brightness(img.pixels[p]);
            my += meanY[x1][y1] * brightness(img.pixels[p]);
            //println(
            //count++;
          }
        }
      }
    }
    
    mean /= count;
    mx /= count;
    my /= count;
    //println(mx,my,count2);
    float []val = {mean,mx,my};
    return val;
  };

  public float getNeighboursMean_(int x, int y, int a) {
    float mean = 0;
    int count = 0;
    int count2 = 0;
    int p1 = x + y * img.width;
    float b1 = (red(img.pixels[p1])+green(img.pixels[p1])+blue(img.pixels[p1])+brightness(img.pixels[p1]))/4;
    float k = 40;
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
        int p = i + j * img.width;
        if (p<img.pixels.length&&p>0) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
          if (abs(b1-b)<k
            //if(abs(red(img.pixels[p1])-red(img.pixels[p]))<k
            //  ||abs(green(img.pixels[p1])-red(img.pixels[p]))>k
            //  ||abs(blue(img.pixels[p1])-red(img.pixels[p]))<k
            ) {
            //if(true){
            mean += brightness(img.pixels[p]);
            //mean += b;
            count2++;
          } else mean += 15;
          //else mean -=20;
          count++;
        }
      }
    }
    //if (count2<(a*2*a*2)/(a*4)) mean = 1;
    if (mean<k*(a*2*a*2)) mean = 0;
    //if(count2>8) mean = 0;
    return mean/count;
  };

  public float getNeighboursVar(int x, int y, int a) {
    float variance = 0;
    int count = 0;
    int count2 = 0;
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
        int p = i + j * img.width;
        if (p<img.pixels.length&&p>0) {
          
          float a1 = (red(mean.pixels[p]) + green(mean.pixels[p]) + blue(mean.pixels[p]) + brightness(mean.pixels[p]))/4;
          float a2 = (red(img2.pixels[p]) + green(img2.pixels[p]) + blue(img2.pixels[p]) + brightness(img2.pixels[p]))/4;
          variance += (a2-a1)*(a2-a1);
          //println(a2);
          //variance += (a2-a1);

          count++;
        }
      }
    }
    //variance/=count;
    //println(sqrt(variance*variance));
    
    return sqrt((variance)/count);
    //return sqrt((variance*variance)/count);
  };
  
  public float getNeighboursVar3(int x, int y, int a) {
    float variance = 0;
    int count = 0;
    int count2 = 0;
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
        int p = i + j * img.width;
        if (p<img.pixels.length&&p>0) {
          float a1 = 0;
          if(threshold==null){
            a1 = (red(mean.pixels[p]) + green(mean.pixels[p]) + blue(mean.pixels[p]) + brightness(mean.pixels[p]))/4;
            a1 = brightness(mean.pixels[p]);
          }else a1 = (red(threshold.pixels[p]) + green(threshold.pixels[p]) + blue(threshold.pixels[p]) + brightness(threshold.pixels[p]))/4;
          float a2 = (red(img2.pixels[p]) + green(img2.pixels[p]) + blue(img2.pixels[p]) + brightness(img2.pixels[p]))/4;
          //variance += brightness(threshold.pixels[p]) - brightness(img.pixels[p]);
          variance += (a2-a1)*(a2-a1);
          //variance += (a2-a1);

          count++;
        }
      }
    }
    //variance/=count;
    return sqrt((variance)/count);
    //return (random(255));
  };

  public float getNeighboursVar(int x, int y, int a,PImage mean) {
    float variance = 0;
    int count = 0;
    int count2 = 0;
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
        int p = i + j * img.width;
        if (p<img.pixels.length&&p>0) {
          float a1 = 0;
            a1 = (red(mean.pixels[p]) + green(mean.pixels[p]) + blue(mean.pixels[p]) + brightness(mean.pixels[p]))/4;
            a1 = brightness(mean.pixels[p]);
          float a2 = (red(img.pixels[p]) + green(img.pixels[p]) + blue(img.pixels[p]) + brightness(img.pixels[p]))/4;
          //variance += brightness(threshold.pixels[p]) - brightness(img.pixels[p]);
          variance += a2-a1;

          count++;
        }
      }
    }
    return sqrt((variance*variance)/count);
  };
  
  public float []getNeighboursVar2(int x, int y, int a) {
    float variance = 0;
    float varianceR = 0;
    float varianceG = 0;
    float varianceB = 0;
    int count = 0;
    int count2 = 0;
    float a1r = 0,a1g = 0,a1b = 0,a1br = 0;
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
        int p = i + j * img.width;
        if (p<img.pixels.length&&p>0) {
          
          
          float a2r = red(img2.pixels[p]);
          float a2g = green(img2.pixels[p]);
          float a2b = blue(img2.pixels[p]);
          float a2br = red(img2.pixels[p]);
          
          varianceR += a1r-a2r;
          varianceG += a1g-a2g;
          varianceB += a1b-a2b;
          
          variance += a1br-a2br;

          count++;
        }
      }
    }
    variance /= count;
    varianceR /= count;
    varianceG /= count;
    varianceB /= count;
    
    //float []val = {sqrt(variance*variance),varianceR,varianceG,varianceB};
    float []val = {abs(variance),varianceR,varianceG,varianceB};
    return val;
  };

  public void getNeighbours2Min(int x, int y, int a, int b) {
    for (int i=x-a; i<=x+b; i++) {
      for (int j=y-a; j<=y+b; j++) {
      }
    }
  };

  public void getNeighbours2Min(int x, int y, int a) {
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
      }
    }
  };
  
  public void sobelGS(float a,int b,float c){
    
    if(sobel==null)sobel = new PImage(img.width, img.height, RGB);
    
    if(update){
      Gaussian = new PImage(img.width,img.height,ARGB);
      //Gaussian.loadPixels();
      GaussianS.set("blurSize", b);
      GaussianS.set("sigma", a); 
      
      GaussianS.set("horizontalPass", 0);
      pass1.beginDraw();            
      pass1.shader(GaussianS);  
      pass1.image(img, 0, 0);
      pass1.endDraw();
      
      //// Applying the blur shader along the horizontal direction      
      GaussianS.set("horizontalPass", 1);
      pass2.beginDraw();            
      pass2.shader(GaussianS);  
      pass2.image(pass1, 0, 0);
      pass2.endDraw(); 
      c1.beginDraw();
      c1.image(pass2, 0, 0);
      c1.endDraw();
      
      c1.beginDraw();
      Sobel.set("mult",c);
      //c1.shader(GaussianS);
      c1.shader(Sobel);
      c1.image(pass2, 0, 0);
      sobel.pixels = c1.pixels;
      c1.endDraw();
      update=false;
      //println(red(img.pixels[1000]),red(sobel.pixels[1000]));
      sobel = c1.get();
      imagesWF.add(sobel);
    }
    
    
  };
  
  public void sobelS2(float mult){
    
    if(sobel==null)sobel = new PImage(img.width, img.height, RGB);
    
    if(update){
      
      c1.beginDraw();
      println("mult",mult);
      SobelG.set("mult",mult);
      c1.shader(SobelG);
      c1.image(img, 0, 0);
      c1.endDraw();
      update=false;
      sobel = c1.get();
      imagesWF.add(sobel);
      
    }
  };
  
  public void sobelS3(float mult){
    
    if(sobel==null)sobel = new PImage(img.width, img.height, RGB);
    
    if(update){
      
      c1.beginDraw();
      println("mult",mult);
      println("Shader sobelG1");
      SobelG1.set("mult",mult);
      c1.shader(SobelG1);
      c1.image(img, 0, 0);
      c1.endDraw();
      update=false;
      sobel = c1.get();
      imagesWF.add(sobel);
      
    }
  };
  
  public void sobelS(int a){
    
    if(sobel==null)sobel = new PImage(img.width, img.height, RGB);
    ////sobel.loadPixels();
    //sobelx = new PImage(img.width, img.height, RGB);
    //sobelx.loadPixels();
    //sobely = new PImage(img.width, img.height, RGB);
    //sobely.loadPixels();
    
    if(update){
      
      c1.beginDraw();
      //println(s_mult);
      //Sobel.set("mult",mult);
      c1.shader(Sobel);
      c1.image(img, 0, 0);
      //sobel.pixels = c1.pixels;
      c1.endDraw();
      update=false;
      imagesWF.add(sobel);
      //println(red(img.pixels[1000]),red(sobel.pixels[1000]));
      //sobel = c1.get();
    }
    
    ////sobel.updatePixels();
    //sobelx.updatePixels();
    //sobely.updatePixels();
  };
  
  public void sobelS(float mult){
    sobel = new PImage(img.width, img.height, RGB);
    
    if(update){
      
      c1.beginDraw();
      Sobel.set("mult",mult);
      c1.shader(Sobel);
      c1.image(img, 0, 0);
      sobel.pixels = c1.pixels;
      c1.endDraw();
      update=false;
    }
    sobel = c1.get();
    imagesWF.add(sobel);
    
  };
  
  public void sobelS(float mult,int a){
    sobel = new PImage(img.width, img.height, RGB);
    
    if(update){
      
      c1.beginDraw();
      Sobel1.set("mult",mult);
      Sobel1.set("type",(float)a);
      //println((float)a);
      c1.shader(Sobel1);
      c1.image(img, 0, 0);
      sobel.pixels = c1.pixels;
      c1.endDraw();
      update=false;
      //println(red(img.pixels[1000]),red(sobel.pixels[1000]));
      
    }
    sobel = c1.get();
    imagesWF.add(sobel);
    
  };
  
  public void sobelS(float mult,int a,float max){
    sobel = new PImage(img.width, img.height, RGB);
    
    if(update){
      
      c1.beginDraw();
      Sobel2.set("mult",mult);
      Sobel2.set("type",(float)a);
      Sobel2.set("max",max);
      //println((float)a);
      c1.shader(Sobel1);
      c1.image(img, 0, 0);
      sobel.pixels = c1.pixels;
      c1.endDraw();
      update=false;
      //println(red(img.pixels[1000]),red(sobel.pixels[1000]));
      
    }
    sobel = c1.get();
    imagesWF.add(sobel);
    
  };
  
  public void sobelS(PImage img, float mult,int a){
    Sobel = loadShader("shaders\\sobel.glsl");
    sobel = new PImage(img.width, img.height, RGB);
    sobel.loadPixels();
    sobelx = new PImage(img.width, img.height, RGB);
    sobelx.loadPixels();
    sobely = new PImage(img.width, img.height, RGB);
    sobely.loadPixels();
    
    if(update){
      c1.beginDraw();
      c1.shader(Sobel);
      c1.image(img, 0, 0);
      update=false;
      c1.endDraw();
      sobel = c1.get(0,0,c1.width,c1.height);
    }
    
    sobel.updatePixels();
    sobelx.updatePixels();
    sobely.updatePixels();
    imagesWF.add(sobel);
  };
  
  public void sobel(float mult) {
    sobel = new PImage(img.width, img.height, RGB);
    sobel.loadPixels();
    sobelx = new PImage(img.width, img.height, RGB);
    sobelx.loadPixels();
    sobely = new PImage(img.width, img.height, RGB);
    sobely.loadPixels();
    sobelG = new PImage(img.width, img.height, RGB);
    sobelG.loadPixels();
    //gx = new float[img.pixels.length];
    //gy = new float[img.pixels.length];
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        
        int p = i + j * img.width;
        float[] val = getSobel(i, j);
        
        float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
        float r = red(img.pixels[p]);
        float g = green(img.pixels[p]);
        float b1 = blue(img.pixels[p]);
        float b2 = brightness(img.pixels[p]);
        //println(val.length);
        float v = val[0];
        float k = v * mult;
        sobel.pixels[p] = color(255-(k));
        //sobel.pixels[p] = color(255-(k-b2));
        float v1 = map(val[1],-255,255,0,500);
        float v2 = map(val[2],-255,255,0,500);
        sobelx.pixels[p] = color(v1,0,0);
        sobely.pixels[p] = color(v2,0,0);
        sobelG.pixels[p] = color(val[3]);
        //gradient[i][j] = val[3];
        gradient[i][j] = map(val[3],-PI,PI,0,360);
        //gx[p] = val[1];
        //gy[p] = val[2];
      }
    }
    //println("h");
    sobel.updatePixels();
    sobelx.updatePixels();
    sobely.updatePixels();
    sobelG.updatePixels();
    //sobelG.updatePixels();
    imagesWF.add(sobel);
    c1.beginDraw();
    c1.image(sobel, 0, 0);
    c1.endDraw();
    
  };
  
  public void sobel(float mult,int a) {
    sobel = new PImage(img.width, img.height, RGB);
    sobel.loadPixels();
    sobelx = new PImage(img.width, img.height, RGB);
    sobelx.loadPixels();
    sobely = new PImage(img.width, img.height, RGB);
    sobely.loadPixels();
    sobelG = new PImage(img.width, img.height, RGB);
    sobelG.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        
        int p = i + j * img.width;
        float[] val = getSobel(i, j);
        
        float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
        float r = red(img.pixels[p]);
        float g = green(img.pixels[p]);
        float b1 = blue(img.pixels[p]);
        float b2 = brightness(img.pixels[p]);
        float v = val[0];
        float k = v * mult;
        float t = 2.0f;
        if(a==0)sobel.pixels[p] = color(255-(k-(b2)));
        if(a==1)sobel.pixels[p] = color(255-k);
        if(a==2)sobel.pixels[p] = color(b2-k);
        if(a==3)sobel.pixels[p] = color(k);
        if(a==4)sobel.pixels[p] = color(r - k,g - k,b1 - k,b2);
        if(a==5)sobel.pixels[p] = color(r - (k-(r)),g - (k-(g)),b1 - (k-(b1)),b2 -(k-(b2)));
        if(a==6)sobel.pixels[p] = color(255 - (k-(r)),255 - (k-(g)),255 - (k-(b1)),255 -(k-(b2)));
        if(a==7){
          float rng = random(200);
          float rng1 = random(100);
          if(255-(k-(b2))<100)sobel.pixels[p] = color(0);
          else sobel.pixels[p] = color(255-(k-b2),0);
        }
        if(a==8){
          float rng = random(200);
          float rng1 = random(100);
          if(255-(k-(b2))<100)sobel.pixels[p] = color(0,rng);
          else sobel.pixels[p] = color(255-(k-b2),0);
        }
        if(a==9){
          float rng = random(200);
          float rng1 = random(100);
          if(255-(k-(b2))<100)sobel.pixels[p] = color(r-rng1,g-rng1,b1-rng1,rng);
          else sobel.pixels[p] = color(255-(k-b2),0);
        }
      }
    }
    sobel.updatePixels();
    sobelx.updatePixels();
    sobely.updatePixels();
    //sobelG.updatePixels();
    imagesWF.add(sobel);
    c1.beginDraw();
    c1.image(sobel, 0, 0);
    c1.endDraw();
    
  };
  
  public void sobel(float mult,int a,float c) {
    sobel = new PImage(img.width, img.height, RGB);
    sobel.loadPixels();
    sobelx = new PImage(img.width, img.height, RGB);
    sobelx.loadPixels();
    sobely = new PImage(img.width, img.height, RGB);
    sobely.loadPixels();
    sobelG = new PImage(img.width, img.height, RGB);
    sobelG.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        
        int p = i + j * img.width;
        float[] val = getSobel(i, j);
        
        float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
        float r = red(img.pixels[p]);
        float g = green(img.pixels[p]);
        float b1 = blue(img.pixels[p]);
        float b2 = brightness(img.pixels[p]);
        //println(val.length);
        float v = val[0];
        float k = v * mult;
        float t = 2.0f;
        if(a==0)sobel.pixels[p] = color(255-(k-(b2)));
        //sobel.pixels[p] = color(0);
        if(a==1)sobel.pixels[p] = color(255-k);
        if(a==2)sobel.pixels[p] = color(b2-k);
        if(a==3)sobel.pixels[p] = color(k);
        if(a==4)sobel.pixels[p] = color(r - k,g - k,b1 - k,b2);
        //if(a==5)sobel.pixels[p] = color(r - (k-(r)),g - (k-(g)),b1 - (k-(b1)),b2 -(k-(b2)));
        if(a==5)sobel.pixels[p] = color(r - (k),g - (k),b1 - (k),b2 -(k));
        if(a==6)sobel.pixels[p] = color(255 - (k-(r)),255 - (k-(g)),255 - (k-(b1)),b2);
        if(a==7){
          float rng = random(200);
          float rng1 = random(100);
          if(255-(k-(b2))<c)sobel.pixels[p] = color(0);
          else sobel.pixels[p] = color(255-(k-b2),0);
        }
        if(a==8){
          float rng = random(200);
          float rng1 = random(100);
          if(255-(k-(b2))<c)sobel.pixels[p] = color(0,rng);
          else sobel.pixels[p] = color(255-(k-b2),0);
        }
        if(a==9){
          //println(9);
          float rng = random(200);
          float rng1 = random(100);
          if(255-(k-(b2))<c)sobel.pixels[p] = color(r-rng1,g-rng1,b1-rng1,rng);
          else sobel.pixels[p] = color(255-(k-b2),0);
        }
      }
    }
    sobel.updatePixels();
    sobelx.updatePixels();
    sobely.updatePixels();
    //sobelG.updatePixels();
    imagesWF.add(sobel);
    c1.beginDraw();
    c1.image(sobel, 0, 0);
    c1.endDraw();
  };
  
  public void sobelSP(float mult,float thresh) {
    sobel = new PImage(img.width, img.height, RGB);
    sobel.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        
        int p = i + j * img.width;
        float[] val = getSobel(i, j);
        
        float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
        float r = red(img.pixels[p]);
        float g = green(img.pixels[p]);
        float b1 = blue(img.pixels[p]);
        float b2 = brightness(img.pixels[p]);
        float v = val[0];
        float k = v * mult;
        float rng = random(200);
          
        if(255-(k-(b2))<thresh){
          sobel.pixels[p] = img.pixels[p];
        }
        else sobel.pixels[p] = color(255);
        sobel.pixels[p] = color(255-(k-(b2)));
        //sobel.pixels[p] = color(255-k);
        //if(red(sobel.pixels[p])<60)sobel.pixels[p] = color(0);
      }
    }
    sobel.updatePixels();
    //cell = new cell();
    cell.Mode = 3;
    cell.pixelThresh = 2000;
    cell.pixelThresh1 = 80;
    cell.cutoff = 15;
    //cell.maxT = 100;
    //cell.minT = 50;
    //cell.pixelThresh1 = 20;
    imagesWF.add(img);
    cell.imgUpdate(sobel);
    imagesWF.add(sobel);
    cell.getContour();
    imagesWF.add(cell.canny);
    imagesWF.add(cell.backup);
    //imagesWF.add(cell.img);
  };
  
  public void sobelSP(PImage img,float mult,float thresh) {
    sobel = new PImage(img.width, img.height, RGB);
    sobel.loadPixels();
    sobelx = new PImage(img.width, img.height, RGB);
    sobelx.loadPixels();
    sobely = new PImage(img.width, img.height, RGB);
    sobely.loadPixels();
    sobelG = new PImage(img.width, img.height, RGB);
    sobelG.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        
        int p = i + j * img.width;
        float[] val = getSobel(i, j);
        
        float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
        float r = red(img.pixels[p]);
        float g = green(img.pixels[p]);
        float b1 = blue(img.pixels[p]);
        float b2 = brightness(img.pixels[p]);
        float v = val[0];
        float k = v * mult;
        float rng = random(200);
          
        if(255-(k-(b2))<thresh)sobel.pixels[p] = img.pixels[p];
        else sobel.pixels[p] = color(255);
      }
    }
    sobel.updatePixels();
    sobelx.updatePixels();
    sobely.updatePixels();
    //sobelG.updatePixels();
    imagesWF.add(sobel);
  };

  public float []getSobel(int x, int y) {
    float val = 0;
    float vy = 0;
    float vx = 0;
    float vd = 0;
    float hd = 0;
    float eh = 0;
    float ev =0;
    img.loadPixels();
    int count = 0;
    int count2 = 0;
    int p1 = x + y * img.width;
    float b1 = (red(img.pixels[p1])+green(img.pixels[p1])+blue(img.pixels[p1])+brightness(img.pixels[p1]))/4;
    float k = 40;
    int z = 1;
    for (int i=x-z; i<=x+z; i++) {
      for (int j=y-z; j<=y+z; j++) {

        int p = i + j * img.width;
        if (p>0&&p<img.pixels.length) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
          //if (abs(red(img.pixels[p1])-red(img.pixels[p]))<k
          //  ||abs(green(img.pixels[p1])-green(img.pixels[p]))<k
          //  ||abs(blue(img.pixels[p1])-blue(img.pixels[p]))<k
          //  ||brightness(img.pixels[p1])-brightness(img.pixels[p])<k
          //  ) {
            count2 ++;
            
            int x1 = 0 + i - x + 1;
            int y1 = 0 + j - y + 1;
            
            float col = brightness(img.pixels[p]);
            col = b;
            float v = SobelH[x1][y1] * col;
            float h = SobelV[x1][y1] * col;
            float vd_ = SobelH_[x1][y1] * col;
            float hd_ = SobelV_[x1][y1] * col;
            float eh_ = SobelV[x1][y1] * col;
            float ev_ = SobelH[x1][y1] * col;
            
            vx += v;
            vy += h;
            vd += vd_;
            hd += hd_;
            ev += ev_;
            eh += eh_;
          count ++;
          //}
        }
      }
    }
    //println(vx,count);
    vx/= count;
    vy/= count;
    
    //if(vx<0)vx = 0;
    //if(vy<0)vy = 0;
    //println(vx,vy);
    val = sqrt(vx*vx + vy*vy);
    //val = sqrt(vx*vx + vy*vy + vd*vd + hd*hd + ev*ev + eh*eh);
    //val = sqrt(vx*vx + vy*vy + vd*vd + hd*hd);
    //println(atan2(vy,vx));
    float [] sob = {val, vx, vy,atan2(vy,vx)};
    //float [] sob = {val, vx, vy, count2,atan2((vy + hd + eh)/3,(vx + vd + ev)/3)};
    //float [] sob = {val, vx, vy, count2,atan2((vy + hd)/2,(vx + vd)/2)};
    //gradient[x][y] = atan2(vy,vx);
    return sob;
  };
  
  public void sobel(PImage img,float mult,int a) {
    println("h");
    sobel = new PImage(img.width, img.height, RGB);
    sobel.loadPixels();
    sobelx = new PImage(img.width, img.height, RGB);
    sobelx.loadPixels();
    sobely = new PImage(img.width, img.height, RGB);
    sobely.loadPixels();
    sobelG = new PImage(img.width, img.height, RGB);
    sobelG.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {

        int p = i + j * img.width;
        float[] val = getSobel(i, j,img);
        float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
        float r = red(img.pixels[p]);
        float g = green(img.pixels[p]);
        float b1 = blue(img.pixels[p]);
        float b2 = brightness(img.pixels[p]);
        //println(val.length);
        float v = val[0];
        //println(val[0]);
        float k = v*mult;
        //k = random(255);
        
        if(a==0)sobel.pixels[p] = color(255-(k-(b2)));
        //sobel.pixels[p] = color(0);
        if(a==1)sobel.pixels[p] = color(255-k);
        if(a==2)sobel.pixels[p] = color(b2-k);
        if(a==3)sobel.pixels[p] = color(k);
        //sobel.pixels[p] = color(((b2)-k));
        //sobel.pixels[p] = color(0);
        //sobel.pixels[p] = color(k);
        //sobel.pixels[p] = color(k-r,k-g,k-b1);
        //sobel.pixels[p] = color((k-r),(k-g),(k-b1));
        //sobel.pixels[p] = color(r-k,g-k,b1-k);
        //float s = brightness(sobel.pixels[p]);
        //if(s>250)sobel.pixels[p] = color(0);
        //println(sobel.pixels[p]);
        //if(k<200)sobel.pixels[p] = color(img.pixels[p]);
        //sobel.pixels[p] = color(val[0]);
        //else sobel.pixels[p] = color(255);
        sobelx.pixels[p] = color(val[1]);
        sobely.pixels[p] = color(val[2]);
      }
    }
    sobel.updatePixels();
    sobelx.updatePixels();
    sobely.updatePixels();
    sobelG.updatePixels();
    imagesWF.add(sobel);
    c1.beginDraw();
    c1.image(sobel, 0, 0);
    c1.endDraw();
  };
  
  public float []getSobel(int x, int y, PImage img) {
    float val = 0;
    float vy = 0;
    float vx = 0;
    img.loadPixels();
    int count = 0;
    for (int i=x-1; i<=x+1; i++) {
      for (int j=y-1; j<=y+1; j++) {

        int p = i + j * img.width;
        if (p>0&&p<img.pixels.length) {
          int x1 = 0 + i - x + 1;
          int y1 = 0 + j - y + 1;

          float col = brightness(img.pixels[p]);
          //println(col);
          //col = (red(img.pixels[p])+blue(img.pixels[p])+green(img.pixels[p])+brightness(img.pixels[p]))/4;
          float v = SobelH[x1][y1] * col;
          float h = SobelV[x1][y1] * col;

          //println(col);
          vx += v;
          vy += h;

          count ++;
        }
      }
    }

    vx/= count;
    vy/= count;

    val = sqrt(vx*vx + vy*vy);
    //val = random(255);
    //println(count);
    float [] sob = {val, vx, vy, count};
    return sob;
  };
  
  public void sobel2(float mult,int a) {
    sobel2 = new PImage(img.width, img.height, RGB);
    sobel2.loadPixels();
    sobel2x = new PImage(img.width, img.height, RGB);
    sobel2x.loadPixels();
    sobel2y = new PImage(img.width, img.height, RGB);
    sobel2y.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float []mean = getSobel2(i, j, a);
        float b = brightness(img.pixels[p]);
        //println(mean[0]);
        sobel2.pixels[p] = color(255-(mean[0]*mult-b));
        sobel2x.pixels[p] = color(mean[1]);
        sobel2y.pixels[p] = color(mean[2]);
        //sobel2.pixels[p] = color(mean);
        //sobelG.pixels[p] = color((gradient[i][j]*100));
        //println(gradient[i][j],green(sobelG.pixels[p]));
      }
    }
    sobel2.updatePixels();
    c1.beginDraw();
    c1.image(sobel, 0, 0);
    c1.endDraw();
    imagesWF.add(sobel2);
  };
  
  public float []getSobel2(int x, int y,int a){
    float mean = 0;
    float meany = 0;
    float meana = 0;
    float meanb = 0;
    int count = 0;
    float a1 = 0;
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
        int p = i + j * img.width;
        if (p<img.pixels.length&&p>0) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
          float c = (i-x);
          float d = (j-y);
          float e = x - i;
          float f = y - j;
          //if(c==0)c=1;
          //meany += brightness(img.pixels[p])*(c+d);
          //mean += brightness(img.pixels[p])*(e+f);
          //meana += brightness(img.pixels[p])*(c+f);
          //meanb += brightness(img.pixels[p])*(e+d);
          meany += b*(c+d);
          mean += b*(e+f);
          meana += b*(c+f);
          meanb += b*(e+d);
          a1 += (c + d);
          //println(c+d);
          //mean += (brightness(img.pixels[p])*(c+d) + brightness(img.pixels[p])*(e+f))/2;
          //mean += brightness(img.pixels[p])*(c+d);
          count++;
      }}
    }
    //println(mean,brightness(img.pixels[x+y*img.width]));
    //println(mean,brightness(img.pixels[x+y*img.width]));
    //println(mean,brightness(img.pixels[x+y*img.width]));
    //println(mean,brightness(img.pixels[x+y*img.width]));
    //println(a1);
    mean /= count;
    meana /= count;
    meanb /= count;
    meany /= count;
    float k = 00;
    //return sqrt(mean*mean+meany*meany);
    //gradient[x][y] = atan2((meany+meana)/2,(mean+meanb)/2);
    float val = sqrt(mean*mean+meany*meany+(meana*meana+meanb*meanb))+random(-k);
    //float val = sqrt((mean*mean+meany*meany)/(meana*meana+meanb*meanb));
    //float val = sqrt((mean*mean+meany*meany)/(meana*meana+meanb*meanb))-sqrt((meana*meana+meanb*meanb)/(mean*mean+meany*meany));;
    //float val = sqrt((mean*mean+meany*meany)*(meana*meana+meanb*meanb))*sqrt((x^x&y^y));
    //float val = sqrt((mean*mean+meany*meany)*(meana*meana+meanb*meanb))/sqrt(((x^x)-(width/2))&((y^y)-(height/2)));
    //float val = sqrt(mean*mean+meany*meany);
    //float val = sqrt(meana*meana+meanb*meanb);
    //println(val);
    float valx = (mean);
    float valy = (meany);
    float [] sob = {val,valx,valy};
    return sob;
    //return sqrt((meana*meana+meanb*meanb));
    //return sqrt((meany/count)*meany/count+meanb/count*meanb/count);
  };
  
  public void sobel2(int a, float mult2,int c) {
    sobel2 = new PImage(img.width, img.height, ARGB);
    sobel2.loadPixels();
    sobel2x = new PImage(img.width, img.height, RGB);
    sobel2x.loadPixels();
    sobel2y = new PImage(img.width, img.height, RGB);
    sobel2y.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float []mean = getSobel2(i, j, a);
        float b = brightness(img.pixels[p]);
        float k = mean[0]*(mult2);
        //if(k>0)k=255;
        //println(mean[1]);
        if(c==0)sobel2.pixels[p] = color(255-(k-b));
        if(c==1)sobel2.pixels[p] = color(255-(k));
        if(c==2)sobel2.pixels[p] = color(255-(k)-b);
        if(c==3)sobel2.pixels[p] = color(b-k);
        if(c==4)sobel2.pixels[p] = color(k);
        if(c==7){
          
          if(255-(k)<10)sobel2.pixels[p] = color(255-(k),255);
          else sobel2.pixels[p] = color(255-(k),0);
        }
        //
        //sobel2x.pixels[p] = color(255-(mean[1]*(mult2)-b));
        //sobel2y.pixels[p] = color(255-(mean[2]*(mult2)-b));
        sobel2x.pixels[p] = color((mean[1]));
        sobel2y.pixels[p] = color((mean[2]));
        
        
        //sobel2.pixels[p] = color(mean);
        //sobelG.pixels[p] = color((gradient[i][j]*100));
        //println(gradient[i][j],green(sobelG.pixels[p]));
      }
    }
    sobel2.updatePixels();
    imagesWF.add(sobel2);
  };
  
  public void sobel2(PImage img,float mult,int a) {
    sobel2 = new PImage(img.width, img.height, RGB);
    sobel2.loadPixels();
    sobel2x = new PImage(img.width, img.height, RGB);
    sobel2x.loadPixels();
    sobel2y = new PImage(img.width, img.height, RGB);
    sobel2y.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {
        int p = i + j * img.width;
        float []mean = getSobel2(img,i, j, a);
        float b = brightness(img.pixels[p]);
        float k = mean[0]*mult;
        sobel2.pixels[p] = color(255-(k-b));
        
        sobel2x.pixels[p] = color(mean[1]);
        sobel2y.pixels[p] = color(mean[2]);
        //sobel2.pixels[p] = color(mean);
        //sobelG.pixels[p] = color((gradient[i][j]*100));
        //println(gradient[i][j],green(sobelG.pixels[p]));
      }
    }
    sobel2.updatePixels();
    imagesWF.add(sobel2);
  };
  
  public float []getSobel2(PImage img,int x, int y,int a){
    float mean = 0;
    float meany = 0;
    float meana = 0;
    float meanb = 0;
    int count = 0;
    for (int i=x-a; i<=x+a; i++) {
      for (int j=y-a; j<=y+a; j++) {
        int p = i + j * img.width;
        if (p<img.pixels.length&&p>0) {
          float b = (red(img.pixels[p])+green(img.pixels[p])+blue(img.pixels[p])+brightness(img.pixels[p]))/4;
          //b = brightness(img.pixels[p]);
          //println(b);
          float c = (i-x);
          float d = (j-y);
          float e = x - i;
          float f = y - j;
          //if(c==0)c=1;
          //meany += brightness(img.pixels[p])*(c+d);
          //mean += brightness(img.pixels[p])*(e+f);
          //meana += brightness(img.pixels[p])*(c+f);
          //meanb += brightness(img.pixels[p])*(e+d);
          meany += b*(c+d);
          mean += b*(e+f);
          meana += b*(c+f);
          meanb += b*(e+d);
          //mean += (brightness(img.pixels[p])*(c+d) + brightness(img.pixels[p])*(e+f))/2;
          //mean += brightness(img.pixels[p])*(c+d);
          count++;
      }}
    }
    
    mean /= count;
    meana /= count;
    meany /= count;
    meanb /= count;
    float k = 90;
    //return sqrt(mean*mean+meany*meany);
    //gradient[x][y] = atan2((meany+meana)/2,(mean+meanb)/2);
    float val = sqrt(mean*mean+meany*meany+(meana*meana+meanb*meanb))+random(-k);;
    //float val = sqrt((mean*mean+meany*meany)/(meana*meana+meanb*meanb));
    //float val = sqrt((mean*mean+meany*meany)/(meana*meana+meanb*meanb))-sqrt((meana*meana+meanb*meanb)/(mean*mean+meany*meany));;
    //float val = sqrt((mean*mean+meany*meany)*(meana*meana+meanb*meanb))*sqrt((x^x&y^y));
    //float val = sqrt((mean*mean+meany*meany)*(meana*meana+meanb*meanb))/sqrt(((x^x)-(width/2))&((y^y)-(height/2)));
    //float val = sqrt(mean*mean+meany*meany);
    //float val = sqrt(meana*meana+meanb*meanb);
    //println(val);
    float valx = (mean);
    float valy = (meany);
    float [] sob = {val,valx,valy};
    return sob;
    //return sqrt(((meana/count)*meana/count+meanb/count*meanb/count));
    //return sqrt((meany/count)*meany/count+meanb/count*meanb/count);
  };
 
  
  public void sobelMax(float t){
    sobelMax = new PImage(img.width, img.height, RGB);
    sobelMax.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {

        int p = i + j * img.width;
        
        boolean max = getNeighboursMax(i,j,t);
        if(max)sobelMax.pixels[p] = color(255);
        else sobelMax.pixels[p] = sobel.pixels[p];
      }}
      sobelMax.updatePixels();
      imagesWF.add(sobelMax);
  };
  
  
  public boolean getNeighboursMax(int x, int y,float t) {
    
    float []max = new float[7];
    max[0] = 255;
    
    boolean k = false;
    int p = x + y * img.width;
    float c = brightness(sobel.pixels[p]);
    float g 
    //= gradient[x][y];
    //= red(sobelG.pixels[p]);
    = atan2(red(sobely.pixels[p]),red(sobelx.pixels[p]));
    int count=0;
    for (int i=x-1; i<=x+1; i++) {
      for (int j=y-1; j<=y+1; j++) {
        
        int p1 = i+j*sobel.width;
        
        if(p1>0&&p1<sobel.pixels.length){
          
          float c1 = brightness(sobel.pixels[p1]);
          float g1 = atan2(y-j,x-i);
          
          float g2 = brightness(sobelG.pixels[p1]);
          //= atan2((sobely.pixels[p1]),(sobelx.pixels[p1]));
          float d1 = abs(g-g1);
          float d2 = abs((g-PI)-g1);
          float d3 = abs(g-g2);
          float d4 = abs((g-PI)-g2);
          float t1 = radians(45);
          float t2 = radians(90);
          float t3 = radians(180);
          float t4 = radians(270);
          //if(max[0]>c){
          //println(g,g1);
          if(((d1<=t1||d2<=t1)&&(c1<=c)&&c1<=max[0])||((d1>=t1||d2>=t1)&&(c1>=c)&&c1>=max[0])){
            //println(g,g1,d1,t1,t2);
          //if((d1<t1||d2<t1)){
              max[0] = c1;
              max[3] = p1;
              k = true;
              count++;
          }}}
    }
    int p1 = (int)max[3];
    boolean k2 = false;
    //float c = brightness(sobel.pixels[p]);
    float c2 = brightness(sobel.pixels[p1]);
    //float t = 30;
    float t2 = radians(45);
    float t3 = radians(10);
    float d1 = abs(max[0]-(255-(c)));
    float d2 = abs(atan2(sobely.pixels[p] - sobely.pixels[p1],sobelx.pixels[p] - sobelx.pixels[p1]));
    //println(d2);
    float d3 = abs(max[0]-c);
    if(max[0]<255&&c>=max[0])k = false;
    return k;
  };
  
  public void sobelMax2(float t){
    sobelMax = new PImage(img.width, img.height, RGB);
    sobelMax.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {

        int p = i + j * img.width;
        
        if(brightness(sobel.pixels[p])<255)getNeighboursMax2(i,j,t);
        else sobelMax.pixels[p] = color(255);
      }}
      sobelMax.updatePixels();
      imagesWF.add(sobelMax);
  };
  
  public void getNeighboursMax2(int x, int y,float t) {
    
    boolean k = false;
    int p = x + y * img.width;
    float c = brightness(sobel.pixels[p]);
    float g 
    = gradient[x][y];
    //= red(sobelG.pixels[p]);
    //= atan2(red(sobely.pixels[p]),red(sobelx.pixels[p]));
        
        float q = 255;
        float r = 255;
        int p1 = 0;
        
       //angle 0
       if ((0 <= g && g < (22.5f))){
            if((x+1)+(y)*img.width<img.pixels.length&&(x+1)+(y)*img.width>=0)q = brightness(sobel.pixels[(x+1)+(y)*img.width]);
            if((x-1)+(y)*img.width<img.pixels.length&&(x-1)+(y)*img.width>=0)r = brightness(sobel.pixels[(x-1)+(y)*img.width]);
        //angle 45
        }else if ((22.5f) <= g && g < (67.5f)){
            if((x+1)+ (y+1)*img.width<img.pixels.length&&(x+1)+ (y+1)*img.width>=0)q = brightness(sobel.pixels[(x+1)+ (y+1)*img.width]);
            if((x-1)+ (y-1)*img.width<img.pixels.length&&(x-1)+ (y-1)*img.width>=0)r = brightness(sobel.pixels[(x-1)+ (y-1)*img.width]);
        //angle 90
        }else if ((67.5f) <= g && g< (112.5f)){
            if((x)+ (y+1)*img.width<img.pixels.length&&(x)+ (y+1)*img.width>=0)q = brightness(sobel.pixels[(x)+ (y+1)*img.width]);
            if((x)+ (y-1)*img.width<img.pixels.length&&(x)+ (y-1)*img.width>=0)r = brightness(sobel.pixels[(x)+ (y-1)*img.width]);
        //angle 135
        }else if ((112.5f) <= g && g < (157.5f)){
            if((x-1)+(y+1)*img.width<img.pixels.length&&(x-1)+(y+1)*img.width>=0)q = brightness(sobel.pixels[(x-1)+(y+1)*img.width]);
            if((x+1)+(y-1)*img.width<img.pixels.length&&(x+1)+(y-1)*img.width>=0)r = brightness(sobel.pixels[(x+1)+(y-1)*img.width]);
        //angle 180
        }else if ((157.5f) <= g && g < (202.5f)){
            if((x-1)+(y)*img.width<img.pixels.length&&(x-1)+(y)*img.width>=0)q = brightness(sobel.pixels[(x-1)+(y)*img.width]);
            if((x+1)+(y)*img.width<img.pixels.length&&(x+1)+(y)*img.width>=0)r = brightness(sobel.pixels[(x+1)+(y)*img.width]);
        //angle 225
        }else if ((202.5f) <= g && g < (247.5f)){
            if((x-1)+(y-1)*img.width<img.pixels.length&&(x-1)+(y-1)*img.width>=0)q = brightness(sobel.pixels[(x-1)+(y-1)*img.width]);
            if((x+1)+(y+1)*img.width<img.pixels.length&&(x+1)+(y+1)*img.width>=0)r = brightness(sobel.pixels[(x+1)+(y+1)*img.width]);
        //angle 270
        }else if ((247.5f) <= g && g < (292.5f)){
            if((x-1)+(y+1)*img.width<img.pixels.length&&(x-1)+(y+1)*img.width>=0)q = brightness(sobel.pixels[(x-1)+(y+1)*img.width]);
            if((x+1)+(y-1)*img.width<img.pixels.length&&(x+1)+(y-1)*img.width>=0)r = brightness(sobel.pixels[(x+1)+(y-1)*img.width]);
        //angle 315
        }else if ((292.5f) <= g && g < (337.5f)){
            if((x)+(y-1)*img.width<img.pixels.length&&(x)+(y-1)*img.width>=0)q = brightness(sobel.pixels[(x)+(y-1)*img.width]);
            if((x)+(y+1)*img.width<img.pixels.length&&(x)+(y+1)*img.width>=0)r = brightness(sobel.pixels[(x)+(y+1)*img.width]);
        //angle 360
        }else if ((337.5f) <= g && g <= (360)){
            if((x+1)+(y)*img.width<img.pixels.length&&(x+1)+(y)*img.width>=0)q = brightness(sobel.pixels[(x+1)+(y)*img.width]);
            if((x-1)+(y)*img.width<img.pixels.length&&(x-1)+(y)*img.width>=0)r = brightness(sobel.pixels[(x-1)+(y)*img.width]);
        }
        //println(q,r);
        if (q<t&&(brightness(sobel.pixels[x+y*img.width]) <= q) && (r<t&&brightness(sobel.pixels[x+y*img.width]) <= r)) sobelMax.pixels[x+y*img.width] = 0;
        else sobelMax.pixels[x+y*img.width] = color(255);
        
  };
  
  public void sobelMax3(float t){
    sobelMax = new PImage(img.width, img.height, RGB);
    sobelMax.loadPixels();
    c1.loadPixels();
    float max = 0;
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {

        int p = i + j * img.width;
        
        //if(blue(sobel.pixels[p])<t)getNeighboursMax3(i,j,t);
        //else sobelMax.pixels[p] = color(255);
        //println(blue(c1.pixels[p]));
        if(red(sobel.pixels[p])>max)max = red(sobel.pixels[p]);
        if(green(sobel.pixels[p])>max)max = green(sobel.pixels[p]);
        if(blue(c1.pixels[p])<t)getNeighboursMax3(i,j,t);
        else sobelMax.pixels[p] = color(255);
      }}
      sobelMax.updatePixels();
      imagesWF.add(sobelMax);
      println("max",max);
  };
  
  public void getNeighboursMax3(int x, int y,float t) {
    
    boolean k = false;
    int p = x + y * img.width;
    float red = red(sobel.pixels[p]);
    float green = green(sobel.pixels[p]);
    float m = 1;
    //red = map(red,0,255*m,-255,255);
    //green = map(green,0,255*m,-255,255);
    float g = atan2(green,red);
    float g1 = g;
    g = map(g,-PI,PI,0,360);
    //g = gradient[x][y];
    //println(red,green,g6,g7,g,gradient[x][y],g8);
    //if(red!=green)println(red,green,g);
    //println(g);
    int w1 = img.width;
    //= red(sobelG.pixels[p]);
    //= atan2(red(sobely.pixels[p]),red(sobelx.pixels[p]));
        
        float q = 255;
        float r = 255;
        int p1 = 0;
        
       //angle 0
       //if ((0 <= g && g < (22.5))){
       //     if((x+1)+(y)*w1<img.pixels.length&&(x+1)+(y)*w1>=0)q = blue(sobel.pixels[(x+1)+(y)*w1]);
       //     if((x-1)+(y)*w1<img.pixels.length&&(x-1)+(y)*w1>=0)r = blue(sobel.pixels[(x-1)+(y)*w1]);
       // //angle 45
       // }else if ((22.5) <= g && g < (67.5)){
       //     if((x+1)+ (y+1)*w1<img.pixels.length&&(x+1)+ (y+1)*w1>=0)q = blue(sobel.pixels[(x+1)+ (y+1)*w1]);
       //     if((x-1)+ (y-1)*w1<img.pixels.length&&(x-1)+ (y-1)*w1>=0)r = blue(sobel.pixels[(x-1)+ (y-1)*w1]);
       // //angle 90
       // }else if ((67.5) <= g && g< (112.5)){
       //     if((x)+ (y+1)*w1<img.pixels.length&&(x)+ (y+1)*w1>=0)q = blue(sobel.pixels[(x)+ (y+1)*w1]);
       //     if((x)+ (y-1)*w1<img.pixels.length&&(x)+ (y-1)*w1>=0)r = blue(sobel.pixels[(x)+ (y-1)*w1]);
       // //angle 135
       // }else if ((112.5) <= g && g < (157.5)){
       //     if((x-1)+(y+1)*w1<img.pixels.length&&(x-1)+(y+1)*w1>=0)q = blue(sobel.pixels[(x-1)+(y+1)*w1]);
       //     if((x+1)+(y-1)*w1<img.pixels.length&&(x+1)+(y-1)*w1>=0)r = blue(sobel.pixels[(x+1)+(y-1)*w1]);
       // //angle 180
       // }else if ((157.5) <= g && g < (202.5)){
       //     if((x-1)+(y)*w1<img.pixels.length&&(x-1)+(y)*w1>=0)q = blue(sobel.pixels[(x-1)+(y)*w1]);
       //     if((x+1)+(y)*w1<img.pixels.length&&(x+1)+(y)*w1>=0)r = blue(sobel.pixels[(x+1)+(y)*w1]);
       // //angle 225
       // }
         if ((202.5f) <= g && g < (247.5f)){
            if((x-1)+(y-1)*w1<img.pixels.length&&(x-1)+(y-1)*w1>=0)q = blue(sobel.pixels[(x-1)+(y-1)*w1]);
            if((x+1)+(y+1)*w1<img.pixels.length&&(x+1)+(y+1)*w1>=0)r = blue(sobel.pixels[(x+1)+(y+1)*w1]);
        //angle 270
        }
         if ((247.5f) <= g && g < (292.5f)){
            if((x-1)+(y+1)*w1<img.pixels.length&&(x-1)+(y+1)*w1>=0)q = blue(sobel.pixels[(x-1)+(y+1)*w1]);
            if((x+1)+(y-1)*w1<img.pixels.length&&(x+1)+(y-1)*w1>=0)r = blue(sobel.pixels[(x+1)+(y-1)*w1]);
        //angle 315
        }
        else if ((292.5f) <= g && g < (337.5f)){
            if((x)+(y-1)*w1<img.pixels.length&&(x)+(y-1)*w1>=0)q = blue(sobel.pixels[(x)+(y-1)*w1]);
            if((x)+(y+1)*w1<img.pixels.length&&(x)+(y+1)*w1>=0)r = blue(sobel.pixels[(x)+(y+1)*w1]);
        //angle 360
        }
        else if ((337.5f) <= g && g <= (360)){
            if((x+1)+(y)*w1<img.pixels.length&&(x+1)+(y)*w1>=0)q = blue(sobel.pixels[(x+1)+(y)*w1]);
            if((x-1)+(y)*w1<img.pixels.length&&(x-1)+(y)*w1>=0)r = blue(sobel.pixels[(x-1)+(y)*w1]);
        }
        //println(q,r);
        //if (q<t&&(blue(sobel.pixels[p]) <= q) && (r<t&&blue(sobel.pixels[p]) <= r)) sobelMax.pixels[p] = color(0);
        //else sobelMax.pixels[p] = color(255);
        if (q<t&&(blue(sobel.pixels[p]) <= q) && (r<t&&blue(sobel.pixels[p]) <= r)) sobelMax.pixels[p] = color(0);
        else sobelMax.pixels[p] = color(255);
        
  };
  
  public void sobelMax4(float thresh){
    sobelMax = new PImage(img.width, img.height, RGB);
    
    if(update){
      thresh = map(thresh,0,255,0,1);
      println("ThreshHold",thresh);
      SobelMax.set("thresh", thresh);
      c1.beginDraw();
      c1.shader(SobelMax);
      c1.image(sobel, 0, 0);
      c1.endDraw();
      canny = c1.get();
      imagesWF.add(canny);
      update = true;
    }

  };
  
  public void sobelMax4(int t1){
    sobelMax = new PImage(img.width, img.height, RGB);
    
    if(update){
      float thresh = map(t1,0,255,0,1);
      println("ThreshHold",thresh);
      SobelMax.set("thresh", thresh);
      c1.beginDraw();
      c1.shader(SobelMax);
      c1.image(sobel, 0, 0);
      c1.endDraw();
      canny = c1.get();
      imagesWF.add(canny);
      update = true;
    }

  };
  
  public void sobelMax(PImage sobel,float t){
    sobelMax = new PImage(img.width, img.height, RGB);
    sobelMax.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {

        int p = i + j * img.width;
        
        boolean max = getNeighboursMax(i,j,sobel,t);
        sobelMax.pixels[p] = color(255);
        if( max)sobelMax.pixels[p] = color(0);
        //else if(max&&brightness(sobel.pixels[p])<255-t)sobelMax.pixels[p] = color(0);
      }}
      sobelMax.updatePixels();
      imagesWF.add(sobelMax);
  };
  
  public void canny3(float mult,float thresh){
    canny = new PImage(img.width,img.height,ARGB);
    thresh = map(thresh,0,255,0,1);
    SobelG.set("mult", mult);
    println("mult", mult);
    pass3.beginDraw();            
    pass3.shader(SobelG);  
    pass3.image(imagesWF.get(imagesWF.size()-1), 0, 0);
    
    pass3.endDraw();
    //pass3.loadPixels();
    //for(int i=0;i<pass3.pixels.length;i++){
    //  pass3.pixels[i] = color(random(255));
    //}
    //pass3.updatePixels();
    if(temp==null)temp = new PImage(img.width,img.height,ARGB);
    temp = pass3.get();
    imagesWF.add(temp);
    println("ThreshHold",thresh);
    SobelMax.set("thresh", thresh);
    pass4.beginDraw();            
    pass4.shader(SobelMax);  
    pass4.image(pass3, 0, 0);
    pass4.endDraw(); 
    c2.beginDraw();
    c2.image(pass4, 0, 0);
    c2.endDraw();
    canny = c2.get();
    imagesWF.add(canny);
  };
  
  public void canny4(float mult,float thresh){
    canny = new PImage(img.width,img.height,ARGB);
    thresh = map(thresh,0,255,0,1);
    SobelG.set("mult", mult);
    pass1.beginDraw();            
    pass1.shader(SobelG);  
    pass1.image(img, 0, 0);
    pass1.endDraw();
    PImage t = new PImage(img.width,img.height,ARGB);
    t = pass1.get();
    imagesWF.add(t);
    println("ThreshHold",thresh);
    SobelMax.set("thresh", thresh);
    pass2.beginDraw();            
    pass2.shader(SobelMax);  
    pass2.image(pass1, 0, 0);
    pass2.endDraw(); 
    c1.beginDraw();
    c1.image(pass2, 0, 0);
    c1.endDraw();
    canny = c1.get();
    imagesWF.add(canny);
  };
  
  //boolean getNeighboursMax(int x, int y,PImage sobel,float t) {
    
  //  float []min = new float[2];
  //  min[0] = 255;
    
  //  boolean k = false;
  //  int p = x + y * img.width;
  //  float myGradient = gradient[x][y];
    
  //  for (int i=x-1; i<=x+1; i++) {
  //    for (int j=y-1; j<=y+1; j++) {
        
  //      int p1 = i+j*sobel.width;
        
  //      if(p1>0&&p1<sobel.pixels.length){
  //        float c = 0;
  //        c = brightness(sobel.pixels[p1]);
  //        if(min[0]>c){
  //          min[0] = c;
  //          min[1] = p1;
  //        }}}
  //  }
  //  int p1 = (int)min[1];
  //  boolean k2 = false;
  //  float c = brightness(sobel.pixels[p]);
  //  float c1 = brightness(sobel.pixels[p1]);
  //  float t1 = radians(45);
  //  float t2 = 30;
  //  float d = abs(c1-(255-(c)));
  //  //println(d2);
  //  float d1 = abs(c1-c);
  //  float g = atan2(green(sobelG.pixels[p]), blue(sobelG.pixels[p]));
  //  float g1 = atan2(green(sobelG.pixels[p1]), blue(sobelG.pixels[p1]));
  //  float d2 = abs(g-g1);
  //  //println(d3,d1,c,c2,min[0]);
  //  //if(d3<t)k = true;
  //  //println(g,g1,g-g1,t1);
  //  //if(c<t&&c<=c1||d2<t&&d<t2)k = true;
  //  if(c>c1&&c1<t&&d2<t1&&d1<t2||c<t&&c<=c1)k = true;

  //  // for(int i=0;i<8;i++){
  //  //   float theta = radians(45)*i;
  //  //   float theta2 = radians(45)*(i+1);

  //  //   if(g>theta&&g<theta2){
  //  //     if(g2>theta-PI&&g2<theta2-PI||g2>theta+PI&&g2<theta2+PI)
  //  //   }
  //  // }
  //  //println(min[0],brightness(combined.pixels[p]),x,y);
  //  //if(min[0]<=brightness(combined.pixels[p])||k2)k=true;
    
  //  // keep this one for cartoons
  //  //if((min[0]<=brightness(combined.pixels[p]))||d1>t&&min[0]<=brightness(combined.pixels[p]))k = true;
  //  return k;
  //};
  
  public boolean getNeighboursMax(int x, int y,PImage sobel,float t) {
    
    float []min = new float[2];
    min[0] = 255;
    
    boolean k = false;
    int p = x + y * img.width;
    float g = atan2((sobelx.pixels[p]),(sobely.pixels[p]));
    
    for (int i=x-1; i<=x+1; i++) {
      for (int j=y-1; j<=y+1; j++) {
        
        int p1 = i+j*sobel.width;
        
        if(p1>0&&p1<sobel.pixels.length){
          float c = 0;
          c = brightness(sobel.pixels[p1]);
          if(min[0]>c){
            min[0] = c;
            min[1] = p1;
          }}}
    }
    int p1 = (int)min[1];
    boolean k2 = false;
    float c = brightness(sobel.pixels[p]);
    float c1 = brightness(sobel.pixels[p1]);
    float t1 = radians(45);
    float t2 = 30;
    float d = abs(c1-(255-(c)));
    //println(d2);
    float d1 = abs(c1-c);
    //float g = atan2(green(sobelG.pixels[p]), blue(sobelG.pixels[p]));
    float g1 = atan2(green(sobelG.pixels[p1]), blue(sobelG.pixels[p1]));
    float d2 = abs(g-g1);
    //println("h");
    return k;
  };
  
  // used with mean--------------------------------
  public void sobelMax(PImage sobel,float t,float t1){
    sobelMax = new PImage(img.width, img.height, RGB);
    sobelMax.loadPixels();
    println(t);
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {

        int p = i + j * img.width;
        
        boolean max = getNeighboursMax(i,j,sobel,t,t1);
        sobelMax.pixels[p] = color(255);
        if(max)sobelMax.pixels[p] = color(brightness(sobel.pixels[p]));
        //else if(!max&&brightness(sobel.pixels[p])<t+t1)sobelMax.pixels[p] = color(200);
        //else if(max&&brightness(sobel.pixels[p])<255-t)sobelMax.pixels[p] = color(0);
      }}
      sobelMax.updatePixels();
      imagesWF.add(sobelMax);
  };
  
  public boolean getNeighboursMax(int x, int y,PImage sobela,float t,float t2) {
    
    float []min = new float[2];
    min[0] = 255;
    
    boolean k = false;
    int p = x + y * img.width;
    float g = 0;
    if(sobel!=null)g = atan2((sobelx.pixels[p]),(sobely.pixels[p]));
    else g = atan2((sobel2x.pixels[p]),(sobel2y.pixels[p]));
    
    float c = brightness(sobela.pixels[p]);
    //float t2 = 30;
    for (int i=x-1; i<=x+1; i++) {
      for (int j=y-1; j<=y+1; j++) {
        
        int p1 = i+j*sobela.width;
        
        if(p1>0&&p1<sobela.pixels.length){
          float c1 = 0;
          float g1 = atan2(y-j,x-i);
          float d1 = abs(g-g1);
          float d2 = abs((g-PI)-g1);
          float t1 = radians(45);
          float t5 = radians(45);
          float t3 = radians(270);
          float t4 = radians(90);
          if(combined==null)c1= brightness(sobela.pixels[p1]);
          else c1= brightness(combined.pixels[p1]);
          //if((((d1<t1||d2<t1)&&((c1<c&&c1<t))))){
          //if((((d1<t1||d2<t1)&&((c1<c&&c1<t))))){
          if((((d1>t1&&d1<t4+t1)||(d2>t3-t1&&d2<t3+t1))&&(c1<c&&c1<t))){
            
            min[0] = c1;
            min[1] = p1;
            k = true;
            
          }}}
    }
    int p1 = (int)min[1];
    boolean k2 = false;
    //float c = brightness(sobel.pixels[p]);
    float c1 = brightness(sobela.pixels[p1]);
    float t1 = radians(180);
    //println(k);
    float d = abs(c1-(255-(c)));
    
    float d1 = abs(c1-c);
    float g1 = 0;
    if(sobel!=null)g1 = atan2((sobelx.pixels[p1]),(sobely.pixels[p1]));
    else g1 = atan2((sobel2x.pixels[p1]),(sobel2y.pixels[p1]));
    //float g1 = atan2((meanGy.pixels[p1]), (meanGy.pixels[p1]));
    //float g1 = atan2((blurX.pixels[p1]),(blurY.pixels[p1]));
    float d2 = abs(g-g1);
    float d3 = abs((g-PI)-g1);
    float d4 = abs(c-t);
    return k;
  };
  
  public void sobelMaxS(float t){
    if(sobel!=null){
      if(sobelMax==null)sobelMax = new PImage(img.width, img.height, RGB);
      
      if(update){
        float t1 = map(t,0,255,0,1);
        println("thresh",t1);
        c1.beginDraw();
        SobelMax.set("thresh",t1);
        c1.shader(SobelMax);
        c1.image(sobel, 0, 0);
        c1.endDraw();
        update=false;
        sobelMax = c1.get();
        imagesWF.add(sobelMax);
        
      }
    }else{
      println("No Sobel Image");
    }
  };
  
  //boolean getNeighboursMax(int x, int y,PImage sobela,float t,float t2) {
    
  //  boolean k = true;
  //  int p = x + y * img.width;
    
  //  float c = brightness(sobela.pixels[p]);
    
  //  for (int i=x-1; i<=x+1; i++) {
  //    for (int j=y-1; j<=y+1; j++) {
        
  //      int p1 = i+j*sobela.width;
        
  //      if(p1>0&&p1<sobela.pixels.length){
  //        float c1 = brightness(sobela.pixels[p1]);
  //        if(c>c1)k = false;
  //    }}
  //  }
  //  return k;
  //};
  
  
  public void sobelMin(){
    sobelMin = new PImage(img.width, img.height, RGB);
    sobelMin.loadPixels();
    for (int i=0; i<img.width; i++) {
      for (int j=0; j<img.height; j++) {

        int p = i + j * img.width;
        
        boolean min = getNeighboursMin(i,j);
        if(!min)sobelMin.pixels[p] = color(255);
        else sobelMin.pixels[p] = sobel.pixels[p];
      }}
      sobelMin.updatePixels();
      imagesWF.add(sobelMin);
  };
  
  public boolean getNeighboursMin(int x, int y) {
    
    float []max = new float[3];
    max[0] = 0;
    boolean k = false;
    int p = x + y * img.width;
    float myGradient = brightness(sobelG.pixels[p]);
    for (int i=x-1; i<=x+1; i++) {
      for (int j=y-1; j<=y+1; j++) {
        
        int p1 = i+j*sobel.width;
        
        if(p1>0&&p1<sobel.pixels.length&&p1!=p){
        float cGradient = brightness(sobelG.pixels[p1]);
        
        //if(cGradient==-1/myGradient||cGradient==PI-(-1/myGradient)){
        //if(cGradient==myGradient){
          float c = brightness(sobel.pixels[p1]);
          if(max[0]>c){
            max[0] = c;
            max[1] = i;
            max[2] = j;
          }
        //}
      }}
    }
    //println(max[0],brightness(blur.pixels[x+y*sobel.width]));
    int p2 = (int)max[1] + (int)max[2] * sobelG.width;
    //if(p2
    //println((int)max[0],(int)max[1],x,y);
    float cGradient = brightness(sobelG.pixels[p]);
    //if(max[0]>=brightness(blur.pixels[x+y*sobel.width])||(cGradient==-1/myGradient||cGradient==PI-(-1/myGradient)))k=true;
    boolean k2 = false;
    float r = red(blur.pixels[p]);
    float g = green(blur.pixels[p]);
    float b = blue(blur.pixels[p]);
    float b1 = brightness(blur.pixels[p]);
    float r1 = red(blur.pixels[p2]);
    float g1 = green(blur.pixels[p2]);
    float b2 = blue(blur.pixels[p2]);
    float b3 = brightness(blur.pixels[p2]);
    float t = 0;
    if(abs(r-r1)<t||abs(g-g1)<t||abs(b-b2)<t||abs(b1-b3)<t)k2 = true;
    
    //if(max[0]<=brightness(blur.pixels[x+y*sobel.width])||(cGradient==-1/myGradient||cGradient==PI-(-1/myGradient))||k2)k=true;
    if(max[0]<=brightness(blur.pixels[x+y*sobel.width])&&(cGradient!=-1/myGradient&&cGradient!=PI-(-1/myGradient)))k=true;
    //if(max[0]<=brightness(blur.pixels[x+y*sobel.width])||(cGradient==myGradient))k=true;
    //if(max[0]<=brightness(blur.pixels[x+y*sobel.width]))k=true;
    return k;
  };
  
  public void displayWF(String []s){
    logic();
    workflow(s);
    if(imagesWF.size()>0)
    image(imagesWF.get(counter),ix,iy);
    text(workFlowLabels.get(counter),10,10);
  };
  
  public void displayWF2(String []s){
    logic2();
    workflow(s);
    
    //if(imagesWF.size()>0)
    image(imagesWF.get(counter),0,0);
    //if(pmouseX!=mouseX){
    //  cell.canny.loadPixels();
    //  for(int i=0;i<cell.edges.size();i++){
    //    //cell c0 = cell.edges.get(i).get(0);
    //    //fill(0);
    //    //text(i,c0.x+10,c0.y);
    //    if(cell.edges.get(i).size()>edgeLength){
    //      for(int j=0;j<cell.edges.get(i).size();j++){
    //      cell c = cell.edges.get(i).get(j);
    //      cell.canny.pixels[(int)c.x+(int)c.y*img.width] = color(0);
    //      }
    //    }else{
    //      for(int j=0;j<cell.edges.get(i).size();j++){
    //      cell c = cell.edges.get(i).get(j);
    //      cell.canny.pixels[(int)c.x+(int)c.y*img.width] = color(255);
    //      }
    //    }
    //  }
    //  cell.canny.updatePixels();
    //}
    //if(cell.update&&cell.edges.size()>0)
    //for(int j=0;j<cell.edges.get(counter).size();j++){
    //  cell c = cell.edges.get(counter).get(j);
    //  //pixels[(int)c.x+(int)c.y*img.width] = color(0);
    //  stroke(0);
    //  point(c.x,c.y);
    //}
    
    for(int j=0;j<cell.cells.size();j++){
      
    }
    
    cell c = cell.unsortedEdges.get(counter);
    stroke(0);
    //point(c.x,c.y);
    //c.debug();
    //for(int j=0;j<cell.neighbours.size();j++){
    //  cell c1 = cell.neighbours.get(i);
      
    //}
    //updatePixels();
  };
  
  public void displayWF(){
    logic2();
      //for(int i=0;i<cell.edges.size();i++){
      //  if(cell.edges.get(i).size()>edgeLength){
      //    for(int j=0;j<cell.edges.get(i).size();j++){
      //      cell c = cell.edges.get(i).get(j);
      //      stroke(0);
      //      point(c.x,c.y);
      //    }
      //  }
      //}
    
    
    for(int j=0;j<cell.edges.get(counter).size();j++){
      cell c = cell.edges.get(counter).get(j);
      stroke(0);
      point(c.x,c.y);
    }
  };
  
  public void displayWFCanvas(String []s){
    logic();
    workflow2(s);
    //if(imagesWF.size()>0)image(imagesWF.get(imagesWF.size()-1),x,y);
    
    //if(imagesWF.size()>0)
    //image(imagesWF.get(counter),x,y);
    
  };
  
  public void logic(){
    int count = 0;
    if(mousePressed&&!mdown){
      mdown = true;
      counter++;
      
    }
    
    if(counter<imagesWF.size()){
      if(imagesWF.get(counter).width>width){
        if(mouseX>0&&mouseX<width)ix = -(int)map(mouseX,0,width,0,imagesWF.get(counter).width-width);
      }
      if(imagesWF.get(counter).height>height){
        if(mouseY>0&&mouseY<height)iy = -(int)map(mouseY,0,height,0,imagesWF.get(counter).height-height);
      }
    }
    
    if(!mousePressed){
      mdown = false;
      m2down = false; 
    }
    if(counter>imagesWF.size()-1)counter = 0;
    if(imagesWF.size()>0&&mdown&&!m2down){
      m2down = true;
      println(workFlowLabels.get(counter),imagesWF.size());
      
    }
    
  };
  
  public void logic2(){
    //if(mousePressed&&!mdown){
    //  mdown = true;
    //  counter++;
    //  println(counter);
    //}
    
    if(mouseX>0)counter = (int)map(mouseX,0,width,0,imagesWF.size());
    //if(mouseX>0)counter = (int)map(mouseX,0,width,0,cell.edges.size());
    
    if(!mousePressed)mdown = false;
    //if(counter>cell.edges.size()-1)counter = 0;
    fill(0);
    text("c "+counter,10,20);
  };
  
  public void canny2(int mode,float t1,int t2) {
    canny = new PImage(img.width, img.height, RGB);
    
    //cell = new cell();
    cell.Mode = mode;
    cell.pixelThresh = 20000;
    cell.pixelThresh1 = t2;
    cell.cutoff = t1;
    //cell.maxT = 100;
    //cell.minT = 50;
    //cell.pixelThresh1 = 20;
    cell.imgUpdate(img);
    cell.getContour3();
    imagesWF.add(cell.canny);
    imagesWF.add(cell.backup);
    //imagesWF.add(cell.img);
  };
  
  public void canny(int mode,float t1) {
    canny = new PImage(img.width, img.height, RGB);
    
    //cell = new cell();
    cell.Mode = mode;
    cell.pixelThresh = 20000;
    cell.pixelThresh1 = 0;
    cell.cutoff = t1;
    //cell.maxT = 100;
    //cell.minT = 50;
    //cell.pixelThresh1 = 20;
    cell.imgUpdate(img);
    cell.getContour();
    imagesWF.add(cell.canny);
    //imagesWF.add(cell.backup);
    //imagesWF.add(cell.img);
  };
  
  public void canny(int mode,float t1,int t2) {
    canny = new PImage(img.width, img.height, RGB);
    
    //cell = new cell();
    cell.Mode = mode;
    cell.pixelThresh = 20000;
    cell.pixelThresh1 = t2;
    cell.cutoff = t1;
    //cell.maxT = 100;
    //cell.minT = 50;
    //cell.pixelThresh1 = 20;
    cell.imgUpdate(img);
    cell.getContour4();
    imagesWF.add(cell.canny);
    //imagesWF.add(cell.backup);
    //imagesWF.add(cell.img);
  };
  
  public void canny(int mode,float t1,int t2,int t3) {
    canny = new PImage(img.width, img.height, RGB);
    
    //cell = new cell();
    cell.Mode = mode;
    cell.pixelThresh = t3;
    cell.pixelThresh1 = t2;
    cell.cutoff = t1;
    //cell.maxT = 100;
    //cell.minT = 50;
    //cell.pixelThresh1 = 20;
    //imagesWF.add(img);
    cell.imgUpdate(sobel);
    imagesWF.add(sobel);
    cell.getContour();
    imagesWF.add(cell.canny);
    //imagesWF.add(cell.backup);
    //imagesWF.add(cell.img);
  };
  
  public void cannySP(){
    if(update){
      canny = new PImage(img.width,img.height);
      c1.beginDraw();
      //println(s_mult);
      //Canny.set("u_mult",s_mult);
      c1.shader(Canny);
      c1.image(img, 0, 0);
      c1.endDraw();
      update=false;
      imagesWF.add(canny);
      //println(red(img.pixels[1000]),red(sobel.pixels[1000]));
      //sobel = c1.get();
    }
  };
  
  public void cannyTrim(int type,float t){
    if(cannyT== null) cannyT = new PImage(img.width,img.height,ARGB);
    CannyTrim.set("type",(float)type);
    t = map(t,0,255,0,1);
    CannyTrim.set("thresh",t);
    if(update){
      c1.beginDraw();
      c1.shader(CannyTrim);
      c1.image(img,0,0);
      c1.endDraw();
      update = false;
    }
    cannyT = c1.get();
    imagesWF.add(cannyT);
      
  };
  
  public void cannyTrim(int type,int t){
    if(cannyT== null) cannyT = new PImage(img.width,img.height,ARGB);
    CannyTrim.set("type",(float)type);
    float t1 = map(t,0,255,0,1);
    CannyTrim.set("thresh",t1);
    if(update){
      c1.beginDraw();
      c1.shader(CannyTrim);
      c1.image(img,0,0);
      c1.endDraw();
      update = false;
    }
    cannyT = c1.get();
    imagesWF.add(cannyT);
      
  };
  
  public void cannyTrim(int type,int t,int t1){
    if(cannyT== null) cannyT = new PImage(img.width,img.height,ARGB);
    CannyTrim.set("type",(float)type);
    float t2 = map(t,0,255,0,1);
    CannyTrim.set("thresh",t2);
    println(t1);
    t2 = map(t1,0,255,0,1);
    CannyTrim.set("thresh2",t2);
    if(update){
      c1.beginDraw();
      c1.shader(CannyTrim);
      c1.image(img,0,0);
      c1.endDraw();
      update = false;
    }
    cannyT = c1.get();
    imagesWF.add(cannyT);
      
  };
  
  public void cannyTrim2(int mode){
    if(cannyT== null) cannyT = new PImage(img.width,img.height,ARGB);
    CannyTrim1.set("Mode",mode);
    if(update){
      c1.beginDraw();
      c1.shader(CannyTrim1);
      c1.image(img,0,0);
      c1.endDraw();
      update = false;
    }
    cannyT = c1.get();
    imagesWF.add(cannyT);
      
  };
  
  public void superPixel(){
    img.loadPixels();
    for(int j=0;j<img.pixels.length;j++){
      
      //if(red(img.pixels[j])<200)img.pixels[j] = color(255,0,0);
      if(color(img.pixels[j])==color(0))img.pixels[j] = color(255,0,0);
    }
    img.updatePixels();
  };
};


// This function returns all the files in a directory as an array of Strings  
public String[] listFileNames(String dir) {
  File file = new File(dir);
  if (file.isDirectory()) {
    String names[] = file.list();
    return names;
  } else {
    // If it's not a directory
    return null;
  }
};

public ArrayList<String> trimNames(String []dir) {
  ArrayList<String> temp = new ArrayList<String>();
  if(dir==null)return null;

  for (int i=0; i<dir.length; i++) {
    int count = 0;
    String s = dir[i];
    for (int j=0; j<dir[i].length(); j++) {

      char t = dir[i].charAt(j);

      if ((t=='.'&&j==0)||t=='{')count ++;
    }
    if (count==0&&s!="")temp.add(s);
  }

  return temp;
};

// This function returns all the files in a directory as an array of File objects
// This is useful if you want more info about the file
public File[] listFiles(String dir) {
  File file = new File(dir);
  if (file.isDirectory()) {
    File[] files = file.listFiles();
    return files;
  } else {
    // If it's not a directory
    return null;
  }
};

// Function to get a list of all files in a directory and all subdirectories

public ArrayList<File> listFilesRecursive(String dir) {
  ArrayList<File> fileList = new ArrayList<File>(); 
  recurseDir(fileList, dir);
  return fileList;
}

// Recursive function to traverse subdirectories
public void recurseDir(ArrayList<File> a, String dir) {
  File file = new File(dir);
  if (file.isDirectory()) {
    // If you want to include directories in the list
    a.add(file);  
    File[] subfiles = file.listFiles();
    for (int i = 0; i < subfiles.length; i++) {
      // Call this function on all files in this directory
      recurseDir(a, subfiles[i].getAbsolutePath());
    }
  } else {
    a.add(file);
  }
};
class Input{
  float x,y,w = 100,h = 100,sSize = 8;
  ArrayList<ArrayList<PVector>> points = new ArrayList<ArrayList<PVector>> ();
  boolean mdown, update,onExit,exit,complete,debug;
  
  int xmin = 1000,ymin = 1000,xmax,ymax,output,nxOffset = 20,pxOffset = 20,nyOffset = 10,pyOffset = 10;
  PImage image,croppedImage;
  int col = 0,col1 = 255;
  Card card;
  
  Input(float x,float y){
    
    this.x = x;
    this.y = y;
    
  };
  
  public void logic(){
    
    if(mousePressed&&pos()&&!mdown){
      mdown = true;
      points.add(new ArrayList<PVector>());
    }
    
    if(mousePressed&&pos()&&mdown)onExit = false;
    
    if(mdown&&!pos()&&!onExit){
      points.add(new ArrayList<PVector>());
      onExit = true;
      complete = false;
    }
    if(mdown&&!mousePressed){
      update = true;
      mdown = false;
      exit = false;
      onExit = false;
    }
    if(points.size()==0)neuralnet.data.input = null;
    if(!pos()&&mousePressed&&!neuralnet.test.pos()){
       xmin = 1000;ymin = 1000;xmax = 0;ymax = 0; 
       croppedImage = null;
    }
  };
  
  public void getPoints(){
    logic();
    if(mdown&&pos()){
      float x1 = mouseX;
      float y1 = mouseY;
      float x2 = pmouseX;
      float y2 = pmouseY;
    
    if(x1!=x2||y1!=y2){
      points.get(points.size()-1).add(new PVector(x1,y1));
    }
    else if(points.get(points.size()-1).size()==0){
      points.get(points.size()-1).add(new PVector(x1,y1));
    }}
    
    if(!pos()&&mousePressed&&!mdown&&!neuralnet.reset.pos()&&!neuralnet.test.pos()){
      //points = new ArrayList<ArrayList<PVector>>();
      //complete = false;
    }
    if(neuralnet.reset.pos()&&mousePressed){
      complete = false;
      points = new ArrayList<ArrayList<PVector>>();
      image = null;
    }
  };
  
  public void draw(){
    
    getPoints();
    strokeWeight(1);
    fill(col);
    noStroke();
    stroke(col1);
    rect(x-1,y-1,w+2,h+2);
    
    if(points.size()>0){
      
     strokeWeight(sSize);
     stroke(col1);
     
     for(int i=0;i<points.size();i++){
       if(points.get(i).size()>1){
         for(int j=0;j<points.get(i).size()-1;j++){
         PVector p = points.get(i).get(j);
         PVector p1 = new PVector(-1,-1);
         if(i<points.size())p1 = points.get(i).get(j+1);
         line(p.x,p.y,p1.x,p1.y);
         
         }}else if(points.get(i).size()==1){
             PVector p = points.get(i).get(0);
             point(p.x,p.y);
             int loc = (int)p.x-(int)x + ((int)p.y - (int)y)*(int)w;
     }}}
     
     if(update||mdown){
       
     image = createImage(PApplet.parseInt(w),PApplet.parseInt(h),RGB);
     image.loadPixels();
     loadPixels();
     
     for(int i=0;i<h;i++){
       for(int j=0;j<w;j++){
         
         int p = j+i*(int)w;
         int p1 = (int)x+(int)y*width+j+i*width;
         
         image.pixels[p] = pixels[p1];
       }}
       image.updatePixels();
       
     }
     crop();
  };
  
  public void crop(){
    fill(255);
    if(image!=null){
      
      for(int i=0;i<h;i++){
        for(int j=0;j<w;j++){
          
          int p = j+i*(int)w;
          int c = color(image.pixels[p]);
          
          if(red(c)==col1){
            //if(xmin > (int)x+j)xmin = (int)x+j;
            //if(ymin > (int)y+i)ymin = (int)y+i;
            
            //if(xmax < (int)x+j)xmax = (int)x+j;
            //if(ymax < (int)y+i)ymax = (int)y+i;
            
            //if(xmin > j)xmin = j;
            //if(ymin > i)ymin = i;
            
            //if(xmax < j)xmax = j;
            //if(ymax < i)ymax = i;
            
            if(xmin > j )xmin = j;
            
            if(ymin > i )ymin = i;
            
            if(xmax < j )xmax = j;
            
            if(ymax < i )ymax = i;
            
          }}}
          
         if(debug){
           image(image,200,0);
           
           strokeWeight(7);
           stroke(0,255,0);
           point( xmin+200,ymin);
           stroke(255,0,0);
           point( xmax+200,ymax);
           fill(255);
           int c = 0;
           if((mouseX+mouseY*width)<pixels.length)c = pixels[mouseX+mouseY*width];
           fill(0);
           text(red(c),300,100);
           text(xmin,300,110);
           text(xmax,300,120);
         }
         if(update&&points.size()>0){
           xmin -= nxOffset;
           ymin -= nyOffset;
           xmax += pxOffset;
           ymax += pyOffset;
           if(xmax>xmin){
             if(ymax > ymin)croppedImage = createImage(xmax - xmin,ymax - ymin,RGB);
             else croppedImage = createImage(xmax - xmin,ymin - ymax ,RGB);
           }else{
             if(ymax > ymin)croppedImage = createImage(xmin - xmax,ymax - ymin  ,RGB);
             else croppedImage = createImage(xmin - xmax,ymin - ymax ,RGB);
           }
        
        croppedImage.loadPixels();
        
        for(int i=ymin;i<ymax;i++){
          for(int j=xmin;j<xmax;j++){
            
            int p = (j-xmin) + (i-ymin) * (croppedImage.width);
            int p1 = j + i * (int)w;
            
            if(p<croppedImage.pixels.length&&p1<image.pixels.length&&p>=0&&p1>=0)croppedImage.pixels[p] = image.pixels[p1];
        }}
        update = false;
        complete = false;
      }
        
        if(croppedImage!=null&&!complete){
          int k = 28;
          croppedImage.resize(k,k);
          complete = true;
        }
        if(croppedImage!=null&&debug){
          stroke(col1);
          noFill();
          strokeWeight(1);
          rect(199,99,15,15);
          image(croppedImage,200,100);
        }
    }
  };
  
  public boolean pos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  };
};
class Neuron {

  Neuron [] inputs; // Strores the neurons from the previous layer
  float [] weights,biases;
  float output,error,errorW,errorB,bias;
  float [] outputs;

  Neuron() {
  }

  Neuron(Neuron [] p_inputs) {

    inputs = new Neuron [p_inputs.length];
    weights = new float [p_inputs.length];
    biases = new float [p_inputs.length];
    bias = random(-1.0f, 1.0f);
    
    error = 0.0f;
    errorB = 0.0f;
    errorW = 0.0f;
    
    for (int i = 0; i < inputs.length; i++) {
      
      inputs[i] = p_inputs[i];
      weights[i] = random(-1.0f, 1.0f);
      biases[i] = random(-1.0f, 1.0f);
    }
  };

  public void respond() {

    float input = 0.0f;
    float bias = 0.0f;
    for (int i = 0; i < inputs.length; i++) {
      
      input += inputs[i].output * weights[i] + biases[i];
    }
    output = lookupSigmoid(input);
    error = 0.0f;
  };
  
  public void respondDeep(){
    float input = 0.0f;
    float bias = 0.0f;
    for (int i = 0; i < inputs.length; i++) {
      input += inputs[i].output * weights[i] + biases[i];
    }
    output = lookupSigmoid(input);
    error = 0;
  };
  
  public void setError(float desired) {
    error = desired - output;
  };

  public void train() {

    float delta = (1.0f - output) * (1.0f + output) * error * LEARNING_RATE;
    
    for (int i = 0; i < inputs.length; i++) {
      
      inputs[i].error += (weights[i] )* error;
      weights[i] += (inputs[i].output ) * delta;
    }
  };

  public void display() {
    stroke(200);
    rectMode(CENTER);
    fill(128 * (1 - output));
    rect(0, 0, 16, 16);
  };
  
};
class Box{
  float x,y,w,h;
  
  
  Box(float xx,float yy,float ww,float hh){
    
  }
  
  
};
public void Reset(){
  //if(yes.toggle==1)text("hello",100,100);
  boolean mdown = false;
  
  if(file.items.get(6).toggle==1&&file.items.get(6).parent.toggle==1){
    fill(255,150);
    rect(0,0,width,height);
    reset_dialogue.toggle = 1;
    reset_dialogue.draw();
    mdown = true;
    if(mousePressed && !reset_dialogue.pos()&&! file.items.get(6).pos()){
      reset_dialogue.toggle = 0;
      file.items.get(6).toggle = 0;
    }
  }
  if(no.toggle==1){
    file.items.get(6).toggle = 0;
    no.toggle=0;
    file.toggle = 0;
  }
  
  if(yes.toggle==1){
    //file.toggle =0;
    BMS = new BMScontrols(this);
    horizontaltabs tab = null;
    windows = new ArrayList<Window>();
    menus = new ArrayList<Menu>();
    textboxes = new ArrayList<TextArea>();
    buttons = new ArrayList<Button>();
    Sliders = new ArrayList<Slider>();
    qgrid = new ArrayList<Quad>();
    gcam = null;
    g = null;
    gimg = null;
    Runtime.getRuntime().gc();
    //scenes = new ArrayList<Scene>();
    attractors = new Attractor();
    int W = 1200, H = 660,gw = 10,gh = 10;
    gridtype = false;
    float kkkk = 0.1f, gW = (W)/PApplet.parseFloat(gw), gH = H/PApplet.parseFloat(gh);;
    Button btn1,btn2,btn3,reset,attractor;
    Button grav;
    noiseSeed(PApplet.parseInt(random(1000000)));
    Grid g;
    TextArea textb1;
    Plot_2D plot;
    Menu file;
    Entity humans;
    Entity plants;
    Entity mineral;
    Entity metal;
    entities = new ArrayList<Entity>();
    
    BMS.begin();
    tabsetup();
    
    //spawnRaces("human",3,60);
  }
};
int nn = 4000;
float [] g_sigmoid = new float [nn];

public void setupSigmoid() {
  
  for (int i = 0; i < nn; i++) {
    float x = (i / 2.0f) - 5.0f;
    g_sigmoid[i] = 2.0f / (1.0f + exp(-2.0f * x)) - 1.0f;
  }
};

// once the sigmoid has been set up, this function accesses it:
public float lookupSigmoid(float x) {
  
  return g_sigmoid[constrain((int) floor((x + 5.0f) * 2.0f), 0, nn-1)];
};
class sliderBox{
  
  float x,y,w,h,vspacing,hspacing;
  int id;
  Slider sliderR,sliderB,sliderG;
  ArrayList<Slider> sliders = new ArrayList<Slider>();
  String type;
  PVector mouse,mouse2;
  boolean vertical, horizontal = true,draggable,saved,tdown,mdown,visible = true,parentCanvas,t2down;
  Menu menu;
  Menu tooltip;
  tab parentTab;
  fileInput load = new fileInput();
  fileReader read = new fileReader();
  fileOutput save = new fileOutput();
  String savePath = null,itemLabel,label;
  
  sliderBox(float xx, float yy,float ww,float S,int num){
    
    x = xx;
    y = yy;
    w = ww;
    h = (10 + S) * num;
    vspacing = S;
    
    menu = new Menu(x,y,w,h);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    menu.vertical = false;
    
    for(int i=0;i<num;i++){
      float ypos = y + (10 + S) *i;
      Slider a =  new Slider(x ,ypos,w,10);
      a.id = i;
      a.bar = true;
      a.classic = true;
      a.parent = menu;
      a.valuex = a.w/2;
      sliders.add(a);
      menu.sliders.add(a);
    }
    //menu.id = menus.size()-1;
    createTooltip();
  };
  
  sliderBox(float xx, float yy,float ww,float S,String [] Labels){
    
    x = xx;
    y = yy;
    w = ww;
    h = (10 + S) * Labels.length - S;
    vspacing = S;
    
    menu = new Menu(x,y,w,h);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    menu.vertical = false;
    menu.slide = false;
    menu.draggable = true;
    
    for(int i=0;i<Labels.length;i++){
      float ypos = y + (10 + S) *i;
      Slider a =  new Slider(x ,ypos,w,10,Labels[i]);
      a.id = i;
      a.bar = true;
      a.classic = true;
      a.parent = menu;
      a.valuex = a.w/2;
      sliders.add(a);
      menu.sliders.add(a);
    }
    createTooltip();
  };
  
  sliderBox(float xx, float yy,float ww,float S,String [] Labels,tab t){
    
    parentCanvas = true;
    x = xx;
    y = yy;
    w = ww;
    h = (10 + S) * Labels.length - S;
    vspacing = S;
    
    menu = new Menu(x,y,w,h);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    menu.vertical = false;
    menu.slide = false;
    menu.draggable = true;
    
    for(int i=0;i<Labels.length;i++){
      float ypos = y + (10 + S) *i;
      Slider a =  new Slider(x ,ypos,w,10,Labels[i]);
      a.id = i;
      a.tooltip.Width = PApplet.parseInt(t.w);
      a.tooltip.Height = PApplet.parseInt(t.h);
      a.bar = true;
      a.classic = true;
      a.parent = menu;
      a.valuex = a.w/2;
      sliders.add(a);
      menu.sliders.add(a);
    }
    createTooltip();
  };
  
  sliderBox(float xx, float yy,float ww,float S,String Label, String [] Labels,tab t){
    
    parentCanvas = true;
    x = xx;
    y = yy;
    w = ww;
    h = (10 + S) * Labels.length - S;
    vspacing = S;
    
    menu = new Menu(x,y,w,h,Label);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    menu.vertical = false;
    menu.slide = false;
    menu.draggable = true;
    
    for(int i=0;i<Labels.length;i++){
      float ypos = y + 20 + (10 + S) *i;
      Slider a =  new Slider(x ,ypos,w,10,Labels[i]);
      a.id = i;
      a.tooltip.Width = PApplet.parseInt(t.w);
      a.tooltip.Height = PApplet.parseInt(t.h);
      a.bar = true;
      a.classic = true;
      a.parent = menu;
      a.valuex = a.w/2;
      sliders.add(a);
      menu.sliders.add(a);
    }
    createTooltip();
  };
  
  sliderBox(float xx, float yy,float ww,float S,Menu m,String [] Labels){
    
    x = xx;
    y = yy;
    w = ww;
    h = (10 + S) * Labels.length - S;
    vspacing = S;
    
    menu = m;
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    menu.vertical = false;
    
    for(int i=0;i<Labels.length;i++){
      float ypos = y + (10 + S) *i;
      Slider a =  new Slider(x ,ypos,w,10,Labels[i]);
      a.id = i;
      a.bar = true;
      a.classic = true;
      a.parent = menu;
      a.valuex = a.w/2;
      sliders.add(a);
      menu.sliders.add(a);
    }
    createTooltip();
  };
  
  sliderBox(float xx, float yy,float ww,float S,tab t){
    
    parentCanvas = true;
    vspacing = S;
    x = xx;
    y = yy;
    w = ww;
    
    menu = new Menu(x,y,w,h);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = S;
    menu.vertical = false;
    menu.slide = false;
    menu.draggable = true;
    
    createTooltip();
  };
  
  public void createTooltip(){
    String []s1 = {"Reset All","Save","Load","Minimize"};
    tooltip = new Menu(x+w,y-30,40,s1);
    tooltip.items.get(3).toggle = 1;
    //menu.id = menus.size()-1;
    // menus.add(menu);
    //BMS.sliderBoxes.add(this);
    //savePath = "sliderBox" + BMS.sliderBoxes.size();
    save.location = "sliderBox" + BMS.sliderBoxes.size();
    id = BMS.sliderBoxes.size();
  };
  
  public PVector getMouse(PVector m,PVector n){
    
    return new PVector (m.x-n.x,m.y-n.y);
  };
  
  public void draw(){
    //if(visible){
    //menu.sliderBoxP = this;
    //if(tooltip.items.get(3).toggle!=1)
    menu.draw();
    if(t2down&&tooltip!=null)tooltip.draw();
    logic();
    drawToolTip();
    //}
  };
  
  
  public void draw(PGraphics canvas){
    menu.mouse = new PVector(mouseX-parentTab.x,mouseY-parentTab.y);
    menu.parentTab = parentTab;
    menu.setParentCanvas(canvas);
    menu.draw(canvas);
    
    if(tdown&&tooltip!=null){
      tooltip.mouse = new PVector(mouseX-parentTab.x,mouseY-parentTab.y);
      tooltip.setParentCanvas(canvas);
      tooltip.draw(canvas);
    }
    mouse = new PVector(mouseX-parentTab.x,mouseY-parentTab.y);
    logic(canvas);
    drawToolTip(canvas);
  };
  
  public void logic(){
    
    if(menu.draggable&&menu.drag){
      if(tooltip!=null){
        tooltip.x = menu.x + menu.w;
        tooltip.y = menu.y - 50;
      }
      
        for(int i=0;i<sliders.size();i++){
        
        Slider b = sliders.get(i);
        
        b.x = menu.x;
        b.y = menu.y + (b.h + vspacing) * i;
        if(tooltip!=null){
          b.tooltip.x = b.x+b.w+textWidth("0.0000");
          b.tooltip.y = b.y;
        }
      }
          x = menu.x;
          y = menu.y;
    }else{
          menu.x = x;
          menu.y = y;
    }
    
    if(!saved&&!BMS.autoControl){
      }
    if(frameCount%BMS.autoSaveTimeout==0)saved = false;
    else saved = true;
    if(mousePressed&&tooltip!=null&&tooltipPos()&&!t2down&&!mdown&&tooltip.visible){
      tdown = true;
      mdown = true;
    }
    if(mousePressed&&tdown&&!mdown&&tooltip!=null&&!tooltipPos()&&!t2down&&tooltip.visible){
      tdown = false;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    if(tdown&&!mousePressed)t2down = true;
    boolean n = false;
    if(t2down){
      tdown = false;
      if(mousePressed)mdown = true;
      if(tooltip!=null&&tooltip.items.get(0).pos()&&mousePressed){
        mdown = true;
        for(int i=0;i<menu.sliders.size();i++){
          Slider s = menu.sliders.get(i);
          
          s.value = 0;
          s.valuex = s.w/2;
          
          if(s.Link!=null){
                  Field field = null;
                try{
                     field = s.Link.getClass().getField(s.control); 
                     field.set(s.Link, 0); 
                }catch (NullPointerException e) {
                }catch (NoSuchFieldException e) {
                }catch (IllegalAccessException e) {
                } 
          }}t2down = false; }

          if(tooltip.items.get(1).pos()&&mousePressed)save();
          
          if(tooltip.items.get(2).pos())load.listen1();
          
          if(!mousePressed &&mdown) t2down = false;

          tooltip.toggle2(3,menu,"show");
          if(mousePressed&&!tooltipPos())t2down = false;
          }
        
  };

  public void logic(PGraphics canvas){
    
    if(menu.draggable&&menu.drag){
      if(tooltip!=null){
        tooltip.x = menu.x+menu.w;
        tooltip.y = menu.y - 50;
      }
        //menu.spacing = vspacing;
        for(int i=0;i<sliders.size();i++){
        
        Slider b = sliders.get(i);
        
        b.x = menu.x;
        b.y = menu.y + (b.h + vspacing) * i;
        if(tooltip!=null){
          b.tooltip.x = b.x+b.w+textWidth("0.0000");
          b.tooltip.y = b.y;
        }
        
      }}
    if(!saved&&!BMS.autoControl){
      }
    if(frameCount%BMS.autoSaveTimeout==0)saved = false;
    else saved = true;
    if(tooltip!=null&&mousePressed&&!tdown&&!mdown&&tooltipPos(mouse)&&!t2down){
      tdown = true;
      mdown = true;
    }
    if(tooltip!=null&&mousePressed&&tdown&&!mdown&&!tooltipPos(mouse)&&!t2down){
      tdown = false;
      mdown = true;
    }
    if(!mousePressed)mdown = false;
    if(tdown&&!mousePressed&&!t2down)t2down = true;
    if(t2down){
      
      if(tooltip!=null&&tooltip.items.get(0).pos(mouse)&&mousePressed){
        mdown = true;
        for(int i=0;i<menu.sliders.size();i++){
          Slider s = menu.sliders.get(i);
          
          s.value = 0;
          s.valuex = s.w/2;
          
          if(s.Link!=null){
                  Field field = null;
                try{
                     field = s.Link.getClass().getField(s.control); 
                     field.set(s.Link, 0); 
                }catch (NullPointerException e) {
                }catch (NoSuchFieldException e) {
                }catch (IllegalAccessException e) {
                }}}
          t2down = false;
        }
        if(tooltip.items.get(1).pos(mouse)&&mousePressed){
            save();
            t2down = false;
          }
          if(tooltip.items.get(2).pos(mouse)){
            
            load.listen1();
            if(mousePressed &&!mdown) t2down = false;
          }

          tooltip.toggle2(3,menu,"show");
          if(mousePressed&&!tooltipPos(mouse))t2down = false;
        }
        if(t2down&&tooltip!=null&&!tooltip.items.get(0).pos(mouse)&&mousePressed)t2down = false;
  };
  
  public void drawToolTip(PGraphics canvas){
    if(tooltip!=null&&tooltipPos(mouse)&&!tdown&&!t2down&&tooltip.visible){
      canvas.noStroke();
      canvas.fill(0,150);
      canvas.rect(menu.x+menu.w,menu.y-50,50,50);
    }
  };
  
  public void drawToolTip(){
    if(!tdown&&tooltip!=null&&tooltipPos()&&!t2down&&tooltip.visible){
      noStroke();
      fill(0,150);
      rect(menu.x+menu.w,menu.y-50,50,50);
    }
  };
  
  public void add(Slider s,float spacing){
    
    vspacing = spacing;
    menu.spacing = spacing;
    s.valuex = w/2;
    menu.add(s,spacing);
    h = (s.h+spacing)*menu.sliders.size();
    
    menu.h = h;
  };
  
  public void add(Slider s){
    
    s.valuex = w/2;
    menu.add(s);
    h = (s.h+vspacing)*menu.sliders.size();
    
    menu.h = h;
  };

  public void set(int i,float v){
    menu.sliders.get(i).parent = this.menu;
    menu.sliders.get(i).value = v;
  };
  
  public void save(){
    if(save.location!=null){
      save.checkLocation(save.location);
      save.open();
      for(int i=0;i<sliders.size();i++){
            
          Slider s = sliders.get(i);
          save.write((s.value));
      }
      save.close();
    }
  };
  
  public void load(){
    for(int i=0;i<read.text.length;i++){
      String s = read.text[i];
      Slider s1 = sliders.get(i);
      if(i<sliders.size()) sliders.get(i).value = PApplet.parseFloat(s);

    }
  };
  
  public void display(String a){
    
    if(a=="vertical"|| a== "Vertical"){
      float k = 0;
      menu.vertical = true;
      k = menu.h;
      menu.h = menu.w ;
      h = w;
      menu.w = k;
      w = k;
      
      for(int i=0;i<sliders.size();i++){
        
        Slider b = sliders.get(i);
        
        //b.horizontal = false;
        k = b.w;
        b.w = b.h;
        b.h = k;
        k = b.btnw;
        b.btnw = b.btnh;
        b.btnh = k;
      }
    }
    
  };
  
  public void set(int b, String a){
    
    if(b==menu.sindex)menu.sliders.get(b).label = a;
  };
  
  public void set(int a,int b, int c){
    menu.sliders.get(a).parent = this.menu;
    if(a==menu.sindex)menu.sliders.get(a).set(b,c);
  };
  
  public float get(int a){
    
    return menu.sliders.get(a).value;
  };
  
  public int getint(int a){
    
    return floor(menu.sliders.get(a).value);
  };
  
  public void set(int a, float b,float c,Object o, String variable){
    menu.sliders.get(a).parent = this.menu;
    menu.sliders.get(a).parentObject = o;
    menu.sliders.get(a).parentVar = variable;
    menu.sliders.get(a).functionId = 0;
    menu.sliders.get(a).startvalue = b;
    menu.sliders.get(a).endvalue = c;
    if(a==menu.sindex)menu.sliders.get(a).set(b,c,o,variable);
  };
  
  public void set(int a, float b,float c,Object o, String variable,String n){
    if(a==menu.sindex){
      menu.sliders.get(a).parent = this.menu;
      menu.sliders.get(a).parentObject = o;
      menu.sliders.get(a).parentVar = variable;
      menu.sliders.get(a).functionId = 1;
      menu.sliders.get(a).startvalue = b;
      menu.sliders.get(a).endvalue = c;
      menu.sliders.get(a).set(b,c,o,variable,n);
    }
  };
  
  public void setint(int a, int b,int c,Object o, String variable){
    if(a==menu.sindex){
      menu.sliders.get(a).parent = this.menu;
      menu.sliders.get(a).parentObject = o;
      menu.sliders.get(a).parentVar = variable;
      menu.sliders.get(a).functionId = 2;
      menu.sliders.get(a).startvalue = b;
      menu.sliders.get(a).endvalue = c;
      menu.sliders.get(a).setint(b,c,o,variable);
    }
  };
  
  public void setint(int a, int b,int c){
    if(a==menu.sindex){
      menu.sliders.get(a).parent = this.menu;
      menu.sliders.get(a).functionId = 3;
      menu.sliders.get(a).startvalue = b;
      menu.sliders.get(a).endvalue = c;
      menu.sliders.get(a).setint(b,c);
    }
  };
  
  public void setint(int a, int b,int c,Object o, String variable,String n){
    //if(visible)
    //menu.sliders.get(a).setint(b,c,o,variable,n);
  };
  
  public void set(int a, String b, String c){
    
    if(b == "Classic" || b == "classic"){
      if(c == "Bar" || c =="bar"){
        menu.sliders.get(a).classic = true;
        menu.sliders.get(a).bar = true;
        menu.sliders.get(a).radio = false;
        menu.sliders.get(a).square = false;
      }
      
      if(c == "Radio" || c =="radio"){
        menu.sliders.get(a).classic = true;
        menu.sliders.get(a).bar = false;
        menu.sliders.get(a).radio = true;
        menu.sliders.get(a).square = false;
      }
      
      if(c == "Square" || c =="square"){
        menu.sliders.get(a).classic = true;
        menu.sliders.get(a).bar = false;
        menu.sliders.get(a).radio = false;
        menu.sliders.get(a).square = true;
      }}
      
      //menus.remove(menu.id);
      //menu.add(
  };
  
  //void draw2(){
    
  //  fill(255);
  //  text("hello",100,100);
    
  //};
  
  
  public void set(int c, Grid_space a, String b,float d, float e){
    //sliders.get(c).slide(float d,float e, 
  };
  
  public void set(Entity a, String b){
    
  };
  
  public void set(Window a, String b){
    
  };
  
  public void set(Menu a, String b){
    
  };
  
  public void set(Boundary a, String b){
    
  };
  
  public void set(Plot_2D a, String b){
    
  };
  
  public void setbg(){
    
  };
  
  public void setDrag(Boolean a){
    menu.draggable = a;
  };
  
  public boolean pos(){
    return mouseX>menu.x&&mouseX<menu.x+menu.w&&mouseY>menu.y&&mouseY<menu.y+menu.w;
  }
  
  public boolean tooltipPos(){
    return mouseX>menu.x+menu.w&&mouseX<menu.x+menu.w+50&&mouseY>menu.y-50&&mouseY<menu.y;
  };
  
  public boolean tooltipPos(PVector m){
    return m.x>menu.x+menu.w&&m.x<menu.x+menu.w+50&&m.x>menu.y-50&&m.x<menu.y;
  };
};
class SliderGrid{
  float x,y,w,h;
  ArrayList<Slider> sliders = new ArrayList<Slider>();
  String itemLabel;
  
  SliderGrid(float X,float Y,float W,float H,String[] Labels,int cols,int rows){
    
    x = X;
    y = Y;
    w = W;
    h = H;
    
    float ww = W/cols;
    float hh = H/cols;
    
    for (int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        
        int pos = j+i*cols;
        
        String label = null;
        if(pos<Labels.length){
        
          label = Labels[pos];
        Slider s = new Slider(x+ww*j,y+hh*i,ww-30,10,label);
        sliders.add(s);
        
    }}}
  };
    
    public void draw(){
     for(int i=0;i<sliders.size();i++){
       Slider s = sliders.get(i);
       
       s.draw();
     }
    
  };
  
  
  
};
class rgb_Slider{
  
  float x,y,w,h,vspacing,hspacing;
  Slider sliderR,sliderB,sliderG;
  String type,itemLabel,label;
  boolean vertical, horizontal = true;
  Menu menu;
  
  rgb_Slider(float xx, float yy,float ww,float hh,float S){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    vspacing = S;
    
    menu = new Menu(x,y,w,h);
    menu.highlightable = false;
    menu.visible = false;
    menu.type = 2;
    menu.spacing = vspacing;
    //-------------R-----------------
    sliderR = new Slider(x,menu.y,w,10,"R");
    sliderR.classic = true;
    sliderR.bar = true;
    sliderR.parent = menu;
    sliderR.valuex = x;
    menu.sliders.add(sliderR);
    
    //-------------G-----------------
    sliderG = new Slider(menu.x,menu.y + vspacing * 1,w,10,"G");
    sliderG.classic = true;
    sliderG.bar = true;
    sliderG.parent = menu;
    sliderG.valuex = x;
    menu.sliders.add(sliderG);
    
    //-------------B-----------------
    sliderB = new Slider(menu.x,menu.y + vspacing * 2,w,10,"B");
    sliderB.classic = true;
    sliderB.bar = true;
    sliderB.parent = menu;
    sliderB.valuex = x;
    menu.sliders.add(sliderB);
    menus.add(menu);
    
    
  }
  
  public void draw(){
    //menu.draw();
  }
  
  public void display(String a){
    
    if(a=="vertical"|| a== "Vertical"){
      float k = 0;
      menu.vertical = true;
      
      k = menu.h;
      menu.h = menu.w ;
      h = w;
      menu.w = k;
      w = k;
      
      sliderR.horizontal = false;
      k = sliderR.w;
      sliderR.w = sliderR.h;
      sliderR.h = k;
      k = sliderR.btnw;
      sliderR.btnw = sliderR.btnh;
      sliderR.btnh = k;
      
      sliderG.horizontal = false;
      k = sliderG.w;
      sliderG.w = sliderG.h;
      sliderG.h = k;
      k = sliderG.btnw;
      sliderG.btnw = sliderG.btnh;
      sliderG.btnh = k;
      
      sliderB.horizontal = false;
      k = sliderB.w;
      sliderB.w = sliderB.h;
      sliderB.h = k;
      k = sliderB.btnw;
      sliderB.btnw = sliderB.btnh;
      sliderB.btnh = k;
    }
    
  };
  
  public void set(String a){
    if(a=="radio" || a == "Radio"){
      sliderR.radio = true;
      sliderR.square = false;
      sliderR.bar = false;
      
      sliderG.radio = true;
      sliderG.square = false;
      sliderG.bar = false;
      
      sliderB.radio = true;
      sliderB.square = false;
      sliderB.bar = false;
    }
    if(a=="Bar" || a == "bar"){
      sliderR.radio = false;
      sliderR.square = false;
      sliderR.bar = true;
      
      sliderG.radio = false;
      sliderG.square = false;
      sliderG.bar = true;
      
      sliderB.radio = false;
      sliderB.square = false;
      sliderB.bar = true;
    }
    if(a=="Square" || a == "square"){
      sliderR.radio = false;
      sliderR.square = true;
      sliderR.bar = false;
      
      sliderG.radio = false;
      sliderG.square = true;
      sliderG.bar = false;
      
      sliderB.radio = false;
      sliderB.square = true;
      sliderB.bar = false;
    }
    
    if(a =="color" || a == "Color"){
      sliderR.slidercol = color(255,0,0);
      sliderG.slidercol = color(0,255,0);
      sliderB.slidercol = color(0,0,255);
    }
  };
  
  public void set(Grid_space a, String b){
    
  };
  
  public void set(Entity a, String b){
    
  };
  
  public void set(Window a, String b){
    
  };
  
  public void set(Menu a, String b){
    
  };
  
  public void set(Boundary a, String b){
    
  };
  
  public void set(Plot_2D a, String b){
    
  };
  
  public void setbg(){
    
  };
  
  
};
class tab extends tabBoundary {

  PGraphics canvas,canvas2;
  float x, y, w, h,bx,by,bh,bw;
  int tabindex = -1, state, current,id,Width,Height;
  String label,itemLabel;
  boolean border,open,parentCanvas,overflow,docking,docked,dmdown;
  PVector mouse,mouse2;
  Dock parentDock; 
  
  ArrayList<Grid> grids = new ArrayList<Grid>();
  ArrayList<Grid3D> grids3d = new ArrayList<Grid3D>();
  
  ArrayList<Window> windows = new ArrayList<Window>();
  ArrayList<Button> buttons = new ArrayList<Button>();
  ArrayList<PImage> images = new ArrayList<PImage>();
  ArrayList<PImage> temp_images = new ArrayList<PImage>();
  ArrayList<Image> processedImages = new ArrayList<Image>();
  ArrayList<Menu> menus = new ArrayList<Menu>();
  ArrayList<sliderBox> sliderBoxes = new ArrayList<sliderBox>();
  ArrayList<Dropdown> dmenus = new ArrayList<Dropdown>();
  ArrayList<Table_> tables = new ArrayList<Table_>();
  ArrayList<String> links = new ArrayList<String>();
  
  ArrayList<TextArea> textareas = new ArrayList<TextArea>();
  ArrayList<textBlock> textBlocks = new ArrayList<textBlock>();
  ArrayList<TextBox> textboxes = new ArrayList<TextBox>();
  ArrayList<vectorText> processedText = new ArrayList<vectorText>();
  ArrayList<String[]> temp_text = new ArrayList<String[]>();
  ArrayList<processing.data.Table> temp_tables = new ArrayList<processing.data.Table>();
  String folder = "";
  String file = "";
  HashMap<String, Boolean> keys = new HashMap<String, Boolean>();

  ArrayList<Boolean> bools = new ArrayList<Boolean>();
  PVector window = new PVector(0, 0);
  Slider sliderv;
  Slider sliderh;
  tab navigator;
  verticaltabs navigatorv;
  horizontaltabs navigatorh;
  tab child, parent,parentTab;
  tab current_tab, next_tab, previous_tab;


  ArrayList<tab> tabs = new ArrayList<tab>();
  ArrayList<tab> states = new ArrayList<tab>();
  ArrayList<Integer> transitions = new ArrayList<Integer>();
  public boolean visible = true, scrollable,draggable,drag;
  boolean sliderset, displayChild, init, setTab,slidersUpdated;
  Button title;

  tab( float x, float y, float w, float h,int k) {
    
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    //tabs.add(this);
    createConstruct();
    
  };
  
  tab( float x, float y, float w, float h) {
    
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    //tabs.add(this);
    canvas = createCanvas();
    createConstruct();
    
    //this.label = label;this.itemLabel = label;
    //title = new Button(x, y, w, 20, label);
    //title.border = false;
  };
  
  tab( float x, float y, float w, float h,Slider s) {
    
    
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    states.add(this);
    
  };
  
  tab( float x, float y, float w, float h,Boundary b) {
    
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    states.add(this);
    createConstruct2();
    
  };
  
  tab( float x, float y, float w, float h, String label,int k) {
    //super();
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    this.label = label;
    this.itemLabel = label;
    title = new Button(0, 0, w, 20, label);
    title.border = false;

    createConstruct();
  };

  tab( float x, float y, float w, float h, String label) {
    
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    this.label = label;
    this.itemLabel = label;
    title = new Button(0, 0, w, 20, label);
    title.border = false;

    createConstruct();
  };
  
    tab( float x, float y, float w, float h, String label,boolean n) {
    
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    canvas = createCanvas();
    this.label = label;
    this.itemLabel = label;
    title = new Button(0, 0, w, 20, label);
    title.border = false;
    createConstruct();
  };

  tab() {
  };
  
  public void createConstruct(){
    bx = x;
    by = y;
    Window w1 = new Window(83, 80, 200, 200, "C:\\Users\\paul goux\\");
    windows.add(w1);

    sliderv = new Slider(w-10, 20, 10, h-20);
    sliderv.classic = true;
    sliderv.bar = true;
    sliderv.vertical = true;
    sliderv.tooltip = null;
    sliderv.parentCanvas = true;
    sliderv.parentTab = this;
    sliderh = new Slider(0, h-10, w-10, 10);
    sliderh.tooltip = null;
    sliderh.classic = true;
    sliderh.bar = true;
    sliderh.parentCanvas = true;
    sliderh.parentTab = this;

    //Boundaries.add(new Boundary(0, 0, w, h, 4));
    states.add(this);
  };
  
  public void createConstruct2(){

    sliderv = new Slider(w-10, 0, 10, h-10);
    sliderv.classic = true;
    sliderv.bar = true;
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(0, h-10, w-10, 10);
    sliderh.tvisible = false;
    sliderh.classic = true;
    sliderh.bar = true;
    //Boundaries.add(new Boundary(0, 0, w, h, 4));
  };
  
public PGraphics createCanvas() {
  PGraphics pg = createGraphics(PApplet.parseInt(w), PApplet.parseInt(h));
  //pg.setLocation(x, y);
  return pg;
}

public PGraphics createCanvas2() {
  PGraphics pg = createGraphics(PApplet.parseInt(w), PApplet.parseInt(h+50));
  //pg.setLocation(x, y);

 
  return pg;
}

public PGraphics createCanvas(float w,float h) {
  PGraphics pg = createGraphics(PApplet.parseInt(w), PApplet.parseInt(h));
  //pg.setLocation(x, y);
  
 
  return pg;
}

public void setCanvas(tab t){
    if (!sliderh.mdown)sliderv.mouseFunctions(t.mouse);
    // fill(0);
    // ellipse(t.mouse.x,t.mouse.y,20,20);
    sliderv.mouse = mouse;
    sliderv.draw(t.canvas);
    if (!sliderv.mdown)sliderh.mouseFunctions(t.mouse);
    sliderh.mouse = mouse;
    sliderh.draw(t.canvas);

};
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  

  public void displayTab(PGraphics scene) {
    
    tab t = states.get(state);
    
    if (toggle&&canvas!=null) {
      t.mouse = mouse2;
      mouse = mouse2;
      canvas.beginDraw();
      canvas.background(50);
      logic();
      t.drawBorder();
      t.boundingBox();
      
      t.drawButtons();
      t.drawMenus();
      t.drawTextboxes();
      t.drawTextareas();
      t.drawTextBlocks();
      t.drawSliderBoxes();
    if(t.title!=null&&t.visible){
      t.title.toggle=1;
      t.drawTitle();
      t.drawBorder();
      t.drawDmenu();
    }
      //t.drawImages();
    if(t.scrollable)t.drawSlider();
      //t.drawWindows();
      canvas.endDraw();
      scene.image(canvas,x,y);
    }
  };
  
  public void displayTab() {
    fill(255);
    tab t = states.get(state);
    //println(t.menus.size());
    if (toggle&&visible&&canvas!=null) {
      if(!parentCanvas){
        t.mouse = getMouse();
        mouse = getMouse();
      }
      else{
        t.mouse = getMouse();
        mouse = getMouse();
      }
      canvas.beginDraw();
      //canvas.background(50);
      logic();
      t.drawBorder();
      t.boundingBox();
      t.drawButtons();
      t.drawMenus();
      t.drawTextboxes();
      t.drawTextareas();
      t.drawSliderBoxes();
      t.drawTextBlocks();
      if(t.title!=null&&t.visible){
        if(!toggle)t.title.toggle=1;
        t.drawTitle();
        t.drawBorder();
        t.drawDmenu();
      }
      //t.drawWindows();
      if(t.scrollable)t.drawSlider();
      // if(docked){
      //   canvas.fill(0);
      //   canvas.rect(0,0,w,h);
      // }
      canvas.endDraw();
      image(canvas,x,y);
    }
  };

  
  public void displayTabs() {
    
    tab t = states.get(state);
    //println(t.menus.size());
    if (toggle&&t!=null&&canvas!=null) {
      t.mouse = getMouse();
      mouse = getMouse();
      canvas.beginDraw();
      canvas.background(50);
      //for(int i=0;i<states.size();i++){
      //tab t1 = states.get(i);
      
      //if(i!=state&&toggle){
      //  t1.toggle = false;
      //  t1.visible = false;
      //  if(t1.title!=null)t1.title.toggle=1;
      //}else t1.toggle=true;}
      t.logic();
      t.boundingBox();
      t.drawButtons();
      t.drawMenus();
      t.drawTextboxes();
      t.drawTextareas();
      t.drawTable_s();
      //t.displayInnerTabs();
      t.drawText();
      t.drawTitle();
      t.drawBorder();
      t.drawDmenu();
      t.drawSliderBoxes();
      t.drawTextBlocks();
      //t.drawWindows();
    if (t!=null&&t.scrollable&&t.toggle)t.drawSlider();
      
      canvas.endDraw();
      image(canvas,x,y);
    }
  };
  
  public void displayTabs(PGraphics scene) {
    
    tab t = states.get(state);
    
    if (toggle&&t!=null&&canvas!=null) {
      t.mouse = mouse2;
      mouse = mouse2;
      
      canvas.beginDraw();
      
      for(int i=0;i<states.size();i++){
      tab t1 = states.get(i);
      
      if(i!=state&&toggle){
        // t1.toggle = false;
        // t1.visible = false;
        // if(t1.title!=null)t1.title.toggle=1;
      }else t1.toggle=true;}
      t.logic();
      t.boundingBox();
      t.drawButtons();
      t.drawMenus();
      t.drawTextboxes();
      t.drawTextareas();
      t.drawTable_s();
      //t.displayInnerTabs();
      t.drawText();
      t.drawTitle();
      t.drawBorder();
      t.drawDmenu();
      t.drawSliderBoxes();
      t.drawTextBlocks();
    if (t!=null&&t.scrollable&&t.toggle)t.drawSlider();
    
      canvas.endDraw();
      scene.image(canvas,x,y);
      
    }
  };
  
  public void addState(int k){
    if(title==null){
    for(int i=0;i<k;i++){
      states.add(new tab(x,y,w,h));
    }}else{
      for(int i=0;i<k;i++){
      states.add(new tab(x,y,w,h,"hello"+i));
    }}
  };

  public void addState(int k,String[] names){
    if(title==null){
    for(int i=0;i<k;i++){
      states.add(new tab(x,y,w,h));
    }}else{
      for(int i=0;i<k;i++){
      states.add(new tab(x,y,w,h,names[i]));
    }}
  };
  
  public void setTitle(int i,String s){
    tab k = states.get(i);
    
    if(k.title!=null)k.title.label = s;
  };
  
  public void add(int i,Button b){
    //clear();
    tab k = states.get(i);
    b.parentCanvas = true;
    k.buttons.add(b);
  };
  
  public void add(int i,Menu m){
    //clear();
    tab k = states.get(i);
    m.parentCanvas = true;
    k.menus.add(m);
  };
  
  public void add(int i,Dropdown d){
    //clear();
    tab k = states.get(i);
    d.parentCanvas = true;
    k.dmenus.add(d);
  };
  
  public void add(int i,TextBox t){
    //clear();
    tab k = states.get(i);
    t.parentCanvas = true;
    k.textboxes.add(t);
  };
  
  public void add(int i,TextArea t){
    //clear();
    tab k = states.get(i);
    t.parentCanvas = true;
    k.textareas.add(t);
  };

  public void add(int i,textBlock t){
    //clear();
    tab k = states.get(i);
    t.parentCanvas = true;
    k.textBlocks.add(t);
  };
  
  public void add(int i,String s){
    //clear();
    // tab k = states.get(i);
    // k.textblock.add(s);
  };
  
  public void add(int i,Table_ t){
    //clear();
    t.parentCanvas = true;
    tab k = states.get(i);
    k.tables.add(t);
  };
  
  public void add(Button b){
    //clear();
    tab k = states.get(0);
    b.parentCanvas = true;
    k.buttons.add(b);
  };
  
  public void add(Menu m){
    //clear();
    tab k = states.get(0);
    m.parentCanvas = true;
    //m.localCanvas = canvas;
    k.menus.add(m);
  };
  
  public void add(Dropdown d){
    //clear();
    tab k = states.get(0);
    d.parentCanvas = true;
    k.dmenus.add(d);
  };
  
  public void add(TextBox t){
    //clear();
    tab k = states.get(0);
    t.parentCanvas = true;
    k.textboxes.add(t);
  };
  
  public void add(TextArea t){
    //clear();
    tab k = states.get(0);
    t.parentCanvas = true;
    k.textareas.add(t);
  };
  
  public void add(String s){
    //clear();
    tab k = states.get(0);
    //k.textBlocks.add(s);
  };
  
  public void add(Table_ t){
    //clear();
    t.parentCanvas = true;
    tab k = states.get(0);
    k.tables.add(t);
  };
  
  public void add(sliderBox s){
    //clear();
    s.parentCanvas = true;
    tab k = states.get(0);
    k.sliderBoxes.add(s);
  };
  
  public PVector getMouse(){
    return new PVector(mouseX-x,mouseY-y);
  };
  
  public PVector getMouse2(){
    return new PVector(mouseX-x,mouseY-y);
  };
  
  public PVector getMouse(PVector m){
    return new PVector(m.x-x,m.y-y);
  };
  
  public void clear(){
    textboxes = new ArrayList<TextBox>();
    grids = new ArrayList<Grid>();
    grids3d = new ArrayList<Grid3D>();
    textareas = new ArrayList<TextArea>();
    //windows = new ArrayList<Window>();
    buttons = new ArrayList<Button>();
    images = new ArrayList<PImage>();
    temp_images = new ArrayList<PImage>();
    processedImages = new ArrayList<Image>();
    menus = new ArrayList<Menu>();
    dmenus = new ArrayList<Dropdown>();
    tables = new ArrayList<Table_>();
    links = new ArrayList<String>();
    textBlocks = new ArrayList<textBlock>();
    processedText = new ArrayList<vectorText>();
    temp_text = new ArrayList<String[]>();
    temp_tables = new ArrayList<processing.data.Table>();
  };
  
  public void logic() {
    if(!mdown){
      drag = false;
      if(BMS.currentObject == this)BMS.currentObject = null;
    }
    if (navigator!=null)navigator.displayTabs();
    if (scrollable) {
      sliderh.mouse = getMouse();
      if (!sliderh.mdown) {
        //sliderv.mouseFunctions();
        //sliderv.set(-h+20, h-20, this, "window.y");
      }
      //sliderv.mouse = getMouse();
      if (!sliderv.mdown) {
        //sliderh.set(-w+10, w-10, this, "window.x");
        //sliderh.mouseFunctions();
      }
    }
    if(draggable){
      
      drawDragBox();
      if(!sliderv.mdown&&!sliderh.mdown&&title.pos(getMouse())&&mousePressed&&!mdown&&!drag&&BMS.currentObject==null){
        
        BMS.currentObject = this;
        
        if(title.label!=null)BMS.currentMouseObject = title.label;
        println(BMS.currentMouseObject);
        mdown = true;
        docked = false;
        docking = false;
        dx = x - mouseX;
        dy = y - mouseY;
        drag = true;
      }
      
      // if(mdown)drag = true;
      // else {
      //   drag = false;
      //   // BMS.currentObject = null;
      //   // BMS.currentMouseObject = null;
      // }
      
      if(drag){
        x = mouseX+dx;
        y = mouseY+dy;

        if(parentDock!=null&&parentDock.pos(new PVector(x,y))&&!docking){
          docking = true;
          parentDock.loc = itemLabel;
          parentDock.currentObject = this;
        }
      }

      if(!mousePressed&&docking&&!docked){
        //println("docked");
        docked = true;
        docking = false;
        x = bx;
        y = by;
      }
      
      if(!mousePressed)mdown = false;
    }
  };
  
  public void drawSliderBoxes(){
    
    for (int i=states.get(state).sliderBoxes.size()-1;i>-1; i--) {
      
      sliderBox s = null;
      if(states.get(state).sliderBoxes.get(i)!=null){
        s = states.get(state).sliderBoxes.get(i);
        s.mouse = getMouse();
        s.parentTab = this;
        s.draw(canvas);
      }
    }
  };

  public void drawSliderBoxes_(){
    if(mousePressed)println("hh");
    for (int i=states.get(state).sliderBoxes.size()-1;i>-1; i--) {
      
      sliderBox s = states.get(state).sliderBoxes.get(i);
      //s.mouse = getMouse();
      //s.parentTab = this;
      s.draw();
    }
  };

  public void drawSliderBoxes(PGraphics canvas){
      
    if(canvas!=null){
      
      canvas.beginDraw();
      for (int i=states.get(state).sliderBoxes.size()-1;i>-1; i--) {
        
        sliderBox s = states.get(state).sliderBoxes.get(i);
        s.mouse = getMouse();
        s.parentTab = this;
        s.draw(canvas);
      }
      canvas.endDraw();
      }
  };

  public void drawTextBlocks(){
    for (int i=states.get(state).textBlocks.size()-1;i>-1; i--) {
        
      textBlock t = states.get(state).textBlocks.get(i);
      //t.mouse = getMouse();
      //t.parentTab = this;
      t.draw(canvas);
    }
    //canvas.endDraw();

  };

  public void drawTextBlocks(boolean b){
    canvas.beginDraw();
    for (int i=states.get(state).textBlocks.size()-1;i>-1; i--) {
        
      textBlock t = states.get(state).textBlocks.get(i);
      //t.mouse = getMouse();
      //t.parentTab = this;
      t.draw(canvas);
    }
    canvas.endDraw();

  };
  
  public void drawDragBox(){
    
    canvas.fill(0);
    canvas.noStroke();
    if(border)canvas.stroke(255);
    canvas.rect(x,y-5,w,5);
    
  };
  
  public void drawSlider() {
    //canvas.beginDraw();
    canvas.fill(0);
    //canvas.ellipse(getMouse().x,getMouse().y,20,20);
    //canvas.endDraw();
    //image(canvas,x,y);
    sliderv.mouse = getMouse();
    //if(posTab(getMouse())||sliderv.mdown)
    if(!sliderh.mdown)sliderv.mouseFunctions(mouse);
    sliderv.draw(canvas);
    sliderh.mouse = getMouse();
    //if(posTab(getMouse())||sliderh.mdown)
    if(!sliderv.mdown)sliderh.mouseFunctions(mouse);
    sliderh.draw(canvas);

  };

  public void drawText() {
  };

  public void drawDmenu() {
    boolean k = false;
    int id = -1;
    for (int i=states.get(state).dmenus.size()-1;i>-1; i--) {
      Dropdown d = states.get(state).dmenus.get(i);
      
      if(parentTab==null)d.mouse = getMouse();
      else d.mouse = getMouse(mouse);
      if(mousePressed&&!dmdown&&d.toggle==1){
        id=i;
        dmdown = true;
      }
      if(d.toggle==1&&id!=i)d.toggle=0;
      d.displayDropdown(canvas);
      dmdown = false;
    };
  };

  public void scrolllogic() {
  };

  public void drawTitle() {
    canvas.fill(255);
    if(states.size()>0&&state<states.size()&&state>-1){
      if(states.get(state).title!=null){
        states.get(state).title.mouse = mouse;
        states.get(state).title.draw(canvas);
      }}
    
    if(states.size()>0&&state<states.size()&&states.get(state).title!=null)states.get(state).title.toggle2(this, "toggle");
  };
  
  public void drawTitle(PGraphics scene) {
    scene.fill(255);
    if(states.size()>0&&state<states.size()&&state>-1){
      if(states.get(state).title!=null){
        states.get(state).title.mouse = mouse;
        states.get(state).title.draw(scene);
      }}
    
    if(states.size()>0&&state<states.size()&&states.get(state).title!=null)states.get(state).title.toggle2(this, "toggle");
  };
  
  public void drawBorder() {
    if (border) {
      canvas.stroke(255, 200);
      canvas.noFill();
      canvas.rect(0, 0, w, h);
    }
    canvas.noStroke();
  };

  public void boundingBox() {
    if(canvas!=null){
      canvas.noStroke();
      canvas.fill(255);
      
      canvas.rect(0, 0, w, h);
      canvas.fill(0, 50);
      canvas.rect(0, 0, w, h);
    }
  };
  
  public void getFile(){
    PImage t_img ;
    
    Image t_Img;
    String[] t_text;
    processing.data.Table t_table;
    
    ArrayList<Integer> k = new ArrayList<Integer>();
    
    if(file.length()>0){
      if(file.endsWith("jpg")|| file.endsWith("jpeg") ||file.endsWith("png")||file.endsWith("bmp")||
          file.endsWith("gif")||file.endsWith("JPG")||file.endsWith("JPEG")||file.endsWith("PNG")||
          file.endsWith("BMP")||file.endsWith("GIF")){
            
          t_img = loadImage(file);
          if(!temp_images.contains(t_img))temp_images.add(t_img);
          //if(!temp_images.contains(t_img))images.add(t_img);
          Image img = new Image(t_img);
          if(!processedImages.contains(img))processedImages.add(img);
      }
      
      if(file.endsWith("txt")){
            
          t_text = loadStrings(file);
          if(!temp_text.contains(t_text))temp_text.add(t_text);
      }
      
      if(file.endsWith("csv")){
            
          t_table = loadTable(file);
          if(!temp_tables.contains(t_table))temp_tables.add(t_table);
      }
      
      if(file.endsWith("doc")){
            
          t_text = WordStream(file);
          if(!temp_text.contains(t_text))temp_text.add(t_text);
      }
      if(file.endsWith("mp3")|| file.endsWith("aiff") ||file.endsWith("ogg")||file.endsWith("flac")||
          file.endsWith("m4a")||file.endsWith("flac")){
            
          t_table = loadTable(file);
          if(!temp_tables.contains(t_table))temp_tables.add(t_table);
      }
    }
  };
  
  public boolean posTab() {
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  };
  
  public boolean posTab(PVector m) {
    return mouse!=null&&mouse.x>x&&mouse.x<x+w&&mouse.y>y&&mouse.y<y+h;
  };
  
  public boolean posTabd() {
    return mouseX>x&&mouseX<x+w&&mouseY>y-5&&mouseY<y;
  };
  
  public boolean posTabd(PVector m) {
    return m.x>x&&m.x<x+w&&m.y>y-5&&m.y<y;
  };
  
  public void drawImages(){
    
    for (int i=0; i<states.get(state).images.size(); i++) {
      PImage p = states.get(state).images.get(i);
      canvas.image(p,x,y);
    }
    
  };

  public void drawDynamicImages(ArrayList<PImage> p,int k){
    
      
    tab t = states.get(state);
    if(t.toggle&&t.visible){
      canvas.beginDraw();
      int borderSize = 4;
      for (int i=p.size()-1;i>-1; i--) {
        PImage p1 = p.get(i);
        canvas.stroke(0);
        canvas.strokeWeight(borderSize);
        
        canvas.noFill();
        if(i==0){
          canvas.rect((p1.width+20) * i-borderSize*2 - p1.width+20-35,40-borderSize*2,p1.width+borderSize*4,p1.height+borderSize*4);
        }
        canvas.stroke(255,0,0);
        //float x = 
        if(0==k-i){
          canvas.rect((p1.width+20) * i-borderSize,40-borderSize*2,p1.width+borderSize*4,p1.height+borderSize*4);
        }
        canvas.stroke(0);
        canvas.rect((p1.width+20) * i-borderSize-p1.width+20-35,40-borderSize,p1.width+borderSize*2,p1.height+borderSize*2);
        canvas.image(p1,(p1.width+20) * i-p1.width+20-35,40);
      }
      //if(t.scrollable)t.drawSlider();
      canvas.endDraw();
      image(canvas,x,y);
    }
  };

  public void drawButtons() {
    fill(255);

    for (int i=0; i<buttons.size(); i++) {
      
      Button b = buttons.get(i);
      b.mouse =  mouse;
      b.parentCanvas = true;
      b.draw(canvas);
      b.highlight(mouse);
      b.self_click2(mouse);
    }
  };
  
  public void drawButtons(PGraphics scene) {
    scene.fill(255);

    for (int i=0; i<buttons.size(); i++) {
      Button b = buttons.get(i);
      b.mouse =  mouse;
      b.parentCanvas = true;
      b.draw(scene);
      b.self_click2(mouse);
    }
  };

  public void drawMenus() {
    for (int i=0; i<menus.size(); i++) {
      
      Menu m = menus.get(i);
      
      //m.setParentCanvas(canvas);
      m.mouse = getMouse();
      // if(parentTab==null)m.mouse = getMouse();
      // else m.mouse = getMouse(mouse);
      m.draw(canvas);
      }
  };

  public void drawTextboxes() {
    for (int i=0; i<textboxes.size(); i++) {
      TextBox t = textboxes.get(i);
      if(parentTab==null)t.mouse = mouse;
      else t.mouse = getMouse(mouse);
      t.draw(canvas);
    }
  };

  public void drawTextareas() {
    for (int i=0; i<textareas.size(); i++) {
      TextArea t = textareas.get(i);
      if(parentTab==null)t.mouse = getMouse();
      else t.mouse = getMouse(mouse);
      t.toggle=1;
      t.draw(canvas);
    }
  };

  public void drawWindows() {
    for (int i=0; i<windows.size(); i++) {
      Window w = windows.get(i);
      //w.toggle = true;
      
      w.display_grid();
    }
  };

  public void drawTable_s() {
    for (int i=0; i<tables.size(); i++) {
      Table_ t = tables.get(i);
      t.draw();
    }
  };

  public void displayInnerTabs() {
    for (int i=0; i<tabs.size(); i++) {
      tab t = tabs.get(i);
      t.displayTabs();
    }
  };
};





 class tabBoundary{
  
  float x1,x2,y1,y2,w,h,x3,y3,size = 1,x4,y4,D1,D2,T1,T2,collision_index,menux,menuy,deltamx,deltamy,tacx,tacy,dir;
  float x,y,bx = x,by = y;
  public float mass,vx,vy,ax,ay,density,friction_u,momentum,bax ,bay,pathWidth=20,
               gconst = 0.1f,floor = 590,rtheta = 0,avoidance,cohesion;
  PVector p1,midpoint1,midpoint2,midpoint3,m = new PVector(0,0);
  PVector p2,p3,p4,center = new PVector(-1,-1),vel,ac,rotatep;
  int key1,key2,type,t,t2,vert,vert1,vert3,trit,id,index,lindex,sindex,ccount,sid,vcount,hcount,uindex = -1,counter,tpoints,mcount,sides,shapeIndex,lineIndex,lcount,pcount
      ,options = -1,numm,state,state1=1;
  public int cols = 40,rows = 25;
  public boolean toggle = false,mdown,mup = true,circle,square,bezier,tri,c_poligon,poligon,drag,none,spline,hover,hover2,point1,point2,point3,point4,gravity,hidemenu,clear,
                 edit,complex,cstart,showgrid,cfinish = false,border,fill,hidden,connectedlines,path,avoidtabBoundary,cohesiontabBoundary,amendtabBoundary,amendInnertabBoundary,
                 amendCohesion,amendAvoidance,dashed;
  boolean linedown = false,sdown,rtoggle,click,open,dynamic = true,falling = true,rotating,update,lock,pdown,updatep,updateg,tdown,trow,menudown,pointadded,converted,rdown,phover,
          lhover,contextClick,visible = true;
  float dx,dy,Theta,Norm;
  int col = color(255),bg = color(0,180);
  ArrayList<Integer> indices = new ArrayList<Integer>();
  ArrayList<Button> Buttons = new ArrayList<Button>();
  ArrayList<tabBoundary> Boundaries = new ArrayList<tabBoundary>();
  ArrayList<tabBoundary> innerBoundaries = new ArrayList<tabBoundary>();
  ArrayList<tabBoundary> outerBoundaries = new ArrayList<tabBoundary>();
  ArrayList<PVector> points = new ArrayList<PVector>();
  ArrayList<PVector> rotation_points = new ArrayList<PVector>();
  Scene scene;
  ArrayList<Scene> scenes = new ArrayList<Scene>();
  tabBoundary parent;
  tabBoundary child;
  PShape bpath;
  ArrayList<PShape> paths = new ArrayList<PShape>();
  ArrayList<Float[]> velocity = new ArrayList<Float[]>();
  ArrayList<PVector> velocitypv = new ArrayList<PVector>();
  ArrayList<tabBoundary> Quadrants = new ArrayList<tabBoundary>();
  ArrayList<PVector> Midpoints = new ArrayList<PVector>();
  ArrayList<PVector> collision_array = new ArrayList<PVector>();
  //ArrayList<PVector> Midpoints = new ArrayList<PVector>();
  
  String []contextlabels = {"Undo","Redo"};
  String []contextDellabels = {"Delete Point","Cancel"};
  String []palletelabels = {"Fill","Gravity","Friction","Velocity","Connect","Amend B","Amend iB","Avoid","Seek",
                            "Follow","Dashed","Border","Clear","Visible","Grid","Hide","Edit","Reset"};
  String []complexmenu = {"Finish"};
  String []convertmenu = {"Convert","Delete Shape"};
  String []connectedlMenul = {"Convert","Delete Line","Delete Shape"};
  
  Menu palletehide,context,contextDel,pallete,complexsub,convertToPath,connectedlMenu;
  String [] settingsLabel = {"Cohesion","Avoidance"};
  sliderBox settings;
  
  TextBox Sides = new TextBox (W-200,H-200,20,20,5,"Sides");
  ArrayList<Float> norm = new ArrayList<Float>();
  ArrayList<Float[]> mdist = new ArrayList<Float[]>();
  ArrayList<Float[]> pdist = new ArrayList<Float[]>();
  ArrayList<Float> dist = new ArrayList<Float>();
  ArrayList<Integer> types = new ArrayList<Integer>();
  ArrayList<Float> theta = new ArrayList<Float>();
  ArrayList<Float> mtheta = new ArrayList<Float>();
  ArrayList<PVector> temp = new ArrayList<PVector>();
  ArrayList<ArrayList> polytemp = new ArrayList<ArrayList>();
  HashMap<String,Boolean> values = new HashMap<String,Boolean>();
  
  PVector polymidpoint = new PVector(0,0);
  Grid gridlayout;
  ArrayList<Point> grid = new ArrayList<Point>();
  ArrayList<Point> ugrid = new ArrayList<Point>();
  ArrayList<Point> ogrid = new ArrayList<Point>();
  
  tabBoundary(){
    
    palletehide = new Menu(0,200+300/2 - 100,20,50);
    context = new Menu(mouseX,mouseY,90,contextlabels);
    contextDel = new Menu(mouseX,mouseY,90,contextDellabels);
    pallete = new Menu(0,200,90,palletelabels,0);
    complexsub = new Menu(W-200,H-200,90,complexmenu);
    convertToPath = new Menu(mouseX,mouseY,90,convertmenu);
    connectedlMenu = new Menu(mouseX,mouseY,90,connectedlMenul);
    type = -1;
    
  };
  
  tabBoundary(float X1, float Y1,float X2, float Y2){
    
    x1 = X1;
    y1 = Y1;
    x2 = X2;
    y2 = Y2;
    type = 2;
    p1 = new PVector(x1,y1);
    p2 = new PVector(x2,y2);
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    
  };
  
  tabBoundary(float X1, float Y1,float ww,float hh,int Type){
    
    float t1 = 0;
    x1 = X1;
    y1 = Y1;
    w = ww;
    h = hh;
    
    Float [] d1 = {0.0f,0.0f};
    Float [] vel = {0.0f,0.0f};
    
    if(Type==0){
    
    x1 = X1;
    y1 = Y1;
    w = ww;
    h = hh;
    x2 = x1 + ww;
    y2 = y1 + hh;
    
    type = 0;
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    d1[0] = center.x - x1;
    d1[1] = center.y - y1;
    pdist.add(d1);
    t1 = atan2(y1-center.y,x1-center.x);
    theta.add(t1);
    d1[0] = center.x - x2;
    d1[1] = center.y - y2;
    pdist.add(d1);
    t1 = atan2(y2-center.y,x2-center.x);
    theta.add(t1);
    
    }
    
    if(Type==2){
    x1 = X1;
    y1 = Y1;
    x2 = ww;
    y2 = hh;
    
    type = 2;
    center = new PVector((x1+x2)/2,(y1+y2)/2);
    Boundaries.add(new tabBoundary(x1,y1,x2,y2));
    d1[0] = center.x - x1;
    d1[1] = center.y - y1;
    pdist.add(d1);
    t1 = atan2(y1-center.y,x1-center.x);
    theta.add(t1);
    d1[0] = center.x - x2;
    d1[1] = center.y - y2;
    pdist.add(d1);
    t1 = atan2(y2-center.y,x2-center.x);
    theta.add(t1);
    velocity.add(vel);
    create_rotation_points(Boundaries);
    create_points(Boundaries);
    
    }
    
    if(Type==0||Type==2){
      center = new PVector((x1+x2)/2,(y1+y2)/2);
    }
    
    if(Type==3){
    
    w = dist(x1,y1,ww,hh);
    h = dist(x1,y1,ww,hh);
    
    Norm = -atan2(x1 - ww,y1 - hh);
    
    x2 = ww + w/1.5f * cos(Norm);
    y2 = hh + h/1.5f * sin(Norm);
    x3 = ww - w/1.5f * cos(Norm);
    y3 = hh - h/1.5f * sin(Norm);
    
    center = new PVector((x1+x2+x3)/3,(y1+y2+y3)/3);
    Boundaries.add(new tabBoundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    midpoint1 = new PVector((x1 + x2)/2,(y1 + y2)/2);
    Boundaries.add(new tabBoundary(x2 , y2 ,x3 , y3));
     d1[0] = center.x - x2;
     d1[1] = center.y - y2;
     pdist.add(d1);
     t1 = atan2(y2-center.y,x2-center.x);
     theta.add(t1);
    midpoint2 = new PVector((x2 + x3)/2,(y2 + y3)/2);
    velocity.add(vel);
    Boundaries.add(new tabBoundary(x3, y3,x1,y1 ));
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    velocity.add(vel);
    midpoint3 = new PVector((x3 + x1)/2,(y3 + y1)/2);
    type = 3;
    create_rotation_points(Boundaries);
    create_points(Boundaries);
    
    }
    
    if(Type==4){
      
    x2 = x1 + ww;
    y2 = y1;
    x3 = x1 + ww;
    y3 = y1 + hh;
    x4 = x1;
    y4 = y1 + hh;
    
    center = new PVector((x1+x2+x3+x4)/4,(y1+y2+y3+y4)/4);
    Boundaries.add(new tabBoundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    Boundaries.add(new tabBoundary(x2,y2,x3,y3));
    velocity.add(vel);
      d1[0] = center.x - x2;
      d1[1] = center.y - y2;
      pdist.add(d1);
      t1 = atan2(y2-center.y,x2-center.x);
      theta.add(t1);
    Boundaries.add(new tabBoundary(x3,y3,x4,y4));
    velocity.add(vel);
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    Boundaries.add(new tabBoundary(x4,y4,x1,y1));
    velocity.add(vel);
      d1[0] = center.x - x4;
      d1[1] = center.y - y4;
      pdist.add(d1);
      t1 = atan2(y4-center.y,x4-center.x);
      theta.add(t1);

    center = new PVector((x1+x2+x3+x4)/4,(y1+y2+y3+y4)/4);
    type = 4;
    }
    
    if(Type==103){
      
    Norm = -atan2(x1 - ww,y1 - hh);
    
    x2 = x1 + w/2 ;
    y2 = y1 + h ;
    x3 = x1 - w/2 ;
    y3 = y1 + h ;
    center = new PVector((x1+x2+x3)/3,(y1+y2+y3)/3);
    Boundaries.add(new tabBoundary(x1,y1,x2,y2));
    velocity.add(vel);
      d1[0] = center.x - x1;
      d1[1] = center.y - y1;
      pdist.add(d1);
      t1 = atan2(y1-center.y,x1-center.x);
      theta.add(t1);
    midpoint1 = new PVector((x1 + x2)/2,(y1 + y2)/2);
    Boundaries.add(new tabBoundary(x2 , y2 ,x3 , y3));
     d1[0] = center.x - x2;
     d1[1] = center.y - y2;
     pdist.add(d1);
     t1 = atan2(y2-center.y,x2-center.x);
     theta.add(t1);
    midpoint2 = new PVector((x2 + x3)/2,(y2 + y3)/2);
    velocity.add(vel);
    Boundaries.add(new tabBoundary(x3, y3,x1,y1 ));
      d1[0] = center.x - x3;
      d1[1] = center.y - y3;
      pdist.add(d1);
      t1 = atan2(y3-center.y,x3-center.x);
      theta.add(t1);
    velocity.add(vel);
    midpoint3 = new PVector((x3 + x1)/2,(y3 + y1)/2);
    type = 3;
    create_points(Boundaries);
    
    }
    
    type = Type;
    create_points(Boundaries);
    create_dist();
    create_angles(Boundaries);
    create_rotation_points(Boundaries);
  };
  
  tabBoundary (float X1, float Y1,float X2,float Y2,float X3, float Y3){

    x1 = X1;
    y1 = Y1;
    x2 = X2;
    y2 = Y2;
    x3 = X3;
    y3 = Y3;
    type = 3;
  };
  
  tabBoundary(PVector A, PVector B,PVector C){

    p1 = A;
    p2 = B;
    p3 = C;
    x1 = p1.x;
    y1 = p1.y;
    x2 = p2.x;
    y2 = p2.y;
    type = 3;
  };
  
  tabBoundary(PVector A, PVector B){

    p1 = A;
    p2 = B;
    x1 = p1.x;
    y1 = p1.y;
    x2 = p2.x;
    y2 = p2.y;
  };
  
  tabBoundary(ArrayList<Point> A){
  
   center = new PVector (0,0);
    for(int i=0;i<A.size();i++){
      
      Point a = A.get(i);
      Point b = A.get(i);
      
      if(i<A.size()-1)b = A.get(i+1);
      else b = A.get(0);
      tabBoundary B = new tabBoundary(a.x,a.y,b.x,b.y,2);
      Boundaries.add(B);
      
    }
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 105;
  };
  
  tabBoundary(ArrayList<Point> A,int k){
  
   center = new PVector (0,0);
    for(int i=0;i<A.size();i++){
      
      Point a = A.get(i);
      Point b = null;
      Point c = null;
      
      if(i+2<A.size()){
       b = A.get(i+1);
       c = A.get(i+2);
      
      if(((b.x==a.x)&&(c.x==a.x)||b.y==a.y&&(c.y==a.y))){
        A.remove(i+1);
        i--;
        
      }else{
        tabBoundary B = new tabBoundary(a.x,a.y,b.x,b.y,2);
        Boundaries.add(B);
      }}else if(i+1<A.size()){
        b = A.get(i+1);
        tabBoundary B = new tabBoundary(a.x,a.y,b.x,b.y,2);
        Boundaries.add(B);
      }}
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 106;
  };
  
  tabBoundary(tabBoundary B){
   
   //Boundaries = B.Boundaries;
   
   if(B.type==106){
     
   float pw = pathWidth; 
   
   center = new PVector (0,0);
   
   tabBoundary b0 = B.Boundaries.get(0);
   
   PVector p0 = new PVector(b0.x1,b0.y1);
   PVector p1 = new PVector(b0.x2,b0.y2);
   
   float t = -atan2(p0.x-p1.x,p0.y-p1.y);
   
   PVector p2 =  new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
   PVector p3 =  new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
   
   tabBoundary b = new tabBoundary(p1,p2);
   
   Boundaries.add(b);
   
    for(int i=1;i<B.Boundaries.size()-1;i++){
      
      b = B.Boundaries.get(i);
      
      tabBoundary b1 = B.Boundaries.get(i-1);
      tabBoundary b2 = B.Boundaries.get(i+1);
      
      p0 = new PVector(b.x1,b.y1);
      p1 = new PVector(b1.x2,b1.y2);
      
      p2 = new PVector(b2.x2,b2.y2);
      p3 = new PVector();
      
      float t1 = atan2(p0.y-p1.y,p0.x-p1.x);
      float t2 = atan2(p0.y-p2.y,p0.x-p2.x);
      
      t = -1/((t1+t2)/2);
      
      PVector p4 = new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
      PVector p5 = new PVector(p1.x+pw*cos(t),p1.y+pw*sin(t));
      
      Boundaries.add(new tabBoundary(p4.x,p4.y,p5.x,p5.y));
      
      }
      
      b0 =  B.Boundaries.get(B.Boundaries.size()-1);
      p0 = new PVector(b0.x1,b0.y1);
     
      t = radians(90);
      p1 =  new PVector(p0.x+pw*cos(t),p0.y+pw*sin(t));
      p2 =  new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
     
      b = new tabBoundary(p1,p2);
     
      Boundaries.add(b);
      
      for(int i=B.Boundaries.size()-1;i>-1;i--){
      
      b = B.Boundaries.get(i);
      tabBoundary b1 = B.Boundaries.get(i-1);
      tabBoundary b2 = B.Boundaries.get(i+1);
      
      p0 = new PVector(b.x1,b.y1);
      p1 = new PVector(b1.x2,b1.y2);
      
      p2 = new PVector(b2.x2,b2.y2);
      p3 = new PVector();
      
      float t1 = atan2(p0.y-p1.y,p0.x-p1.x);
      float t2 = atan2(p0.y-p2.y,p0.x-p2.x);
      
      t = -1/((t1+t2)/2);
      
      PVector p4 = new PVector(p0.x-pw*cos(t),p0.y-pw*sin(t));
      PVector p5 = new PVector(p1.x-pw*cos(t),p1.y-pw*sin(t));
      
      Boundaries.add(new tabBoundary(p4.x,p4.y,p5.x,p5.y));
      
      }
    
      calc_center();
      create_points(Boundaries);
      create_dist();
      create_angles(Boundaries);
      create_rotation_points(Boundaries);
      type = 107;
      
   }else if(B.type!=0){
     
     float pw = pathWidth; 
   
      center = B.center;
      calcInner(B);
      calcOuter(B);
    
      create_points(innerBoundaries);
      create_points(outerBoundaries);
      create_angles(innerBoundaries);
      create_angles(outerBoundaries);
      create_rotation_points(innerBoundaries);
      create_rotation_points(outerBoundaries);
      type = 107;
   }else {
     
   }
  };
  
  public Point getNextPoint(ArrayList<Point> a,Point b){
    Point c = null;
    for(int i=0;i<a.size();i++){
      Point d = a.get(i);
      if(d.x!=b.x&&d.y!=b.y)c = d; 
    }
    
    return c;
  };
  
  public void debug(){
    fill(255);
  };
  
  public void calcInner(tabBoundary a){
    if(a.type==0){
      
    }else if(a.type!=0&&a.type!=106){
      
      float pw = a.pathWidth;
      
    for(int i=0;i<a.Boundaries.size();i++){
      tabBoundary b = a.Boundaries.get(i);
      tabBoundary b1 = a.Boundaries.get(i);
      
      if(i<a.Boundaries.size()-1)b1 = a.Boundaries.get(i+1);
      else b1 = a.Boundaries.get(0);
      
      PVector p = new PVector(b.x1,b.y1);
      PVector p1 = new PVector(b.x2,b.y2);
      
      float t = atan2(a.center.y-p.y,a.center.x-p.x);
      float d = dist(p.x,p.y,a.center.x,a.center.y);
      
      float t1 = atan2(a.center.y-p1.y,a.center.x-p1.x);
      float d1 = dist(p1.x,p1.y,a.center.x,a.center.y);
      
      PVector p2 = new PVector(a.center.x+(d-pw)*cos(t),a.center.y+(d-pw)*sin(t));
      PVector p3 = new PVector(a.center.x+(d1-pw)*cos(t1),a.center.y+(d1-pw)*sin(t1));
      
      
      //a.innerBoundaries.add(new tabBoundary(p2.x,p2.y,p3.x,p3.y));
      //a.outerBoundaries.add(new tabBoundary(p2.x,p2.y,p3.x,p3.y));
    }a.type = 107;}else{
      
    }
    
  };
  
  public void calcOuter(tabBoundary a){
    if(a.type==0){
      
    }else if(a.type!=0&&a.type!=106){
      
      float pw = a.pathWidth;
      
    for(int i=0;i<a.Boundaries.size();i++){
      tabBoundary b = a.Boundaries.get(i);
      tabBoundary b1 = a.Boundaries.get(i);
      
      if(i<a.Boundaries.size()-1)b1 = a.Boundaries.get(i+1);
      else b1 = a.Boundaries.get(0);
      
      PVector p = new PVector(b.x1,b.y1);
      PVector p1 = new PVector(b1.x1,b1.y1);
      
      float t = atan2(a.center.y-p.y,a.center.x-p.x)-PI;
      float d = dist(p.x,p.y,a.center.x,a.center.y);
      
      float t1 = atan2(a.center.y-p1.y,a.center.x-p1.x)-PI;
      float d1 = dist(p1.x,p1.y,a.center.x,a.center.y) ;
      
      PVector p2 = new PVector(a.center.x+(d+pw)*cos(t),a.center.y+(d+pw)*sin(t));
      PVector p3 = new PVector(a.center.x+(d1+pw)*cos(t1),a.center.y+(d1+pw)*sin(t1));
      
      PVector p4 = new PVector(a.center.x+(d)*cos(t) - pw*cos(t),a.center.y+(d)*sin(t) - pw*sin(t));
      PVector p5 = new PVector(a.center.x+(d1)*cos(t1) - pw*cos(t),a.center.y+(d1)*sin(t1) - pw*sin(t));
      
      a.innerBoundaries.add(new tabBoundary(p4.x,p4.y,p5.x,p5.y));
      a.outerBoundaries.add(new tabBoundary(p2.x,p2.y,p3.x,p3.y));
    }a.type = 107;}else{
      
    }
  };
  
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void draw(){
     rmenu();
     hcount = 0;lcount = 0;pcount = 0;
     boolean lineHover = false;
     int k = -1;
     fill(255);
     
     if(mouseX>0)m.x = mouseX;
     if(mouseY>0)m.y = mouseY;
    if(!clear){
    //for(int i=Boundaries.size()-1;i>-1;i--){
      for(int i=1;i<Boundaries.size();i++){
      tabBoundary b = Boundaries.get(i);
      
      b.id = i;
      if(!b.visible&&pos(b,m)){
        if(visible&&mousePressed)b.visible = true;
      }
      if(b.visible){
      if(edit){
      if(b.type!=2&&!point1&&!point2&&!linedown&&!rdown)mtranslate(b,m);
      if(!point1&&!point2&&!tdown&&!rdown)move(b,m);
      if((b.type!=0)&&!linedown&&!tdown&&!rdown)pospoint(b);
      if(!point1&&!point2&&!linedown&&!tdown)pos_rotationpoint(b);
      b.update(b);
      }
      
      if(!pospoint(b,0))pcount++;
      
      if(gravity)b.gravity = true;
      else b.gravity = false;
      
      strokeWeight(1);
      if(pos(b,m)){
        if(!visible&&mousePressed)b.visible = false;
        if(amendtabBoundary){
          fill(255);
          text(b.state,b.x1,b.y1);
                if(mousePressed){
                if(amendCohesion&&amendAvoidance)b.state = 1;
                else if(amendCohesion&&!amendAvoidance)b.state = 2;
                else if(!amendCohesion&&amendAvoidance)b.state = 3;
                else if(!amendCohesion&&!amendAvoidance)b.state = 4;
         }}
        indices.add(i);
        if(indices.size()>2)indices.remove(0);
      }
      if(!pos(b,m))hcount ++;
        
        if(b.type==0){
          stroke(0);
          fill(0,50);strokeWeight(1);
          if(pos(b,m)){
            shapeIndex=i;
            fill(255,50);
          }
          ellipseMode(CENTER);
          ellipse(b.center.x,b.center.y,b.w,b.h);
        }else if(b.type!=107){
          
          if(b.type!=106)fill(0,50);
          else noFill();
          if(pos(b,m)){
            shapeIndex=i; 
            fill(255,50);
          }
          stroke(0);
          beginShape();
          
          for(int j=0;j<b.Boundaries.size();j++){
            tabBoundary c = b.Boundaries.get(j);
            
            vertex(c.x1,c.y1);
            vertex(c.x2,c.y2);
          }}}
          if(b.type==106)endShape();
          else if(b.type!=107)endShape(CLOSE);
          
          if(b.type==107){
            
            //if(!b.converted){
              
          b.bpath = createShape();
          //---------------begin shape------------------------------------
          beginShape();
          fill(0,150);
          stroke(0);
          strokeWeight(1);
          //-------------exterior------------------------------------
          
          for(int j=0;j<b.outerBoundaries.size()-1;j++){
            
            tabBoundary c = b.outerBoundaries.get(j);
            tabBoundary c1 = b.outerBoundaries.get(j+1);
            
            vertex(c.x1,c.y1);
            vertex(c1.x1,c1.y1);
            
            if(pos(c,m)){
              if(amendInnertabBoundary){
                if(mousePressed){
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          //------------interior------------------------------------
          beginContour();
          
          for(int j=b.innerBoundaries.size()-1;j>0;j--){
            
            tabBoundary c = b.innerBoundaries.get(j);
            tabBoundary c1 = b.innerBoundaries.get(j-1);
            
            vertex(c.x1,c.y1);
            vertex(c1.x1,c1.y1);
            if(pos(c,m)){
              if(amendInnertabBoundary){
                if(mousePressed){
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          //for(int j=0;j<b.innerBoundaries.size()-1;j++){
            
          //  tabBoundary c = b.innerBoundaries.get(j);
          //  tabBoundary c1 = b.innerBoundaries.get(j+1);
            
          //  vertex(c.x1,c.y1);
          //  vertex(c.x2,c.y2);
          //  //vertex(c1.x1,c.y1);
          //}
            endContour();
            //----------end shape------------------------------------
            endShape(CLOSE);
            //b.converted = true;
            //shape(b.bpath);
          //}
            //else shape(b.bpath);
          }
        if(!clear){
          
          for(int j=0;j<b.Boundaries.size();j++){
        
            tabBoundary c = b.Boundaries.get(j);
            
            if(pos(c,m)){
              if(amendInnertabBoundary){
                if(mousePressed){
                     if(amendCohesion&&amendAvoidance)c.state1 = 1;
                else if(amendCohesion&&!amendAvoidance)c.state1 = 2;
                else if(!amendCohesion&&amendAvoidance)c.state1 = 3;
                else if(!amendCohesion&&!amendAvoidance)c.state1 = 4;
              }}
              if(c.state1==3)stroke(255,0,0);
              else if(c.state1==2)stroke(0,0,255);
              else if(c.state1==1)stroke(0,255,0);
              line(c.x1,c.y1,c.x2,c.y2);
              lineHover = true;
              k = j;
          }}
          lindex = k;
          if(lineHover)shapeIndex = i;
          else lcount++;
        }}
          if(hcount>0) hover2 = true;
          else hover2  = false;
    }else{
      //tabBoundary a = Boundaries.get(0);
      //Boundaries = new ArrayList<tabBoundary>();
      //Boundaries.add(a);
      while(Boundaries.size()>1)Boundaries.remove(Boundaries.size()-1);
      clear = false;
    }
    int n = Boundaries.size();
    if(pcount==0)phover = false;
    if(lcount==0)lhover = false;
    if(hcount==n&&lcount==n&&pcount==n)shapeIndex=-1;
  };
  
  public void draw2(){
    logic();
    debug();
    
    strokeWeight(1);
    for(int i=0;i<Boundaries.size();i++){
      tabBoundary b = Boundaries.get(i);
      b.id = i;
      move(b,m);
      beginShape();
      stroke(0);
      vertex(b.x1,b.y1);
      vertex(b.x2,b.y2);
      endShape(CLOSE);
    }
  };
  
  public void trace(){
    
    //scene.draw(9);
    
  };
  
  public void rmenu(){
    logic();
      if(open||none){
       pallete.draw();
       if(showgrid){
         gridlayout.toggle=true;
         gridlayout.grid_functions();
         gridlayout.terrain2d = true;
         }
       else if(type==-2)gridlayout.toggle=false;
       
       //if(mousePressed&&mouseButton == RIGHT&&!rtoggle){rtoggle = true;}
         //-----------------------------------------------------------------------------
         
         if(mousePressed&&mouseButton==RIGHT&&!rtoggle&&!contextClick)rtoggle=true;
         
         
         if(rtoggle&&edit){
           
         contextDel.visible = false;
         convertToPath.visible = false;
         context.visible = false;
         connectedlMenu.visible = false;
         
         if(shapeIndex==-1)options = 0;
         else {
           if(Boundaries.get(shapeIndex).type==106){
             numm = shapeIndex;
               if(pcount==1)options = 5;
               else if(lcount==pcount) options = 1;
              //else if((pcount<lcount))options = 1;
              //else options = 5;
         }else {
               if(pcount==lcount&&pcount>0)options = 3;
              else if(pcount>lcount)options = 2;
              else if((pcount<lcount))options = 1;
              else options = 4;
         }}
         if(!edit||Boundaries.size()==0)options=4;
         context.x = mouseX;
         context.y = mouseY;
         
         connectedlMenu.x = mouseX;
         connectedlMenu.y = mouseY;
         
         for (int i=0;i<connectedlMenu.items.size();i++){
           Button a = connectedlMenu.items.get(i); 
           a.x = connectedlMenu.x;
           a.y = connectedlMenu.y+ i*20;
         }
         
         for (int i=0;i<context.items.size();i++){
           Button a = context.items.get(i); 
           a.x = context.x;
           a.y = context.y+ i*20;
         }
         
         contextDel.x = mouseX;
         contextDel.y = mouseY;
         
         if(options==1)contextDel.items.get(0).label = "Delete Point";
         else if(options==2)contextDel.items.get(0).label = "Delete Line";
         
         for (int i=0;i<contextDel.items.size();i++){
           Button a = contextDel.items.get(i); 
           a.x = contextDel.x;
           a.y = contextDel.y+ i*20;
         }
         
         convertToPath.x = mouseX;
         convertToPath.y = mouseY;
         
         for (int i=0;i<convertToPath.items.size();i++){
           Button a = convertToPath.items.get(i); 
           a.x = convertToPath.x;
           a.y = convertToPath.y+ i*20;
         }
         
         if(!mousePressed){
           contextClick = true;
           rtoggle=false;
         }}
         //------------------------------------------------------------------------------------
         //if(mousePressed&&mouseButton==LEFT)options = 4;
         if(options==0){
           contextDel.visible = false;
           convertToPath.visible = false;
           context.visible = true;
           connectedlMenu.visible = false;
         }
         else if(options==1||options==2){
             contextDel.visible = true;
             convertToPath.visible = false;
             context.visible = false;
             connectedlMenu.visible = false;
           }else if(options==3){
             contextDel.visible = false;
             convertToPath.visible = true;
             context.visible = false;
             connectedlMenu.visible = false;
           }else if(options==4){
             contextDel.visible = false;
             convertToPath.visible = false;
             context.visible = false;
             connectedlMenu.visible = false;
           }else if(options==5){
             connectedlMenu.visible = true;
             contextDel.visible = false;
             convertToPath.visible = false;
             context.visible = false;
           }
         
         if(contextClick){
         if(contextDel.visible){
           contextDel.draw();
         if(mousePressed&&!contextDel.items.get(0).pos()&&!contextDel.items.get(1).pos()){
                rtoggle=false;
                contextClick=false;
           }}
         else if(context.visible){
           context.draw();
           if(mousePressed&&!context.items.get(0).pos()&&!context.items.get(1).pos()){
                rtoggle=false;
                contextClick=false;
           }}
         else if(convertToPath.visible){
            convertToPath.draw();
            //if(mousePressed&&mouseButton==LEFT){
              if(mousePressed&&convertToPath.items.get(1).pos()){
                if(shapeIndex>-1)Boundaries.remove(shapeIndex);
                rtoggle=false;
                contextClick=false;
           }else if(mousePressed&&convertToPath.items.get(0).pos()){
                calcInner(Boundaries.get(shapeIndex));
                calcOuter(Boundaries.get(shapeIndex));
                
                rtoggle=false;
                contextClick=false;
           }else if(mousePressed&&!convertToPath.items.get(0).pos()&&!convertToPath.items.get(1).pos()){
                rtoggle=false;
                contextClick=false;
           }}
           else if(connectedlMenu.visible){
             connectedlMenu.draw();
             if(mousePressed&&connectedlMenu.items.get(2).pos()){
                if(numm>-1)Boundaries.remove(numm);
                rtoggle=false;
                contextClick=false;
           }else if(mousePressed&&connectedlMenu.items.get(0).pos()){
                calcInner(Boundaries.get(numm));
                calcOuter(Boundaries.get(numm));
                
                rtoggle=false;
                contextClick=false;
           }}
         else if (mousePressed){
           contextClick = false;
           rtoggle = false;
       }}}
         
         if(contextClick&&!contextDel.pos()&&context.pos()&&!convertToPath.pos()&&mousePressed){
           contextClick=false;
           rtoggle = false;
         }
           
  };
  
  public void update(tabBoundary a){
    float midx = 0;
    float midy = 0;
    
    float aa = 0.05f;
    vcount = 0;
    
    //dir = atan2(a.Boundaries.get(0).y1 - center.y,a.Boundaries.get(0).x1 - center.x);
    //line(Boundaries.get(0).x1,Boundaries.get(0).y1,center.x,center.y);
    if(type!=0){
      
      if(!mousePressed){trow = true;}
      
      if(gravity){
        
        //updateg = true;
        if(falling){
          vy += gconst;
          if(vy>=4)vy = 4.0f;
          if(vy<=-4)vy = -4.0f;
          if(vy>=4)vy = 4.0f;
          if(vy<=-4)vy = -4.0f;
          center.y += vy;
        }
        if(type!=2){
        update_Boundaries();
        a.update_angles();
        create_rotation_points(Boundaries);
        }else{
          //center.x = (x1+x2)/2;
          //center.y = (y1+y2)/2;
          a.update_line();
        }
        

 }else updateg = false;
    
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      if(b.y1>=floor)vcount++;rotatep = (new PVector(b.x1,b.y1));
      if(b.y2>=floor)vcount++;rotatep = (new PVector(b.x2,b.y2));
    }
    
    if(vcount>0) falling = false;
    if(vcount>0) rotating = true;
    
    }
    
    if(type==0){
      if(gravity){
        
        if(center.y<floor){
          vy += ay;
          center.y += vy;
       }}}
    
    strokeWeight(20);
    stroke(255);
    point(center.x,center.y);
    strokeWeight(1);
    
      if(!mousePressed)sdown = false;linedown = false;
      if(mousePressed&&!linedown)linedown = true;
      
      if(!mousePressed&&!a.point1&&!a.point2&&!a.point3&&a.updatep&&a.uindex==id&&a.type!=2){
        
        calc_center();
        update_dist(Boundaries);
        a.create_rotation_points(Boundaries);
        a.update_angles();
        a.updatep = false;
      }
  };
  
  public void create_points(ArrayList<tabBoundary> a){
    for(int i=0;i<a.size();i++){
      
      tabBoundary b = a.get(i);
      if(points.size()==i)points.add(new PVector(b.x1,b.y1));
      }
  };
  
  public void create_angles(ArrayList<tabBoundary> a){
    for(int i=0;i<a.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      float t1 = atan2(b.y1 - center.y,b.x1 - center.x);
      
      if(theta.size()<a.size())theta.add(t1);
      else theta.set(i,t1);
    }
  };
  
  public void update_points(ArrayList<tabBoundary> a){
    
    
    for(int i=0;i<a.size();i++){
      
      PVector b = points.get(i);
      
      float d1 = dist(b.x,b.y,center.x,center.y);
      
      float t1 = theta.get(i);;
      
      float ax = center.x + (d1) * cos(t1);
      float ay = center.y + (d1) * sin(t1);
      
      if(points.size()<a.size())points.add(new PVector(ax,ay));
      else rotation_points.set(i,new PVector(ax,ay));
    }
  };
  
  public void create_dist(){
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      dist.add(dist(center.x,center.y,b.x1,b.y1));
    }
  };
  
  public void update_Boundaries(){
    
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      float t = theta.get(i);
      Float d = dist.get(i);
      
      float t1 = 0;
      Float d1 = dist.get(i);
      
      if(i<Boundaries.size()-1){
        t1 = theta.get(i+1);
        d1 = dist.get(i+1);
      }else if(type!=106){
        t1 = theta.get(0);
        d1 = dist.get(0);
      }
      strokeWeight(10);
      stroke(0);
      
      b.x1 = center.x + d * cos(t);
      b.y1 = center.y + d * sin(t);
      if(type!=106){
      b.x2 = center.x + d1 * cos(t1);
      b.y2 = center.y + d1 * sin(t1);
      }else {
        
      }
      strokeWeight(1);
    }
  };
  
  public void update_line(){
    
    tabBoundary a = Boundaries.get(0);
    
    float b = theta.get(0);
    Float d = dist.get(0);
    
    a.x1 = center.x - d * cos(b) ;
    a.y1 = center.y - d * sin(b) ;
    
    a.x2 = center.x + d * cos(b) ;
    a.y2 = center.y + d * sin(b) ;
  };
  
  public void update_Boundaries(tabBoundary a){
    
    for(int i=0;i<a.Boundaries.size();i++){
      
      tabBoundary b = a.Boundaries.get(i);
      
      float t = a.theta.get(i);
      Float d = a.dist.get(i);
      
      float t1 = 0;
      Float d1 = a.dist.get(i);
      
      if(i<Boundaries.size()-1){
        t1 = a.theta.get(i+1);
        d1 = a.dist.get(i+1);
      }else if(a.type!=106){
        t1 = a.theta.get(0);
        d1 = a.dist.get(0);
      }
      strokeWeight(10);
      stroke(0);
      
      b.x1 = center.x + d * cos(t);
      b.y1 = center.y + d * sin(t);
      if(a.type!=106){
      b.x2 = center.x + d1 * cos(t1);
      b.y2 = center.y + d1 * sin(t1);
      }
      strokeWeight(1);
    }
  };
  
  public void rotate(float t){
    
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      float t2 = theta.get(i);
      float d2 = dist.get(i);
      
      if(i<theta.size()-1){
        t2 = theta.get(i+1);
        d2 = dist.get(i+1);
      }else if(type!=106){
        t2 = theta.get(0);
        d2 = dist.get(0);
      }
      
      b.x1 = center.x + dist.get(i) * cos(theta.get(i)+radians(t));
      b.y1 = center.y + dist.get(i) * sin(theta.get(i)+radians(t));
      
      b.x2 = center.x + d2 * cos(t2+radians(t));
      b.y2 = center.y + d2 * sin(t2+radians(t));
    }
    
  };
  public void rotate2(float t){
    
    float t3 = radians(90);
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      float t2 = theta.get(i);
      float d2 = dist.get(i);
      
      if(i<theta.size()-1){
        t2 = theta.get(i+1);
        d2 = dist.get(i+1);
      }else if(type!=106){
        t2 = theta.get(0);
        d2 = dist.get(0);
      }
      
      b.x1 = center.x + dist.get(i) * cos(theta.get(i)+(t)+t3);
      b.y1 = center.y + dist.get(i) * sin(theta.get(i)+(t)+t3);
      
      b.x2 = center.x + d2 * cos(t2+(t)+t3);
      b.y2 = center.y + d2 * sin(t2+(t)+t3);
    }
    
  };
  
  public void update_angles(){
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      float t = atan2(b.y1 - center.y,b.x1 - center.x);
      if(i<theta.size())theta.set(i,t);
      else theta.add(t);
    }
  };
  
  public void angular_vel(float a, float u){
    
    
    
  };
  
  public void create_rotation_points(ArrayList<tabBoundary>a){
    
    float d = 10;
    
    for(int i=0;i<a.size();i++){
      
      tabBoundary b = a.get(i);
      
      float d1 = dist(b.x1,b.y1,center.x,center.y);
      
      float t1 = atan2(b.y1 - center.y,b.x1 - center.x);
      
      float ax = center.x + (d1+d) * cos(t1);
      float ay = center.y + (d1+d) * sin(t1);
      
      if(rotation_points.size()<a.size())rotation_points.add(new PVector(ax,ay));
      else rotation_points.set(i,new PVector(ax,ay));
    }
    
  };
  
  public void rotate_about(PVector a,Float v){
    
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary b = Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,center.x,center.y);
      float d2 = dist(b.x2,b.y2,center.x,center.y);
      float t1 = atan2(b.y2 - b.y1,b.x2 - b.x1);
      float t2 = atan2(b.y1 - b.y2,b.x1 - b.x2);
      
      b.x1 = center.x + d1 * cos(t1+v);
      b.y1 = center.y + d1 * sin(t1+v);
      b.x2 = center.x + d2 * cos(t2+v);
      b.y2 = center.y + d2 * sin(t2+v);
    }
    
  };
  
  public void pos_rotationpoint(tabBoundary a){
    
    float X = mouseX;
    float Y = mouseY;
    
    t2 = 0;
    float t0 = 0;
    
    boolean k = false;
    
    for(int i=0;i<a.rotation_points.size();i++){
      PVector b = a.rotation_points.get(i);
      
      float d1 = dist(b.x,b.y,X,Y);
      
    if(d1<5){
      strokeWeight(5);
      stroke(255);
      point(b.x,b.y);
      if(mousePressed&&!point3){
        point3 = true;
        vert = i;
        index = a.id;
        rdown = true;
      }}}
      
      if(point3&&mousePressed&&index == a.id&&!point1&&!point2&&!linedown){
        rdown = true;
        float t2 = atan2(a.center.y -  mouseY,a.center.x - mouseX);
        
        for(int i=0;i<a.Boundaries.size();i++){
          
          tabBoundary b = a.Boundaries.get(i);
          
          PVector c = a.rotation_points.get(i);
          PVector d = null;
          
          float d1 = dist(c.x,c.y,a.center.x,a.center.y)-10;
          float t1 = atan2(a.center.y - c.y,a.center.x - c.x);
          
          float d2 = 0,t3 = 0;
          
          if(i<a.Boundaries.size()-1)d = a.rotation_points.get(i+1);
          else if(a.type!=106)d = a.rotation_points.get(0);
          
          if(d!=null){
          d2 = dist(d.x,d.y,a.center.x,a.center.y)-10;
          t3 = atan2(a.center.y - d.y,a.center.x - d.x);
          }
          b.x1 = a.center.x + d1 * cos(t1 + t2);
          b.y1 = a.center.y + d1 * sin(t1 + t2);
          
          b.x2 = a.center.x + d2 * cos(t3 + t2);
          b.y2 = a.center.y + d2 * sin(t3 + t2);
        }}
        
      if(!mousePressed&&point3){
        vert = -1;
        vert1 = -1;
        index = -1;
        rdown = false;
        point3 = false;
        a.update_dist(a.Boundaries);
        a.create_rotation_points(a.Boundaries);
        uindex = a.id;
        updatep = true;
      }
   };
  
  public void calc_center(){
    
    float midx = 0;
    float midy = 0;
    
    for(int i=0;i<Boundaries.size();i++){
      tabBoundary b = Boundaries.get(i);
      midx += (b.x1 + b.x2)/2;
      midy += (b.y1 + b.y2)/2;
    }
    
    midx /= Boundaries.size();
    midy /= Boundaries.size();
    
    center = new PVector(midx,midy);
  };
  
  public void logic(){
    if((tri||toggle||circle||bezier||square||spline||poligon||c_poligon||connectedlines||path)){ open = true;}
    if(mousePressed&&open_menus)menudown = true;
    else menudown = false;
    if(none)open = false;
    if(pallete!=null)pallete.click(12,main,"clear");
    if(hidemenu){
      
      if(pallete.x+pallete.w>=0){
      //if(type==0)palletelist.menu.x -= 2;
      pallete.x -= 6;
      for(int i=0;i<pallete.items.size();i++){
        Button a = pallete.items.get(i);
        a.x = pallete.x;
      }
      rect(pallete.x,pallete.y,pallete.w,pallete.h);
      }else if(pallete.x+pallete.w<0){
      palletehide.draw();
      
      if(palletehide.pos()&&mousePressed){
        hidemenu = false;
        pallete.items.get(10).toggle=0;
      }
    }}else if(pallete!=null&&pallete.x<0){
      main.pallete.items.get(15).toggle=0;
      pallete.x += 6;
      for(int i=0;i<pallete.items.size();i++){
        Button a = pallete.items.get(i);
        a.x = pallete.x;
      }
      rect(pallete.x,pallete.y,pallete.w,pallete.h);
    }
    
    
    if(type==-1&&clear){
      Boundaries = new ArrayList<tabBoundary>();
      ArrayList<Float[]> velocity = new ArrayList<Float[]>();
      ArrayList<PVector> velocitypv = new ArrayList<PVector>();
      ArrayList<tabBoundary> Quadrants = new ArrayList<tabBoundary>();
      ArrayList<PVector> Midpoints = new ArrayList<PVector>();
      clear = false;
    }
  };
  
  public void mtranslate(tabBoundary b ,PVector m){
    
    float mx = m.x;
    float my = m.y;
    
    if(!point1&&!point2&&!point3&&!linedown&&!rdown&&type!=2){
      if(pos(b,m)&&mousePressed&&!tdown){
         index = b.id;
         deltamx = (b.center.x - mx);
         deltamy = (b.center.y - my);
         
         b.tdown = true;
         tdown = true;
    }}
    
    
    if(b.tdown&&index == b.id&&type!=2){
      if(index>=0){
        
      tabBoundary c = Boundaries.get(index);
      b.center.x = mx + deltamx;
      b.center.y = my + deltamy;
      b.create_rotation_points(b.Boundaries);
      //b.update_angles();
      b.update_Boundaries();
      }}
    
    if(!mousePressed&&type!=2){
      if(index>=0){
        tabBoundary c = Boundaries.get(index);
        index = -1;
        deltamx = 0;deltamy = 0;
        uindex = c.id;
        updatep = true;
        b.tdown = false;
        tdown = false;
      
    }}
    
  };
  
  public void mtranslate(PVector m){
    
    float mx = m.x;
    float my = m.y;
    
   if(mousePressed&&!mdown){
    mdown = true; 
    dx = center.x - mx;
    dy = center.y - my;
   }
    
   if(mdown){
     center.x = mx + dx;
     center.y = my + dy;
   }
     update_Boundaries();
   if(!mousePressed){
     mdown = false;
     
   }
   
  };
  
  public void functions(){
      debug();
      if(!edit&&!open_menus&&!pallete.pos()&&open&&!palletehide.pos()){
    if (toggle)create();
    else if (square)createtabRect();
    else if(circle)create_circle();
    else if(tri)createtab_tri();
    else if(bezier)create_bezier();
    else if(poligon)create_poligon();
    else if(complex)create_complex_poligon();
    else if(connectedlines)connectedLines();
    else if(path)drawPath();
    else if(spline){
      
    }}
  
  };
  
    public boolean pos(tabBoundary a,PVector p){
      float X = p.x;
      float Y = p.y;
      boolean k = false;
      trit = 0;
      if(a.type==0){
            
            float mx = abs((a.x2-a.x1))/2;
            float my = abs((a.y2-a.y1))/2;
            
            float A = sq(X - a.center.x);
            float B = sq(Y - a.center.y);
            
            float C = sq(mx);
            float D = sq(my);
            return A/C + B/D <1;
            
        } if(a.type==2){
        return check_lineP(new PVector(a.x1,a.y1),new PVector(a.x2,a.y2),new PVector(X,Y));
      }
       if(a.type==4||a.type==3||a.type==103||a.type==201){
        
        for(int i=0;i<a.Boundaries.size();i++){
          
          tabBoundary b = a.Boundaries.get(i);
          
          tabBoundary A = new tabBoundary((b.x1 + b.x2)/2,(b.y1 + b.y2)/2,X,Y);
          //line((b.x1 + b.x2)/2,(b.y1 + b.y2)/2,X,Y);
          for(int j=0;j<a.Boundaries.size();j++){
            
            tabBoundary C = a.Boundaries.get(j);
            
            PVector i1 = check_intersect(A,C);
            
            if(i1!=null&&i!=j){
              trit++;
              
            }}}
            if(trit>0)k = false;
            else k = true;
        }
      return k;
      
    };
    
    public boolean check_lineP(PVector a, PVector b,PVector c){
    
    boolean k = false;
    float d1 = dist(a.x,a.y,b.x,b.y);
    float d2 = dist(a.x,a.y,c.x,c.y);
    float d3 = dist(b.x,b.y,c.x,c.y);
    float d4 = d2 + d3;
    
    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f){
      k = true;
    }
    return k;
  };
  
  public boolean check_lineP(float x1, float y1,float x2,float y2, PVector c){
    
    boolean k = false;
    float d1 = dist(x1,y1,x2,y2);
    float d2 = dist(x1,y1,c.x,c.y);
    float d3 = dist(x2,y2,c.x,c.y);
    float d4 = d2 + d3;
    
    if(d4 <= d1 + 0.05f && d4 >= d1 - 0.05f){
      k = true;
    }
    return k;
  };
  
  public void drag(){
  };
  
  public boolean pospoint(tabBoundary a,int n){
    float X = mouseX;
    float Y = mouseY;
    
    boolean k = false;
    
    for(int i=0;i<a.Boundaries.size();i++){
      tabBoundary b = a.Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,X,Y);
      float d2 = dist(b.x2,b.y2,X,Y);
      
    if(d1<5){
      k = true;
    }
      
      if(d2<5){
        k = true;
    }}
    return k;
    };
  
  public void pospoint(tabBoundary a){
    float X = mouseX;
    float Y = mouseY;
    
    t = 0;
    
    boolean k = false;
    //if(!a.linedown){
    for(int i=0;i<a.Boundaries.size();i++){
      tabBoundary b = a.Boundaries.get(i);
      
      float d1 = dist(b.x1,b.y1,X,Y);
      float d2 = dist(b.x2,b.y2,X,Y);
      
    if(d1<5){
      strokeWeight(5);
      stroke(255);
      point(b.x1,b.y1);
      if(mousePressed&&!point1&&!a.point1){
        
        t++;
        vert = i;
        index = a.id;
        point1 = true;
        a.point1 = true;
        a.pdown = true;
        pdown = true;
      }}
      
      if(d2<5){
      strokeWeight(5);
      stroke(255);
      point(b.x2,b.y2);
      if(mousePressed&&!point2&&!a.point2){
        
        t++;
        vert1 = i;
        index = a.id;
        point2 = true;
        a.point2 = true;
        a.pdown = true;
        pdown = true;
      }}
      if(point1&&vert>=0&&index==a.id){
        tabBoundary c = a.Boundaries.get(vert);
        c.x1 = X;
        c.y1 = Y;
      }
      if(point2&&vert1>=0&&index==a.id){
        tabBoundary c = a.Boundaries.get(vert1);
        c.x2 = X;
        c.y2 = Y;
      }
      if(a.type==2){
        a.x1 = b.x1;a.y1 = b.y1;
        a.x2 = b.x2;a.y2 = b.y2;
      }
      if(a.type==4){
        
          if(vert==0)a.x1 = b.x1;
          if(vert==1)a.x2 = b.x1;
          if(vert==2)a.x3 = b.x1;
          if(vert==3)a.x4 = b.x1;
          
          if(vert1==0)a.x2 = b.x2;
          if(vert1==1)a.x3 = b.x2;
          if(vert1==2)a.x4 = b.x2;
          if(vert1==3)a.x1 = b.x2;
        }
      if(a.type==3||a.type==103){
        if(vert==0)a.x1 = b.x1;a.y1 = b.y1;
        if(vert==1)a.x2 = b.x1;a.y2 = b.y1;
        if(vert==2)a.x3 = b.x1;a.y3 = b.y1;
        
        if(vert1==0)a.x2 = b.x2;a.y2 = b.y2;
        if(vert1==1)a.x3 = b.x2;a.y3 = b.y2;
        if(vert1==2)a.x1 = b.x2;a.y1 = b.y2;
     
    }}
      
    if(t>0){
      k = true;
      hover = true;
    }
    if(!mousePressed){
      a.update_dist(a.Boundaries);
      a.calc_center();
      a.create_rotation_points(a.Boundaries);
      a.update_angles();
    }
    if(!mousePressed){
      
      vert = -1;
      vert1 = -1;
      index = -1;
      point1 = false;
      point2 = false;
      a.point2 = false;
      a.point1 = false;
      uindex = a.id;
      updatep = true;
      a.pdown = false;
      pdown = false;
      
    }
  };
  
  public void update_dist(ArrayList<tabBoundary> a){
   
    
    for(int i=0;i<a.size();i++){
      
      tabBoundary b = a.get(i);
      int id = b.id;
      //float Dist = dist.get
      float dx = (b.x1 - center.x);
      float dy = (b.y1 - center.y);
      float d  = dist(b.x1,b.y1,center.x,center.y);
      Float [] d1 = {dx,dy};
      
      if(dist.size()==Boundaries.size()){dist.set(i,d);}
      else {dist.add(d);}
      if(pdist.size()==Boundaries.size()*2)pdist.set(i,d1);
      else pdist.add(d1);
    }
  };
  
  public void move(tabBoundary a,PVector p){
    float mx = p.x;
    float my = p.y;
    
    boolean down = false;
    
    for (int i=0;i<a.Boundaries.size();i++){
      
      tabBoundary b = a.Boundaries.get(i);
      
     float d1 = dist(b.x1,b.y1,mx,my);
     float d2 = dist(b.x2,b.y2,mx,my);
     
    boolean k = check_lineP(b.x1,b.y1,b.x2,b.y2,new PVector(mx,my));
    if(k&&!linedown&&d1>6&&d2>6&&!point1&&!point2&&mousePressed&&!a.linedown){
      vert3 = i;
      sid = a.id;
      D1 = d1;
      D2 = d2;
      T1 = atan2(b.y2 - b.y1,b.x2 - b.x1);
      T2 = atan2(b.y1 - b.y2,b.x1 - b.x2);
      
      linedown = true;
      a.linedown = true;
    }}
    
    if(linedown && sid==a.id && a.linedown&&a.Boundaries.size()>0){
      
      tabBoundary b   = a.Boundaries.get(vert3);
      tabBoundary b_1 = a.Boundaries.get(0);
      tabBoundary bp1 = a.Boundaries.get(0);
      
      if(vert3>0)b_1 = a.Boundaries.get(vert3-1);
      else if(a.type!=106)b_1 = a.Boundaries.get(a.Boundaries.size()-1);
      if(vert3<a.Boundaries.size()-1)bp1 = a.Boundaries.get(vert3+1);
      else if(a.type!=106)bp1 = a.Boundaries.get(0);
      
      stroke(255,0,0);
      PVector p1 = new PVector( mx + D2 * cos(T1),my + D2 * sin(T1));
      PVector p2 = new PVector( mx + D1 * cos(T2),my + D1 * sin(T2));
      //line(p1.x,p1.y,p2.x,p2.y);
      
      b.x2 = p1.x;
      b.y2 = p1.y;
      b.x1 = p2.x;
      b.y1 = p2.y; 
      
      b_1.x2 = p2.x;
      b_1.y2 = p2.y;
      bp1.x1 = p1.x;
      bp1.y1 = p1.y;
      
    }
    
    if(!mousePressed&&a.linedown){
      D1 = 0;D2 = 0;T1 = 0;T2 = 0;vert3 = -1;sid = -1;down = false;
      a.update_dist(a.Boundaries);
      uindex = a.id;
      updatep = true;
      linedown = false;
      a.linedown = false;
    }
  };
  
  public void create_circle(){
    float ax = mouseX;
    float ay = mouseY;
    
    tabBoundary n;
    if (circle&&!menudown&&mousePressed&&mouseButton == LEFT){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(1);
      stroke(col);
      ellipseMode(CORNER);
      ellipse(temp.get(0).x,temp.get(0).y,dx,dy);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      tabBoundary a = new tabBoundary(temp.get(0).x,temp.get(0).y,dx,dy,0);
      a.id = Boundaries.size();
      Boundaries.add (a);
      //scene.Boundaries.add (a);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      mdown = false;
      
      }}
  };
  
  public void create(){
    
    float ax = mouseX;
    float ay = mouseY;
    
    tabBoundary n;
    
    
      if (toggle&&!menudown&&mousePressed&&!open_menus&&mouseButton == LEFT){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
      
      temp.add(new PVector(ax,ay));
      
      line(temp.get(0).x,temp.get(0).y,temp.get(temp.size()-1).x,temp.get(temp.size()-1).y);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      n = new tabBoundary(temp.get(0).x,temp.get(0).y,temp.get(temp.size()-1).x,temp.get(temp.size()-1).y,2);
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2(temp.get(temp.size()-1).y - temp.get(0).y,temp.get(temp.size()-1).x - temp.get(0).x));
      norm.add(atan2(temp.get(temp.size()-1).x - temp.get(0).x, temp.get(temp.size()-1).y - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      
      }mdown = false;
    }
  };
  
  public void createtab_tri(){
    
    float ax = mouseX;
    float ay = mouseY;
    
    tabBoundary n;
    float d;
    
    if (tri&&mousePressed&&!open_menus&&shapes.toggle==0&&mouseButton == LEFT){
       
      mdown = true;
      ax = mouseX;
      ay = mouseY;
      
      temp.add(new PVector(ax,ay));
      d = dist(ax,ay,temp.get(0).x,temp.get(0).y);
      
      float Norm = -atan2(temp.get(0).x - ax,temp.get(0).y - ay);
      
      float X2 = ax + d/1.5f * cos(Norm);
      float Y2 = ay + d/1.5f * sin(Norm);
      float X3 = ax - d/1.5f * cos(Norm);
      float Y3 = ay - d/1.5f * sin(Norm);
      
      beginShape();
      stroke(255);
      fill(0);
      
      vertex(temp.get(0).x,temp.get(0).y);
      vertex(X2,Y2);
      vertex(X3,Y3);
      endShape(CLOSE);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      n = new tabBoundary(temp.get(0).x,temp.get(0).y,ax,ay,3);
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2(temp.get(temp.size()-1).y - temp.get(0).y,temp.get(temp.size()-1).x - temp.get(0).x));
      norm.add(atan2(temp.get(temp.size()-1).x - temp.get(0).x, temp.get(temp.size()-1).y - temp.get(0).y));
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      temp = new ArrayList<PVector>();
      
      }mdown = false;
    }
  };
  
  public void createtabRect(){
    
    float ax = mouseX;
    float ay = mouseY;
    
    tabBoundary n;
    if (square&&!menudown&&mousePressed&&!open_menus&&shapes.toggle==0&&mouseButton == LEFT){
      
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(20);
      stroke(0);
      point(ax,ay);
      strokeWeight(1);
      stroke(col);
      rect(temp.get(0).x,temp.get(0).y,dx,dy);
      }
      if(mdown&&!mousePressed&&!point1&&!point2){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
      tabBoundary a = new tabBoundary(temp.get(0).x,temp.get(0).y,dx,dy,4);
      a.id = Boundaries.size();
      Boundaries.add (a);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      
      }}
  };
  
  public void create_poligon(){
    float ax = mouseX;
    float ay = mouseY;
    
    tabBoundary n;
    
    Sides.draw();
    sides = PApplet.parseInt(Sides.value);
    if(sides>0){
      
    if (mousePressed&&mcount==0&&!complexsub.pos()){
      
      mdown = true;
      ax = mouseX;
      ay = mouseY;
       
      temp.add(new PVector(ax,ay));
      dx = ax - temp.get(0).x;
      dy = ay - temp.get(0).y;
       
      strokeWeight(20);
      stroke(0);
      point(ax,ay);
      strokeWeight(1);
      stroke(col);
      beginShape();
      
      float X = (temp.get(0).x + ax)/2;
      float Y = (temp.get(0).y + ay)/2;
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        
        float w = abs((temp.get(0).x - ax))/2;
        float h = abs((temp.get(0).y - ay))/2;
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        vertex(a.x,a.y);
        
        //vertex(X + w * cos(theta2),Y + h * sin(theta2));
        
      }
      endShape(CLOSE);
      }
      if(mdown&&!mousePressed){
        
      if((temp.get(0).x!=temp.get(temp.size()-1).x&&temp.get(0).y!=temp.get(temp.size()-1).y)){
        n = new tabBoundary(temp.get(0).x,temp.get(0).y,ax,ay,201);
        float X = (temp.get(0).x + ax)/2;
        float Y = (temp.get(0).y + ay)/2;
        n.center = new PVector(X,Y);
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        float theta2 = radians(360/sides*(i+1));
        
        float w = abs((temp.get(0).x - ax))/2;
        float h = abs((temp.get(0).y - ay))/2;
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        PVector b = new PVector(X + w * cos(theta2),Y + h * sin(theta2));
        //vertex(a.x,a.y);
        n.Boundaries.add(new tabBoundary(a.x,a.y,b.x,b.y));
        
      }
      
      n.id = Boundaries.size();
      Boundaries.add (n);
      theta.add(atan2((temp.get(0).y + dy) - temp.get(0).y,(temp.get(0).x + dx) - temp.get(0).x));
      norm.add(atan2((temp.get(0).x + dx) - temp.get(0).x, (temp.get(0).y + dy) - temp.get(0).y));
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      
      }}}else text("Please define number of sides",100,100);
  };
  
  public void create_bezier(){
    
  };
  
  public void create_complex_poligon(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){mcount = 0;}
    //text(x + "         " + scene.x + "          " + scene.w,100,110);
    if(complex){
      
      complexsub.draw();
      
      for(int i=0;i<ogrid.size();i++){
          Point a = ogrid.get(i);
          
          a.draw();
        }
      
      if(mousePressed&&mcount==0&&!complexsub.pos())mdown = true;
      else mdown = false;
      if(mdown) mcount++;
      if(mousePressed&&complexsub.pos())cfinish = true;
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        counter++;
        if(!complexsub.pos())grid.add(new Point(floor(mx/sw)*sw,floor(my/sh)*sh,counter));
        polymidpoint = new PVector(0,0);
        ogrid = new ArrayList<Point>();
        for(int i=0;i<grid.size();i++){
          Point a = grid.get(i);
          boolean b = ugrid.contains(a);
          
          if(!b){
            ugrid.add(a);
            polymidpoint.x += a.x;
            polymidpoint.y += a.y;
          }}polymidpoint.div(grid.size());}
          
            sortpoints(grid,ugrid,ogrid,polymidpoint);
  
        if(ogrid.size()>1&&!cfinish){
          for(int i=0;i<ogrid.size();i++){
          Point a = ogrid.get(i);
          int pos = 0;
            
          if(i<ogrid.size()-1){
            pos = i+1;
          }
          else{
            pos = 0;
          }
          
          Point b = ogrid.get(pos);
          stroke(0);
          strokeWeight(1);
          line(b.x,b.y,a.x,a.y);
          
        }}
        
        strokeWeight(20);
        stroke(0);
        point(polymidpoint.x,polymidpoint.y);
        strokeWeight(1);
        }
        
        if(cfinish){
          
          Boundaries.add(new tabBoundary(ogrid));
          
          ogrid = new ArrayList<Point>();
          grid = new ArrayList<Point>();
          ugrid = new ArrayList<Point>();
          
          cfinish = false;
        }
    
  };
  
  public void connectedLines(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){
      mcount = 0;
      pointadded = false;
    }
    if(connectedlines){
      complexsub.draw();
      
      if(mousePressed&&mcount==0&&!complexsub.pos())mdown = true;
      else mdown = false;
      if(mousePressed&&complexsub.pos())cfinish = true;
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        if(!complexsub.pos()){
          Point a = new Point(floor(mx/sw)*sw,floor(my/sh)*sh,grid.size());
          Point b;
          boolean k = grid.contains(a);
          if(grid.size()==0)grid.add(a);
          else{
            b = grid.get(grid.size()-1);
            if(b.x!=a.x||b.y!=a.y)grid.add(a);
          }}
        //pointadded = true;
      }
        for(int i=grid.size()-1;i>-1;i--){
          Point a = grid.get(i);
          
          a.draw();
          
        if(grid.size()>1&&!cfinish){
          int pos = 0;
            
          if(i<grid.size()-1)pos = i+1;
          
          Point b = grid.get(pos);
          stroke(0);
          strokeWeight(1);
          if(i<grid.size()-1)line(b.x,b.y,a.x,a.y);
          
        }}
        
        if(cfinish){
          
          if(grid.size()>0)Boundaries.add(new tabBoundary(grid,0));
          
          grid = new ArrayList<Point>();
          
          cfinish = false;
          mdown = false;
        }}
        strokeWeight(1);
  };
  
  public void drawPath(){
    //mcount = 0;
    float mx = mouseX;
    float my = mouseY;
    
    float sw = w/cols, sh = h/rows;
    if(!mousePressed){
      mcount = 0;
      pointadded = false;
    }
    if(path){
      complexsub.draw();
      
      if(mousePressed&&mcount==0&&!complexsub.pos())mdown = true;
      else mdown = false;
      if(mousePressed&&complexsub.pos())cfinish = true;
      else if(!mousePressed)cfinish = false;
      
      if(mdown){
        
        if(!complexsub.pos()){
          Point a = new Point(floor(mx/sw)*sw,floor(my/sh)*sh,grid.size());
          Point b;
          boolean k = grid.contains(a);
          if(grid.size()==0)grid.add(a);
          else{
            b = grid.get(grid.size()-1);
            if(b.x!=a.x||b.y!=a.y)grid.add(a);
          }}
        //pointadded = true;
      }
        for(int i=grid.size()-1;i>-1;i--){
          Point a = grid.get(i);
          
          a.draw();
          
        if(grid.size()>1&&!cfinish){
          int pos = 0;
            
          if(i<grid.size()-1)pos = i+1;
          
          Point b = grid.get(pos);
          stroke(0);
          strokeWeight(1);
          if(i<grid.size()-1)line(b.x,b.y,a.x,a.y);
          
        }}
        
        if(cfinish){
          
          if(grid.size()>0)Boundaries.add(new tabBoundary(grid,0));
          
          grid = new ArrayList<Point>();
          
          cfinish = false;
          mdown = false;
        }}
        strokeWeight(1);
  };
  
  public void create_free(){
    
  };
  
  public Boolean posWindow(){
    
    float mx = mouseX;
    float my = mouseY;
    
    return(mx>x1&&mx<x2&&my>y1&&my<y2);
    
  };
  
  public void mass_Center(){
    
    ccount = 0;
    PVector Center = new PVector(0,0);
    if(center == null|| center !=Center){
    for(int i=0;i<Boundaries.size();i++){
      
      tabBoundary a = Boundaries.get(i);
      PVector midp = new PVector((a.x1+a.x2)/2,(a.y1+a.y2)/2);
      Center.add(midp);
      Midpoints.add(midp);
      ccount++;
    }
  if(ccount==Boundaries.size())center = Center;
  }
};
    
};

  public PVector check_intersect(tabBoundary a, tabBoundary b){

    float a1 = a.y2 - a.y1;
    float b1 = a.x1 - a.x2;
    float c1 = a1 * a.x1 + b1 * a.y1;
    float a2 = b.y2 - b.y1;
    float b2 = b.x1 - b.x2;
    float c2 = a2 * b.x1 + b2 * b.y1;
    float denom = a1 * b2 - a2 * b1;
    
    if((a.x1==b.x1||a.x2==b.x2)&&(a.y1==b.y1||a.y2==b.y2)){
      
      return null;
    }
     else{
        
    Float X = (b2 *c1 - b1 * c2) / denom;
    Float Y = (a1 *c2 - a2 * c1) / denom;
    
    PVector p = new PVector(X,Y);   
      boolean Linea = ((p.x<a.x1&&p.x>a.x2)||(p.x>a.x1&&p.x<a.x2))||((p.y<a.y1&&p.y>a.y2)||(p.y>a.y1&&p.y<a.y2));
      boolean Lineb = ((p.x<b.x1&&p.x>b.x2)||(p.x>b.x1&&p.x<b.x2))||((p.y<b.y1&&p.y>b.y2)||(p.y>b.y1&&p.y<b.y2));
      boolean Linec = (p.x!=a.x1&&p.x!=a.x2)&&(p.y!=a.y1&&p.y!=a.y2);
      
      Linec = (dist(p.x,p.y,a.x1,a.y1)>0.5f&&dist(p.x,p.y,a.x1,a.y1)>0.5f);
        if(Linec&&Linea&&Lineb){
            //strokeWeight(20);
            //  stroke(0);
            //  point(p.x,p.y);
            //  strokeWeight(1);
        return p;
      }
      else{
      return null;
      }}
  };
  
  public PVector check_intersect2(tabBoundary a, tabBoundary b){

    float a1 = a.y2 - a.y1;
    float b1 = a.x1 - a.x2;
    float c1 = a1 * a.x1 + b1 * a.y1;
    float a2 = b.y2 - b.y1;
    float b2 = b.x1 - b.x2;
    float c2 = a2 * b.x1 + b2 * b.y1;
    float denom = a1 * b2 - a2 * b1;
    
    Float X = (b2 *c1 - b1 * c2) / denom;
    Float Y = (a1 *c2 - a2 * c1) / denom;
    
    PVector p = new PVector(X,Y);   
      boolean Linea = ((p.x<=a.x1&&p.x>=a.x2)||(p.x>=a.x1&&p.x<=a.x2))||((p.y<=a.y1&&p.y>=a.y2)||(p.y>=a.y1&&p.y<=a.y2));
      boolean Lineb = ((p.x<=b.x1&&p.x>=b.x2)||(p.x>=b.x1&&p.x<=b.x2))||((p.y<=b.y1&&p.y>=b.y2)||(p.y>=b.y1&&p.y<=b.y2));
      boolean Linec = (p.x==a.x1||p.x==a.x2)||(p.y==a.y1||p.y==a.y2);
      boolean Lined = (p.x==b.x1||p.x==b.x2)&&(p.y==b.y1||p.y==b.y2);
        if(Linea&&Lineb||Linec){
        return p;
      }
      else{
      return null;
      }
  };
  
  class tabConnection{
    float d,e,x,y;
    //ArrayList<Integer[]> vertex = new ArrayList<Integer[]>();
    PVector c;
    
    tabConnection(PVector C){
      c = C;
      x = c.x;
      y = c.y;
      
    };
    
    
  };
  
  
  class tabRect{
    
    float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
    boolean border, dashed,connected;
    PVector pos,vel,ac;
    int bg,str;
    tabBoundary rect;
    
    tabRect(float xx,float yy,float ww,float hh){
      x = xx;
      y = yy;
      h = hh;
      w = ww;
      
      rect = new tabBoundary(xx,yy,ww,hh,4);
    };
    
    public void draw(){
      
    }
    
  };
  
  class tab_tri{
    
    float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
    boolean border, dashed,connected,fill = true;
    PVector pos,vel,ac;
    int bg = color(0,180),str = color(0);
    tabBoundary tri;
    Human parent;
    
    tab_tri(float xx,float yy,float ww,float hh){
      x = xx;
      y = yy;
      h = hh;
      w = ww;
      
      tri = new tabBoundary(x,y,10,20,103);
    };
    tab_tri(){
    };
    
    public void draw(){
      beginShape();
      stroke(str);
      if(!border)noStroke();
      fill(bg);
      if(parent!=null)fill(parent.col);
      if(!fill)noFill();
      
      for(int i=0;i<tri.Boundaries.size();i++){
        tabBoundary b = tri.Boundaries.get(i);
        vertex(b.x1,b.y1);
        //vertex(b.x1,b.y1);
      }
      endShape(CLOSE);
    }
    public void update(){
    for(int i=0;i<tri.Boundaries.size();i++){
        tabBoundary b = tri.Boundaries.get(i);
        
        b.create_rotation_points(tri.Boundaries);
        b.update_dist(tri.Boundaries);
        b.update_angles();
        b.create_angles(tri.Boundaries);
      }
  };
  
  public boolean pos(PVector a){
    boolean k = false;
    
    if(tri.pos(tri,a))k = true;
    return k;
  }
  };
  
  
  
   class tabEllipse{
    
    float x,y,w,h,mass,density,viscoscity,friction,moment,vx,vy,ax,ay;
    boolean border, dashed,connected;
    PVector pos,vel,ac;
    int bg,str;
    tabBoundary ellipse;
    
    tabEllipse(float xx,float yy,float ww,float hh){
      x = xx;
      y = yy;
      h = hh;
      w = ww;
      
      ellipse = new tabBoundary(xx,yy,ww,hh,2);
    };
    
    public void draw(){
      
    }
    
  };

  
 class tabPoligon extends tabBoundary{
    
    tabPoligon(float xx,float yy,float ww,float hh,int _sides){
      
    sides = _sides;
    x1 = xx;
    y1 = yy;
    w = ww;
    h = hh;
    ax = xx + ww;
    ay = yy + hh;
    
    tabBoundary n;
    
    Sides.draw();
    sides = PApplet.parseInt(Sides.value);
    
        n = new tabBoundary(xx,yy,ax,ay,201);
        
        float X = (xx + w)/2;
        float Y = (yy + h)/2;
        
        n.center = new PVector(X,Y);
      
      for(int i=0;i<sides;i++){
       
        float theta = radians(360/sides*i);
        float theta2 = radians(360/sides*(i+1));
        
        PVector a = new PVector(X + w * cos(theta),Y + h * sin(theta));
        PVector b = new PVector(X + w * cos(theta2),Y + h * sin(theta2));
        //vertex(a.x,a.y);
        n.Boundaries.add(new tabBoundary(a.x,a.y,b.x,b.y));
        
      }
      
      n.id = Boundaries.size();
      Boundaries.add (n);
      
      theta.add(atan2((y1 + hh) - y1,(x1 + ww) - x1));
      norm.add(atan2((x1 + ww) - x1, (y1 + hh) - y1));
      
      temp = new ArrayList<PVector>();
      Float [] vel = {0.0f,0.0f};
      
      velocity.add(vel);
      velocitypv.add(new PVector(0,0));
      mdown = false;
      
      }
      
    };
class horizontaltabs extends tab {
  float x, y, w, h;
  String itemLabel;

  ArrayList<tab> tabs = new ArrayList<tab>();
  horizontaltabs parentnavh;
  verticaltabs parentnavv;
  horizontaltabs childnavh;
  verticaltabs childnavv;

  Window currentWindow = null;
  int windex = -1;
  //boolean navigator;

  horizontaltabs(float x, float y, float w, float h, float W, String [] titles) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    //canvas = createCanvas(w,h);
    for (int i=0; i<titles.length; i++) {

      String s = titles[i];

      tab t = new tab(x + W * i, y, w, h, s);
      Button b = new Button(x + w * i, y, w, 20);
      b.border = false;
      t.buttons.add(b);

      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
    sliderh.tooltip = null;
  };

  horizontaltabs(float x, float y, float w, float h, String [] titles) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    //canvas = createCanvas(w,h);
    for (int i=0; i<titles.length; i++) {

      String s = titles[i];

      tab t = new tab(x + w * i, y, w, h, s);
      //t.buttons.add(new Button(x + w * i,y,w,20,s));
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
    sliderh.tooltip = null;
  };
  

  horizontaltabs(float x, float y, float w, float h, float W, int n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    //canvas = createCanvas(w,h);
    for (int i=0; i<n; i++) {

      tab t = new tab(x + W * i, y, w, h);
      //t.buttons.add(new Button(x + W * i,y,w,20));
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
    sliderh.tooltip = null;
  };

  horizontaltabs(float x, float y, float w, float h, int n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    //canvas = createCanvas(w,h);
    for (int i=0; i<n; i++) {

      tab t = new tab(x + w * i, y, w, h);
      t.buttons.add(new Button(0 + w * i, 0, w, 20));
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
    sliderh.tooltip = null;
  };

  horizontaltabs(float x, float y, float w, horizontaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w;
    //this.h = h;
    parentnavh = n;
    //canvas = createCanvas(w,n.h);
    //canvas = createCanvas(w,h);
    for (int i=0; i<n.tabs.size(); i++) {
      String s = n.tabs.get(i).label;
      tab t = new tab(0, 0, w, h, s);
      t.parent = n.tabs.get(i);

      tabs.add(t);
      n.tabs.get(i).child = tabs.get(tabs.size()-1);
    }

    sliderv = new Slider(w-10, 20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(0, h-10, w-10, 10);
    sliderh.tvisible = false;
    n.childnavh = this;
    sliderh.tooltip = null;
  };

  horizontaltabs(float x, float y, float w, float h, horizontaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w ;
    this.h = h;
    parentnavh = n;
    
    canvas = createCanvas(w,h);
    
    for (int i=0; i<n.tabs.size(); i++) {
      
      String s = n.tabs.get(i).label;
      
      tab t = new tab(0, 0, w, h, s);
      t.parent = n.tabs.get(i);

      tabs.add(t);
      n.tabs.get(i).child = tabs.get(tabs.size()-1);
    }

    sliderv = new Slider(w-10, 20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(0, h-10, w-10, 10);
    sliderh.tvisible = false;
    sliderh.tooltip = null;
    n.childnavh = this;
  };

  horizontaltabs(float x, float y, float w, verticaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    parentnavv = n;

    for (int i=0; i<n.tabs.size(); i++) {
      String s = n.tabs.get(i).label;
      tab t = new tab(x + w * i, y, w, h, s);
      t.parent = n.tabs.get(i);
      tabs.add(t);
      n.tabs.get(i).child = tabs.get(tabs.size()-1);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
    sliderh.tooltip = null;
    n.childnavh = this;
  };

  horizontaltabs(float x, float y, float w, float h, verticaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    parentnavv = n;

    for (int i=0; i<n.tabs.size(); i++) {
      String s = n.tabs.get(i).label;
      tab t = new tab(x + w * i, y, w-40, h-40, s);
      t.parent = n.tabs.get(i);
      tabs.add(t);
      n.tabs.get(i).child = tabs.get(tabs.size()-1);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
    sliderh.tooltip = null;
    n.childnavh = this;
  };
  
  public void displayTabs() {
    fill(255);

    //if(childnavh!=null){
    //  text("Navigator h",x,y);
    //if(toggle)childnavh.toggle=true;
    //else childnavh.toggle = false;

    //childnavh.displayTabs();
    //}
    //if(childnavv!=null){
    //  //text("Navigator v",x,y);
    //if(toggle)childnavv.toggle=true;
    //else childnavv.toggle = false;

    //childnavv.displayTabs();
    //}
    tabindex = -1;
    logic();
    //canvas.beginDraw();
    if (toggle&&canvas!=null) {
      
      canvas.beginDraw();
      mouse = getMouse();
      
      for (int i=0; i<tabs.size(); i++) {
        tab t1 = tabs.get(i);
        tab t = t1.states.get(t1.state);
        if (t.toggle&&t.windows.get(0).toggle)currentWindow = t.windows.get(0);
        if (t.visible) {
          t.toggle = true;
          tabindex = i;
        }
        ////else if(tabindex>0)t.toggle = false;
        //if(t.toggle&&t.title.toggle==0)t.title.toggle = 1;

        //if (t.toggle)t.title.toggle=1;
        //else t.title.toggle = 0;
        if(t1.toggle){t.visible=true;t.toggle=true;t.title.toggle=1;}
        if(t.title.toggle!=1&&(t.toggle||t.visible)){t.toggle=true;t.visible = true;t.title.toggle=1;}
        
        if(!t.visible){t.toggle = false;}
        if (t.title.toggle==0&&t.toggle) {

          t.toggle= false;
          t.visible = false;
        } else if (t.title.toggle==1&&!t.toggle) {
        }

        if (t.title.pos()&&mousePressed)sliderset = false;

        else if ((t.title.pos()||t.posTab())&&mousePressed&&t.visible) {
          current = i;
          setTab = true;
        }

        if (t.child!=null&&t.displayChild) {
          if (t.visible||t.title.toggle==1) {
            //t.child.visible = true;
            //t.child.displayTabs();
          } else if (!t.visible) t.child.visible = false;
        }
        //if(t.toggle)
        t.displayTabs();
      }

      if (setTab) {
        tabindex = current;
        setTab = false;
      }
      //
      displayNavv();
      displayWindow();
      
      canvas.endDraw();
      image(canvas,x,y);
      displayNavh();
    }else canvas = createCanvas(w,h);
  };

  public void displayTabs_() {
    fill(255);

    //if(childnavh!=null){
    //  text("Navigator h",x,y);
    //if(toggle)childnavh.toggle=true;
    //else childnavh.toggle = false;

    //childnavh.displayTabs();
    //}
    //if(childnavv!=null){
    //  //text("Navigator v",x,y);
    //if(toggle)childnavv.toggle=true;
    //else childnavv.toggle = false;

    //childnavv.displayTabs();
    //}
    
    tabindex = -1;
    logic();
    if (toggle) {
      for (int i=0; i<tabs.size(); i++) {

        tab t = tabs.get(i);
        if (t.toggle&&t.windows.get(0).toggle)currentWindow = t.windows.get(0);
        if (t.visible) {
          t.toggle = true;
          tabindex = i;
          t.title.toggle = 1;
          t.title.draw();
        }
        if (t.title.pos()&&mousePressed)sliderset = false;
        else if ((t.title.pos()||t.posTab())&&mousePressed&&t.visible) {
          current = i;
          setTab = true;
        }

        if (t.child!=null&&t.displayChild) {
          if (t.visible||t.title.toggle==1) {
            //t.child.visible = true;
            //t.child.displayTabs();
          } else if (!t.visible) t.child.visible = false;
        }
        //if(t.toggle)
        t.displayTabs();
      }

      if (setTab) {
        tabindex = current;
        setTab = false;
      }
      displayNavh();
      displayNavv();
      displayWindow();
    }
  };

  public void displayNavh() {

    if (navigatorh!=null&&tabindex>-1) {

      setTabsh();
      navigatorh.canvas.beginDraw();
      navigatorh.canvas.background(50);
      navigatorh.mouse = new PVector(mouse.x - navigatorh.x,mouse.y-navigatorh.y);
      
      if(current_tab!=null)current_tab.mouse2 = navigatorh.mouse;
      if(previous_tab!=null)previous_tab.mouse2 = navigatorh.mouse;
      if(next_tab!=null)next_tab.mouse2 = navigatorh.mouse;
      //--------------------------------------------------------------
      
      float v = map(sliderh.value, -navigatorh.w/2, navigatorh.w/2, 0, navigatorh.w*2);

      current_tab.w = v;
      current_tab.x = sliderh.value ;
      current_tab.title.x = 0;
      
      if (current_tab.x<=10) {
        current_tab.x = 0;
        current_tab.title.x = 0;
        
      }
      //if (current_tab.x + current_tab.w >navigatorh.w)current_tab.w =   navigatorh.w - current_tab.x;

      if (current_tab.title!=null)current_tab.title.w = v;
      
      //-------------------------------------------------------------
      if (previous_tab!=null) {
        previous_tab.x = 0;

        float value = (current_tab.x);
        if(value>navigatorh.w)previous_tab.x = 0+value*2;
        
        if (previous_tab!=null&&previous_tab.title!=null) {
          previous_tab.title.x = previous_tab.x;
          previous_tab.title.w = value;
        }
        previous_tab.displayTabs(navigatorh.canvas);
      }
      //----------------------------------------------------------------
      current_tab.displayTabs(navigatorh.canvas);
      //current_tab.title.mouse = navigatorh.mouse;
      //current_tab.title.draw(navigatorh.canvas);
      //----------------------------------------------------------------
      if (next_tab!=null&&(!next_tab.visible || !next_tab.toggle)) next_tab = null;
      else if (next_tab!=null&&next_tab.visible && next_tab.toggle) {
        
        next_tab.x = v;
        
        if(next_tab.x+textWidth(next_tab.label)>=navigatorh.w){
          
        }
        float value = (sliderh.x + sliderh.w) - (current_tab.x + current_tab.w );
        //if (value>)
        next_tab.w = value + 10;

        if (next_tab.title!=null) {
          
          next_tab.title.w = value;
          next_tab.title.mouse = navigatorh.mouse;
        } 
        
        next_tab.displayTabs(navigatorh.canvas);
      }
      current_tab.w =  navigatorh.w;
      
      if (current_tab.title!=null)current_tab.title.w = navigatorh.w;

      if (navigatorh!=null&&navigatorh.visible) {
        if (toggle) {
          navigatorh.toggle = true;
          navigatorh.visible = true;
        } else {
          navigatorh.toggle = false;
          navigatorh.visible = false;
        }
      }
      //println(navigatorh.x,navigatorh.y,x,y);
      sliderControl(navigatorh.canvas);
      //navigatorh.canvas.fill(0);
      //navigatorh.canvas.ellipse(mouseX-navigatorh.x,mouseY-navigatorh.y,25,25);
      navigatorh.canvas.endDraw();
      
      
      image(navigatorh.canvas,navigatorh.x,navigatorh.y);
      fill(255);
      //ellipse(mouseX,mouseY,20,20);
      
    }

    //-----------------------------------------------------------------
  };

  public void displayNavv() {
    if (tabindex!=-1) {
      if (navigatorv!=null) {

        setTabsv();

        if (navigatorv.visible) {
          if (toggle) {
            navigatorv.toggle = true;
            navigatorv.visible = true;
          } else {
            navigatorv.toggle = false;
            navigatorv.visible = false;
          }
        }

        sliderControl(canvas);
      }
    }
  };
  
  public void logic(){
    //if(open){
    //  for(int i =0;i<tabs.size();i++){
    //    tab t = tabs.get(i);
    //    t.toggle = true;
    //    t.visible = true;
    //  }
    //}else{
    //  for(int i =0;i<tabs.size();i++){
    //    tab t = tabs.get(i);
    //    t.toggle = false;
    //    t.visible = false;
    //  }
    //}
  };

  public void setTabsv() {



    if (navigatorv!=null&&tabindex>-1&&!setTab) {

      current_tab = navigatorv.tabs.get(tabindex);

      if (tabindex<tabs.size()-1)next_tab = navigatorh.tabs.get(tabindex + 1);
      else next_tab = null;

      if (tabindex>1)previous_tab = navigatorh.tabs.get(tabindex - 1);
      else previous_tab = null;

      if (current_tab!=null) {
        current_tab.toggle=true;
        current_tab.visible=true;
      }

      if (previous_tab!=null) {
        previous_tab.toggle=true;
        previous_tab.visible=true;
      }

      if (next_tab!=null) {
        next_tab.toggle=true;
        next_tab.visible=true;
      }
      setTab =true;
    }
  };

  public void setTabsh() {
    fill(255);
    if (current>-1&&!setTab) {
      if (tabs.get(current).visible) {
        tabindex = current;
        setTab = true;
      }
    }
    if (navigatorh!=null&&tabindex>-1) {

      current_tab = navigatorh.tabs.get(tabindex);

      if (tabindex<tabs.size()-1)next_tab = navigatorh.tabs.get(tabindex + 1);
      else next_tab = null;

      if (tabindex>0)previous_tab = navigatorh.tabs.get(tabindex - 1);
      else previous_tab = null;

      if (current_tab!=null) {
        current_tab.toggle=true;
        current_tab.visible=true;
      }

      if (previous_tab!=null) {
        previous_tab.toggle=true;
        previous_tab.visible=true;
      }

      if (next_tab!=null) {
        next_tab.toggle=true;
        next_tab.visible=true;
      }
      setTab = true;
    }
  };


  public void displayWindow() {
    if (currentWindow!=null)currentWindow.display_grid();
  };

  public void displayNav() {
    //if(scrollable&&toggle){
    //  if(title==null){
    //  if(!sliderh.mdown){
    //    //sliderv.draw();
    //    //sliderv.mouse();
    //  }
    //  if(!sliderv.mdown){

    //    //sliderh.mouse();
    //    //sliderh.draw();
    //  }}}
  };

  public void sliderControl(PGraphics canvas) {
    if (tabindex>-1) {
      
      if (current_tab!=null)sliderh.set(-current_tab.w, current_tab.w);
      if (!sliderset&&current_tab!=null) {
        sliderv = new Slider(current_tab.x+current_tab.w-10, current_tab.y+20, 10, current_tab.h-30);
        sliderv.vertical = true;
        sliderv.valuex = 0;
        sliderv.tooltip = null;
        sliderh.value = 0;
        sliderh.tooltip = null;
        sliderh = new Slider(current_tab.x, current_tab.y+current_tab.h - 10, current_tab.w-10, 10);
        sliderset = true;
      }
      //println(current_tab.x,current_tab.y);
      PVector m = new PVector(mouseX-navigatorh.x,mouseY-navigatorh.y);
      sliderv.mouse = m;
      if (!sliderh.mdown)sliderv.mouseFunctions(m);
      
      sliderv.parentCanvas = true;
      sliderv.parentTab = this;
      sliderv.draw(navigatorh.canvas);
      sliderh.mouse = m;
      if (!sliderv.mdown)sliderh.mouseFunctions(m);
      sliderh.parentTab = this;
      sliderh.parentCanvas = true;
      sliderh.draw(navigatorh.canvas);
    }
  };

  public void states(int k){
    for(int i=0;i<tabs.size();i++){
      tab t = tabs.get(i);
      
      tab t1 = new tab(t.x,t.y,t.w,t.h);
      tab t2 = new tab(t.x,t.y,t.w,t.h,t.label);
      
      for(int j=0;j<k;j++){
        
        if(t.title!=null)t.states.add(t2);
        else t.states.add(t1);
        
    }}
  }

  public void setWidth(int k, float W) {
    tabs.get(k).w = W;
    tabs.get(k).title.w = W;
    tab T = tabs.get(k);
    float cwidth = w;
    for (int i=k+1; i<tabs.size(); i++) {
      tab t = tabs.get(i);

      t.x =  T.x + cwidth;
      cwidth += t.w;
    }
  };
};
class verticaltabs extends tab {

  float x, y, w, h;
  String itemLabel;

  ArrayList<tab> tabs = new ArrayList<tab>();

  horizontaltabs parentnavh;
  verticaltabs parentnavv;
  horizontaltabs childnavh;
  verticaltabs childnavv;

  verticaltabs(float x, float y, float w, float h, float H, String [] titles) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;

    for (int i=0; i<titles.length; i++) {

      String s = titles[i];

      tab t = new tab(x, y + H * i, w, H, s);
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  verticaltabs(float x, float y, float w, float h, String [] titles) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;

    for (int i=0; i<titles.length; i++) {

      String s = titles[i];

      tab t = new tab(x, y + h * i, w, h, s);
      tabs.add(t);
    }
    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  verticaltabs(float x, float y, float w, float h, float H, int n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;

    for (int i=0; i<n; i++) {
      tab t = new tab(x, y + H * i, w, H);
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  verticaltabs(float x, float y, float w, float h, int n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;

    for (int i=0; i<n; i++) {
      tab t = new tab(x, y + h * i, w, h);
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
  };

  verticaltabs(float x, float y, float w, verticaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    parentnavv = n;

    for (int i=0; i<n.tabs.size(); i++) {
      String s = n.tabs.get(i).label;
      tab t = new tab(x, y + h * i, w, h, s);
      tabs.add(t);
    }
    n.childnavv = this;
  };

  verticaltabs(float x, float y, float w, horizontaltabs n) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    parentnavh = n;

    for (int i=0; i<n.tabs.size(); i++) {
      String s = n.tabs.get(i).label;
      tab t = new tab(x, y + h * i, w, h, s);
      tabs.add(t);
    }

    sliderv = new Slider(x+w-10, y+20, 10, h-20);
    sliderv.vertical = true;
    sliderv.tvisible = false;
    sliderh = new Slider(x, y+h-10, w-10, 10);
    sliderh.tvisible = false;
    n.childnavv = this;
  };

  public void displayTabs() {
    for (int i=0; i<tabs.size(); i++) {

      tab t = tabs.get(i);
      t.displayTab();
    }
  };
};
public void tabsetup(){

  tab.tabs.get(0).toggle = true;
  for(int i=1;i<tab.tabs.size();i++){
    //if(i==1)i++;
    tab t = tab.tabs.get(i);
    t.toggle = false;
    t.border = true;
    t.visible = false;
    
    for(int j=0;i<t.windows.size()-1;j++){
    Window w1 = t.windows.get(j);
    
    w1.launchable = false;
    w1.quickAccess = true;
    w1.transparent = true;
    w1.border = true;
    
  }
  for(int j=0;j<t.states.size();j++){
    tab t1 = t.states.get(j);
    t1.toggle = false;
    if(t1.title!=null)t1.title.toggle=1;
    t1.border = true;
    t1.visible = false;
  }
}

  //tab.navigator = new horizontaltabs(300,400,600,200,tab);
  
  tab.tabs.get(0).border = true;
  tab.navigatorh = new horizontaltabs(300,400,600,200,tab);
  tab.navigatorh.scrollable = true;
  tab.navigatorh.parentnavh = tab;
  tab.toggle = false;
  Table_ t = new Table_(tab.navigatorh.x+10,tab.navigatorh.y+21,200,200,3,3,10);
  tab.tables.add(t);
  Window w1 = tab.tabs.get(1).windows.get(0);
  w1.launchable = false;
  w1.quickAccess = true;
  w1.transparent = true;
  w1.border = true;
};

public void tabLogic(){
  tab tab1 = tab.tabs.get(0);
  tab tab2 = tab.tabs.get(1);
  tab tab3 = tab.tabs.get(2);
  tab tab4 = tab.tabs.get(3);
  tab tab5 = tab.tabs.get(4);
  tab tab6 = tab.tabs.get(5);
  tab tab7 = tab.tabs.get(6);
  
  // tab 1-------------Project------------------------
  
  tab tab00_01 = tab1.states.get(0);
  tab tab00_02 = tab1.states.get(1);
  tab tab00_03 = tab1.states.get(2);
  tab tab00_04 = tab1.states.get(3);
  tab tab00_05 = tab1.states.get(4);
  tab tab00_06 = tab1.states.get(5);
  
  // tab 2--------------Inputs--------------------------
  
  tab tab01_01 = tab2.states.get(0);
  tab tab01_02 = tab2.states.get(1);
  tab tab01_03 = tab2.states.get(2);
  tab tab01_04 = tab2.states.get(3);
  tab tab01_05 = tab2.states.get(4);
  tab tab01_06 = tab2.states.get(5);
  
  // tab 3------------Processing---------------------------
  
  tab tab02_01 = tab3.states.get(0);
  tab tab02_02 = tab3.states.get(1);
  tab tab02_03 = tab3.states.get(2);
  tab tab02_04 = tab3.states.get(3);
  tab tab02_05 = tab3.states.get(4);
  tab tab02_06 = tab3.states.get(5);
  
  // tab 4-------------------------------------------------
  
  tab tab03_01 = tab4.states.get(0);
  tab tab03_02 = tab4.states.get(1);
  tab tab03_03 = tab4.states.get(2);
  tab tab03_04 = tab4.states.get(3);
  tab tab03_05 = tab4.states.get(4);
  tab tab03_06 = tab4.states.get(5);
  
  // tab 5-------------------------------------------------
  
  tab tab04_01 = tab5.states.get(0);
  tab tab04_02 = tab5.states.get(1);
  tab tab04_03 = tab5.states.get(2);
  tab tab04_04 = tab5.states.get(3);
  tab tab04_05 = tab5.states.get(4);
  tab tab04_06 = tab5.states.get(5);
  
  // tab 6----------------Outputs-----------------
  
  tab tab05_01 = tab6.states.get(0);
  tab tab05_02 = tab6.states.get(1);
  tab tab05_03 = tab6.states.get(2);
  tab tab05_04 = tab6.states.get(3);
  tab tab05_05 = tab6.states.get(4);
  tab tab05_06 = tab6.states.get(5);
  
 
  };
  
  public void tabfunctions(){
  tab tab1 = tab.tabs.get(0);
  
  //tab tab2 = tab.tabs.get(1).states.get(tab.tabs.get(1).state);
  tab tab2 = tab.tabs.get(1);
  tab tab3 = tab.tabs.get(2);
  tab tab4 = tab.tabs.get(3);
  tab tab5 = tab.tabs.get(4);
  tab tab6 = tab.tabs.get(5);
  tab tab7 = tab.tabs.get(6);
  
  int index = tab1.dmenus.get(1).index;
  int index2 = tab1.dmenus.get(0).index;
  fill(255);
  //text(index,100,90);
  //text(tab2.state,200,100);
  //     if(index==0||index==2)tab2.state = 0;
  ////else 
  if(index>-1)tab.tabs.get(1).state = index;
  ////else if(index==3)tab2.state = 2;
  //else tab2.state = 5;
  //tab2.state = 0;
  
  //-------------------------------------------------------------------------------------------
  
  int [] s1 = {0,1,2,3,4,5};
  
  if(index2>-1&&index>-1){
    tab2.visible=true;
    tab2.toggle=true;
  }
  //else {
  //  tab2.visible=false;
  //  tab2.toggle=false;
  //}
  
  //tab2.state = 4;
    
  if(tab2.toggle){
   
    if(index>=0&&index2>-1)tab2.buttons.get(0).toggle2(tab3,"toggle");
    Window w1 = tab2.windows.get(0);
    tab2.dmenus.get(0).items.get(0).mouse = tab2.mouse;
    //tab2.buttons.get(0).mouse = tab2.mouse;
    if((index<4&&index>-1)&&tab2.dmenus.size()>0)tab2.dmenus.get(0).items.get(0).latch(w1,"toggle");
  }
  if(tab3.toggle&&tab3.dmenus.get(0).index>-1)tab3.buttons.get(0).toggle2(tab4,"toggle");
  if(tab4.toggle&&tab4.dmenus.get(0).index>-1)tab4.buttons.get(0).toggle2(tab5,"toggle");
  if(tab5.toggle&&tab5.dmenus.get(0).index>-1)tab5.buttons.get(0).toggle2(tab6,"toggle");
  if(tab6.toggle&&tab6.dmenus.get(0).index>-1)tab6.buttons.get(0).toggle2(tab7,"toggle");
  
  Window w1 = tab1.windows.get(0);
  if(w1.currentp!=null&&mousePressed)tab.tabs.get(1).folder = w1.currentp;
  if(w1.currentf!=null&&mousePressed)tab.tabs.get(1).file = w1.currentf;
  
  //----------inuputs---------------------------------
 
  };
class Table_ {

  int rows, cols, bcols, brows;
  float x, y, w, h, bw, bh, xpadding, ypadding;

  ArrayList<TextBox> grid = new ArrayList<TextBox>();
  ArrayList<Button> Buttons = new ArrayList<Button>();
  ArrayList<ArrayList<TextBox>> gridarray = new ArrayList<ArrayList<TextBox>>();
  boolean initialize,parentCanvas;

  Table_(float x, float y, float w, float h, int cols, int rows) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    this.cols = cols;
    this.rows = rows;
    bcols = cols;
    brows = rows;

    for (int i=0; i<rows; i++) {
      ArrayList<TextBox> g = new ArrayList<TextBox>();
      for (int j = 0; j<cols; j++) {

        TextBox t = new TextBox(x + w/cols * j, y + h/rows * i, w / cols - 5, h / rows - 5, 2);
        grid.add(t);
        g.add(t);
      }
      gridarray.add(g);
    }

    bw = w/cols;
    bh = h/rows;
  };

  Table_(float x, float y, float w, float h, int cols, int rows, int k) {

    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    this.cols = cols;
    this.rows = rows;

    bcols = cols;
    brows = rows;

    for (int i=0; i<rows; i++) {
      ArrayList<TextBox> g = new ArrayList<TextBox>();
      for (int j = 0; j<cols; j++) {

        TextBox t = new TextBox(x + w/cols * j, y + h/rows * i, w / cols - 5, h / rows - 5, k);
        grid.add(t);
        g.add(t);
      }
      gridarray.add(g);
    }

    bw = w/cols;
    bh = h/rows;

    //Button b1 = new Button(x+w - 70, y - 30, 100, 20, "Randomize");

    //Buttons.add(b1);
    ////Buttons.add(b2);
  };
  
  public void initialize(){
    if(!initialize){
      gridarray = new ArrayList<ArrayList<TextBox>>();
      for (int i=0; i<rows; i++) {
      ArrayList<TextBox> g = new ArrayList<TextBox>();
      for (int j = 0; j<cols; j++) {

        TextBox t = new TextBox(x + bw * j, y + bh * i, bw - 5, bh - 5, 2);
        grid.add(t);
        g.add(t);
      }
      gridarray.add(g);
    }initialize = true;}
    
  };
  
  public void initialize(int Cols,int Rows){
    
    if(!initialize){
      cols = Cols;
      rows = Rows;
      gridarray = new ArrayList<ArrayList<TextBox>>();
      for (int i=0; i<rows; i++) {
      ArrayList<TextBox> g = new ArrayList<TextBox>();
      for (int j = 0; j<cols; j++) {

        TextBox t = new TextBox(x + bw * j, y + bh * i, bw - 5, bh - 5, 2);
        grid.add(t);
        g.add(t);
      }
      gridarray.add(g);
    }initialize = true;}
    
  };

  public void draw() {
    if((gridarray.size()>0)&&(gridarray.size()!=rows||gridarray.get(0).size()!=cols)||gridarray.size()==0)initialize();initialize = false;
    for (int i=0; i<rows; i++) {
      ArrayList<TextBox> a = gridarray.get(i);
      
      for (int j=0; j<cols; j++) {

        TextBox t = a.get(j);
        if (t!=null)t.draw();
      }
    }

    for (int i=0; i<Buttons.size(); i++) {
      Button b = Buttons.get(i);

      b.draw();
      b.self_click3();
    }
    Button b = null;
    if(buttons.size()>0){b = Buttons.get(0);
    b.self_click3();
      
    if(b.toggle==1){
      for (int i=0; i<rows; i++) {
      ArrayList<TextBox> a = gridarray.get(i);
      
      for (int j=0; j<cols; j++) {

        TextBox t = a.get(j);
        int k = floor(random(0,10));
        if (t!=null){
          t.textBox = str(k);
          t.value = k;
      }}}b.toggle=0;}
    }
  };
  
  public void old_button_functions(){
    
    //if(b.toggle==1){
    //      ArrayList<TextBox> temp = new ArrayList<TextBox>();
    //      for(int j=0;j<cols;j++){
            
    //        TextBox k = gridarray.get(0).get(0);
            
    //        temp.add(new TextBox(x + bw * j, y + h, k.w,k.h,10));
    //      }
    //  gridarray.add(temp);
    //  rows ++;
    //  h += bh;
    //  b.toggle=0;
    //  }
      
    //  Button b1 = Buttons.get(0);
      
    //  if(b1.toggle==1){
    //      for(int j=0;j<rows;j++){
            
    //        TextBox k = gridarray.get(0).get(0);
            
    //        gridarray.get(j).add(new TextBox(x + w, y + bh * j, k.w,k.h,10));
            
    //      }
      
    //  cols ++;
    //  w += bw;
    //  b1.toggle=0;
    //  }
    
  };
};
class taskList extends Window{
   
    float x,y,w,h,w2,h2;
    int tcount = 0;
    Menu menu,submenu;
    ArrayList<String> tasks = new ArrayList<String>();
    ArrayList<String[][]> conv_pair = new ArrayList<String[][]>();
    //HashMap<String,Float[][]> tasks
    PImage icon;
    boolean done,numbered,convolved,cdown,windowreset;
    Table_ table;
    Window Window;
    //Float [][] convolution;
    String [][] convolution;
    TextBox [] colrow;
    //ArrayList<String> convolution = new ArrayList<String>();
    
    taskList(){
      
    };
    
    taskList(float x,float y,float w,float h, String [] List){
      
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
      w2 = w;
      h2 = h;
      menu = new Menu(x+w+5,y,100,List,0); 
      
      Button b = new Button(x+100,y+10,30,30,"+");
      b.bsize = 35;
      b.tsize = 35;
      b.tmax = 5;
      b.tyoff = 7;
      b.txoff = -1;
      Buttons.add(b);
      
      Button b1 = new Button(x+5,y+h - 30,w-15,20,"Finish");
      Buttons.add(b1);
      
      Button b2 = new Button(x+5,y+h - 55,w-15,20,"Clear");
      Buttons.add(b2);
      
      Button b3 = new Button(menu.x ,menu.y - 30,w - 55,20,"Get From File");
      Buttons.add(b3);
      
      String [] submenuLabels = {"Load Dataset","Load Training set","Load Image Folder"};
      
      submenu = new Menu(menu.x ,y + h - 70,w - 55,submenuLabels,10);
      submenu.border = true;
      
      int trows = 3;
      int tcols = 3;
      table = new Table_(menu.x + menu.w,y,120,100,tcols,trows);
      windows.get(0).launchable = false;
      colrow = new TextBox[2];
      TextBox t1 = new TextBox(x+40,y+h-80,30,20,2);
      TextBox t2 = new TextBox(x+20+90,y+h-80,30,20,2);
      colrow[0] = t1;
      colrow[1] = t2;
      
    };
    
    taskList(float x,float y,float w,float h, String [] List,int k){
      super(x,y,w,h,"C:\\Users\\paul goux\\");
      this.x = x;
      this.y = y;
      this.w = w;
      this.h = h;
      w2 = w;
      h2 = h;
      menu = new Menu(x+w+5,y,80,List,0); 
      
      Button b = new Button(x+100,y+10,30,30,"+");
      b.bsize = 35;
      b.tsize = 35;
      b.tmax = 5;
      b.tyoff = 7;
      b.txoff = -1;
      Buttons.add(b);
      
      Button b1 = new Button(x+5,y+h - 55,w-15,20,"Clear");
      Buttons.add(b1);
      
      Button b2 = new Button(x+5,y+h - 30,w-15,20,"Finish");
      Buttons.add(b2);
      
      Button b3 = new Button(menu.x ,menu.y - 30,w - 55,20,"Get From File");
      Buttons.add(b3);
      
      String [] submenuLabels = {"Load Dataset","Load Training set","Load Image Folder","Load Source"};
      
       submenu = new Menu(menu.x ,y + h - 75,w - 55,submenuLabels,5);
       submenu.visible = false;
       submenu.borders(true);
       
      int trows = 3;
      int tcols = 3;
      table = new Table_(menu.x + menu.w,y,120,100,tcols,trows,0);
      windows.get(0).launchable = false;
      colrow = new TextBox[2];
      TextBox t1 = new TextBox(x+40,y+h-80,30,20,2);
      TextBox t2 = new TextBox(x+20+90,y+h-80,30,20,2);
      colrow[0] = t1;
      colrow[1] = t2;
      
    };
    
    public void displayList(){
      fill(255);
      if(!done){
        box();
      fill(0);
      text("Cols :",x+10,y+h-65);
      text("Rows :",x+75,y+h-65);
      
      for(int i=0;i<colrow.length;i++){
        
        TextBox t = colrow[i];
        
        t.draw();
      }
      for(int i=0;i<Buttons.size()-1;i++){
        
        Button b = Buttons.get(i);
        
        if(!windows.get(0).toggle)b.self_click2();
        b.draw();
        
      }
      String link2 = null;
      if(Buttons.get(1).toggle==1&&!windows.get(0).toggle){
        tasks = new ArrayList<String>();
        conv_pair = new ArrayList<String[][]>();
        convolution = null;
        table.rows = 0;
        table.cols = 0;
        table.gridarray = new ArrayList<ArrayList<TextBox>>();
        colrow[0].textBox = "";
        colrow[0].value = 0;
        colrow[1].textBox = "";
        colrow[1].value = 0;
      }
      if(Buttons.get(2).toggle==1&&!windows.get(0).toggle)done = true;
      if(Buttons.get(0).toggle==1){
        w2 = 450;
        y2 = y - 40;
        h2 = h + 40;
        menu.draw();table.draw();submenu.draw();
        Buttons.get(3).draw();
        Buttons.get(3).highlight();
        if(!windows.get(0).ddown&&!!windows.get(0).mdown)Buttons.get(3).toggle2(windows.get(0),"toggle");
        
        for(int i=0;i<submenu.items.size();i++){
          Button b1 = submenu.items.get(i);
          b1.toggle2(windows.get(0),"toggle");
        }
        //submenu.toggle(0,windows.get(0),"toggle");
        
        if(windows.get(0).nav.get(2).pos()&&mousePressed&&!mdown){
          windows.get(0).nav.get(2).reverseclick(windows.get(0),"toggle");
          Buttons.get(3).mdown=false;
          Buttons.get(3).toggle=0;
        }
        //if(Buttons.get(3).toggle==0)windows.get(0).nav.get(2).toggle=0;
        windows.get(0).display_grid();
        table.rows = PApplet.parseInt(colrow[1].value);
        table.cols = PApplet.parseInt(colrow[0].value);
        if(mousePressed&&!mdown)link2 = windows.get(0).currentf;
      
      }else {
      w2 = w;
      y2 = y;
      h2 = h;
      }
      
      if(!mousePressed)mdown = false;
      if(link2!=null){
      
      if(link2.endsWith("txt")|| link2.endsWith("csv")){
        //
          convolution = string_to_array(loadStrings(link2));
          convolved = false;
          
      }
      link2 = null;
    }
      
      if(convolution!=null){
      if(table.gridarray.size()>0&&convolution.length*convolution[0].length==table.gridarray.size()*table.gridarray.get(0).size()){
        
        for(int i=0;i<convolution.length;i++){
          for(int j=0;j<convolution[0].length;j++){
            
          TextBox t = table.gridarray.get(j).get(i);
          t.textBox = convolution[i][j].toString();
          t.value = PApplet.parseInt(convolution[i][j]);
        }}}else {table.initialize(convolution.length,convolution[0].length);}convolved = true;}
      
      Button b = Buttons.get(3);
      
      tcount = 0;
      if(table.gridarray.size()>0&&!convolved){
        
        
        for(int i=0;i<table.gridarray.size();i++){
          for(int j=0;j<table.gridarray.get(i).size();j++){
          TextBox t = table.gridarray.get(i).get(j);
          
          if(t.textBox!=null&&t.textBox!="")tcount ++;
        }}}
        
        if(table.gridarray.size()>0&&(tcount == table.gridarray.size()*table.gridarray.get(0).size())||convolved) numbered = true;
        else numbered = false;
      
      for(int i=0;i<menu.items.size();i++){
        Button b1 = menu.items.get(i);
        if(b1.pos()&&mousePressed&&!mdown&&(numbered||convolved)){
          tasks.add(b1.label);
          conv_pair.add(convolution);
          b.toggle = 0;
        }
        else if(b1.pos()&&mousePressed&&!mdown&&(!numbered||convolved)){
          cdown = true;
          mdown = true;
        }
      }
      
      if(cdown)convolve_request();
      
      for(int i=0;i<tasks.size();i++){
        
       String s = tasks.get(i);
       
       text(s,x+10,y+40 +10*i);
      }}
      if(mousePressed&&!mdown) cdown = false;
      if(mousePressed)mdown = true;
      //if(mousePressed&&cdown&&mdown) cdown = false;
      
      
    };
    
    public void box(){
      noStroke();
      if(!transparent)fill(255);
      else fill(255,transparency);
      rect(x,y,w,h);
      rect(x,y2,w2,h2);
      
      fill(0,transparency2);
      rect(x,y2,w2,h2);
      rect(x,y,w,h);
      
    };
    
    public void convolve_request(){
          stroke(0);
          fill(255);
          
          rect(300,300,200,20);
          fill(0);
          text("Please add convolution!",340,315);
    };
    
    public void tasklogic(){
      if(!mousePressed) smdown = false;
    };
    
    public ArrayList<String> string_to_arrayl(String [] a){
      ArrayList<String> temp = new ArrayList<String>();
      
      for (int i=0;i<a.length;i++){
        String s = a[i];
        temp.add(s);
      }
      
      return temp;
    }
  };
  
  public String[][] string_to_array(String [] a){
    String s = "";
    int count = 0;
    for(int i=0;i<a.length;i++){
      if(a[i].length()>0){
      String k = a[i] + ",";
      
      if(a[i].charAt(a[i].length()-1)==',')s += a[i];
      else s += k;
    }}
    
    int char_counter = 0;
    
    ArrayList<String> s1 = new ArrayList<String>();
    
    for(int i=0;i<s.length();i++){
      
      char c = s.charAt(i);
      
      if(c==','){
        String b = s.substring(char_counter,i);
        
        s1.add(b);
        char_counter = i+1;
      }
    }
    
      int wid = s1.size()/a.length;
      String[][] temp = new String [wid][a.length];
      
      for (int j=0;j<a.length;j++){
        
        for (int i=0;i<wid;i++){
        
          int pos = i + j * wid;
          
          temp[i][j] = s1.get(pos);
        
      }}
      
    return temp;
};
  

class textBlock{
    boolean parentCanvas;
    public boolean vertical,horizontal ;
    public float x,y,w,h,offsetX,offsetY;
    public float tSize = 12;

    String [] text;
    String line;
    int col = color(0);

    textBlock(float x,float y,float w,float h){

        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;

    };

    textBlock(float x,float y,float w,float h,String[] s){

        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        text = s;
    };

    textBlock(float x,float y,float w,float h,String s){

        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        line = s;
    };

    textBlock(){

    };

    public void draw(){
        if(text!=null);
        for(int i=0;i<text.length;i++){
            String s1 = text[i];
            fill(0);
            textSize(tSize);
            if(y + i*tSize - offsetY<y+h&&y + i*tSize - offsetY>0)text(s1,x + offsetX,y + i*tSize - offsetY);

        }
    
    };

    public void draw(PGraphics canvas){
        //canvas.beginDraw();
        if(text!=null);
        for(int i=0;i<text.length;i++){
            String s1 = text[i];
            canvas.fill(col);
            canvas.textSize(tSize);
            if(y + i*tSize-offsetY<y+h&&y + i*tSize - offsetY>0)canvas.text(s1,x + offsetX,y + i*tSize - offsetY);
        }
        //canvas.endDraw();
    
    };

    public void draw(PGraphics canvas,boolean a){
        canvas.beginDraw();
        if(text!=null);
        for(int i=0;i<text.length;i++){
            String s1 = text[i];
            canvas.fill(col);
            canvas.textSize(tSize);
            if(y + i*tSize-offsetY<y+h&&y + i*tSize - offsetY>0)canvas.text(s1,x + offsetX,y + i*tSize - offsetY);
        }
        canvas.endDraw();
    
    };
};
class TextArea{
  
  int id,toggle,cols,rows,size,t,timer = 101,blkrate = 30,t1 = blkrate,t2 = blkrate,start,end,hcount,index,lindex,vindex = -1,hindex = -1,windex,vpos = 0,hpos,sltcounter,vcount = 0
      ,delay=10, maxCount = 51;
  float x,y,w,h,textsize = 12,twidth = 0,posx,posy,tposx,tposy,strposx,strposy,tbwidth,strwidth,strheight,cursorx, cursory,crwidth,totalwidth;
  public float inputDelay = 9,delay2 = 5;
  String label,text,label_backup,cboard = "",value;
  boolean drag,resize,hover,border,background,hidden,fill = true,init,ready,label_bool,clear,copied,tbox = true,tsize = false,parentCanvas,setDelay,firstPress,getChar;
  //Menu toolBox;
  //Button child;
  //Slider
  ArrayList<Letter> textbox = new ArrayList<Letter>();
  ArrayList<Letter> tm0 = new ArrayList<Letter>();
  ArrayList<Letter> tm1 = new ArrayList<Letter>();
  String textBox = "";
  String temp = "";
  String stringImport = "";
  String [] backup;
  ArrayList<Integer> counted = new ArrayList<Integer>();
  ArrayList<Integer> lines = new ArrayList<Integer>();
  ArrayList<Integer> dragh = new ArrayList<Integer>();
  //ArrayList<Float> tsize = new ArrayList<Float>();
  Letter b = null;
  int col = color(255),col2 = color(0);
  PVector mouse;
  //Window parent;
  
  TextArea(float X,float Y,float WW,float HH,int Cols,int Rows){
    
    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;
    rows = Rows;
    totalwidth = w * rows;
    size = textbox.size();
    lines.add(0);
    textsize = 12;
    //toolBox = new Menu(x+1,y-20,200-1,20);
    fill = true;
  };
  
  TextArea(float X,float Y,float WW,float HH,int Cols,int Rows,String Label){
    
    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;
    rows = Rows;
    totalwidth = w * rows;
    textsize = 12;
    size = textbox.size();
    label = Label;
    label_backup = Label;
    lines.add(0);
    label_bool = true;
    //toolBox = new Menu(x+1,y-20,200-1,20);
  };
  
  TextArea(float X,float Y,float WW,float HH,int Cols,int Rows,String []Lines){
    
    x = X;
    y = Y;
    w = WW;
    h = HH;
    cols = Cols;
    rows = Rows;
    
    //String [] text = null;
    //if(BMScontrols.Lines!=null)text = null;
    if(Lines!=null){
      //for(int i=0;i<Lines.length;i++){
        
      //  //String[] space = match(Lines[i],"  ");
      //  //if(space!=null){
      //  //  //Lines.splice(i+1,"")
      //  //  for(int j=0;j<cols;j++){
      //  //    Lines[i]+= " ";
      //  //  }}
      //  //Lines[i] = Lines[i].replace("//+", "\n  ");
      //}
    
      for(int i=0;i<Lines.length;i++){
      textBox += Lines[i];
      for(int j=0;j<Lines[i].length();j++){
      //label_backup += Lines[i];
      //textbox.add(new Letter(str(Lines[i].charAt(j)),x,y));
      //lines.add(i);
      }}
    backup = Lines;
    textsize = 12;
    if(Lines.length> rows){
      rows = floor(Lines.length);
      h = textsize * rows;
      }
    totalwidth = w * rows;
    size = textbox.size();
    tbox = false;
    //toolBox = new Menu(x+1,y-20,200-1,20);
    testcode(textBox);
    }
  };
  
  public void testcode(String a){
      
      //for(
    };
    
  public void save(){
    
  };
  
  public void load(){
    
  };
  
  public void init(){
    
  };
  
  public void getKey2(){
   
    if(toggle==1){
      if(!keyPressed){
        timer=101;
        firstPress = false;
      }
      if(keyPressed&&key != CODED){
        if((timer%delay==0&&!firstPress)||(firstPress&&timer%delay2==0)||timer==maxCount-1){
          getChar = true;
        }else getChar = true;
        if(timer<0)firstPress=true;
      }
    }
  };
  
  public void draw(){
    
    twidth = 0;
    box();
    getCursor();
    mpos();
    nav();
    conditionals();
    highlight();
    //selectall();
    toolbox();
    error();
    //debug();
    if(!tsize)getKey();;
    
    //----------------------------------------------------- amend letters
    float c1 = 0;
    int cindex = -1;
    
    for(int i=0;i<textBox.length();i++){
      
      //text(textbox.get(i).l,x+ 10 *i,y);
       Letter a = null;
       String b = str(textBox.charAt(i));
       
      if(textbox.size()==textBox.length()){a = textbox.get(i);}
        else{a = new Letter(b,x,y);textbox.add(a);}
      
      if(a!=null){
        if(c1 + a.w > w)c1=0;
        if(c1==0){cindex++;
        a.id = i;
        a.vpos = cindex;
        boolean k = lines.contains(i);
        if(!k)lines.add(i);
      }
      }
      
      if(a==null&&b!=null){
        a = new Letter(b,x,y);
        if(a.id!=i)a.id = i;
        a.y = y + cindex*textsize;
        a.x = x+c1;
        a.vpos = cindex;
        textbox.add(a);
      }
      
      if(a.l!=b){ 
      textbox.get(i).l = b;
      a.w = textWidth(b);
      if(a.id!=i)a.id = i;
      a.y = y + cindex*textsize;
      a.x = x+c1;
      a.vpos = cindex;
      }
      fill(a.col2);
      text(a.l,a.x,a.y+textsize);
      c1 += textWidth(a.l);
      
      if(selectAll&&toggle==1&&dragh.size()==textBox.length()){
        
        if(dragh.get(i)!= i) dragh.set(i,i);
      }}
    
    //-------------------------------------------------
    
        for(int j=0;j<dragh.size();j++){
            Letter b = null;
            if(j<dragh.size()-1){
              if(dragh.get(j)<textbox.size()){
              b = textbox.get(dragh.get(j));
              fill(0,0,255,125);
              noStroke();
              rect(b.x,b.y,b.w,b.h);
          }}}
        if(!mousePressed){
          //dragh = new ArrayList<Integer>();
        }
        strokeWeight(1);
  };
  
  public void draw(PGraphics canvas){
    
    twidth = 0;
    box(canvas);getCursor(canvas);mpos(mouse);nav();conditionals(canvas);highlight(canvas);selectall();toolbox(canvas);error(canvas);
    //debug();
    if(!tsize)getKey();;
    
    //----------------------------------------------------- amend letters
    float c1 = 0;
    int cindex = -1;
    
    for(int i=0;i<textBox.length();i++){
      //text(textbox.get(i).l,x+ 10 *i,y);
       Letter a = null;
       String b = str(textBox.charAt(i));
       
      if(textbox.size()==textBox.length()){a = textbox.get(i);}
        else{a = new Letter(b,x,y);textbox.add(a);}
      
      if(a!=null){
        if(c1 + a.w > w)c1=0;
        if(c1==0){cindex++;
        a.id = i;
        a.vpos = cindex;
        boolean k = lines.contains(i);
        if(!k)lines.add(i);
      }
      }
      
      if(a==null&&b!=null){
        a = new Letter(b,x,y);
        if(a.id!=i)a.id = i;
        a.y = y + cindex*textsize;
        a.x = x+c1;
        a.vpos = cindex;
        textbox.add(a);
      }
      
      if(a.l!=b){ 
      textbox.get(i).l = b;
      a.w = textWidth(b);
      if(a.id!=i)a.id = i;
      a.y = y + cindex*textsize;
      a.x = x+c1;
      a.vpos = cindex;
      }
      canvas.fill(a.col2);
      canvas.text(a.l,a.x,a.y+textsize);
      c1 += textWidth(a.l);
      
      if(selectAll&&toggle==1&&dragh.size()==textBox.length()){
        
        if(dragh.get(i)!= i) dragh.set(i,i);
      }}
    
    //-------------------------------------------------
    
        for(int j=0;j<dragh.size();j++){
            Letter b = null;
            if(j<dragh.size()-1){
              if(dragh.get(j)<textbox.size()){
              b = textbox.get(dragh.get(j));
              canvas.fill(0,0,255,125);
              canvas.noStroke();
              canvas.rect(b.x,b.y,b.w,b.h);
          }}}
        if(!mousePressed){
          //dragh = new ArrayList<Integer>();
        }
        canvas.strokeWeight(1);
  };
  
  public void selectall(){
    
    if(toggle==1&&ctrl==1&&selectAll){
      fill(0);
      text("Select all", 100,200);
    }
  };
  
  public String getValue(){
    return textBox;
  };
  
  public ArrayList getObject(){
    return textbox;
  };
  
  public void regex(){
    
  };
  
  public void toolbox(){
    //tbox = true;
    if(tbox){
      stroke(col);
      fill(col2);
      //toolBox.draw();
      // btn quote
      // btn Bold
      // btn Italic
      // btn Underlined
      // btn Link
      // btn Quotes
      // btn Html tag
      // btn Picture
      // btn Bulletpoints
      // btn Numbered
      // btn Smiley
      // btn Calendar
      // btn Options
      
    }
    
  };
  
  public void toolbox(PGraphics canvas){
    //tbox = true;
    if(tbox){
      canvas.stroke(col);
      canvas.fill(col2);
      //toolBox.draw();
      // btn quote
      // btn Bold
      // btn Italic
      // btn Underlined
      // btn Link
      // btn Quotes
      // btn Html tag
      // btn Picture
      // btn Bulletpoints
      // btn Numbered
      // btn Smiley
      // btn Calendar
      // btn Options
      
    }
    
  };
  
  public void highlight(){
    float c = 0;
        int d = 0;
      
      if(textbox.size()>0){
        
        for(int i=0;i<textbox.size();i++){
          Letter a = textbox.get(i);
          noStroke();
          if(a.pos()){a.col = color(255,255,0);fill(a.col);rect(a.x,a.y,a.w,a.h);}
          else a.col  = color(0);
          if(mousePressed&&a.pos()){
            vindex = a.vpos;
            hindex = a.id;
            cursorx = a.x-x+a.w;
            cursory = a.y;
            boolean n = dragh.contains(i);
            if(!n) dragh.add(i);
            //text(a.id,a.x + x,a.y);
          }}}
  };
  
  public void highlight(PGraphics canvas){
    float c = 0;
        int d = 0;
      
      if(textbox.size()>0){
        
        for(int i=0;i<textbox.size();i++){
          Letter a = textbox.get(i);
          canvas.noStroke();
          if(a.pos(mouse)){a.col = color(255,255,0);canvas.fill(a.col);canvas.rect(a.x,a.y,a.w,a.h);}
          else a.col  = color(0);
          if(mousePressed&&a.pos(mouse)){
            vindex = a.vpos;
            hindex = a.id;
            cursorx = a.x-x+a.w;
            cursory = a.y;
            boolean n = dragh.contains(i);
            if(!n) dragh.add(i);
            //text(a.id,a.x + x,a.y);
          }}}
  };
  
  public void getKey(){
   
    if(toggle==1){
    String clipboard = null;
    Letter current = null;
    
    String a = getChar();
    String tm = "";
    String tm2 = "";
    tm0 = new ArrayList<Letter>();
    tm1 = new ArrayList<Letter>();
    float current_width = textWidth(textBox);
    
    if(textbox.size()>0&&hindex!=-1)current = textbox.get(hindex);
    if(textbox.size()>0&&hindex==-1)current = textbox.get(textbox.size()-1);
    
    if(clipboard_toggle==0)cboard = "";
    
    if(cboard != clipBoard&&copy_clipboard){ clipboard = clipBoard;cboard = clipBoard;}
    else{ clipboard = null;}
    float delay = delay2;
    if(!copy_clipboard&&clipboard_toggle==0){
      
        timer --;
        Letter l = null;
        if(setDelay)delay = inputDelay;
        if(a!=null) l = new Letter(a,x+strwidth,y + vcount * textsize);
        if(a!=null&&getChar&&key!=BACKSPACE&&(current_width+ l.w<totalwidth)){
          
          l.id = hindex +1;
          
          if(hindex==-1){
            if(textbox.size()==0){
              l.y = y;
              l.x = x;
              textbox.add(l);
              textBox += a;
            }
              else if(l.vpos < rows||l.x+l.w<x+w){
              l.y = y + vcount * textsize;
              cursory = l.y;
              textbox.add(l);
              textBox += a;
              
          }}else{
            
            Letter end = textbox.get(textbox.size()-1);
            Letter n = new Letter(a,cursorx,cursory);
            if((hindex!=textbox.size()-1||hindex!=-1)&&getChar){
              
            Letter b = textbox.get(hindex);
            l.id = b.id ;
            
            n.x = cursorx ;
            if(hindex-1> 0)l.y = y + textbox.get(hindex-1).vpos * textsize;
                else l.y = y; cursory = y;
                
            if(hindex<textBox.length())tm = textBox.substring ( 0, hindex + 1);
            tm += a;
            if(hindex<textBox.length())tm2  = textBox.substring ( hindex + 1, textBox.length()  );
            textBox = tm + tm2;
            hindex ++;
            if(hindex < textbox.size()-1)cursorx = textbox.get(hindex+1).x;
          }}
          
          if(timer<=0){
            timer = maxCount;
          }}
        else if(keyPressed && key==BACKSPACE&&getChar){delete();}
        //setDelay = true;
    }
    else if(copy_clipboard&&clipboard_toggle==1&&!tsize){
      
            if(hindex>-1){
            if(hindex<textBox.length())tm = textBox.substring ( 0, hindex + 1  );
            if(hindex<textBox.length())tm2  = textBox.substring ( hindex + 1, textBox.length()  );
            tm += cboard;
            tm += tm2;
            
            textBox = tm;
            
         }else{
             
              for (int i=0;i<cboard.length();i++){
                String b = str(cboard.charAt(i));
                textBox += b;
              }}
              clipboard_toggle = 0;
              copy_clipboard = false;
              }}
  };
  
  
  //((((
  
  public void error(){
    
    if(clipBoard.length()>0&&textWidth(clipBoard)+textWidth(textBox)*textsize/12>w*(rows-1)&&copy_clipboard&&clipboard_toggle==1){tsize = true;}
    
    if(toggle==1||pos()){
          if(tsize){
              String message = "ClipBoard too large";
              float l = textWidth(message);
              stroke(0);
              fill(255);
              rect(W/2-l/2+200,H/2-textsize,l*2,textsize*2);
              fill(0);
              text(message,W/2+200,H/2);
          
          }
          
          if(tsize&&mousePressed)tsize = false;
    }
  };

public void error(PGraphics canvas){

  if(clipBoard.length()>0&&textWidth(clipBoard)+textWidth(textBox)*textsize/12>w*(rows-1)&&copy_clipboard&&clipboard_toggle==1){tsize = true;}
    
  if(mouse!=null&&(toggle==1||pos(mouse))){
          if(tsize){
              String message = "ClipBoard too large";
              float l = textWidth(message);
              canvas.stroke(0);
              canvas.fill(255);
              canvas.rect(W/2-l/2+200,H/2-textsize,l*2,textsize*2);
              canvas.fill(0);
              canvas.text(message,W/2+200,H/2);
          
          }
          
          if(tsize&&mousePressed)tsize = false;
    }
};

  public void getCursor(){
    
    getClick();
    
    if(hindex==-1){
      if(textbox.size()==0){
        cursory = y;
        cursorx = 1;
        vindex = 0;
      }else{
      if(textbox.size()>0&&hindex<textbox.size()){
      cursory = y + textbox.get(textbox.size()-1).vpos * textsize;
      cursorx = textbox.get(textbox.size()-1).x + textbox.get(textbox.size()-1).w*(textsize/12)-x;
      }
    }}
    if(hindex>-1){
      if(textbox.size()>hindex+1){
      cursorx = textbox.get(hindex).x + textbox.get(hindex).w*(textsize/12) - x;
      cursory = y + textbox.get(hindex).vpos * textsize;
    }}
    if(pos()||toggle==1){
      cursor(POINT);
        if(t1>0){
          t1 --;
          if(strheight<y+h){
          stroke(0);
          strokeWeight(1);
          line(x+cursorx,cursory ,x+cursorx,cursory+textsize);
          }
        if(t1<=0)t2 = blkrate;
        }
        if(t2>0&&t1<=0){
          t2--;if(t2<=0)t1 = blkrate;
          }}
          else {
            cursor(ARROW);
          }
  };
  
  public void getCursor(PGraphics canvas){
    
    getClick();
    
    if(hindex==-1){
      if(textbox.size()==0){
        cursory = y;
        cursorx = 1;
        vindex = 0;
      }else{
      if(textbox.size()>0&&hindex<textbox.size()){
      cursory = y + textbox.get(textbox.size()-1).vpos * textsize;
      cursorx = textbox.get(textbox.size()-1).x + textbox.get(textbox.size()-1).w*(textsize/12)-x;
      }
    }}
    if(hindex>-1){
      if(textbox.size()>hindex+1){
      cursorx = textbox.get(hindex).x + textbox.get(hindex).w*(textsize/12) - x;
      cursory = y + textbox.get(hindex).vpos * textsize;
    }}
    if(pos(mouse)||toggle==1){
      //cursor(POINT);
        if(t1>0){
          t1 --;
          if(strheight<y+h){
          canvas.stroke(0);
          canvas.strokeWeight(1);
          canvas.line(x+cursorx,cursory ,x+cursorx,cursory+textsize);
          }
        if(t1<=0)t2 = blkrate;
        }
        if(t2>0&&t1<=0){
          t2--;if(t2<=0)t1 = blkrate;
          }}
          else {
            //cursor(ARROW);
          }
  };
  
  public void delete(){
    Letter current = null;
    
    if(textbox.size()>0&&hindex!=-1)current = textbox.get(hindex);
    if(textbox.size()>0&&hindex==-1)current = textbox.get(textbox.size()-1);
    
    String tm1 = "",tm2 = "";
    String tma;
    
    if(keyPressed && key == BACKSPACE){
      if(hindex==-1&&textBox.length()>0){
        if(current!=null&&current.id>0){
          //text
          if(lines.get(lines.size()-1) > current.id-1) lines.remove(lines.size()-1);
          if(lines.size()-1>0&&current.vpos<lines.size()-1){
              vcount --;
              lines.remove(lines.size()-1);
          }
          hindex = current.id;
          textbox.remove(textbox.size()-1);
          textBox = textBox.substring ( 0, textBox.length()-1  );
        }else{
          textbox = new ArrayList<Letter>();
          textBox = "";
        }
      }
      else{
        if(current!=null&&current.id>-1){
          if(current!=null&&lines.get(lines.size()-1) > textbox.get(textbox.size()-1).id-1) lines.remove(lines.size()-1);
          if(lines.size()>0&&textbox.get(textbox.size()-1).vpos<lines.size()-1){
              vcount --;
              lines.remove(lines.size()-1);
          }
          hindex = current.id-1;
          
          textbox.remove(textbox.size()-1);
          if(current.id >0){
            tm1 = textBox.substring ( 0, hindex+1 );
            tm2 = textBox.substring ( hindex +2, textBox.length()  );
          }else if(current.id==0){
            tm1 = "";
            tm2 = textBox.substring ( 0, textBox.length()  );
          }
          textBox = tm1 + tm2;
          
        }}}
    
  };
  
  public void paste(){
    
    for(int i=0;i<cboard.length();i++){
      String a = str(cboard.charAt(i));
      getKey();
    }
    
  };
  
  public void box(){
    if(!hidden){
      //------------------------------- border
      if(border)stroke(col2);
      else noStroke();
      //-------------------------------label
      if(label!=null){
        fill(col2);
        text(label,x,y+textsize);
      }
      //---------------------------------fill
      if(fill)if(pos())fill(col);else fill(0);
        else noFill();fill(col);
      
      rect(x,y,w,h);
      }
  };

  public void box(PGraphics canvas){
    if(!hidden){
      //------------------------------- border
      if(border)canvas.stroke(col2);
      else canvas.noStroke();
      //-------------------------------label
      if(label!=null){
        canvas.fill(col2);
        canvas.text(label,x,y+textsize);
      }
      //---------------------------------fill
      if(fill)if(pos())canvas.fill(col);else canvas.fill(0);
        else canvas.noFill();canvas.fill(col);
      
      canvas.rect(x,y,w,h);
      }
  };
  
  public Letter sort(ArrayList<Letter>a){
    Letter k = a.get(0);
    
    for(int i=0;i<a.size();i++){
      
      if(k.id>a.get(i).id){
        k = a.get(i);
      }}
    return k;
  };
  
  public void conditionals(){
    
    if(vpos<=0) vpos = 0;
    
    if(selectAll&&toggle==1){
        if(dragh.size()!=textBox.length())dragh.add(0);
      }
     
    if(keyPressed&&keyCode!=SHIFT&&keyCode!=CONTROL){
      timer --;
    }else {
      timer = maxCount;
      firstPress = false;
    }
    if(lines.size()>rows)lines.remove(lines.size()-1);
    if(lines.size()<=1)vcount = 0;
    if(toggle==1)clear = true;
    if(mousePressed&&!pos()){
      //vindex = -1;
      hindex = -1;
    }
    if(mousePressed&&pos()){toggle=1;}
    
    if(toggle==1){
    if(keyPressed&&keyCode!=SHIFT&&keyCode!=CONTROL){
      //println(timer);
        if((timer==maxCount-2||(timer%delay==0&&!firstPress))||(firstPress&&timer%delay2==0)){
          getChar = true;
        }else getChar = false;
        if(timer<0)firstPress=true;
      }else getChar = false;
    }
    //if(keyPressed&&keyCode==16)firstPress = false;
  };
  
  public void conditionals(PGraphics canvas){
    
    if(vpos<=0) vpos = 0;
    
    if(selectAll&&toggle==1){
        if(dragh.size()!=textBox.length())dragh.add(0);
      }
    if(keyPressed&&keyCode!=SHIFT&&keyCode!=CONTROL){
      timer --;
    }else {
      timer = maxCount;
      firstPress = false;
    }
    if(lines.size()>rows)lines.remove(lines.size()-1);
    if(lines.size()<=1)vcount = 0;
    if(toggle==1)clear = true;
    if(mousePressed&&!pos(mouse)){
        //vindex = -1;
        hindex = -1;
      }
      if(mousePressed&&pos(mouse)){toggle=1;}
      if(toggle==1){
    if(keyPressed&&keyCode!=SHIFT&&keyCode!=CONTROL){
      //println(timer);
        if((timer==maxCount-2||(timer%delay==0&&!firstPress))||(firstPress&&timer%delay2==0)){
          getChar = true;
        }else getChar = false;
        if(timer<0)firstPress=true;
      }else getChar = false;
    }
  };
  
  public void constants(){
    strheight = (floor(textWidth(textBox)/(w)));
    strwidth = ((textWidth(textBox))%(w));
  };
  
  public boolean exclusion(){
    boolean k = false;
    
    if(keyCode==37||keyCode==38||keyCode==39||keyCode==40||keyCode==33||keyCode==34||keyCode==17||keyCode==18||keyCode==9||
       keyCode==20||keyCode==16||keyCode==255||keyCode==91||keyCode==36||keyCode==35||keyCode==45||keyCode==46||keyCode==8){
      k = true;
    }
    return k;
  };
  
  public void select_All(){
    if(selectAll){
      
    }
  };
  
  public void debug(){
    fill(255);
    text(textbox.size(),140,80);
    text(backup.length,140,90);
    text(totalwidth,140,100);
    //text(currentwidth,140,110);
    
    text("lines " + lines.size(),140,150);
    if(hindex>-1){text(hindex,140,120);}
    else {text(hindex,140,120);}
    if(vcount>-1)text(vcount,140,130);
    //if(clipBoard!=""){text(clipBoard,140,100);}
    for(int i=0;i<lines.size();i++){
      text(lines.get(i),x+x,y+textsize+10*i);
    }
  };

  public String getChar(){
    String a = null;
    
    if(keyPressed){
      a  = str(key);
    }
    if(keyCode==9) a = null;
    
    return a;
    
  }
  public char getchar(){
    char a = '¬';
    
    if(keyPressed){
      a  = PApplet.parseChar(key);
    }
    if(keyCode == 8){
      
    }
    pos();
    return a;
    
  };
  
  public boolean pos(){
    
    float X = mouseX;
    float Y = mouseY;
    
    return X > x && X < x + w && Y > y && Y < y + h; 
  };
  
  public boolean pos(PVector m){
    
    float X = m.x;
    float Y = m.y;
    
    return X > x && X < x + w && Y > y && Y < y + h-20; 
  };
  
  public void calc_lwidth(){
    for (int i=0;i<strheight+1;i++){
      for(int j=0;j<w;j++){
        
        
    }}
  };
  
  public void insert(){
    if(hindex>-1){
      
    }else{
      
    }
  };
  
  public void mpos(){
    float X = mouseX;
    float Y = mouseY;
    float ww = w/cols;
    float hh = h/rows;
    
    if(pos())posx = floor(X/ww)*ww-10;posy = floor(Y/hh)*hh;
  };
  
  public void mpos(PVector m){
    float X = m.x;
    float Y = m.y;
    float ww = w/cols;
    float hh = h/rows;
    
    if(pos(m))posx = floor(X/ww)*ww-10;posy = floor(Y/hh)*hh;
  };
  
  public void getClick(){
  if(pos() && mousePressed)toggle=1;
  if(!pos()&& mousePressed)toggle=0;
  //if(toggle==2)toggle=0;
  };
  
  public void getClick(PVector m){
  if(pos(m) && mousePressed)toggle=1;
  if(!pos(m)&& mousePressed)toggle=0;
  //if(toggle==2)toggle=0;
  };
  
  public void nav(){
    if(hindex>=textbox.size()-1){hindex  =-1;}
    if(textbox.size()>0){
      if(hindex>=1){
    if(keyPressed && keyCode == 37 &&getChar){hindex --;}}
    if(hindex<=textbox.size()-1&&hindex>-1){
    if(keyPressed && keyCode == 39 &&getChar){ hindex ++;}}
    //if(keyPressed && key == UP && strheight >0) hindex += vpos *2;
    //if(keyPressed && key == DOWN && strheight )
    
    if(hindex==-1){
      if(keyPressed && keyCode == 37 &&getChar){hindex = textbox.size()-2;}
      //if(keyPressed && keyCode == 39 &&getChar){ hindex = 0;}
    }
    
    
    }
  };
  
};

class Letter{
  
  int id,vpos,hpos;
  float x,y,w,h,tsize;
  String l;
  int col = color(255,0);
  int col2 = color(0,0);
  boolean visible = true;
  
  Letter(String ll,float xx, float yy){
    x = xx;
    y = yy;
    l = ll;
    w = textWidth(l);
    h = 12;
  };
  
  public boolean pos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
  }
  
  public boolean pos(PVector m){
    return m.x>x&&m.x<x+w&&m.y>y&&m.y<y+h;
  }
};
class tooltip{
  float x,y,w,h;
//int 
  String label;

  tooltip(){
        
  };

  tooltip(float x,float y,float w,float h,String label){
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;
    this.label = label;

  };

  tooltip(float x,float y,float w,float h){
    this.x = x;
    this.y = y;
    this.w = w;
    this.h = h;

  };

  public void draw(){

    if(pos()){
        fill(219, 212, 11,100);
        rect(x,y,w,h);
        fill(0);
        text(label,x+10,y+10);

    }
  };

  public boolean pos(){
    return mouseX > x && mouseX < x + w && mouseY > y && mouseY < y + h;

  };

};
ArrayList<Window> windows = new ArrayList<Window>();
ArrayList<Menu> menus = new ArrayList<Menu>();
ArrayList<Button> buttons = new ArrayList<Button>();
ArrayList<Slider> Sliders = new ArrayList<Slider>();
ArrayList<Quad> qgrid = new ArrayList<Quad>();
ArrayList<Quad> fields = new ArrayList<Quad>();
ArrayList<PImage> images = new ArrayList<PImage>();
ArrayList<Boundary> boundaries = new ArrayList<Boundary>();
ArrayList<TextArea> textboxes = new ArrayList<TextArea>();
ArrayList<TextBox> textb = new ArrayList<TextBox>();

ArrayList<Entity> entities = new ArrayList<Entity>();
String[] Lines ;
String hello = "hello",Location;
int W = 1200, H = 660,gw = 25,gh = 20,clipboard_toggle,ctrl=0,totalraces,maxFolderSize = 1000;
int backgroundcol = 51;
boolean gridtype,restart,open_menus,Terrain3d = false,xdown,ydown,leftdown,copy_clipboard,selectAll,pastedown,Qgrid = false,wrap = false,globaldown,
        camOpen,gridCreated;
float kkkk = 0.1f;
String clipBoard=""; 
String[] cameras = Capture.list();
public final int IMAGES = 0,VIDEOS = 2,AUDIO = 1,MOVIE = 4,SOUND = 3,CAM = 6;
Button btn1,btn2,btn3,reset,attractor,grid,d2_plot,d3_plot,btn4,btn5,btn6,btn7,btn8,btn9,yes,no;
Button btn10,btn11,btn12,btn13,btn14,btn15,btn16,btn17,btn18,btn19;
Button btn20,btn21,btn22,btn23,btn24,btn25,btn26,btn27,btn28,btn29;
Button btn30, btn31,btn32,btn33,btn34,btn35,btn36,btn37,btn38,btn39;
Button btn40, btn41,btn42,btn43,btn44,btn45,btn46,btn47,btn48,btn49;
Button btn50, btn51,btn52,btn53,btn54,btn55,btn56,btn57,btn58,btn59;
Button btn60, btn61,btn62,btn63,btn64,btn65,btn66,btn67,btn68,btn69;
Button btn70, btn71,btn72,btn73,btn74,btn75,btn76,btn77,btn78,btn79,
       btn80, btn81,btn82,btn83,btn84,btn85,btn86,btn87,btn88,btn89,
       btn90, btn91,btn92,btn93,btn94,btn95,btn96,btn97,btn98,btn99;
Slider sld1,sld2,sld3,sld4,sld5,sld6,sld7,sld8,sld9,
       sld10,sld11,sld12,sld13,sld14,sld15,sld16,sld17,sld18,sld19,
       sld20,sld21,sld22,sld23,sld24,sld25,sld26,sld27,sld28,sld29,
       sld30,sld31,sld32,sld33,sld34,sld35,sld36,sld37,sld38,sld39,
       sld40,sld41,sld42,sld43,sld44,sld45,sld46,sld47,sld48,sld49;
Button grav;
Window header,main,rightmenu,leftmenu,footer;
TextArea textb1,textb2,textb3,textb4,textb5,textb6,textb7,textb8,textb9,textb10,textb11,textb12,textb13;
TextBox txtb1, txtb2,txtb3, txtb4, txtb5, txtb6, txtb7, txtb8, txtb9, txtb10;
Grid g,g2,gterrain,gplain;
GridImg gimg;
webcam gcam;
Entity humans,plants,animals, minerals,metals;
Boundary lines;
Boundary l1 = new Boundary(20,20,100,100,4);
Plot_2D plot;
Menu file,gridbox,plotbox,reset_dialogue,shapes,physics,mapMenu,Entities_sub,menu1,imgsliderMenu,sliderMenu,
     neuralNetworkMenu,Entities_debug,Entities_sublist,twitter;
rgb_Slider rgb_slider;
int bgcol = color(50);
Capture Cam;
sliderBox sliderbox,fRate,imgsliderList, cammenuList;
listBox list1,shapesList;
Window fmenu;
Attractor attractors;
Dropdown d1,d2;
//horizontaltabs navigator;
horizontaltabs tab;
TwitterKeyword twitterKeywords;
class Vehicle{
  
  Vehicle(){
    
  };
  
  public void draw(){
    
  };
  
  public void update(){
    
  };
  
  public void keys(){
    
  };
  
  public void interact(){
    
  };
  
  
};
class webcam{
  String[] cameras = Capture.list();
  Capture cam;
  PApplet applet;
  
  webcam(PApplet app){
    applet = app;
    if (cameras.length == 0) {
    println("There are no cameras available for capture.");
    //exit();
    } else {
      println(cameras.length + " Available cameras:");
      for (int i = 0; i < cameras.length; i++) {
        println(i + " " + cameras[i]);
      }
      
      // The camera can be initialized directly using an 
      // element from the array returned by list():
      cam = new Capture(app, cameras[26]);
      cam.start();     
    }
  };
  
  public void display(){
    if (cam.available() == true) {
    cam.read();
  }
  image(cam, 0, 0);
  };

  public void display(PGraphics c){
    if (cam.available() == true) {
    cam.read();
  }
  c.beginDraw();
  c.image(cam, 0, 0);
  c.endDraw();
  };
  
  public void display(float x, float y){
    if (cam.available() == true)cam.read();
    else println("no Cam");
    image(cam, x, y);
  };
  
  public PImage get(){
    return cam;
  };
  
};
class Window extends Scene{
  
  //float x,y,w,h;
  float bw,bh, navheight = 50,deltay,transparency = 200,transparency1 = 50,transparency2 = 80,transparency3 = 100,transparency4 = 150;
  String label,itemLabel;
  int type = 0,index = -1,click,windex = -1,level = 0,wid;
  int main = color(0);
  int navcol = main,quicknavcol = main,fcol = main,bcol = main,xcol = main,quickNavItemcol = main,navItemcol = main,buttoncol = main,selectcol = main;
  //boolean drag,resize,hover,border,background,hidden,fill = true;
  Button child;
  Menu parent;
  
  float bsize = 12,tsize = 12,svalue,svalue2,colwidth = 100,rowheight = 80;;
  
  boolean smdown,ddown,amendslider,initB,launchable = true,quickAccess,navtoggle = true,transparent;
  public boolean show,open,close;
  ArrayList<Button> buttons = new ArrayList<Button>();
  ArrayList<Button> quicknav = new ArrayList<Button>();
  ArrayList<Button> buttongrid = new ArrayList<Button>();
  ArrayList<Slider> sliders = new ArrayList<Slider>();
  ArrayList<Window> windows = new ArrayList<Window>();
  ArrayList<PVector> track = new ArrayList<PVector>();
  ArrayList<String> Links = new ArrayList<String>();
  //sliderBox sliders;
  String []list;
  String link,currentp,back,forward,currentl,currentf;
  float [] window;
  int wcol = color(255,50);
  
  Window(){
    
  };
  
  Window(float X,float Y,float WW,float HH){
    
    x = X;
    y = Y;
    w = WW;
    h = HH;
    
    x1 = x;
    y1 = y;
    x2 = x + w;
    y2 = y + h;
    fill = true;
    //scene = new Sc
    
  };
  
  Window(float xx, float yy, float ww,float hh,String dir){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    bw = w;
    bh = h;
    list = listFileNames(dir);
    link = dir;
    currentp = dir;
    ArrayList<String> temp = new ArrayList<String>();
    ArrayList<String> temp2 = new ArrayList<String>();
    
    if(list!=null)
    temp = trimNames(list);
    list = null;
    for(int i =0;i<temp.size();i++){
      
      String l = temp.get(i);
      String ndir = dir + "\\" + l + "\\";
      list = listFileNames(ndir);
      Button a = new Button( x ,y + 20 *(i), w-10,20,l);;
      if(list==null){
        
      
      
      }else {
        temp2 = trimNames(list);
        if(temp2.size()>0){
          a.submenu = new Menu(a.x+20,a.y+a.h,a.w-20,temp2);
          a.submenu.slide = true;
          a.submenu.visible = false;
        }
      }
      a.border = false;
      a.togglebox = true;
      buttons.add(a);
      
  }
  
    parent = new Menu( x + w - 10,y , 10,h-20);
    
    Slider s = new Slider( x + w - 10,y , 10,h);
    //h = buttons.size()*20;
    s.bar = true;
    s.classic = true;
    s.visible = true;
    s.valuex = 0;
    s.vertical = true;
    s.tvisible = false;
    s.tooltip = null;
   
    sliders.add(s);
    Boundary b = new Boundary(x,y-10,w,h+10,4);
    Boundaries.add(b);
    
    for(int i =0;i<buttons.size();i++){
      Button b1 = buttons.get(i);
      Button a = new Button(0,0,40,40,b1.label);
      a.textbtm = true;
      a.tcol = 0;
      a.border = false;
      buttongrid.add(a);
    }
     cols = 5;
     rows = round(buttongrid.size()/cols)+1;
    
    b = new Boundary(x,y-50,cols*colwidth,5*rowheight + navheight,4);
    Boundaries.add(b);
    windows.add(this);
    
     s = new Slider( x + cols*colwidth - 10,y , 10,5*rowheight );
    //h = buttons.size()*20;
    s.bar = true;
    s.classic = true;
    s.visible = true;
    s.valuex = 0;
    s.vertical = true;
    s.tvisible = false;
    s.tooltip = null;
   
    sliders.add(s);
    
    Window W = windows.get(0);
    
    Button b2 = new Button(x+w - 80,y - 40 + 10, 30,30,"Back");
    Button f = new Button(x+w - 80,y - 40 + 10, 30,30,"Forward");
    Button X = new Button(x + colwidth*cols - 35,y-50 + 5, 30,30,"X");
    X.txoff = 7;
    b2.border = false;
    f.border = false;
    X.border = false;
    //X.textbtm = true;
    nav.add(b2);
    nav.add(f);
    nav.add(X);
    
    for(int i=0;i<nav.size()-1;i++){
        Button b1 = nav.get(i);
        
        b1.x = x + 5 + 40 * i;
        b1.y = y - 50 + 5 + dy;
      }
      
   initqNav();
   h = sliders.get(1).h;
  };
  
  Window(float xx, float yy, float ww,float hh,String dir,int n){
    
    x = xx;
    y = yy;
    w = ww;
    h = hh;
    bw = w;
    bh = h;
    list = listFileNames(dir);
    link = dir;
    ArrayList<String> temp = new ArrayList<String>();
    ArrayList<String> temp2 = new ArrayList<String>();
    
    
    if(list!=null)temp = trimNames(list);
    //h = temp.size();
    int j = 0;
    int k = floor(temp.size()/n);
      for(int i =0;i<temp.size();i++){
      
      String l = temp.get(i);
      String ndir = "C:\\Users\\admin" + "\\" + l + "\\";
      list = listFileNames(ndir);
      if(list==null){
      Button a = new Button( x + w*j,y + 20 *(i)-k*20*(j), w-10,20,l);
      a.submenu = new Menu(x+20,y,w-20,20);
      a.submenu.borders(false);
      if(j>0) a = new Button( x + w*j,y + 20 *(i)-k*20*(j)-40, w-10,20,l);
      a.border = false;
      a.togglebox = true;
      buttons.add(a);
      if(i>k*(j+1))j++;
      }else {
        
      Button a = new Button( x + w*j,y + 20 *(i)-k*20*(j), w-10,20,l);
      a.submenu = new Menu(x+20,y,w-20,list);
      a.submenu.visible = false;
      a.submenu.slide = true;
      a.submenu.borders(false);
      if(j>0) a = new Button( x + w*j,y + 20 *(i)-k*20*(j)-40, w-10,20,l);
      a.border = false;
      a.togglebox = true;
      buttons.add(a);
      if(i>k*(j+1))j++;
  }}
    //h = temp.size()*20;
    parent = new Menu( x + w*n - 10,y, 10,h-20);
    
    Slider s = new Slider( x + w*n - 10,y, 10,h);
    //h = buttons.size()*20;
    s.bar = true;
    s.classic = true;
    s.visible = true;
    s.valuex = 0;
    s.vertical = true;
    s.tvisible = false;
    s.tooltip = null;
   
    sliders.add(s);
    w = w*n;
    type = 1;
    Boundary b = new Boundary(x,y-10,w,h+20,4);
    //b.id = -1;
    Boundaries.add(b);
    
    for(int i =0;i<buttons.size();i++){
      Button b1 = buttons.get(i);
      Button a = new Button(0,0,40,40,b1.label);
      a.tcol = 0;
      a.textbtm = true;
      a.border = false;
      buttongrid.add(a);
    }
    cols = 5;
    rows = round(buttongrid.size()/cols);
    windows.add(this);
    
    Button b2 = new Button(x+w - 80,y - 40 + 10, 30,30,"Back");
    Button f = new Button(x+w - 80,y - 40 + 10, 30,30,"Forward");
    Button X = new Button(x + colwidth*cols - 35,y-50 + 5, 30,30,"X");
    b2.border = false;
    f.border = false;
    X.border = false;
    nav.add(b2);
    nav.add(f);
    nav.add(X);
    
    for(int i=0;i<nav.size()-1;i++){
        Button b1 = nav.get(i);
        
        b1.x = x + 5 + 40 * i;
        b1.y = y - 50 + 5 + dy;
      }
      
      initqNav();
      h = sliders.get(1).h;
  };
  
  public void initNav(){
    
  };
  
  public void initqNav(){
     Button n = new Button(x - 35,y,25,25,"My Computer");
     n = new Button(x - 35,y,25,25,"Data Folder");
     n.textbtm = true;
     n.border = false;
     n.tcol = 0;
     quicknav.add(n);
     n = new Button(x - 35,y + 50,25,25,"Documents");
     n.textbtm = true;
     n.border = false;
     n.tcol = 0;
     quicknav.add(n);
     n = new Button(x - 35,y + 100,25,25,"Downloads");
     n.textbtm = true;
     n.border = false;
     n.tcol = 0;
     quicknav.add(n);
  };
  
  
  public void render(){
    
    if(!hidden){
      stroke(0);if(!border)noStroke();
      noFill();
      rect(x,y,w,h);
      display();
      draw();
      functions();
      fill(255);
      for(int i=0;i<scenes.size();i++){
        //scenes.get(i).display();
      }
    }
    sLogic();
  };

  public void sLogic(){

    if(mousePressed&&pos()){
      if(BMS.currentMouseObject==null)BMS.currentMouseObject = this.itemLabel;
    }

  };
  
  public void display(){
    if(sliders.size()>0)h = sliders.get(0).h;
    if(toggle||show){
    boundingbox();
    submenu();
    menu();
    scrollbar();
    wlogic();
    
    if(Boundaries.size()>0)Boundaries.get(0).draw2();
    }
  };
  
  public void boundingbox(){
    noStroke();
    if(!transparent)fill(255);
    else fill(255,transparency);
    // rect(x,y,w,h);
    // rect(x,y-10,w,10);
    
    // fill(0,transparency4);
    // rect(x,y,w,h);
    // fill(0,transparency1);
    // rect(x,y-10,w,10);
  };
  
  public void menu(){
    
    if(sliders.size()>0){
      Slider s = sliders.get(0);
      
      //s.value = map(s.valuex,0,s.h,0,buttons.get(index).submenu.items.size()*20);
      
      for(int i=0;i<buttons.size();i++){
        
        Button b = buttons.get(i);
        
        if(b.y>y+h)b.visible = false;
        else b.visible = true;

        if(index<0)svalue = s.value;
        if(index>=i||index==-1)b.y = b.by - s.valuex;
        else if(index>=0&&i>index)b.y = b.by - s.valuex + buttons.get(index).submenu.items.size()*20;
        
        b.x = x;
        b.by = y+10 + b.h*i;
        if(b.y+b.h<=y+h&&b.y>=y){
          if(b.pos())b.self_click2();
          b.draw();
          fill(255);
          textSize(b.bsize);
        if(b.submenu!=null)text(">",b.x+b.w-10,b.y+20);
        textSize(12);
        if(b.submenu!=null&&b.subpos()&&mousePressed&&!smdown){
          smdown = true;
          amendslider = false;
          index = i;
        }
        if(mousePressed&&!b.pos())b.toggle=0;
        b.highlight();
        }
      }
    }
  };
  
  public void submenu(){
    if(index>-1){
    Button a = buttons.get(index);
      Menu m = a.submenu;
      //w = bw + 20;
      m.y = a.y+a.h + (dy);
      
      for(int j=0;j<m.items.size();j++){
          Button b = m.items.get(j);
          b.x = x + 20;
          if(b.y+b.h>y+h||b.y<y){
            b.visible=false;
            float dy2 = abs(y - by);
            
            noStroke();
            //if(b.border)strokeWeight(1);
            fill(255);
            rect(b.x,y,b.w,dy2);
            fill(0,150);
            rect(b.x,y,b.w,dy2);
          }
          //b.draw();
          else b.visible = true;
          
        }
      m.draw();
    }
  };
  
  public void scrollbar(){
    if(sliders.size()>0){
      Slider s = sliders.get(0);
      
        s.x = x+w-10;
        s.y = y;
        s.draw();
        s.mouseFunctions();
    }
  };
  
  public void scrollbar(PGraphics canvas){
    if(sliders.size()>0){
      Slider s = sliders.get(0);
      
        s.x = x+w-10;
        s.y = y;
        // s.draw(mouse);
        // s.mouseFunctions(mouse);
    }
  };
  
  public void wlogic(){
    
    float my = mouseY;
    if(click>2)click=0;
    ArrayList<Float> temp = new ArrayList<Float>();
    float dy = 0;

    if(sliders.size()>0){
      Slider s = sliders.get(0);
      if(type==0)s.set(0,buttons.size()-h/20);
      else s.set(0,buttons.size()/3-h/20);
      if(index>-1&&buttons.get(index).pos()&&mousePressed&&!smdown){index=-1;smdown = true;}
      if(pos()&&!s.mdown&&mousePressed)smdown = true;
      if(!mousePressed){smdown = false;ddown=false;}
      if(!pos()&&mousePressed&&!s.mdown){index = -1;smdown = false;}
      if(dpos()&&mousePressed&&!smdown&&!s.mdown){
        ddown = true;
      }
    
    if(ddown){
      
      Boundary b = Boundaries.get(0);
      b.mtranslate(b,new PVector(mouseX,mouseY));
      
      x = b.Boundaries.get(0).x1;
      y = b.Boundaries.get(0).y1+10;
      
    }
    
    if(index>-1&&!amendslider){
      if(!amendslider&&!s.pos()&&!mousePressed){
        s.value = (index)*20;
        s.valuex = map(index,0,buttons.size(),0,h);
        
      }
      
      if(s.pos()&&mousePressed){
        temp.add(my);
        amendslider = true;
        dy = mouseY - temp.get(0);
      }}
    }
  };
  
  public void display_grid(){
    h = sliders.get(1).h;
    if(close){
      toggle = false;
      open = false;
      close = false;
    }
    if(toggle){
      close = false;
      open = true;
      toggle = false;
    }
    //else open = false;
    
    if(open){
      gridscrollbar();
      gridboundingbox();
      nav_();
      grid();
      drawQuicknav();
      drawBorder();
      gridlogic();
      
      
    }
    
  };
  
  public void drawQuicknav(){
    noStroke();
    if(quickAccess&&navtoggle){
      
        if(!transparent)fill(255);
        else fill(255,transparency);
        rect(x - 80,y - 50,80,h + 50);
        //text("Back",)
        fill(0,transparency1);
        rect(x - 80,y - 50,80,h + 50);
      
      for(int i=0;i<quicknav.size();i++){
        Button b = quicknav.get(i);
        b.x = x - 70;
        b.y = y + 20 + 50 * i;
        //fill(0);
        b.draw();
        fill(0);
        text(b.label,b.x-20,b.h+b.y+20);
        b.highlight();
      }
    }
  };
  
  public void gridscrollbar(){
    
    Slider s = sliders.get(1);
    
      s.x = x+cols*colwidth-10;
      s.y = y;
      s.draw();
      s.mouseFunctions();
      s.set(0,rows);
  };
  
  public void gridlogic(){
    
    ArrayList<Float> temp = new ArrayList<Float>();
    
    float my = mouseY;
    Button X = nav.get(2);
    if(dposg()&&mousePressed&&!navPos()){
      // BMS.currentObject==this;
      // BMS.currentMouseObject==currentf;
      // fill(255,50);
      // rect(0,0,width,height);
      ddown = true;
    }
    //if(pos()&&mousePressed&&!dposg()&&!ddown)smdown = true;

    //if(dposg()&&mousePressed&&!nav.get(0).pos()&&!nav.get(1).pos()&&!sliders.get(1).mdown&&!smdown&&!globaldown&&!X.pos())ddown = true;
    
    if(sliders.size()>0&&sliders.get(1)!=null){
    if(!ddown&&pos()&&mousePressed&&!dposg()&&!sliders.get(1).pos()&&!mdown&&!ddown&&!sliders.get(1).mdown){
      if(track.size()<2)track.add(new PVector(mouseX,mouseY));
      //mdown = true;
    }}
    else {
      if(mousePressed&&!dposg()&&!sliders.get(1).pos()&&!mdown&&!ddown){
      if(track.size()<2)track.add(new PVector(mouseX,mouseY));
      //mdown = true;
    }}
    
    
    if(!mousePressed){
      smdown = false;
      ddown = false;
      mdown = false;
      track = new ArrayList<PVector>();
      ddown = false;
    }
    
    //text(track.size(),100,100);
    if(track.size()>0){
      
      //noFill();
      fill(0,20);
      stroke(0,50);
      strokeWeight(1);
      rect(track.get(0).x,track.get(0).y,(mouseX - track.get(0).x ),(mouseY - track.get(0).y));
      
    }
    
    
    if(ddown){
      
    }
    Boundary b = Boundaries.get(1);
    
    
    if(!mdown&&!ddown)X.latch(this,"close");
    if(ddown){
      
      b.mtranslate(new PVector(mouseX,mouseY));
      x = b.Boundaries.get(0).x1;
      y = b.Boundaries.get(0).y1+50;
      
      X.y = y-50 + 5 + dy;
      X.x = x + colwidth*cols - 35;
      
      for(int i=0;i<nav.size()-1;i++){
        Button b1 = nav.get(i);
        
        b1.x = x + 5 + 40 * i;
        b1.y = y - 50 + 5 + dy;
      }
    }else{
      b.mdown = false;
    }
    
    Boundaries.get(1).draw2();
    
    if(sliders.get(1).pos()&&mousePressed){
        temp.add(PApplet.parseFloat(mouseY));
        deltay = mouseY - temp.get(0);
      }
      
     rows = round(windows.get(windows.size()-1).buttons.size()/5)+1;
  };
  
  public void gridboundingbox(){
      noStroke();
      if(!transparent)fill(255);
      else fill(255,transparency);
      rect(x,y,colwidth*cols,rowheight*(5));
      
      fill(0,transparency3);
      //rect(x,y,colwidth*cols,rowheight*(5));
      if(!transparent)fill(255);
      else fill(255,transparency);
      rect(x,y-navheight,colwidth*cols,navheight);
      
      fill(0,transparency1);
      rect(x,y-navheight,colwidth*cols,navheight);
      fill(0);
      //if(currentp!=null)text(currentp,x+100,y-20);
  };
  
  public void drawBorder(){
    if(!quickAccess&&border||!navtoggle){
        stroke(0);
        noFill();
        rect(x,y-50,colwidth*cols,h+50);
      }
      else if(quickAccess&&border){
        stroke(0);
        noFill();
        rect(x - 80,y-50,colwidth*cols+80,h+50);
      }
  };
  
  public void nav_(){

    for(int i=0;i<nav.size();i++){
        Button b = nav.get(i);
        
        b.textbtm = true;
        
        b.draw();
        b.highlight();
        
        if(b.pos()&&mousePressed&&b.label=="Back"&&!smdown){
          if(windows.size()>1){
            windows.remove(windows.size()-1);
            currentp = windows.get(windows.size()-1).link;
            sliders.get(0).value = 0;sliders.get(0).valuey = 0;
          }
        }
        if(b.pos()&&mousePressed&&b.label=="Forward"&&!smdown&&forward!=null){
          Window w1 = new Window(x,y,w,h,forward);
          windows.add(w1);
          currentp = windows.get(windows.size()-1).link;
        }
      }
      // Button b = nav.get(0);
      // Button n = nav.get(1);
      // Button x = nav.get(2);
      // fill(0);
      // if(transparent&&b.pos())fill(255);
      // text(b.label,b.x ,b.y + b.h + 10);
      // fill(0);
      // if(transparent&&n.pos())fill(255);
      // text(n.label,n.x ,n.y + n.h + 10);
      // fill(0);
      // if(transparent&&x.pos())fill(255);
      // textSize(20);
      // text(x.label,x.x + 10,x.y + 25);
      // textSize(12);
      // Button X = nav.get(2);
      // X.draw();
      // X.highlight();
      
  };
  
  public void grid(){
    
    Window w2 = windows.get(windows.size()-1);
    Slider s = sliders.get(1);
    
    for(int i=0;i<rows;i++){
      for(int j=0;j<cols;j++){
        
        int pos = j+i*cols;
        Button b = null;
        if(pos<w2.buttongrid.size()){
        b = w2.buttongrid.get(pos);
        Button b1 = w2.buttons.get(pos);
        b1.border = false;
        b.textbtm = true;
        b.x = x + 10 + colwidth * j;
        b.y = y + 10 + (rowheight+b.tsize) * i - s.value;
        b.highlight3();
        if(b.y<y||b.y+b.h + b.tsize>y + rowheight * 5)b.visible = false;
        else b.visible = true;
        if(!b.textcheck)b.labelcheck(colwidth);
          
        if(b.visible)b.draw();
        fill(0);
        if(b.pos())b.highlight();
        
        fill(0); 
        if(b.pos()&&b.submenu!=null){
          int size = currentp.length();
          if(currentp.charAt(size-1)!='\\')currentp += "\\";
           currentl = currentp + b.blabel;
        }
        //else if(b.pos()&&b.submenu==null){
        //  int size = currentp.length();
        //  if(currentp.charAt(size-1)!='\\')currentp += "\\";
        //   currentf = currentp + b.blabel;
        //}
        if(b.pos()&&mousePressed&&b1.submenu!=null&&!smdown){
          int size = currentp.length();
          if(currentp.charAt(size-1)!='\\')currentp += "\\";
          back = currentp;
          currentp += b.blabel;
          forward = currentp;
          Window w1 = new Window(w2.x+200,w2.y,w,h,currentp);
          windows.add(w1);
          windex = 0;
          s.value = 0;
          s.valuex = 0;
          wid = windows.size()-1;
          smdown = true;
        }else if(b.pos()&&mousePressed&&b1.submenu==null&&!smdown){
          int size = currentp.length();
          if(currentp.charAt(size-1)!='\\')currentp += "\\";
          String file = currentp + b.blabel;
          currentf = file;
          if(launchable)launch(file);
          smdown = true;
        }
      }}}
    if(!mousePressed)smdown = false;
  };
  
  public void navbar(){
    
  };

  public boolean navPos(){
    boolean k = false;
    if(nav!=null){
      for(int i=0;i<nav.size();i++){
        if(nav.get(i).pos()){
          k = true;
          break;
        }
      }
    }
    return k;
  };
  
  public boolean dpos(){
    return mouseX>x&&mouseX<x+w&&mouseY>y-10&&mouseY<y;
    
  };
  
  public boolean dposg(){
    return mouseX>x&&mouseX<x+cols*colwidth&&mouseY>y-50&&mouseY<y;
    
  };
  
  public boolean pos(){
    
    return mouseX>x&&mouseX<x+w&&mouseY>y&&mouseY<y+h;
    
  }
  
};
public String [] WordStream(String Loc){
  WordExtractor extractor = null;
  String s = "sketch_191112a\\";
  String [] fileData = null;
  File file = null;
        
        try{

            file = new File(Loc);
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            
            fileData = extractor.getParagraphText();
            
            for (int i = 0; i < fileData.length; i++){
              
                if (fileData[i] != null)System.out.println(fileData[i]);
                
            }}
            catch (Exception exep){
            //exep.printStackTrace();
        }
        return fileData;
};

public String [] WordStream(File file){
  WordExtractor extractor = null;
  String [] fileData = null;
        
        try{
            FileInputStream fis = new FileInputStream(file.getAbsolutePath());
            
            HWPFDocument document = new HWPFDocument(fis);
            extractor = new WordExtractor(document);
            
            fileData = extractor.getParagraphText();
            
            for (int i = 0; i < fileData.length; i++){
              
                if (fileData[i] != null)System.out.println(fileData[i]);
                
            }}
            catch (Exception exep){
            //exep.printStackTrace();
        }
        return fileData;
};
  //ArrayList<String> string_to_array(String [] a){
  //  String s = "";
  //  for(int i=0;i<a.length;i++){
  //    if(a[i].length()>0){
  //    String k = a[i] + ",";
      
  //    if(a[i].charAt(a[i].length()-1)==',')s += a[i];
  //    else s += k;
  //  }}
  //  int char_counter = 0;
    
  //  ArrayList<String> s1 = new ArrayList<String>();
    
  //  for(int i=0;i<s.length();i++){
      
  //    char c = s.charAt(i);
      
  //    if(c==','){
  //      String b = s.substring(char_counter,i);
        
  //      s1.add(b);
  //      char_counter = i+1;
  //    }
  //  }
    
  //  return s1;
  //};
  
  
  
class Workflow extends taskList{
    
    Table_ table;
    
    
    Workflow(float x,float y,float w,float h, int tcols, int trows){
      
      table = new Table_(x,y,w,h,tcols,trows,0);
      
      
    };
    
    public void draw_workflow(){
      
      displayList();
      if(Buttons.get(0).toggle==1){
        table.draw();
        
      }
      
    };
    
    
    
};
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "sketch_191112a" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}

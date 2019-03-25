-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 25, 2019 at 09:11 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gre`
--

-- --------------------------------------------------------

--
-- Table structure for table `word`
--

CREATE TABLE `word` (
  `id` int(11) NOT NULL,
  `word` varchar(250) CHARACTER SET latin1 NOT NULL,
  `pos` varchar(30) CHARACTER SET latin1 NOT NULL,
  `meaning` varchar(250) CHARACTER SET latin1 NOT NULL,
  `example` varchar(500) CHARACTER SET latin1 NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_unicode_ci;

--
-- Dumping data for table `word`
--

INSERT INTO `word` (`id`, `word`, `pos`, `meaning`, `example`) VALUES
(8, 'Aberration', 'noun', 'a departure from what is normal, usual, or expected', 'The Fed will probably need convincing that the latest labour-market report was an aberrationbefore tightening policy.'),
(9, 'Abreast', 'adjective', 'Up to date with the latest news, ideas, or information', 'These daily updates were designed to help readers keep abreast of the markets...'),
(10, 'Abstain', 'verb', 'Restrain oneself from doing or enjoying something', 'The decision to abstain from such techniques, just and wise though it was, came at a cost.'),
(11, 'Abyss', 'noun', 'a deep or seemingly bottomless chasm', 'Whose dire warnings about risks... seem most believable? Which abyss looks darker and deeper?'),
(12, 'Adept', 'adjective', 'Very skilled or proficient at something', 'An abundance of clever people?adept in English law as much as in finance?draws in banks, fund managers and so forth...'),
(13, 'Agog', 'adjective', 'Very eager or curious to hear or see something', 'We are now agog to know when, on the basis of its forecasts, the Bank will push up interest rates...'),
(14, 'Allure', 'noun', 'the quality of being powerfully and mysteriously attractive or fascinating', 'Yet it was the allure of the Model T for millions of consumers that finally drove the horse off the road.'),
(15, 'Altruism', 'noun', 'the belief in or practice of selfless concern for the well-being of others', 'Dr Decety is not the first to wonder, in a scientific way, about the connection between religion and altruism.'),
(16, 'Ambivalent', 'adjective', 'having mixed feelings or contradictory ideas about something or someone', 'The first was a chronic lack of focus. Right from the start Yahoo was ambivalent about whether it should be a media or a technology company.'),
(17, 'Annul', 'verb', 'Declare invalid', 'Last month?s election was a re-run of a vote in October 2015, the results of which were annulled after several candidates alleged electoral malpractice.'),
(18, 'Apathy', 'noun', 'Lack of interest, enthusiasm, or concern', 'Perhaps most difficult will be overcoming the cynicism, and apathy, of the public.'),
(19, 'Arbitrary', 'adjective', 'Based on random choice or personal whim, rather than any reason or system', 'The prevailing belief among linguists had been that the sounds used to form those words were arbitrary.'),
(20, 'Arbiter', 'noun', 'a person who settles a dispute or has ultimate authority in a matter', 'The viewer is, ultimately, the arbiter of influence: either partaking in the objectification, or actively challenging the power dynamic.'),
(21, 'Artless', 'adjective', 'without guile or deception', 'He is loveably artless and embarrassingly awkward in his unstoppably cheerful attempts to win over the frosty members of the band...'),
(22, 'Audacious', 'adjective', 'showing a willingness to take surprisingly bold risks', 'It was as audacious as any heist and yet unlikely material for a Hollywood blockbuster.'),
(23, 'Austere', 'adjective', 'Having an extremely plain and simple style or appearance', 'Not all Western airports have austere arrival concourses ? la Heathrow; many have eateries and bars...'),
(24, 'Blight', 'noun', 'a thing that spoils or damages something', 'Yet the USFS predicts that within a couple of decades, because of slowing growth and climate-related blights, the forests will become an emissions source.'),
(25, 'Blithe', 'adjective', 'showing a casual and cheerful indifference considered to be callous or improper', 'Mr. Cameron?s government was too posh, too cocky, too blithe about globalization?s merits, too metropolitan. Too Notting Hill. '),
(26, 'Blowhard', 'noun', 'a person who blusters and boasts in an unpleasant way', 'His name conjured up associations such as ?arrogant? and ?blowhard? ...'),
(27, 'Bolster', 'verb', 'Support or strengthen', 'If the results are confirmed, they will bolster voters? belief in the system.'),
(28, 'Bombastic', 'adjective', 'High-sounding but with little meaning; inflated Synonyms: pompous, blustering, turgid', 'Cynics may ascribe Mr. Rubio?s mild tone to the diverse population of his home state, and the fact that bombastic Mr. Trump trails in the polls there.'),
(29, 'Boycott', 'noun', 'a punitive ban that forbids relations with certain groups', 'Conversely some prominent black women have called for a boycott, seeing Mr. Parker?s past as a disqualifying stain.'),
(30, 'Burlesque', 'noun', 'a variety show', 'Madame JoJo?s, a burlesque bar in London?s Soho, had its license revoked in 2014 after two bouncers brandished a baseball bat at a rowdy crowd.'),
(31, 'Cacophony', 'noun', 'a harsh, discordant mixture of sounds', 'In 1957 New York?s subway contained a haphazard mishmash of fonts, both serif and sans, and a typographic designer, sick of the visual cacophony, submitted a brief to the New York City Transit Authority...'),
(32, 'Chronic', 'adjective', '(Of a problem) long lasting and difficult to eradicate', 'Pessimists think the productivity problem is chronic. Technological advances, they say, are ever-less revolutionary...'),
(33, 'Coda', 'noun', 'a concluding event, remark or section', 'With distinct ballad, opera and hard rock sections?and a pensive intro and coda, for good measure?the song was not for listeners in a hurry.'),
(34, 'Confound', 'verb', 'Prove (a theory, expectation, or prediction) wrong', 'Yet in another sense, the Fed has confounded predictions?at least, those it made itself.'),
(40, 'Deign', 'verb', 'Do something that one considers to be beneath one?s dignity', 'If the Senate deigns to consider and confirm a nominee, do not expect changes overnight.'),
(41, 'Disingenuous', 'adjective', 'not candid or sincere', 'But shamelessly self-interested and probably contrary to his real views on the EU though it is, the mayor?s move is perhaps not entirely disingenuous.'),
(42, 'Docile', 'adjective', 'Ready to accept control or instruction; submissive', 'Docile with humans, they are fierce defenders of territory and their young.'),
(43, 'Doff', 'verb', 'Remove (an item of clothing)', 'To don shoes, to doff them, or even to throw them at somebody?'),
(44, 'Dote', 'verb', 'be extremely and uncritically fond of', 'Falling birth-rates allowed parents to dote on fewer children, who were increasingly likely to go to school.');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `word`
--
ALTER TABLE `word`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `word`
--
ALTER TABLE `word`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=45;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
